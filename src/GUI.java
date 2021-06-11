import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    PaintPanel paintPanel;

    JTextArea messageTextArea;
    JButton addOnebutton;
    JButton addTenButton;
    JButton addHundredButton;
    JButton addThousandButton;

    static int numToAdd = 0;

    JPanel buttonsPanel; //used to center the button
    static boolean buttonClicked = false;

    public GUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        this.setTitle("Chaos Game");
        this.setSize(700,700);
        this.setResizable(false);

        messageTextArea = new JTextArea("A random vertex V of the triangle is chosen. The midpoint" +
                " between the previous point and V is plotted. Process is repeated as many times as you want. Interesting shapes emerge");
        messageTextArea.setWrapStyleWord(true);
        messageTextArea.setLineWrap(true);
        messageTextArea.setOpaque(false);
        messageTextArea.setEditable(false);
        messageTextArea.setFocusable(false);
        messageTextArea.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        messageTextArea.setFont(new Font("Consolas", Font.BOLD, 20));


        addOnebutton = new JButton("Add 1 Point");
        addOnebutton.setFocusable(false);
        addOnebutton.setFont(new Font("Consolas", Font.PLAIN, 15));
        addOnebutton.addActionListener(this);

        addTenButton = new JButton("Add 10 Points");
        addTenButton.setFocusable(false);
        addTenButton.setFont(new Font("Consolas", Font.PLAIN, 15));
        addTenButton.addActionListener(this);

        addHundredButton = new JButton("Add 100 Points");
        addHundredButton.setFocusable(false);
        addHundredButton.setFont(new Font("Consolas", Font.PLAIN, 15));
        addHundredButton.addActionListener(this);

        addThousandButton = new JButton("Add 1000 Points");
        addThousandButton.setFocusable(false);
        addThousandButton.setFont(new Font("Consolas", Font.PLAIN, 15));
        addThousandButton.addActionListener(this);

        buttonsPanel = new JPanel();
        buttonsPanel.add(addOnebutton);
        buttonsPanel.add(addTenButton);
        buttonsPanel.add(addHundredButton);
        buttonsPanel.add(addThousandButton);

        paintPanel = new PaintPanel();

        this.add(messageTextArea);
        this.add(buttonsPanel);
        this.add(paintPanel);
        this.setVisible(true);


        //center the JFrame
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addOnebutton) {
            numToAdd = 1;
            repaint();
            buttonClicked = true;
        }
        if (e.getSource() == addTenButton) {
            numToAdd = 10;
            repaint();
            buttonClicked = true;
        }
        if (e.getSource() == addHundredButton) {
            numToAdd = 100;
            repaint();
            buttonClicked = true;
        }
        if (e.getSource() == addThousandButton) {
            numToAdd = 1000;
            repaint();
            buttonClicked = true;
        }
    }
}
