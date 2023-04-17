<%-- 
    Document   : loginjsp
    Created on : Apr 17, 2023, 9:47:25 AM
    Author     : Gatsinzi
--%>


<%@page import="Contoral.UserDao"%>
<%@page import="domain.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <%
        
     String usn;
     String password;
          usn=request.getParameter("un");
          password=request.getParameter("ps");
            User user = new UserDao().findByUsername(usn);
            if (user != null && user.getPassword().equals(password)) {
            
                out.print("welcome home");
                
            
            
            }else{
                 response.sendRedirect("login.html");
                out.print("invalid username or password");
                
               
            }
        
        %>
    </body>
</html>
