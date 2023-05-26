package com.cibertec.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.models.personal;
import com.cibertec.services.PersonalService;


@Controller
@RequestMapping("/Examen")
public class PersonalController {
	protected final Log logger = LogFactory.getLog(this.getClass());
	@Autowired
	private PersonalService personalService;
	@GetMapping({"/index", "/","","/Examen"})
	public String  index(Model model) {
		String title = "Lista!";
		model.addAttribute("titulo",title);
		
		personal personalObjeto = this.personalService.getOnePersonal(1L);
		
		model.addAttribute("personal", personalObjeto);
		
		logger.info("Objeto recuperado con exito!");
		return "index";
	}

}
