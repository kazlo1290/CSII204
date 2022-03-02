import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class Tunnel extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    // state = 1 bol oroh
    // state = 2 bol garah
    // state = -1 bol stop
    int state = 1;
    while(state > 0)
    {
        while(state == 1)
        {
            if(kara.treeRight() && kara.treeLeft())
            {
                kara.move();
                state = 2;
            }
            else if(kara.treeRight() && !kara.treeLeft())
            {
                kara.move();
                state = 1;
            }
            else if(!kara.treeRight() && kara.treeLeft()){
                kara.move();
                state = 1;
            }
            else if(!kara.treeRight() && !kara.treeLeft()){
                kara.move();
                state = 1; }
        }
        while(state == 2)
        {
            if(kara.treeRight() && kara.treeLeft())
            {
                kara.move();
                state = 2;
            }
             else if(!kara.treeLeft())
            {
                state = -1;
            }
            else if(!kara.treeRight())
            {
                state = -1;
            }
            else if(!kara.treeLeft() && !kara.treeRight())
            {
                state = -1;
            }
          }
        }
    }
}