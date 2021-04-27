public class Print {


    // method to print the header
    public static String writeHeader() {
        String out = "";

        // format template for printing the header
        String h = " Dec   Bin         Hex    Char   ";

        // spacing left
        out+= "     ";

        // Loop to print the header four times
        for (int i = 0; i < 4; i++) {
           out += h;
           out += "     ";
           if (i < 3) {
               out += "|      ";
           }
        }
        // spacing right
        out+= "     ";
        // next line
        out += "\n";
        // print line under the header
        out += "-".repeat(178);
        // next line
        out += "\n";
        return out;
    }

    // method to print one row
    public static String writeRow(char[] cA) {

        // declare and initialize the output variable
        String out = "";

        // left spacing
        out+= "     ";

        // loop to print vor characters with their numbers
        for (int i = 0; i < 4; i++) {
            out += writeChar(cA[i]);
            if (i < 3) {
                out += "|      ";
            }
        }

        // right spacing
        out+= "     ";

        // next line
        out += "\n";

        // return output variable
        return out;
    }

    // method to print one char with its numbers
    public static String writeChar(char c) {

        // declare and initialize the variables
        int b = Integer.parseInt(Integer.toBinaryString(c));
        String h = Integer.toHexString(c);
        String[] specialChars = {"[NUL]", "[SOH]", "[STX]", "[ETX]", "[EOT]", "[ENQ]", "[ACK]", "[BEL]", "[BS]", "[TAB]", "[LF]", "[VT]", "[FF]", "[CR]", "[SO]", "[SI]", "[DLE]", "[DC1]", "[DC2]", "[DC3]", "[DC4]", "[NAK]", "[SYN]", "[ETB]", "[CAN]", "[EM]", "[SUB]", "[ESC]", "[FS]", "[GS]", "[RS]", "[US]", "space"};

        // print the chars
        if (c < 33) {
            return String.format(" %3d   %08d     %2s    %-5s       ",(int) c,b,h,specialChars[c]);
        } else if (c > 32 && c != 127) {
            return String.format(" %3d   %08d     %2s    %-5c       ",(int) c,b,h,c);
        } else if (c == 127) {
            return String.format(" %3d   %08d     %2s    %-5s       ",(int) c,b,h,"[DEL]");
        } else return null;
    }

}