class Pear
{
  //instance variables
  private String type;
  private double size;
  private boolean isTart;

  //constructors
  public Pear()
  {
    type = null;
    size = 0;
    isTart = true;
  }
  //toString
  public String toString()
  {
    String output = "Type: " + type + 
                    "\nSize(inches diameter): " + size + "\nIs it tart? " + isTart;
    return output;
  }



}