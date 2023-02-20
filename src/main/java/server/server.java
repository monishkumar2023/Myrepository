package server;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class server
 */
@WebServlet("/server")
public class server extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String a=request.getParameter("n1");
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/products";
		String username="root";
		String password="mutta";
		Connection cn=DriverManager.getConnection(url,username,password);
		PreparedStatement ps1=cn.prepareStatement("select order_details.Order_id,order_details.Order_date,prod.*from prod,order_details where prod.Product_id=order_details.Product_id=?;");

		ResultSet rs1=ps1.executeQuery();
		ArrayList <String> al=new ArrayList<String>();
		al.add("order ")
		Iterator<String> h=
		String w=rs.getNString(1);
		String w1=rs.getNString(2);
		String w3=rs.getNString(3);
		String x=rs1.getNString(1);
		String x1=rs1.getNString(2);
		String x3=rs1.getNString(3);
		PrintWriter pw=response.getWriter();
		pw.print(w);
		pw.print(w1);
		pw.print(w3);
		pw.print(x);
		pw.print(x1);
		pw.print(x3);
		RequestDispatcher rd=request.getRequestDispatcher("databse.jsp");
		rd.forward(request, response);
		}
		
		
	    catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
