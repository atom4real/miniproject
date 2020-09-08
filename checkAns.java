public class checkAns {
    public String check(String inputEN){
        //ENG - TH Lang!
        String result = "";
        //Loop for change every charectors of input
        for(int i = 0 ; i<inputEN.length() ; i++){
            switch(inputEN.charAt(i)){
                case ' ':
                    result += " ";
                    break;
                case '1':
                    result += "ๅ";
                    break;
                case '2':
                    result += "/";
                    break;
                case '3':
                    result += "_";
                    break;
                case '4':
                    result += "ภ";
                    break;
                case '5':
                    result += "ถ";
                    break;
                case '6':
                    result += "ุ";
                    break;
                case '7':
                    result += "ึ";
                    break;
                case '8':
                    result += "ค";
                    break;
                case '9':
                    result += "ต";
                    break;
                case '0':
                    result += "จ";
                    break;
                case '-':
                    result += "ข";
                    break;
                case '=':
                    result += "ช";
                    break;
                case 'q':
                    result += "ๆ";
                    break;
                case 'w':
                    result += "ไ";
                    break;
                case 'e':
                    result += "ำ";
                    break;
                case 'r':
                    result += "พ";
                    break;
                case 't':
                    result += "ะ";
                    break;
                case 'y':
                    result += "ั";
                    break;
                case 'u':
                    result += "ี";
                    break;
                case 'i':
                    result += "ร";
                    break;
                case 'o':
                    result += "น";
                    break;
                case 'p':
                    result += "ย";
                    break;
                case '[':
                    result += "บ";
                    break;
                case ']':
                    result += "ล";
                    break;
                case '\\':
                    result += "ฃ";
                    break;
                case 'a':
                    result += "ฟ";
                    break;
                case 's':
                    result += "ห";
                    break;
                case 'd':
                    result += "ก";
                    break;
                case 'f':
                    result += "ด";
                    break;
                case 'g':
                    result += "เ";
                    break;
                case 'h':
                    result += "้";
                    break;
                case 'j':
                    result += "่";
                    break;
                case 'k':
                    result += "า";
                    break;
                case 'l':
                    result += "ส";
                    break;
                case ';':
                    result += "ว";
                    break;
                case '\'':
                    result += "ง";
                    break;
                case 'z':
                    result += "ผ";
                    break;
                case 'x':
                    result += "ป";
                    break;
                case 'c':
                    result += "แ";
                    break;
                case 'v':
                    result += "อ";
                    break;
                case 'b':
                    result += "ิ";
                    break;
                case 'n':
                    result += "ื";
                    break;
                case 'm':
                    result += "ท";
                    break;
                case ',':
                    result += "ม";
                    break;
                case '.':
                    result += "ใ";
                    break;
                case '/':
                    result += "ฝ";
                    break;
                case '!':
                    result += "+";
                    break;
                case '@':
                    result += "๑";
                    break;
                case '#':
                    result += "๒";
                    break;
                case '$':
                    result += "๓";
                    break;
                case '%':
                    result += "๔";
                    break;
                case '^':
                    result += "ู";
                    break;
                case '&':
                    result += "฿";
                    break;
                case '*':
                    result += "๕";
                    break;
                case '(':
                    result += "๖";
                    break;
                case ')':
                    result += "๗";
                    break;
                case '_':
                    result += "๘";
                    break;
                case '+':
                    result += "๙";
                    break;
                case 'Q':
                    result += "๐";
                    break;
                case 'W':
                    result += "\"";
                    break;
                case 'E':
                    result += "ฎ";
                    break;
                case 'R':
                    result += "ฑ";
                    break;
                case 'T':
                    result += "ธ";
                    break;
                case 'Y':
                    result += "ํ";
                    break;
                case 'U':
                    result += "๊";
                    break;
                case 'I':
                    result += "ณ";
                    break;
                case 'O':
                    result += "ฯ";
                    break;
                case 'P':
                    result += "ญ";
                    break;
                case '{':
                    result += "ฐ";
                    break;
                case '}':
                    result += ",";
                    break;
                case '|':
                    result += "ฅ";
                    break;
                case 'A':
                    result += "ฤ";
                    break;
                case 'S':
                    result += "ฆ";
                    break;
                case 'D':
                    result += "ฏ";
                    break;
                case 'F':
                    result += "โ";
                    break;
                case 'G':
                    result += "ฌ";
                    break;
                case 'H':
                    result += "็";
                    break;
                case 'J':
                    result += "๋";
                    break;
                case 'K':
                    result += "ษ";
                    break;
                case 'L':
                    result += "ศ";
                    break;
                case ':':
                    result += "ซ";
                    break;
                case 'Z':
                    result += "(";
                    break;
                case 'X':
                    result += ")";
                    break;
                case 'C':
                    result += "ฉ";
                    break;
                case 'V':
                    result += "ฮ";
                    break;
                case 'B':
                    result += "ฺ";
                    break;
                case 'N':
                    result += "์";
                    break;
                case 'M':
                    result += "?";
                    break;
                case '<':
                    result += "ฒ";
                    break;
                case '>':
                    result += "ฬ";
                    break;
                case '?':
                    result += "ฦ";
                    break;
                default:
                    result = "Invalid Input, Please Input English Language.";
            }
        }
        return result;
    }
}