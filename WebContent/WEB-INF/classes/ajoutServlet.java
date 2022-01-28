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
 * Servlet implementation class ajoutServet
 */
@WebServlet("/ajoutServlet")
public class ajoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet (HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException 
	{
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
				String nom =request.getParameter("nom");
				String prenom =request.getParameter("prenom");
				String classe =request.getParameter("classe");
				
				PreparedStatement psUsers = conn.prepareStatement("INSERT INTO etudiant (nom,prenom,classe) VALUES (?,?,?)");
				psUsers.setString(1,nom);
				psUsers.setString(2,prenom);
				psUsers.setString(3,classe);
				
				
		        int rsUsers = psUsers.executeUpdate();
		        if(rsUsers == 1 ) {
			 		ServletContext context = getServletContext();
					RequestDispatcher dispatcher = context.getRequestDispatcher("/listeEtudiant.jsp");
					dispatcher.forward(request, response);
		        
		        }
		        
		        else {
				out.print("<h1>échec de l'ajout </h1>");
		        }
			
				
				
				// SQL insert
			/*	double solde = request.getParameter("solde");
					PreparedStatement psRetrait = conn.prepareStatement("INSERT INTO banque (solde,nom) VALUES (?,?) ");
					psRetrait.setDouble(1, solde);
					psRetrait.executeUpdate(); */
				
				out.print("</html>");
				out.close();
				conn.close();
		}
		
		catch(ClassNotFoundException e) {
			System.out.println("Driver non chargé !");
			e.printStackTrace(); 
		} 
		catch(SQLException e) {
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
