package org.elluck91.finsoft.main.employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
    @RequestMapping(value = "/index", method = { RequestMethod.GET,RequestMethod.POST})
	public String index() {
		return "index";
	}
	
}
