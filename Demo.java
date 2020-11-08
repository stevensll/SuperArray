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
    
    // findOverlap() test
    

    }
}
