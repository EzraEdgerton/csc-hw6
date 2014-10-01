package du.grinnell.csc207.edgerton.layout;

/** Represents a block with a centered text from the given width
 * @author Ezra Edgerton
 * @version 0
 * 
**/
public class CenteredBlock
    implements TextBlock
{
  /**
   * Creates a CenteredBlock from a given block and width
   */
  //fields
  int width;
  TextBlock block;

  //constructors
  public CenteredBlock(TextBlock block, int width) throws Exception
  {
    if (width < block.width())
      {
        throw new Exception("TextBlock width is greater than" + width);
      }
    this.width = width;
    this.block = block;
  }

  /**
   * Returns the ith row
   */
  public String row(int i)
    throws Exception
  {

    int h = this.block.height();
    // Sanity check
    if ((i < 0) || (i >= h))
      {
        throw new Exception("Invalid row " + i);
      } // if the row is invalid
    if (this.block.width() > this.width)
      {
        throw new Exception("New TextBlock width is greater than " + width);
      }//if the width is invalid
    String result;
    String spaces = "";
    for (int j = 0; j < (this.width - this.block.width()) / 2; j++)
      {
        spaces = spaces.concat(" ");
      }

    result = spaces.concat(this.block.row(i).concat(spaces));
    return result;
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return this.block.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.width;
  } // width()
} //CenteredBlock

