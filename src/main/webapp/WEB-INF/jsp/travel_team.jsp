<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>旅游攻略,自由行,自助游攻略,旅游社交分享网站 - 马蜂窝</title>
    <meta name="keywords" content="自由行,旅游攻略,自助游"/>
    <meta name="description" content="马蜂窝!靠谱的旅游攻略,自由行,自助游分享社区,海量旅游景点图片、游记、交通、美食、购物等自由行旅游攻略信息,马蜂窝旅游网获取自由行,自助游攻略信息更全面"/>
    <meta name="author" content="马蜂窝"/>
    <meta name="renderer" content="webkit"/>
    <meta property="qc:admins" content="1571256654651656777636"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/reset.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/main.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/css_new.css">
    <link rel="shortcut icon" href="http://www.yilvcheng.com/favicon.ico">
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.9.1.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/new.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/common.js" type="text/javascript"></script>
    <!--[if lt ie 9]>
    <script src="${pageContext.request.contextPath}/static/js/html5.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/respond.min.js"></script>
    <![endif]-->
    <script>
        function formatFloat(src, pos)
        {
            return Math.round(src*Math.pow(10, pos))/Math.pow(10, pos);
        }
        function dateToTimestamp(date){
            format_date_str = date.replace(/-/g,'/');
            format_date = new Date(format_date_str);
            timestamp = format_date.getTime();
            return timestamp;
        }
        function  DateDiff(strDateStart,strDateEnd){    //sDate1和sDate2是2006-12-18格式
            var strSeparator = "-"; //日期分隔符
            var oDate1;
            var oDate2;
            var iDays;
            oDate1= strDateStart.split(strSeparator);
            oDate2= strDateEnd.split(strSeparator);
            var strDateS = new Date(oDate1[0], oDate1[1]-1, oDate1[2]);
            var strDateE = new Date(oDate2[0], oDate2[1]-1, oDate2[2]);
            iDays = parseInt(Math.abs(strDateS - strDateE ) / 1000 / 60 / 60 /24)//把相差的毫秒数转换为天数
            return iDays ;
        }

        function delete_confirm(url){
            if(confirm("您确定删除吗")){
                location.href=url;
            }
        }
    </script>
    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "//hm.baidu.com/hm.js?6da04f074a509ba9202041a80bc21e65";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
    <link rel="stylesheet" type="text/css" href="../../static/css/sub.css" />
    <style type="text/css">.pro-detail{border:#ddd solid 1px;} </style>
    <script type="text/javascript">
        window.Env = {
            "WWW_HOST": "www.mafengwo.cn",
            "IMG_HOST": "images.mafengwo.net",
            "W_HTTP": "http:\/\/w.mafengwo.cn",
            "P_HOST": "passport.mafengwo.cn",
            "P_HTTP": "https:\/\/passport.mafengwo.cn",
            "PAGELET_HTTP": "http:\/\/pagelet.mafengwo.cn",
            "JS_HOST": "js.mafengwo.net",
            "TONGJI_HOST": "tongji.mafengwo.cn",
            "UID": 0,
            "CSTK": "d45c9bc62485390790f981a018e3825f_4845fdb93a24524340c02fcff6eddf13",
            "GOOGLE_MAP_KEY": "AIzaSyD-Su0x_rPy1xehlMBcMyTqWkU49Bk53nQ"
        };
    </script>

    <link href="static/css/css+mfw-header.2015^ylvs^1527308432.css" rel="stylesheet" type="text/css"/>

    <link href="static/css/css+hotel+datepicker-range^zfm^1525846268.css" rel="stylesheet" type="text/css"/>


    <script language="javascript" src="static/js/js+advert+inspector^alw^1536006240.js" type="text/javascript"
            crossorigin="anonymous"></script>
</head>
<body>
<!-- 头部-->
<%--<header>--%>
    <%--<dl>--%>
        <%--<dt>--%>
            <%--<span>你好，欢迎来到壹旅程</span>--%>
            <%--<a href="http://www.yilvcheng.com/Account/login.html">请登录</a><a href="http://www.yilvcheng.com/Account/regist/f/top.html">免费注册</a>        </dt>--%>
        <%--<dd>--%>
            <%--<a href="http://www.yilvcheng.com/Customer/center.html" >我的壹旅程</a>--%>
            <%--<a href="http://www.yilvcheng.com/Customer/orders.html">我的订单</a>--%>
            <%--<a href="http://www.yilvcheng.com/Customer/couponslist.html" style="color: #ff924c;" target="_blank">我的优惠券</a>--%>
            <%--<!--<a href="http://www.yilvcheng.com/Customer/post.html">我的帖子</a>--%>
            <%--<a href="http://www.yilvcheng.com/Customer/publish.html">发布帖子</a>-->--%>
            <%--<a href="http://www.yilvcheng.com/Information/bzzx.html" target="_blank">帮助中心</a>--%>
        <%--</dd>--%>
    <%--</dl>--%>
<%--</header>--%>
<%--<article class="topnew">--%>
        <%--<section class="f-cb">--%>
        <%--<div title="壹旅程"><a href="http://www.yilvcheng.com" title="壹旅程"><img src="${pageContext.request.contextPath}/static/picture/logo.png"></a></div>--%>
        <%--<hgroup>--%>
            <%--<form name="searchForm" method="get" action="http://www.yilvcheng.com/search/index.html">--%>
                <%--<div class="box f-cb">--%>
                    <%--<input type="text" name="keyword" id="name"  value="搜索目的地/攻略/酒店/产品或帖子编号" class="search">--%>
                    <%--<input type="submit" class="so_new" value="搜索">--%>
                <%--</div>--%>
                <%--<div class="tips">--%>
                    <%--<a href="http://www.yilvcheng.com/zhuti/cuofeng.html">错峰</a><a href="http://www.yilvcheng.com/huizhan/">会展</a><a href="http://www.yilvcheng.com/Search/post/%25E6%25B0%2591%25E5%25AE%25BF%25E6%258E%25A8%25E8%258D%2590.html">民宿推荐</a><a href="http://www.yilvcheng.com/Search/products/%25E4%25BA%25B2%25E5%25AD%2590.html">亲子出行</a><a href="http://www.yilvcheng.com/Search/products/%25E9%2587%258F%25E5%25AD%2590.html">量子号</a><a href="http://www.yilvcheng.com/Search/products/%25E8%25B5%259B%25E7%2590%25B3%25E5%25A8%259C.html">赛琳娜</a><a href="http://www.yilvcheng.com/Search/products/%25E5%2596%259C%25E6%2582%25A6.html">喜悦号</a><a href="http://www.yilvcheng.com/Search/products/%25E7%25BA%25AF%25E7%258E%25A9/city/%E4%B8%8D%E9%99%90%E5%87%BA%E5%8F%91%E5%9C%B0/cate/%E6%89%80%E6%9C%89/road/0/zone/3/">出境纯玩</a><a href="http://www.yilvcheng.com/Search/products/%25E7%25BA%25AF%25E7%258E%25A9/city/%E4%B8%8D%E9%99%90%E5%87%BA%E5%8F%91%E5%9C%B0/cate/%E6%89%80%E6%9C%89/road/0/zone/2/">国内纯玩</a><a href="http://www.yilvcheng.com/products/index.html?cate=6&city=&zone=&road=0">自驾酒店套餐</a><a href="http://www.yilvcheng.com/Search/products/%25E6%25B7%25B1%25E5%25BA%25A6%25E6%25B8%25B8.html">深度游系列</a><a href="http://www.yilvcheng.com/Search/products/%25E5%2586%25AC%25E4%25BB%25A4%25E8%2590%25A5.html">冬令营</a><a href="http://www.yilvcheng.com/products/index.html?cate=1&city=&zone=&road=0">自由行</a><a href="http://www.yilvcheng.com/Search/products/%25E6%2598%25A5%25E8%258A%2582.html">春节预售</a>                </div>--%>
            <%--</form>--%>
        <%--</hgroup>--%>
        <%--<p><img src="${pageContext.request.contextPath}/static/picture/phone.png"></p>--%>
    <%--</section>--%>
<%--</article>--%>
<%--<nav>--%>
    <%--<ul>--%>
        <%--<li><a href="http://www.yilvcheng.com">首页</a></li>--%>

        <%--<li><a href="http://www.yilvcheng.com/products/" class="click">产品</a></li>--%>

        <%--<li><em class="hot"></em><a href="http://www.yilvcheng.com/zhuti/" >当季最热</a></li>--%>

        <%--<li><a href="http://bbs.yilvcheng.com" >社区</a></li>--%>

        <%--<li><em class="sale"></em><a href="http://www.yilvcheng.com/products/tejia/" >特价</a></li>--%>

        <%--<li><a href="http://www.yilvcheng.com/dest/" >目的地</a></li>--%>

        <%--<li>--%>
            <%--<em class="new"></em>--%>
            <%--<a href="http://www.yilvcheng.com/huizhan/">会展服务</a>--%>
        <%--</li>--%>
    <%--</ul>--%>
<%--</nav>--%>
<div id="header" xmlns="http://www.w3.org/1999/html">
    <div class="mfw-header">
        <div class="header-wrap clearfix">
            <div class="head-logo"><a class="mfw-logo" title="马蜂窝自由行" href="http://www.mafengwo.cn/"></a></div>
            <ul class="head-nav" data-cs-t="headnav" id="_j_head_nav">
                <li class="head-nav-index" data-cs-p="index"><a href="http://www.mafengwo.cn/">首页</a></li>
                <li class="head-nav-place" data-cs-p="mdd"><a href="http://www.mafengwo.cn/mdd/" title="目的地">目的地</a>
                </li>
                <li class="head-nav-gonglve" data-cs-p="gonglve"><a href="http://www.mafengwo.cn/gonglve/" title="旅游攻略">旅游攻略</a>
                </li>
                <li class="head-nav-sales head-nav-dropdown _j_sales_nav_show" id="_j_nav_sales" data-cs-p="sales">
                    <a class="drop-toggle" href="http://www.mafengwo.cn/sales/"
                       style="cursor: pointer;display: block;border-bottom:0 none;" data-sales-nav="旅行商城">
                        <span>旅行商城<i class="icon-caret-down"></i></span>
                    </a>
                    <div class="dropdown-menu dropdown-sales hide _j_sales_top" id="_j_sales_panel"
                         data-cs-t="sales_nav">
                        <ul>
                            <li><a target="_blank" href="http://www.mafengwo.cn/sales/" data-sales-nav="机票＋酒店">自由行<i
                                    class="i-hot">hot</i></a></li>
                            <li><a target="_blank" href="http://www.mafengwo.cn/sales/0-0-0-0-0-0-0-0.html?group=4"
                                   data-sales-nav="跟团游">跟团游</a></li>
                            <li><a target="_blank" href="http://www.mafengwo.cn/localdeals/"
                                   data-sales-nav="当地游">当地游</a></li>
                            <li><a target="_blank" href="http://www.mafengwo.cn/flight/" data-sales-nav="国内机票">国内机票<i
                                    class="i-new">new</i></a></li>
                            <li><a target="_blank" href="http://www.mafengwo.cn/sales/visa/" data-sales-nav="签证">签证</a>
                            </li>
                            <li><a target="_blank" href="http://www.mafengwo.cn/insure/" data-sales-nav="保险">保险</a></li>
                        </ul>
                    </div>
                </li>
                <li class="head-nav-hotel" data-cs-p="hotel"><a href="http://www.mafengwo.cn/hotel/" title="酒店">酒店</a>
                </li>
                <li class="head-nav-community head-nav-dropdown _j_shequ_nav_show" id="_j_nav_community"
                    data-cs-p="community">
                    <div class="drop-toggle"><span>社区<i class="icon-caret-down"></i></span></div>
                    <!-- 社区下拉面板 begin -->
                    <div class="dropdown-panel dropdown-community hide _j_shequ_top no-image" id="_j_community_panel"
                         data-cs-t="community_nav">
                        <div class="panel-wrapper">
                            <ul class="nav-list clearfix">
                                <li class="h"><a href="http://www.mafengwo.cn/wenda/" target="_blank" title="问答"
                                                 data-cs-p="wenda">问答<i class="i-hot">hot</i></a></li>
                                <li><a href="http://www.mafengwo.cn/mall/things.php" target="_blank" title="马蜂窝周边"
                                       data-cs-p="things">马蜂窝周边<i class="i-new">new</i></a></li>
                                <li><a href="http://www.mafengwo.cn/club/" target="_blank" title="蜂首俱乐部"
                                       data-cs-p="club">蜂首俱乐部</a></li>
                                <li><a href="http://www.mafengwo.cn/together/" target="_blank" title="结伴"
                                       data-cs-p="together">结伴</a></li>
                            </ul>
                            <ul class="nav-list-sub clearfix">

                                <li><a href="http://www.mafengwo.cn/group/" target="_blank" title="马蜂窝旅行家"
                                       data-cs-p="group">小组论坛</a></li>
                                <li><a href="http://www.mafengwo.cn/rudder/" target="_blank" title="分舵同城"
                                       data-cs-p="rudder">分舵同城</a></li>
                                <li><a href="http://www.mafengwo.cn/auction/" target="_blank" title="马蜂窝拍卖行"
                                       data-cs-p="paimai">马蜂窝拍卖行</a></li>

                                <!--<li><a href="http://www.mafengwo.cn/postal/" target="_blank" title="游记纪念工厂" data-cs-p="postal">游记纪念工厂</a></li>-->
                                <li><a href="http://www.mafengwo.cn/photo_pk/prev.php" target="_blank" title="照片PK"
                                       data-cs-p="photo_pk">照片PK</a></li>
                                <li><a href="http://www.mafengwo.cn/focus/" target="_blank" title="真人兽"
                                       data-cs-p="focus">真人兽</a></li>
                                <li><a href="http://www.mafengwo.cn/mall/virtual_goods.php" target="_blank" title="道具商店"
                                       data-cs-p="virtual">道具商店</a></li>
                            </ul>
                        </div>
                    </div>

                    <!-- 社区下拉面板 end -->
                </li>
                <li class="head-nav-app" data-cs-p="app"><a href="http://www.mafengwo.cn/app/intro/gonglve.php"
                                                            title="APP">APP</a></li>
            </ul>
            <div class="head-search" data-online="1">
                <div class="head-search-wrapper">
                    <div class="head-searchform">
                        <input name="q" type="text" id="_j_head_search_input" autocomplete="off">
                        <a role="button" href="javascript:" class="icon-search" id="_j_head_search_link"></a>
                    </div>
                </div>
            </div>
            <div data-pagelet id="pagelet-block-370a195546f2e9669853a560bff9460c" class=""
                 data-api="apps:user:pagelet:pageViewHeadInfo" data-params="{&quot;type&quot;:1}" data-async="1"
                 data-controller="/js/pageletcommon/pageHeadUserInfoWWWNormal"></div>
        </div>
        <div class="shadow"></div>
    </div>

    <!-- 新自由行菜单 begin -->
    <div class="dropdown-bar" style="display: none">
        <div class="content">
            <ul class="clearfix ul-dropdown-bar" id="Js_middleNav">
                <li data-type="sales"><a href="http://www.mafengwo.cn/sales/">自由行</a></li>
                <li data-type="freewalker"><a href="http://www.mafengwo.cn/sales/0-0-0-0-0-0-0-0.html?group=4">跟团游</a>
                </li>
                <li data-type="localdeals"><a href="http://www.mafengwo.cn/localdeals/">当地游</a></li>
                <li data-type="flight"><a href="http://www.mafengwo.cn/flight/">国内机票</a></li>
                <li data-type="visa"><a href="http://www.mafengwo.cn/sales/visa/">签证</a></li>
                <li data-type="wifi"><a href="http://www.mafengwo.cn/localdeals/0-0-0-21-0-0-0-0.html">全球WiFi</a></li>
                <li data-type="cruise"><a href="http://www.mafengwo.cn/sales/0-0-0-5-0-0-0-0.html">邮轮</a></li>

                <li data-type="insurance"><a href="http://www.mafengwo.cn/insurance/">旅游保险</a></li>
            </ul>
        </div>

    </div>
    <!-- 新自由行菜单 end -->
    <script>
        //判断是否显示 下拉bar
        ;(function () {
            window.showBarFlag = true;
            var realPathName = location.pathname, $nav = $('#Js_middleNav');
            var regExp = /localdeals|sales|flight|insurance|activity/gi;
            var pathArr = realPathName.match(regExp);

            var firstSalesType = 0;
            if ([1, 3, 34, 50, 51, 52].indexOf(window.Env.salesType) > -1) {
                firstSalesType = 3
            } else if ([4, 40, 41, 42, 43, 44].indexOf(window.Env.salesType) > -1) {
                firstSalesType = 4
                //  } else if ([11, 90, 91, 92, 93, 94, 95, 96].indexOf(window.Env.salesType) > -1) {
                //    firstSalesType = 11
            } else if ([6, 30, 32, 33, 35, 36].indexOf(window.Env.salesType) > -1) {
                firstSalesType = 6
            } else if ([5].indexOf(window.Env.salesType) > -1) {
                firstSalesType = 5
            } else if ([21, 22, 70].indexOf(window.Env.salesType) > -1) {
                firstSalesType = 21
            } else if ([28, 29, 31, 99].indexOf(window.Env.salesType) > -1) {
                firstSalesType = 1
            } else {
                firstSalesType = 2
            }
            // } else if ([2, 9, 12, 13, 15, 17, 20, 21, 22, 23, 24, 25, 26, 46, 47, 48, 49, 60, 61, 62, 64, 65, 66, 67, 68, 70, 71, 72, 74, 75, 76, 77, 78, 79])

            if (window.Env.middleNavHide) {
                $('.dropdown-bar').hide();
                return;
            }
            if (realPathName == '/sales/0-0-0-5-0-0-0-0.html' || firstSalesType == 5) {
                $nav.children('[data-type="cruise"]').addClass('on');
                window.showBarFlag = false;
                $('.dropdown-bar').show();
            } else if (realPathName == '/localdeals/0-0-0-21-0-0-0-0.html' || firstSalesType == 21) {
                $nav.children('[data-type="wifi"]').addClass('on');
                window.showBarFlag = false;
                $('.dropdown-bar').show();
            } else if (window.Env.sales_title_tag == 'visa' || firstSalesType == 4) {
                $nav.children('[data-type="visa"]').addClass('on');
                window.showBarFlag = false;
                $('.dropdown-bar').show();
            } else if (window.Env.sales_title_tag == 'semi_self_service' || realPathName == '/sales/0-0-0-6-0-0-0-0.html?group=4' || firstSalesType == 6) {
                $nav.children('[data-type="freewalker"]').addClass('on');
                window.showBarFlag = false;
                $('.dropdown-bar').show();
            }
            else if (window.Env.salesType) {
                switch (firstSalesType | 0) {
                    case 1:
                    case 3:
                        $nav.children('[data-type="sales"]').addClass('on');
                        break;
                    case 2:
                        $nav.children('[data-type="localdeals"]').addClass('on');
                        break;
                    case 30:
                    case 6:
                        $nav.children('[data-type="freewalker"]').addClass('on');
                        break;
                    default:
                        $nav.children('[data-type="localdeals"]').addClass('on');
                        break;
                }
                window.showBarFlag = false;
                $('.dropdown-bar').show();
            }
            else {
                if (pathArr) {
                    if (pathArr.length == 1 && pathArr[0] != 'activity') {
                        switch (pathArr[0]) {
                            case 'localdeals':
                                $nav.children('[data-type="localdeals"]').addClass('on');
                                break;
                            case 'insurance':
                                $nav.children('[data-type="insurance"]').addClass('on');
                                break;
                            case 'sales':
                                $nav.children('[data-type="sales"]').addClass('on');
                                break;
                            case 'flight':
                                $nav.children('[data-type="flight"]').addClass('on');
                                break;
                            default:
                                break;
                        }
                        window.showBarFlag = false;
                        $('.dropdown-bar').show();
                    } else {
                        if ('activity'.indexOf(pathArr) != -1) {
                            window.showBarFlag = true;
                            $('.dropdown-bar').hide();
                        }
                    }
                }
            }
            // 点击时触发
            $('.ul-dropdown-bar > li').on('click', function () {
                $(this).addClass('on').siblings().removeClass('on');
            });
        })();

    </script>

</div>


<main>
    <!-- 大图切换 -->
    <!-- 大图切换 -->
    <hgroup id="full-screen-slider">
        <ul id="slides">
            <li style="background:url('${pageContext.request.contextPath}/static/images/5a14d6ee5f985.jpg') no-repeat center top"><a href="http://www.yilvcheng.com/zhuti/shdsn.html" title="迪士尼" target="_blank">1</a></li><li style="background:url('${pageContext.request.contextPath}/static/images/59db10da9a9ae.jpg') no-repeat center top"><a href="http://www.yilvcheng.com/zhuti/cuofeng.html" title="错峰" target="_blank">2</a></li>    </ul>
    </hgroup>

    <%--travelTeam--%>
    <menu class="product_menu">
        <ul>
            <li><a href="index">首页</a></li>
            <li>&gt;</li>
            <li><a href="travelTeamIndex">旅行团</a></li>    </ul>
    </menu>
    <article class="cotain">
        <hgroup class="pring">
            <form id="filterForm" name="filterForm" method="get" action="${pageContext.request.contextPath}/travelTeams">
                <input id="cate" type="hidden" value="" name="cate">
                <input id="city" type="hidden" value="" name="city">
                <input id="zone" type="hidden" value="" name="zone">
                <input id="road" type="hidden" value="0" name="road">
            </form>
            <ul>
                <li>
                    <dl>
                        <dt><i>目的地：</i></dt>
                        <dd>
                            <a href="travelTeams" class="current">所有</a>
                        </dd>
                        <dd id="country">
                            <!--国内-->
                            <ul class="select think country">
                                <p></p>
                                <li class="select-list">
                                    <dl>
                                        <dt class="fuqi"><a href="javascript:set_zone('北京')" >北京市</a></dt>
                                        <dd><a href="javascript:set_zone('北京')" >北京市</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('上海')" >上海市</a></dt>
                                    <dd><a href="javascript:set_zone('上海')" >上海市</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('江苏')" >江苏省</a></dt>
                                    <dd><a href="javascript:set_zone('苏州')" >苏州市</a></dd><dd><a href="javascript:set_zone('常州')" >常州市</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('浙江')" >浙江省</a></dt>
                                    <dd><a href="javascript:set_zone('金华')" >金华市</a></dd><dd><a href="javascript:set_zone('杭州')" >杭州市</a></dd><dd><a href="javascript:set_zone('慈溪')" >慈溪</a></dd><dd><a href="javascript:set_zone('建德')" >建德</a></dd><dd><a href="javascript:set_zone('临安')" >临安</a></dd><dd><a href="javascript:set_zone('安吉')" >安吉</a></dd><dd><a href="javascript:set_zone('武义')" >武义</a></dd><dd><a href="javascript:set_zone('西塘')" >西塘</a></dd><dd><a href="javascript:set_zone('绍兴')" >绍兴市</a></dd><dd><a href="javascript:set_zone('乌镇')" >乌镇</a></dd><dd><a href="javascript:set_zone('浦江')" >浦江</a></dd><dd><a href="javascript:set_zone('宁波')" >宁波市</a></dd><dd><a href="javascript:set_zone('千岛湖')" >千岛湖</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('江西')" >江西省</a></dt>
                                    <dd><a href="javascript:set_zone('上饶')" >上饶市</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('广西')" >广西壮族自治区</a></dt>
                                    <dd><a href="javascript:set_zone('北海')" >北海市</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('海南')" >海南省</a></dt>
                                    <dd><a href="javascript:set_zone('三亚')" >三亚市</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('云南')" >云南省</a></dt>
                                    <dd><a href="javascript:set_zone('香格里拉')" >香格里拉</a></dd><dd><a href="javascript:set_zone('大理')" >大理</a></dd><dd><a href="javascript:set_zone('丽江')" >丽江市</a></dd><dd><a href="javascript:set_zone('西双版纳')" >西双版纳</a></dd><dd><a href="javascript:set_zone('昆明')" >昆明市</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('甘肃')" >甘肃省</a></dt>
                                    <dd><a href="javascript:set_zone('兰州')" >兰州市</a></dd><dd><a href="javascript:set_zone('敦煌')" >敦煌</a></dd><dd><a href="javascript:set_zone('张掖')" >张掖市</a></dd><dd><a href="javascript:set_zone('嘉峪关')" >嘉峪关市</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('青海')" >青海省</a></dt>
                                    <dd><a href="javascript:set_zone('西宁')" >西宁市</a></dd>                    </dl>                </li>
                            </ul>
                            <!--国内结束-->
                            <a href="javascript:set_zone('2')" class="guonei">国内</a>            </dd>
                        <dd id="abroad">
                            <!--国外-->
                            <ul class="select think abroad" >
                                <p></p>
                                <li class="select-list">
                                    <dl>
                                        <dt class="fuqi"><a href="javascript:set_zone('东南亚')" >东南亚</a></dt>
                                        <dd><a href="javascript:set_zone('长滩')">长滩</a></dd><dd><a href="javascript:set_zone('泰国')">泰国</a></dd><dd><a href="javascript:set_zone('沙巴')">沙巴</a></dd><dd><a href="javascript:set_zone('820354')">芽庄</a></dd><dd><a href="javascript:set_zone('820307')">清迈</a></dd><dd><a href="javascript:set_zone('820309')">越南</a></dd><dd><a href="javascript:set_zone('820552')">清莱</a></dd><dd><a href="javascript:set_zone('820353')">岘港</a></dd><dd><a href="javascript:set_zone('820432')">文莱</a></dd><dd><a href="javascript:set_zone('820489')">印尼</a></dd><dd><a href="javascript:set_zone('820553')">吴哥</a></dd><dd><a href="javascript:set_zone('820302')">波德申</a></dd><dd><a href="javascript:set_zone('820313')">新加坡</a></dd><dd><a href="javascript:set_zone('820315')">马来西亚</a></dd><dd><a href="javascript:set_zone('820306')">普吉岛</a></dd><dd><a href="javascript:set_zone('820305')">巴厘岛</a></dd><dd><a href="javascript:set_zone('820311')">马六甲</a></dd><dd><a href="javascript:set_zone('820303')">曼谷</a></dd><dd><a href="javascript:set_zone('820312')">柬埔寨</a></dd><dd><a href="javascript:set_zone('820304')">芭提雅</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('日本')" >日本</a></dt>
                                    <dd><a href="javascript:set_zone('北海道')">北海道</a></dd><dd><a href="javascript:set_zone('本州')">本州</a></dd><dd><a href="javascript:set_zone('东京')">东京</a></dd><dd><a href="javascript:set_zone('大阪')">大阪</a></dd><dd><a href="javascript:set_zone('820322')">京都</a></dd><dd><a href="javascript:set_zone('820784')">富士山</a></dd><dd><a href="javascript:set_zone('820567')">奈良</a></dd><dd><a href="javascript:set_zone('820358')">长崎</a></dd><dd><a href="javascript:set_zone('820461')">神户</a></dd><dd><a href="javascript:set_zone('820321')">冲绳</a></dd><dd><a href="javascript:set_zone('820460')">佐世保</a></dd><dd><a href="javascript:set_zone('820420')">鹿儿岛</a></dd><dd><a href="javascript:set_zone('820360')">福冈</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('欧洲')" >欧洲</a></dt>
                                    <dd><a href="javascript:set_zone('意大利')">意大利</a></dd><dd><a href="javascript:set_zone('瑞士')">瑞士</a></dd><dd><a href="javascript:set_zone('德国')">德国</a></dd><dd><a href="javascript:set_zone('葡萄牙')">葡萄牙</a></dd><dd><a href="javascript:set_zone('820348')">芬兰</a></dd><dd><a href="javascript:set_zone('820331')">法国</a></dd><dd><a href="javascript:set_zone('820343')">奥地利</a></dd><dd><a href="javascript:set_zone('820330')">新天鹅堡</a></dd><dd><a href="javascript:set_zone('820362')">西班牙</a></dd><dd><a href="javascript:set_zone('820433')">匈牙利</a></dd><dd><a href="javascript:set_zone('820340')">爱尔兰</a></dd><dd><a href="javascript:set_zone('820344')">捷克</a></dd><dd><a href="javascript:set_zone('820350')">冰岛</a></dd><dd><a href="javascript:set_zone('820429')">斯洛伐克</a></dd><dd><a href="javascript:set_zone('820338')">英国</a></dd><dd><a href="javascript:set_zone('820361')">波兰</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('澳')" >大洋洲(澳新)</a></dt>
                                    <dd><a href="javascript:set_zone('墨尔本')">墨尔本</a></dd><dd><a href="javascript:set_zone('凯恩斯')">凯恩斯</a></dd><dd><a href="javascript:set_zone('澳大利亚')">澳大利亚</a></dd><dd><a href="javascript:set_zone('新西兰')">新西兰</a></dd><dd><a href="javascript:set_zone('820366')">新西兰南北岛</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('美洲')" >美洲</a></dt>
                                    <dd><a href="javascript:set_zone('美国西海岸')">美国西海岸</a></dd><dd><a href="javascript:set_zone('美国东西海岸')">美国东西海岸</a></dd><dd><a href="javascript:set_zone('夏威夷')">夏威夷</a></dd><dd><a href="javascript:set_zone('美国')">美国</a></dd><dd><a href="javascript:set_zone('820435')">美国东海岸</a></dd><dd><a href="javascript:set_zone('820380')">加拿大</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('中东非')" >中东非</a></dt>
                                    <dd><a href="javascript:set_zone('阿联酋')">阿联酋</a></dd><dd><a href="javascript:set_zone('土耳其')">土耳其</a></dd><dd><a href="javascript:set_zone('迪拜')">迪拜</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('港澳台')" >港澳台</a></dt>
                                    <dd><a href="javascript:set_zone('香港')">香港</a></dd><dd><a href="javascript:set_zone('澳门')">澳门</a></dd><dd><a href="javascript:set_zone('台湾')">台湾</a></dd>                    </dl><dl>
                                    <dt class="fuqi"><a href="javascript:set_zone('南亚')" >南亚</a></dt>
                                    <dd><a href="javascript:set_zone('斯里兰卡')">斯里兰卡</a></dd>                    </dl>                </li>
                            </ul>
                            <!--国外结束-->
                            <a href="javascript:set_zone('3')" class="guowai">出境</a>            </dd>
                        <dd> <a href="" class="current"></a> </dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><i>出发地：</i></dt>
                        <dd><a href="javascript:set_city('')"  >不限</a></dd>                                  <dd><a href="javascript:set_city('上海')"  >上海</a></dd>                                  <dd><a href="javascript:set_city('杭州')"  >杭州</a></dd>                                  <dd><a href="javascript:set_city('温州')"  >温州</a></dd>                                  <dd><a href="javascript:set_city('宁波')"  >宁波</a></dd>                                  <dd><a href="javascript:set_city('南京')"  >南京</a></dd>                                  <dd><a href="javascript:set_city('北京')"  >北京</a></dd>                                  <dd><a href="javascript:set_city('香港')"  >香港</a></dd>          </dl>
                </li>
                <li>
                    <dl>
                        <dt><i>类型：</i> </dt>
                        <dd>
                            <a href="travelTeams" class="current">所有</a>
                        </dd>
                        <dd>
                            <a href="javascript:set_cate('半自由行')">半自由行</a>            </dd>
                        <dd>
                            <a href="javascript:set_cate('当地玩乐')">当地玩乐</a>            </dd>
                        <dd>
                            <a href="javascript:set_cate('跟团游')">跟团游</a>            </dd>
                        <dd>
                            <a href="javascript:set_cate('自由行')">自由行</a>            </dd>
                        <dd>
                        </dd>
                        <dd>
                            <a href="javascript:set_cate('套餐')">套餐</a>            </dd>
                        <dd>
                            <a href="javascript:set_cate('门票')">门票</a>            </dd>
                        <dd>
                            <a href="javascript:set_cate('邮轮')">邮轮 </a>            </dd>
                        <!--
                        <dd>
                                            <a href="javascript:set_cate('7')">特价 </a>            </dd>
                        -->
                        <dd>
                        </dd>
                        <dd>
                        </dd>
                        <dd>
                        </dd>
                        <dd>
                        </dd>
                    </dl>
                </li>
                <li class="active">
                    <dl>
                        <dt><i>行程天数：</i></dt>
                        <dd><a class="current" href="javascript:set_road(0)">不限</a></dd>
                        <dd><a  href="javascript:set_road(1)">1天</a></dd>
                        <dd><a  href="javascript:set_road(2)">2天</a></dd>
                        <dd><a  href="javascript:set_road(3)">3天</a></dd>
                        <dd><a  href="javascript:set_road(4)">4天</a></dd>
                        <dd><a  href="javascript:set_road(5)">5天</a></dd>
                        <dd><a  href="javascript:set_road(6)">6天</a></dd>
                        <dd><a  href="javascript:set_road(7)">7天</a></dd>
                        <dd><a  href="javascript:set_road(8)">8天</a></dd>
                        <dd><a  href="javascript:set_road(9)">9天</a></dd>
                        <dd><a  href="javascript:set_road(10)">10天及以上</a></dd>
                    </dl>
                </li>
            </ul>
            <!--
            <ul class="select">
              <li class="select-result">
               <dl>
                  <dt><i>已选条件：</i></dt>
                  <dd class="select-no">暂时没有选择过滤条件</dd>

                  <dd class="selected" id="selectA">
                      <a href="#">杭州</a>
                  </dd>
               </dl>
              </li>
            </ul>-->
        </hgroup>
        <article class="product">
            <%--<section class="pong">--%>
                <%--<div class="prong_u">--%>
                    <%--<div>--%>
                        <%--<a href="#" target="_blank"><img  src="${pageContext.request.contextPath}/static/picture/586f50032c2b1.jpg" alt="【寒假/春节/错峰】长滩岛4晚6日自由行（Z2直飞+全程入住天堂花园或网评4星酒店+可赠送接送）"></a>--%>
                        <%--<i>自由行</i>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="pong_c">--%>
                    <%--<ul class="poing">--%>
                        <%--<li class="ou1">编号：ZYX1727</li>--%>
                        <%--<li class="ou2">出发地：上海</li>              <li class="ou3">行程：6天4晚</li>                <li class="red">最近班次：2018-12-22</li>            </ul>--%>
                    <%--<h3><a  href="#" target="_blank">【寒假/春节/错峰】长滩岛4晚6日自由行（Z2直飞+全程入住天堂花园或网评4星酒店+可赠送...</a></h3>--%>
                    <%--<span>点赞：漫步长滩最美白沙滩，品尝美味又实惠的海鲜大餐，美丽海景尽在眼前！ </span> </div>--%>
                <%--<div class="pong_r">--%>
                    <%--<dl>--%>
                        <%--<dt>抢购价：￥<b>3,099</b>起</dt>--%>
                        <%--<dd>￥2,468</dd>--%>
                    <%--</dl>--%>
                    <%--<div class="money_02"><a href="/products/1727.html" target="_blank">立即抢购</a></div>--%>
                <%--</div>--%>
            <%--</section>--%>
            <c:forEach items="${travelTeams}"  varStatus="i" var="travelTeam">
            <section class="pong">
                <div class="prong_u">
                    <div>
                        <a href="$/products/1727.html" target="_blank"><img  src="${travelTeam.travel_team_img}" alt="【寒假/春节/错峰】长滩岛4晚6日自由行（Z2直飞+全程入住天堂花园或网评4星酒店+可赠送接送）"></a>
                        <i>${travelTeam.travel_team_type}</i>
                    </div>
                </div>

                <div class="pong_c">
                    <ul class="poing">
                        <li  style="width: 150px;">编号:${travelTeam.travel_team_id}</li>
                        <li  style="width: 130px;">出发地：${travelTeam.travel_team_origin}</li>
                        <li style="width: 130px;">旅行时间：${(travelTeam.travel_team_endTime.getTime() - travelTeam.travel_team_beginTime.getTime()) / (1000*3600*24)}天</li>
                        <li class="red">最近班次：${travelTeam.travel_team_beginTime.toLocaleString().split(' ')[0]}</li>
                    </ul>
                    <h3><a  href="/products/1727.html" target="_blank">${travelTeam.travel_team_title}</a></h3>
                    <span>已参与：${travelTeam.travel_team_peoples}人数 </span> </div>
                <div class="pong_r">
                    <dl>
                        <dt>抢购价：￥<b>${travelTeam.travel_team_price*1.5}</b>起</dt>
                        <dd>${travelTeam.travel_team_price}</dd>
                    </dl>
                    <div class="money_02"><a href="/products/1727.html" target="_blank">立即抢购</a></div>
                </div>
            </section>
            </c:forEach>
        </article>
        <%--<div class="paginator_wrapper">--%>
            <%--<div class="paginator paginator_notri paginator_large" >--%>
                <%--<ul class="paginator paginator_notri paginator_large" >--%>
                    <%--<ul class="paginator paginator--notri paginator--large" >   <li class='current'><a href='#'>1</a></li><li><a href='/Products/index/p/2.html' data-ajax='false'>2</a></li><li><a href='/Products/index/p/3.html' data-ajax='false'>3</a></li> <li class='last'><a href='/Products/index/p/14.html' data-ajax='false' >...14</a></li> <li class='next'><a href='/Products/index/p/2.html' data-ajax='false'>下一页</a></li></ul>        </ul>--%>
            <%--</div>--%>
        <%--</div>--%>
        <!-- <div class="banner"><a href="http://" target="_blank"><img src="picture/9a8a68fbd54046d4bbe75269b9ed3896.gif"></a></div> -->
    </article>
    <section class="tuing">
        <ul>
            <li>
                <p><img src="${pageContext.request.contextPath}/static/picture/earth.png"></p>
                <dl>
                    <dt>当季最热</dt>
                    <dd>引领最新旅游风尚</dd>
                </dl>
            </li>
            <li>
                <p><img src="${pageContext.request.contextPath}/static/picture/ship.png"></p>
                <dl>
                    <dt>旅游精选</dt>
                    <dd>旅游专家精挑细选</dd>
                </dl>
            </li>
            <li>
                <p><img src="${pageContext.request.contextPath}/static/picture/fly.png"></p>
                <dl>
                    <dt>简单选择</dt>
                    <dd>同一目的地最高性价比</dd>
                </dl>
            </li>
            <li>
                <p><img src="${pageContext.request.contextPath}/static/picture/money.png"></p>
                <dl>
                    <dt>明白消费</dt>
                    <dd>曝光旅游中所有陷阱</dd>
                </dl>
            </li>
        </ul>
    </section>
</main>
<%--travelTeam--%>
<!-- 尾部 -->
<link href="static/css/mfw-footer.css" rel="stylesheet" type="text/css"/>
<div id="footer">
<div class="ft-content" style="width: 1105px">
    <div class="ft-info clearfix" style="height: auto;">
        <dl class="ft-info-col ft-info-intro">
            <dt>全球旅游消费指南</dt>
            <dd>覆盖全球200多个国家和地区</dd>
            <dd><strong>100,000,000</strong> 位旅行者</dd>
            <dd><strong>920,000</strong> 家国际酒店</dd>
            <dd><strong>21,000,000</strong> 条真实点评</dd>
            <dd><strong>382,000,000</strong> 次攻略下载</dd>
            <dd><a class="highlight" href="http://www.mafengwo.cn/activity/sales_report2017/index" target="_blank">中国旅游行业第一部“玩法”</a>
            </dd>
        </dl>
        <dl class="ft-info-col ft-info-about">
            <dt>关于我们</dt>
            <dd><a href="http://www.mafengwo.cn/s/about.html" rel="nofollow">关于马蜂窝</a><a
                    href="http://www.mafengwo.cn/s/contact.html" class="m_l_10" rel="nofollow">联系我们</a></dd>
            <dd><a href="http://www.mafengwo.cn/s/private.html" rel="nofollow">隐私政策</a><a
                    href="http://www.mafengwo.cn/s/logo.html" rel="nofollow" class="m_l_10">商标声明</a></dd>
            <dd><a href="http://www.mafengwo.cn/s/agreement.html" rel="nofollow">服务协议</a><a
                    href="http://www.mafengwo.cn/s/rules.html" rel="nofollow" class="m_l_10">游记协议</a></dd>
            <dd><a href="http://www.mafengwo.cn/s/salesagreement.html" rel="nofollow">商城平台服务协议</a></dd>
            <dd><a href="http://www.mafengwo.cn/s/property.html" rel="nofollow">网络信息侵权通知指引</a></dd>
            <dd><a href="http://www.mafengwo.cn/s/sitemap.html" target="_blank">网站地图</a><a
                    class="joinus highlight m_l_10" title="马蜂窝团队招聘" target="_blank"
                    href="http://www.mafengwo.cn/s/hr.html" rel="nofollow">加入马蜂窝</a></dd>
        </dl>
        <dl class="ft-info-col ft-info-service">
            <dt>旅行服务</dt>
            <dd>
                <ul class="clearfix">
                    <li><a target="_blank" href="http://www.mafengwo.cn/gonglve/">旅游攻略</a></li>
                    <li><a target="_blank" href="http://www.mafengwo.cn/hotel/">酒店预订</a></li>
                    <li><a target="_blank" href="http://www.mafengwo.cn/sales/">旅游特价</a></li>
                    <li><a target="_blank" href="http://zuche.mafengwo.cn/">国际租车</a></li>
                    <li><a target="_blank" href="http://www.mafengwo.cn/wenda/">旅游问答</a></li>
                    <li><a target="_blank" href="http://www.mafengwo.cn/insure/">旅游保险</a></li>
                    <li><a target="_blank" href="http://z.mafengwo.cn">旅游指南</a></li>
                    <li><a target="_blank" href="http://huoche.mafengwo.cn">订火车票</a></li>
                    <li><a target="_blank" href="http://www.mafengwo.cn/travel-news/">旅游资讯</a></li>
                    <li><a target="_blank" href="http://www.mafengwo.cn/app/intro/gonglve.php">APP下载</a></li>
                    <li style="width: 120px;"><a target="_blank" href="http://www.mafengwo.cn/sales/alliance.php"
                                                 class="highlight">旅行商城全球商家入驻</a></li>
                </ul>
            </dd>
        </dl>
        <dl class="ft-info-col ft-info-qrcode">
            <dd>
                <span class="ft-qrcode-tejia"></span>
                <p>马蜂窝良品<br>官方服务号</p>
            </dd>
            <dd>
                <span class="ft-qrcode-weixin"></span>
                <p>马蜂窝旅游<br>订阅号</p>
            </dd>
            <dd>
                    <span class="ft-qrcode-weixin"
                          style="background-image: url('${pageContext.request.contextPath}/static/images/wkgbz1t_4ssavj6uaaalzj0pzgu881.png')"></span>
                <p>马蜂窝APP<br>扫描立即下载</p>
            </dd>
        </dl>
        <dl class="ft-info-social">
            <dt>向崇尚自由的加勒比海盗致敬！</dt>
            <dd>
                <a class="ft-social-weibo" target="_blank" href="http://weibo.com/mafengwovip" rel="nofollow"><i
                        class="ft-social-icon"></i></a>
                <a class="ft-social-qqt" target="_blank" href="http://t.qq.com/mafengwovip" rel="nofollow"><i
                        class="ft-social-icon"></i></a>
                <a class="ft-social-qzone" target="_blank" href="http://1213600479.qzone.qq.com/" rel="nofollow"><i
                        class="ft-social-icon"></i></a>
            </dd>
        </dl>
    </div>

    <div class="ft-links">
        <a target="_blank" href="http://china.makepolo.com/">马可波罗</a><a target="_blank"
                                                                        href="http://www.onlylady.com/">Onlylady女人志</a><a
            target="_blank" href="http://trip.elong.com/">艺龙旅游指南</a><a target="_blank" href="http://www.cncn.com">欣欣旅游网</a><a
            target="_blank" href="http://www.8264.com/">户外运动</a><a target="_blank" href="http://www.yue365.com/">365音乐网</a><a
            target="_blank" href="http://ishare.iask.sina.com.cn/">爱问共享资料</a><a target="_blank"
                                                                                href="http://www.uzai.com/">旅游网</a><a
            target="_blank" href="http://www.zongheng.com/">小说网</a><a target="_blank"
                                                                      href="http://www.xuexila.com/">学习啦</a><a
            target="_blank" href="http://www.yododo.com">游多多自助游</a><a target="_blank" href="http://www.zhcpic.com/">问答</a><a
            target="_blank" href="http://huoche.mafengwo.cn/">火车时刻表</a><a target="_blank"
                                                                          href="http://www.lvmama.com">驴妈妈旅游网</a><a
            target="_blank" href="http://www.haodou.com/">好豆美食网</a><a target="_blank" href="http://www.taoche.com/">二手车</a><a
            target="_blank" href="http://www.lvye.cn">绿野户外</a><a target="_blank"
                                                                 href="http://www.tuniu.com/">途牛旅游网</a><a
            target="_blank" href="http://www.mapbar.com/">图吧</a><a target="_blank" href="http://www.chnsuv.com">SUV联合越野</a><a
            target="_blank" href="http://www.uc.cn/">手机浏览器</a><a target="_blank"
                                                                 href="http://sh.city8.com/">上海地图</a><a
            target="_blank" href="http://www.tianqi.com/">天气预报查询</a><a target="_blank" href="http://www.ly.com/">同程旅游</a><a
            target="_blank" href="http://www.tieyou.com/">火车票</a><a target="_blank" href="http://www.yunos.com/">YunOS</a><a
            target="_blank" href="http://you.ctrip.com/">携程旅游</a><a target="_blank" href="http://www.jinjiang.com">锦江旅游</a><a
            target="_blank" href="http://www.huoche.net/">火车时刻表</a><a target="_blank"
                                                                      href="http://www.tripadvisor.cn/">TripAdvisor</a><a
            target="_blank" href="http://www.tianxun.com/">天巡网</a><a target="_blank"
                                                                     href="http://www.mayi.com/">短租房</a><a
            target="_blank" href="http://www.zuzuche.com">租租车</a><a target="_blank" href="http://www.5fen.com/">五分旅游网</a><a
            target="_blank" href="http://www.zhuna.cn/">酒店预订</a><a target="_blank" href="http://www.ailvxing.com">爱旅行网</a><a
            target="_blank" href="http://360.mafengwo.cn/all.php">旅游</a><a target="_blank"
                                                                           href="http://vacations.ctrip.com/">旅游网</a><a
            target="_blank" href="http://www.wed114.cn">wed114结婚网</a><a target="_blank"
                                                                        href="http://www.chexun.com/">车讯网</a><a
            target="_blank" href="http://www.aoyou.com/">遨游旅游网</a><a target="_blank"
                                                                     href="http://www.91.com/">手机</a>
        <a href="http://www.mafengwo.cn/s/link.html" target="_blank">更多友情链接&gt;&gt;</a>
    </div>

    <div class="ft-copyright">
        <a href="http://www.mafengwo.cn"><i class="ft-mfw-logo"></i></a>
        <p>© 2018 Mafengwo.cn <a href="http://www.miibeian.gov.cn/" target="_blank"
                                 rel="nofollow">京ICP备11015476号</a> <a
                href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010502013401"
                target="_blank"><img src="static/picture/police_record.png" width="12" style="margin:0 2px 4px 0;">京公网安备11010502013401号</a>
            <a href="http://images.mafengwo.net/images/about/icp2.jpg" target="_blank"
               rel="nofollow">京ICP证110318号</a><span class="m_l_10">违法和不良信息举报电话: 010-59222790 举报邮箱 mfwyouji@mafengwo.com</span>
        </p>
        <p>网络出版服务许可证：(总)网出证(京)字第161号<span class="m_l_10">增值电信业务经营许可证：京B2-20180228</span> <a
                href="http://images.mafengwo.net/images/about/licence_3.jpg" target="_blank" rel="nofollow"
                class="m_l_10">营业执照</a><a href="/sales/uhelp/doc" target="_blank" rel="nofollow"
                                          class="m_l_10">帮助中心</a><span class="m_l_10">马蜂窝客服：国内</span><span
                class="highlight">4006-345-678</span><span class="m_l_10">海外</span> <span class="highlight">+86-10-5922-2799</span>
        </p>
    </div>
    <div class="ft-safety">
        <a class="s-a" target="_blank" href="https://search.szfw.org/cert/l/CX20140627008255008321"
           id="___szfw_logo___"></a>
        <a class="s-b" href="https://ss.knet.cn/verifyseal.dll?sn=e130816110100420286o93000000&ct=df&a=1&pa=787189"
           target="_blank" rel="nofollow"></a>
        <a class="s-c" href="http://www.itrust.org.cn/Home/Index/itrust_certifi/wm/1669928206.html" target="_blank"
           rel="nofollow"></a>
    </div>

</div>
</div>
<script type="text/javascript">
    var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
    document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F6da04f074a509ba9202041a80bc21e65' type='text/javascript'%3E%3C/script%3E"));
</script>
<a href="#0" class="cd-top">Top</a>
</body>
<script type="text/javascript">
    function set_cate(str){
        document.getElementById('cate').value = str;
        document.forms['filterForm'].submit();
    }

    function set_city(str){
        document.getElementById('city').value = str;
        document.forms['filterForm'].submit();
    }

    function set_zone(str){
        document.getElementById('zone').value = str;
        document.forms['filterForm'].submit();
    }

    function set_road(str){
        document.getElementById('road').value = str;
        document.forms['filterForm'].submit();
    }
</script>
</html>