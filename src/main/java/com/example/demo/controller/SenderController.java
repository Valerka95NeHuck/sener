package com.example.demo.controller;

import com.example.demo.model.TeamReport;
import com.example.demo.service.SenderService;
import com.example.demo.service.SenderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@WebService(endpointInterface =  "service.SenderService")
public class SenderController {


    @WebMethod
    public Map<Integer, List<TeamReport>> getALlTeamsReports(){
        SenderService service = new SenderServiceImpl();
        return service.getALlTeamsReports();
    }



}
