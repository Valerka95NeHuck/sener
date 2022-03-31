package com.example.demo.service;

import com.example.demo.model.ServiceAccountantDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class ParserJSON {

    public static List to_parse (String str, Class<ServiceAccountantDTO[]> valueType) {
        List<ServiceAccountantDTO> list = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            list = Arrays.asList(objectMapper.readValue(str, valueType));
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            return list;
        }
    }
}
