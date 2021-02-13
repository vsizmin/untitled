public class Lesson1 {
public static void main (String [] args){
double a = Double.parseDouble(args [0]);
    double b = Math.sin(a);
    double c = Math.cos(a);
     double d= Math.pow(b,2);
    double e = Math.pow(c,2);
    double answer = d+e;
    System.out.println("Answer is "+answer);
}
}
