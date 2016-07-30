public class Rectangle{

	private double length=1;
	private double width=1;
	private double perimeter=0;
	private double area=0;

	public void set_width(double rec_width)
	{
		if(rec_width>0.0 || rec_width<20.0)
			width=rec_width;
	}
	public double get_width()
	{
		return width;
	}
	public void set_length(double rec_length)
	{
		if(rec_length>0.0 || rec_length<20.0)
			length=rec_length;

	}
	public double get_length()
	{
		return length;
	}

	public void member()
	{

		perimeter= 2*(length+width);
		area=width*length;
	}
	public static void main(String [] args)
	{
		Rectangle var=new Rectangle();
		var.set_length(5.0);
		var.set_width(5.0);
		var.get_length();
		var.get_width();
		var.member();
		System.out.println(var.perimeter);
		System.out.println(var.area);

	}

}


