<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	
	<div class="d-flex justify-content-evenly position-relative">
	
		<form method="POST" Action="/contato" class="col-8">
			<div class="row mb-5 text-center">
    			<h3>Contato</h3>
  			</div>
  			<div class="mb-3">
    			<input type="text" name="nome" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Nome">
  			</div>
  			<div class="mb-3">
    			<input type="email" name="email" class="form-control" id="exampleInputPassword1" placeholder="Email">
  			</div>
  			<div class="mb-3">
    			<input type="text" name="mensagem" class="form-control" id="exampleCheck1" placeholder="Mensagem">
  			</div>
  			<div class="mb-3">
    			<input type="tel" name="telefone" class="form-control" id="exampleCheck1" placeholder="Telefone">
  			</div>
  			<div class="d-grid gap-1 col-3 mx-auto">
  				<button type="submit" class="btn btn-success align-items-center">Enviar</button>
  			</div>
	  	</form>
	  	
<%-- 	  	<div class="col-5 ">
	  		<h3>Telefones</h3>
	  		<ul>
				<c:forEach items="${listaTelefones}" var="telefone"> 
					<li>${telefone}</li>
				</c:forEach>
			</ul>
	  	</div> --%>
	  	
	</div>
	
	
	<div class="row">
		<c:forEach var="nome" items="${listaNomes.getNomes()}">
			${nome}<br />
		</c:forEach>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>