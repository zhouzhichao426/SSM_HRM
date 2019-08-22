<#--<h3>从Action中获得对象，与EL表达式类似</h3>-->
<#--<p style="color:red">${user.id}-&ndash;&gt;${user.username}-&ndash;&gt;${user.sal}</p>-->
<#--<p>在applicationContext中已经配置了freemarker中date和datetime的格式，此处直接使用即可</p>-->
<#--<p style="color:red">${user.birthday?datetime}-&ndash;&gt;${user.birthday?date}</p>-->

<#--<h3>从Action中获得集合，无需使用JSTL，而是使用#list</h3>-->

<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>


<table class="table">

    <thead>
    <tr class="success">
        <th>部门编号</th>
        <th>月初人数</th>
        <th>月末人数</th>
        <th>本月新聘</th>
        <th>本月离职</th>
        <th>研究生</th>
        <th>本科</th>
        <th>专科</th>
        <th>高中及以下</th>
    </tr>
    </thead>
    <tbody>
<#list hrmList as hrm >
<tr class="warning">
    <td>${hrm.emp.dno}</td>
    <td>${hrm.personNum.mbegin}</td>
    <td>${hrm.personNum.mend}</td>
    <td>${hrm.personNum.newemp}</td>
    <td>${hrm.personNum.newemp}</td>
    <td>${hrm.edu.master}</td>
    <td>${hrm.edu.banchelor}</td>
    <td>${hrm.edu.college}</td>
    <td>${hrm.edu.senior}</td>
</tr>
</#list>
    </tbody>
</table>

