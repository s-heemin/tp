package Configuration;

import Models.configuration;

public class Config {
    private final String serverAddress;
    private final int serverPort;
    private final boolean debugMode;

    private configuration dbConf;

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

    public configuration getDbConf() {
        return dbConf;
    }

    public static class Builder {
        private String serverAddress;
        private int serverPort;
        private boolean debugMode;

        private configuration dbConf;
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
            this.dbConf = configuration.of(url, user, password);
            return this;
        }

        public Config build() {
            return new Config(this);
        }
    }
}
