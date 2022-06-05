<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row text-center mb-3">
		<h3>Cadastrar Filme</h3>
	</div>
	<div class="row d-flex justify-content-evenly position-relative border border-3 border-success bg-dark rounded-pill">	
		<form method="POST" class="col-8 p-5" action="/cadastrarlivro">
		
			<input type="text" name="titulo" class="form-control" placeholder="Nome do Filme">
			<br/>
			<input type="text" name="autor" class="form-control" placeholder="Diretor">
			<br/>
			<input type="text" name="editora" class="form-control" placeholder="Produtora">
			<br/>
			<input type="text" text-transform="uppercase" name="ano" class="form-control" placeholder="Ano de Produção">
			<br/>
			<input type="file" name="imagem"  class="form-control">
			<br/>
			<div class="d-grid gap-1 col-3 mx-auto">
			<button class="btn btn-primary">Cadastrar</button>
			</div>
		</form>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>