import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton {
    private JFrame frame;
    private JLabel imageLabel;
    private ButtonGroup buttonGroup;
    private ImageIcon birdImage, catImage, dogImage, rabbitImage, pigImage;

    public RadioButton() {
        // Load images
        birdImage = new ImageIcon("C:\\Users\\v.i.s.h.n.u.u_ke\\Documents\\NetBeansProjects\\radio button\\src\\images\\bird.jpg");
        catImage = new ImageIcon("C:\\Users\\v.i.s.h.n.u.u_ke\\Documents\\NetBeansProjects\\radio button\\src\\images\\cat.jpg");
        dogImage = new ImageIcon("C:\\Users\\v.i.s.h.n.u.u_ke\\Documents\\NetBeansProjects\\radio button\\src\\images\\dog.jpg");
        rabbitImage = new ImageIcon("C:\\Users\\v.i.s.h.n.u.u_ke\\Documents\\NetBeansProjects\\radio button\\src\\images\\rabbit.jpg");
        pigImage = new ImageIcon("C:\\Users\\v.i.s.h.n.u.u_ke\\Documents\\NetBeansProjects\\radio button\\src\\images\\pig.jpg");

        // Create GUI components
        frame = new JFrame("RadioButton");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(imageLabel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(10,4));

        buttonGroup = new ButtonGroup();

        JRadioButton birdButton = new JRadioButton("Bird");
        birdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(birdImage);
            }
        });
        buttonGroup.add(birdButton);
        buttonPanel.add(birdButton);

        JRadioButton catButton = new JRadioButton("Cat");
        catButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(catImage);
            }
        });
        buttonGroup.add(catButton);
        buttonPanel.add(catButton);

        JRadioButton dogButton = new JRadioButton("Dog");
        dogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(dogImage);
            }
        });
        buttonGroup.add(dogButton);
        buttonPanel.add(dogButton);

        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        rabbitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(rabbitImage);
            }
        });
        buttonGroup.add(rabbitButton);
        buttonPanel.add(rabbitButton);

        JRadioButton pigButton = new JRadioButton("Pig");
        pigButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageLabel.setIcon(pigImage);
            }
        });
        buttonGroup.add(pigButton);
        buttonPanel.add(pigButton);
        
        frame.add(buttonPanel, BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,400);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RadioButton();
            }
        });
    }
}