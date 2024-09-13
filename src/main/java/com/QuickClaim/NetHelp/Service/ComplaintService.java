package com.QuickClaim.NetHelp.Service;

import com.QuickClaim.NetHelp.DAO.ComplaintRepository;
import com.QuickClaim.NetHelp.Models.Complaint;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComplaintService {
    @Autowired
    ComplaintRepository complaintRepository;

    public ComplaintService() {}

    public List<Complaint> getAllComplaints(){return complaintRepository.findAll();}
    public Complaint addComplaint(Complaint complaint){
        return complaintRepository.save(complaint);
    }
    public Complaint updateComplaint(Complaint complaint){
        return complaintRepository.save(complaint);
    }
    @Transactional
    public void deleteComplaint(Long id){
        complaintRepository.deleteComplaintById(id);
    }

}
