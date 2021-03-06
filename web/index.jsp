<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/3/13
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp/Js/Ajax/Json/Jquery/Easyui + Servlet + JDBC + Lucene/Mysql/Oracle完成数据库分页</title>
    <link rel="stylesheet" herf="../themes/icon.css" type="text/css">
    <link rel="stylesheet" href="../themes/default/easyui.css" type="text/css">
    <script type="text/javascript" src="../js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
</head>
<body>
    <div id="page" class="easyui-layout" data-options="fit:true" style="width: 600px;height: 400px">
        <div data-options="region:'north',split:false,title:'tes',collapsible:true" style="height:200px"></div>
        <div data-options="region:'west', split:false, title:'My desktop',collapsible:true" style="width: 200px">
            <ul id="tree" class="easyui-tree" data-options="lines:true,animate:true">
                <li>
                <span>
                    用户管理
                </span>
                </li>
                <li>
                <span>
                    部门管理
                </span>
                </li>
                <li>
                <span>
                    员工管理
                </span>
                    <ul>
                        <li>
                            <span>显示员工数据</span>
                        </li>
                        <li>
                            <span>新增员工</span>
                        </li>
                        <li>
                            <span>删除员工</span>
                        </li>
                    </ul>
                </li>


                <li>
                <span>
                    统计分析
                </span>
                </li>
            </ul>
        </div>
        <div id="center" data-options="region:'center', split:false,title:'content',collapsible:true,iconCls:'icon-reload'" style="padding:5px;background:#eee;">
            <div id="add_emp_panel" class="easyui-panel"></div>
            <table id="dg"></table>
        </div>
    </div>


    <script type="text/javascript">
        $("#tree").tree({
            onClick:function (node) {
                if("新增员工" == node.text){
                    $("#add_emp_panel").empty();
                   var $inputName = "<input type='text' id='empName' value='请输入姓名' class='easyui-validatebox' required=true data-options='font-size:50px'>"
                    var $inputSal = "<input type='text' id='empSal' value='请输入薪水' data-options='font-size:50px'>"
                    var $submit = "<button  id='submit' onclick='addEmp()' value='提交' style='width:100px;height:100px'>"
                    $("#add_emp_panel").append($inputName);
                    $("#add_emp_panel").append($inputSal);
                    $("#add_emp_panel").append($submit);
                }
            }




        })
    </script>
     <script type="text/javascript">
         $("#tree").tree({
             onClick:function (node) {
                 if("显示员工数据"== node.text){
                    $("#dg").datagrid({
                        columns:[[
                            {field:'name',title:'姓名',width:100},
                            {field:'salary',title:'薪水',width:100}
                        ]],
                        singleSelect:true,
                        fitColumns:true,
                        url:"${pageContext.request.contextPath}/findEmp?time=" + new Date().getTime()

                    });
                 }
             }
         })
     </script>
<script type="text/javascript">
   function addEmp() {
        var name = $("#empName").val();
        var name = $("#empName").val();
        var sal = $("#empSal").val();
        if("请输入姓名" != name ||"请输入薪水" !=sal || "" != name){
            var url = "${pageContext.request.contextPath}/addEmp?time=" + new Date().getTime();
            var sendData = {
               "emp.name" : name,
                "emp.salary" : sal
        }
            $.post(url,sendData,function (backData) {

            })
        }

    }
</script>

</body>
</html>
