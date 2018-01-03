<html>
<body>
<%
    Integer state = (Integer) session.getAttribute("state");
    System.out.println(session);
    if (state == null) {
%>
<jsp:forward page="login.jsp"/>
<%
    }
%>
</body>
</html>