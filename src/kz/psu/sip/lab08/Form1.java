package kz.psu.sip.lab08;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JFrame {

    public void dvigatel(int tim) {
        Point p = jLabel_Bus.getLocation();
        switch (tim) {
            case 1: {
                p.x = 15;
                p.y = 50;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("Down.png"))));
                jTimer1.start();
            }
            break;
            case 2: {
                p.x = 150;
                p.y = 190;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("Down.png"))));
                jTimer3.start();
            }
            break;
            case 3: {
                p.x = 350;
                p.y = 230;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("Right.png"))));
                jTimer5.start();
            }
            break;
            case 4: {
                p.x = 587;
                p.y = 250;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("Up.png"))));
                jTimer6.start();
            }
            break;
            case 5: {
                p.x = 589;
                p.y = -10;
               
                jTimer6.start();
            }
            break;
            case 6: {
                p.x = 400;
                p.y = 75;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("Right.png"))));
                jTimer9.start();
            }
            break;
        }
        jLabel_Bus.setLocation(p);
    }

    javax.swing.Timer jTimer1 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 1) {
                jTimer1.stop();
            }
            Point p = jLabel_Bus.getLocation();

            if (p.y <= 190) {
                ++p.y;

            } else {
                jTimer1.stop();
                jTimer2.start();
            }

            jLabel_Bus.setLocation(p);
            if (p.x == -50 && p.y == 190) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Right.png")));
            }

        }
    });
    javax.swing.Timer jTimer2 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {

            Point p = jLabel_Bus.getLocation();
            if (p.x <= 130) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Right.png")));
            }
            if (p.x <= 150) {
                ++p.x;

            }
            jLabel_Bus.setLocation(p);

            if (p.x == 150) {
                jTimer2.stop();
                jTimer3.start();
            }
        }
    });
    javax.swing.Timer jTimer3 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 2) {
                jTimer3.stop();
            }
            Point p = jLabel_Bus.getLocation();

            if (p.y <= 240) {
                ++p.y;

            } else {
                jTimer3.stop();
                jTimer4.start();
            }

            jLabel_Bus.setLocation(p);
            if (p.y == 193) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Down.png")));
            }

        }
    });
    javax.swing.Timer jTimer4 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {

            Point p = jLabel_Bus.getLocation();
            if (p.x <= 151) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Right.png")));
            }
            if (p.x <= 325) {
                ++p.x;

            }
            jLabel_Bus.setLocation(p);

            if (p.x == 325) {
                jTimer4.stop();
                jTimer5.start();
            }
        }
    });
    javax.swing.Timer jTimer5 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 3) {
                jTimer5.stop();
            }
            Point p = jLabel_Bus.getLocation();

            if (p.x <= 585) {
                ++p.x;

            }
            jLabel_Bus.setLocation(p);

            if (p.x == 585) {
                jTimer5.stop();
                jTimer6.start();
            }
        }
    });
    javax.swing.Timer jTimer6 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 4) {
                jTimer6.stop();
            }
            Point p = jLabel_Bus.getLocation();
            if (p.y <= 589) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Up.png")));
            }
            p.y -= 1;
            jLabel_Bus.setLocation(p);

            if (p.y <= -10) {
                jTimer6.stop();
                jTimer7.start();
            }
        }
    });
    javax.swing.Timer jTimer7 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 5) {
                jTimer7.stop();
            }
            Point p = jLabel_Bus.getLocation();
            if (p.y <= 0) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Left.png")));
            }
            if (p.x >= 400) {
                p.x -= 1;

            }
            jLabel_Bus.setLocation(p);

            if (p.x == 400) {
                jTimer7.stop();
                jTimer8.start();
            }
        }
    });
    javax.swing.Timer jTimer8 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {

            Point p = jLabel_Bus.getLocation();

            if (p.y <= 75) {
                ++p.y;

            } else {
                jTimer8.stop();
                jTimer9.start();
            }

            jLabel_Bus.setLocation(p);
            if (p.x == 400) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Down.png")));
            }
        }
    });
    javax.swing.Timer jTimer9 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 6) {
                jTimer9.stop();
            }
            Point p = jLabel_Bus.getLocation();
            if (p.x <= 399) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Left.png")));
            }
            if (p.x >= 210) {
                p.x -= 1;

            }
            jLabel_Bus.setLocation(p);

            if (p.x == 210) {
                jTimer9.stop();
                jTimer10.start();
            }
        }
    });
    javax.swing.Timer jTimer10 = new javax.swing.Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {

            Point p = jLabel_Bus.getLocation();
            if (p.y <= 589) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("Up.png")));
            }
            p.y -= 1;
            jLabel_Bus.setLocation(p);

            if (p.y <= 0) {
                jTimer10.stop();

            }
        }
    });

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Bus = new javax.swing.JLabel();
        jLabel_Track = new javax.swing.JLabel();
        jButton_Start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider_Start = new javax.swing.JSlider();
        jSlider_Stop = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с таймерами Swing в Java");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel_Bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/psu/sip/lab08/Down.png"))); // NOI18N
        getContentPane().add(jLabel_Bus);
        jLabel_Bus.setBounds(10, 50, 120, 80);

        jLabel_Track.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/psu/sip/lab08/track.png"))); // NOI18N
        getContentPane().add(jLabel_Track);
        jLabel_Track.setBounds(0, 0, 690, 311);

        jButton_Start.setText("Старт");
        jButton_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StartActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Start);
        jButton_Start.setBounds(10, 340, 90, 40);

        jLabel2.setText("Точка начала движения");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 340, 170, 14);

        jLabel3.setText("Конечная точка движения");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 370, 190, 14);

        jSlider_Start.setMajorTickSpacing(1);
        jSlider_Start.setMaximum(6);
        jSlider_Start.setMinimum(1);
        jSlider_Start.setPaintLabels(true);
        jSlider_Start.setValue(2);
        jSlider_Start.setOpaque(false);
        getContentPane().add(jSlider_Start);
        jSlider_Start.setBounds(340, 330, 160, 40);

        jSlider_Stop.setMajorTickSpacing(1);
        jSlider_Stop.setMaximum(7);
        jSlider_Stop.setMinimum(1);
        jSlider_Stop.setPaintLabels(true);
        jSlider_Stop.setToolTipText("");
        jSlider_Stop.setOpaque(false);
        getContentPane().add(jSlider_Stop);
        jSlider_Stop.setBounds(330, 370, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/psu/sip/lab08/bar.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 320, 740, 90);

        setSize(new java.awt.Dimension(698, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StartActionPerformed
        if (jSlider_Start.getValue() > jSlider_Stop.getValue()) {
            JOptionPane.showMessageDialog(rootPane, "Точка старта дальше точки остановки!", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
        } else {
            dvigatel(jSlider_Start.getValue());
        }

    }//GEN-LAST:event_jButton_StartActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Bus;
    private javax.swing.JLabel jLabel_Track;
    private javax.swing.JSlider jSlider_Start;
    private javax.swing.JSlider jSlider_Stop;
    // End of variables declaration//GEN-END:variables
}
