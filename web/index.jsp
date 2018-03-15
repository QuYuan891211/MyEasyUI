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
        <div data-options="region:'center', split:false,title:'content',collapsible:true,iconCls:'icon-reload'" style="padding:5px;background:#eee;"></div>
    </div>
</body>
</html>
