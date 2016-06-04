<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="initial-scale=1.0,user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>百度地图上的标记</title>
<style type="text/css">
html {
	height: 100%;
}

body {
	height: 100%;
	margin: 0px;
	padding: 0px;
}

#container {
	height: 100%;
}
</style>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=G1PgC4b5pz7fmfEdNFilQlX8">
</script>
<c:set value="${pageContext.request.contextPath}" var="path"
	scope="page" />
<script type="text/javascript" src="${path}/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="${path}/js/map.js"></script>
</head>
<body>
	<div id="container"></div>
	<!--<s:form id="ll">
		<s:textarea id="leftLng" name="bounds.leftLng"></s:textarea>
		<s:textarea id="rightLng" name="bounds.rightLng"></s:textarea>
		<s:textarea id="upLat" name="bounds.upLat"></s:textarea>
		<s:textarea id="downLat" name="bounds.downLat"></s:textarea>
	</s:form>-->
</body>
</html>