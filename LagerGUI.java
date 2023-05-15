import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LagerGUI {
    private JFrame frame;
    private JButton button;
    private int width, height;


    public LagerGUI(int w, int h){
        frame = new JFrame();
        button = new JButton("Click!");
        width = w;
        height = h;
    }

    public void SetUpLagerGui(){
        frame.setSize(width, height);
        frame.setTitle("Lager1");
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
}
