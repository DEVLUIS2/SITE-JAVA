package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
	
	@GetMapping("/produto")
	public String produto(Model model) {
		model.addAttribute("texto", "Mensagem da tela de produtos");
		return "produto";
	}
}
