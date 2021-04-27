public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.createTable();
    }

    public void createTable() {
        Window table = new Window();
        String text = "";
        text += Print.writeHeader();
        for (int i = 0; i < 32; i++) {
            char c1 = (char) i;
            char c2 = (char) (c1+32);
            char c3 = (char) (c2+32);
            char c4 = (char) (c3+32);
            char[] c = new char[]{c1, c2, c3, c4};
            text += Print.writeLine(c);
        }

        table.setLabel(text);
    }
}
