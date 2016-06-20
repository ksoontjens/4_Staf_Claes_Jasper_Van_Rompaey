/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.util.Random;
import org.dvb.ui.DVBColor;
import org.havi.ui.HComponent;
import org.havi.ui.HGraphicButton;

/**
 *
 * @author student
 */

// om aan te maken:
// 1: GameComponent gc = ComponentFactory.getInstance("Klaasje");
// 2: gc.init(x, y, bitmap, scale);
public class MijnComponent implements GameComponent extends HGraphicButton {

    Image Klaasje;
    Image PER1;
    Image PER2;
    Image PER3;
    Image PER4;
    Image PER5;
    Image PER6;
    Image PER7;
    Image PER8;
    Image PER9;
    Image PER10;
    
    //MijnComponent[] = new MijnComponent[15];
    
    Image BG1;
    Image BG2;
    Image BG3;
   
    public MijnComponent()
    {
    }

    @Override
    public void init(int x, int y,String bitmap,int scale){
        Klaasje = this.getToolkit().getImage(bitmap);
      
        
      if (scale>0)  Klaasje=Klaasje.getScaledInstance(scale, 115, 50);
        MediaTracker mt=new MediaTracker(this);
        mt.addImage(Klaasje, 1);
            try {
                mt.waitForAll();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        this.setBounds(x,y,Klaasje.getWidth(this),Klaasje.getHeight(this));
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(Klaasje, 0, 0, null);
   
        //g.drawLine(0,0,200,200); //relatief tov positie van de component
        //g.drawLine(200,0,0,200);
       /* g.setColor(new DVBColor(0,0,127,179)); //schaduw
        g.fillRoundRect(10,10,190,100,15,15); //schaduw
        g.setColor(new DVBColor(0,0,255,179));
        g.fillRoundRect(0, 0, 190, 100, 15, 15);

        ///g.setColor(Color.YELLOW);
        g.drawString("IT'S A TRAP", 20, 40); */
    
    
    }
    
    
    
}
