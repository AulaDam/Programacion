package R1_HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Set<String> names = new HashSet<>();
        
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        names.add("Tuco");
        names.add("Tuco");
        System.out.println(names);
        
        names.remove("Tuco");
        
        System.out.println(names);
        System.out.println(names.size());
        
        for (String name : names) {
            System.out.println(name);
        }
        
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(1);
        numberList.add(2);
        numberList.add(1);
        numberList.add(2);
        System.out.println(numberList);
        
        Set<Integer> numberSet = new HashSet<>(numberList);
        //numberSet.addAll(numberList);
        System.out.println(numberSet);
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
    
        
        
    }
    
}
