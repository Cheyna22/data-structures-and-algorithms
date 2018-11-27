import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
//        Create Array
        String[] faveSongs = new String[5];
        faveSongs[0] = "Jumpsuit";
        faveSongs[1] = "Nico and the Niners";
        faveSongs[2] = "Smithereens";
        faveSongs[3] = "My Blood";
        faveSongs[4] = "Pet Cheetah";
//         Loop through the indexes in the array
        for(int i = 0; i < faveSongs.length / 2; i++) {
            String newList = faveSongs[i];
//            Swap out each index for the last one
            faveSongs[i] = faveSongs[faveSongs.length - 1 -i];
            faveSongs[faveSongs.length -1 -i] = newList;
        }
//        converting to string - print results
        System.out.println(Arrays.toString(faveSongs));
    }
}
