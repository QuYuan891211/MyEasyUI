package cn.qy.emp.dao;

import cn.qy.emp.entity.Emp;
import cn.qy.emp.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmpDao {
    public void add(Emp emp) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getComboPooledDataSource());
        String sql = "insert into emps(id,name,salary) values(?,?,?)";
        Object[] params = {emp.getId(),emp.getName(),emp.getSalary()};
        queryRunner.update(sql,params);
    }

    public List<Emp> findAllRecord() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getComboPooledDataSource());
        String sql = "select id,name,salary from emps";
       return  queryRunner.query(sql,new BeanListHandler<>(Emp.class));
    }


}
