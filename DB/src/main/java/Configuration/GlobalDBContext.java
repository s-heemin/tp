package Configuration;

import DBSet.ServerDBSet;

public class GlobalDBContext {
    public static GlobalDBContext INSTANCE;
    public DBSqlExcutor excutor;

    public ServerDBSet server;

    public GlobalDBContext(DBSqlExcutor excutor) {
        this.excutor = excutor;

        init();
    }

    public void init() {
        server = new ServerDBSet(excutor);
    }
}
