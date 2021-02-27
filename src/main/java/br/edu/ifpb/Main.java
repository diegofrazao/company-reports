package br.edu.ifpb;

import br.edu.ifpb.report.service.ReportService;

public class Main {

    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        reportService.generateExpenseReport();
        reportService.generateTaxReport();

    }

}
