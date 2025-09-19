import org.code.neighborhood.*;

public class NeighborhoodRunner {
  
  public static void main(String[] args) {
//fills background with white
    fillInside dan = new fillInside();
  dan.setPaint(1000);
 dan.paintBackground("white");
//creates outline of owl
     paintOutLine dan2 = new paintOutLine();
 dan2.setPaint(1000);
    dan2.Outline("black");
//paints the right eye
    eyePainter danright = new eyePainter();
      danright.setPaint(1000);
    danright.rightPaintEye("Orange");
    // paints the left eye
    eyePainter danleft = new eyePainter();
     danleft.setPaint(1000);
    danleft.leftPaintEye("Orange");
    //paints the head of the owl
    fillPainter danHead = new fillPainter();
      danHead.setPaint(1000);
   danHead.paintHead("brown");
   // paints the body of the owl
    fillPainter danbody = new fillPainter();
    danbody.paintBody("brown");
  }

 
   
 
}

