import java.util.*;
public class Box
{
	double heigth,width,depth;
	Box(double heigth,double width,double depth)
	{
		this.heigth=heigth;
		this.width=width;
		this.depth=depth;
	}
	double volume()
	{
		return heigth*width*depth;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double h,w,d;
		h=sc.nextDouble();
		w=sc.nextDouble();
		d=sc.nextDouble();
		Box b=new Box(h,w,d);
		System.out.println("volume is : "+b.volume());
	}

}
