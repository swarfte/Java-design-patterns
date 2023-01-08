package virtualProxyPattern;

import java.awt.*;
import java.net.URL;

public class ImageIcon implements Icon {
    private String fileName;

    final URL imageURL;
    private Icon icon;

    public ImageIcon(URL imageURL, String fileName) {
        this.imageURL = imageURL;
        this.fileName = fileName;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (icon != null) {
            icon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            try {
                icon = new ImageIcon(imageURL, "CD Cover");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getIconWidth() {
        return icon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return icon.getIconHeight();
    }
}
