import acm.program.*;
import acm.util.RandomGenerator;
public class RandomHozor extends ConsoleProgram {
	RandomGenerator rand = RandomGenerator.getInstance();
	class HozorToo{
		private int too;
		public String getToo(){
			too = rand.nextInt(1, 13);
			switch(too){
			case 1:
				return "A";
			case 2:
				return "2";
			case 3:
				return "3";
			case 4:
				return "4";
			case 5:
				return "5";
			case 6:
				return "6";
			case 7:
				return "7";
			case 8:
				return "8";
			case 9:
				return "9";
			case 10:
				return "10";
			case 11:
				return "Bool";
			case 12:
				return "Hatan";
			case 13:
				return "Khan";	
			default:
				return "";
			}
		}
	}
	class HozorUngu{
		private int ungu;
		public String getUngu(){
			ungu = rand.nextInt(1, 2);
			if(ungu == 1)
				return "Ulaan";
			else
				return "Har";
		}
	}
	class HozorZereglel{
		private int zereglel;
		public String getZereglel(){
			zereglel = rand.nextInt(1, 4);
			switch(zereglel){
			case 1:
				return "Gil";
			case 2:
				return "Dorvoljin";
			case 3:
				return "Zurh";
			case 4:
				return "Tsetseg";
			default:
				return "";
			}
		}
	}
	public void run(){
		HozorToo too = new HozorToo();
		HozorUngu ungu = new HozorUngu();
		HozorZereglel zereglel = new HozorZereglel();
		for(int i=0; i<10; i++){
			println(i+1 + ". " + too.getToo() + " " + zereglel.getZereglel() + " " + ungu.getUngu());
		}
	}
}
