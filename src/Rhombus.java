
    import java.util.Scanner;

// принтиране на ромб със *


    public class Rhombus {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);

            int size = Integer.parseInt(scanner.nextLine());

            for (int i= 1; i <size;i++) {
                printRow(size,i);

            }
            for (int i =size- 1; i >= 0;i-- ){
                printRow(size,i);


            }
        }

        private  static  void printRow(int size,int currentRow) {
            printLoadingSpaces(currentRow,size);
            printStarts (currentRow);
            System.out.println();

        }
        private  static  void  printStarts (int startCount) {
            for ( int i=0; i< startCount; i++) {
                System.out.print( "* ");
            }
        }

        private  static  void printLoadingSpaces (int row,int size) {
            int spacesCount = Math.abs (size - row);

            for ( int  i =0; i <spacesCount; i++) {
                System.out.print(' ');
            }

        }
    }



