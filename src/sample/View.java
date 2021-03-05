/**
 * View Class
 *
 * Used to display images for the program
 *
 * @author Bradley Lau
 * @version 1.0 April 16 - 2018
 */

/**
 * All required Javafx imports + sample package
 */
package sample;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

/**
 * Class.
 */
public class View {

    /**
     * Private Stage
     */
    private Stage currentStage;

    /**
     * All Private Images
     */
    private Image hardware = new Image(getClass().getResource("hardware.png").toString());
    private Image businessInTech = new Image(getClass().getResource("businessInTech.png").toString());
    private Image coding = new Image(getClass().getResource("coding.png").toString());
    private Image gaming = new Image(getClass().getResource("gaming.png").toString());
    private Image cover = new Image(getClass().getResource("robot.png").toString());

    /**
     * All Private ImageViews
     */
    private ImageView questionImageView = new ImageView();
    private ImageView coverImageView = new ImageView();
    private ImageView hardwareImageView = new ImageView();
    private ImageView businessInTechImageView = new ImageView();
    private ImageView codingImageView = new ImageView();
    private ImageView gamingImageView = new ImageView();

    /**
     * Private Model
     */
    private Model model;

    /**
     * Private Player
     */
    private Player player = new Player();

    /**
     * Private Alert
     */
    private Alert alert = new Alert(player);

    /**
     * All Private Buttons
     */
    private Button letterA = new Button("Insert answer here.");
    private Button letterB = new Button("Insert answer here.");
    private Button letterC = new Button("Insert answer here.");
    private Button letterD = new Button("Insert answer here.");
    private Button nameSubmit = new Button("Play Game!");
    private Button hardwareButton = new Button("Hardware");
    private Button businessInTechButton = new Button("Business in Tech");
    private Button codingButton = new Button("Coding");
    private Button gamingButton = new Button("Gaming");

    /**
     * All Private Labels
     */
    private Label questionText = new Label("Insert question here.");
    private Label categoryText = new Label("Insert category here.");
    private Label pointCounter = new Label("Points: " + Integer.toString(player.getPoints()));
    private Label livesCounter = new Label("Lives: " + Integer.toString(player.getLives()));
    private Label nameInputLabel = new Label("Welcome to the Tech Quiz! Please enter your name.");
    private Label categorySelectLabel = new Label("Select a Category.");

    /**
     * Private TextField
     */
    private TextField nameInputTextField = new TextField();

    /**
     * All Private GridPanes
     */
    private GridPane questionGridPane = new GridPane();
    private GridPane nameInputGridPane = new GridPane();
    private GridPane categoryGridPane = new GridPane();

    /**
     * All Private Scenes
     */
    private Scene questionScene = new Scene(questionGridPane,800,400);
    private Scene nameInputScene = new Scene(nameInputGridPane,800,400);
    private Scene categorySelect = new Scene(categoryGridPane,800,400);

    /**
     * Private Questionse
     */
    private Question currentQuestion;

    /**
     * Private int
     */
    private int categoryNum;

    /**
     * View Constructor
     *
     * Constructor for the View Class.
     *
     * @param primaryStage     the main stage for the program
     * @param _model           the main model for the program
     */
    public View(Stage primaryStage,Model _model) {
        model = _model;
        currentStage = primaryStage;
        currentStage.setTitle("Tech Quiz");
        setQuestionGridPane();
        setNameInputGridPane();
        setCategoryGridPane();
        setNameInputTextField();
        setCoverImageView();
        setCategoryImageViews();
        setChildren();
        setButtonsOnAction();
        setLabelFonts();
        currentStage.setScene(nameInputScene);
    }

    /**
     * Question GridPane Setter Method
     *
     * Setter for the Question GridPane.
     */
    private void setQuestionGridPane() {
        GridPane.setConstraints(questionImageView,0,0);
        GridPane.setConstraints(categoryText,0,1);
        GridPane.setConstraints(questionText,0,2);
        GridPane.setConstraints(letterA,0,3);
        GridPane.setConstraints(letterB,0,4);
        GridPane.setConstraints(letterC,0,5);
        GridPane.setConstraints(letterD,0,6);
        GridPane.setConstraints(pointCounter,0,7);
        GridPane.setConstraints(livesCounter,0,8);
        questionGridPane.setHgap(10);
        questionGridPane.setVgap(10);
    }

    /**
     * Name Input GridPane Setter Method
     *
     * Setter for the Name Input GridPane.
     */
    private void setNameInputGridPane() {
        GridPane.setConstraints(coverImageView,0,0);
        GridPane.setConstraints(nameInputLabel,0,1);
        GridPane.setConstraints(nameSubmit,1,2);
        GridPane.setConstraints(nameInputTextField,0,2);
        nameInputGridPane.setHgap(10);
        nameInputGridPane.setVgap(50);
    }

    /**
     * Category GridPane Setter Method
     *
     * Setter for the Category GridPane.
     */
    private void setCategoryGridPane() {
        GridPane.setConstraints(categorySelectLabel,0,0);
        GridPane.setConstraints(hardwareImageView,1,1);
        GridPane.setConstraints(hardwareButton,2,1);
        GridPane.setConstraints(businessInTechImageView,1,2);
        GridPane.setConstraints(businessInTechButton,2,2);
        GridPane.setConstraints(codingImageView,1,3);
        GridPane.setConstraints(codingButton,2,3);
        GridPane.setConstraints(gamingImageView,1,4);
        GridPane.setConstraints(gamingButton,2,4);
        categoryGridPane.setHgap(100);
        categoryGridPane.setVgap(10);
    }

    /**
     * Label Fonts Setter Method
     *
     * Setter for the Fonts of labels and buttons.
     */
    private void setLabelFonts() {
        letterA.setFont(new Font("Cambria",18));
        letterB.setFont(new Font("Cambria",18));
        letterC.setFont(new Font("Cambria",18));
        letterD.setFont(new Font("Cambria",18));
        questionText.setFont(new Font("Cambria",18));
        categoryText.setFont(new Font("Cambria",18));
        pointCounter.setFont(new Font("Cambria",18));
        livesCounter.setFont(new Font("Cambria",18));
        nameInputLabel.setFont(new Font("Cambria",18));
        nameSubmit.setFont(new Font("Cambria",18));
        hardwareButton.setFont(new Font("Cambria",18));
        businessInTechButton.setFont(new Font("Cambria",18));
        codingButton.setFont(new Font("Cambria",18));
        gamingButton.setFont(new Font("Cambria",18));
        categorySelectLabel.setFont(new Font("Cambria",18));
        nameInputTextField.setFont(new Font("Cambria",18));
    }

    /**
     * Category ImageViews Setter Method
     *
     * Setter for the Category ImageViews.
     */
    private void setCategoryImageViews() {
        hardwareImageView.setImage(hardware);
        hardwareImageView.setFitHeight(80);
        hardwareImageView.setFitWidth(80);
        businessInTechImageView.setImage(businessInTech);
        businessInTechImageView.setFitHeight(80);
        businessInTechImageView.setFitWidth(80);
        codingImageView.setImage(coding);
        codingImageView.setFitHeight(80);
        codingImageView.setFitWidth(80);
        gamingImageView.setImage(gaming);
        gamingImageView.setFitHeight(80);
        gamingImageView.setFitWidth(80);
    }

    /**
     * Cover ImageView Setter Method
     *
     * Setter for the Cover ImageView.
     */
    private void setCoverImageView() {
        coverImageView.setImage(cover);
        coverImageView.setFitWidth(130);
        coverImageView.setFitHeight(130);
    }

    /**
     * Question ImageView Setter Method
     *
     * Setter for the Question ImageView.
     */
    private void setQuestionImageView() {
        questionImageView.setFitHeight(90);
        questionImageView.setFitWidth(90);
        if(model.getCategorySelected()==1) {
            questionImageView.setImage(hardware);
            categoryText.setText("Hardware:");
        }
        else if(model.getCategorySelected()==2) {
            questionImageView.setImage(businessInTech);
            categoryText.setText("Business in Tech:");
        }
        else if(model.getCategorySelected()==3) {
            questionImageView.setImage(coding);
            categoryText.setText("Coding:");
        }
        else if(model.getCategorySelected()==4) {
            questionImageView.setImage(gaming);
            categoryText.setText("Gaming:");
        }
    }

    /**
     * Button Setter Method
     *
     * Setter for the Buttons.
     */
    private void setButtonsOnAction() {
        letterA.setOnAction(this::answerHandler);
        letterB.setOnAction(this::answerHandler);
        letterC.setOnAction(this::answerHandler);
        letterD.setOnAction(this::answerHandler);
        nameSubmit.setOnAction(this::nameSubmitHandler);
        hardwareButton.setOnAction(this::categoryHandler);
        businessInTechButton.setOnAction(this::categoryHandler);
        codingButton.setOnAction(this::categoryHandler);
        gamingButton.setOnAction(this::categoryHandler);
    }

    /**
     * Children Setter Method
     *
     * Setter for all children of the program.
     */
    private void setChildren() {
        questionGridPane.getChildren().addAll(questionText,letterA,letterB,letterC,letterD,questionImageView,
                categoryText,pointCounter,livesCounter);
        nameInputGridPane.getChildren().addAll(nameInputLabel,nameInputTextField,coverImageView,nameSubmit);
        categoryGridPane.getChildren().addAll(hardwareImageView,businessInTechImageView,codingImageView,
                gamingImageView,hardwareButton,businessInTechButton,codingButton,gamingButton,categorySelectLabel);
    }

    /**
     * Name Input TextField Setter Method
     *
     * Default name for the Name Input.
     */
    private void setNameInputTextField() {
        nameInputTextField.setText("John Doe");
    }

    /**
     * Current Question Setter Method
     *
     * Setter for the Current Question.
     */
    private void setCurrentQuestion() {
        model.rollRandomInt();
        currentQuestion = model.getCurrentQuestion();
        questionText.setText(currentQuestion.getQuestionString());
        letterA.setText("A.\t" + currentQuestion.getAnswerA() + "\t");
        letterB.setText("B.\t" + currentQuestion.getAnswerB() + "\t");
        letterC.setText("C.\t" + currentQuestion.getAnswerC() + "\t");
        letterD.setText("D.\t" + currentQuestion.getAnswerD() + "\t");
    }

    /**
     * Name Submit Handler
     *
     * Used to handle Name input.
     *
     * @param event     Used to detect button presses
     */
    private void nameSubmitHandler(ActionEvent event) {
        if(event.getSource()==nameSubmit){
            currentStage.setScene(categorySelect);
            player.setName(nameInputTextField.getText());
        }
    }

    /**
     * Category Handler
     *
     * Used to handle selected Categories.
     *
     * @param event     Used to detect button presses
     */
    private void categoryHandler(ActionEvent event) {
        if(event.getSource()==hardwareButton){
            categoryNum = 1;
            checkCategoryCompletion();
        }
        else if(event.getSource()==businessInTechButton) {
            categoryNum = 2;
            checkCategoryCompletion();
        }
        else if(event.getSource()==codingButton) {
            categoryNum = 3;
            checkCategoryCompletion();
        }
        else if(event.getSource()==gamingButton) {
            categoryNum = 4;
            checkCategoryCompletion();
        }
    }

    /**
     * Category Completion Checker
     *
     * Used to check if a category has been completed.
     */
    private void checkCategoryCompletion() {
        if(categoryNum==1) {
            if(!player.isCompleteHardware()) {
                categoryUpdate(categoryNum);
                player.setCompleteHardware(true);
            }
            else
                alert.setNoEntryWindow();
        }
        else if(categoryNum==2) {
            if(!player.isCompleteBusinessInTech()) {
                categoryUpdate(categoryNum);
                player.setCompleteBusinessInTech(true);
            }
            else
                alert.setNoEntryWindow();
        }
        else if(categoryNum==3) {
            if(!player.isCompleteCoding()) {
                categoryUpdate(categoryNum);
                player.setCompleteCoding(true);
            }
            else
                alert.setNoEntryWindow();
        }
        else if(categoryNum==4) {
            if(!player.isCompleteGaming()) {
                categoryUpdate(categoryNum);
                player.setCompleteGaming(true);
            }
            else {
                alert.setNoEntryWindow();
            }
        }
    }

    /**
     * Answer Handler
     *
     * Used to handle selected Answers.
     *
     * @param event     Used to detect button presses
     */
    private void answerHandler(ActionEvent event) {
        if(event.getSource()==letterA) {
            answerUpdateLetterA();
        }
        else if(event.getSource()==letterB) {
            answerUpdateLetterB();
        }
        else if(event.getSource()==letterC) {
            answerUpdateLetterC();
        }
        else if(event.getSource()==letterD) {
            answerUpdateLetterD();
        }
    }

    /**
     * Answer Selection A
     *
     * Handles All events around answer A.
     */
    private void answerUpdateLetterA() {
        boolean isCorrect = false;
        if(currentQuestion.getAnswerA().equals(currentQuestion.getAnswerCorrect())) {
            isCorrect = true;
            updatePointCount(isCorrect);
        }
        else
            updatePointCount(isCorrect);
    }

    /**
     * Answer Selection B
     *
     * Handles All events around answer B.
     */
    private void answerUpdateLetterB() {
        boolean isCorrect = false;
        if(currentQuestion.getAnswerB().equals(currentQuestion.getAnswerCorrect())) {
            isCorrect = true;
            updatePointCount(isCorrect);
        }
        else
            updatePointCount(isCorrect);
    }

    /**
     * Answer Selection C
     *
     * Handles All events around answer C.
     */
    private void answerUpdateLetterC() {
        boolean isCorrect = false;
        if(currentQuestion.getAnswerC().equals(currentQuestion.getAnswerCorrect())) {
            isCorrect = true;
            updatePointCount(isCorrect);
        }
        else
            updatePointCount(isCorrect);
    }

    /**
     * Answer Selection D
     *
     * Handles All events around answer D.
     */
    private void answerUpdateLetterD() {
        boolean isCorrect = false;
        if(currentQuestion.getAnswerD().equals(currentQuestion.getAnswerCorrect())) {
            isCorrect = true;
            updatePointCount(isCorrect);
        }
        else
            updatePointCount(isCorrect);
    }

    /**
     * Point Count Updater
     *
     * Used to update scores and display them for the program.
     *
     * @param isCorrect     Used to see if answer is correct or incorrect
     */
    private void updatePointCount(boolean isCorrect) {
        if(isCorrect) {
            alert.setAnswerStatusWindow(isCorrect,currentQuestion);
            checkCountAndUpdateScores(isCorrect);
        }
        else {
            resetAndUpdateLives(isCorrect);
        }
        pointCounter.setText("Points: " + Integer.toString(player.getPoints()));
        livesCounter.setText("Lives: " + Integer.toString(player.getLives()));
    }

    /**
     * Question Count and Score updater
     *
     * Used check the current question count and update points
     *
     * @param isCorrect     Used to see if answer is correct or incorrect
     */
    private void checkCountAndUpdateScores(boolean isCorrect) {
        if(model.getCount()==10) {
            alert.setCategoryCompleteWindow();
            player.setPoints(player.getMultiplier() + 100);
            player.setMultiplier(isCorrect);
            model.resetAnsweredQuestions();
            checkLivesAndCategories();
        }
        else {
            setCurrentQuestion();
            setQuestionImageView();
            player.setMultiplier(isCorrect);
            player.setPoints(player.getMultiplier());
        }
    }

    /**
     * Wrong Answer Update
     *
     * Used to handle all events regarding an incorrect answer.
     *
     * @param isCorrect     Used to see if answer is correct or incorrect
     */
    private void resetAndUpdateLives(boolean isCorrect) {
        alert.setAnswerStatusWindow(isCorrect,currentQuestion);
        if(categoryNum==1) {
            player.setCompleteHardware(false);
            categoryNum = 0;
        }
        else if(categoryNum==2) {
            player.setCompleteBusinessInTech(false);
        }
        else if(categoryNum==3) {
            player.setCompleteCoding(false);
            categoryNum = 0;
        }
        else if(categoryNum==4) {
            player.setCompleteGaming(false);
            categoryNum = 0;
        }
        player.setMultiplier(isCorrect);
        player.setLives();
        model.resetAnsweredQuestions();
        checkLivesAndCategories();
    }

    /**
     * Lives Checker and Category Checker
     *
     * Used to check lives and category completion.
     */
    private void checkLivesAndCategories() {
        boolean isComplete = false;
        if(player.getLives() == -1) {
            alert.setEndWindow(isComplete);
            currentStage.setScene(nameInputScene);
            player.resetPlayer();
        }
        else if(player.isCompleteHardware()&&player.isCompleteBusinessInTech()&&player.isCompleteCoding()&&player.isCompleteGaming()) {
            isComplete = true;
            alert.setEndWindow(isComplete);
            currentStage.setScene(nameInputScene);
            player.resetPlayer();
        }
        else
            currentStage.setScene(categorySelect);
    }

    /**
     * Category Updater
     *
     * Used to update Category.
     *
     * @param input     used to category
     */
    private void categoryUpdate(int input) {
        model.setCategorySelected(input);
        currentStage.setScene(questionScene);
        setQuestionImageView();
        setCurrentQuestion();
    }
}