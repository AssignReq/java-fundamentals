package com.apples.game.domain;

/**
 * Class which contains all necessary fields of game object.
 */
public class Game {

    private int gameId;
    private byte gameDifficultyId;
    private String playerName;
    private String gameState;
    private int moves;
    private boolean finished;

    /**
     * Default constructor.
     */
    public Game() {
        // nothing to do here
    }

    /**
     * Game object constructor with parameters.
     *
     * @param pGameId gameId to set.
     * @param pGameDifficultyId gameDifficultyId to set.
     * @param pPlayerName playerName to set.
     * @param pGameState gameState to set.
     * @param pMoves moves to set.
     * @param pFinished finished to set.
     */
    public Game(int pGameId, byte pGameDifficultyId, String pPlayerName, String pGameState, int pMoves, boolean pFinished) {
        this.gameId = pGameId;
        this.gameDifficultyId = pGameDifficultyId;
        this.playerName = pPlayerName;
        this.gameState = pGameState;
        this.moves = pMoves;
        this.finished = pFinished;
    }

    /**
     * Getter for gameId field.
     * @return gameId value.
     */
    public int getGameId() {
        return gameId;
    }

    /**
     * Setter for gameId field.
     * @param pGameId new gameId value.
     */
    public void setGameId(int pGameId) {
        this.gameId = pGameId;
    }

    /**
     * Getter for gameDifficultyId field.
     * @return gameDifficultyId value.
     */
    public byte getGameDifficultyId() {
        return gameDifficultyId;
    }

    /**
     * Setter for gameDifficultyId field.
     * @param pGameDifficultyId new gameDifficultyId value.
     */
    public void setGameDifficultyId(byte pGameDifficultyId) {
        this.gameDifficultyId = pGameDifficultyId;
    }

    /**
     * Getter for playerName field.
     * @return playerName value.
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Setter for playerName field.
     * @param pPlayerName new playerName value.
     */
    public void setPlayerName(String pPlayerName) {
        this.playerName = pPlayerName;
    }

    /**
     * Getter for gameState field.
     * @return gameState value.
     */
    public String getGameState() {
        return gameState;
    }

    /**
     * Setter for gameState field.
     * @param pGameState new gameState value.
     */
    public void setGameState(String pGameState) {
        this.gameState = pGameState;
    }

    /**
     * Getter for moves field.
     * @return moves value.
     */
    public int getMoves() {
        return moves;
    }

    /**
     * Setter for moves field.
     * @param pMoves new moves value.
     */
    public void setMoves(int pMoves) {
        this.moves = pMoves;
    }

    /**
     * Getter for finished field.
     * @return finished value.
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Setter for finished field.
     * @param pFinished new finished value.
     */
    public void setFinished(boolean pFinished) {
        this.finished = pFinished;
    }

    public String toString() {
        return "Game ID: " + this.getGameId() +
                " game difficulty ID: " + this.getGameDifficultyId() +
                " player name: " + this.getPlayerName() +
                " game state: " + this.getGameState() +
                " moves: " + this.getMoves() +
                " is it finished: " + this.isFinished();
    }
}
