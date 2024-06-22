package Properties;

public class Config {
    private final String serverAddress;
    private final int serverPort;
    private final boolean debugMode;

    Config(Builder builder) {
        this.serverAddress = builder.serverAddress;
        this.serverPort = builder.serverPort;
        this.debugMode = builder.debugMode;
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

    public static class Builder {
        private String serverAddress;
        private int serverPort;
        private boolean debugMode;

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

        public Config build() {
            return new Config(this);
        }
    }
}
