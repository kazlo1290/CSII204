import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class Mazes extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    // state = 1 bol baruun zug
    // state = 2 bol zuun zug
    // state = -1 bol stop
    int state = 1;
    while(state != -1){
    while(state == 1){
        if(kara.treeFront() && kara.treeLeft()){
            kara.turnRight();
            kara.turnRight();
            state = 2;
        } else
        if(kara.treeLeft()){
            kara.move();
        }else{
            kara.turnLeft();
            kara.move();
            kara.move();
            kara.turnRight();
            state = 1;
        }
        if(kara.onLeaf()){
            state = -1;
            break;
        }
    }
    while(state == 2){
        if(kara.treeFront() && kara.treeRight()){
            kara.turnLeft();
            kara.turnLeft();
            state = 1;
        } else
        if(kara.treeRight()){
            kara.move();
        }else {
            kara.turnRight();
            kara.move();
            kara.move();
            kara.turnLeft();
        }
        if(kara.onLeaf()){
            state = -1;
            break;
        }
    }
    }
  }
}

        