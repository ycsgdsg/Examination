<#import "/spring.ftl" as spring />
<#macro base title="">
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="<@spring.url '/static/lib/jquery/jquery.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/static/lib/datetimepicker/moment-with-locales.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/static/lib/datetimepicker/bootstrap-datetimepicker.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/static/lib/bootstrap/js/bootstrap.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/static/lib/bootstrap/js/bootbox.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/static/lib/angular/angular.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/static/lib/bootstrap-treeview/js/bootstrap-treeview.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/static/lib/bootstrap-toggle/js/bootstrap-toggle.min.js'/>"></script>
    <script type="text/javascript" src="<@spring.url '/static/lib/fullcalendar/js/fullcalendar.min.js'/>"></script>

    <script type="text/javascript" src="<@spring.url '/static/js/login.js'/>"></script>

    <link rel="stylesheet" type="text/css" href="<@spring.url '/static/lib/bootstrap-treeview/css/bootstrap-treeview.min.css'/>"/>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/static/lib/bootstrap-toggle/css/bootstrap-toggle.min.css'/>"/>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/static/lib/bootstrap/css/bootstrap.min.css'/>"/>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/static/lib/fullcalendar/css/fullcalendar.min.css'/>"/>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/static/lib/datetimepicker/bootstrap-datetimepicker.css'/>"/>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/static/lib/font-awesome/css/font-awesome.min.css'/>"/>

    <link rel="stylesheet" type="text/css" href="<@spring.url '/static/css/examination.css'/>"/>

    <title>${title}</title>
</head>
<body>
    <#nested/>
</body>
</html>
</#macro>