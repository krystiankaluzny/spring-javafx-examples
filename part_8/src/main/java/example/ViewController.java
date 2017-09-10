package example;

import java.io.IOException;

import de.felixroske.jfxsupport.FXMLController;
import de.felixroske.jfxsupport.JavaFxSupport;
import javafx.event.Event;
import javafx.stage.Modality;

@FXMLController
public class ViewController {
    
    public void showToolWindow(Event event) throws IOException {
        JavaFxSupport.showView(ToolView.class, Modality.NONE);
    }
}
