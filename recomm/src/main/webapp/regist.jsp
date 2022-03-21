<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
        <form action="student" method="post">
            <input type="text" name="func" value="regist" hidden>
            用户名:<input type="text" name="name" value=""> <br>
            密码:<input type="password" name="password"> <br>
            年龄:<input type="text" name="age" value=""> <br>
            专业:<input type="text" name="major" value=""> <br>
            邮箱:<input type="text" name="email" value=""> <br>
            手机:<input type="text" name="phone" value=""> <br>
            <input type="submit" value="登录">
        </form>
</body>
</html>