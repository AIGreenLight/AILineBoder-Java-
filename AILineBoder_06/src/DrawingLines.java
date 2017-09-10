import java.applet.*;
import java.awt.*;
 
public class DrawingLines extends Applet implements Runnable {
 
    int width, height;
    int i = 0;
    Thread t = null;
    boolean threadSuspended;
 
    public void init() {
        width = getSize().width;
        height = getSize().height;
        setBackground( Color.black );
    }
 
    public void paint( Graphics g ) {
      g.setColor( Color.green );
      g.drawLine( width, height, i * width / 10, 0 );
    }
 
    public void start() {
        if ( t == null ) {
            t = new Thread( this );
            threadSuspended = false;
            t.start();
        }
        else {
            if ( threadSuspended ) {
                threadSuspended = false;
                synchronized( this ) {
                    notify();
                }
            }
        }
    }
    
    public void run() {
        try {
            while(true) {
                ++i;
                if(i ==10) {
                    i = 0;
                }
                 
                if(threadSuspended) {
                    synchronized(this) {
                        while(threadSuspended) {
                            wait();
                        }
                    }
                }
                repaint();
                t.sleep(1000);
            }
        }
        catch(InterruptedException ex) {
             
        }
    }
}