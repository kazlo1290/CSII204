import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class modToiroh extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    while(!kara.onLeaf()){
        if(kara.treeFront()){
            kara.turnLeft();
            kara.move();
            kara.turnRight();
            kara.move();
            kara.move();
        }else if(!kara.treeFront()){
            kara.move();
        }
        if(kara.onLeaf())
            break;
        if(kara.treeRight()){
            kara.move();
        }
        if(!kara.treeRight()){
            kara.turnRight();
            kara.move();
            kara.turnLeft();
        }
    }
  }
}

        