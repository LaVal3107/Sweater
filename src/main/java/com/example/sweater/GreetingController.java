package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
/**
 //Контроллер - это программный модуль, который по пути "/greeting" слушает
 запрсы от пользователя и возвращает какие-то данныеб в текущей ситуации
 будет возвращать файл-шаблон, который будет описан позже.
 */

public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model){
        model.put("some", "hello, Start!");
        return "main";
    }
}