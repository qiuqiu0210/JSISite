<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-8-14
  Time: 上午10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
    <%--<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,600,800' rel='stylesheet' type='text/css'>--%>

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
                        <li><a href="register.action">注册</a></li>
                    </ul>
                </s:else>
            </div>
        </div>
        <nav class="navbar navbar-default nav-style">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header page-scroll">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="mynavbar-brand" href="index.html"><img src="img/JSI_logo.png" alt="Multipurpose Twitter Bootstrap Template"></a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse mainmenu" id="bs-example-navbar-collapse-1">
                    <ul>
                        <li class="page-scroll">
                            <a href="index.action">首页</a>
                        </li>
                        <li class="page-scroll">
                            <a href="features.html">实验室简介</a>
                        </li>
                        <li class="page-scroll">
                            <a href="features.html">学术研究</a>
                        </li>
                        <li class="page-scroll">
                            <a href="features.html">资源共享</a>
                        </li>
                        <li class="page-scroll">
                            <a href="features.html">教学设施</a>
                        </li>
                        <li class="page-scroll">
                            <a href="features.html">招生就业</a>
                        </li>
                        <li class="page-scroll">
                            <a href="features.html">实验室生活</a>
                        </li>
                        <li class="page-scroll">
                            <a href="features.html">个人主页</a>
                        </li>
                        <li class="page-scroll">
                            <a href="features.html">BBS论坛</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->
        </nav>
    </div>
</div>

<!-- Homepage Slider -->
<div class="homepage-slider">
    <div id="sequence">
        <ul class="sequence-canvas">
            <!-- Slide 1 -->
            <li class="bg4">
                <!-- Slide Title -->
                <h2 class="title">中德所成立典礼</h2>
                <!-- Slide Text -->
                <h3 class="subtitle">中德所于2003年10月成立，从2004年10月起依托北京航空航天大学进行管理和建设。中德所的德方对等合作伙伴是德国弗劳恩霍夫协会下属的HHI研究所。</h3>
                <!-- Slide Image -->
                <img class="slide-img" src="img/JSI_history.png" alt="Slide 1"/>
            </li>
            <!-- End Slide 1 -->
            <!-- Slide 2 -->
            <li class="bg3">
                <!-- Slide Title -->
                <h2 class="title">瑞士洛桑联邦理工学院的Babak Falsafi教授来访</h2>
                <!-- Slide Text -->
                <h3 class="subtitle">Babak Falsafi教授（瑞士洛桑联邦理工教授、卡耐基梅隆大学教授，IEEE Fellow）来访我所，并为大家开设题为“Future Server Processor & Memory Architecture”的系列讲座。</h3>
                <!-- Slide Image -->
                <img class="slide-img" src="img/Babak-Falsafi.png" alt="Slide 2" />
            </li>
            <!-- End Slide 2 -->
            <!-- Slide 3 -->
            <li class="bg1">
                <!-- Slide Title -->
                <h2 class="title">Intel并行编程大赛</h2>
                <!-- Slide Text -->
                <h3 class="subtitle">“2014全国并行应用挑战赛”(Parallel Application Challenge 2014，PAC2014)自2013年开始举办，旨在寻找行业最佳并行应用，推进超算助力中国创造。</h3>
                <!-- Slide Image -->
                <img class="slide-img" src="img/Parallel.png" alt="Slide 3" />
            </li>
            <!-- End Slide 3 -->
        </ul>
        <div class="sequence-pagination-wrapper">
            <ul class="sequence-pagination">
                <li>1</li>
                <li>2</li>
                <li>3</li>
            </ul>
        </div>
    </div>
</div>
<!-- End Homepage Slider -->
<%--<s:action name="index" namespace="/" />--%>
<%--<s:set name="NEWS" value="${newsList[0]}"/>--%>
<%--<s:property value="#NEWS.newsTitle"/>--%>
<!-- Services -->
<div class="section">
    <div class="container">
        <h2><a href="#">新闻News</a></h2>
        <div class="row">
            <s:iterator id="news" value="#session.newsList" status="st">
                <s:set name="count" value="#st.count-1"/>
                <s:if test="#count>#session.newsList.size()-4">
                    <div class="col-md-4 col-sm-6">
                        <div class="service-wrapper">
                                <%--<h1>${count}</h1>--%>
                            <img src="${news.newsPhoto}" alt="Service 1">
                            <h3>${news.newsTitle}</h3>
                            <p>${news.newsContent}</p>
                            <a href="#" class="btn">Read more</a>
                        </div>
                    </div>
                </s:if>
            </s:iterator>
        </div>
    </div>
</div>
<!-- End Services -->


<!-- Testimonials -->
<div class="section">
    <div class="container">
        <h2><a href="#">近期公告</a></h2>
        <div class="row">
            <!-- Pricing Plans Wrapper -->
            <div class="col-md-12">
                <!-- Pricing Plan -->
                <div class="bulletin">
                    <!-- Pricing Plan Ribbon -->
                    <div class="ribbon-wrapper">
                        <div class="notice-ribbon ribbon-red">特别关注</div>
                    </div>
                    <h2 class="notice-type">讲 座</h2>
                    <%--<p class="pricing-plan-price">FREE</p>--%>
                    <!-- Pricing Plan Features -->
                    <div class="row">
                        <div class="col-md-12 notice-content">
                            <p>8月21日上午9点半，Intel MIC方面的专家来411与大家交流，相关的同学请按时参会
                            </p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12 notice-time">
                            <a><strong>2014/8/20 16:00</strong></a>
                        </div>
                    </div>
                </div>
                <!-- End Pricing Plan -->
                <div class="bulletin">
                    <div class="ribbon-wrapper">
                        <div class="notice-ribbon ribbon-green">最新发布</div>
                    </div>
                    <h2 class="notice-type">体育活动</h2>
                    <%--<p class="pricing-plan-price">$49<span>/mo</span></p>--%>
                    <div class="row">
                        <div class="col-md-12 notice-content">
                            <p>8月23日晚9点-10点，羽毛球，体育馆副馆20,21号场地，欢迎大家踊跃参加
                            </p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12 notice-time">
                            <a><strong>2014/8/21 20:00</strong></a>
                        </div>
                    </div>
                </div>
                <!-- Promoted Pricing Plan -->
                <div class="bulletin">
                    <h2 class="notice-type">实验室日常</h2>
                    <%--<p class="pricing-plan-price">$49<span>/mo</span></p>--%>
                    <div class="row">
                        <div class="col-md-12 notice-content">
                            <p>8月23日晚10点-10点半，新主楼G座断电，请大家提前做好准备
                            </p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12 notice-time">
                            <a><strong>2014/8/20 16:00</strong></a>
                        </div>
                    </div>
                </div>
                <div class="bulletin">
                    <div class="ribbon-wrapper">
                        <div class="notice-ribbon ribbon-blue">重要通知</div>
                    </div>
                    <h2 class="notice-type">其他</h2>
                    <%--<p class="pricing-plan-price">$49<span>/mo</span></p>--%>
                    <div class="row">
                        <div class="col-md-12 notice-content">
                            <p>“2014全国并行应用挑战赛”提交初赛资料的截止时间延长至：8月31日
                            </p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12 notice-time">
                            <a><strong>2014/8/20 16:00</strong></a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- End Pricing Plans Wrapper -->
        </div>
    </div>
</div>
<!-- End Testimonials -->

<!-- Pricing Table -->
<div class="section">
    <div class="container">
        <h2 >个人主页</h2>
        <div class="row">
            <!-- Testimonial -->
            <div class="testimonial col-md-4 col-sm-6">
                <!-- Author Photo -->
                <div class="author-photo">
                    <img src="img/user1.jpg" alt="Author 1">
                </div>
                <div class="testimonial-bubble">
                    <blockquote>
                        <!-- Quote -->
                        <p class="quote">
                            "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut."
                        </p>
                        <!-- Author Info -->
                        <cite class="author-info">
                            - Name Surname,<br>Managing Director at <a href="#">Some Company</a>
                        </cite>
                    </blockquote>
                    <div class="sprite arrow-speech-bubble"></div>
                </div>
            </div>
            <!-- End Testimonial -->
            <div class="testimonial col-md-4 col-sm-6">
                <div class="author-photo">
                    <img src="img/user5.jpg" alt="Author 2">
                </div>
                <div class="testimonial-bubble">
                    <blockquote>
                        <p class="quote">
                            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo."
                        </p>
                        <cite class="author-info">
                            - Name Surname,<br>Managing Director at <a href="#">Some Company</a>
                        </cite>
                    </blockquote>
                    <div class="sprite arrow-speech-bubble"></div>
                </div>
            </div>
            <div class="testimonial col-md-4 col-sm-6">
                <div class="author-photo">
                    <img src="img/user2.jpg" alt="Author 3">
                </div>
                <div class="testimonial-bubble">
                    <blockquote>
                        <p class="quote">
                            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
                        </p>
                        <cite class="author-info">
                            - Name Surname,<br>Managing Director at <a href="#">Some Company</a>
                        </cite>
                    </blockquote>
                    <div class="sprite arrow-speech-bubble"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Pricing Table -->

<!-- Our Clients -->
<div class="section">
    <div class="container">
        <h2>Our Clients</h2>
        <div class="clients-logo-wrapper text-center row">
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/canon.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/cisco.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/dell.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/ea.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/ebay.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/facebook.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/google.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/hp.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/microsoft.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/mysql.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/sony.png" alt="Client Name"></a></div>
            <div class="col-lg-1 col-md-1 col-sm-3 col-xs-6"><a href="#"><img src="img/logos/yahoo.png" alt="Client Name"></a></div>
        </div>
    </div>
</div>
<!-- End Our Clients -->

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
<%--<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>--%>
<script>window.jQuery || document.write('<script src="js/jquery-1.9.1.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js"></script>
<%--<script src="http://cdn.leafletjs.com/leaflet-0.5.1/leaflet.js"></script>--%>
<script src="js/jquery.fitvids.js"></script>
<script src="js/jquery.sequence-min.js"></script>
<script src="js/jquery.bxslider.js"></script>
<script src="js/main-menu.js"></script>
<script src="js/template.js"></script>

</body>
</html>