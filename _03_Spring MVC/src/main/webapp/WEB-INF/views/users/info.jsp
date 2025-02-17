<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2025-02-17
  Time: 오후 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%@taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
	<title>회원 정보</title>
</head>
<body>
	<h2>회원 정보</h2>

	<c:if test="${not empty user}">
		사용자 번호 : ${user.no}<br/>
		사용자 이름 : ${user.username}<br/>
		사용자 주소 : ${user.address}<br/>
	</c:if>
	<c:if test="${empty user}">
		회원 정보가 존재하지 않습니다.
	</c:if>
</body>
</html>
