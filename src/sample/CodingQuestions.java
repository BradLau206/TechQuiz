/**
 * Coding Question Class
 *
 * Used to create Coding Questions
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
public class CodingQuestions {

    /**
     * All Coding Questions
     */
    private Question q1 = new Question("What are examples of high level programming languages?");
    private Question q2 = new Question("Which of the following is NOT a primitive data type for Java?");
    private Question q3 = new Question("Which language was the videogame Minecraft programmed with?");
    private Question q4 = new Question("What is the best way to name a class in Java?");
    private Question q5 = new Question("What is the best way to name a variable in Java?");
    private Question q6 = new Question("What is used to translate high level language into machine language?");
    private Question q7 = new Question("What best defines a String?");
    private Question q8 = new Question("To override a method, what do you need to change?");
    private Question q9 = new Question("What is the purpose of Model-View-Controller?");
    private Question q10 = new Question("Which of the following is NOT a legitimate variable declaration?");

    /**
     * Question Array
     */
    private Question[] qArr = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};

    /**
     * Coding Questions Constructor
     *
     * Constructor for the Coding Questions Class.
     */
    CodingQuestions() {
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
        q1.setAllAnswers("Assembly and Punch Cards","Java, C, and Python","Machine Language and Transistors","None of the above");
        q2.setAllAnswers("int","char","boolean","String");
        q3.setAllAnswers("C++","Java","C#","Python");
        q4.setAllAnswers("myClass","MyClass","myclass","Myclass");
        q5.setAllAnswers("MyVariable","myvariable","myVariable","Myvariable");
        q6.setAllAnswers("Array","Stack","Translator","Compiler");
        q7.setAllAnswers("An object of combined chars.","A primitive datatype.","An array of ints.","A single letter.");
        q8.setAllAnswers("The Name","The Parameters","The Return Type","Nothing");
        q9.setAllAnswers("Changing the order of variables.","Creating arrays for a method.","Splitting up processes of an interface.","None of the above.");
        q10.setAllAnswers("int myAge = 20;","boolean isMale = true;","String name = \"Bradley\";","boolean 7Moreyears_UNTIL = false;");
    }

    /**
     * Correct Answer Setter
     *
     * Used to set all the correct answers.
     */
    private void setCorrectAnswers() {
        q1.setAnswerCorrect(q1.getAnswerB());
        q2.setAnswerCorrect(q2.getAnswerD());
        q3.setAnswerCorrect(q3.getAnswerB());
        q4.setAnswerCorrect(q4.getAnswerB());
        q5.setAnswerCorrect(q5.getAnswerC());
        q6.setAnswerCorrect(q6.getAnswerD());
        q7.setAnswerCorrect(q7.getAnswerA());
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
    public Question[] getCodingQuestions() {
        return qArr;
    }
}
