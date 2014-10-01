package du.grinnell.csc207.edgerton.layout;

/** Represents two copies of the same block side by side
 * @author Ezra Edgerton
 * @version 0
 * 
**/
public class BlockPair
    implements TextBlock
{
  /**
   * Create a new doubled block from the given block
   */
  //fields
  TextBlock doubler;

  //constructor
  public BlockPair(TextBlock doubled)
  {
    this.doubler = doubled;
  }

  /**
   * get the ith row of the block
   */
  public String row(int i)
    throws Exception
  {

    int h = this.doubler.height();
    // Sanity check
    if ((i < 0) || (i >= h))
      {
        throw new Exception("Invalid row " + i);
      } // if the row is invalid
    String result;
    result = this.doubler.row(i);
    result = result.concat(result);
    return result;
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return this.doubler.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.doubler.width();
  } // width()
}//BlockPair(TextBlock doubled)
