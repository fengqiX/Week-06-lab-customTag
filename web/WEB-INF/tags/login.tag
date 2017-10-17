<%-- 
    Document   : login
    Created on : Oct 17, 2017, 12:38:18 PM
    Author     : 715583
--%>

<%@tag description="a basic login section" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>

<%-- any content can be specified here e.g.: --%>
 <form action="login" method="post">
            <p>Username:<input type="text" name="Uname" value="${user.username}"></p>
            <p>Password:<input type="password" name="Pword" value="${user.password}"></p>
            <input type="submit" value="Login">
            <p><input type="checkbox" name="rememberme">Remember me</p>
        </form>
            ${display}