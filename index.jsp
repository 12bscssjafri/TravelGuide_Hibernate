<%-- 
    Document   : index
    Created on : Apr 22, 2015, 9:52:11 AM
    Author     : It Store
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action='http://localhost:8080/TravelGuide/GetRoute' >
                        <div >
                           <input type="text" name="source" >
                           <input type="text" name="dest">
                       </div>
                        <button type="submit" value="check!" class="btn btn-default">
                                
                           </button>
      </form>
        
    </body>
</html>
