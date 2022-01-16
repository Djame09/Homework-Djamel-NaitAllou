package map;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class map2 {
    public static void main(String[] args) {

        List<Integer> lNumbers = new LinkedList<>();
       lNumbers.add(123000);
        lNumbers.add(31415);
        lNumbers.add(299988);
        lNumbers.add(67000);

        List<Integer> ID=new LinkedList<>();
        ID.add(1001);
        ID.add(1002);
        ID.add(1003);
        ID.add(1004);

        List<Integer> Area= new LinkedList<>();
        Area.add(450);
        Area.add(789);
        Area.add(457);
        Area.add(632);

        Map<String, List<Integer>> map=new LinkedHashMap<>();
        map.put("aptPrice", lNumbers);
        map.put("clientId", ID);
        map.put("aptArea", Area);

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }


    }
}
