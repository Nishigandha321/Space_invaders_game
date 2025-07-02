import javax.swing.*;
  public class App {
     public static void main(String[] args) throws Exception {
         //window variables
         int tileSize = 32;
         int rows = 16;
         int columns = 16;
         int boardWidth = tileSize * columns; // 32 * 16 = 512px
         int boardHeight = tileSize * rows; // 32 * 16 = 512px
 
         JFrame frame = new JFrame("Space Invaders");
        //frame.setVisible(true);
         frame.setSize(boardWidth, boardHeight);
         frame.setLocationRelativeTo(null);  //opens the window at the centre of screen
         frame.setResizable(false); //so that users cant modify the window size
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //upon clicking on the cross closes the window
         
         // Add the cover page
        CoverPage cover = new CoverPage(frame);
        frame.add(cover);
        frame.pack();
        frame.setVisible(true);

        
 
     }
 }