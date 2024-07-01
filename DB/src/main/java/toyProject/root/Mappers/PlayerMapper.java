package toyProject.root.Mappers;

import toyProject.root.Models.DMPlayer;
import org.apache.ibatis.annotations.*;

public interface PlayerMapper {
    @Select("SELECT * FROM players WHERE id = #{id}")
    DMPlayer get(long id);

    @Insert("INSERT INTO players(name, job, attack, hp, mp, updated_at, created_at)" +
            " VALUES(#{name}, #{job}, #{attack}, #{hp}, #{mp}, #{updated_at}, #{created_at})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(DMPlayer user);

    @Update("UPDATE players SET updated_at = #{updated_at} WHERE id = #{id}")
    int update(DMPlayer user);

    @Delete("DELETE FROM servers WHERE id = #{id}")
    void delete(long id);
}
