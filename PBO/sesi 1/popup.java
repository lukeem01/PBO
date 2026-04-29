import javax.swing.JOptionPane;

public class popup {
     public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Anda sedang belajar apa?");
        
        JOptionPane.showMessageDialog(null, 
            "Belajar " + input + " sangat mudah");
    }
}
