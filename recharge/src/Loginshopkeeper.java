

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Loginshopkeeper extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response)throws  IOException, ServletException{
		
		String mobile_no=request.getParameter("mobile_no");
		String password1=request.getParameter("password1");
		 Model m=new Model();
		
		 m.setMobile_no(mobile_no);
			m.setPassword1(password1);
			try {	boolean temp;
			
				temp = m.loginshopkeeper();
				if(temp==true){
					HttpSession session=request.getSession(true);
					
					((HttpSession)session).setAttribute("mobile_no",m.getMobile_no());
					System.out.println(mobile_no);
					System.out.println("loginsuccessfully");
					response.sendRedirect("loginshopkeeperindex.jsp");
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

 
         
	
    
    public Loginshopkeeper() {
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
