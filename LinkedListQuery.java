import java.io.*;
import java.util.*;

public class LinkedListQuery {

    public static void main(String[] args) {

        int N, Q, x, y;
        String Query;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        LinkedList<Integer> L = new LinkedList<>();

        for ( int i = 0; i < N; i++ ) {
            L.add(input.nextInt());
        }

        Q = input.nextInt();

        for ( int i = 0; i < Q; i++ ) {
            Query = input.next();

            if ( Query.equals("Insert") ) {
                x = input.nextInt();
                y = input.nextInt();
                L.add(x, y);
            } else {
                x = input.nextInt();
                L.remove(x);
            }
        }
        for (Integer num : L) {
            System.out.print(num + " ");
        }
    }
}
