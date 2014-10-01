package du.grinnell.csc207.edgerton.layout;

/** Making a grid of specified dimensions and of a certain character
 * @author Ezra Edgerton
 * @version 0
 * 
**/

public class RightJustified
    implements TextBlock
{
  /**
   * creates the Rightjustified block, with given block and width
   */
  //fields
  int width;
  TextBlock tb;

  //
  public RightJustified(TextBlock tb, int width) throws Exception
  {
    if (width < tb.width())
      {
        throw new Exception("TextBlock width is greater than" + width);
      }
    this.width = width;

    this.tb = tb;
  }

  /**
   * returns the ith row, right justified
   */
  public String row(int i)
    throws Exception
  {

    int h = this.tb.height();
    // Sanity check
    if ((i < 0) || (i >= h))
      {
        throw new Exception("Invalid row " + i);
      } // if the row is invalid
    if (this.tb.width() > this.width)
      {
        throw new Exception("New TextBlock width is greater than " + width);
      }//if the width is invalid
    String result;
    String spaces = "";
    for (int j = 0; j < (this.width - this.tb.width()); j++)
      {
        spaces = spaces.concat(" ");
      }
    

    result = spaces.concat(this.tb.row(i));
    return result;
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return this.tb.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.width;
  } // width()
}//RightJustified
