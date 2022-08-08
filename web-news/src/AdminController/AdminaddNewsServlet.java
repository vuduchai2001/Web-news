package AdminController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connect.contactDao;
import Connect.newsDao;

/**
 * Servlet implementation class AdminaddNewsServlet
 */
@WebServlet("/them-tin-tuc")
public class AdminaddNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminaddNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("AdminaddNews.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		try {
			String caption = request.getParameter("text1");
			String category = request.getParameter("text2");
			String img = request.getParameter("text3");
			String details = request.getParameter("text4");
			String date = java.time.LocalDate.now().toString();
			newsDao ct = new newsDao();	
			ct.insert(caption, "assets/img/news/weeklyNews2.jpg", category, "false",date, details);
			response.sendRedirect("admin-tin-tuc");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
