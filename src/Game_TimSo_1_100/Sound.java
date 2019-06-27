/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_TimSo_1_100;

/**
 *
 * @author KY
 */
import java.io.File;
import javax.sound.sampled.*;

public class Sound {
    public Clip clip;
    public String name;
   
   Sound(String filename) {

      try {

         name = filename;
         File yourFile = new File(filename);
         AudioInputStream stream;
         AudioFormat format;
         DataLine.Info info;

         stream = AudioSystem.getAudioInputStream(yourFile);
         format = stream.getFormat();
         info = new DataLine.Info(Clip.class, format);
         clip = (Clip) AudioSystem.getLine(info);
         clip.open(stream);
      } catch (Exception e) {
         System.out.println("Error reading sound file: " + filename +".\n" + e.toString());
      }
   }

   public void playSound() {
      if(clip == null ){
         if(name != null){
            System.out.println("Error playing " + name + "; file not initialized");
         }
         return;
      }
      clip.start();
      clip.loop(Clip.LOOP_CONTINUOUSLY);
   }

   public void stopSound() {
      if(clip == null ){
         if(name != null){
            System.out.println("Error stopping " + name + "; file not initialized");
         }
         return;
      }
      clip.stop();
   }

   public void playSoundOnce() {
      if(clip == null ){
         if(name != null){
            System.out.println("Error playing " + name + "; file not initialized");
         }
         return;
      }
      clip.start();
      clip.loop(0);
   }


}
