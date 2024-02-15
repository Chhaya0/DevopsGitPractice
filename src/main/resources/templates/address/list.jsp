<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.Address" %>
<%@ page import="java.util.Iterator" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Address Book</title>
</head>
<body>
    <h2>Address List</h2>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
        </tr>
        <% 
            List<Address> addresses = (List<Address>) request.getAttribute("addresses");
            if (addresses != null) {
                Iterator<Address> iterator = addresses.iterator();
                while (iterator.hasNext()) {
                    Address address = iterator.next();
        %>
                    <tr>
                        <td><%= address.getName() %></td>
                        <td><%= address.getEmail() %></td>
                        <td><%= address.getPhone() %></td>
                    </tr>
        <%
                }
            }
        %>
    </table>
    <br>
    <form action="${pageContext.request.contextPath}/addresses" method="post">
        <label>Name: </label>
        <input type="text" name="name" required><br>
        <label>Email: </label>
        <input type="email" name="email" required><br>
        <label>Phone: </label>
        <input type="tel" name="phone" required><br>
        <input type="submit" value="Add Address">
    </form>
</body>
</html>
