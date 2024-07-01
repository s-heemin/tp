package toyProject.root.Configuration;

public class RegisterMappers {

    private RegisterMappers() {}

    public static void addMappers() {
        DBSqlExcutor.sqlSessionFactory.getConfiguration().addMappers(
                "toyProject.root.Mappers"
        );
    }


}
