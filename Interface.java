import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Interface extends Applet {
    private JButton bAttack;
    private JButton bKill;
    private JButton bAssist;
    private JButton bHitError;
    private JButton bSeamus;
    private JButton bChris;
    private JButton bJason;
    private JButton bAndrew;
    private JButton bMax;
    private JPanel pMain;
    private JButton bDavidN;
    private JButton bSetError;
    private JButton bServeIn;
    private JButton bAce;
    private JButton bServeError;
    private JButton bDig;
    private JButton bRecError;
    private JButton bBlockS;
    private JButton bBlockA;
    private JButton bBlockE;
    private JButton bBrennan;
    private JButton bStone;
    private JButton bSebby;
    private JButton bVu;
    private JButton bDavidR;
    private JButton bJP;
    private JButton bWill;
    private JLabel a0;
    private JLabel a1;
    private JLabel a2;
    private JLabel a3;
    private JLabel k0;
    private JLabel k1;
    private JLabel k2;
    private JLabel k3;
    private JLabel k4;
    private JLabel a4;
    private JLabel a5;
    private JLabel a6;
    private JLabel a7;
    private JLabel a8;
    private JLabel a9;
    private JLabel k5;
    private JLabel k6;
    private JLabel k7;
    private JLabel k8;
    private JLabel k9;
    private JLabel he4;
    private JLabel he5;
    private JLabel he6;
    private JLabel he7;
    private JLabel he8;
    private JLabel he9;
    private JLabel as5;
    private JLabel as4;
    private JLabel as6;
    private JLabel as7;
    private JLabel as8;
    private JLabel as9;
    private JLabel dc4;
    private JLabel dc5;
    private JLabel dc6;
    private JLabel dc7;
    private JLabel dc8;
    private JLabel dc9;
    private JLabel si4;
    private JLabel si5;
    private JLabel si6;
    private JLabel si7;
    private JLabel si8;
    private JLabel he0;
    private JLabel as0;
    private JLabel dc0;
    private JLabel si0;
    private JLabel he1;
    private JLabel as1;
    private JLabel dc1;
    private JLabel si1;
    private JLabel si2;
    private JLabel dc2;
    private JLabel as2;
    private JLabel he2;
    private JLabel he3;
    private JLabel as3;
    private JLabel dc3;
    private JLabel si3;
    private JLabel a10;
    private JLabel a11;
    private JLabel a12;
    private JLabel k10;
    private JLabel k11;
    private JLabel k12;
    private JLabel he10;
    private JLabel he11;
    private JLabel he12;
    private JLabel as10;
    private JLabel as11;
    private JLabel as12;
    private JLabel dc10;
    private JLabel dc11;
    private JLabel dc12;
    private JLabel si9;
    private JLabel si10;
    private JLabel si11;
    private JLabel si12;
    private JLabel ac0;
    private JLabel ac1;
    private JLabel ac2;
    private JLabel ac3;
    private JLabel ac4;
    private JLabel ac5;
    private JLabel ac6;
    private JLabel ac7;
    private JLabel ac8;
    private JLabel ac9;
    private JLabel ac10;
    private JLabel ac11;
    private JLabel ac12;
    private JLabel se0;
    private JLabel se1;
    private JLabel se2;
    private JLabel se3;
    private JLabel se4;
    private JLabel se5;
    private JLabel se6;
    private JLabel se7;
    private JLabel se8;
    private JLabel se9;
    private JLabel se10;
    private JLabel se11;
    private JLabel se12;
    private JLabel d0;
    private JLabel d1;
    private JLabel d2;
    private JLabel d3;
    private JLabel d4;
    private JLabel d5;
    private JLabel d6;
    private JLabel d7;
    private JLabel d8;
    private JLabel d9;
    private JLabel d10;
    private JLabel d11;
    private JLabel d12;
    private JLabel r0;
    private JLabel r1;
    private JLabel r2;
    private JLabel r3;
    private JLabel r4;
    private JLabel r5;
    private JLabel r6;
    private JLabel r7;
    private JLabel r8;
    private JLabel r9;
    private JLabel r10;
    private JLabel r11;
    private JLabel r12;
    private JLabel bs0;
    private JLabel bs1;
    private JLabel bs2;
    private JLabel bs3;
    private JLabel bs4;
    private JLabel bs5;
    private JLabel bs6;
    private JLabel bs7;
    private JLabel bs8;
    private JLabel bs9;
    private JLabel bs10;
    private JLabel bs11;
    private JLabel bs12;
    private JLabel ba0;
    private JLabel ba1;
    private JLabel ba2;
    private JLabel ba3;
    private JLabel ba4;
    private JLabel ba5;
    private JLabel ba6;
    private JLabel ba7;
    private JLabel ba8;
    private JLabel ba9;
    private JLabel ba10;
    private JLabel ba11;
    private JLabel ba12;
    private JLabel be0;
    private JLabel be1;
    private JLabel be2;
    private JLabel be3;
    private JLabel be4;
    private JLabel be5;
    private JLabel be6;
    private JLabel be7;
    private JLabel be8;
    private JLabel be9;
    private JLabel be10;
    private JLabel be11;
    private JLabel be12;
    private JButton bPositive;
    private JButton bNegative;

    private static int currentPlayer;
    private static boolean isPositive;

    /*
    public int[] getTotalA() {
        int[] iA = new int[13];
    }
    public int[] getTotalK() {

    }
    public int[] getTotalHe() {

    }
    public int[] getTotalAs() {

    }
    public int[] getTotalDc() {

    }
    public int[] getTotalSi() {

    }
    public int[] getTotalAc() {

    }
    public int[] getTotalSe() {

    }
    public int[] getTotalD() {

    }
    public int[] getTotalR() {

    }
    public int[] getTotalBs() {

    }
    public int[] getTotalBa() {

    }
    public int[] getTotalBe() {

    }
    */

    public Interface() {
        add(pMain);

        setTitle("Stats");
        setSize(1400,1000);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        JLabel[] a = {a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12};
        JLabel[] k = {k0, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12};
        JLabel[] he = {he0, he1, he2, he3, he4, he5, he6, he7, he8, he9, he10, he11, he12};
        JLabel[] as = {as0, as1, as2, as3, as4, as5, as6, as7, as8, as9, as10, as11, as12};
        JLabel[] dc = {dc0, dc1, dc2, dc3, dc4, dc5, dc6, dc7, dc8, dc9, dc10, dc11, dc12};
        JLabel[] si = {si0, si1, si2, si3, si4, si5, si6, si7, si8, si9, si10, si11, si12};
        JLabel[] ac = {ac0, ac1, ac2, ac3, ac4, ac5, ac6, ac7, ac8, ac9, ac10, ac11, ac12};
        JLabel[] se = {se0, se1, se2, se3, se4, se5, se6, se7, se8, se9, se10, se11, se12};
        JLabel[] d = {d0, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12};
        JLabel[] r = {r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12};
        JLabel[] bs = {bs0, bs1, bs2, bs3, bs4, bs5, bs6, bs7, bs8, bs9, bs10, bs11, bs12};
        JLabel[] ba = {ba0, ba1, ba2, ba3, ba4, ba5, ba6, ba7, ba8, ba9, ba10, ba11, ba12};
        JLabel[] be = {be0, be1, be2, be3, be4, be5, be6, be7, be8, be9, be10, be11, be12};

        JButton[] players = {bChris, bDavidN, bJason, bMax, bAndrew, bSeamus, bBrennan, bStone, bSebby, bVu, bDavidR, bJP, bWill};
        for (int i = 0; i < 13; i++) {
            players[i].setBackground(Color.lightGray);
            players[i].setOpaque(true);
        }

        bChris.setBackground(Color.blue);
        currentPlayer = 0;

        bPositive.setForeground(Color.green);
        bNegative.setForeground(Color.red);
        bPositive.setOpaque(true);
        bNegative.setOpaque(true);
        bPositive.setBackground(Color.blue);
        bNegative.setBackground(Color.lightGray);

        isPositive = true;


        bPositive.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bPositive.setBackground(Color.blue);
                bNegative.setBackground(Color.lightGray);
                isPositive = true;
            }
        });
        bNegative.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bNegative.setBackground(Color.blue);
                bPositive.setBackground(Color.lightGray);
                isPositive = false;
            }
        });






        bAttack.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (a[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                a[currentPlayer].setText("" + x);
            }
        });
        bKill.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (k[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                k[currentPlayer].setText("" + x);
            }
        });
        bHitError.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (he[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                he[currentPlayer].setText("" + x);
            }
        });
        bAssist.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (as[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                as[currentPlayer].setText("" + x);
            }
        });
        bSetError.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (dc[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                dc[currentPlayer].setText("" + x);
            }
        });
        bServeIn.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (si[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                si[currentPlayer].setText("" + x);
            }
        });
        bAce.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (ac[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                ac[currentPlayer].setText("" + x);
            }
        });
        bServeError.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (se[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                se[currentPlayer].setText("" + x);
            }
        });
        bDig.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (d[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                d[currentPlayer].setText("" + x);
            }
        });
        bRecError.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (r[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                r[currentPlayer].setText("" + x);
            }
        });
        bBlockS.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (bs[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                bs[currentPlayer].setText("" + x);
            }
        });
        bBlockA.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (ba[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                ba[currentPlayer].setText("" + x);
            }
        });
        bBlockE.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x = Integer.parseInt (be[currentPlayer].getText());
                if (isPositive) {
                    x++;
                } else {
                    if (x > 0) {
                        x--;
                    }
                }
                be[currentPlayer].setText("" + x);
            }
        });




        bChris.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bChris.setBackground(Color.blue);
                if (currentPlayer != 0) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 0;
            }
        });
        bDavidN.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bDavidN.setBackground(Color.blue);
                if (currentPlayer != 1) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 1;
            }
        });
        bJason.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bJason.setBackground(Color.blue);
                if (currentPlayer != 2) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 2;
            }
        });
        bMax.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bMax.setBackground(Color.blue);
                if (currentPlayer != 3) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 3;
            }
        });
        bAndrew.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bAndrew.setBackground(Color.blue);
                if (currentPlayer != 4) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 4;
            }
        });
        bSeamus.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bSeamus.setBackground(Color.blue);
                if (currentPlayer != 5) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 5;
            }
        });
        bBrennan.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bBrennan.setBackground(Color.blue);
                if (currentPlayer != 6) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 6;
            }
        });
        bStone.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bStone.setBackground(Color.blue);
                if (currentPlayer != 7) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 7;
            }
        });
        bSebby.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bSebby.setBackground(Color.blue);
                if (currentPlayer != 8) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 8;
            }
        });
        bVu.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bVu.setBackground(Color.blue);
                if (currentPlayer != 9) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 9;
            }
        });
        bDavidR.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bDavidR.setBackground(Color.blue);
                if (currentPlayer != 10) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 10;
            }
        });
        bJP.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bJP.setBackground(Color.blue);
                if (currentPlayer != 11) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 11;
            }
        });
        bWill.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                bWill.setBackground(Color.blue);
                if (currentPlayer != 12) {
                    players[currentPlayer].setBackground(Color.lightGray);
                }

                currentPlayer = 12;
            }
        });

    }
}
