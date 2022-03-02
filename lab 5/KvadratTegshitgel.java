import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class KvadratTegshitgel extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    int a, b, c;
    double x1, x2, D;
    a = tools.intInput("a toog oruulna uu: ");
    b = tools.intInput("b toog oruulna uu: ");
    c = tools.intInput("c toog oruulna uu: ");
    D = b*b - 4*a*c;
    x1 = ((-1)*b - Math.sqrt(D)) / (2*a);
    x2 = ((-1)*b + Math.sqrt(D)) / (2*a);
    tools.showMessage(x1 + " " + x2);
  }
}

        