import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class OldResponse extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>bhaag bencho</body></html>");
		String name=req.getParameter("name");
		out.println("Welcome"+name);
	}
}