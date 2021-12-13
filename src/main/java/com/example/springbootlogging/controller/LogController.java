package com.example.springbootlogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LogController {

    Logger logger= LoggerFactory.getLogger(LogController.class);

    @RequestMapping
    public String makeLogs() throws NoSuchFieldException {
        logger.trace("A trace message");
        logger.debug("A debug message");
        logger.info("An {}info message {}", LogController.class.getAnnotations());
        logger.warn("A warn message");
        logger.error("An error message");

        return "Logs created Successfully!";

    }


}
