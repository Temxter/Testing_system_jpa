<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
<h3 align="center">Menu</h3>
<h4 align="center">Tests</h4>
<ol>
    <c:forEach items="{unfilledMarks}" var="mark">
        <li>
            <a href="test?id=${mark.test.id}">${mark.test.name} ${mark.date}</a>
        </li>
    </c:forEach>
</ol>

<table>
    <tr>
        <th>Test name</th>
        <th>Date</th>
        <th>Mark</th>
    </tr>

    <tr>
        <c:forEach items="{filledMarks}" var="mark">
            <td>mark.testName</td>
            <td>mark.date</td>
            <td>mark.mark</td>
        </c:forEach>
    </tr>


    <tr>
        <td>Math example</td>
        <td>20.10.1</td>
        <td>9</td>
    </tr>
</table>

<ol>
    <c:forEach items="{filledMarks}" var="mark">
        <li>
            <a href="test?id=${test.id}">${test.name}</a>
        </li>
    </c:forEach>
</ol>

<h4 align="center">Marks</h4>
</body>
</html>