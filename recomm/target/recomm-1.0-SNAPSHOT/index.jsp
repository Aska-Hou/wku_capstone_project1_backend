<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% String path=request.getScheme()+"://"+request.getServerName()+":"+
        request.getServerPort()+request.getContextPath()+"/";
    pageContext.setAttribute("path", path);%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
        <form action="${path}/student/login" method="post">
            用户名:<input type="text" name="name" value=""> <br>
            密码:<input type="password" name="password"> <br>
            <input type="submit" value="登录">
        </form>
</body>
</html>