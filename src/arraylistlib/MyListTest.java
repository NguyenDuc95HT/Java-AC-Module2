package arraylistlib;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        for (int i = 0; i < 15; i++) {
            myList.add(i);
        }
        myList.add(6,555);
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println(myList.get(i));
        }
        myList.remove(6);
        System.out.println(myList.get(6));
    }
}
