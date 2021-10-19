package com.apples.game.domain;

/**
 * Class which contains all necessary fields of game difficulty object.
 */
public class GameDifficulty {

    private byte gameDifficultyId;
    private String name;
    private byte appleCount;

    /**
     * Default constructor.
     */
    public GameDifficulty() {
        // nothing to do here
    }

    /**
     * Game difficulty constructor with parameters.
     *
     * @param pGameDifficultyId gameDifficultyId to set.
     * @param pName name to set.
     * @param pAppleCount appleCount to set.
     */
    public GameDifficulty(byte pGameDifficultyId, String pName, byte pAppleCount) {
        this.gameDifficultyId = pGameDifficultyId;
        this.name = pName;
        this.appleCount = pAppleCount;
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
     * Getter for name field.
     * @return name value.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name field.
     * @param pName new name value.
     */
    public void setName(String pName) {
        this.name = pName;
    }

    /**
     * Getter for appleCount field.
     * @return appleCount value.
     */
    public byte getAppleCount() {
        return appleCount;
    }

    /**
     * Setter for appleCount field.
     * @param pAppleCount new appleCount value.
     */
    public void setAppleCount(byte pAppleCount) {
        this.appleCount = pAppleCount;
    }
}
