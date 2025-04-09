import java.util.Scanner;
interface methods{
    public double area();
    public double perimeter();
}
class Rectangle implements methods{
    double length;
    double breadth;
    public Rectangle(Scanner sc){
        System.out.println("enter length:");
        length=sc.nextDouble();
        System.out.println("enter breadth:");
        breadth=sc.nextDouble();
    }
    public void display(){
        System.out.println("Rectangle of lenght:"+length+ "and breadth:"+breadth);
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
class Circle implements methods{
    double radius;
    public Circle(Scanner sc){
        System.out.println("enter the radius:");
        radius=sc.nextDouble();
    }
    public void display(){
        System.out.println("Circle of radius:"+radius);
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
public class methodDemo {
    public static void main(String[]arg){
        int n;
        Scanner sc=new Scanner(System.in);
     do{
      System.out.println("1.Create Rectangle\n2.Create circle\n3.Exit");
      System.out.print("enter your choice:");
      n=sc.nextInt();
      switch(n){
          case 1:Rectangle r1=new Rectangle(sc);
                r1.display();
                System.out.println("Area="+r1.area());
                System.out.println("Perimeter="+r1.perimeter());
               break;
          case 2:Circle c1=new Circle(sc);
                c1.display();
                System.out.println("Area="+c1.area());
                System.out.println("Perimeter="+c1.perimeter());
                break;
          case 3:System.out.println("exiting....");
                break;
          default:System.out.println("enter valid choice");
        }
      }while(n!=3);
      sc.close();
    }
}

