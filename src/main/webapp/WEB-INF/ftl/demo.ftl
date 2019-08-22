
<#--<h3>从Action中获得对象，与EL表达式类似</h3>-->
<#--<p style="color:red">${user.id}-&ndash;&gt;${user.username}-&ndash;&gt;${user.sal}</p>-->
<#--<p>在applicationContext中已经配置了freemarker中date和datetime的格式，此处直接使用即可</p>-->
<#--<p style="color:red">${user.birthday?datetime}-&ndash;&gt;${user.birthday?date}</p>-->

<#--<h3>从Action中获得集合，无需使用JSTL，而是使用#list</h3>-->
<ul>
<#list hrmList as hrm >
<li style="color:green">${hrm}</li>
</#list>
</ul>

<#--<h3>获取传入到Action中的参数</h3>-->
<#--<p style="color: blue;">${RequestParameters.movie}</p>-->
<#--<p style="color: blue;">movie=${param}</p>-->
