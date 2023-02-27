import java.util.Scanner;
public class FindArea
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    int choice = 0;
    do
    {
        System.out.println ("Select your choice !!");
        System.out.println ("1. Rectangle ");
        System.out.println ("2. Square ");
        System.out.println ("3. Exit ");

        choice = scan.nextInt ();
    
    
        switch (choice)
        {
            case 1:
	        {
                Rectangle rectangle_object = new Rectangle ();
                System.out.print ("Enter the width and height of the Rectangle with space :");
                int width = scan.nextInt ();
                int height = scan.nextInt ();
                rectangle_object.setWidth (width);
                rectangle_object.setHeight (height);
                System.out.println ("Area of the Rectangle : " + rectangle_object.getArea ()+"\n");
                break;
	        }
	 
	        case 2:
	        {
        	     System.out.print ("Enter the side of the Square :");
        	     int side = scan.nextInt ();
        	     Square square_object = new Square ();
        	     square_object.setSide (side);
        	     System.out.println ("Area of the Square : " + square_object.getArea ()+"\n");
        	     break;
	        }
        }
        
    }while(choice != 3);

  }
}


class Rectangle
{
  int m_width;
  int m_height;

  public void setWidth (int width)
  {
    m_width = width;
  }

  public void setHeight (int h)
  {
    m_height = h;
  }

  public int getWidth ()
  {
    return m_width;
  }

  public int getHeight ()
  {
    return m_height;
  }

  public int getArea ()
  {
    return m_width * m_height;
  }

}

class Square extends Rectangle
{
  public void setWidth (int side)
  {
    setSide (side);
  }

  public void setHeight (int side)
  {
    setSide (side);
  }
  public void setSide (int side)
  {
    m_height = side;
    m_width = side;
  }
}

