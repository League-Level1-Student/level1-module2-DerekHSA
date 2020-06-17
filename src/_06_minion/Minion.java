package _06_minion;

public class Minion {
	
	    private String name; 
		private int eyes; 
		private String color; 
		private String master;
		Minion(String name ,int eyes, String color, String master){
			this.name = name;
			this.eyes = eyes;
			this.color = color;
			this.master=master;		
		}
		public Object getColor() {
			// TODO Auto-generated method stub
			return color;
		}
		public Object getEyes() {
			// TODO Auto-generated method stub
			return eyes;
		}
		public Object getName() {
			// TODO Auto-generated method stub
			return name;
		}
		public Object getMaster() {
			// TODO Auto-generated method stub
			return master;
		}
		public void setMaster(String mmaster) {
			// TODO Auto-generated method stub
			master=mmaster;
		}
		
}
