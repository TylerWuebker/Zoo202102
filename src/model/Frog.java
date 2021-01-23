package model;

public class Frog {
	private boolean isPoisonous;
	private String color;
	private int length;
	
	Frog(){
		
	}
	
	Frog(boolean _isPoisonous, String _color, int _length){
		setPoisonous(_isPoisonous);
		setColor(_color);
		setLength(_length);
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String speak() {
		return "RIBBIT";
	}
}
