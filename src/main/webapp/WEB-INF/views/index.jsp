<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메인</title>
    <style>
        body {
            background: #f1eee9;
            margin: 0; /* body의 기본 마진을 제거하여 전체 화면을 채우도록 설정 (선택적) */
            padding: 0; /* body의 기본 패딩을 제거하여 전체 화면을 채우도록 설정 (선택적) */
            font-family: "Noto Sans KR ExtraLight";
            color: #4b4a4a;
        }

        .main-logo {
            margin-top: 50px;
            align-items: center;

        }


        /* Footer 스타일 */
        footer {
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

    </style>
</head>
<body>

<!-- 메인 로고 -->
<div class="main-logo" align="center">
    <a href="/dog/dogFoodSearch"><img src="/imgs/m2.png" width="100"></a><br>
</div>

<div align="center">
    <a href="/user/join">회원가입</a>
    <a href="/user/login">로그인</a>
</div>


<!-- Footer -->
<footer>
    &copy; 2024 Your Website Name. All rights reserved.
</footer>


</body>
</html>