import java.util.ArrayList;

class Spa {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            list.add(i * 10);
        }

        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);

        System.out.println(list);
    }
}