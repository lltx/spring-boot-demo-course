<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

${k1}

${user.username}


${user.password!}
${user.password!"无密码"}


<#list userList as user>
    ${user.username}
</#list>

<#if user.username == "lengleng">
    用户是lengleng
</#if>

<#include "date.ftlh">
<#include "neiz.ftlh">
</body>
</html>
