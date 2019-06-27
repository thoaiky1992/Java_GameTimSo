
package Game_TimSo_1_100;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Time extends Thread implements ActionListener{
    JLabel lb_time;
    int giay;
    MyForm mf = new MyForm();
    public int getGiay()
    {
        return giay;
    }
    public void setGiay(int giay)
    {
        this.giay = giay;
    }
    public Time(JLabel lb_time, int giay)
    {
        this.lb_time = lb_time;
        this.giay = giay;
    }
    @SuppressWarnings("static-access")
    @Override
    public void run() {
        while(giay > 0)
        {
            giay--;
            int minute = giay/60;
            int second = giay%60;
            String thoigian = minute + ":" +second;
            if(second<10)
            {
                thoigian = minute + ":0" +second;
            }
            lb_time.setText(thoigian);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        if(giay == 0)
        {
            int reply = JOptionPane.showConfirmDialog(null, "Bạn đã thua !!!", "thua", JOptionPane.YES_NO_OPTION); 
        }
    }
    public void Reset(int giay)
    {
        this.giay =  giay;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
