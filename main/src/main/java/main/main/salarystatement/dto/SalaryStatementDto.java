package main.main.salarystatement.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class SalaryStatementDto {
    @Getter
    @Setter
    public static class Post {
        private long companyId;
        private long memberId;
        private int year;
        private int month;
    }

    @Getter
    @Builder
    public static class Response {
        private long id;
        private long companyId;
        private String companyName;
        private long memberId;
        private String memberName;
        private int year;
        private int month;
        private BigDecimal hourlyWage;
        private BigDecimal basePay;
        private BigDecimal overtimePay;
        private int overtimePayBasis;
        private BigDecimal nightWorkAllowance;
        private int nightWorkAllowanceBasis;
        private BigDecimal holidayWorkAllowance;
        private int holidayWorkAllowanceBasis;
        private BigDecimal unpaidLeave;
        private BigDecimal salary;
        private BigDecimal incomeTax;
        private BigDecimal nationalCoalition;
        private BigDecimal healthInsurance;
        private BigDecimal employmentInsurance;
        private BigDecimal totalSalary;
        private long bankId;
        private String bankName;
        private String accountNumber;
    }
}
