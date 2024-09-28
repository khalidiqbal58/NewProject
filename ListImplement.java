import com.sun.jdi.Value;

import java.util.*;

public class ListImplement {
    public static void main(String[] args) {
        //ArrayList
        //List can store duplicate values
        System.out.println("-------ArrayList-------");
        ArrayList<Object> print = new ArrayList<>();
        for (int i = 0; i <= 5; i++){
        print.add(i);

        }
        System.out.println(print);
        print.remove(5);
        System.out.println("5th index value will be removed :"+print);

//        print.add(23);
//        print.add("my name is");
//        print.add(345.56f);
//        print.add("Java collection");
//        print.add("my name is");
//        System.out.println(print);

//        //iterator is technical term of loop which is used to print one by one value of list
//        Iterator<Object> itr = print.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        //Hashmap
        System.out.println("-------HashMap-------");
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101,"khalid"); //it can store value like (String , String)
        hm.put(102,"Khalid Iqbal"); //it can also store values (Integer , String)
        hm.put(1033,"vale");
        hm.put(104,"Key");
        for (Object i : hm.keySet()){
            System.out.println("key : " + i + " value is " + hm.get(i));
        }

        //we can access hashmap value on the base of index , one object is key (Index) to another object(value)
        //stack
        System.out.println("-------Stack-------");

        Stack<String> s = new Stack<>();
        s.push("khalid");
        s.push("khalid");
        s.push("khalid iqbal");
        s.push("PPL Courier");
        System.out.println(s);
        System.out.println(s.peek());
        //HasSet
        //set does not allow to store duplicate value
        System.out.println("-------HashSet-------");
        Set<Object> s1 = new HashSet<>();
        s1.add(9);
        s1.add(200);
        s1.add("khalid");
        s1.add("jj");
        for (Object o : s1){
            System.out.println(o);
        }
        System.out.println(s1.contains("jj"));
        System.out.println(s1.size());
        HashSet <Integer>hash = new HashSet<Integer>();
        hash.add(9);
        hash.add(8);
        hash.add(7);
        hash.add(6);
        hash.add(5);
        for (int i = 0; i<=10; i++){
            if (hash.contains(i)){
                System.out.println(i+" " +"your value is here");
            }
            else {
                System.out.println(i+ " " +  "you item is not here");
            }
        }
        System.out.println("-------linkedList--------");
        LinkedList<String> list = new LinkedList<>();
        list.add("khalid");
        list.add("khalid iqbal");
        list.add("PPl");
        System.out.println(list);
        list.addFirst("logistics");
        System.out.println(list);


    }

}
