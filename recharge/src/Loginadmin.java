

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Loginadmin extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response)throws  IOException, ServletException{
		
		String adminname=request.getParameter("adminname");
		String password=request.getParameter("password");
		 Model m=new Model();
		
		 m.setAdminname(adminname);
			m.setPassword(password);
			boolean temp;
			try {
				temp = m.login();
			
		 if(temp==true){
				HttpSession session=request.getSession(true);
				String accno=m.getAdminname();
				((HttpSession)session).setAttribute("adminname",m.getAdminname());
				System.out.println(adminname);
				System.out.println("loginsuccessfully");
				response.sendRedirect("welcomeadminindex.jsp");
			}
			else
			{
				response.sendRedirect("loginfailed.jsp");
				
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
         
	
    
    public Loginadmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
