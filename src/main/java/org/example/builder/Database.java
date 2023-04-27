package org.example.builder;

public class Database {
    private String host;
    private int port;
    private String username;
    private String password;

    private Database() {

    }

    public static class DatabaseBuilder {
        Database db = new Database();

        public DatabaseBuilder withHost(String host) {
            db.host = host;
            return this;
        }

        public DatabaseBuilder atPort(int port) {
            db.port = port;
            return this;
        }

        public DatabaseBuilder withUsername(String username) {
            db.username = username;
            return this;
        }

        public DatabaseBuilder withPassword(String password) {
            db.password = password;
            return this;
        }

        public Database build() throws Exception {
            if (db.password.isEmpty()) {
                throw new Exception("Invalid password");
            }
            return db;
        }
    }
}
