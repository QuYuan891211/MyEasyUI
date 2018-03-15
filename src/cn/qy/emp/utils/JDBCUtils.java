package cn.qy.emp.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {
    private static ComboPooledDataSource comboPooledDataSource= new ComboPooledDataSource();

//    注意此处是单例模式，所以不能再get方法中new
//    public ComboPooledDataSource getComboPooledDataSource() {
//        return comboPooledDataSource = new ComboPooledDataSource();
//    }

    public static ComboPooledDataSource getComboPooledDataSource() {
        return comboPooledDataSource;
    }
}
