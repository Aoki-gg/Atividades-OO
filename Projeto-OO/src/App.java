import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] Args) {
        // Instanciação e inicialização do objeto

        String[] array = new String[3];
        ArrayList<Character> arrayList = new ArrayList<>();

        array[0] = "A";
        System.out.println(Arrays.toString(array));
        
        System.out.println(arrayList);
        
        arrayList.add('A');
        System.out.println(arrayList);
        
        arrayList.add('B');
        System.out.println(arrayList);

        arrayList.add('C');
        System.out.println(arrayList);

        char elemento = arrayList.get(0);
        System.out.println(elemento);
        
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
