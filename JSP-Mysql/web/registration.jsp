<%-- 
    Document   : registration
    Created on : Mar 1, 2022, 12:20:22 PM
    Author     : Zulkifal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <h1>
                    Register Account</h1>
                <form action="RegisterServlet" method="post">
                    <p>Client Name</p>
                    <input type="text" placeholder="Client Name" name="name" required>
                    <p>Client Email</p>
                    <input type="text" placeholder="Client Email" name="email" required> 
                    <p>Client Address</p>
                    <input type="text" placeholder="Client Address" name="address" required>
                    <p>Client Company Name</p>
                    <input type="text" placeholder="Client Company Name" name="companyname" required>
                    <p>Client Start Date</p>
                    <input type="text" placeholder="Client Joining Date" name="startdate" required>
                    
<!--                    <p>Password</p>
                    <input type="password" placeholder="Password" name="password" required>-->
                    
                    
                    
                    <input type="submit" value="Register">
                    <a href="index.jsp">Already have Account?</a>
                </form>
            </div>
        </div>
    </body>
</html>
