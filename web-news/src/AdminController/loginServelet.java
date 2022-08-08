package AdminController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connect.loginDao;
import Connect.newsDao;
import Entity.TaiKhoan;

@WebServlet(urlPatterns = {"/dang-nhap"})
public class loginServelet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			loginDao lg = new loginDao();
			String user = request.getParameter("text1");
			String pass = request.getParameter("text2");
			TaiKhoan tk= lg.check(user, pass);
			if(tk == null) {
				response.sendRedirect("dang-nhap");
			}
			else {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				session.setAttribute("acc", tk);
				response.sendRedirect("admin-trang-chu");
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
