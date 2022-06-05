package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.LivroDAO;
import model.Livro;


@Controller
public class LivroController<HttpServeletRequest> {
	@GetMapping("/livrocadastro")
	public String cadastrarLivro(Model model) {
		return "livrocadastro";
		
	}

	@PostMapping("/cadastrarlivro")
	public String cadastrarLivroPost(HttpServletRequest req, Model model) {
		String titulo = req.getParameter("titulo");
		String editora = req.getParameter("editora");
		String autor = req.getParameter("autor");
		int ano = Integer.parseInt(req.getParameter("ano"));
		
		Livro livro = new Livro();
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setEditora(editora);
		livro.setAno(ano);
		
		LivroDAO dao = new LivroDAO();
		String texto = dao.salvar(livro);
		model.addAttribute("texto",texto);
		return "mensagem";
	}
	
	@GetMapping("/listarproduto")
	public String listalivros(Model model) {
		LivroDAO dao = new LivroDAO();
		model.addAttribute("livros",dao.listartodos());
		return "produto";
	}
	
	@GetMapping("/listarlivros")
	public String listalivrosmanutencao(Model model) {
		LivroDAO dao = new LivroDAO();
		model.addAttribute("livros",dao.listartodos());
		return "livrolistagem";
	}
	
	@GetMapping("/pesquisarlivro")
	public String pesquisa(HttpServletRequest req, Model model) {
		String pesquisa = req.getParameter("pesquisar");
		LivroDAO dao = new LivroDAO();
		model.addAttribute("livros",dao.pesquisarlivro(pesquisa));
		return "livrolistagem";
	}
	
	
	@GetMapping("/alterarlivro")
	public  String alterarlivro(HttpServletRequest req, Model model) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		LivroDAO dao = new LivroDAO();
		model.addAttribute("livro",dao.getLivroPorCodigo(codigo));
		return "livroalteracao";
	}
	
	@PostMapping("/alterarlivro")
	public String alterarlivropost(HttpServletRequest req, Model model) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");
		String editora = req.getParameter("editora");
		int ano = Integer.parseInt(req.getParameter("ano"));
		
		Livro livro = new Livro();
		livro.setCodigo(codigo);
		livro.setTitulo(titulo);
		livro.setAno(ano);
		livro.setAutor(autor);
		livro.setEditora(editora);
		
		LivroDAO dao = new LivroDAO();
		model.addAttribute("texto",dao.alterar(livro));
		
		return "mensagem";
	}
	
	@GetMapping("/excluirlivro")
	public String excluirlivro(HttpServletRequest req, Model model) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		LivroDAO dao = new LivroDAO();
		model.addAttribute("texto",dao.excluir(codigo));
		return "mensagem ";
	}
	
}








