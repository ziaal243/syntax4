import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI{
    private JFrame frame;
    private JButton button;
    private int width, height;

    public GUI(int w, int h){
        frame = new JFrame();
        button = new JButton("Click!");
        width = w;
        height = h;
    }

    public void SetUpGui(){
        frame.setSize(width, height);
        frame.setTitle("GUI");
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void SetUpButtonListeners(){
        ActionListener buttonListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                System.out.println("Click");
            }
        };
        button.addActionListener(buttonListener);
    }
    
    public static void main(String[] args) {
        GUI gd = new GUI(640,320);
        gd.SetUpGui();
        gd.SetUpButtonListeners();
    }
}