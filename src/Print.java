public class Print {


    // Methode zum Drucken der Ueberschrift
    public static String writeHeader() {
        String out = "";
        String h = " Dec   Bin         Hex    Char   ";
        out+= "     ";
        for (int i = 0; i < 4; i++) {
           out += h;
           out += "     ";
           if (i < 3) {
               out += "|      ";
           }
        }
        out+= "     ";
        out += "\n";
        out += "-".repeat(178);
        out += "\n";
        return out;
    }

    // Methode zum Drucken einer Zeile
    public static String writeLine(char[] cA) {
        String out = "";
        out+= "     ";
        for (int i = 0; i < 4; i++) {
            out += writeChar(cA[i]);
            if (i < 3) {
                out += "|      ";
            }
        }
        out+= "     ";
        out += "\n";
        return out;
    }

    // Methode zum Drucken eines Char
    public static String writeChar(char c) {

        // Variablen
        int b = Integer.parseInt(Integer.toBinaryString(c));
        String h = Integer.toHexString(c);
        String[] specialChars = {"[NUL]", "[SOH]", "[STX]", "[ETX]", "[EOT]", "[ENQ]", "[ACK]", "[BEL]", "[BS]", "[TAB]", "[LF]", "[VT]", "[FF]", "[CR]", "[SO]", "[SI]", "[DLE]", "[DC1]", "[DC2]", "[DC3]", "[DC4]", "[NAK]", "[SYN]", "[ETB]", "[CAN]", "[EM]", "[SUB]", "[ESC]", "[FS]", "[GS]", "[RS]", "[US]", "space"};

        if (c < 33) {
            return String.format(" %3d   %08d     %2s    %-5s       ",(int) c,b,h,specialChars[c]);
        } else if (c > 32 && c != 127) {
            return String.format(" %3d   %08d     %2s    %-5c       ",(int) c,b,h,c);
        } else if (c == 127) {
            return String.format(" %3d   %08d     %2s    %-5s       ",(int) c,b,h,"[DEL]");
        } else return null;
    }

}