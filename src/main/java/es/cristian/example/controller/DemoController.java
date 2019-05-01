package es.cristian.example.controller;

import es.cristian.example.model.Car;
import es.cristian.example.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private IDemoService iDemoService;

    @RequestMapping("/find")
    public List<Car> find(){
        return iDemoService.find();
    }

    @RequestMapping("/save")
    public void save(){
        iDemoService.save();
    }
}
