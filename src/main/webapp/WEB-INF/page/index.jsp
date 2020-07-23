<%--
  Created by IntelliJ IDEA.
  User: 龙勇华
  Date: 2020/4/7
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="../include/publicMeta.jsp"%>
<%@include file="../include/publicHeader.jsp"%>
<%@include file="../include/publicMenu.jsp"%>


<section class="Hui-article-box">
    <nav class="breadcrumb"><i class="Hui-iconfont"></i> <a href="/index" class="maincolor">首页</a>
        <span class="c-999 en">&gt;</span>
        <span class="c-666">我的桌面</span>
        <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
    <div class="Hui-article">
        <article class="cl pd-20">
            <p class="f-20 text-success">欢迎使用时光点餐平台</p>
        </article>

        <footer class="footer">
            <p><br> <br> <a href="http://www.h-ui.net/" target="_blank" title=""></a></p>
        </footer>
    </div>
</section>

<%@include file="../include/publicFooter.jsp"%>
</body>
</html>