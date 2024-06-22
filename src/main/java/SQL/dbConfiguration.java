package SQL;

public class dbConfiguration {
    public String url;
    public String user;
    public String password;

    public static dbConfiguration of(String url, String user, String password) {
        var conf = new dbConfiguration();
        conf.url = url;
        conf.user = user;
        conf.password = password;

        return conf;
    }
}
