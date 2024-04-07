package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
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
		String r1 = request.getParameter("r1");
		String r2 = request.getParameter("r2");
		String r3 = request.getParameter("r3");
		String r4 = request.getParameter("r4");
		String r5 = request.getParameter("r5");
		String r6 = request.getParameter("r6");
		String r7 = request.getParameter("r7");
		String r8 = request.getParameter("r8");
		String r9 = request.getParameter("r9");
		String r10 = request.getParameter("r10");
		String r11 = request.getParameter("r11");
		String r12 = request.getParameter("r12");
		String r13 = request.getParameter("r13");
		String r14 = request.getParameter("r14");
		String r15 = request.getParameter("r15");
		String r16 = request.getParameter("r16");
		String r17 = request.getParameter("r17");
		String r18 = request.getParameter("r18");
		String r19 = request.getParameter("r19");
		String r20 = request.getParameter("r20");
		
		String newWebRaterID = "ADIB";
        RaterDatabase.initialize("ratings.csv");
        
        RaterDatabase.addRaterRating(newWebRaterID,r1.substring(2,r1.length()),Double.parseDouble(r1.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r2.substring(2,r2.length()),Double.parseDouble(r2.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r3.substring(2,r3.length()),Double.parseDouble(r3.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r4.substring(2,r4.length()),Double.parseDouble(r4.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r5.substring(2,r5.length()),Double.parseDouble(r5.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r6.substring(2,r6.length()),Double.parseDouble(r6.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r7.substring(2,r7.length()),Double.parseDouble(r7.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r8.substring(2,r8.length()),Double.parseDouble(r8.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r9.substring(2,r9.length()),Double.parseDouble(r9.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r10.substring(2,r10.length()),Double.parseDouble(r10.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r11.substring(2,r11.length()),Double.parseDouble(r11.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r12.substring(2,r12.length()),Double.parseDouble(r12.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r13.substring(2,r13.length()),Double.parseDouble(r13.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r14.substring(2,r14.length()),Double.parseDouble(r14.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r15.substring(2,r15.length()),Double.parseDouble(r15.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r16.substring(2,r16.length()),Double.parseDouble(r16.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r17.substring(2,r17.length()),Double.parseDouble(r17.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r18.substring(2,r18.length()),Double.parseDouble(r18.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r19.substring(2,r19.length()),Double.parseDouble(r19.substring(0,3)));
        RaterDatabase.addRaterRating(newWebRaterID,r20.substring(2,r20.length()),Double.parseDouble(r20.substring(0,3)));
        
        RecommendationRunner obj = new RecommendationRunner();
        ArrayList<Rating> recommendedMovies = obj.finalSimilarMoviesRecommended(newWebRaterID);
        
        request.setAttribute("recommendedMovies",recommendedMovies);
        
        request.getRequestDispatcher("finalRecommendedMovies.jsp").forward(request, response);
	}

}
