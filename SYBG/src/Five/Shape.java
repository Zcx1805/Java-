package Five;
abstract class Shape {    
	static final float PI=3.14F;
	public abstract float getPerimeter();
	public abstract float getArea();
}
class Rectangle extends Shape {    
	private float length;
	private float width;
	public Rectangle(float length,float width){
		this.length=length;
		this.width=width;
	}
	public float getPerimeter(){  
		return (length+width)*2;
	}
	public float getArea(){   
		return length*width;
	}
}
class Circle extends Shape {    
	private float radius;
	public Circle(float r){
		radius=r;
	}
	public float getPerimeter(){  
		return 2*PI*radius;
	}
	public float getArea(){  
		return PI*radius*radius;
	}
}



