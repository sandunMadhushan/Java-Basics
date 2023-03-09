import javax.swing.JOptionPane;

public class showdialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name?");

        JOptionPane.showMessageDialog(null, "I Love You " + name);

    }

}