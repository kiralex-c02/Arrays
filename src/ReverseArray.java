import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] names = new String[] {"Alex 1", "Alex 2", "Kevin", "Mario"};
        System.out.println(Arrays.toString(names));
        System.out.println("Reversed names: " + Arrays.toString(reverseArray(names)));
    }

    public static String[] reverseArray(String[] array){
        String help = "";
        int j = 0;
        for(int i = array.length - 1; i >= array.length/2 ; i--){
            help = array[i];
            array[i] = array[j];
            array[j] = help;
            j += 1;
        }

        return array;
    }
}
