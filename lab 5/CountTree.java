import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class CountTree extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    int tooluur = 0;
    while(!kara.treeFront())
    {
	    if(!kara.treeFront())
	    {
	        if(kara.onLeaf())
	        {
	            tooluur++;
	            kara.move();
	        }
	        else
	            kara.move();
	    }
    }
    tools.showMessage(tooluur + "shirheg navch baina");
  }
}