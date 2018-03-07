package cn.qy.province.action;

import cn.qy.province.entity.Bean;
import cn.qy.province.service.ProvinceCityActionService;
import com.sun.net.httpserver.Authenticator;

import java.util.List;

public class ProvinceCityAreaAction {
    private ProvinceCityActionService provinceCityActionService = new ProvinceCityActionService();
    private Bean bean;
    private List<String> cityList;
    private List<String> areaList;

    public Bean getBean() {
        return bean;
    }

    public void setBean(Bean bean) {
        this.bean = bean;
    }

    public String findCityByProvince(){
        cityList =  provinceCityActionService.findCityByProvince(bean.getProvince());
        return "SUCCESS";
    }

    public String findAreaByCity(){
        areaList = provinceCityActionService.findAreaByCity(bean.getCity());
        return "SUCCESS";
    }



    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

    public List<String> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<String> areaList) {
        this.areaList = areaList;
    }



}
