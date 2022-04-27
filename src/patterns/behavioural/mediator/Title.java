package patterns.behavioural.mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Title extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    public String getName() {
        return "Title";
    }
}
