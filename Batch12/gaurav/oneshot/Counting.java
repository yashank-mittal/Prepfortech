package oneshot;

import java.util.ArrayList;
import java.util.List;

public class Counting {
    public static void main(String[] args) {
        printCountingDsc(5);
        printCountingAsc(5);
      
        System.out.println();

        List<Integer> integersAsc = countingAscWithList(5, new ArrayList<>());
        List<Integer> integersDsc = countingDscWithList(5, new ArrayList<>());
        List<Integer> integers1 = countingAscWithListNoParameter(5);
        List<Integer> integers2 = countingDscWithListNoParameter(5);

        System.out.println("integers Asc = " + integersAsc);
        System.out.println("integers Dsc = " + integersDsc);
        System.out.println("no parameter integers asc = " + integers1);
        System.out.println("no parameter integers dsc = " + integers2);
    }

    private static List<Integer> countingDscWithListNoParameter(int n) {
        if(n <= 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();

        List<Integer> recursiveList = countingAscWithListNoParameter(n - 1);
        list.add(n);
        list.addAll(recursiveList);
        return list;
    }

    private static List<Integer> countingAscWithListNoParameter(int n) {
        if(n <= 0) {
            return new ArrayList<>();
        }
        ;
        List<Integer> integers = countingAscWithListNoParameter(n - 1);
        integers.add(n);
        return new ArrayList<>(integers);
    }

    private static List<Integer> countingDscWithList(int n, ArrayList<Integer> integers) {
        if(n <= 0) {
            return integers;
        }
        integers.add(n);
        return countingDscWithList(n - 1, integers);
    }

    private static List<Integer> countingAscWithList(int n, ArrayList<Integer> list) {
        if( n <= 0) {
            return list;
        }

        countingAscWithList(n-1, list);
        list.add(n);
        return list;
    }

    private static void printCountingAsc(int n) {
        if( n <= 0 ) {
            System.out.println();
            return;
        };

        printCountingAsc( n-1 );
        System.out.print( n + " " );
    }

    private static void printCountingDsc(int n) {
        if( n <= 0 ) {
            System.out.println();
            return;
        };

        System.out.print( n + " ");
        printCountingDsc( n-1 );
    }
}
