<!--  //we need to write here java code.. 
//HTML file does not support java
//there fore we need to convert this file to jsp 
Login page

-->
<font color="red"> <%
 	if (request.getAttribute("msg") != null) {
 		out.println(request.getAttribute("msg"));
 	}
 %>
</font>
<form action="lllllllllllllll" method="post">
	User Name : <input type="text" name="username" /> <br> <br>
	<input type="submit" value="Click Here To Login" />
</form>
