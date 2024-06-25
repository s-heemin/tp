import Configuration.ConfigManager;
import Configuration.DBSqlExcutor;
import Configuration.GlobalDBContext;
import Models.DMServer;

import java.sql.Connection;
import java.util.Objects;

public class StartServer {
    public static void main(String[] args) {
/*
        ConfigManager.init();
        var config = ConfigManager.getConfig();
*/

        var excutor = DBSqlExcutor.of("localhost", "root", "gmlals12");
        excutor.init();

        var model = DMServer.of(3306, "localhost");
        excutor.dbContext.server.save(model);
    }
}
