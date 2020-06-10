package _03_smurf;

public class runner {
	public static void main(String[] args) {
		
	
Smurf hs = new Smurf("Handy");
hs.eat();
System.out.println(hs.getName());
Smurf ps = new Smurf("Papa");
System.out.println(ps.getName());
System.out.println(ps.getHatColor());
System.out.println(ps.isGirlOrBoy());
Smurf ss = new Smurf("Smurfette");
System.out.println(ss.getName());
System.out.println(ss.getHatColor());
System.out.println(ss.isGirlOrBoy());
}
}