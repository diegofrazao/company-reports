package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public abstract class Report {

    DatabseConnector connectorMySQL = new MysqlDatabaseConnector();
    DatabseConnector connectorPostgres = new PostgreSQLDatabaseConnector();

    public void generate() {
        this.createDatabaseConnection();
        this.executeQuery();
        this.convertToFile();
    }

    abstract public void createDatabaseConnection();
    abstract public void executeQuery();
    abstract public void convertToFile();

}
