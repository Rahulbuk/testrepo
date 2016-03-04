package application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import application.service.IUserService;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private IUserService service;
    
    @RequestMapping("/")
    public Iterable index() {
        return  service.getAllUser();

    }
    
}
