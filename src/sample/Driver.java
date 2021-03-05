/**
 * Driver Class
 *
 * Used to run the program
 *
 * @author Bradley Lau
 * @version 1.0 April 16 - 2018
 */

/**
 * All required Javafx imports + sample package.
 */
package sample;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Class.
 */
public class Driver extends Application {

    /**
     * All class references
     */
    private Model model = new Model();
    private View view;

    /**
     * Launch Arguments
     */
    public static void main(String args[]) {
        launch(args);
    }

    /**
     * Start Method
     *
     * Used to start the program
     *
     * @param primaryStage  main stage used to display the program
     */
    public void start(Stage primaryStage) throws Exception {
        view = new View(primaryStage,model);
        primaryStage.show();
    }

}