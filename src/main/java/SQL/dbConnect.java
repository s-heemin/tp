package SQL;

import Manager.ConfigManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
    public static void connect(Connection connection) {
        var conf = ConfigManager.getConfig().getDbConf();
        try {
            connection = DriverManager.getConnection(conf.url, conf.user, conf.password);
            System.out.println("DB Connection Success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
