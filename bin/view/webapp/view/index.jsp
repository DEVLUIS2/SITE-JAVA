<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="layouttopo.jsp"></jsp:include>
<div class="row text-center ">
	<h3>Filmes mais procurados</h3>
</div>

<div class="row row-cols-1 row-cols-md-2 g-4">
  <div class="col">
    <div class="card">
      <img src="imagens/v.jpg" style="height:350px;width:100%;" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Vingadores: Guerra do Infinito</h5>
        <p class="card-text">Homem de Ferro, Thor, Hulk e os Vingadores se unem para combater seu inimigo mais poderoso, o maligno Thanos. Em uma miss�o para coletar todas as seis pedras infinitas, Thanos planeja us�-las para infligir sua vontade mal�fica sobre a realidade.</p>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="imagens/dtr.jpg" style="height:350px;width:100%;" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Doutor Estranho no Multiverso da Loucura</h5>
        <p class="card-text">O aguardado filme trata da jornada do Doutor Estranho rumo ao desconhecido. Al�m de receber ajuda de novos aliados m�sticos e outros j� conhecidos do p�blico, o personagem atravessa as realidades alternativas incompreens�veis e perigosas do Multiverso para enfrentar um novo e misterioso advers�rio.</p>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="imagens/thor.jpg" style="height:700px;width:100%;" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Thor: Amor e Trov�o</h5>
        <p class="card-text">Thor: Love and Thunder � um futuro filme estadunidense de super-her�i de 2022 baseado no personagem Thor, da Marvel Comics.</p>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="imagens/pant.jpg" style="height:700px;width:100%;" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Black Panther: Wakanda Forever</h5>
        <p class="card-text">Black Panther: Wakanda Forever � um futuro filme estadunidense de super-her�i baseado no personagem Pantera Negra da Marvel Comics.</p>
      </div>
    </div>
  </div>
</div>




<%-- 	<div>
		<ul>
			<c:forEach var="nome" items="${listanomes.getNomes()}">
				<li>${nome}</li>
			</c:forEach>
		</ul>
	</div> --%>

<%-- 	<div class="row">
		<c:forEach var="nome" items="${listaNomes.getNomes()}">
			${nome}<br />
		</c:forEach>
	</div> --%>





<jsp:include page="layoutrodape.jsp"></jsp:include>