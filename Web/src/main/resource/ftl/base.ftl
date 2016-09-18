<#import "/spring.ftl" as spring />

<#macro pageHead title="">
<head>
    <#nested />
    <title>${title}</title>
</head>
</#macro>

<#macro pageBody>
<body>
    <#nested />
</body>
</#macro>

<#macro page>
<!DOCTYPE html>
<html>
    <@pageHead/>
    <@pageBody/>
</html>
</#macro>