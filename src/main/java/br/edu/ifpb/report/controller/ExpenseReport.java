package br.edu.ifpb.report.controller;

public class ExpenseReport extends Report{

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connectorPostgres.createDatabaseConnection();
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connectorPostgres.makeQuery(query);
    }

    @Override
    public void convertToFile() {
        System.out.println("Converting To XLS...");
    }

}
