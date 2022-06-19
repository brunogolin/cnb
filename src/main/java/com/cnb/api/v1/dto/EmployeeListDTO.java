package com.cnb.api.v1.dto;

import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel("EmployeeList")
public class EmployeeListDTO {

    public List<EmployeeDTO> items;

    public EmployeeListDTO(List<EmployeeDTO> items) {
        this.items = items;
    }

    public List<EmployeeDTO> getItems() {
        return items;
    }

    public void setItems(List<EmployeeDTO> items) {
        this.items = items;
    }
}
