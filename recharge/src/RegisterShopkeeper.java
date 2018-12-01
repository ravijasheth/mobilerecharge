	


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



		public class RegisterShopkeeper extends HttpServlet {
			public void service(HttpServletRequest request, HttpServletResponse response)throws  IOException, ServletException{
					
					String fullname=request.getParameter("fullname");
					String fathersname=request.getParameter("fathersname");
					String address=request.getParameter("address");
					
					//String adminname=request.getParameter("fullname");
					String password1=request.getParameter("password1");
					String mobile_no=request.getParameter("mobile_no");
					 Model m=new Model();
					
		    		 m.setFullname(fullname);
		    		 m.setFathersname(fathersname);
		    		
		    		 m.setAddress(address);
		    		 m.setPassword1(password1);
		    		 m.setMobile_no(mobile_no);
		    		 boolean res=m.insertshopkeeper();
		    		 
		    		 PrintWriter pw = response.getWriter();
			          
			          if(res==true){ 
						pw.println("<br>Date has been inserted in to Datebase");
						response.sendRedirect("loginshopkeeper.jsp");

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


