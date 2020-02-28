
public class EncapsulationExample3 {
	
private int side;
private int area;

public void setSide(int side) {
	if (side < 10 || side > 100) 
 	{
        throw new IllegalArgumentException();
    }
this.side = side;
}

public int getSide() 
{
	area = side*side;
	return area;
}
}

	 

