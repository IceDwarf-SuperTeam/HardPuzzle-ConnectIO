import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
public class gamecore{
    JFrame mainFrame;
    JPanel mainPanel;
    
    int[] resolution={1980,1600};
    public static void main(String[] args){
        new gamecore().start();
    }
    public void start(){
        
        mainFrame = new JFrame("Game Title");
        mainPanel = new JPanel();
        mainFrame.setSize(resolution[0],resolution[1]);
        mainPanel.setSize(resolution[0],resolution[1]);
        mainFrame.add(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        mainFrame.setVisible(true);
    }
}
