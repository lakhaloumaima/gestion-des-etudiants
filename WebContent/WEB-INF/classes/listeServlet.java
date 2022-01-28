import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class listeServlet
 */
@WebServlet("/listeServlet")
public class listeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		try {
			/**********************************************/
			String strClassName = "com.mysql.jdbc.Driver";
			Class.forName(strClassName);
	         String url = "jdbc:mysql://localhost:3306/miniProjet";
	            String user = "root";
	            String password = "";
	            Connection  conn = DriverManager.getConnection(url, user, password);
	            /***********************************/

	            response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String id =request.getParameter("id");
				String nom =request.getParameter("nom");
				String prenom =request.getParameter("prenom");
				String classe =request.getParameter("classe");
				
				PreparedStatement psUsers = conn.prepareStatement("select * from etudiant ");
				/*psUsers.setString(1,id);
				psUsers.setString(2,nom);
				psUsers.setString(3,prenom);
				psUsers.setString(4,classe);*/
				
				
				ResultSet rsUsers = psUsers.executeQuery();
		        if(rsUsers.next() ) {
		        	request.setAttribute("id",id);
		        	request.setAttribute("nom",nom);
		        	request.setAttribute("prenom",prenom);
		        	request.setAttribute("classe",classe);
			 		ServletContext context = getServletContext();
					RequestDispatcher dispatcher = context.getRequestDispatcher("/listeEtudiant.jsp");
					dispatcher.forward(request, response);
		        
		        }
		        
		        else {
				out.print("<h1>échec d'affichage liste </h1>");
		        }
			
				
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
		}
		
		
		catch(ClassNotFoundException e) {
			System.out.println("Driver non chargé !");
			e.printStackTrace(); 
		} catch(SQLException e) {
			System.out.println(e);
	
		} 
		
	}	

/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}