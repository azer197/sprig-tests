package com.QuickClaim.NetHelp.Access;

import com.QuickClaim.NetHelp.Models.Client;
import com.QuickClaim.NetHelp.Models.Complaint;
import com.QuickClaim.NetHelp.Service.ClientService;
import com.QuickClaim.NetHelp.Service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaint")
public class ComplaintController {
    @Autowired
    ComplaintService complaintService;
    @GetMapping
    public ResponseEntity<List<Complaint>> getAllComplaints() {
        List<Complaint> complaints = complaintService.getAllComplaints();
        return new ResponseEntity<>(complaints, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Complaint> addComplaint(@RequestBody Complaint complaint){
        Complaint newComplaint = complaintService.addComplaint(complaint);
        return new ResponseEntity<>(newComplaint, HttpStatus.CREATED);
    }
    @PostMapping("/Update")
    public ResponseEntity<Complaint> updateComplaint(@RequestBody Complaint complaint){
        Complaint updatedComplaint= complaintService.updateComplaint(complaint);
        return new ResponseEntity<>(updatedComplaint, HttpStatus.OK);
    }
    @DeleteMapping("/Delete{id}")
    public ResponseEntity<?>deleteComplaint(@PathVariable("id") Long id) {
        complaintService.deleteComplaint(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
