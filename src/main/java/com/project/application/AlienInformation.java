package com.project.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class AlienInformation {

    @Autowired
    private AlienOperation alienoperation;

    @RequestMapping("/aliens")
    public List<Information> getaliens(){
        return alienoperation.getaliens();
    }
    
    @RequestMapping(value="/aliens", method=RequestMethod.POST)
    public void addInformation(@RequestBody Information information) {
        alienoperation.addInformation(information);
    }    
}
