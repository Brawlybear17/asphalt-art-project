import org.code.neighborhood.*;
public class eyePainter extends PainterPlus {
//paints right eye with any color and black
  public void rightPaintEye(String color) {
if (canMove("East")) {
    moveFast();
}
    turnAround();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnRight();
    move();
    paint("black");
    turnRight();
    move();
    paint(color);
    resetPosition();
}
//paints left eye with any color and black
  public void leftPaintEye(String color) {
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
        move();
    move();
    paint(color);
    turnLeft();
    move();
    paint("black");
    turnLeft();
    move();
    paint(color);
    resetPosition();
      
  }
  
  
  }