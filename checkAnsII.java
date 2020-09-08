public class checkAnsII {
    public String checkII(String inputTH){
        //TH - ENG Lang!
        String result2 = "";
        //Loop for change every charectors of input
        for(int i = 0 ; i<inputTH.length() ; i++){
            switch(inputTH.charAt(i)){
                case ' ':
                    result2 += " ";
                    break;
                case 'ๅ':
                    result2 += "1";
                    break;
                case '/':
                    result2 += "2";
                    break;
                case '_':
                    result2 += "3";
                    break;
                case 'ภ':
                    result2 += "4";
                    break;
                case 'ถ':
                    result2 += "5";
                    break;
                case 'ุ':
                    result2 += "6";
                    break;
                case 'ึ':
                    result2 += "7";
                    break;
                case 'ค':
                    result2 += "8";
                    break;
                case 'ต':
                    result2 += "9";
                    break;
                case 'จ':
                    result2 += "0";
                    break;
                case 'ข':
                    result2 += "-";
                    break;
                case 'ช':
                    result2 += "=";
                    break;
                case 'ๆ':
                    result2 += "q";
                    break;
                case 'ไ':
                    result2 += "w";
                    break;
                case 'ำ':
                    result2 += "e";
                    break;
                case 'พ':
                    result2 += "r";
                    break;
                case 'ะ':
                    result2 += "t";
                    break;
                case 'ั':
                    result2 += "y";
                    break;
                case 'ี':
                    result2 += "u";
                    break;
                case 'ร':
                    result2 += "i";
                    break;
                case 'น':
                    result2 += "o";
                    break;
                case 'ย':
                    result2 += "p";
                    break;
                case 'บ':
                    result2 += "[";
                    break;
                case 'ล':
                    result2 += "]";
                    break;
                case 'ฃ':
                    result2 += "\\";
                    break;
                case 'ฟ':
                    result2 += "a";
                    break;
                case 'ห':
                    result2 += "s";
                    break;
                case 'ก':
                    result2 += "d";
                    break;
                case 'ด':
                    result2 += "f";
                    break;
                case 'เ':
                    result2 += "g";
                    break;
                case '้':
                    result2 += "h";
                    break;
                case '่':
                    result2 += "j";
                    break;
                case 'า':
                    result2 += "k";
                    break;
                case 'ส':
                    result2 += "l";
                    break;
                case 'ว':
                    result2 += ";";
                    break;
                case 'ง':
                    result2 += "\'";
                    break;
                case 'ผ':
                    result2 += "z";
                    break;
                case 'ป':
                    result2 += "x";
                    break;
                case 'แ':
                    result2 += "c";
                    break;
                case 'อ':
                    result2 += "v";
                    break;
                case 'ิ':
                    result2 += "b";
                    break;
                case 'ื':
                    result2 += "n";
                    break;
                case 'ท':
                    result2 += "m";
                    break;
                case 'ม':
                    result2 += ",";
                    break;
                case 'ใ':
                    result2 += ".";
                    break;
                case 'ฝ':
                    result2 += "/";
                    break;
                    //
                case '+':
                    result2 += "!";
                    break;
                case '๑':
                    result2 += "@";
                    break;
                case '๒':
                    result2 += "#";
                    break;
                case '๓':
                    result2 += "$";
                    break;
                case '๔':
                    result2 += "%";
                    break;
                case 'ู':
                    result2 += "^";
                    break;
                case '฿':
                    result2 += "&";
                    break;
                case '๕':
                    result2 += "*";
                    break;
                case '๖':
                    result2 += "(";
                    break;
                case '๗':
                    result2 += ")";
                    break;
                case '๘':
                    result2 += "_";
                    break;
                case '๙':
                    result2 += "+";
                    break;
                case '๐':
                    result2 += "Q";
                    break;
                case '\"':
                    result2 += "W";
                    break;
                case 'ฎ':
                    result2 += "E";
                    break;
                case 'ฑ':
                    result2 += "R";
                    break;
                case 'ธ':
                    result2 += "T";
                    break;
                case 'ํ':
                    result2 += "Y";
                    break;
                case '๊':
                    result2 += "U";
                    break;
                case 'ณ':
                    result2 += "I";
                    break;
                case 'ฯ':
                    result2 += "O";
                    break;
                case 'ญ':
                    result2 += "P";
                    break;
                case 'ฐ':
                    result2 += "{";
                    break;
                case ',':
                    result2 += "}";
                    break;
                case 'ฅ':
                    result2 += "|";
                    break;
                case 'ฤ':
                    result2 += "A";
                    break;
                case 'ฆ':
                    result2 += "S";
                    break;
                case 'ฏ':
                    result2 += "D";
                    break;
                case 'โ':
                    result2 += "F";
                    break;
                case 'ฌ':
                    result2 += "G";
                    break;
                case '็':
                    result2 += "H";
                    break;
                case '๋':
                    result2 += "J";
                    break;
                case 'ษ':
                    result2 += "K";
                    break;
                case 'ศ':
                    result2 += "L";
                    break;
                case 'ซ':
                    result2 += ":";
                    break;
                case '.':
                    result2 += "\"";
                    break;
                case '(':
                    result2 += "Z";
                    break;
                case ')':
                    result2 += "X";
                    break;
                case 'ฉ':
                    result2 += "C";
                    break;
                case 'ฮ':
                    result2 += "V";
                    break;
                case 'ฺ':
                    result2 += "B";
                    break;
                case '์':
                    result2 += "N";
                    break;
                case '?':
                    result2 += "M";
                    break;
                case 'ฒ':
                    result2 += "<";
                    break;
                case 'ฬ':
                    result2 += ">";
                    break;
                case 'ฦ':
                    result2 += "?";
                    break;
                default:
                    result2 = "Invalid Input, Please Input Thai Language.";
            }
        }
        return result2;
    }
}