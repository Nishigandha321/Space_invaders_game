import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoverPage extends JPanel {
    private JFrame frame;
    private Image backgroundImage;

    public CoverPage(JFrame frame) {
        this.frame = frame;
        setLayout(null);
        setPreferredSize(new Dimension(512, 512));

        // Load and scale the background image
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Downloads\\cover-bg.png");
        backgroundImage = icon.getImage().getScaledInstance(512, 512, Image.SCALE_SMOOTH);
        setLayout(null); // absolute positioning

        // Play Button
        JButton playButton = new JButton("Play");
        playButton.setFont(new Font("Arial", Font.BOLD, 24));
        playButton.setBounds(190, 350, 130, 50);
        playButton.setFocusable(false);

        // Custom Styling
        playButton.setBackground(new Color(90, 0, 140)); // Dodger Blue
        playButton.setForeground(Color.WHITE); // White text
        playButton.setBorder(BorderFactory.createEmptyBorder());
        playButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // Rounded corners (using a button UI override)
        playButton.setContentAreaFilled(false);
        playButton.setOpaque(true);

        add(playButton); // add play button on top of bg

        // Start the game on button click
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Remove cover page
                SpaceInvaders gamePanel = new SpaceInvaders();
                frame.add(gamePanel);
                frame.pack();
                gamePanel.requestFocus();
                frame.revalidate();
                frame.repaint();
            }
        });
    }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        
        }
}
