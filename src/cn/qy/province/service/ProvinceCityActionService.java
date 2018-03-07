package cn.qy.province.service;

import java.util.ArrayList;
import java.util.List;

public class ProvinceCityActionService {
    public List<String> findCityByProvince(String province){
        List<String> cityList = new ArrayList<>();
        if (province == null && province.length() < 1){
            return null;
        }else if (province.equals("广东")){
            cityList.add("韶关");
            cityList.add("广州");
        }else if (province.equals("四川")){
            cityList.add("内江");
            cityList.add("成都");
        }
        return cityList;
    }
    public List<String> findAreaByCity(String city){
        List<String> areaList = new ArrayList<>();
        if (city == null && city.length() < 1){
            return null;
        }else if (city.equals("韶关")){
            areaList.add("浈江区");
            areaList.add("武江区");
            areaList.add("曲江区");
        }else if (city.equals("广州")){
            areaList.add("越秀区");
            areaList.add("海珠区");

        }else if (city.equals("内江")){
            areaList.add("市中区");
            areaList.add("东兴区");
            areaList.add("内江经济开发区");
        }else if (city.equals("成都")){
            areaList.add("武侯区");
            areaList.add("青羊区");
            areaList.add("锦江区");
            areaList.add("双流区");
            areaList.add("温江区");
            areaList.add("金牛区");
        }
        return areaList;
    }
}
