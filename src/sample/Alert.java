/**
 * Alert Class
 *
 * The Alert Box used as notifications
 *
 * @author Bradley Lau
 * @version 1.0 April 16 - 2018
 */

/**
 * All required Javafx imports + sample package
 */
package sample;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Class.
 */
public class Alert {

    /**
     * All private labels
     */
    private Label answerStatus;
    private Label correctAnswer;
    private Label completeLabel;
    private Label noEntryLabel;
    private Label endStatus;

    /**
     * Private Stage
     */
    private Stage window;

    /**
     * Main Player
     */
    private Player mainPlayer;

    /**
     * All private VBoxes
     */
    private VBox answerVBox;
    private VBox completeVBox;
    private VBox noEntryVBox;
    private VBox endVBox;

    /**
     * All private Scenes
     */
    private Scene answerScene;
    private Scene completeScene;
    private Scene noEntryScene;
    private Scene endScene;

    /**
     * Alert Constructor
     *
     * Constructor for the Alert Class.
     */
    public Alert(Player player) {
        mainPlayer = player;
        answerStatus = new Label();
        correctAnswer = new Label();
        completeLabel = new Label();
        noEntryLabel = new Label();
        endStatus = new Label();
        window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        answerVBox = new VBox();
        answerScene = new Scene(answerVBox,500,100);
        answerVBox.getChildren().addAll(answerStatus,correctAnswer);
        completeVBox = new VBox();
        completeScene = new Scene(completeVBox,500,100);
        completeVBox.getChildren().addAll(completeLabel);
        noEntryVBox = new VBox();
        noEntryScene = new Scene(noEntryVBox,500,100);
        noEntryVBox.getChildren().addAll(noEntryLabel);
        endVBox = new VBox();
        endScene = new Scene(endVBox,500,100);
        endVBox.getChildren().addAll(endStatus);
    }

    /**
     * Answer Status Stage Setter Method
     *
     * Used to set the Answer Status Stage
     *
     * @param isCorrect             Used to see if player answered correctly
     * @param currentQuestion       Used to get the correct answer
     */
    public void setAnswerStatusWindow(boolean isCorrect, Question currentQuestion) {
        window.setTitle("Answer Result");
        if(isCorrect)
            setAnswerStatusCorrect();
        else
            setAnswerStatusIncorrect(currentQuestion);
        window.setScene(answerScene);
        window.showAndWait();
    }

    /**
     * Category Completion Stage Setter Method
     *
     * Used to set the Category Completion Stage
     */
    public void setCategoryCompleteWindow() {
        window.setTitle("Category Complete");
        completeLabel.setText("Congratulations " + mainPlayer.getName() + "! You finished a category!");
        completeLabel.setFont(new Font("Cambria",18));
        completeLabel.setTextFill(Color.GREEN);
        window.setScene(completeScene);
        window.showAndWait();
    }

    /**
     * Ending Stage Setter Method
     *
     * Used to set the Ending Stage
     *
     * @param isComplete       Used to see if all category's are complete
     */
    public void setEndWindow(boolean isComplete) {
        window.setTitle("Game Over");
        if(isComplete) {
            window.setTitle("You Won");
            endStatus.setText("Congratulations " + mainPlayer.getName() + "! You finished all the categories!"
            + "\nYour total score is " + mainPlayer.getPoints()
            + "\nMaybe you would like to play again.");
            endStatus.setTextFill(Color.GREEN);
        }
        else{
            endStatus.setText("Sorry " + mainPlayer.getName() + ". You lost all your lives."
            + "\nYour total score is " + mainPlayer.getPoints()
            + "\nMaybe you would like to play again.");
            endStatus.setTextFill(Color.RED);
        }
        endStatus.setFont(new Font("Cambria",18));
        window.setScene(endScene);
        window.showAndWait();
    }

    /**
     * Category Completion Stage Setter Method
     *
     * Used to set the Category Completion Stage
     */
    public void setNoEntryWindow() {
        window.setTitle("Error");
        noEntryLabel.setText("You already completed this category.");
        noEntryLabel.setFont(new Font("Cambria",18));
        noEntryLabel.setTextFill(Color.RED);
        window.setScene(noEntryScene);
        window.showAndWait();
    }

    /**
     * Answer Status Setter Method (Correct)
     *
     * Used to set the Answer Status as Correct
     */
    private void setAnswerStatusCorrect() {
        answerStatus.setText("That's right " + mainPlayer.getName() + "!");
        answerStatus.setFont(new Font("Cambria",18));
        answerStatus.setTextFill(Color.GREEN);
        correctAnswer.setText("");
    }

    /**
     * Answer Status Setter Method (Incorrect)
     *
     * Used to set the Answer Status as Incorrect
     */
    private void setAnswerStatusIncorrect(Question currentQuestion) {
        answerStatus.setText("Sorry " + mainPlayer.getName() + ", that's incorrect.");
        answerStatus.setFont(new Font("Cambria",18));
        answerStatus.setTextFill(Color.RED);
        correctAnswer.setText("Correct Answer:     " + currentQuestion.getAnswerCorrect());
        correctAnswer.setFont(new Font("Cambria",18));
    }
}