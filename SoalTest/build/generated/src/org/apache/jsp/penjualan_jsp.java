package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.penjualanModel;

public final class penjualan_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Penjualan</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-success\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Penjualan</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("              <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"barangController?proses=menuutama\">Data Barang</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"penjualanController?proses=menupenjualan\">Penjualan</a>\n");
      out.write("                </li>           \n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("           </nav>\n");
      out.write("   \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <a class=\"btn btn-primary mb-3 mt-3\" href=\"penjualanController?proses=input-penjualan\">Tambah data</a>\n");
      out.write("        \n");
      out.write("          <table class=\"table\">\n");
      out.write("          <thead class=\"thead-dark\">\n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"col\">Tanggal Faktur</th>\n");
      out.write("              <th scope=\"col\">No faktur</th>\n");
      out.write("              <th scope=\"col\">Nama Konsumen</th>\n");
      out.write("              <th scope=\"col\">Kode Barang</th>\n");
      out.write("              <th scope=\"col\">Nama Barang</th>\n");
      out.write("              <th scope=\"col\">Stok</th>\n");
      out.write("              <th scope=\"col\">Jumlah</th>\n");
      out.write("              <th scope=\"col\">Harga Satuan</th>\n");
      out.write("              <th scope=\"col\">Harga Total</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody>\n");
      out.write("                      ");

            penjualanModel km = new penjualanModel();
            List<penjualanModel> data = new ArrayList<penjualanModel>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        
      out.write("\n");
      out.write("            <tr>\n");
      out.write("              <th scope=\"row\">");
      out.print(data.get(x).getTglFaktur());
      out.write("</th>\n");
      out.write("                <td>");
      out.print(data.get(x).getNoFaktur());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(data.get(x).getNamaKonsumen());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(data.get(x).getKodeBarang());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(data.get(x).getNamaBarang());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(data.get(x).getStok());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(data.get(x).getJumlah());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(data.get(x).getStok());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(data.get(x).getHargaSatuan());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(data.get(x).getHargaTotal());
      out.write("</td>\n");
      out.write("                <td> \n");
      out.write("                    <a class=\"btn btn-danger\" href=\"penjualanController?proses=hapus-penjualan&id=");
      out.print(data.get(x).getNoFaktur());
      out.write("\">Hapus</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("          </tbody>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
