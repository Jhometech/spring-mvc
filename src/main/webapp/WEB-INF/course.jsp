<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<html>
<body>
	<jsp:include page="../index.jsp" />
	<h2>Add Course</h2>
	<html:form action="course.htm" method="post" modelAttribute="course"> 
			Course Name : <html:input path="name" />
			Cost : <html:input path="cost" />
		<input type="submit" value="Add Couse">
	</html:form>
</body>
</html>