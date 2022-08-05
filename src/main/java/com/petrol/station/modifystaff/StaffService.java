package com.petrol.station.modifystaff;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository repository;
	
	public List<Staff> getStaffs() {
		return repository.findAll();
	}
	
	public void addStaff(Staff staff) {
		repository.save(staff);
	}
	
	public void updateStaff(Staff staff) {
		repository.save(staff);
	}
	
	public void deleteStaff(Integer id) {
		repository.deleteById(id);
	}

}
