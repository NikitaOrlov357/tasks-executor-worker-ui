package com.nesterov.tasksexecutorworkerui.integrations;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WorkerIntegrationsService {

    public WorkerIntegrationsService(){
        getRegularity();
    }

    public long getRegularity(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:444/properties/getRegularity";
        ResponseEntity<Long> response = restTemplate.getForEntity(url,Long.class);
        return response.getBody();
    }
}
