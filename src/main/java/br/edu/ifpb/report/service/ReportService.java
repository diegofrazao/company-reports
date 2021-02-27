package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.Report;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    Report expenseReport = new ExpenseReport();
    Report taxReport = new TaxReport();

    public void generateExpenseReport(){
        expenseReport.generate();
    }

    public void generateTaxReport() {
        taxReport.generate();
    }

}
