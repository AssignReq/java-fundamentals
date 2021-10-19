package com.apples.game.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Game controller class.
 */
@Controller
public class GameController {

    final static Logger LOGGER = Logger.getLogger(GameController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "home";
    }

}
