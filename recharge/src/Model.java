

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.corba.se.pept.transport.Connection;


public class Model  {
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String us="system";
	String ps="system";
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet res=null;
	private String provider_id;
	private String number1;
	private String amount;
    public String getNumber1() {
		return number1;
	}


	public void setNumber1(String number1) {
		this.number1 = number1;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getProvider_id() {
		return provider_id;
	}


	private String adminname;
    private String password;
    private String fullname;
    private String fathersname;
    private String address;
    private String mobile_no;
    private String password1;

    private String shopkeeper_id;
	public String getShopkeeper_id() {
		return shopkeeper_id;
	}


	public void setShopkeeper_id(String shopkeeper_id) {
		this.shopkeeper_id = shopkeeper_id;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getFathersname() {
		return fathersname;
	}


	public void setFathersname(String fathersname) {
		this.fathersname = fathersname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobile_no() {
		return mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}


	public String getPassword1() {
		return password1;
	}


	public void setPassword1(String password1) {
		this.password1 = password1;
	}


	Model() 
    {
    	try
    	{
    	Class.forName("oracle.jdbc.driver.OracleDriver");
		con= DriverManager.getConnection(url, us, ps);    
    }
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    
    	
    }
	
	
	public boolean insert() {
		try
		{
			String s="INSERT INTO ADMIN VALUES(?,?)";
					pstmt=con.prepareStatement(s);
					pstmt.setString(1,adminname);
					pstmt.setString(2,password);
					
					int row=pstmt.executeUpdate();
					if(row==0)
					{
						return false;
					}
					else
					{
						return true;
					}
		}
		
					catch(Exception e)
		{
						e.printStackTrace();
		}
			
		
		return true;
	}
	public boolean display() {
		try
		{
			String s="SELECT *FROM ADMIN";
					pstmt=con.prepareStatement(s);
					
					
				res=pstmt.executeQuery();
				while(res.next()==true)
				{
					adminname=res.getString(1);
					 password=res.getString(2);
				
				
				
					if(res.equals(true))
					{
						return true;
					}
					else
					{
						return false;
					}
		}
		}
		
					catch(Exception e)
		{
						e.printStackTrace();
		}
			
		
		return true;
	}
	public boolean update(String adminname ){  
	   // int status=0;  
	    try{  
	        
	      String s= "update admin set adminname=?,password=?";  
	      pstmt=con.prepareStatement(s);
			
			
			
	      pstmt.setString(1,adminname);
			pstmt.setString(2,password);
			int row=pstmt.executeUpdate();
			if(row==0)
			{
				return false;
			}
			else
			{
				return true;
			}
	    }
			catch(Exception e)
			{
							e.printStackTrace();
			}
				
			
			return true;
		
}
	public  Model getRecordById(String adminname){  
	    Model u=null;  
	    try{  
	       // Connection con=getConnection();  
	  String s="select * from register where student_id=?";  
	  pstmt=con.prepareStatement(s);
		
	        pstmt.setString(1,adminname);  
	        ResultSet rs=pstmt.executeQuery();  
	        while(rs.next()){  
	            u=new Model();  
	            u.setAdminname(rs.getString("adminname"));  
	            u.setPassword(rs.getString("password"));  
	             
	       
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return u;  
	}  

	public int delete(String adminname){  
	    int status=0;  
	    try{  
	       // Connection con=getConnection();  
	       // PreparedStatement ps=con.prepareStatement("
	    	String s="delete from admin where adminname=?";  
	    	 pstmt=con.prepareStatement(s);
				
				
				
		      pstmt.setString(1,adminname); 
	        status=pstmt.executeUpdate(); 
	        
	    }catch(Exception e){
	    	e.printStackTrace();}
	    return status;
	    
	   
	  
	    
	}  
	


	public void update(Model m) {
		 try{  
		        
		      String s= "update admin set adminname=?,password=? where adminname=?";  
		      pstmt=con.prepareStatement(s);
				
				
				
		      pstmt.setString(1,adminname);
				pstmt.setString(2,password);
				
				int row=pstmt.executeUpdate();
				if(row==0)
				{
					
				}
				else
				{
									}
		    }
				catch(Exception e)
				{
								e.printStackTrace();
				}
					
				
			
	}


	public String getAdminname() {
		return adminname;
	}


	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean login() throws SQLException {

		String s="SELECT *FROM ADMIN WHERE ADMINNAME=? AND PASSWORD=?";
		pstmt=con.prepareStatement(s);
		
		
		pstmt.setString(1, adminname);
		pstmt.setString(2, password);
		res=pstmt.executeQuery();
		while(res.next()==true)
		{
			try {
				adminname=res.getString("adminname");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		
	return false;
	}


	public boolean loginshopkeeper() throws SQLException {

		String s="SELECT *FROM SHOPKEEPER1 WHERE MOBILE_NO=? AND PASSWORD1=?";
		pstmt=con.prepareStatement(s);
		
		
		pstmt.setString(1, mobile_no);
		pstmt.setString(2, password1);
		res=pstmt.executeQuery();
		while(res.next()==true)
		{
			try {
				mobile_no=res.getString("mobile_no");
				password1=res.getString("password1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		
	return false;
	}



	public boolean insertshopkeeper() {
		try
		{
			String s="INSERT INTO SHOPKEEPER1 VALUES(?,?,?,?,?)";
					pstmt=con.prepareStatement(s);
					
					pstmt.setString(1,fullname);
					pstmt.setString(2, fathersname);
					pstmt.setString(3, address);
					pstmt.setString(4,password1);
					pstmt.setString(5, mobile_no);
					
					int row=pstmt.executeUpdate();
					if(row==0)
					{
						return false;
					}
					else
					{
						return true;
					}
		}
		
					catch(Exception e)
		{
						e.printStackTrace();
		}
			
		
		return true;
	}


	


	public boolean insertrecharge() {
		try
		{
			String s="INSERT INTO RECHARGE VALUES(?,?,?)";
					pstmt=con.prepareStatement(s);
					
					pstmt.setString(1,provider_id);
					pstmt.setString(2, number1);
					pstmt.setString(3, amount);
				
					
					
					int row=pstmt.executeUpdate();
					if(row==0)
					{
						return false;
					}
					else
					{
						return true;
					}
		}
		
					catch(Exception e)
		{
						e.printStackTrace();
		}
			
		
		return true;
	}


	public void setProvider_id(String provider_id2) {
		// TODO Auto-generated method stub
		this.provider_id = provider_id2;
	}



}

	


