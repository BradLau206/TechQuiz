/**
 * Business in Tech Question Class
 *
 * Used to create Business in Tech Questions
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
public class BusinessInTechQuestions {

    /**
     * All Business in Tech Questions
     */
    private Question q1 = new Question("Who was the first person to invest in Apple?");
    private Question q2 = new Question("What year did the first generation iPhone release?");
    private Question q3 = new Question("Which tech company developed a GUI that was purchased by Apple for the first Mac?");
    private Question q4 = new Question("Which of the following is NOT a Mozilla product?");
    private Question q5 = new Question("Although Steve Jobs is best known as a co-founder of Apple, where did he originally work?");
    private Question q6 = new Question("What year was IBM originally founded?");
    private Question q7 = new Question("What year was Microsoft originally founded?");
    private Question q8 = new Question("Who helped co-found Microsoft with Bill Gates?");
    private Question q9 = new Question("Who replaced Bill Gates as CEO of Microsoft in 2000?");
    private Question q10 = new Question("Who of the following is NOT a founder of AOL?");

    /**
     * Question Array
     */
    private Question[] qArr = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};

    /**
     * Business in Tech Questions Constructor
     *
     * Constructor for the Hardware Questions Class.
     */
    BusinessInTechQuestions() {
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
        q1.setAllAnswers("John Sculley","Bill Gates","Mark Markkula","Steve Jobs");
        q2.setAllAnswers("2005","2006","2007","2008");
        q3.setAllAnswers("Google","Xerox","Intel","Mozilla");
        q4.setAllAnswers("Firefox","Thunderbird","SeaMonkey","Brave");
        q5.setAllAnswers("Microsoft","Atari","IBM","Mozilla");
        q6.setAllAnswers("1911","1921","1931","1941");
        q7.setAllAnswers("1983","1980","1985","1975");
        q8.setAllAnswers("Steve Jobs","Steve Ballmer","Paul Allen","Brad Smith");
        q9.setAllAnswers("Phil Spencer","Paul Allen","Brad Smith","Steve Ballmer");
        q10.setAllAnswers("Steve Case","John Sculley","Marc Seriff","Jim Kimsey");
    }

    /**
     * Correct Answer Setter
     *
     * Used to set all the correct answers.
     */
    private void setCorrectAnswers() {
        q1.setAnswerCorrect(q1.getAnswerC());
        q2.setAnswerCorrect(q2.getAnswerC());
        q3.setAnswerCorrect(q3.getAnswerB());
        q4.setAnswerCorrect(q4.getAnswerD());
        q5.setAnswerCorrect(q5.getAnswerB());
        q6.setAnswerCorrect(q6.getAnswerA());
        q7.setAnswerCorrect(q7.getAnswerD());
        q8.setAnswerCorrect(q8.getAnswerC());
        q9.setAnswerCorrect(q9.getAnswerD());
        q10.setAnswerCorrect(q10.getAnswerB());
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
    public Question[] getBusinessInTechQuestions() {
        return qArr;
    }
}
