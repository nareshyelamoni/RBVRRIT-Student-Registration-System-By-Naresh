

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/dynamicform")
public class RegistrationController extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rst=0;
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		Integer age=Integer.parseInt(request.getParameter("age"));
		String gmail=request.getParameter("gmail");
		String password=request.getParameter("password");
		String location=request.getParameter("location");
		String course=request.getParameter("course");
		RegisterDao rd=new RegisterDao();
		try {
			rst=rd.registerInfo(id, name, age, gmail, password, location, course);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rst!=0) {
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("failure.jsp");
		}
	}

}
