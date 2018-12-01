

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Recharge1 extends HttpServlet {
	

	public void service(HttpServletRequest request, HttpServletResponse response1)throws  IOException, ServletException{
		
		String provider_id=request.getParameter("provider_id");
		String number1=request.getParameter("number1");
		String amount=request.getParameter("amount");
		String client_id="60-6D-C7-25-39-B3";
		        String api_token = "UQFWenWlLTtuo056WV59Lsjs38j9aiXzZkZhNpwZrjiR3zBOAmnhHLpolqAG"; // api_token token will in (https://www.pay2all.in/developers/recharge-api-doc) 
		        //String ch = curl_init();
		       
		        //curl_setopt($ch, CURLOPT_URL, $url);
		        //curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
		        //$response = curl_exec($ch);
		        //curl_close($ch);
		        //echo $response;
		        URL url=new URL("https://www.pay2all.in/web-api/paynow?api_token="+api_token+"&number1="+number1+"&provider_id="+provider_id+"&amount="+amount+"&client_id="+client_id);
		        HttpURLConnection con = (HttpURLConnection) (url).openConnection();
		        con.setRequestMethod("GET");
		      //add request header
				//con.setRequestProperty("User-Agent", USER_AGENT);

				//int responseCode = con.getResponseCode();
				//System.out.println("\nSending 'GET' request to URL : " + url);
				//System.out.println("Response Code : " + responseCode);

				//BufferedReader in = new BufferedReader((new InputStreamReader(((HttpURLConnection) (url).openConnection()).getInputStream(), Charset.forName("UTF-8"))));
				//String inputLine;
				//StringBuffer response = new StringBuffer();

				//while ((inputLine = in.readLine()) != null) {
				//	response.append(inputLine);
				//}
				//in.close();

				//print result
				//System.out.println(response.toString());

		 Model m=new Model();
		m.setProvider_id(provider_id);
		 m.setNumber1(number1);
		 m.setAmount(amount);
		 //System.out.println("hiii");
		 boolean res=m.insertrecharge();
	
         
			
		
         
		}
    public Recharge1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
