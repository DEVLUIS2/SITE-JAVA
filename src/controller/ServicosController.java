package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicosController {
	@GetMapping("/servicos")
	public String servicos(Model model) {
		List<String> listaServicos = new ArrayList<>();
		listaServicos.add("Desenvolvimento de aplicações desktop");
		listaServicos.add("Desenvolvimento de aplicações web");
		listaServicos.add("Desenvolvimento de aplicações mobile");
		model.addAttribute("listaServicos",listaServicos);
		return "servicos";
	}

}
