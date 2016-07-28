<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<html>
<body>
<jsp:include page="../index.jsp"/>
	<h2>Register Student</h2>
	<%
		String msg = (String)request.getAttribute("message");
	    if(msg != null){
	    	out.print(msg);
	    }
	%>
	<html:form action="studentRegister.htm" method="post" modelAttribute="register"> 
		
			Full Name : <html:input path="name"/> <html:errors path="name"/><br>
			Email : <html:input path="mail"/><html:errors path="mail"/><br>
			Password : <html:input path="password"/><html:errors path="password"/><br>
			<input type="submit" value="Register"><br>
	</html:form>
</body>
</html>



<%-- <form action="studentRegister.htm" method="post">
		Full Name : <input type="text" name="name" value="${register.name}"> Mail : <input
			type="text" name="mail" value="${register.mail}"> Password : <input
			type="password" name="password"> <input type="submit"
			value="Register">
	</form> --%>