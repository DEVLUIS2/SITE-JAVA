<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
		<h3>P�gina Empresa</h3>
	</div>
	<div class="row">	
		<p>
			Bem-vindo! 
		</p>
		<h1>
			Essa � nossa empresa.
		</h1>
		<strong>
			${texto}
		</strong>
	</div>
	<div class="row">
		<c:forEach var="nome" items="${listaNomes.getNomes()}">
			${nome}<br />
		</c:forEach>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>