package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContatoController {
	
	@GetMapping("/contato")
	public String contato(Model model) {
		List<String> listaTelefones = new ArrayList<>();
		listaTelefones.add("1698784448484848");
		listaTelefones.add("5484845844584844");
		listaTelefones.add("5348484848484848");
		model.addAttribute("listaTelefones",listaTelefones);
		return "contato";
	}
	
	@PostMapping("/contato")
	public String contatoPost(HttpServletRequest req, Model model) {
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String mensagem = req.getParameter("mensagem");
		String telefone = req.getParameter("telefone");
		String retorno = "Seu nome é " + nome + "(" + email +")."+" Sua mensagem é " + mensagem + ". E seu telefone é" + telefone;
		model.addAttribute("texto", retorno);
		return "mensagem";
	}
}
