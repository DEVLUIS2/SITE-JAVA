<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
		<h3>Serviços</h3>
	</div>
	
	<div class="row">
		<p>
		<c:set var="numero" value="10"></c:set>
		<c:if test="${numero > 5}">
			Valor Correto!
		</c:if>
		
		<ul>
			<c:forEach items="${listaServicos}" var="servico"> 
				<li>${servico}</li>
			</c:forEach>
		</ul>
		
		 <%
			 /*	int numero = 10;
				if (numero > 5){
					out.println("Valor Correto!");
				} */
		 %> 
		<p>
	</div>
	
	<div class="row">
		<c:forEach var="nome" items="${listaNomes.getNomes()}">
			${nome}<br />
		</c:forEach>
	</div>
<jsp:include page="layoutrodape.jsp"></jsp:include>