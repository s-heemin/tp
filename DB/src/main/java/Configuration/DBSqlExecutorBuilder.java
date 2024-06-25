package Configuration;

public class DBSqlExecutorBuilder {
    private String host = "";
    private String name = "";
    private String password =  "";

    // 객체가 of를 통해서만 세팅되도록
    private DBSqlExecutorBuilder() {

    }

    public static DBSqlExecutorBuilder newBuilder() {
        return new DBSqlExecutorBuilder();
    }


}
