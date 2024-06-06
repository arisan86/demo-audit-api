package com.example.demo.audit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TableController {

    @GetMapping("/table")
    public Map<String, Object> getTableData() {
        List<String> columnNames = Arrays.asList("Name", "Age", "City");
        List<Map<String, Object>> rows = Arrays.asList(
                Map.of("Name", "John", "Age", 30, "City", "New York"),
                Map.of("Name", "Jane", "Age", 25, "City", "Los Angeles"),
                Map.of("Name", "Doe", "Age", 22, "City", "Chicago")
        );

        Map<String, Object> tableData = new HashMap<>();
        tableData.put("columns", columnNames);
        tableData.put("rows", rows);

        return tableData;
    }
}