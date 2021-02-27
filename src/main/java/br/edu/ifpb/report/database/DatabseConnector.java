package br.edu.ifpb.report.database;

public interface DatabseConnector {

    public void createDatabaseConnection();
    public void makeQuery(String query);

}
