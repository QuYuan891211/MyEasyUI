<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/2/12
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>省市区三级联动</title>
    <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
</head>
<body>
    <select id="province">
        <option>选择省份</option>
        <option>广东</option>
        <option>四川</option>
    </select>
    <select id="city">
        <option>选择城市</option>
    </select>
<select id="area">
    <option>选择区</option>
</select>

<script type="text/javascript">
    $("#province").change(function () {
        $("#city option:gt(0)").remove();
        $("#area option:gt(0)").remove();
        //获取选中的省份
        var provinceSelected = $("#province option:selected").text();
        if(provinceSelected != undefined || "选择省份"!= provinceSelected){
            var url = "${pageContext.request.contextPath}/findCityRequest?time=" + new Date().getTime();
            var sendData = {
                "bean.province":provinceSelected
            }
            $.post(url,sendData,function (backData) {
                if(backData != null){
                    //测试，backData是一个js对象，cityList是属性
//                    alert(backData);
//                    alert(backData.cityList);cityList
                    var length = backData.cityList.length;
                    for(var i = 0;i<length;i++){
                        var cityName = backData.cityList[i];
                        var $option = $("<option>"+cityName+"<option>");
                        $("#city").append($option);
                    }
                }
            })
        }
    })
</script>
<script type="text/javascript">
    //1.标签变动事件
    $("#city").change(function () {
        //1.1 获取标签变动的值
        $("#area option:gt(0)").remove();
        var citySelected = $("#city option:selected").text();
        //1.2 判断值
        if(citySelected != undefined || "选择城市" != citySelected || citySelected.length > 0){
            //1.3 传到控制器的制定方法中
            var url ="${pageContext.request.contextPath}/findAreaRequest?time" + new Date().getTime();
            var sendData = {
              "bean.city" : citySelected
            };
            $.post(url,sendData,function (backData) {
                //2.回调函数
                //1.获取区域信息
                var length = backData.areaList.length;
                for(var i = 0;i<length;i++){
                    var areaName = backData.areaList[i];
                    var $option = $("<option>"+areaName+"</option>");
                    $("#area").append($option);
                }
                //2.制作option对象，插入到选择框中
            })



        }


    })
</script>
</body>
</html>
