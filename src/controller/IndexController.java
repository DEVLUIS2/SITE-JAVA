package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import interfaces.ILista;

@Controller
public class IndexController {
	
	@Autowired
	private ILista listanomes;
	
	
	@GetMapping({"/", "/index"})
	public String index(Model model) {
		model.addAttribute("listanomes",listanomes);
		return "index";
	}
}
