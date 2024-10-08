package com.QuickClaim.NetHelp.jwt;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomJwtConverter implements Converter<Jwt, CustomJwt> {

    @Override
    public CustomJwt convert(Jwt source) {
        List<GrantedAuthority> grantedAuthorities = extractAuthorities(source);
        var customJwt = new CustomJwt(source, grantedAuthorities);


        customJwt.setFirstname(source.getClaimAsString("given_name"));
        customJwt.setLastname(source.getClaimAsString("family_name"));

        return customJwt;
    }

    private List<GrantedAuthority> extractAuthorities(Jwt source) {
        var result = new ArrayList<GrantedAuthority>();

        Map<String, Object> realm_access = source.getClaimAsMap("realm_access");

        if (realm_access != null && realm_access.get("roles") != null) {
            var roles = realm_access.get("roles");

            if (roles instanceof List<?> roleList) {
                roleList.forEach(role -> {
                    if (role instanceof String) {
                        result.add(new SimpleGrantedAuthority("ROLE_" + role));
                    }
                });
            }
        }
        return result;
    }
}
