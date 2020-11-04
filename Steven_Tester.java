import java.util.Arrays;
public class Steven_Tester {
    public static void main(String[] args) {
        /* 
        SuperArray words = new SuperArray();
        System.out.println(words.get(0));
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        for (int i = 0;i<50;i++ ){
            words.add(String.valueOf(i));
        }
        */
        /*
        for (int i = 0;i<50;i++ ){
            System.out.println(words.get(i)); // i should be at 46 since 50 - 3 = 47. 47 is 0-46.
        }
        System.out.println(words.size());
        for (int i = 3;i<words.size();i++ ){
            words.set(i, "resized" + String.valueOf(i));
            System.out.println(words.get(i)); // i should be at 46 since 50 - 3 = 47. 47 is 0-46.
        }
        */
        /*
        System.out.println(words.toString());
        System.out.println(words.contains("kani"));
        words.clear();
        System.out.println(words.contains("kani"));
        System.out.println(words.toString());
        */
        SuperArray test2 = new SuperArray(0);
        System.out.println(test2.toString());
        test2.add("cat");
        System.out.println(test2.toString());
        /*
        SuperArray test2 = new SuperArray(4);
        test2.add("cat");
        test2.add("meow");
        test2.add("dog");
        test2.add("woof");
        System.out.println(test2.size());
        test2.add(2,"stuff");
        System.out.println(test2.toString());
        System.out.println(test2.size());
        System.out.println(test2.indexOf("3"));
        System.out.println(Arrays.toString(test2.toArray()));
        */
    }
}
