	


		import java.io.IOException;
		import java.io.PrintWriter;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.SQLException;

		import javax.servlet.ServletException;
		import javax.servlet.annotation.WebServlet;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;

		import com.sun.corba.se.pept.transport.Connection;



		public class RegisterAdmin extends HttpServlet {
			public void service(HttpServletRequest request, HttpServletResponse response)throws  IOException, ServletException{
					
					String adminname=request.getParameter("adminname");
					String password=request.getParameter("password");
					 Model m=new Model();
		    		 m.setAdminname(adminname);
		    		 m.setPassword(password);
		    		
		    		 boolean res=m.insert();
		    		 
		    		 PrintWriter pw = response.getWriter();
			          
			          if(res==true){ 
						pw.println("<br>Date has been inserted in to Datebase");
						response.sendRedirect("loginadmin.jsp");

						}
						else{
						pw.println("failed to insert the data");
						response.sendRedirect("loginfailed.jsp");

						}
						
					
			         
					}
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				response.getWriter().append("Served at: ").append(request.getContextPath());
			}

			/**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
			 */
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				doGet(request, response);
					
			}

		
	}


