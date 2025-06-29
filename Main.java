import javax.swing.*;
public class Main extends JFrame {


    public static void main(String[] args) {
        MinhaTela myScreen = new MinhaTela();
        
        myScreen.setVisible(true);
        myScreen.setBounds(100, 100, 600, 600);
        
        myScreen.pack();
        
    }

}