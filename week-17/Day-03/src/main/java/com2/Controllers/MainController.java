package com2.Controllers;

import com2.Models.AppendA;
import com2.Models.Message;
import com2.Models.Nmbr;
import com2.Models.Until;
import com2.Services.MainService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    public final MainService mainService;

    public MainController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Nmbr getdouble(@RequestParam(required = false) Integer input){
        if (input == null){
            return new Nmbr();
        }
        return new Nmbr(input);
    }

    @GetMapping("/greeter")
    @ResponseBody
    public ResponseEntity<Object> sayGreeting(@RequestParam(required = false)String name, @RequestParam(required = false) String title){
        if (name == null || title == null){
            return new ResponseEntity<>(new Message(name, title), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new Message(name, title), HttpStatus.OK);
    }
    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Object addA(@PathVariable(required = false) String appendable){
            return new AppendA(appendable);
    }

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Object doAction(@PathVariable String action, @RequestBody(required = false) Until until) {
        if (until == null) {
            return ResponseEntity.badRequest().body(new Error("Please provide a number!"));
        } else {
            return mainService.doUntil(until.getUntil(), action);
        }
    }
}
