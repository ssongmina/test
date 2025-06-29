package test.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import test.example.domain.Temp;
import test.example.service.TempService;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TempController {

    private final TempService tempService;


    @PostMapping("/hi")
    public String hi(@RequestParam String name){
        tempService.addTemp(name);
        return "Hi there";
    }
}
