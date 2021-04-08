import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUI implements ActionListener {

    JFrame frame;
    JPanel panel;
    JLabel score;
    JButton buttonPink;
    JButton buttonBlue;
    JButton buttonCyan;
    JButton buttonGray;
    JButton buttonMagenta;
    JButton buttonOrange;
    JButton buttonGreen;
    JButton buttonRed;
    JButton buttonWhite;
    static int n;
    Random rand = new Random();
    int points;

    public void getColor() {
        n = rand.nextInt(9) + 1;
        switch (n) {
            case 1:
                panel.setBackground(Color.PINK);
                break;
            case 2:
                panel.setBackground(Color.BLUE);
                break;
            case 3:
                panel.setBackground(Color.CYAN);
                break;
            case 4:
                panel.setBackground(Color.GRAY);
                break;
            case 5:
                panel.setBackground(Color.MAGENTA);
                break;
            case 6:
                panel.setBackground(Color.ORANGE);
                break;
            case 7:
                panel.setBackground(Color.GREEN);
                break;
            case 8:
                panel.setBackground(Color.RED);
                break;
            case 9:
                panel.setBackground(Color.WHITE);
                break;
            default:
                break;
        }
    }

    public GUI() {
        points = 0;
        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(660, 500);
        frame.setLocation(50, 300);

        buttonPink = new JButton(new AbstractAction("PINK") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR PINK BUTTON
                getColor();
                if (n == 1) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 1 button
        buttonBlue = new JButton(new AbstractAction("BLUE") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR BLUE BUTTON
                getColor();
                if (n == 2) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 2 button
        buttonCyan = new JButton(new AbstractAction("CYAN") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR CYAN BUTTON
                getColor();
                if (n == 3) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 3 button
        buttonGray = new JButton(new AbstractAction("GREY") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR GREY BUTTON
                getColor();
                if (n == 4) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 4 button
        buttonMagenta = new JButton(new AbstractAction("MAGENTA") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR MAGENTA BUTTON
                getColor();
                if (n == 5) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 5 button
        buttonOrange = new JButton(new AbstractAction("ORANGE") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR ORANGE BUTTON
                getColor();
                if (n == 6) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 6 button
        buttonGreen = new JButton(new AbstractAction("GREEN") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR GREEN BUTTON
                getColor();
                if (n == 7) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 7 button
        buttonRed = new JButton(new AbstractAction("RED") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR RED BUTTON
                getColor();
                if (n == 8) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 8 button
        buttonWhite = new JButton(new AbstractAction("WHITE") {
            @Override
            public void actionPerformed(ActionEvent e) { //FOR BLACK BUTTON
                getColor();
                if (n == 9) {
                    points++;
                    score.setText("Score: " + points);
                }
            }
        });// 9 button

        panel.setLayout(null);
        panel.setBackground(Color.getHSBColor(91,120,120));

        score = new JLabel("Score: " + points);
        score.setSize(80, 55);
        score.setFont(new Font("Serif", Font.BOLD, 20));
        score.setLocation(540, 5);
        panel.add(score);

        JLabel title = new JLabel("What color");
        title.setSize(150,55);
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setLocation(240,5);
        panel.add(title);
        JLabel title2 = new JLabel("will come next?");
        title2.setSize(200,55);
        title2.setFont(new Font("Serif", Font.BOLD, 30));
        title2.setLocation(215,30);
        panel.add(title2);

        //1 button 1 row
        buttonPink.setSize(120, 70);
        buttonPink.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonPink.setBackground(Color.WHITE);
        buttonPink.setLocation(100, 120);
        //2 button 1 row
        buttonBlue.setSize(120, 70);
        buttonBlue.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonBlue.setBackground(Color.WHITE);
        buttonBlue.setLocation(270, 120);
        //3 button 1 row
        buttonCyan.setSize(120, 70);
        buttonCyan.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonCyan.setBackground(Color.WHITE);
        buttonCyan.setLocation(440, 120);


        //1 button 2 row
        buttonGray.setSize(120, 70);
        buttonGray.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonGray.setBackground(Color.WHITE);
        buttonGray.setLocation(100, 240);
        //2 button 2 row
        buttonMagenta.setSize(120, 70);
        buttonMagenta.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonMagenta.setBackground(Color.WHITE);
        buttonMagenta.setLocation(270, 240);
        //3 button 2 row
        buttonOrange.setSize(120, 70);
        buttonOrange.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonOrange.setBackground(Color.WHITE);
        buttonOrange.setLocation(440, 240);


        //1 button 3 row
        buttonGreen.setSize(120, 70);
        buttonGreen.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonGreen.setBackground(Color.WHITE);
        buttonGreen.setLocation(100, 360);
        //2 button 3 row
        buttonRed.setSize(120, 70);
        buttonRed.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonRed.setBackground(Color.WHITE);
        buttonRed.setLocation(270, 360);
        //3 button 3 row
        buttonWhite.setSize(120, 70);
        buttonWhite.setFont(new Font("Italic", Font.ITALIC, 15));
        buttonWhite.setBackground(Color.WHITE);
        buttonWhite.setLocation(440, 360);

        panel.add(buttonPink);
        panel.add(buttonBlue);
        panel.add(buttonCyan);
        panel.add(buttonGray);
        panel.add(buttonMagenta);
        panel.add(buttonOrange);
        panel.add(buttonGreen);
        panel.add(buttonRed);
        panel.add(buttonWhite);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
