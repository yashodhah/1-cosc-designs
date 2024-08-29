package dev.h.yashodha.design_playground.controller;

import dev.h.yashodha.design_playground.interactor.ReportRequest;
import dev.h.yashodha.design_playground.interactor.FinancialReportRequester;
import dev.h.yashodha.design_playground.interactor.ReportResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {
    private final FinancialReportRequester financialReportRequester;

    public ReportController(FinancialReportRequester financialReportRequester) {
        this.financialReportRequester = financialReportRequester;
    }

    // TODO: we can use different POJOs for controller
    public ReportResponse getFinancialReportData(ReportRequest reportRequest) {
        return financialReportRequester.getFinancialReport(reportRequest);
    }
}
