package OOPCLASS;



// Fig. 8.23: TestDraw.java
// Test application to display a DrawPanel.
 import javax.swing.JFrame;

 public class testLine
 {
    public static void main( String args[] )
    {
       DrawPanel panel = new DrawPanel();
      JFrame application = new JFrame();

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( panel );
      application.setSize( 500, 500 );
      application.setVisible( true );
   } // end main
} // end class TestDraw
