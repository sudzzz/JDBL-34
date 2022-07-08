package Session1;

public class MethodOverloading {
    public int sum(int x,int y){
        return (x+y);
    }
    public double sum(double x,double y,double z){
        return  (x+y+z);
    }
    public int sum(int w,int x,int y){
        return (w+x+y);
    }
    public static void main(String args[]){
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.sum(10,20));
        System.out.println(methodOverloading.sum(2.0,5.0,6.0));
        System.out.println(methodOverloading.sum(4,8,9));
    }

}
