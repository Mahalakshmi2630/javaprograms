package test2;

class Rectangle extends Shape2d {
	  @Override
	  public void draw() {
	    System.out.println("Rectangle: Drawing a rectangle.");
	  }
	  @Override
	  public void resize() {
	    System.out.println("Rectangle: Resizing the rectangle.");
	  }
	}
