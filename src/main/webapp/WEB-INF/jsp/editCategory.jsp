<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="width:500px;margin:0px auto;text-align:center">


    <div style="text-align:center;margin-top:40px">

        <form method="post" action="/categories/${c.id}">
            <input type="hidden" name="_method" value="PUT">
            分类名称： <input name="name" value="${c.name}" type="text"> <br><br>
            <input type="hidden" value="${c.id}" name="id">
            <input type="submit" value="增加分类">
        </form>

    </div>
</div>


<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
         <%--pageEncoding="UTF-8" import="java.util.*" %>--%>

<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div style="width:500px;margin:0px auto;text-align:center">--%>
    <%--<form action="updateCategory" method="post">--%>
        <%--<table align='center' border='1' cellspacing='0'>--%>
            <%--<tr>--%>
                <%--<td>id</td>--%>
                <%--<td>name</td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>${category.id}<input type="hidden" name="id" value=${category.id}></td>--%>
                <%--<td><input name="name" type="text" value=${category.name}></td>--%>
            <%--</tr>--%>
        <%--</table>--%>
        <%--<input type="submit" value="更新">--%>
    <%--</form>--%>
<%--</div>--%>

<%--</body>--%>
<%--</html>--%>
