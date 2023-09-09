import java.util.Scanner;

class box{
    double width, depth, height ;

    box()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width:");
        width = sc.nextDouble();
        System.out.println("Enter depth:");
        depth = sc.nextDouble();
        System.out.println("Enter height:");
        height = sc.nextDouble();
        sc.close();
        System.out.println("Box created");
    }
    
    box(double w , double d , double h){
        width=w;
        depth=d;
        height=h;
    }

     double vol(){
        return width*depth*height; 
    }
}
  
class item{
    public static void main(String args[]){
        box b=new box();
        System.out.println("Volume of the box is: " + b.vol());
    }
}

