import acm.program.*;
public class Employee extends ConsoleProgram {
	class Ajiltan{
		private String name;
		private String position;
		private String address;
		private int phoneNo;
		public Ajiltan(String ner, String heltes){
			name = new String(ner);
			position = new String(heltes);
			address = "unknown";	
		}
		public String getName(){
			return name;
		}
		public String getPosition(){
			return position;
		}
		public String getAddress(){
			return address;
		}
		public int getPhone(){
			return phoneNo;
		}
		public void setPosition(String a){
			position = a;
		}
		public void setAddress(String a){
			address = a;
		}
		public void setPhone(int a){
			phoneNo = a;
		}
		public void showData(){
			println("Ajiltnii ner: " + name);
			println("Ajiltnii ajillaj bui heltes: " + position);
		}
		public String toString(){
			return 	position + "heltesd ajildag" + name + "nertei ajiltan.";
		}
		public String getContactInfo(){
			return "mobile phone: " + phoneNo + " ,address: " + address;
		}
	}
	public void run(){
		Ajiltan Bilguun = new Ajiltan("Bilguun", "Darga");
		Ajiltan Enkhbold = new Ajiltan("Enkhbold", "Udahgui halagdah ajiltan");
		Bilguun.showData();
		Enkhbold.showData();
		Enkhbold.setAddress("Huvsgul");
		Enkhbold.setPhone(99803284);
		Enkhbold.setPosition("Tseverlegch");
		Bilguun.setAddress("Erdenet");
		Bilguun.setPhone(95623281);
		Bilguun.showData();
		Enkhbold.showData();
		println(Bilguun.getContactInfo());
		println(Enkhbold.getContactInfo());
	}
}
