import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class Invert extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    // state = 1 bol baruun
    // state = 2 bol zuun
    // state = -1 bol stop
    int state = 1;
    while(state != -1){
    while(state == 1){
        if(kara.onLeaf()){
            kara.removeLeaf();
            if(!kara.treeFront())
                kara.move();
            else{
                state = -1;
                break;
            }
        }else if(!kara.onLeaf()){
            kara.putLeaf();
            if(!kara.treeFront())
                kara.move();
            else{
                state = -1;
                break;
            }
        }
        if(kara.treeRight() && kara.treeFront()){
            if(kara.onLeaf()){
                state = -1;
                kara.removeLeaf();
                break;
            }else {
                state = -1;
                break;
            }
        }
        if(kara.treeFront() && kara.onLeaf()){
            kara.removeLeaf();
            kara.turnRight();
            kara.move();
            kara.turnRight();
            state = 2;
        }
        if(kara.treeFront() && !kara.onLeaf()){
            kara.putLeaf();
            kara.turnRight();
            kara.move();
            kara.turnRight();
            state = 2;
        }
    }
    while(state == 2){
        if(kara.onLeaf()){
            kara.removeLeaf();
            if(!kara.treeFront())
                kara.move();
            else{
                state = -1;
                break;
            }
        }else if(!kara.onLeaf()){
            kara.putLeaf();
            if(!kara.treeFront())
                kara.move();
            else{
                state = -1;
                break;
            }
        }
        if(kara.treeLeft() && kara.treeFront()){
            if(kara.onLeaf()){
                state = -1;
                kara.removeLeaf();
                break;
            }else {
                state = -1;
                break;
            }
        }
        if(kara.treeFront() && kara.onLeaf()){
            kara.removeLeaf();
            kara.turnLeft();
            kara.move();
            kara.turnLeft();
            state = 1;
        }
        if(kara.treeFront() && !kara.onLeaf()){
            kara.putLeaf();
            kara.turnLeft();
            kara.move();
            kara.turnLeft();
            state = 1;
        }
    }
  }}
}

        