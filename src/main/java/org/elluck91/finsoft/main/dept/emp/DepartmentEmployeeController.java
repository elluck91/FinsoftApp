package org.elluck91.finsoft.main.dept.emp;

import java.util.List;

import org.elluck91.finsoft.main.employee.Employee;
import org.elluck91.finsoft.main.repository.DepartmentEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DepartmentEmployeeController {
	@Autowired
	DepartmentEmployeeRepository departmentEmployeeRepository;
	
	@ModelAttribute("DepartmentEmployee")
	public DepartmentEmployee construct() {
		return new DepartmentEmployee();
	}
	
	@RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
	public String getAllEmployees(@PathVariable("id") String id, Model model) {
		System.out.println("Department Id: " + id);
		//System.out.println(departmentEmployeeRepository.findOne(id));
				return "user";
	}
}
