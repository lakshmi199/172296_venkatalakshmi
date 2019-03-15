package com.springjdbc.assignment;

import java.util.List;

public interface EmployeeServices {

	public boolean addEmp(Employee e);
	public List<Employee> getEmp(Employee e);
	public boolean updateEmpSal(Employee e);
	 public String getMaxSal();
	public boolean deleteEmp(Employee e);
	public boolean getWithoutComm();
}
