package virtualProxyPattern;

import java.awt.*;

public interface Icon {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(Component c, Graphics g, int x, int y );
}
