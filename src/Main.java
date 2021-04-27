public class Main {
    public static void main(String[] args) {

        // create an object of the main class
        Main main = new Main();

        // execute the 'createTable()'-method
        main.createTable();
    }

    public void createTable() {

        // create an object of window class
        Window table = new Window();

        // create text variable for the label
        String text = "";

        //  print the header
        text += Print.writeHeader();

        // loop for printing the rows and columns
        for (int i = 0; i < 32; i++) {
            char c1 = (char) i;
            char c2 = (char) (c1+32);
            char c3 = (char) (c2+32);
            char c4 = (char) (c3+32);
            char[] c = new char[]{c1, c2, c3, c4};
            text += Print.writeRow(c);
        }

        // set the text of the label
        table.setLabel(text);
    }
}
