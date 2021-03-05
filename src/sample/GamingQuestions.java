/**
 * Gaming Question Class
 *
 * Used to create Gaming Questions
 *
 * @author Bradley Lau
 * @version 1.0 April 16 - 2018
 */

/**
 * sample package
 */
package sample;

/**
 * Class.
 */
public class GamingQuestions {

    /**
     * All Gaming Questions
     */
    private Question q1 = new Question("Which of the following games was NOT originally made and published by Atari?");
    private Question q2 = new Question("Playstation 2, Xbox(2001), Gamecube, and Dreamcast are all part of which console generation?");
    private Question q3 = new Question("Which game console has sold the most units of all time since the 7th console generation?");
    private Question q4 = new Question("Which game is considered the number one best selling PS2 game/port?");
    private Question q5 = new Question("Which game is considered the number one best selling Xbox(2001) game/port?");
    private Question q6 = new Question("Kratos, Ratchet & Clank, and Master Chief where all NEW gaming mascots in which console generation?");
    private Question q7 = new Question("What was Atari's last known (and most notorious) game before they went out of business?");
    private Question q8 = new Question("Sega Master System, and Nintendo Entertainment System are all part of which console generation?");
    private Question q9 = new Question("Which game is considered the number one best selling Wii game?");
    private Question q10 = new Question("Who of the following is NOT a famous video game developer?");

    /**
     * Question Array
     */
    private Question[] qArr = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};

    /**
     * Gaming Questions Constructor
     *
     * Constructor for the Gaming Questions Class.
     */
    GamingQuestions() {
        setAnswers();
        setCorrectAnswers();
        setAllQuestionNums();
    }

    /**
     * Answer Setter
     *
     * Used to set all the answers.
     */
    private void setAnswers() {
        q1.setAllAnswers("Asteroids","Pacman","Centipede","Combat");
        q2.setAllAnswers("5th","6th","7th","8th");
        q3.setAllAnswers("Playstation 2","Wii","Atari 2600","Xbox 360");
        q4.setAllAnswers("Grand Theft Auto: San Andreas","Metal Gear Solid 2: Sons of Liberty","Gran Turismo 3: A-Spec","Kingdom Hearts");
        q5.setAllAnswers("Fable","Star Wars: Knights of the Old Republic","Halo 2","Tom Clancy's Splinter Cell");
        q6.setAllAnswers("6th","7th","8th","9th");
        q7.setAllAnswers("Pacman (Atari 2600 port)","Top Gun: The Video Game","ET: The Video Game","Shaq-Fu");
        q8.setAllAnswers("2nd","3rd","4th","5th");
        q9.setAllAnswers("New Super Mario Bros. Wii","Mario Kart Wii","Wii Sports","Super Smash Bros. Brawl");
        q10.setAllAnswers("Shigeru Miyamoto","Edmund McMillen","John Romero","Shuhei Yoshida");
    }

    /**
     * Correct Answer Setter
     *
     * Used to set all the correct answers.
     */
    private void setCorrectAnswers() {
        q1.setAnswerCorrect(q1.getAnswerB());
        q2.setAnswerCorrect(q2.getAnswerB());
        q3.setAnswerCorrect(q3.getAnswerA());
        q4.setAnswerCorrect(q4.getAnswerA());
        q5.setAnswerCorrect(q5.getAnswerC());
        q6.setAnswerCorrect(q6.getAnswerA());
        q7.setAnswerCorrect(q7.getAnswerC());
        q8.setAnswerCorrect(q8.getAnswerB());
        q9.setAnswerCorrect(q9.getAnswerC());
        q10.setAnswerCorrect(q10.getAnswerD());
    }

    /**
     * Question Number Setter
     *
     * Used to set all the question numbers.
     */
    private void setAllQuestionNums() {
        for (int i = 0; i < qArr.length; i++)
            qArr[i].setQuestionNum(i);
    }

    /**
     * Question Array Getter
     *
     * Used to get the question array.
     *
     * @return the question array
     */
    public Question[] getGamingQuestions() {
        return qArr;
    }
}
