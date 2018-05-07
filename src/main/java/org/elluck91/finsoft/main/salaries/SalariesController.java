package org.elluck91.finsoft.main.salaries;

import org.elluck91.finsoft.main.repository.SalariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SalariesController {
	@Autowired
	SalariesRepository salariesRepository;
	
	@ModelAttribute("salaries")
	public Salaries construct() {
		return new Salaries();
	}	
}
