<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.hd123.h4.wangguoqiTest.about.*"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
  String strVersion = McDtsAbout.getInstance().getVersion().toString();
  String strLocaleTitle = McDtsAbout.getInstance().getLocaleTitle();
  String strCopyRight = McDtsAbout.getInstance().getCopyright();
  String strSite = McDtsAbout.getInstance().getSite();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title><%=strLocaleTitle%></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="home page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	
  <div id="container" style="width:100%;background-color:#F0FFFF;font-family:微软雅黑;color:blue;">
	
	<br>
	<p style="background-color:#F0FFFF;font-family:微软雅黑;color:blue;font-size:30px;">
		您好，欢迎使用
		这是登陆页面
		！
	</p>
	<br>
	<br>
	
	<br>
	<br>
	<ul>
		<li>
			<p>当前程序版本：7788</p>
		</li> 
	</ul>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<p style="background-color:#F0FFFF;font-family:微软雅黑;color:red;font-size:15px;text-align:center;">
		<%=strCopyRight%>
	</p>
	<p style="background-color:#F0FFFF;font-family:微软雅黑;color:red;font-size:15px;text-align:center;">
		<a href="<%=strSite%>" target="_blank"><%=strSite%></a>
	</p>
	   <form action="login.do" method="post">
      <table>
         <tr>
            <td> 用户名：</td>
            <td><input type="text" name="username"/></td>
         </tr>
         <tr>
            <td> 密码：</td>
            <td><input type="password" name="password"/></td>
         </tr>
         <tr>
            <td colspan="2" align="center">
                <input type="submit" value=" 登录 "/>
                <input type="reset" value=" 重置 "/>
            </td>
         </tr>
      </table>
   </form>
</body>
</html>
