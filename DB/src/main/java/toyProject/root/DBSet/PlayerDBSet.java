package toyProject.root.DBSet;

import toyProject.root.Configuration.DBSqlExcutor;
import toyProject.root.Mappers.PlayerMapper;
import toyProject.root.Models.DMPlayer;

import java.time.Instant;

public class PlayerDBSet {  public DBSqlExcutor excutor;

    public PlayerDBSet(DBSqlExcutor excutor) {
        this.excutor = excutor;
    }

    public DMPlayer get(long id) {
        return excutor.query(db -> db.getMapper(PlayerMapper.class).get(id));
    }

    public int save(DMPlayer model) {
        if(model.id > 0) {
            return update(model);
        }

        return insert(model);
    }

    private int update(DMPlayer model) {
        model.updated_at = Instant.now();
        return excutor.query(db -> db.getMapper(PlayerMapper.class).update(model));
    }

    private int insert(DMPlayer model) {
        model.updated_at = Instant.now();
        model.created_at = model.updated_at;
        return excutor.query(db -> db.getMapper(PlayerMapper.class).insert(model));
    }

}
