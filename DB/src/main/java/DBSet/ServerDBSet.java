package DBSet;

import Configuration.DBSqlExcutor;
import Configuration.GlobalDBContext;
import Mappers.ServerMapper;
import Models.DMServer;

import java.time.Instant;

public class ServerDBSet {
    public DBSqlExcutor excutor;

    public ServerDBSet(DBSqlExcutor excutor) {
        this.excutor = excutor;
    }

    public DMServer get(long id) {
        return excutor.query(db -> db.getMapper(ServerMapper.class).findById(id));
    }

    public int save(DMServer model) {
        if(model.id > 0) {
            return update(model);
        }

        return insert(model);
    }

    private int update(DMServer model) {
        model.updated_at = Instant.now();
        return excutor.query(db -> db.getMapper(ServerMapper.class).update(model));
    }

    private int insert(DMServer model) {
        model.updated_at = Instant.now();
        model.created_at = model.updated_at;
        return excutor.query(db -> db.getMapper(ServerMapper.class).insert(model));
    }

}
