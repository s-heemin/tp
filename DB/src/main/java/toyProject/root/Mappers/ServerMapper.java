package toyProject.root.Mappers;

import toyProject.root.Models.DMServer;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ServerMapper {
    @Select("SELECT * FROM servers WHERE id = #{id}")
    DMServer findById(long id);

    @Insert("INSERT INTO servers(port, host, updated_at, created_at) VALUES(#{port}, #{host}, #{updated_at}, #{created_at})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(DMServer user);

    @Update("UPDATE servers SET updated_at = #{updated_at} WHERE id = #{id}")
    int update(DMServer user);

    @Delete("DELETE FROM servers WHERE id = #{id}")
    void delete(Long id);
}
