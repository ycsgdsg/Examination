<#import "base.ftl" as html />
<#import "spring.ftl" as spring />
<@html.base title="login">

<div id="bg">
    <div id="blank"></div>
    <div id="loginPage">
        <form id="loginForm" method="post">
            <div id="loginTable">
                <table width="85%"  border="0">
                    <tr>
                        <td width="24%" height="25" align="right">姓名: </td>
                        <td colspan="2"><input id="username" type="text" placeholder="姓名" class="input" id="username"></td>
                        <td width="22%"></td>
                    </tr>
                    <tr>
                        <td height="25" align="right">身份证: </td>
                        <td colspan="2"><input id="idNumber" type="text" placeholder="身份证号码" class="input" id="idNumber"></td>
                        <td> </td>
                    </tr>
                    <tr>
                        <td height="25"/>
                        <td colspan="2">
                            <button id="loginButton" type="button"  style=" float: middle;" class="btn btn-default btn-sm">登录</button>
                        <td> </td>
                    </tr>
                </table>
            </div>
        </form>
    </div>
    <div id="blank"></div>
</div>
</@html.base>