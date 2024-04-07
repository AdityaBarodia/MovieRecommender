package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class FilterServlet
 */
public class FilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//from checkbox to String array
		String genres[] = request.getParameterValues("Genres");
		String minMinutes = request.getParameter("minMinutes");
		String maxMinutes = request.getParameter("maxMinutes");
		String minYear = request.getParameter("minYear");
		String maxYear = request.getParameter("maxYear");
		String directors = request.getParameter("directors");
		
		RecommendationRunner obj = new RecommendationRunner();
        ArrayList<String> filteredMovies = obj.getFilteredMovies(genres,minMinutes,maxMinutes,minYear,maxYear,directors);
        request.setAttribute("filteredMovies",filteredMovies);
        
        request.getRequestDispatcher("finalFilteredMovies.jsp").forward(request, response);
	}

}
