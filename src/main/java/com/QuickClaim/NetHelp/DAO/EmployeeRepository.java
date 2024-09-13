package com.QuickClaim.NetHelp.DAO;

import com.QuickClaim.NetHelp.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    void deleteEmployeeById(Long id);
}
