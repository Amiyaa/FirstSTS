package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer> 
{

	/*public void updateEmp(int id, Employee emp)
	{
		for(int i=0; i<)
	}
	
	*/
}


