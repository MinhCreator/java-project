import  javax.swing.*;

class GUI {
    public void createButton(String label, String title) {
        JFrame mainFrame = new JFrame(title);
        JButton butt = new JButton(label);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set default frame size
        mainFrame.setSize(300, 200);
        mainFrame.setVisible(true);
        mainFrame.add(butt);
    }
}

public class Init_gui {

    public static void main(String[] args) {
        GUI test = new GUI();

        test.createButton("test", "new ui");
    }

}