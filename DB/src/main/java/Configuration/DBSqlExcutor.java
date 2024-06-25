package Configuration;

import Mappers.ServerMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.io.StringReader;
import java.util.Objects;
import java.util.function.Function;

public class DBSqlExcutor {
    public static SqlSessionFactory sqlSessionFactory = null;

    public GlobalDBContext dbContext;
    private DBSqlExcutor(String host, String username, String password) {
        createFactory(host, username, password);
    }

    public static DBSqlExcutor of(String host, String username, String password) {
        return new DBSqlExcutor(host, username, password);
    }

    private void createFactory(String host, String username, String password) {
        var fetchString = MybatisProperty.fetchString(host, username, password);
        var stringReader = new StringReader(fetchString);
        sqlSessionFactory = new org.apache.ibatis.session.SqlSessionFactoryBuilder().build(stringReader);
        sqlSessionFactory.getConfiguration().addMapper(ServerMapper.class);
        sqlSessionFactory.openSession(true).close();
    }

    public void init() {
        dbContext = new GlobalDBContext(this);
    }

    public <T extends Object> T query(Function<SqlSession, T> e) {
        SqlSession session = sqlSessionFactory.openSession(true);

        return excute(session, e, false);
    }

    private <T extends Object> T excute(SqlSession session, Function<SqlSession, T> withSqlSession, boolean ignoreError) {
        try {
            return withSqlSession.apply(session);
        } catch (Exception e) {
            throw e;
        } finally {
            if (Objects.nonNull(session)) {
                session.close();
            }
        }
    }
}
