import javax.swing.*;
import java.awt.*;

//create a window to show the table
public class Window extends JFrame {

    // Textfeld erstellen
    JTextArea label;
    public Window() {

        // Schließen mit "x"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Titel setzen
        setTitle("ASCII-Table");

        // Fenstergrosse einstellen
        setSize(1425,620);

        // Fenster mittig positionieren
        setLocationRelativeTo(null);

        // Label intialisieren
        label = new JTextArea("Loading...");

        // Schrift anpassen
        label.setFont(new Font("Courier New",Font.PLAIN,14));

        // Label zum Frame hinzufuegen
        add(label);

        // Frame sichtbar machen
        setVisible(true);
    }

    // method for getting the label
    public JTextArea getLabel() {
        return label;
    }

    // method for setting the label
    public void setLabel(String text) {
        label.setText(text);
    }
}
