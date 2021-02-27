package br.edu.ifpb.report.controller;

public class TaxReport extends Report{

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connectorMySQL.createDatabaseConnection();
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connectorMySQL.makeQuery(query);
    }

    @Override
    public void convertToFile() {
        System.out.println("Converting To PDF...");
    }
}
