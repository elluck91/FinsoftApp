package org.elluck91.finsoft.main.employee;

import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.elluck91.finsoft.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value = "/employee/dept/{dept}", method = RequestMethod.GET)
	public String getEmployeeByDept(@PathVariable("dept") String dept, Model model) {
		List<Employee> employees = employeeRepository.getByDept(dept);
		int i = 0;
		for (Employee emp : employees) {
			if (i > 10)
				break;
			System.out.println(emp.toString());
			i++;
		}
		return "user";
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
