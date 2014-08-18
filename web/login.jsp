<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-8-14
  Time: 上午11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>中德联合软件技术研究所</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/icomoon-social.css">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,600,800' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="css/leaflet.css" />
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="css/leaflet.ie.css" />
    <![endif]-->
    <link rel="stylesheet" href="css/main.css">

    <script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
<!--[if lt IE 7]>
<p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
<![endif]-->
<s:set name="username" value="#session.SESSION_KEY_USER_NAME"/>

<!-- Navigation & Logo-->
<div class="mainmenu-wrapper">
    <div class="container">
        <div class="menuextras">
            <div class="extras">
                <s:if test="#username!=null">
                    <ul>
                        <li>欢迎您：<s:property value="#username"/></li>
                        <li><a href="Logout.action">退出</a></li>
                    </ul>
                </s:if>
                <s:else>
                <ul>
                    <li><a href="Login.action">登录</a></li>
                    <li><a href="page-register.html">注册</a></li>
                </ul>
                </s:else>
            </div>
        </div>
        <nav id="mainmenu" class="mainmenu">
            <ul>
                <li class="active">
                    <a href="index.action">首页</a>
                </li>
                <li>
                    <a href="features.html">实验室简介</a>
                </li>
                <li>
                    <a href="features.html">学术研究</a>
                </li>
                <li>
                    <a href="features.html">资源共享</a>
                </li>
                <li>
                    <a href="features.html">教学设施</a>
                </li>
                <li>
                    <a href="features.html">招生就业</a>
                </li>
                <li>
                    <a href="features.html">实验室生活</a>
                </li>
                <li>
                    <a href="features.html">个人主页</a>
                </li>
                <li>
                    <a href="features.html">BBS论坛</a>
                </li>
            </ul>
        </nav>
    </div>
</div>

<!-- Page Title -->
<div class="section section-breadcrumbs">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1>Login</h1>
            </div>
        </div>
    </div>
</div>

<div class="section">
    <div class="container">
        <div class="row">
            <div class="col-sm-5">
                <div class="basic-login">
                    <s:if test="#username!=null">
                        <div>
                            欢迎您：
                            <s:property value="#username"/>
                            <ul>
                                <a href="Logout.do">退出</a>
                            </ul>
                        </div>
                    </s:if>
                    <s:else>
                        <form action="Login">
                            <div class="form-group">
                                <label for="username"><i class="icon-user"></i> <b>Username or Email</b></label>
                                <input class="form-control" id="username" name="username" type="text" placeholder="">
                            </div>
                            <div class="form-group">
                                <label for="password"><i class="icon-lock"></i> <b>Password</b></label>
                                <input class="form-control" id="password" name="password" type="password" placeholder="">
                            </div>
                            <div class="form-group">
                                <label class="checkbox">
                                    <input name="remember" type="checkbox"> Remember me
                                </label>
                                <a href="page-password-reset.html" class="forgot-password">Forgot password?</a>
                                <button type="submit" class="btn pull-right">Login</button>
                                <div class="clearfix"></div>
                            </div>
                        </form>
                    </s:else>
                </div>
            </div>
            <div class="col-sm-7 social-login">
                <p>Or login with your Facebook or Twitter</p>
                <div class="social-login-buttons">
                    <a href="#" class="btn-facebook-login">Login with Facebook</a>
                    <a href="#" class="btn-twitter-login">Login with Twitter</a>
                </div>
                <div class="clearfix"></div>
                <div class="not-member">
                    <p>Not a member? <a href="page-register.html">Register here</a></p>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Footer -->
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="col-footer col-md-3 col-xs-6">
                <h3>Our Latest Work</h3>
                <div class="portfolio-item">
                    <div class="portfolio-image">
                        <a href="page-portfolio-item.html"><img src="img/portfolio6.jpg" alt="Project Name"></a>
                    </div>
                </div>
            </div>
            <div class="col-footer col-md-3 col-xs-6">
                <h3>Navigate</h3>
                <ul class="no-list-style footer-navigate-section">
                    <li><a href="page-blog-posts.html">Blog</a></li>
                    <li><a href="page-portfolio-3-columns-2.html">Portfolio</a></li>
                    <li><a href="page-products-3-columns.html">eShop</a></li>
                    <li><a href="page-services-3-columns.html">Services</a></li>
                    <li><a href="page-pricing.html">Pricing</a></li>
                    <li><a href="page-faq.html">FAQ</a></li>
                </ul>
            </div>

            <div class="col-footer col-md-4 col-xs-6">
                <h3>Contacts</h3>
                <p class="contact-us-details">
                    <b>Address:</b> 123 Fake Street, LN1 2ST, London, United Kingdom<br/>
                    <b>Phone:</b> +44 123 654321<br/>
                    <b>Fax:</b> +44 123 654321<br/>
                    <b>Email:</b> <a href="mailto:getintoutch@yourcompanydomain.com">getintoutch@yourcompanydomain.com</a>
                </p>
            </div>
            <div class="col-footer col-md-2 col-xs-6">
                <h3>Stay Connected</h3>
                <ul class="footer-stay-connected no-list-style">
                    <li><a href="#" class="facebook"></a></li>
                    <li><a href="#" class="twitter"></a></li>
                    <li><a href="#" class="googleplus"></a></li>
                </ul>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="footer-copyright">&copy; 2013 mPurpose. All rights reserved.</div>
            </div>
        </div>
    </div>
</div>

<!-- Javascripts -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/jquery-1.9.1.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js"></script>
<script src="http://cdn.leafletjs.com/leaflet-0.5.1/leaflet.js"></script>
<script src="js/jquery.fitvids.js"></script>
<script src="js/jquery.sequence-min.js"></script>
<script src="js/jquery.bxslider.js"></script>
<script src="js/main-menu.js"></script>
<script src="js/template.js"></script>

</body>
</html>