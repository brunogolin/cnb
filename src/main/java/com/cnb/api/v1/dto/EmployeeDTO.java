package com.cnb.api.v1.dto;

import io.swagger.annotations.ApiModel;

@ApiModel("Employee")
public class EmployeeDTO {

    private String empId;
    private String empName;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
