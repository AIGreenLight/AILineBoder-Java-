
package saver1;
 
import java.applet.*;
import java.awt.*;
import java.util.Random;
 
public class saver1 extends Applet {
 
   int width, height;
Random rnd = new Random();
   public void init() {
      width = getSize().width;
      height = getSize().height;
      setBackground( Color.black );
   }
 
   public void paint( Graphics g ) {
      g.setColor( Color.green );
      for ( int i = 0; i < 100; ++i ) {
          int x1 = rnd.nextInt( getSize().width );
          int y1 = rnd.nextInt( getSize().height );
          int x2 = rnd.nextInt( getSize().width );
          int y2 = rnd.nextInt( getSize().height );
          
          g.drawLine( x1, y1, x2, y2 );
      }
   }
}