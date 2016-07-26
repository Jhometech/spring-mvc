<%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<%@page import="java.util.List"%>
<html>
<body>
	<h2>Search Employee</h2>
	<form action="searchEmp.htm" method="get">
		Employee Name : <input type="text" name="empoyeeName">
		<input type="submit" value="Search">
	</form>
	
	<%
	    List<String> result = (List<String>)request.getAttribute("result");
		if(result != null){
			out.print("<h3>Search Results</h3>");
			for(String s : result){
				out.print(s+"<br/>");
			}
		}
	%>
</body>
</html>