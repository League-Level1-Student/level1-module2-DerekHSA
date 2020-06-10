package _02_sea_creature;

public class runner {
public static void main(String[] args) {
	SeaCreature ss = new SeaCreature("Spongebob");
	ss.eat();
	ss.laugh();
	SeaCreature ps = new SeaCreature("Patrick");
	ps.eat();
	ps.laugh();
	SeaCreature st = new SeaCreature("Squidward");
	st.eat();
	st.laugh();
}
}
