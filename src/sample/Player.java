/**
 * Player Class
 *
 * The player object
 *
 * @author Bradley Lau
 * @version 1.0 April 16 - 2018
 */

/**
 * All required Javafx imports + sample package
 */
package sample;

/**
 * Class.
 */
public class Player {

    /**
     * All required private variables
     */
    private String name;
    private int points;
    private int multiplier;
    private int lives;
    private boolean completeHardware;
    private boolean completeBusinessInTech;
    private boolean completeCoding;
    private boolean completeGaming;

    /**
     * Player Constructor
     *
     * Constructor for the Player Class.
     */
    Player() {
        points = 0;
        lives = 3;
        multiplier = 1;
        completeHardware = false;
        completeBusinessInTech = false;
        completeCoding = false;
        completeGaming = false;
    }

    /**
     * Name Setter Method
     *
     * Used to set the name of a player
     *
     * @param input     Used to get name
     */
    public void setName(String input) {
        name = input;
    }

    /**
     * Name Getter Method
     *
     * Used to get Name
     */
    public String getName() {
        return name;
    }

    /**
     * Points Setter Method
     *
     * Used to set the name of a player
     *
     * @param input     Used to get points
     */
    public void setPoints(int input) {
        points += input;
    }

    /**
     * Points Getter Method
     *
     * Used to get Points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Lives Getter Method
     *
     * Used to get Lives
     */
    public int getLives() {
        return lives;
    }

    /**
     * Lives Setter Method
     *
     * Used to set the lives of a player
     */
    public void setLives() {
        lives--;
    }

    /**
     * Multiplier Setter Method
     *
     * Used to set the multiplier of a player
     *
     * @param input     Used to see if player got the question correct
     */
    public void setMultiplier(boolean isCorrect) {
        if(isCorrect)
            if(multiplier<5)
                multiplier++;
        else
            multiplier = 1;
    }

    /**
     * Multiplier Getter Method
     *
     * Used to get Multiplier
     */
    public int getMultiplier() {
        return multiplier;
    }

    /**
     * Hardware Completion Setter Method
     *
     * Used to set Hardware as complete or incomplete
     *
     * @param input     Used to so if Hardware is complete
     */
    public void setCompleteHardware(boolean input) {
        completeHardware = input;
    }

    /**
     * Business in Tech Completion Setter Method
     *
     * Used to set Business in Tech as complete or incomplete
     *
     * @param input     Used to so if Business in Tech is complete
     */
    public void setCompleteBusinessInTech(boolean input) {
        completeBusinessInTech = input;
    }

    /**
     * Coding Completion Setter Method
     *
     * Used to set Coding as complete or incomplete
     *
     * @param input     Used to so if Coding is complete
     */
    public void setCompleteCoding(boolean input) {
        completeCoding = input;
    }

    /**
     * Gaming Completion Setter Method
     *
     * Used to set Gaming as complete or incomplete
     *
     * @param input     Used to so if Gaming is complete
     */
    public void setCompleteGaming(boolean input) {
        completeGaming = input;
    }

    /**
     * Hardware Completion Getter Method
     *
     * Used to get Hardware as complete or incomplete
     */
    public boolean isCompleteHardware() {
        return completeHardware;
    }

    /**
     * Business in Tech Completion Getter Method
     *
     * Used to get Business in Tech as complete or incomplete
     */
    public boolean isCompleteBusinessInTech() {
        return completeBusinessInTech;
    }

    /**
     * Coding Completion Getter Method
     *
     * Used to get Coding as complete or incomplete
     */
    public boolean isCompleteCoding() {
        return completeCoding;
    }

    /**
     * Gaming Completion Getter Method
     *
     * Used to get Gaming as complete or incomplete
     */
    public boolean isCompleteGaming() {
        return completeGaming;
    }

    /**
     * Player Data Reset Method
     *
     * Used to reset Player Data
     */
    public void resetPlayer() {
        points = 0;
        lives = 3;
        multiplier = 1;
        completeHardware = false;
        completeBusinessInTech = false;
        completeCoding = false;
        completeGaming = false;
    }
}