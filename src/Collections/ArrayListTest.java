package Collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println("Collection || ArrayList");

        List<Integer> arrL = new ArrayList<Integer>(5);
        for (int i = 0; i<5; i++){
            arrL.add(i+1);
        }

        System.out.println(arrL);
        arrL.remove(3);

        for (int i =0; i< arrL.size(); i++){
            System.out.print(arrL.get(i) + " ");
        }
    }
}
