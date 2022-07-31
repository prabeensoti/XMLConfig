package org.example.model;

public class DatabaseService{
    private String dbUrl;
    public DatabaseService() {
    }
    public void connect() {
        System.out.println("Connected to "+dbUrl);
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl=dbUrl;
    }
}
