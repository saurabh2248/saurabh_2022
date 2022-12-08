package com.hr.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.Entity.HR;

@Service
public class HrServiceImpl implements IhrService {
	
	//fake HR list 
	
	List<HR> list = List.of(
			new HR(1001L, "Vivek", "12445148946"),
			new HR(1002L, "Keshav", "78751984561"),
			new HR(1003L, "Kritika", "51687861657"),
			new HR(1004L, "Kamal", "1897456178984"),
			new HR(1005L, "Roshan", "5168786516"),
			new HR(1006L, "Samir", "65498786516"));
	

	@Override
	public HR getHR(Long id) {
		return list.stream().filter(hr -> hr.getUserID().equals(id)).findAny().orElse(null);
	}
}





