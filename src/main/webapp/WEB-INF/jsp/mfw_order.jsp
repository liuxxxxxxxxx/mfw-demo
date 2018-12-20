<%--
  Created by IntelliJ IDEA.
  User: BK-201
  Date: 2018/12/20
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>我的订单 - 马蜂窝</title>
    <meta name="renderer" content="webkit" />

    <script type="text/javascript">
        window.Env = {"status":0,"WWW_HOST":"www.mafengwo.cn","IMG_HOST":"images.mafengwo.net","W_HTTP":"http:\/\/w.mafengwo.cn","P_HOST":"passport.mafengwo.cn","P_HTTP":"https:\/\/passport.mafengwo.cn","PAGELET_HTTP":"http:\/\/pagelet.mafengwo.cn","JS_HOST":"js.mafengwo.net","TONGJI_HOST":"tongji.mafengwo.cn","UID":77628663,"CSTK":"ce5f8db882d956bad9de447fad3ee26a_3ecd9b448442bf0b4f6cb677d7499cf6","GOOGLE_MAP_KEY":"AIzaSyD-Su0x_rPy1xehlMBcMyTqWkU49Bk53nQ","MOBILE_BINDED":true};
    </script>

    <link href="static/css/css+app+topbar_v2^alw^1527308432.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


    <script language="javascript" src="static/js/js+advert+inspector^alw^1536006240.js" type="text/javascript" crossorigin="anonymous"></script>

</head>
<body>

<div class="topBar">
    <div class="topBarC">
        <div class="logo"><a title="马蜂窝自由行" href="/">马蜂窝自由行</a></div>
        <div class="t_nav">
            <ul id="pnl_nav" data-cs-t="headnav_wo">
                <li data-cs-p="index">
                    <strong class="t"><a href="/">首页</a></strong>
                </li>
                <li data-cs-t="wenda" data-cs-p="wenda">
                    <strong class="t"><a data-cs-p="from_wo_nav" href="/wenda/">问答</a></strong>
                </li>
                <li data-cs-t="things" data-cs-p="things">
                    <strong class="t"><a data-cs-p="from_wo_nav" href="/mall/things.php">马蜂窝周边</a></strong>
                </li>
                <li data-cs-p="together">
                    <strong class="t"><a href="/together/">结伴</a></strong>
                </li>
                <li data-cs-p="group">
                    <strong class="t"><a href="/group/">小组</a></strong>
                </li>
                <li data-cs-p="mall">
                    <strong class="t"><a href="/club/">蜂首俱乐部</a></strong>
                </li>
                <li class="drop" data-cs-p="other">
                    <strong class="t"><a href="/app/hun.php">更多<b></b></a></strong>
                    <div class="c">

                        <a href="/focus/" target="_blank">真人兽</a>

                        <a href="/school/" target="_blank">马蜂窝高校</a>
                        <a href="/photo_pk/prev.php" target="_blank">照片PK</a>
                        <a href="/auction/" target="_blank">马蜂窝拍卖行</a>
                        <a href="/mall/virtual_goods.php" target="_blank">道具商店</a>
                        <a href="/radio/" target="_blank">旅行电台</a>
                        <a href="/club/" target="_blank">蜂首聚乐部</a>
                        <a href="/home/vip_show.php" target="_blank">VIP</a>
                        <a href="/game/wager.php" target="_blank">分歧终端机</a>
                    </div>
                </li>
            </ul>
        </div>
        <div class="t_search">
            <form method="GET" action="/search/s.php" name="search">
                <input type="text" class="key" value="" name="q" id="word">
                <input type="submit" value="" class="btn">
            </form>
        </div>

        <div class="t_info">
            <div data-pagelet id="pagelet-block-954287f649a184917d0d68b4fdfca07c" class="" data-api="apps:user:pagelet:pageViewHeadInfo" data-params="{&quot;type&quot;:2}" data-async="1" data-controller="/js/pageletcommon/pageHeadUserInfoWWWDark"></div>
        </div>
    </div>
</div>

<link href="static/css/css+sales+sales-order.v2^ylds^1524639062.css" rel="stylesheet" type="text/css"/>



<div class="container">
    <div class="banner">

        <style>
            .invisible {opacity:0.01; filter: alpha(opacity=1);}
            .invisible .maps-container {opacity:0.01; filter: alpha(opacity=1);}
        </style>

        <div class="banner_img banner_extra" id="_j_banner">
        </div>
        <div class="tags_bar second_tags_bar">
            <div class="center clearfix">
                <div class="MAvatar clearfix">
                    <div class="MAvaImg flt1">
                        <img width="120" height="120" alt="" src="static/picture/wkged1uqit-ag3w5aaabm62rsh0384.png">
                    </div>
                    <div class="MAvaEasyWord flt1">
                        <span class="MAvaName">BK-201(杭州)</span>
                        <span class="MAvaLevel">Lv.1</span>
                    </div>
                </div>
                <ul class="flt2">
                    <li><a class="tags_link" href="/u/77628663.html" title="我的窝">我的窝</a></li>
                    <li><a class="tags_link" href="/u/77628663/note.html" title="我的游记">我的游记</a></li>
                    <li><a class="tags_link" href="/wenda/u/77628663/answer.html" title="我的问答">我的问答</a></li>
                    <li id="_j_pathnav"><a class="tags_link" href="/path/77628663.html" title="我的足迹">我的足迹</a></li>
                    <li><a class="tags_link" href="/u/77628663/review.html" title="我的点评">我的点评</a></li>
                    <li><a class="tags_link" href="/u/77628663/together.html" title="我的结伴">我的结伴</a></li>
                    <li class="more ">
                        <span class="tags_link" role="button" title="更多" style="cursor:default">更多<i class="MDownMore"></i></span>
                        <div class="tags_more_list">
                            <ul>
                                <li data-cs-t="go_to_activity"><a href="/indexactivity/index.php" title="我的活动" data-cs-p="activity"><i class="ico_activity"></i><span>我的活动</span></a></li>
                                <li><a href="/home/g/my.php" title="我的小组"><i class="ico_group"></i><span>我的小组</span></a></li>
                                <li><a href="/plan/fav.php" title="我的收藏"><i class="ico_collect"></i><span>我的收藏</span></a></li>
                                <li><a href="/order_center/" title="我的订单"><i class="ico_order"></i><span>我的订单</span></a></li>
                                <li><a href="/sales/coupon.php" title="我的优惠券"><i class="ico_ticket"></i><span>我的优惠券</span></a></li>
                                <li><a href="/mall/my_exchange.php" title="我的兑换"><i class="ico_exchange"></i><span>我的兑换</span></a></li>
                                <!--<li><a href="/rent/order/boss?flag=-1" title="我的当地人"><i class="ico_rent"></i><span>我的当地人</span></a></li>-->
                                <li><a href="/flight/passengers.php" title="常用信息"><i class="ico_information"></i><span>常用信息</span></a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="wrapper">
    <div class="home-extra">
        <div class="s-menu">
            <ul class="clearfix">
                <li><a href="/indexactivity/index.php">我的活动<i></i></a></li>
                <li><a href="/home/g/my.php">我的小组<i></i></a></li>
                <li><a href="/plan/fav.php">我的收藏<i></i></a></li>
                <li class="on"><a>我的订单<i></i></a></li>
                <li><a href="/sales/coupon.php">我的优惠券<i></i></a></li>
                <li><a href="/mall/my_exchange.php">我的兑换<i></i></a></li>
                <li><a href="/plan/route.php">我的路线<i></i></a></li>
                <li><a href="/flight/passengers.php">我的常用信息<i></i></a></li>
            </ul>
        </div>
        <ul class="filter clearfix">
            <li class="on">
                <a href="?state">全部</a>
            </li>

            <li>
                <a href="?state=0">待支付
                </a>
            </li>

            <li>
                <a href="?state=1">待出行
                </a>
            </li>

            <li>
                <a href="?state=2">待点评
                </a>
            </li>

            <li>
                <a href="?status=2&_refer=">取消/退款
                    <!---->
                </a>
            </li>

        </ul>

        <table class="table table-hover">
            <tr><td>图片</td><td>订单编号</td><td>商品名称</td><td>商品数量</td><td>商品价格</td><td>总价</td><td>日期</td></tr>
            <c:if test="${pageContext.request.getParameter('state')==''}">
                <c:forEach items="${orders}" var="order">
                    <tr>
                        <td><img src="${pageContext.request.contextPath}\static\picture\wkgbz1jvjp6azligaagksj8cink90.jpeg"></img></td>
                        <td>${order.orderId}</td>
                        <td>${order.title}</td>
                        <td>${order.counts}</td>
                        <td>${order.price}</td>
                        <td>${order.total}</td>
                        <td>${order.buytime.toLocaleString()}</td>
                        <td><button class="btn btn-primary">${order.state==1?'已支付':'未支付'}</button></td>
                    </tr>
                </c:forEach>
            </c:if>
            <c:if test="${pageContext.request.getParameter('state')=='0'}">
                <c:forEach items="${orders}" var="order">
                    <c:if test="${order.state==0}">
                        <tr>
                            <td><img src="${pageContext.request.contextPath}\static\picture\wkgbz1jvjp6azligaagksj8cink90.jpeg"></img></td>
                            <td>${order.orderId}</td>
                            <td>${order.title}</td>
                            <td>${order.counts}</td>
                            <td>${order.price}</td>
                            <td>${order.total}</td>
                            <td>${order.buytime.toLocaleString()}</td>
                            <td><button class="btn btn-primary">${order.state==1?'已支付':'未支付'}</button></td>
                        </tr>
                    </c:if>

                </c:forEach>
            </c:if>
            <c:if test="${pageContext.request.getParameter('state')=='1'}">
                <c:forEach items="${orders}" var="order">
                    <c:if test="${order.state==1}">
                        <tr>
                            <td><img src="${pageContext.request.contextPath}\static\picture\wkgbz1jvjp6azligaagksj8cink90.jpeg"></img></td>
                            <td>${order.orderId}</td>
                            <td>${order.title}</td>
                            <td>${order.counts}</td>
                            <td>${order.price}</td>
                            <td>${order.total}</td>
                            <td>${order.buytime.toLocaleString()}</td>
                            <td><button class="btn btn-primary">${order.state==1?'已支付':'未支付'}</button></td>
                        </tr>
                    </c:if>

                </c:forEach>
            </c:if>


        </table>

        <c:if test="empty ${orders}">
            <div class="order-table">
                <div class="order-empty">
                    <i class="order-empty-icon"></i>
                    <p>暂无相关订单</p>
                </div>

            </div>
        </c:if>

    </div>
</div>




<script>
    // 攻略点击报数
    $('.review-guide a').click(function() {
        var $btn = $(this),
            url  = $btn.attr('href');

        mfwPageEvent('sales', 'order_center', {
            click: '点评攻略'
        });

        setTimeout(function() {
            window.open(url);
        }, 0);

        return false;
    });
    // PV
    if (window.Env.status == 4) {
        mfwPageEvent('sales', 'page', {
            pageName: '我的订单-待点评'
        });
    }
</script>



<link href="static/css/mfw-footer.css" rel="stylesheet" type="text/css"/>

<div id="footer">
    <div class="ft-content" style="width: 1105px">
        <div class="ft-info clearfix">
            <dl class="ft-info-col ft-info-intro">
                <dt>全球旅游消费指南 </dt>
                <dd>覆盖全球200多个国家和地区</dd>
                <dd><strong>100,000,000</strong> 位旅行者</dd>
                <dd><strong>920,000</strong> 家国际酒店</dd>
                <dd><strong>21,000,000</strong> 条真实点评</dd>
                <dd><strong>382,000,000</strong> 次攻略下载</dd>
                <dd><a class="highlight" href="http://www.mafengwo.cn/activity/sales_report2017/index" target="_blank">中国旅游行业第一部“玩法”</a></dd>
            </dl>
            <dl class="ft-info-col ft-info-about">
                <dt>关于我们</dt>
                <dd><a href="http://www.mafengwo.cn/s/about.html" rel="nofollow">关于马蜂窝</a><a href="http://www.mafengwo.cn/s/contact.html" class="m_l_10" rel="nofollow">联系我们</a></dd>
                <dd><a href="http://www.mafengwo.cn/s/private.html" rel="nofollow">隐私政策</a><a href="http://www.mafengwo.cn/s/logo.html" rel="nofollow" class="m_l_10">商标声明</a></dd>
                <dd><a href="http://www.mafengwo.cn/s/agreement.html" rel="nofollow">服务协议</a><a href="http://www.mafengwo.cn/s/rules.html" rel="nofollow" class="m_l_10">游记协议</a></dd>
                <dd><a href="http://www.mafengwo.cn/s/salesagreement.html" rel="nofollow">商城平台服务协议</a></dd>
                <dd><a href="http://www.mafengwo.cn/s/property.html" rel="nofollow">网络信息侵权通知指引</a></dd>
                <dd><a href="http://www.mafengwo.cn/s/sitemap.html" target="_blank">网站地图</a><a class="joinus highlight m_l_10" title="马蜂窝团队招聘" target="_blank" href="http://www.mafengwo.cn/s/hr.html" rel="nofollow">加入马蜂窝</a></dd>
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
                        <li style="width: 120px;"><a target="_blank" href="http://www.mafengwo.cn/sales/alliance.php" class="highlight">旅行商城全球商家入驻</a></li>
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
                    <span class="ft-qrcode-weixin" style="background-image: url('static/images/wkgbz1t_4ssavj6uaaalzj0pzgu881.png')"></span>
                    <p>马蜂窝APP<br>扫描立即下载</p>
                </dd>
            </dl>
            <dl class="ft-info-social">
                <dt>向崇尚自由的加勒比海盗致敬！</dt>
                <dd>
                    <a class="ft-social-weibo" target="_blank" href="http://weibo.com/mafengwovip" rel="nofollow"><i class="ft-social-icon"></i></a>
                    <a class="ft-social-qqt" target="_blank" href="http://t.qq.com/mafengwovip" rel="nofollow" ><i class="ft-social-icon"></i></a>
                    <a class="ft-social-qzone" target="_blank" href="http://1213600479.qzone.qq.com/" rel="nofollow"><i class="ft-social-icon"></i></a>
                </dd>
            </dl>
        </div>

        <div class="ft-copyright">
            <a href="http://www.mafengwo.cn"><i class="ft-mfw-logo"></i></a>
            <p>© 2018 Mafengwo.cn <a href="http://www.miibeian.gov.cn/" target="_blank" rel="nofollow">京ICP备11015476号</a> <a href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010502013401" target="_blank"><img src="static/picture/police_record.png" width="12" style="margin:0 2px 4px 0;">京公网安备11010502013401号</a> <a href="http://images.mafengwo.net/images/about/icp2.jpg" target="_blank" rel="nofollow">京ICP证110318号</a><span class="m_l_10">违法和不良信息举报电话: 010-59222790 举报邮箱 mfwyouji@mafengwo.com</span></p>
            <p>网络出版服务许可证：(总)网出证(京)字第161号<span class="m_l_10">增值电信业务经营许可证：京B2-20180228</span> <a href="http://images.mafengwo.net/images/about/licence_3.jpg" target="_blank" rel="nofollow" class="m_l_10">营业执照</a><a href="/sales/uhelp/doc" target="_blank" rel="nofollow" class="m_l_10">帮助中心</a><span class="m_l_10">马蜂窝客服：国内</span><span class="highlight">4006-345-678</span><span class="m_l_10">海外</span> <span class="highlight">+86-10-5922-2799</span></p>
        </div>
        <div class="ft-safety">
            <a class="s-a" target="_blank" href="https://search.szfw.org/cert/l/CX20140627008255008321" id="___szfw_logo___"></a>
            <a class="s-b" href="https://ss.knet.cn/verifyseal.dll?sn=e130816110100420286o93000000&ct=df&a=1&pa=787189" target="_blank" rel="nofollow"></a>
            <a class="s-c" href="http://www.itrust.org.cn/Home/Index/itrust_certifi/wm/1669928206.html" target="_blank" rel="nofollow"></a>
        </div>

    </div>
</div>
<style>
    #ad2{ padding: 10px 0;display: block;position: fixed;bottom: 0;z-index: 100;left: -200px;}
    #ad1{ display: block;position: fixed;bottom: 0;left: -100%;z-index: 100;width:100% }

    td{
        font-size: large;
        width:200px;
        text-align: center;
        margin-top: 30px;
    }
</style>
<div id="ad2">
    <img src="static/picture/wkged1v2s7aao1draabuuzn2gxa275.png" style="width: 150px">
    <div style="width: 24px;height: 24px;background-color: #fba811;opacity: 0.65;position: absolute;border-radius: 3px;right: 3px;top: 35px;z-index: 100;">
        <img id="closed" style="height: 16px;width: 16px;position: absolute;left: 49%;margin-left: -8px;top: 50%;margin-top: -8px;"src="static/picture/wkged1vrt4kasg2maaabpqudi6w478.png"></div>
</div>
<div id="ad1">
    <div style="width: 100%;height:150px;background-image: url('static/images/wkged1v2rx-arjipaafgdddlsj8315.png');position: relative">
        <img id="close" style="height: 20px;width: 20px;float: right;padding-top: 10px;padding-right: 10px"
             src="static/picture/wkged1vrt4kasg2maaabpqudi6w478.png"></div>
    <div style="position: absolute;right: 50%;margin-right: -340px;bottom: 0;width: 730px;">
        <img src="static/picture/wkged1v2s1kaoy1aaamkl5ow56m494.png" style="height: 180px">
    </div>
</div>
<script>
    $(function () {
        if(!(location.href.match(/www\.mafengwo\.cn\/hotel/g) ||
                location.href.match(/www\.mafengwo\.cn\/sales/g) ||
                location.href.match(/www\.mafengwo\.cn\/$/g) ||
                location.href.match(/www\.mafengwo\.cn\/mdd\/$/g) ||
                location.href.match(/www\.mafengwo\.cn\/gonglve\/$/g)
            )){
            if(getCookie('all_ad')!=='1'){
                $("#ad1").animate({ left:0,},1500,'swing');
                setTimeout(function () {
                    $("#ad1").animate({ left:-window.innerWidth,},1500,'swing');
                }, 3000);
                setTimeout(function () {
                    $("#ad2").animate({ left:0,},500,'swing');
                    $("#ad1").hide();
                }, 4500);
                add_cookie('all_ad');
            }else{
                if(getCookie('ad_hide')!=='1')
                    $("#ad2").animate({ left:0,},1000,'swing');
            }
        }
    });

    $('#ad2 img').click(function (){
        $("#ad2").animate({ left:-200,},500,'swing');
        setTimeout(function () {
            $("#ad1").show();
            $("#ad1").css('width','100%');
            $("#ad1").animate({ left:0,},1000,'swing');
        }, 800);
    });
    $('#close').click(function () {
        $("#ad1").animate({ left:-window.innerWidth,},1000,'swing');
        setTimeout(function () {
            $("#ad2").animate({ left:0,},800,'swing');
            $("#ad1").hide();
        }, 1000);
    });
    $("#ad2 div").click(function () {
        $("#ad1").animate({ left:-window.innerWidth,},1000,'swing');
        setTimeout(function () {
            $("#ad2").animate({ left:-200,},800,'swing');
            $("#ad1").hide();
        }, 1000);
        add_cookie('ad_hide');
    });

    function add_cookie(name) {
        var exp = new Date();
        exp.setTime(exp.getTime() + 60*1000*60);
        document.cookie=name+'=1;expires='+exp.toGMTString()+';path=/';
    }
    function getCookie(cname)
    {
        var name = cname + "=";
        var ca = document.cookie.split(';');

        for(var i=0; i<ca.length; i++) {
            var c = ca[i];
            while (c.charAt(0)==' ') c = c.substring(1);
            if (c.indexOf(name) != -1) return c.substring(name.length, c.length);
        }

        return "";
    }
</script>



<script language="javascript" type="text/javascript">
    if (typeof M !== "undefined" && typeof M.loadResource === "function") {
        M.loadResource("http://js.mafengwo.net/js/cv/js+pageletcommon+pageHeadUserInfoWWWDark:js+M+module+dialog+Layer:js+M+module+dialog+DialogBase:js+M+module+dialog+Dialog:js+M+module+dialog+alert:js+M+module+FrequencyVerifyControl:js+M+module+FrequencySystemVerify:js+ALogin:js+ACnzzGaLog:js+ARecruit^YVBS^1544153187.js");
    }
</script>

</body>
</html>

