<%-- 
    Document   : registeruser
    Created on : Apr 12, 2023, 12:09:28 AM
    Author     : Gatsinzi
--%>

<%@page import="Contoral.UserDao"%>
<%@page import="domain.Gender"%>
<%@page import="domain.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
%>
<jsp:useBean id="doauser"  class="Contoral.UserDao"/>
<jsp:useBean  id="usermo"  class="domain.User"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        usermo = new User();
        String fin,lan,usn,paw,ge,ph;
         fin = request.getParameter("fn");
         lan =request.getParameter("ln");
         usn=request.getParameter("un");
         paw=request.getParameter("ps");
         ge=request.getParameter("sel");
         ph=request.getParameter("pn");
         usermo.setUsername(usn);
          usermo.setPassword(paw);
        usermo.setFirstName(fin);
        usermo.setLastName(lan);
        usermo.setGender(Gender.MALE);
        usermo.setPhone(ph);
       doauser =new UserDao();
       doauser.create(usermo);
       out.print("You are successfully registered");  
       
      
       
        
        %> 
    </body>
</html>
