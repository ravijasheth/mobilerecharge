

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Recharge extends HttpServlet {
	
	
    
    public void service(HttpServletRequest request, HttpServletResponse response)throws  IOException, ServletException{
		
		String provider_id=request.getParameter("provider_id");
		String number1=request.getParameter("number1");
		String amount=request.getParameter("amount");
		
		 Model m=new Model();
		m.setProvider_id(provider_id);
		 m.setNumber1(number1);
		 m.setAmount(amount);
		
		 
		
          
         
        	  
			
			//response.sendRedirect("rechargedone.jsp");
			 String title = "Recharge";
		      String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " +
		         "transitional//en\">\n";
		      response.setContentType("text/html");

		      PrintWriter out = response.getWriter(); 
		      out.println(docType + "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n"
		            + "<form action=Recharge1 method=post >" +
		               "<h1 align = \"center\">" + title + "</h1>\n" +
		    
		                  " <b>Recharge of </b> "+request.getParameter("provider_id")+ "<b>mobile  </b>"
		                		  + request.getParameter("number1") + 
		                  "<b>  for   Rs.</b>"+ request.getParameter("amount")+ 
		                 
		                 
		            "<input type=submit name=\"Proceed _To_Pay\"></form></body></html>"
		        
		      );
		      
			}
			
			
		
         
    public Recharge() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
