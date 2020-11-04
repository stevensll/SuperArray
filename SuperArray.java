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
        String [] newArr = new String [size * 2];
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
        String old = data[index];
        data[index] = element;
        for (int i = index + 1; i<size;i++){
            data[i] = data[i-1];
        }
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
        

}