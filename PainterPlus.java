import org.code.neighborhood.*;
public class PainterPlus extends Painter {
//makes painter move until runs out of paint
  public void run() {
  while (hasPaint()) {
  move();
  paint("brown");
}
  }
  // turns painter right
  
public void turnRight() {
  turnLeft();
  turnLeft();
  turnLeft();
}
//turns painter around
  public void turnAround() {
  turnLeft();
  turnLeft();
}
//takes all paint
public void takeAllPaint() {
while(isOnBucket()){
  takePaint();
  }
}  
//moves painter until it reaches wall
  public void moveFast() {
while(canMove()){
  move();
  }
}
//paints and moves until the painter has no paint left
    public void paintToEmpty(String color) {
while(hasPaint()){
  paint(color);
  move();
  
  }
}
// paints a donut 
      public void paintDonut(String color) {
while(hasPaint()){
move();
  paint(color);
  turnRight();
  move();
  paint(color);
  
  }
}
  //resets position of any painter
  public void resetPosition() {
    if (!isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }
//moves painter to any corner
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  
}