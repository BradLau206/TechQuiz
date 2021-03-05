/**
 * Model Class
 *
 * Used to get a given question from a given category
 *
 * @author Bradley Lau
 * @version 1.0 April 16 - 2018
 */

/**
 * All required Java Util imports + sample package
 */
package sample;
import java.util.Random;

/**
 * Class.
 */
public class Model {

    /**
     * All Question Subclass References
     */
    private HardwareQuestions hardwareQuestionsClass = new HardwareQuestions();
    private BusinessInTechQuestions businessInTechQuestionsClass = new BusinessInTechQuestions();
    private CodingQuestions codingQuestionsClass = new CodingQuestions();
    private GamingQuestions gamingQuestionsClass = new GamingQuestions();

    /**
     * All Private Question Arrays
     */
    private Question[] hardware;
    private Question[] businessInTech;
    private Question[] coding;
    private Question[] gaming;
    private Question currentQuestion;

    /**
     * Private Random Object
     */
    private Random rand = new Random();

    /**
     * All Private Ints
     */
    private int randQuestion = 0;
    private int categorySelected = 0;
    private int count = 0;

    /**
     * Private Int Array used to store question references
     */
    private int[] allQuestionsAnswered = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

    /**
     * Model Constructor
     *
     * Constructor for the Model Class.
     */
    Model() {
        setAllQuestions();
    }

    /**
     * Question Array Setter
     *
     * Used to set all Question Arrays.
     */
    private void setAllQuestions() {
        hardware = hardwareQuestionsClass.getHardwareQuestions();
        businessInTech = businessInTechQuestionsClass.getBusinessInTechQuestions();
        coding = codingQuestionsClass.getCodingQuestions();
        gaming = gamingQuestionsClass.getGamingQuestions();
    }

    /**
     * Random Int Generator
     *
     * Used to generate a random int (then calls the current question)
     */
    public void rollRandomInt() {
        randQuestion = rand.nextInt(10);
        setCurrentQuestion();
    }

    /**
     * Current Question Setter
     *
     * Used to set the Current Question.
     */
    private void setCurrentQuestion() {
        checkAllQuestionsAnswered();
        if(categorySelected==1)
            currentQuestion = hardware[randQuestion];
        else if(categorySelected==2)
            currentQuestion = businessInTech[randQuestion];
        else if(categorySelected==3)
            currentQuestion = coding[randQuestion];
        else if(categorySelected==4)
            currentQuestion = gaming[randQuestion];
        allQuestionsAnswered[count] = randQuestion;
        System.out.println("Count: " + count);
        System.out.println("randQuestion: " + randQuestion);
        count++;
    }

    /**
     * Question Array Checker
     *
     * Used to see if all questions in a category have been answered.
     */
    private void checkAllQuestionsAnswered() {
        boolean randomized = false;
        int randomizedInt = 0;
        for(int i = 0; i < allQuestionsAnswered.length; i++) {
            if(allQuestionsAnswered[i]==randQuestion) {
                randQuestion = rand.nextInt(10);
                randomized = true;
                randomizedInt++;
                i=0;
            }
        }

        for(int i = 0; i < allQuestionsAnswered.length; i++) {
            System.out.print(allQuestionsAnswered[i]+" ");
        }
        System.out.println();

        if(randomized) {
            System.out.println("RANDOMIZED: " + randomizedInt);
        }
    }

    /**
     * Question Array Reset Method
     *
     * Used to reset the Question Array.
     */
    public void resetAnsweredQuestions() {
        for(int i = 0; i < allQuestionsAnswered.length; i++) {
            allQuestionsAnswered[i] = -1;
        }
        count=0;
    }

    /**
     * Count Getter Method
     *
     * Used to get Count.
     *
     * @return count int
     */
    public int getCount() {
        return count;
    }

    /**
     * Current Question Getter Method
     *
     * Used to get Current Question.
     *
     * @return the current question
     */
    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    /**
     * Category Selected Getter Method
     *
     * Used to get Category Selected.
     *
     * @return the selected category
     */
    public int getCategorySelected() {
        return categorySelected;
    }

    /**
     * Category Selected Setter Method
     *
     * Used to set Category Selected.
     *
     * @param input     int of the selected category
     */
    public void setCategorySelected(int input) {
        categorySelected = input;
    }
}
