package br.com.jairmaia.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "")
public class Ola extends HttpServlet {
	private static final long serialVersionUID = -1994226873980048537L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/index.jsp");
		rd.forward(req, resp);
//		PrintWriter out = resp.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h2>Hello World! (from servlet)</h2>");
//		out.println("</body>");
//		out.println("</html>");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Método Destroy chamado");
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Método Init chamado");
	}
	
}
