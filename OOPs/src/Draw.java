public class Draw {
    public static void main(String[] args) {

        
        
        Shape rectangle = new Rectangle();
        rectangle.draw();

       
        Shape cube = new Cube();
        cube.draw();

        
        Shape line = new Line();
        line.draw();
    }
}

abstract class Shape {
public abstract void draw();

}
class Rectangle extends Shape {
public void draw() {
	System.out.println("This is Rectangle");
			
		}

    }
class Line extends Shape {
           
public void draw() {
	System.out.println("This is Line");
				
				
			}

        }
class Cube extends Shape {
               
public void draw() {
	System.out.println("This is Cube");
					
					
				}

            }
