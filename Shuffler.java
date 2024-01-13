
public class Shuffler {

 private static final int SHUFFLE_COUNT = 1;    
 private static int valueCount = 4;      


 public static void main(String[] args) {
  System.out.println("Results of " + SHUFFLE_COUNT + "  perfect shuffle:");
  int[] valuesV1 = new int[valueCount];
  for (int i = 0; i < valuesV1.length; i++) {
   valuesV1[i] = i;
   }
  for (int j = 1; j <= SHUFFLE_COUNT; j++) {
   perfectShuffle(valuesV1);
   System.out.print("  " + j + ":");
   for (int k = 0; k < valuesV1.length; k++) {
    System.out.print(" " + valuesV1[k]);
   }
   System.out.println();
  }
  System.out.println();

  System.out.println("Results of " + SHUFFLE_COUNT + " efficient selection shuffles:");
  int[] values2 = new int[valueCount];
  for (int i = 0; i < values2.length; i++) { values2[i] = i;
   }
  for (int j = 1; j <= SHUFFLE_COUNT; j++) {
   selectionShuffle(values2);
   System.out.print("  " + j + ":");
   for (int k = 0; k < values2.length; k++) {
    System.out.print(" " + values2[k]);
   }
   System.out.println();
  }
 }


 //Apply a "perfect shuffle" to the argument.
 public static void perfectShuffle(int[] values) {
  int[] temporary = new int[values.length];
  int midofval = (values.length + 1) / 2;

  int unshuffledPosition = 0;
  for ( int i = 0; i < midofval; i++) {
   temporary[unshuffledPosition] = values[i];
   unshuffledPosition += 2;
  }
  unshuffledPosition = 1;
  for ( int n=0; n < values.length; n++) {
   temporary[unshuffledPosition] = values[n];
   unshuffledPosition += 2;
  }

  for (int j = 0; j < values.length; j++) {
   values[j] = temporary[j];
  }
 }

 /**
  * Apply an "efficient selection shuffle" to the argument.
  * The selection shuffle algorithm conceptually maintains two sequences
  * of cards: the selected cards (initially empty) and the not-yet-selected
  * cards (initially the entire deck). It repeatedly does the following until
  * all cards have been selected: randomly remove a card from those not yet
  * selected and add it to the selected cards.
  * An efficient version of this algorithm makes use of arrays to avoid
  * searching for an as-yet-unselected card.
  * @param values is an array of integers simulating cards to be shuffled.
  */
 public static void selectionShuffle(int[] values) {
  for (int n = values.length ; n> 0; n--) {
   int position = (int) (Math.random() * (n + 1));  
   int temporary = values[position];
   values[position] = values[n];
   values[n] = temporary;
  }
 }
}