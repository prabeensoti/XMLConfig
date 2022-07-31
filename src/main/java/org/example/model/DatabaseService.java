package org.example.model;

public class DatabaseService{
    private String dbUrl;

    public DatabaseService(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void connect() {
        System.out.println("Connected to "+dbUrl);
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl=dbUrl;
    }
}
