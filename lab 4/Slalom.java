import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class Slalom extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    // state = 1 bol zuun bol taldaa
    // state = 2 bol baruun taldaa
    int state = 1;
    while(true){
    while(state == 1){
        if(kara.treeLeft()){
            kara.move();
            kara.turnLeft();
            kara.move();
            kara.move();
            kara.turnLeft();
            kara.move();
            if(kara.treeLeft() && !kara.treeRight())
                state = 1;
            else
                state = 2;
        }
    }
    while(state == 2){
        if(kara.treeRight()){
            kara.move();
            kara.turnRight();
            kara.move();
            kara.move();
            kara.turnRight();
            kara.move();
            if(kara.treeRight() && !kara.treeLeft())
                state = 2;
            else
                state = 1;
    }
  }
  }
}}