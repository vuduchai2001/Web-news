package Controller;

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


@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String index = (request.getParameter("index"));
		if(index == null) {
			index = "1";
		}
		int idx =  Integer.parseInt(index);
		newsDao dao = new newsDao();
		List<TinTuc> list = dao.getPaging(idx);
		List<TinTuc> listlife = dao.getPagingCategory("Đời sống",idx);
		List<TinTuc> listfashion = dao.getPagingCategory("Thời Trang",idx);
		List<TinTuc> listsport = dao.getPagingCategory("Thể Thao",idx);
		List<TinTuc> listtech = dao.getPagingCategory("Công Nghệ",idx);
		request.setAttribute("list", list);
		request.setAttribute("listlife", listlife);
		request.setAttribute("listfashion", listfashion);
		request.setAttribute("listsport", listsport);
		request.setAttribute("listtech", listtech);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
