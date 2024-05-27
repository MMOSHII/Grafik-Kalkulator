package grafikkalkulator;

import java.awt.*;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.image.BufferedImage;

public class KalkulatorGrafik extends TampilanGrafik{
    
    public KalkulatorGrafik() {
        inputFungsiEkuasi.addActionListener(e -> gambarGrafik());
    }

    protected void gambarGrafik() {
        String equation = inputFungsiEkuasi.getText();
        
        if (equation.equals("x")){
            equation = "1x";
        }

        int lebar = panelGrafik.getWidth();
        int tinggi = panelGrafik.getHeight();

        offScreenImage = new BufferedImage(lebar, tinggi, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = offScreenImage.createGraphics();

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, lebar, tinggi);

        garisKoordinat(g2d, lebar, tinggi);
        garisKartesius(g2d, lebar, tinggi);
        
        List<Double> xValues = getXValues(startX, endX, 0.1);
        List<Double> yValues = fungsiPlot(equation, xValues);
        if (!yValues.isEmpty()) {
            plotLine(g2d, xValues, yValues, lebar, tinggi);
        }

        g2d.dispose();
        panelGrafik.repaint();
    }

    // Mengambar garis tipis koordinat
    private void garisKoordinat(Graphics2D g, int lebar, int tinggi) {
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 10; i < tinggi; i += 10) {
            g.drawLine(0, i, lebar, i);
            g.drawLine(i, 0, i, tinggi);
        }
    }

    // Mengambar garis tebal kartesius
    private void garisKartesius(Graphics2D g, int lebar, int tinggi) {
        g.setColor(Color.BLACK);
        g.drawLine(0, tinggi / 2, lebar, tinggi / 2);
        g.drawLine(lebar / 2, 0, lebar / 2, tinggi);
    }

    private List<Double> getXValues(double start, double end, double interval) {
        List<Double> xValues = new ArrayList<>();
        for (double x = start; x <= end; x += interval) {
            xValues.add(x);
        }
//        System.out.print(xValues. size());
        return xValues;
    }

    private List<Double> fungsiPlot(String equation, List<Double> xValues) {
        List<Double> yValues = new ArrayList<>();
        for (double x : xValues) {
            double y = kalkulasiFungsi(equation, x);
            yValues.add(y);
        }
        return yValues;
    }

    private double kalkulasiFungsi(String equation, double x) {
        String[] parts = equation.split("[+]");
        double y = 0;
        for (String part : parts) {
            if (part.contains("x")) {
                String[] KoefisienParts = part.split("x");
                double Koefisien = KoefisienParts[0].isEmpty() ? 1.0 : parseDouble(KoefisienParts[0], 0);
                if (part.contains("^")) {
                    String[] exponentParts = part.split("\\^");
                    int exponent = (int) parseDouble(exponentParts[1], 0);
                    y += Koefisien * Math.pow(x, exponent);
                } else if (part.contains("*")) {
                    String[] perkalianPart = part.split("\\*");
                    double perkalianKoefisien = parseDouble(perkalianPart[0], 1);
                    y += perkalianKoefisien * kalkulasiFungsiPart(perkalianPart[1], x);
                } else {
                    y += kalkulasiFungsiPart(part, x);
                }
            } else {
                y += parseDouble(part, 0);
            }
        }
        return y;
    }

    private double kalkulasiFungsiPart(String part, double x) {
        double y = 0;
        if (part.contains("sin") || part.contains("cos") || part.contains("tan")) {
            Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d+)?(sin|cos|tan)\\((x)\\)");
            Matcher matcher = pattern.matcher(part);
            if (matcher.find()) {
                String Koefisien = matcher.group(1);
                String function = matcher.group(2);
                double KoefisienValue = (Koefisien != null && !Koefisien.isEmpty()) ? Double.parseDouble(Koefisien) : 1.0;
                switch (function) {
                    case "sin" -> y = KoefisienValue * Math.sin(x);
                    case "cos" -> y = KoefisienValue * Math.cos(x);
                    case "tan" -> y = KoefisienValue * Math.tan(x);
                    default -> throw new AssertionError("Unexpected function: " + function);
                }
            }
        } else {
            String[] KoefisienParts = part.split("x");
            double Koefisien = KoefisienParts[0].isEmpty() ? 1 : parseDouble(KoefisienParts[0], 1);
            y = Koefisien * x;
        }
        return y;
    }

    private void plotLine(Graphics2D g, List<Double> xValues, List<Double> yValues, int lebar, int tinggi) {
        Path2D path = new Path2D.Double();
        double scaleX = lebar / (xValues.get(xValues.size() - 1) - xValues.get(0)); 
        double scaleY = tinggi / (xValues.get(xValues.size() - 1) - xValues.get(0));
//        System.out.println(scaleX);
//        System.out.println(scaleY);
        path.moveTo(lebar / 2 + xValues.get(0) * scaleX, tinggi / 2 - yValues.get(0) * scaleY);
        for (int i = 1; i < xValues.size(); i++) {
            path.lineTo(lebar / 2 + xValues.get(i) * scaleX, tinggi / 2 - yValues.get(i) * scaleY);
        }
        g.setColor(Color.BLUE);
        g.draw(path);
    }

    private double parseDouble(String s, double defaultValue) {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
