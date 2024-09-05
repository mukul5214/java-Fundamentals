package Oops.Inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box(){
        this.length= 1;
        this.height= 1;
        this.width =1;
    }
    //for cube
    Box(int a){
        this.length=a;
        this.height = a;
        this.width = a;
    }

    // for arguments
    Box(double l,double h, double w){
        this.length= l;
        this.height= h;
        this.width = w;
    }
}
