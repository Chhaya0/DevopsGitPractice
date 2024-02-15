<!-- WebContent/WEB-INF/templates/address/list.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
        <c:forEach var="address" items="${addresses}">
            <tr>
                <td>${address.name}</td>
                <td>${address.email}</td>
                <td>${address.phone}</td>
            </tr>
        </c:forEach>
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