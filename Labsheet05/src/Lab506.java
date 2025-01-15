import javax.swing.JOptionPane;

public class Lab506 {
    public static void main(String[] args) {
        String[] greetings = { "-Good Morning", "-Good Afternoon", "-Good Evening", "-Good Night" };
        String message = "";
        for (String Hello : greetings) {
            message += Hello + "\n";
        }

        JOptionPane.showMessageDialog(null, "The greeting words in English\n"+message);
    }
}