import Manager.ConfigManager;
import SQL.dbConnect;

import java.sql.Connection;
import java.util.Objects;

public class Server {
    public static void main(String[] args) {
        ConfigManager.init();

        // db 연결
        Connection connection = null;
        dbConnect.connect(connection);
        if(Objects.isNull(connection)) {
            return;
        }

    }
}
