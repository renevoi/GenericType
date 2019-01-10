import java.util.*;

public class Main {

    public static void main(String[] args){
        List<String> name = new ArrayList<>();
        name.add("Rene");
        name.add("Ailia");
        name.add("Grace");

        List<String> pets = Arrays.asList("Dog", "Cat", "Chicken", "Bird");

        Set<String> friends = new HashSet<>();
        friends.add("Danny");
        friends.add("Johnny");
        friends.add("Sammy");

        Map<Integer, String> cars = new HashMap<>();
        cars.put(1, "Toyota");
        cars.put(2, "Honda");
        cars.put(3, "Toyota");


        name.stream()
                .filter(names -> names.equalsIgnoreCase("rene") || names.startsWith("A"))
                .forEach(System.out::println);

        pets.forEach(pet -> System.out.printf("%s\n", pet));

        friends.forEach(System.out::println);

        for (String car:
             cars.values()) {
            System.out.println(car);
        }

        for (Integer car:
             cars.keySet()) {
            System.out.println(cars.get(car));
        }

        for (Map.Entry<Integer, String> car:
             cars.entrySet()) {
            System.out.println(car.getKey() + " " + car.getValue());
        }
 
    }

}
