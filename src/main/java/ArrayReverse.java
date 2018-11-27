import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        String[] faveSongs = new String[5];
        faveSongs[0] = "Jumpsuit";
        faveSongs[1] = "Nico and the Niners";
        faveSongs[2] = "Smithereens";
        faveSongs[3] = "My Blood";
        faveSongs[4] = "Pet Cheetah";

        for(int i = 0; i < faveSongs.length / 2; i++) {
            String newList = faveSongs[i];
            faveSongs[i] = faveSongs[faveSongs.length - 1 -i];
            faveSongs[faveSongs.length -1 -i] = newList;
        }
        System.out.println(Arrays.toString(faveSongs));
    }
}
