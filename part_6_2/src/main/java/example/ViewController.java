package example;

import de.felixroske.jfxsupport.FXMLController;
import de.felixroske.jfxsupport.JavaFxSupport;
import javafx.event.Event;

@FXMLController
public class ViewController {
    
    public void showFirstView(Event event) {
        JavaFxSupport.showView(FirstView.class);
    }

    public void showSecondView(Event event) {
        JavaFxSupport.showView(SecondView.class);
    }
}
