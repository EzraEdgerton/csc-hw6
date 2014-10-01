package du.grinnell.csc207.edgerton.layout;

public class TruncatedBlock
    implements TextBlock
{
  /**
   * Create a new truncated block of the specified width.
   */
  //fields
  int width;
  TextBlock tb;

  public TruncatedBlock(TextBlock tb, int width) throws Exception
  {
    if (width < 0)
      {
        throw new Exception("truncated width cannot be less than 0");
      }
    this.tb = tb;
    this.width = width;

  } // TruncatedBlock(TextBlock, int)

  /**
   * Get the ith row of the block.
   */
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
    result = this.tb.row(i).substring(0, width);
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
} // class TruncatedBlock