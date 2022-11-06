package com.example.demo.dto;

import com.example.demo.domain.CategoryStatus;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


@Data
public class CategoryDto implements Serializable {
    private  Long id;
    @NotEmpty(message = "name is not valid")
    private  String name;
    private  CategoryStatus status;
}