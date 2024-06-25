package Models;

import java.time.Instant;

public class DMServer {
    public int id;
    public int port;
    public String host;
    public Instant updated_at;
    public Instant created_at;

    public static DMServer of(int port, String host) {
        var model = new DMServer();
        model.port = port;
        model.host = host;

        return model;
    }
}
