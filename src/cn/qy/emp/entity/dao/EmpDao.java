package cn.qy.emp.entity.dao;

import cn.qy.emp.entity.Emp;
import cn.qy.emp.entity.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EmpDao {
    public void add(Emp emp) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getComboPooledDataSource());
        String sql = "insert into emps(id,name,salary) values(?,?,?)";
        Object[] params = {emp.getId(),emp.getName(),emp.getSal()};
        queryRunner.update(sql,params);
    }

    public List<Object> findAllRecord() throws SQLException {
        List<Object> list = new LinkedList<>();
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getComboPooledDataSource());
        String sql = "select * from emps";
       return list =  queryRunner.query(sql,new BeanListHandler<Object>(Emp.class));
    }

    public static void main(String [] args) throws SQLException {
       EmpDao empDao = new EmpDao();
//        Emp emp = new Emp();
//        emp.setId();
//        emp.setName("caoxi");
//        emp.setSal(100);
//        empDao.add(emp);
          List<Object> list =  empDao.findAllRecord();
          for(Object ob:list){
              Emp emp = (Emp)ob;
              System.out.println("ID: " + emp.getId() + "name:" + emp.getName() + "  sal:" +emp.getSal());
          }
    }
}
