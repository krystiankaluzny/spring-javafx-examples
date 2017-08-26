package example;

import org.springframework.beans.factory.annotation.Autowired;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

@FXMLController
public class HelloworldController {

    @FXML
    private Label helloLabel;
  
    @FXML
    private TextField nameField;

    @Autowired
    private AwesomeActionService actionService;

    protected void init()
    {
        // this class is the HelloworldController class because init() is not private method
        // do init staff if you want
        // now FML fields are not null
    }

    @FXML
    public void setHelloText(final Event event) {
        // this method has to be not private
        // now FML fields are not null
       final String textToBeShown = actionService.processName(nameField.getText());
       helloLabel.setText(textToBeShown); 
    }

    @FXML
    private void initialize()
    {
        // this class is the HelloworldController$$EnhancerBySpringCGLB$$BlaBla class because initialize() is private method
        // so fxml fields are not null and autowired fields are null
        // pass this.helloLabel and this.nameField to delegated HelloworldController object
        setHelloLabel(helloLabel);
        setNameField(nameField);
        init();
    }

    protected void setHelloLabel(Label helloLabel) {
        // this class is the HelloworldController class because setHelloLabel() is not private method
        // helloLabel argument comes from HelloworldController$$EnhancerBySpringCGLB$$BlaBla
        this.helloLabel = helloLabel;
    }

    protected void setNameField(TextField nameField) {
        // this class is the HelloworldController class because setNameField() is not private method
        // nameField argument comes from HelloworldController$$EnhancerBySpringCGLB$$BlaBla
        this.nameField = nameField;
    }
}
