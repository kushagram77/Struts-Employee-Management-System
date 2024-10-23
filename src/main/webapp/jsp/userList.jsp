<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><${user.id}></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.phone}</td>
            <td>
                <a href="user.do?action=edit&id=${user.id}">Edit</a>
                <a href="user.do?action=delete&id=${user.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>