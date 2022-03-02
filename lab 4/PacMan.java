import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class PacMan extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    while(!kara.treeFront() || !kara.onLeaf()){
    if(kara.onLeaf()){
        kara.removeLeaf();
        kara.move();
    }else if(!kara.onLeaf()){
        kara.turnRight();
        kara.turnRight();
        kara.move();
        kara.turnLeft();
        kara.move();
    }
   }
  }
}

        