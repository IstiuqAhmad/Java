class Rectangle{

    private double length;
    private double width;
    private int count=0;
 
Rectangle()
 {
     count++;
 
 }
Rectangle(double l,double w)
 {
this();
length = l;
     width = w;
 }
 
public double getArea()  

 {

     return length*width;
   
 }
 
void display(){

System.out.println("Area of Rectangle is: "+getArea());
System.out.println(count);

 }
}

class Triangle{

    private double height;
    private double base;
    private int count=0;
 
  Triangle()
 
 {
     count++;
 
 }
Triangle(double h,double b)

 {
this();
height = h;
     base = b;
 }
 
public double getArea()  

 {
    return 0.5*base*height;
   
 }
 
void display(){
System.out.println("Area of Triangle is: "+getArea());
System.out.println(count);

 }
}

class Circle{

    private double circle;
    private int count=0;
 
 Circle()
 {
     count++;
 
 }
 
 Circle(double c)
 {
this();
circle=c;
 }
 
 public double getArea()  
 {
    return 3.1416*circle*circle;
   
 }
 
 void display(){
System.out.println("Area of CIrcle is: "+getArea());
System.out.println(count);

 }
}

 class Start{

public static void main(String [] args)
 {
    Rectangle r =new Rectangle(2,5);
   r.display();
 {
  Triangle t =new Triangle(2,5);
  t.display();
 }
 {
  Circle c =new Circle(2);
  c.display();
 }
}
}  