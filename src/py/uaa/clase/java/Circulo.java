package py.uaa.clase.java;

public class Circulo {
	public String color;
	public int x;
	public int y;
	public static double pi = 3.14;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static void main(String[] args) {
		Circulo c = new Circulo();
		c.setColor("rojo");
		c.setX(3);
		c.setY(6);
		
		Circulo c2 = new Circulo();
		c2.setColor("azul");
		c2.setX(10);
		c2.setY(20);
		System.out.println("Circulo c2: " + c2.getX() + " " + c2.getY() + " " + c2.pi);
		System.out.println("Circulo c: " + " " + c.getX() + " " + c.getY() + " " + c.pi);
	}
}
