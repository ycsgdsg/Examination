<#import "/spring.ftl" as spring />
<#macro base title="">
<!DOCTYPE html>
<html>
<head>

    <script type="text/javascript" src="<@spring.url '/static/js/login.js'/>"></script>
    <title>${title}</title>
</head>
<body>
<div id="loginPage">
</div>
</body>
</html>
</#macro>