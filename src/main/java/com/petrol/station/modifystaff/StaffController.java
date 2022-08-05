package com.petrol.station.modifystaff;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StaffController {
	
	@Autowired
	private StaffService service;
	
	@GetMapping("/staffs")
	public List<Staff> getStaffs(){
		return service.getStaffs();
	}
	
	@PostMapping("/staffs/addnew")
	public void addStaff(@RequestBody Staff staff) {
		service.addStaff(staff);
	}
	
	@PutMapping("/staffs/{id}/edit")
	public void updateStaff(@PathVariable("id") Integer id, @RequestBody Staff staff) {
		service.updateStaff(staff);
	}
	
	@DeleteMapping("/staffs/{id}/delete")
	public void deleteStaff(@PathVariable("id") Integer id) {
		service.deleteStaff(id);
	}
	

}
