package py.uaa.clase.java;

public abstract class Figura {
	int x;
	int y;
	//constructor
	Figura(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
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
	public void print(){
		
	}
	public static void main(String[] args){
		Figura figu = new Figura(7 , 8);
	}
}
