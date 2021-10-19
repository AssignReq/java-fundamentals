package com.apples.game.service;

import com.apples.game.dao.GameDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Game service class.
 */
@Service
public class GameService {

    final static Logger LOGGER = Logger.getLogger(GameService.class);

    @Autowired
    private GameDao gameDao;
}
