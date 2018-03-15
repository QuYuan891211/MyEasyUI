package cn.qy.emp.action;

import cn.qy.emp.entity.Emp;
import cn.qy.emp.service.EmpService;
import com.opensymphony.xwork2.ActionSupport;

public class EmpAction extends ActionSupport{
    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }

    private EmpService empService;



    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    private Emp emp;

    public String add() throws Exception{
        empService.add(emp);
        return "success";
    }

    public String find() throws Exception{
        empService.findAllRecord();
        return "success";
    }
}
