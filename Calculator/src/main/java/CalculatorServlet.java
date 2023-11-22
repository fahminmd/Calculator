import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
// service method will cover both GET and POST. 
// uncomment below service method and comment doGet and doPost method
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//	int i = Integer.parseInt( req.getParameter("num1"));
//	int j = Integer.parseInt( req.getParameter("num2"));
//	int k = i+j;
//	System.out.println("i + "+i+" j " + j +"= " + k);
//	res.getWriter().println("i + "+i+" j " + j +"= " + k);
//}

// uncomment each method to run the code	
//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//int i = Integer.parseInt( req.getParameter("num1"));
//int j = Integer.parseInt( req.getParameter("num2"));
//int k = i+j;
//System.out.println("i + "+i+" j " + j +"= " + k);
//res.getWriter().println("its Post i + "+i+" j " + j +"= " + k);
//}
//
//
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
int i = Integer.parseInt( req.getParameter("num1"));
int j = Integer.parseInt( req.getParameter("num2"));
int k = i+j;
System.out.println("i + "+i+" j " + j +"= " + k);
res.getWriter().println("its get i + "+i+" j " + j +"= " + k);


}
//
//


}
