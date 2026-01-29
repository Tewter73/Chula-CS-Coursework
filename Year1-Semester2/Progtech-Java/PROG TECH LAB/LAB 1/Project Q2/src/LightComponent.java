import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
public class LightComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        // Draw rectangle
        Rectangle box = new Rectangle(100, 100, 180, 310);
        g2.draw(box);
        // Draw the redlight
        g2.setColor(Color.RED);
        Ellipse2D.Double redlight = new Ellipse2D.Double(145, 110, 90, 90);
        g2.draw(redlight);
        g2.fill(redlight);
        // Draw the greenlight
        g2.setColor(Color.YELLOW);
        Ellipse2D.Double yellowlight = new Ellipse2D.Double(145, 210, 90, 90);
        g2.draw(yellowlight);
        g2.fill(yellowlight);
        // Draw the greenlight
        g2.setColor(Color.GREEN);
        Ellipse2D.Double greenlight = new Ellipse2D.Double(145, 310, 90, 90);
        g2.draw(greenlight);
        g2.fill(greenlight);
    }
}