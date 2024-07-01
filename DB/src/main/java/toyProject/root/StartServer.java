package toyProject.root;

import toyProject.root.Configuration.DBSqlExcutor;
import toyProject.root.Models.DMPlayer;
import toyProject.root.Models.DMServer;

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

        var playerModel = DMPlayer.of("1234", 1,2,3,4,5,6);
        excutor.dbContext.player.save(playerModel);
    }
}
