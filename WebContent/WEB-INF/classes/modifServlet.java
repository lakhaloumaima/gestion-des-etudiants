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
 * Servlet implementation class modifServlet
 */
@WebServlet("/modifServlet")
public class modifServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifServlet() {
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
				//String id =request.getParameter("id");
				String nom =request.getParameter("nom");
				String prenom =request.getParameter("prenom");
				String classe =request.getParameter("classe");
				String id =request.getParameter("id");
	            PreparedStatement psmodifier = conn.prepareStatement("UPDATE etudiant Set nom=?,prenom=?,classe =? WHERE id =? ");
	            //psmodifier.setString (1,id);
				psmodifier.setString (1,nom);
				psmodifier.setString (2,prenom);
				psmodifier.setString (3,classe);
				psmodifier.setString (4,id);
				
				int x=psmodifier.executeUpdate();  
				if(x>0)  {
					ServletContext context = getServletContext();
					RequestDispatcher dispatcher = context.getRequestDispatcher("/listeEtudiant.jsp");
					dispatcher.forward(request, response);
				}
	            
	            
	       
		        
		       else {
				out.print("<h1>�chec de la mise a jour </h1>");
		        }
				
				
				out.print("</html>");
				out.close();
				conn.close();
		}
		
		catch(ClassNotFoundException e) {
			System.out.println("Driver non charg� !");
			e.printStackTrace(); 
		} catch(SQLException e) {
			System.out.println(e);
	
		} 
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id =request.getParameter("id");
		String nom =request.getParameter("nom");
		String prenom =request.getParameter("prenom");
		String classe =request.getParameter("classe");
		
		
		PreparedStatement psUsers = conn.prepareStatement("UPDATE etudiant SET nom=? or prenom=? or classe=? WHERE id = ?");
		psUsers.setString(1,id);
		psUsers.setString(2,nom);
		psUsers.setString(3,prenom);
		psUsers.setString(4,classe);
		int rsUsers = psUsers.executeUpdate();
		
        if(rsUsers == 1 ) {
        	/*request.setAttribute("id",id); 
        	 request.setAttribute("nom",nom);
        	 request.setAttribute("prenom",prenom);
        	 request.setAttribute("classe",classe);*/
	 		/*ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/listeEtudiant.jsp");
			dispatcher.forward(request, response);
        
        }*/
		
	}
		
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}
		
		
	
}
