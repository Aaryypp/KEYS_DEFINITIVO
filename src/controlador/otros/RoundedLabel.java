package controlador.otros;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RoundedLabel extends JLabel {
    private final int radius;
    private final Color fillColor;
    private final Color borderColor;
    private float borderWidth;

    public RoundedLabel(String text, int radius, int fillColorRGB, int borderColorRGB, float borderWidth) {
        super(text);
        this.radius = radius;
        this.fillColor = new Color(fillColorRGB);
        this.borderColor = new Color(borderColorRGB);
        this.borderWidth = borderWidth;
    }

    public RoundedLabel() {
        this.radius = 0;
        this.fillColor = null;
        this.borderColor = null;
        this.borderWidth = 0.0f;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        g2.setColor(fillColor);
        g2.fillRoundRect(0, 0, w - 1, h - 1, radius, radius);

        // Establece el color del borde aquí
        g2.setColor(borderColor);

        float[] dashPattern = {borderWidth};
        g2.setStroke(new BasicStroke(borderWidth, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND, 10.0f, dashPattern, 0.0f));

        g2.drawRoundRect(0, 0, w - 1, h - 1, radius, radius);

        super.paintComponent(g);
        g2.dispose();
    }

    public void setRoundedImage(String imagePath, JLabel l) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File(imagePath));
        int diameter = Math.min(originalImage.getWidth(), originalImage.getHeight());
        BufferedImage mask = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = mask.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillOval(0, 0, diameter - 1, diameter - 1);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_IN));
        // Ajusta las coordenadas x e y para centrar la imagen en el label redondeado
        int x = (diameter - originalImage.getWidth()) / 2;
        int y = (diameter - originalImage.getHeight()) / 2;
        g2d.drawImage(originalImage, x, y, null);
        g2d.dispose();
        l.setIcon(new ImageIcon(mask));
    }

}


