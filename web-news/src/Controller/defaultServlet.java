package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/" })
public class defaultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 public defaultServlet() {
	   }
	 @Override
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {

		 RequestDispatcher rd = request.getRequestDispatcher("trang-chu");
			rd.forward(request, response);
	   }

	   @Override
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	       this.doGet(request, response);
	   }
}
