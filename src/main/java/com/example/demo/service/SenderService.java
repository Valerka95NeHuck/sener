package com.example.demo.service;

import com.example.demo.model.TeamReport;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Map;

@WebService
public interface SenderService {

    @WebMethod
    Map<Integer, List<TeamReport>> getALlTeamsReports();
}
