package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends Report{

    private DatabaseConnector connector = createConnector();

    protected DatabaseConnector createConnector() {
        return new MysqlDatabaseConnector();
    }

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createDatabaseConnection();
    }

    @Override
    public void makeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.makeQuery(query);
    }

    @Override
    public void convertToFile() {
        System.out.println("Converting To PDF...");
    }
}
