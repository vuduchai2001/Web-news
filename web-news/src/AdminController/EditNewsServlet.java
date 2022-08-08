package AdminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connect.newsDao;
import Entity.TinTuc;

/**
 * Servlet implementation class EditNewsServlet
 */
@WebServlet("/sua-tin-tuc")
public class EditNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int index = Integer.parseInt(request.getParameter("id"));
		newsDao dao = new newsDao();
		List<TinTuc> list = dao.getDetailsNew(index);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("AdmineditNews.jsp");
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
			int id = Integer.parseInt(request.getParameter("id"));
			String caption = request.getParameter("text1");
			String category = request.getParameter("text2");
			String img = request.getParameter("text3");
			String details = request.getParameter("text4");
			String date = java.time.LocalDate.now().toString();
			newsDao ct = new newsDao();	
			ct.update(caption, "assets/img/trending/trending_top.jpg", category, "false", date, details, id);
			response.sendRedirect("admin-tin-tuc");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
