<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row mb-3 text-center">
		<h3>Alterar Informações sobre o Filme</h3>
	</div>
	<div class="row d-flex justify-content-evenly position-relative border border-3 border-success bg-dark rounded-pill">	
		<form method="POST" class="col-6 p-5" action="/alterarlivro">
		
			<input type="text" name="codigo" class="form-control"  placeholder="Código" value="${livro.getCodigo()}" readonly>
			<br/>
			<input type="text" name="titulo" class="form-control" placeholder="Nome do Filme" value="${livro.getTitulo()}" >
			<br/>
			<input type="text" name="autor" class="form-control" placeholder="Diretor" value="${livro.getAutor()}" >
			<br/>
			<input type="text" name="editora" class="form-control" placeholder="Produtora" value="${livro.getEditora()}" >
			<br/>
			<input type="text" text-transform="uppercase" name="ano" class="form-control" placeholder="Ano de Produção" value="${livro.getAno()}">
			<br/>
			<div class="d-grid gap-1 col-3 mx-auto">
			<button class="btn btn-primary">Alterar</button>
			</div>
	
		</form>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>