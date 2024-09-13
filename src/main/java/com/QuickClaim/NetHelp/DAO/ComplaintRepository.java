package com.QuickClaim.NetHelp.DAO;

import com.QuickClaim.NetHelp.Models.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintRepository  extends JpaRepository<Complaint,Long> {


    void deleteComplaintById(Long id);
}
