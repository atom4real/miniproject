import javax.swing.JOptionPane;

public class mainProgram {
    public static void main(String[] args) {
        //These arrays use for Options.
        String[] option = {"TH-EN","EN-TH"}; 
        String[] yesORno = {"Yes","Cancel"};
        //while loop condition true!
        while(true){
            int LangOption = JOptionPane.showOptionDialog(null, "Choose your option", "EN2TH or TH2EN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, null);
            //Create an Object
            checkAns check = new checkAns();
            checkAnsII checkII = new checkAnsII();
            //select option "TH-EN" or "EN-TH"
            switch(LangOption){
                //selected EN-TH
                case 1:
                    String inputEN = JOptionPane.showInputDialog(null, "Enter the Sentence( EN-TH ) : ", JOptionPane.QUESTION_MESSAGE);
                    if(inputEN.equals("!stop")){
                        System.exit(0);
                    }
                    String resultEN = check.check(inputEN);
                    JOptionPane.showMessageDialog(null, resultEN, "Result of Decryption",JOptionPane.PLAIN_MESSAGE);
                    break;
                //selected TH-EN
                case 0:
                    String inputTH = JOptionPane.showInputDialog(null, "Enter the Sentence( TH-EN ) : ", JOptionPane.QUESTION_MESSAGE);
                    if(inputTH.equals("!stop")){
                        break;
                    }
                    String resultTH = checkII.checkII(inputTH);
                    JOptionPane.showMessageDialog(null, resultTH, "Result of Decryption",JOptionPane.PLAIN_MESSAGE);
                    break;
                //Not both options
                default :
                    int YesNoOptions = JOptionPane.showOptionDialog(null, "Exit Program?", "Alert!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, yesORno, null);
                    if(YesNoOptions == 0){
                        //break program!
                        System.exit(0);
                    }
                    else {
                        //break condition for the loop again.
                        break;
                    }
            }
        }
    }
}
