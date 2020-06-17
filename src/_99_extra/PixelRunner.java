package _99_extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty pp = new PixelParty();
	
	pp.setRainbow(true);
	pp.drawCircle(294, 222, 159);
	pp.drawRectangle(100, 400, 50, 1000);
	pp.saveImage();
	pp.displayImage();
}
}
