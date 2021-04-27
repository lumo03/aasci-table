import javax.swing.*;
import java.awt.*;

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
    
    public JTextArea getLabel() {
        return label;
    }

    public void setLabel(String text) {
        label.setText(text);
    }
}
