import javax.swing.*;
import java.awt.*;

//create a window to show the table
public class Window extends JFrame {

    // create/declare textArea
    JTextArea textArea;
    public Window() {

        // close with "x"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set title
        setTitle("ASCII-Table");

        // set window size
        setSize(1425,620);

        // show window in the middle of the screen
        setLocationRelativeTo(null);

        // initialize textArea
        textArea = new JTextArea("Loading...");

        // prevent edits
        textArea.setEditable(false);

        // change font
        textArea.setFont(new Font("Courier New",Font.PLAIN,14));

        // add textArea to frame
        add(textArea);

        // make frame visible
        setVisible(true);
    }

    // method to get the text of the textArea
    public String getTextArea() {
        return textArea.getText();
    }

    // method to set the text of the textArea
    public void setTextArea(String text) {
        textArea.setText(text);
    }
}
