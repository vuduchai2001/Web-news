package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connect.contactDao;
import Connect.loginDao;
import Entity.LienHe;

/**
 * @author Admin
 *
 */
@WebServlet(urlPatterns = {"/lien-he"})
public class contactServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("contact.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String sub = request.getParameter("subject");
			String mess = request.getParameter("message");
			contactDao ct = new contactDao();
			ct.insert(name, email, sub, mess);
			response.sendRedirect("lien-he");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
