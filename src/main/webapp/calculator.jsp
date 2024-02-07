<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator JSP</title>
</head>
<body>
    <form action="calculator" method="post">
        Enter number 1: <input type="number" name="num1" required><br>
        Enter number 2: <input type="number" name="num2" required><br>
        Select operation:
        <select name="operator">
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
        </select><br>
        <input type="submit" value="Calculate">
    </form>
</body>
</html>
