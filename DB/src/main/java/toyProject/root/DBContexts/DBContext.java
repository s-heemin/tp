package toyProject.root.DBContexts;

import toyProject.root.Configuration.DBSqlExcutor;
import toyProject.root.DBSet.PlayerDBSet;
import toyProject.root.DBSet.ServerDBSet;

public class DBContext {
    public DBSqlExcutor excutor;
    public ServerDBSet server;
    public PlayerDBSet player;

    public DBContext(DBSqlExcutor excutor) {
        this.excutor = excutor;

        init();
    }

    public void init() {

        server = new ServerDBSet(excutor);
        player = new PlayerDBSet(excutor);
    }
}
