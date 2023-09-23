import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main  extends JFrame{
  
    public static void main(String[] args)  throws IOException {
    
    //Set JFrame Title
    JFrame frame = new JFrame("Minecraft Remade");
    
    frame.setLocationByPlatform( true );

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();

    //Music



    //Background + Logo
    File file = new File("C:\\Users\\Bloop\\OneDrive\\Desktop\\JAVA\\Assets\\Background.png");
    BufferedImage bufferedImage = ImageIO.read(file);

    ImageIcon imageIcon = new ImageIcon(bufferedImage);

    JLabel jLabel = new JLabel();

    jLabel.setIcon(imageIcon);
    frame.add(jLabel);


    //Set JFrame Properties
    frame.setSize(1650, 1080);
    frame.setLocationRelativeTo(null);
    
    //Makes JFrame visible
    frame.setVisible( true );
  }
}