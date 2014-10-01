package du.grinnell.csc207.edgerton.layout;

/** Making a grid of specified dimensions and of a certain character
 * @author Ezra Edgerton
 * @version 0
 * 
**/
public class Grid
    implements TextBlock
{
  //fields
  String builder;
  int height;
  int width;

  //constructors
  public Grid(int width, int height, char ch) throws Exception
  {
    if (width < 0 || height < 0)
      {
        throw new Exception("invalid value for height or width");
      }
    this.height = height;
    this.width = width;
    this.builder = Character.toString(ch);

  }

  //methods
  /**
   * Returns a string of the characters that is the size of width
   */

  //this code based off of VComposition written by Sam Rebelsky

  public String row(int i)
    throws Exception
  {

    int h = this.height();
    // Sanity check
    if ((i < 0) || (i >= h))
      {
        throw new Exception("Invalid row " + i);
      } // if the row is invalid

    String result;
    result = "";
    //loop to make one line
    for (int k = 0; k < this.width; k++)
      {
        result = result.concat(this.builder);
      }

    return result;
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return this.height;
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.width;
  } // width()

}//Grid(int width, int height, char ch)
