package com.app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StaffDTO extends EmployeeDTO {
	
	
	private int shift;
	private int role;
}
