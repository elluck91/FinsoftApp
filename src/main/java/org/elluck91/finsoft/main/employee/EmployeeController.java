package org.elluck91.finsoft.main.employee;

import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.elluck91.finsoft.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

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
		model.addAttribute("employee", employeeRepository.getOne(id));
		return "user";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("employee") Employee employee) {
		employeeRepository.save(employee);
		
		return "user";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public ModelAndView method(SessionStatus status, HttpServletRequest request) {
		request.getSession().removeAttribute("okta-token-storage");
		status.setComplete();
		
        return new ModelAndView("redirect:" + "https://dev-452784.oktapreview.com/login/signout");

	}
	
	@RequestMapping(value = "/integrations", method = RequestMethod.GET)
	public String getPage() {
		
		return "integrations";
	}
	
	@RequestMapping(value = "/employee/dept/{dept}/{index}", method = RequestMethod.GET)
	public String getEmployeeByDept(@PathVariable("dept") String dept,
			@PathVariable("index") int index, Model model) {
		Pageable topTen = new PageRequest(index, 10);
		List<Employee> result = employeeRepository.findByDeptOrderByIdAsc(dept, topTen); 
		model.addAttribute("employee", result);
		model.addAttribute("index", index);
		model.addAttribute("count", 279212);
		model.addAttribute("dept", dept);
		return "dept";
	}
	
	@RequestMapping(value = "/employee/name/{LastName}/{index}", method = RequestMethod.GET)
	public String getEmployeeByLastName(@PathVariable("LastName") String lastName,
			@PathVariable("index") int index, Model model) {
		System.out.println("Here");
		char two = (char) (lastName.charAt(0) + 1);
		Pageable topTen = new PageRequest(index, 10);
		List<Employee> result = employeeRepository.findByLastNameOrderByLastNameAsc(lastName, Character.toString(two), topTen); 
		model.addAttribute("employee", result);
		model.addAttribute("index", index);
		model.addAttribute("count", 279212);
		model.addAttribute("name", lastName);
		return "name";
	}
	
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		System.out.println(employee.getAboutme());
		System.out.println(employee.toString());
		employeeRepository.save(employee);
		
		return "user";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String getEmployeeByDept() {
		return "register";
	}
	
	
}
