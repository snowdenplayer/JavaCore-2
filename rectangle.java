package ua.lviv.lgs;

public class rectangle {
	private float length;
	private float width;
	
	
	public rectangle() {
		this.length = 23.5f;
		this.width = 14.25f;	
	}
	public  rectangle(float length,float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getPerymetr(){
		float perymetr = (this.length+this.width)*2;
	      return perymetr;
	 } 
	
	public float getArea(){
		float area = this.length*this.width;
	      return area;
	 } 
	
}
