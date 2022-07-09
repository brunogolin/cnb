package com.cnb.api.v1.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@ApiModel("Employee")
public class EmployeeDTO implements Serializable {

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
