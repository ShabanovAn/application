package com.example.application.Validation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Validated
//@ConfigurationProperties(prefix = "app.properties") ???
public class AppProperties {

    @NotEmpty
    private String name;

    @Min(value = 7)
    @Max(value = 30)
    private Integer reportIntervalInDate;

    @Email
    private String reportEmailAddress;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReportIntervalInDate() {
        return reportIntervalInDate;
    }

    public void setReportIntervalInDate(Integer reportIntervalInDate) {
        this.reportIntervalInDate = reportIntervalInDate;
    }

    public String getReportEmailAddress() {
        return reportEmailAddress;
    }

    public void setReportEmailAddress(String reportEmailAddress) {
        this.reportEmailAddress = reportEmailAddress;
    }
}
