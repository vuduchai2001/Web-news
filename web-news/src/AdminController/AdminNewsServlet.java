package AdminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connect.newsDao;
import Entity.TinTuc;

/**
 * Servlet implementation class AdminNewsServlet
 */
@WebServlet("/admin-tin-tuc")
public class AdminNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String index = (request.getParameter("index"));
		if(index == null) {
			index = "1";
		}
		int idx =  Integer.parseInt(index);
		request.setAttribute("idx", idx);
		newsDao dao = new newsDao();
		List<TinTuc> list = dao.getPaging(idx);
		request.setAttribute("list", list);
		request.getRequestDispatcher("AdminNews.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
