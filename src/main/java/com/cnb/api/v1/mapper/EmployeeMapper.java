package com.cnb.api.v1.mapper;

import com.cnb.api.v1.dto.EmployeeDTO;
import com.cnb.api.v1.dto.EmployeeListDTO;
import com.cnb.model.Employee;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.List;

@Component
public class EmployeeMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    static {
        MODEL_MAPPER.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public EmployeeListDTO toEmployeeListDTO(List<Employee> list) {
        Type targetListType = new TypeToken<List<EmployeeDTO>>() {
        }.getType();
        return new EmployeeListDTO(MODEL_MAPPER.map(list, targetListType));
    }
}
