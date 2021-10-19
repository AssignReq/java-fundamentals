package com.apples.game.dao;

import com.apples.game.domain.GameDifficulty;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Data access object class for Game Difficulty object.
 */
@Repository
public class GameDifficultyDao {

    /**
     * Method to get list of difficulties.
     * @return list of difficulties.
     */
    public List<GameDifficulty> getAllDifficulties() {
        return new ArrayList<>();
    }

    /**
     * Method to get specific difficulty.
     * @return difficulty.
     */
    public GameDifficulty getDifficulty(byte gameDifficultyId) {
        return null;
    }
}
