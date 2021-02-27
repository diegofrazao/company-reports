package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public abstract class Report {

    DatabaseConnector connectorMySQL = new MysqlDatabaseConnector();
    DatabaseConnector connectorPostgres = new PostgreSQLDatabaseConnector();

    public void generate() {
        this.createDatabaseConnection();
        this.executeQuery();
        this.convertToFile();
    }

    abstract public void createDatabaseConnection();
    abstract public void executeQuery();
    abstract public void convertToFile();

}
