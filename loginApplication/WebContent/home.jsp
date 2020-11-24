<%@page import="com.jbk.servlet.Student"%>
<%@page import="java.util.ArrayList"%>

<table border="3">
	<tr>
		<th>Student Name</th>
		
	</tr>
	<%
		ArrayList<Student> empList = (ArrayList<Student>) request.getAttribute("data");

		for (Student stu : empList) {
	%>
	<tr>

	
		<td>
			<%
				out.print(stu.sname);
			%>
		</td>
	
	</tr>
	<%
		}
	%>
</table>