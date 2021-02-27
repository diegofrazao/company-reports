package br.edu.ifpb.report.database;

public interface DatabaseConnector {

    public void createDatabaseConnection();
    public void makeQuery(String query);

}
