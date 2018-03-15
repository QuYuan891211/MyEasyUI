package cn.qy.emp.service;

import cn.qy.emp.dao.EmpDao;
import cn.qy.emp.entity.Emp;

import java.sql.SQLException;
import java.util.List;

public class EmpService {
    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

    private EmpDao empDao;

    public List<Emp> findAllRecord() throws SQLException {
        return empDao.findAllRecord();
    }
    public void add(Emp emp) throws SQLException {
        empDao.add(emp);
    }
}
