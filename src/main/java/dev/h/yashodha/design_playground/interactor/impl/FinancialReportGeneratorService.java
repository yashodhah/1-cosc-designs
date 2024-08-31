package dev.h.yashodha.design_playground.interactor.impl;

import dev.h.yashodha.design_playground.database.CustomerRepository;
import dev.h.yashodha.design_playground.interactor.FinancialReportRequester;
import dev.h.yashodha.design_playground.interactor.ReportRequest;
import dev.h.yashodha.design_playground.interactor.ReportResponse;
import dev.h.yashodha.design_playground.interactor.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public class FinancialReportGeneratorService implements FinancialReportRequester {

    private final CustomerRepository customerRepository;

    public FinancialReportGeneratorService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public ReportResponse getFinancialReport(ReportRequest reportRequest) {
        Customer customer = customerRepository.findById(reportRequest.customerId()).orElseThrow();
        // do some processing
        String reportData = "hello I am report for customer " + customer.getFirstName();
        return new ReportResponse(reportData, 1);
    }
}
