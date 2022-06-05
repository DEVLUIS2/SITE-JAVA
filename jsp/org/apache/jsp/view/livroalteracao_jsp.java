package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class livroalteracao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<div class=\"row mb-3 text-center\">\r\n");
      out.write("\t\t<h3>Alterar Informações sobre o Filme</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"row d-flex justify-content-evenly position-relative border border-3 border-success bg-dark rounded-pill\">\t\r\n");
      out.write("\t\t<form method=\"POST\" class=\"col-6 p-5\" action=\"/alterarlivro\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"codigo\" class=\"form-control\"  placeholder=\"Código\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livro.getCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"titulo\" class=\"form-control\" placeholder=\"Nome do Filme\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livro.getTitulo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"autor\" class=\"form-control\" placeholder=\"Diretor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livro.getAutor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"editora\" class=\"form-control\" placeholder=\"Produtora\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livro.getEditora()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<input type=\"text\" text-transform=\"uppercase\" name=\"ano\" class=\"form-control\" placeholder=\"Ano de Produção\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livro.getAno()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t<br/>\r\n");
      out.write("\t\t\t<div class=\"d-grid gap-1 col-3 mx-auto\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-primary\">Alterar</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
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
