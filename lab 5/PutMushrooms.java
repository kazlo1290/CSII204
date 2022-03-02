import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class PutMushrooms extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
/*  public void setMushroom(int x, int y, boolean putMushroom)
  {
      
  } */
  public void myProgram() {
    // put your main program here, for example:
    int x, y;
    int endX = world.getSizeX();
    int endY = world.getSizeY();
    tools.showMessage(endX + " " + endY);
    for(x = 0; x < endX; x++)
    {
        for(y = 0; y < endY; y++)
        {
             if(world.isTree(x, y))
       	    {
                if(y == endY-1)
                    world.setMushroom(x, y-endY+1, true);
                else
		            world.setMushroom(x, y+1, true);
		    }
        }
    }
  }
}

        