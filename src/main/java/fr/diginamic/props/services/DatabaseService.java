package fr.diginamic.props.services;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.util.ResourceBundle;

public class DatabaseService {

    private static final ResourceBundle config = ResourceBundle.getBundle("application");

    private static ComboPooledDataSource cpds;

    public static ComboPooledDataSource getConnectionPool() {
        if (cpds == null) {
            cpds = new ComboPooledDataSource();
            cpds.setJdbcUrl(config.getString("db.url"));
            cpds.setUser(config.getString("db.user"));
            cpds.setPassword(config.getString("db.password"));
        }
        return cpds;
    }

}
