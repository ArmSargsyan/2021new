package patterns.behavioural.mediator;

import javax.swing.*;

public interface Mediator {

    void addNewNote(Note note);

    void deleteNote();

    void getInfoFromList(Note note);

    void saveChanges();

    void markNote();

    void clear();

    void sendToFilter(ListModel listModel);

    void registerComponent(Component component);

    void setElementsList(ListModel list);

    void hideElements(boolean flag);

    void createGUI();

}
