package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maicon");
        list.add("Douglas");
        list.add("Filipiaki");
        list.add("Maicon");
        list.add(2, "SEGUNDO");
        System.out.println(list.size());
        // list.remove(2);
        for (String i : list) {
            System.out.println(i);
        }
        list.removeIf(x -> x.charAt(0) == 'M');
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
        String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
        System.out.println(list);
        System.out.println(result);
        System.out.println(name);
    }

}
