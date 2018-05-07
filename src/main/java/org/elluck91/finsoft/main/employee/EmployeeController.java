package org.elluck91.finsoft.main.employee;

import java.util.List;

import org.elluck91.finsoft.main.repository.EmployeeRepository;
import org.elluck91.finsoft.main.salaries.Salaries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@ModelAttribute("employee")
	public Employee construct() {
		return new Employee();
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public String getAllEmployees(@PathVariable("id") int id, Model model) {
		Employee employee = employeeRepository.findOne(id);
		System.out.println("In department from: " + employee.getDepartment());
		List<Salaries> salaries = employee.getSalaries();
		System.out.println("Salaries: " + salaries.get(0).getSalary());
		System.out.println("BirthDate: " + employee.getBirthDate());
		model.addAttribute("employee", employee);
		return "user";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("employee") Employee employee) {
		employee.setId(employee.getId());
		System.out.println("Emp_no: " + employee.getId());
		System.out.println("Emp birth day: " + employee.getBirthDate());
		System.out.println("Emp salary: " + employee.getSalaries());
		System.out.println("Inside post request.");
		employeeRepository.save(employee);
		
		return "user";
	}
	
//	@RequestMapping(value = "/employee/{hire_date}", method = RequestMethod.GET)
//	public String getEmployeeByHireDate(@PathVariable("hire_date") Date hire_date, Model model) {
//		return "user";
//	}
}
