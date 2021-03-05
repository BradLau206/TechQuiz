/**
 * Question Class
 *
 * Used to create Questions
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
public class Question {

    /**
     * All private variables
     */
    private int questionNum;
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String answerCorrect;

    /**
     * Question Constructor
     *
     * Constructor for the Question Class.
     *
     * @param question      String of the question asked
     */
    Question(String question) {
        this.question = question;
    }

    /**
     * Answer Setter
     *
     * Used to set all the answers in a given question.
     *
     * @param a     Answer A
     * @param b     Answer B
     * @param c     Answer C
     * @param d     Answer D
     */
    public void setAllAnswers(String a,String b,String c,String d) {
        this.answerA = a;
        this.answerB = b;
        this.answerC = c;
        this.answerD = d;
    }

    /**
     * Question Number Setter
     *
     * Used to set the question number.
     *
     * @param questionNum     int of the question
     */
    public void setQuestionNum(int questionNum) {
        this.questionNum = questionNum;
    }

    /**
     * Question String Getter
     *
     * Used to get the question String.
     *
     * @return the question
     */
    public String getQuestionString() {
        return question;
    }

    /**
     * Answer A Getter
     *
     * Used to get the Answer A.
     *
     * @return the answer A
     */
    public String getAnswerA() {
        return answerA;
    }

    /**
     * Answer B Getter
     *
     * Used to get the Answer B.
     *
     * @return the answer B
     */
    public String getAnswerB() {
        return answerB;
    }

    /**
     * Answer C Getter
     *
     * Used to get the Answer C.
     *
     * @return the answer C
     */
    public String getAnswerC() {
        return answerC;
    }

    /**
     * Answer D Getter
     *
     * Used to get the Answer D.
     *
     * @return the answer D
     */
    public String getAnswerD() {
        return answerD;
    }

    /**
     * Correct Answer Getter
     *
     * Used to get the Correct Answer.
     *
     * @return the correct answer
     */
    public String getAnswerCorrect() {
        return answerCorrect;
    }

    /**
     * Correct Answer Setter
     *
     * Used to set the Correct Answer.
     *
     * @param answerCorrect     used to set the correct answer
     */
    public void setAnswerCorrect(String answerCorrect) {
        this.answerCorrect = answerCorrect;
    }
}