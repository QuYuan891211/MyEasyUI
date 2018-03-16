package cn.qy.emp.action;

import cn.qy.emp.entity.Emp;
import cn.qy.emp.service.EmpService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmpAction extends ActionSupport{
    private EmpService empService;
    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }


    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    private Emp emp;

    public List<Emp> getList() {
        return list;
    }

    public void setList(List<Emp> list) {
        this.list = list;
    }

    public EmpService getEmpService() {
        return empService;
    }

    private List<Emp> list;



    public String addEmp() throws Exception{
        emp.setId();
        empService.add(emp);
        return "success";
    }

    public String find() throws Exception{
        List<Emp> list  = empService.findAllRecord();
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("total",list.size());
        map.put("rows",list);

        return "success";
    }
}
