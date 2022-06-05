package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layouttopo.jsp", out, false);
      out.write("\r\n");
      out.write("<div class=\"row text-center \">\r\n");
      out.write("\t<h3>Filmes mais procurados</h3>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row row-cols-1 row-cols-md-2 g-4\">\r\n");
      out.write("  <div class=\"col\">\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("      <img src=\"imagens/v.jpg\" style=\"height:350px;width:100%;\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("      <div class=\"card-body\">\r\n");
      out.write("        <h5 class=\"card-title\">Vingadores: Guerra do Infinito</h5>\r\n");
      out.write("        <p class=\"card-text\">Homem de Ferro, Thor, Hulk e os Vingadores se unem para combater seu inimigo mais poderoso, o maligno Thanos. Em uma missão para coletar todas as seis pedras infinitas, Thanos planeja usá-las para infligir sua vontade maléfica sobre a realidade.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col\">\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("      <img src=\"imagens/dtr.jpg\" style=\"height:350px;width:100%;\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("      <div class=\"card-body\">\r\n");
      out.write("        <h5 class=\"card-title\">Doutor Estranho no Multiverso da Loucura</h5>\r\n");
      out.write("        <p class=\"card-text\">O aguardado filme trata da jornada do Doutor Estranho rumo ao desconhecido. Além de receber ajuda de novos aliados místicos e outros já conhecidos do público, o personagem atravessa as realidades alternativas incompreensíveis e perigosas do Multiverso para enfrentar um novo e misterioso adversário.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col\">\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("      <img src=\"imagens/thor.jpg\" style=\"height:700px;width:100%;\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("      <div class=\"card-body\">\r\n");
      out.write("        <h5 class=\"card-title\">Thor: Amor e Trovão</h5>\r\n");
      out.write("        <p class=\"card-text\">Thor: Love and Thunder é um futuro filme estadunidense de super-herói de 2022 baseado no personagem Thor, da Marvel Comics.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"col\">\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("      <img src=\"imagens/pant.jpg\" style=\"height:700px;width:100%;\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("      <div class=\"card-body\">\r\n");
      out.write("        <h5 class=\"card-title\">Black Panther: Wakanda Forever</h5>\r\n");
      out.write("        <p class=\"card-text\">Black Panther: Wakanda Forever é um futuro filme estadunidense de super-herói baseado no personagem Pantera Negra da Marvel Comics.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layoutrodape.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
