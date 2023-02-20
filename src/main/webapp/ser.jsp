<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<center>
<table border=1>
<tr>
<th>product_id</th>
<th>product_name</th>
<th>product_discribtion</th>
<th>product_price</th>
<th>order_id</th>
<th>order_date</th>

</tr>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/products";
		String username="root";
		String password="mutta";
		Connection cn=DriverManager.getConnection(url,username,password);
		Statement st=cn.createStatement();
		String str="select order_info.order_id,order_info.order_date,details_pro.*from details_pro,order_info where details_pro.product_id=order_info.product_id;";
		ResultSet rs=st.executeQuery(str);
		while(rs.next())
		{
			%>
			<tr>
			<td><%=rs.getInt("product_id")%></td>
			<td><%=rs.getString("product_name")%></td>
			<td><%=rs.getString("product_discribtion")%></td>
			<td><%=rs.getString("product_price")%></td>
			<td><%=rs.getString("order_id")%></td>
			<td><%=rs.getString("order_date")%></td>
			</tr>
			<% 
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
%>
</table>
</center>
</body>
</html>