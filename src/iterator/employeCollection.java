package iterator;

import java.util.*;
import java.util.stream.Collectors;

public class employeCollection {
    public static void main(String[] args) {
        Collection<String>	collection	=	new	ArrayList<>();
        collection.add("New	York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        Iterator<String> iterator =	collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase()	+	"	");
        }
        List<employeee>	linkedList	=	new LinkedList<>();

        linkedList.add(new employeee(1, "Name"));
        linkedList.add(new employeee(2, "Duc"));
        linkedList.add(new employeee(3, "Dallas"));
        linkedList.add(new employeee(4, "Madison"));
        ListIterator<employeee> listIterator =	linkedList.listIterator();

        String name = "Duc";
        boolean isExist = linkedList.stream().anyMatch(e -> name.equals(e.getName()));

        System.out.println("Exist employee with name " + name + ": " + isExist);

        List<employeee> newEmployees = linkedList.stream().filter(e -> name.equals(e.getName())).collect(Collectors.toList());
        System.out.println(newEmployees);

//        while(listIterator.hasNext()) {
//            System.out.print(listIterator.next().getName()	+	"	");
//        }
    }

}
