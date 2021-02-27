package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector implements DatabaseConnector {

    public void createDatabaseConnection() {
        System.out.println("Create mysql connetion");
    }

    public void makeQuery(String query) {
        System.out.println("Run SQL query");
    }

}
