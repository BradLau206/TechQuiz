/**
 * Hardware Question Class
 *
 * Used to create Hardware Questions
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
public class HardwareQuestions {

    /**
     * All Hardware Questions
     */
    private Question q1 = new Question("What does ROM stand for?");
    private Question q2 = new Question("Integrated Circuits are a part which computer generation?");
    private Question q3 = new Question("What did the first computers use to store memory?");
    private Question q4 = new Question("What was the name of the first computer?");
    private Question q5 = new Question("The IBM 7094 was the first computer that was programmed to sing a song. What was the song?");
    private Question q6 = new Question("What was the most common color used for the original Mac and Windows computers?");
    private Question q7 = new Question("Transistors are a part which computer generation?");
    private Question q8 = new Question("Microprocessors are a part which computer generation?");
    private Question q9 = new Question("Vacuum Tubes are a part which computer generation?");
    private Question q10 = new Question("Which of the following is NOT an example of hardware?");

    /**
     * Question Array
     */
    private Question[] qArr = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};

    /**
     * Hardware Questions Constructor
     *
     * Constructor for the Hardware Questions Class.
     */
    HardwareQuestions() {
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
        q1.setAllAnswers("Read-once Memory","Ready-on Mode","Read-only Memory","Red-on Memo");
        q2.setAllAnswers("1st","2nd","3rd","4th");
        q3.setAllAnswers("Memory Chips","Databases","Vacuum Tubes","Transistors");
        q4.setAllAnswers("HAL","IBM 7094","Glados","ENIAC");
        q5.setAllAnswers("Happy Birthday","Daisy Bell","Cotton Eye Joe","Star-Spangled Banner");
        q6.setAllAnswers("Dark Gray","Baby Blue","Beige","Green");
        q7.setAllAnswers("1st","2nd","3rd","4th");
        q8.setAllAnswers("1st","2nd","3rd","4th");
        q9.setAllAnswers("1st","2nd","3rd","4th");
        q10.setAllAnswers("Monitor","Mouse","Operating System","Keyboard");
    }

    /**
     * Correct Answer Setter
     *
     * Used to set all the correct answers.
     */
    private void setCorrectAnswers() {
        q1.setAnswerCorrect(q1.getAnswerC());
        q2.setAnswerCorrect(q2.getAnswerC());
        q3.setAnswerCorrect(q3.getAnswerC());
        q4.setAnswerCorrect(q4.getAnswerD());
        q5.setAnswerCorrect(q5.getAnswerB());
        q6.setAnswerCorrect(q6.getAnswerC());
        q7.setAnswerCorrect(q7.getAnswerB());
        q8.setAnswerCorrect(q8.getAnswerD());
        q9.setAnswerCorrect(q9.getAnswerA());
        q10.setAnswerCorrect(q10.getAnswerC());
    }

    /**
     * Question Number Setter
     *
     * Used to set all the question numbers.
     */
    private void setAllQuestionNums() {
        for (int i = 0; i < qArr.length; i++)
            qArr[i].setQuestionNum(i+1);
    }

    /**
     * Question Array Getter
     *
     * Used to get the question array.
     *
     * @return the question array
     */
    public Question[] getHardwareQuestions() {
        return qArr;
    }
}
