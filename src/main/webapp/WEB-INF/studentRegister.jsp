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
			Full Name : <html:input path="name"/>
			Email : <html:input path="mail"/>
			Password : <html:input path="password"/>
			<input type="submit" value="Register">
	</html:form>
</body>
</html>



<%-- <form action="studentRegister.htm" method="post">
		Full Name : <input type="text" name="name" value="${register.name}"> Mail : <input
			type="text" name="mail" value="${register.mail}"> Password : <input
			type="password" name="password"> <input type="submit"
			value="Register">
	</form> --%>