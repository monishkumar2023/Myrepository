package server4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/server4")
public class server4 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		String a=request.getParameter("n1");
		pw.print("<table border='1'><tr><th>order_id</th><th>order_date</th><th>product_id</th><th>product_name</th><th>product_describtion</th><th>product_price</th></tr>");
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/products";
				String username="root";
				String password="mutta";
				Connection cn=DriverManager.getConnection(url,username,password);
				PreparedStatement ps=cn.prepareStatement("select order_info.order_id,order_info.order_date,details_pro.*from details_pro,order_info where details_pro.product_id=order_info.product_id having order_id=?;");
				ps.setString(1, a);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					pw.print("<tr><td>");
					pw.println(rs.getString(1));
					pw.print("</td>");
					pw.print("<td>");
					pw.println(rs.getString(2));
					pw.print("</td>");
					pw.print("<td>");
					pw.println(rs.getString(3));
					pw.print("</td>");
					pw.print("<td>");
					pw.println(rs.getString(4));
					pw.print("</td>");
					pw.print("<td>");
					pw.println(rs.getString(5));
					pw.print("</td>");
					pw.print("<td>");
					pw.println(rs.getString(6));
					pw.print("</td></tr>");
				}
			 }
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		pw.print("</table>");
		}
	}

