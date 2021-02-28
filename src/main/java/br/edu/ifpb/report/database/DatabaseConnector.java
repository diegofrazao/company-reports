package br.edu.ifpb.report.database;

public interface DatabaseConnector {
    void createDatabaseConnection();
    void makeQuery(String query);
}
