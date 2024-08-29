package dev.h.yashodha.design_playground.interactor;

import java.util.Date;

public record ReportRequest(String reportType,
                            String customerId,
                            Date fromDate,
                            Date toDate) {
}
