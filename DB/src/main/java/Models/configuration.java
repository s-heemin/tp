package Models;

public class configuration {
    public String url;
    public String user;
    public String password;

    public static configuration of(String url, String user, String password) {
        var conf = new configuration();
        conf.url = url;
        conf.user = user;
        conf.password = password;

        return conf;
    }
}
