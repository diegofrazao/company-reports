package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public abstract class Report {

    abstract protected DatabaseConnector createConnector();

    public void generate() {
        this.createDatabaseConnection();
        this.makeQuery();
        this.convertToFile();
    }

    abstract public void createDatabaseConnection();
    abstract public void makeQuery();
    abstract public void convertToFile();

}
