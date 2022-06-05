<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>MARVEL</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap5/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="css/estilos.css" />
		<script src="js/jquery-3.2.1.slim.min.js"></script>
		<script src="js/vue.js"></script>
		<script src="css/bootstrap5/js/bootstrap.min.js"></script>
	</head>
	<body>
		<header>
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		    <div class="container-fluid">
		      <a class="navbar-brand" href="/index"><img src="imagens/i.png" class="img-thumbnail" style="height:50px;width:120px;" alt="..."></a>
		      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
		        <span class="navbar-toggler-icon"></span>
		      </button>
		      <div class="collapse navbar-collapse" id="navbarCollapse">
		        <ul class="navbar-nav me-auto mb-2 mb-md-0">
		          <li class="nav-item item-primary">
		            <a class="nav-link text-light" href="/index">Inicial</a>
		          </li>
<!-- 		          <li class="nav-item ">
		            <a class="nav-link text-light" href="/mensagem">Mensagem</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link text-light" href="/empresa">Empresa</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link text-light" href="/servicos">Serviços</a>
		          </li> -->
		          <li class="nav-item">
		          	<a class="nav-link text-light" href="/listarproduto">Galeria</a>
		          </li>
		          
		          <li class="nav-item dropdown">
			          <a class="nav-link dropdown-toggle text-light" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">Filmes</a>
			          
			          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
				        <li><a class="dropdown-item" href="/livrocadastro">Cadastro</a></li>
			            <li><hr class="dropdown-divider"></li>
			            <li><a class="dropdown-item" href="/listarlivros">Manutenção</a></li>
			          </ul>   
			      </li>
		          
		          <li class="nav-item">
		            <a class="nav-link text-light" href="/contato">Contato</a>
		          </li>
		          	  	          	
		        </ul>
		        
		        <form class="d-flex" method="GET" action="/pesquisarlivro">
		          <input class="form-control me-2" type="search" name="pesquisar" placeholder="Procurar" aria-label="Search">
		          <button class="btn btn-danger" type="submit">Procurar</button>
		        </form>
		        
		      </div>
		    </div>
		  </nav>
			<div>
				<img style="height:400px;width:100%;"  src="imagens/lg.jpg" />
			</div>		  	        
		</header>
		<main>
			<div class="container">