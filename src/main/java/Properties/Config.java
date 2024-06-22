package Properties;

import SQL.dbConfiguration;

public class Config {
    private final String serverAddress;
    private final int serverPort;
    private final boolean debugMode;

    private dbConfiguration dbConf;

    Config(Builder builder) {
        this.serverAddress = builder.serverAddress;
        this.serverPort = builder.serverPort;
        this.debugMode = builder.debugMode;
        this.dbConf = builder.dbConf;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public int getServerPort() {
        return serverPort;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public dbConfiguration getDbConf() {
        return dbConf;
    }

    public static class Builder {
        private String serverAddress;
        private int serverPort;
        private boolean debugMode;

        private dbConfiguration dbConf;
        public Builder serverAddress(String serverAddress) {
            this.serverAddress = serverAddress;
            return this;
        }

        public Builder serverPort(int serverPort) {
            this.serverPort = serverPort;
            return this;
        }

        public Builder debugMode(boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }

        public Builder dbConfiguration(String url, String user, String password) {
            this.dbConf = dbConfiguration.of(url, user, password);
            return this;
        }

        public Config build() {
            return new Config(this);
        }
    }
}
