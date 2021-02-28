package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends Report{

    private DatabaseConnector connector = createConnector();

    protected DatabaseConnector createConnector() {
        return new PostgreSQLDatabaseConnector();
    }

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createDatabaseConnection();
    }

    @Override
    public void makeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.makeQuery(query);
    }

    @Override
    public void convertToFile() {
        System.out.println("Converting To XLS...");
    }

}
