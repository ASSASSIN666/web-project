import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Validate extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		PrintWriter out=res.getWriter();
		if((name.equals("Aditya"))&&(pass.equals("aditya")))  
		{
			RequestDispatcher rd=req.getRequestDispatcher("next");
			rd.forward(req,res);
		}
		else
		{
			if(name.equals("Aditya"))
			{
				out.println("<b>Error Message: Incorret Password!</b>");
				RequestDispatcher rd=req.getRequestDispatcher("FailedLogin.html");
				rd.include(req,res);
			}
			else if (pass.equals("aditya")) 
			{
				out.println("Error Message: Incorrect Username!");
				RequestDispatcher rd=req.getRequestDispatcher("FailedLogin.html");
				rd.include(req,res);	
			}
			else
			{
				//out.println("Error Message: Incorrect Username and Password");
				RequestDispatcher rd=req.getRequestDispatcher("FailedLogin.html");
				rd.forward(req,res);
			}
		}
	}
}