package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_form_action.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\" />\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("  <title>Clinica Veterinaria</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"styles.css?v=2\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Fondo -->\r\n");
      out.write("  <div class=\"fondo\"></div>\r\n");
      out.write("  <div class=\"overlay\"></div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Contenido -->\r\n");
      out.write("  <div class=\"contenido\">\r\n");
      out.write("    <header class=\"encabezado\">\r\n");
      out.write("      <h1 class=\"titulo\">Clinica Veterinaria</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <main class=\"panel\">\r\n");
      out.write("      ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_s_form_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_s_form_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_s_form_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_s_form_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_s_form_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_s_form_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"footer\">\r\n");
<<<<<<< HEAD
      out.write("    © 2025 Clínica Veterinaria Futurista. Todos los derechos reservados.\r\n");
=======
      out.write("    © 2025 Clínica Veterinaria. Todos los derechos reservados.\r\n");
>>>>>>> origin/main
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("listarCitas");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <button type=\"submit\" class=\"card\">\r\n");
        out.write("          Citas<br><span>Agendar y gestionar</span>\r\n");
        out.write("        </button>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_1 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_1.setPageContext(_jspx_page_context);
    _jspx_th_s_form_1.setParent(null);
    _jspx_th_s_form_1.setAction("listarDuenos");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <button type=\"submit\" class=\"card\">\r\n");
        out.write("          Dueños<br><span>Gestión de propietarios de las mascotas</span>\r\n");
        out.write("        </button>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_1);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_1);
    return false;
  }

  private boolean _jspx_meth_s_form_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_2 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_2.setPageContext(_jspx_page_context);
    _jspx_th_s_form_2.setParent(null);
    _jspx_th_s_form_2.setAction("listarFacturas");
    int _jspx_eval_s_form_2 = _jspx_th_s_form_2.doStartTag();
    if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <button type=\"submit\" class=\"card\">\r\n");
        out.write("          Facturas<br><span>Pagos y cobros</span>\r\n");
        out.write("        </button>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_form_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_2);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_2);
    return false;
  }

  private boolean _jspx_meth_s_form_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_3 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_3.setPageContext(_jspx_page_context);
    _jspx_th_s_form_3.setParent(null);
    _jspx_th_s_form_3.setAction("listarHistoriasClinicas");
    int _jspx_eval_s_form_3 = _jspx_th_s_form_3.doStartTag();
    if (_jspx_eval_s_form_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <button type=\"submit\" class=\"card\">\r\n");
        out.write("          Historia Clínica<br><span>Historial médico</span>\r\n");
        out.write("        </button>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_form_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_3);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_3);
    return false;
  }

  private boolean _jspx_meth_s_form_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_4 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_4.setPageContext(_jspx_page_context);
    _jspx_th_s_form_4.setParent(null);
    _jspx_th_s_form_4.setAction("listMascota");
    int _jspx_eval_s_form_4 = _jspx_th_s_form_4.doStartTag();
    if (_jspx_eval_s_form_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <button type=\"submit\" class=\"card\">\r\n");
        out.write("          Mascotas<br><span>Fichas individuales</span>\r\n");
        out.write("        </button>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_form_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_4);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_4);
    return false;
  }

  private boolean _jspx_meth_s_form_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_5 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_5.setPageContext(_jspx_page_context);
    _jspx_th_s_form_5.setParent(null);
    _jspx_th_s_form_5.setAction("listTratamiento");
    int _jspx_eval_s_form_5 = _jspx_th_s_form_5.doStartTag();
    if (_jspx_eval_s_form_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <button type=\"submit\" class=\"card\">\r\n");
        out.write("          Tratamientos<br><span>Procedimientos</span>\r\n");
        out.write("        </button>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_form_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_5);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_5);
    return false;
  }

  private boolean _jspx_meth_s_form_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_6 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_6.setPageContext(_jspx_page_context);
    _jspx_th_s_form_6.setParent(null);
    _jspx_th_s_form_6.setAction("listVacunacion");
    int _jspx_eval_s_form_6 = _jspx_th_s_form_6.doStartTag();
    if (_jspx_eval_s_form_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <button type=\"submit\" class=\"card\">\r\n");
        out.write("          Vacunación<br><span>Historial de vacunas</span>\r\n");
        out.write("        </button>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_form_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_6);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_6);
    return false;
  }

  private boolean _jspx_meth_s_form_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_7 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_7.setPageContext(_jspx_page_context);
    _jspx_th_s_form_7.setParent(null);
    _jspx_th_s_form_7.setAction("listVeterinario");
    int _jspx_eval_s_form_7 = _jspx_th_s_form_7.doStartTag();
    if (_jspx_eval_s_form_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_7.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <button type=\"submit\" class=\"card\">\r\n");
        out.write("          Veterinarios<br><span>Equipo médico</span>\r\n");
        out.write("        </button>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_s_form_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_7);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_7);
    return false;
  }
}
