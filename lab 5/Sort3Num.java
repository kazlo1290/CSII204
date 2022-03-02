import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class Sort3Num extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  public void myProgram() {
    // put your main program here, for example:
    int a, b, c, min, i;
    a = tools.intInput("a toog oruulna uu: ");
    b = tools.intInput("b toog oruulna uu: ");
    c = tools.intInput("c toog oruulna uu: ");
    if(a > b && b > c)
        tools.showMessage(a + " " + b + " " + c);
    else if(a > c && c > b)
        tools.showMessage(a + " " + c + " " + b);
    else if(b > a && a > c)
        tools.showMessage(b + " " + a + " " + c);
    else if(b > c && c > a)
        tools.showMessage(b + " " + c + " " + a);
    else if(c > a && a > b)
        tools.showMessage(c + " " + a + " " + b);
    else if(c > b && b > a)
        tools.showMessage(c + " " + b + " " + a);
  }
}

        