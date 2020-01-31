import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Menu extends Applet {
    private JPanel pMain;
    private JButton bSet1;
    private JButton bSet4;
    private JButton bSet2;
    private JButton bSet3;
    private JButton bSet5;
    private JButton bTotal;

    public Menu() {
        add(pMain);

        setTitle("Stats Menu");
        setSize(700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Interface set1 = new Interface();
        Interface set2 = new Interface();
        Interface set3 = new Interface();
        Interface set4 = new Interface();
        Interface set5 = new Interface();
        Interface total = new Interface();


        bSet1.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                set1.setVisible(true);
            }
        });
        bSet2.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                set2.setVisible(true);
            }
        });
        bSet3.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                set3.setVisible(true);
            }
        });
        bSet4.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                set4.setVisible(true);
            }
        });
        bSet5.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                set5.setVisible(true);
            }
        });
        bTotal.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                total.setVisible(true);
            }
        });
    }

}
