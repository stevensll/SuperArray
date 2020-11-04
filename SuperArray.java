public class SuperArray{
    private String[] data;
    private int size;

    public SuperArray(){
        data = new String[10];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean add(String element){
        if (size == data.length){
            resize();
        }
        data[size] = element; 
        size++;
        return true;
    }
    public String get(int index){
        return data[index];
    }
    public String set(int index, String element){
        String replaced = data[index];
        data[index] = element;
        return replaced;
    }
    public void resize(){
        String [] newArr = new String [(size + 1) * 2];
        for (int i = 0; i < data.length;i++){
            newArr[i] = data[i];
        }
        data = newArr;
    }
    public boolean isEmpty(){
        return(size==0);
    }
    public void clear(){
        for (int i= 0; i < size; i++){
            data[i] = null;
        }
        size = 0;
    }
    public String toString(){
        String array = "[";
        if (size == 0) array = "[]";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) array += String.valueOf(data[i]) + "]";
            else array += String.valueOf(data[i]) + ", ";
        }
        return array;
    }
    public boolean contains(String s){
        boolean has = false;
        for (int i =0; i < size; i++){
            if (data[i].equals(s)) has = true;
        }
        return has;
    }
    public SuperArray(int initialCapacity){
        data = new String[initialCapacity];
        size = 0;
    }
    public void add(int index, String element){
        size++;
        // first check when adding to the last index if we go over capacity, we resize().
        if (size > data.length) resize();
        String temp [] = new String[size];
        //temp[] is an array that copies the current values from index to size-1 in data.
        for (int i = index; i<size;i++){
            temp[i] = data[i]; 
        }
        //copy all values from temp[] back to data, but shift it by 1.
        for (int i = index + 1; i<size;i++){
            data[i] = temp[i-1];
        }                                                                                                                                                                                       
        data[index] = element;
    }
    public String remove(int index){
        String removedString = data[index];

        return removedString;
    }
    public int indexOf(String s){
        boolean found = false;
        int index = -1;
        if (found == false){
            for (int i = 0; i < size; i++){
                if (data[i].equals(s)){
                    found = true;
                    index = i;
                }
            }
        }
        return index;
    }
    public String[] toArray(){
        String newArr [] = new String[size];
        for (int i = 0; i < size; i++){
            newArr[i] = data[i];
        }
        return newArr;
    }      
  
}