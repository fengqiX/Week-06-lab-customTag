<%-- 
    Document   : login
    Created on : Sep 18, 2017, 5:55:28 PM
    Author     : 715583
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="sait" %>
<%@taglib uri="/WEB-INF/sait.tld" prefix="dt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remember Me Login Page</title>
    </head>
    <body>
        
        <dt:debug>
	Remote Host: ${pageContext.request.remoteHost}<br />
	Session ID: ${pageContext.session.id}
        </dt:debug>

        <h1>Login</h1>
        <sait:login></sait:login>
    </body>
</html>
