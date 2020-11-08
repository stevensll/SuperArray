public class Demo {
    public static void removeDuplicates(SuperArray s){  
        for (int i = s.size()-1;i>=0;i--){
            if (i != s.indexOf(s.get(i))){
            s.remove(i);
            }
        }
    }
    public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray overlap = new SuperArray();
        for (int i = 0; i < a.size(); i++){
            if (b.contains(a.get(i))) {
                overlap.add(a.get(i));
            }
        }
        removeDuplicates(overlap);
    return overlap;
    }
    public static void main(String[]args){
    
    /* removeDuplicates() test 
    SuperArray dupTest = new SuperArray(); // Test order
    dupTest.add("2");     dupTest.add("1");    dupTest.add("3");
    dupTest.add("1");     dupTest.add("2");    dupTest.add("3");
    System.out.println(dupTest.toString());     //[1,2,3,1,2,3]
    removeDuplicates(dupTest);                  
    System.out.println(dupTest.toString());    //[1,2,3] 
    SuperArray dupTest2 = new SuperArray(); 
    removeDuplicates(dupTest2);                 
    System.out.println(dupTest2.toString());    //[]
    dupTest2.add("1");
    removeDuplicates(dupTest2);                 
    System.out.println(dupTest2.toString());    /[1]
    */
    
    /* findOverlap() test
    SuperArray foTest1 = new SuperArray(); 
    foTest1.add("1");   foTest1.add("2");   foTest1.add("5");
    foTest1.add("4");   foTest1.add("6");   foTest1.add("3");
    SuperArray foTest2 = new SuperArray();
    foTest2.add("5");   foTest2.add("3");   foTest2.add("2");
    foTest2.add("3");   foTest2.add("9");   foTest2.add("110");
    System.out.println(findOverlap(foTest1, foTest2).toString()); 
    //[2,5,3]
    foTest1.clear();
    foTest2.clear();
    
    foTest1.add("3");   foTest1.add("6");   foTest1.add("5");
    foTest1.add("9");   foTest1.add("3");   foTest1.add("2");
   
    foTest2.add("1");   foTest2.add("2");   foTest2.add("3");
    foTest2.add("4");   foTest2.add("5");   foTest2.add("6");
    System.out.println(findOverlap(foTest1, foTest2).toString()); 
    //[3,6,5,2]  <- Note the difference, should be in order of the first SuperArray parameter
    System.out.println(findOverlap(foTest2, foTest1).toString());
    //[2,3,5,6]
    */
    
    // lastIndexOf() and equals() test
    SuperArray lTest = new SuperArray();
    lTest.add("foo");   lTest.add("dude");   lTest.add("foo");
    lTest.add("foo");   lTest.add("dude");   lTest.add("foo");
    lTest.add("foo");   lTest.add("dude");   lTest.add("foo");
    System.out.println(lTest.lastIndexOf("foo"));
    // 8
    System.out.println(lTest.lastIndexOf("dude"));
    // 7
    SuperArray lTest2 = new SuperArray();
    lTest2.add("foo");   lTest2.add("dude");   lTest2.add("foo");
    lTest2.add("foo");   lTest2.add("dude");   lTest2.add("foo");
    lTest2.add("foo");   lTest2.add("dude");   lTest2.add("foo");
    
    System.out.println(lTest.equals(lTest2));
    // true
    // Testing when this.size() > other.size()
    lTest2.remove(8);
    System.out.println(lTest.equals(lTest2));
    // false
    // Testing when this.size() < other.size()
    lTest.remove(8); lTest.remove(7);
    System.out.println(lTest.equals(lTest2));
    // false 
    // testing when this and other don't have same content.
    lTest.add("err");
    System.out.println(lTest.equals(lTest2));
    // false
    // testing when this and other have same content but different order.
    lTest.clear();
    lTest.add("dude");   lTest.add("foo");   lTest.add("foo");
    lTest.add("dude");   lTest.add("foo");   lTest.add("foo");
    lTest.add("dude");   lTest.add("foo");   
    System.out.println(lTest.equals(lTest2));
    //false
    System.out.println(lTest2.equals(lTest));
    //false
    }
}
