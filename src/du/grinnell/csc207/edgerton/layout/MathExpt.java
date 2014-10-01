package du.grinnell.csc207.edgerton.layout;

import java.io.PrintWriter;

/**
 * A few simple experiments with our utilities.
 */
public class MathExpt
{
  public static void main(String[] args)
    throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    TextLine tb1 = new TextLine("Hello");
    TextLine tb2 = new TextLine("World");
    TextBlock compound =
        new BoxedBlock(
                       new CenteredBlock(
                                         new BoxedBlock(
                                                        new CenteredBlock(
                                                                          new VComposition(
                                                                                           tb1,
                                                                                           tb2),
                                                                          7)),
                                         15));
    pen.println("ORIGINAL");
    TBUtils.print(pen, compound);
    tb2.setContents("Someone");
    pen.println("UPDATED");
    TBUtils.print(pen, compound);
    tb1.setContents("Nice to meet you,");
    pen.println("RE-UPDATED");
    TBUtils.print(pen, compound);
    pen.close();

    /* TextBlock top = new CenteredBlock(new TextLine("Hello"), 11);
     TextBlock bottom = new CenteredBlock(new TextLine("Goodbye"), 3);
     TextBlock block = new BoxedBlock(new VComposition(top,bottom));
     TBUtils.print(pen, block);*/
  } // main(String[])
} // class MathExpt
