<#import "base.ftl" as html />
<#import "spring.ftl" as spring />
<@html.base title="Login">
<div class="row">
    <div class="col-lg-1"></div>
    <div class="col-lg-10" id="host-tree"></div>
    <div class="col-lg-1"></div>
</div>

<div>
    <div class="col-lg-1"></div>
    <div class="col-lg-10">
        <button type="button"  style=" float: middle;" class="btn btn-default btn-sm" data-toggle="modal" data-target="#createHostConfigDialog" data-type="save">Create</button>
        <button type="button"  style=" float: middle;" class="btn btn-default btn-sm" data-toggle="modal" data-target="#deleteHostConfigDialog" data-type="delete">Delete</button>
    </div>
    <div class="col-lg-1"></div>
</div>

</@html.base>