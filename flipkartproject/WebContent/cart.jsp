<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.io.*"%>
<%@page import="com.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>
<td>Mobile</td>
<td>Price</td>
</tr>
<%

ResultSet resultSet=null;
//ResultSet resultSet1=null;
int price=0;
try{
%>	
<%Connection conn=ConnectionFactory.getConnection(); 
String uname=(String)session.getAttribute("username");
    PrintWriter p=response.getWriter();
    p.print("Here is your Cart "+"  "+uname);
	String sql="select * from cart1 where username =" + "'" + uname + "'";
	Statement ps=conn.createStatement();
	//String sql1="select sum(price) from cart1 where username =" + "'" + uname + "'";
	resultSet=ps.executeQuery(sql);
	//resultSet1=ps.executeQuery(sql1);
	
	while(resultSet.next()){

%>

<tr>

<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
</tr>
<%
	}
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>
<%-- <% while(resultSet.next()){

%>
<tfoot><td><%=price %></td></tfoot>
<%
	}
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%> --%>
</table>
</body>
</html>