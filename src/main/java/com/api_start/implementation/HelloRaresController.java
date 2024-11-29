package com.api_start.implementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRaresController {


    @GetMapping("/rares")
    public String index()
    {
        return "Salut Rares";
    }


}
