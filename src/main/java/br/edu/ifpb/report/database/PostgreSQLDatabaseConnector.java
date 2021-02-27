package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector implements DatabseConnector{

    public void createDatabaseConnection() {
        System.out.println("Create postgres connetion");
    }

    public void makeQuery(String query) {
        System.out.println("Run SQL query");
    }

}
