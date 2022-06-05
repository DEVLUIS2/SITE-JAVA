<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	
	<c:if test="${livros.isEmpty()}">
		<div class="row">
			<h3>Não há dados</h3>
		</div>
	</c:if>
	
	<c:if test="${not livros.isEmpty()}">
	
	<div class="row mb-5 text-center bg-dark fw-bolder font-monospace text-primary border border-2 border-danger rounded-circle">
		<h3>Manutenção de Filmes</h3>
	</div>
	<div class="row">	
		<table class="table">
  			<thead>
    			<tr>
      				<th scope="col">Código</th>
      				<th scope="col">Nome do Filme</th>
      				<th scope="col">Diretor</th>
      				<th scope="col">Produtora</th>
      				<th scope="col">Ano de Produção</th>
      				<th scope="col">Alterar</th>
      				<th scope="col">Excluir</th>
    			</tr>
  			</thead>
  			<tbody>
				<c:forEach items="${livros}" var="livro">
					<tr>
						<td> ${livro.getCodigo()} </td>
						<td> ${livro.getTitulo()} </td>
						<td> ${livro.getAutor()} </td>
						<td> ${livro.getEditora()} </td>
						<td> ${livro.getAno()} </td>
						<td>
							<a class="text-success text-decoration-none" href="/alterarlivro?codigo=${livro.getCodigo()}">
								<img alt="" src="imagens/editar.png" height="25" width="25">
							</a>
						</td>
						<td>
							<a class="text-success text-decoration-none" href="/excluirlivro?codigo=${livro.getCodigo()}">
								<img alt="" src="imagens/excluir.png" height="25" width="25">
							</a>
						</td>
					</tr>
				</c:forEach>
  			</tbody>
		</table>	
	</div>
	</c:if>
	
<jsp:include page="layoutrodape.jsp"></jsp:include>