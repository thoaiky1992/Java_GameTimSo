/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_TimSo_1_100;

import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;

public class MyForm extends javax.swing.JFrame implements ActionListener {

    Time time = null;
    int search = 3;
    int dem = 0;
    int so = 0;
    int diem = 0;
    int level = 1;
    int time_level;
    JButton[] bt = new JButton[100];
    JButton[] bt2 = new JButton[100];
    JButton btn_start = new JButton("Bắt Đầu");
    JButton btn_End = new JButton("Tạm Dừng");
    JButton btn_chuthich = new JButton("Chú Thích");
    JButton btn_Search = new JButton("Hỗ Trợ : " + search);
    JButton btn_sotieptheo = new JButton("Số Phải Chọn : 0");
    JButton btn_Reset = new JButton("Reset");
    JLabel lb_time = new JLabel("1:30");
    String font = "Times New Roman";
    JPanel panel = new JPanel();
    int size = 40;
    Image img;
    Sound nhacnen;
    String Soundplay = "nhacnen.wav";
    String Soundplaytrue = "dung.wav";
    String Soundplayfalse = "sai_test.wav";
    int n=6,kcx=130,kcy=120;
    String path = System.getProperty("user.dir"); // đường dẫn tuyệt đối tới  thư mục chứa project
    public MyForm() {
        ImageIcon img_i = new ImageIcon(path+"\\images\\b2.jpg");
        setContentPane(new JLabel(img_i));
        initComponents();
        setBounds(200, 50, 900, 580);
        setTitle("Game Search Number");
        lb_time.setBounds(665, 60, 150, 40);
        lb_time.setFont(new Font(font, 1, size));
        add(lb_time);
        btn_sotieptheo.setBounds(630, 150, 150, 40);
        btn_sotieptheo.setFont(new Font(font, 1, 16));
        add(btn_sotieptheo);
        btn_start.setBounds(630, 210, 150, 40);
        btn_start.setFont(new Font(font, 1, 16));
        add(btn_start);
        btn_chuthich.setBounds(630, 270, 150, 40);
        btn_chuthich.setFont(new Font(font, 1, 16));
        add(btn_chuthich);
        btn_End.setBounds(630, 330, 150, 40);
        btn_End.setFont(new Font(font, 1, 16));
        add(btn_End);
        
        btn_Search.setBounds(630, 390, 150, 40);
        btn_Search.setFont(new Font(font, 1, 16));
        add(btn_Search);
        btn_Reset.setBounds(630, 450, 150, 40);
        btn_Reset.setFont(new Font(font, 1, 16));
        add(btn_Reset);
        khoitao();
        for (int i = 0; i < 100; i++) {
            bt[i].addActionListener(this);
            bt[i].setEnabled(false);
        }
        Random();
        btn_start.addActionListener(this);
        btn_End.addActionListener(this);
        btn_End.setEnabled(false);
        btn_Reset.setEnabled(false);
        btn_Search.addActionListener(this);
        btn_Reset.addActionListener(this);
        btn_Search.setEnabled(false);
        btn_chuthich.addActionListener(this);
    }
    void khoitao() {
        int a[] = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = 0;
        }
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                while (true) {
                    int stt = r.nextInt(100);
                    if (a[stt] == 0) {
                        a[stt] = 1;
                        bt[dem] = new JButton("");
                        bt[dem].setBounds( (50*j) + 30,(i*50) + 30, 50, 50);
                        bt[dem].setFont(new Font(font, 0, 18));
                        bt[dem].setVisible(false);
                        add(bt[dem]);
                        dem++;
                        break;
                    }
                }
            }
        }
    }
    void Random() {
        int count=0;
        
        int a[] = new int[100];
        for (int i = 0; i < n*n; i++) {
            a[i] = 0;
        }
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    int stt = r.nextInt(n*n);
                    if (a[stt] == 0) {
                        a[stt] = 1;
                        bt[count].setText(""+stt);
                        bt[count].setBounds( (50*j) + kcx,(i*50) + kcy, 50, 50);
                        bt[count].setFont(new Font(font, 0, 18));
                        bt[count].setVisible(true);
                        bt[count].setBackground(null);
                        count++;
                        break;
                    }
                }
            }
        }
    }

    public void Reset() {
        so = 0;
        dem = 0;
        search = 10;
        diem = 0;
        btn_sotieptheo.setText("Số Phải Chọn : 0");
        btn_Search.setText("Hỗ Trợ : " + search);
        int a[] = new int[n*n];
        for (int i = 0; i < n*n; i++) {
            a[i] = 0;
            bt[i].setVisible(true);
            bt[i].setText("");
            bt[i].setBackground(null);
            bt[i].setEnabled(false);
        }
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    int stt = r.nextInt(n*n);
                    if (a[stt] == 0) {
                        a[stt] = 1;
                        bt[dem].setText("" + stt);
                        bt[dem].setEnabled(false);
                        dem++;
                        break;
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyForm myform = new MyForm();
                myform.setVisible(true);
                myform.setResizable(false);
                myform.setDefaultCloseOperation(EXIT_ON_CLOSE);

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (search == 0) {
            btn_Search.setEnabled(false);
        }
        for (int i = 0; i < 100; i++) {
            if (e.getSource() == bt[i]) {
                if (lb_time.getText().equals("0:00")) // nếu giây 0:00 , nhấn click button thì hiện thông báo
                {
                    int reply = JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục chơi không ?", "Message", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.OK_OPTION) {
                        btn_sotieptheo.setEnabled(false);
                        btn_start.setEnabled(true);
                        btn_Search.setEnabled(false);
                        btn_End.setEnabled(false);
                        btn_Reset.setEnabled(false);
                        nhacnen.stopSound();
                        //Reset();
                        so=0;
                        btn_sotieptheo.setText("Số Phải Chọn : " + so);
                        return;
                    } else {
                        return;
                    }
                }
                if (diem == n*n-1) {
                    for (int j = 0; j < 100; j++)
                    {
                        bt[j].setEnabled(false);
                    }
                    time.stop();
                    nhacnen.stopSound();
                    level++;  // level tăng lên
                    diem = 0;  // cập nhật lại giá trị điểm = 0 để bắt đầu với level mới
                    bt[i].setVisible(false);
                    if(level<=3)
                        JOptionPane.showMessageDialog(this, "Bạn Đã Chiến Thắng ! Chuyển Sang Level :" + level);
                    else
                    {
                        int reply = JOptionPane.showConfirmDialog(this," Tuyệt vời ! Bạn đã dành chiến thắng tất cả các level trong game __ Hẹn gặp lại bạn !!! ", "Thông báo", JOptionPane.OK_OPTION);
                        if(reply==JOptionPane.OK_OPTION)
                            System.exit(0);
                    }
                    btn_start.setEnabled(true);
                    btn_End.setEnabled(false);
                    btn_Search.setEnabled(false);
                    btn_Reset.setEnabled(true);
                    if (level == 1) {
                        lb_time.setText("1:30");
                    }
                    if (level == 2) {
                        so=0;
                        search=8;
                        kcx = 90;
                        kcy = 70;
                        n=8;
                        btn_sotieptheo.setText("Số Phải Chọn : 0");
                        btn_Search.setText("Hỗ Trợ : " + search);
                        lb_time.setText("4:00");
                    }
                    if (level >= 3) {
                        so=0;
                        search=15;
                        kcx = 30;
                        kcy = 30;
                        n=10;
                        btn_sotieptheo.setText("Số Phải Chọn : 0");
                        btn_Search.setText("Hỗ Trợ : " + search);
                        lb_time.setText("6:00");
                    }
                    
                    //Reset();
                } else {
                    int t = Integer.parseInt(bt[i].getText());
                    if (so == t) {
                        Sound sptrue = new Sound(Soundplaytrue);
                        sptrue.playSoundOnce();
                        bt[i].setVisible(false);
                        so++;
                        btn_sotieptheo.setText("Số Phải Chọn : " + so );
                        diem++;
                    } else {
                        int s = time.getGiay();
                        if(s>=10)
                            s-=2;
                        time.stop();
                        time = new Time(lb_time, s);
                        time.start();
                        Sound spsai = new Sound(Soundplayfalse);
                        spsai.playSoundOnce();
                        repaint();
                    }
                }
                int sss = time.getGiay();
                if(sss<=1)
                {
                    for(int k=0;k<n*n;k++)
                        bt[k].setEnabled(false);
                }
            }
        }
        if(e.getSource()==btn_chuthich)
        {
            String s = "' Game Search Number ' là 1 thể loại game mini , dành để giải trí";
            String s1 =  "\ntrong những lúc căng thẳng, mệt mỏi hay khi thời gian rãnh rỗi ....";
            String s2 =  "\n- Quy tắc chơi vô cùng đơn giản , tất cả những gì bạn phải làm là";
            String s3 =  "\ntìm thấy hết tất cả những con số có giá trị tăng dần theo level : ";
            String s4 =  "\nlv1 : 0 -> 36 với thời gian 1:30 ";
            String s6 =  "\nlv1 : 0 -> 64 với thời gian 4:00 ";
            String s7 =  "\nlv1 : 0 -> 99 với thời gian 6:00 ";
            String s8 =  "\n- Lưu ý : trong suốt quá trình chơi :";
            String sthem =  "\n + Khi bạn chọn 1 con số mà không trùng với con số cần tìm thì bạn sẽ bị đi - 2s ";
            String s9 =  "\n + Bạn có thể Dừng/Tiếp Tục trò chơi khi bận đột suất 1 việc gì đó ... ";
            String s10 = "\n + Ngoài ra ở mỗi mức level sẽ có số lần hỗ trợ tìm kiếm giúp bạn khi khó khăn";
            String s11 = "\n- Nếu bạn đã nắm rõ được các chi tiết của game rồi ";
            String s12 = "\nthì giờ chúng ta sẽ bắt đầu vào trải nghiệm trò chơi nhé !!!";
            String Str = s+s1+s2+s3+s4+s6+s7+s8+sthem+s9+s10+s11+s12;
            JOptionPane.showMessageDialog(this, Str);
        }
        if (e.getSource() == btn_start) // nút bắt đầu chơi
        {

            int reply = JOptionPane.showConfirmDialog(null, "Bạn đã sẵn sàng chưa ?", "Message", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.OK_OPTION) {
                Random();
                nhacnen = new Sound(Soundplay);
                nhacnen.playSoundOnce();
                if (level == 1) {
                    time_level = 90;
                    lb_time.setText("1:30");
                }
                if (level == 2) {
                    time_level = 240;
                    lb_time.setText("4:00");
                }
                if (level == 3) {
                    time_level = 360;
                    lb_time.setText("6:00");
                }
                time = new Time(lb_time, time_level);
                time.start();
                for (int i = 0; i < 100; i++) {
                    bt[i].setEnabled(true);
                }
                btn_sotieptheo.setEnabled(true);
                btn_Reset.setEnabled(true);
                btn_End.setEnabled(true);
                btn_start.setEnabled(false);
                btn_Search.setEnabled(true);
                btn_chuthich.setEnabled(false);
                
            }
        }
        if (e.getSource() == btn_End) // nút tạm dừng
        {
            if (btn_End.getText() == "Tạm Dừng" && time.getGiay() == 0) // nếu giây 0:00 , nhấn click button thì hiện thông báo
            {
                int reply = JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục chơi không ?", "Message", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.OK_OPTION) {
                    btn_sotieptheo.setEnabled(false);
                    btn_start.setEnabled(true);
                    btn_Search.setEnabled(false);
                    btn_End.setEnabled(false);
                    btn_Reset.setEnabled(false);
                    Reset();
                    nhacnen.stopSound();
                }
            } else {
                if (btn_End.getText() == "Tạm Dừng") {
                    btn_End.setText("Tiếp Tục");
                    for (int i = 0; i < 100; i++) {
                        bt[i].setEnabled(false);
                    }
                    btn_Search.setEnabled(false);
                    btn_Reset.setEnabled(false);
                    time.stop();
                    nhacnen.stopSound();
                    btn_chuthich.setEnabled(true);
                } else if (btn_End.getText() == "Tiếp Tục") {
                    btn_End.setText("Tạm Dừng");
                    for (int i = 0; i < 100; i++) {
                        bt[i].setEnabled(true);
                    }
                    int s = time.getGiay();
                    time = new Time(lb_time, s);
                    btn_Search.setEnabled(true);
                    btn_Reset.setEnabled(true);
                    btn_chuthich.setEnabled(false);
                    time.start();
                    nhacnen.playSoundOnce();
                }
            }
        }
        if (e.getSource() == btn_Search) {
            if (btn_End.getText() == "Tạm Dừng" && lb_time.getText().equals("0:00")) // nếu giây 0:00 , nhấn click button thì hiện thông báo
            {
                int reply = JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục chơi không ?", "Message", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.OK_OPTION) {
                    btn_sotieptheo.setEnabled(false);
                    btn_start.setEnabled(true);
                    btn_Search.setEnabled(false);
                    btn_End.setEnabled(false);
                    btn_Reset.setEnabled(false);
                    Reset();
                    nhacnen.stopSound();
                }
            } else {
                
                for (int i = 0; i < n*n; i++) {
                    int z = Integer.parseInt(bt[i].getText());
                    if (z == so) {
                        bt[i].setBackground(Color.ORANGE);
                        btn_Search.setText("Hỗ Trợ : " + (search - 1));
                        search--;
                    }
                }
            }

        }
        if (e.getSource() == btn_Reset) {
            nhacnen.stopSound();
            int reply = JOptionPane.showConfirmDialog(null,"Bạn chắc muốn Reset chứ ???","Thông báo ! ", JOptionPane.OK_CANCEL_OPTION);
            if(reply == JOptionPane.OK_OPTION)
            {
                level = 1;
                lb_time.setText(time_level / 60 + ":0" + time_level % 60);
                time.setGiay(time_level);
                btn_sotieptheo.setEnabled(false);
                btn_start.setEnabled(true);
                btn_Search.setEnabled(false);
                btn_End.setEnabled(false);
                btn_Reset.setEnabled(false);
                btn_chuthich.setEnabled(true);
                time.stop();
                Reset();
            }
            else
                nhacnen.playSoundOnce();
        }

    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
