<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>


<div class="row mb-5 text-center bg-primary fw-bolder font-monospace text-light border border-2 border-dark rounded-circle">
	<h3>Produções Marvel</h3>
</div>

<div class="row row-cols-1 row-cols-md-2 g-4">
	<c:forEach items="${livros}" var="livro">

			<div class="col"> 
				<div class="card">
					<img src="imagens/dtr.jpg" class="card-img-top" alt="...">
					<div class="card-body">
						<h5 class="card-title">${livro.getTitulo()}</h5>
						<h4 class="card-title">${livro.getAutor()}</h4>
						<h3 class="card-title">${livro.getAno()}</h3>
						<p class="card-text">${livro.getEditora()}</p>
					</div>
				</div>
			</div>
		
	</c:forEach>
</div>
	

<div class="row">
	<c:forEach var="nome" items="${listaNomes.getNomes()}">
			${nome}<br />
	</c:forEach>
</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>


