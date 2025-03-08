<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
<%@page import="com.MvcServletModel.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <% List<Employee> employees = (List<Employee>)request.getAttribute("employee");
	    
	 %>
	 
 <table border="1" style="width: 25%">
  <thead>
   <tr>
    <th>ID</th>
    <th>First Name</th>
    <th>Last Name</th>
   </tr>
   
  <% for(Employee employee : employees){ %>
   <tr>
    <td><%=employee.getId()%></td>
    <td><%=employee.getFirstName()%></td>
    <td><%=employee.getLastName()%></td>
   </tr>
   <%} %>
  </thead>
  <tbody>
   
  </tbody>

 </table>
</body>
</html>