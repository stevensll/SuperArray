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
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Index " + index + " must be within bounds of SuperArray.");
        }
        return data[index];
    }
    public String set(int index, String element){
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Index " + index + " must be within bounds of SuperArray.");
        }
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
        if(initialCapacity < 0){
            throw new IllegalArgumentException("initialCapacity " + initialCapacity + " cannot be negative.");
        }
        data = new String[initialCapacity];
        size = 0;
        
    }
    public void add(int index, String element){
        // first check when adding to the last index if we go over capacity, we resize().
        if (index < 0 || index > size()){
            throw new IndexOutOfBoundsException("Index " + index  + " must be within bounds of SuperArray.");
        }
        if (size == data.length) resize();
        if (data[index] == null) data[index] = element;
        if (index == size) {
            data[index] = element;
            size++;
        }
        else {
            for (int i = size - 1; i >= index; i--){
                data[i+1] = data[i];
            }
            data[index] = element;
            size++;
        }
    }
    public String remove(int index){
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Index " + index  + " must be within bounds of SuperArray.");
        }
        String removedString = data[index];
        for (int i=index; i<size; i++) {
            data[i] = data[i+1];
        }
        size--;
        return removedString;
    }
    public int indexOf(String s){
        boolean found = false;
        int index = -1;
        for (int i = 0; i<size;i++){
            if(found == false && data[i].equals(s)){
                found = true;
                index = i;
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

    public int lastIndexOf(String value){
        int index = -1;
        for (int i = size-1; i >= 0; i--){
            if (index == -1 && data[i].equals(value)){
                index = i;
            }
        }
        return index;
    }
    public boolean equals(SuperArray other){
        boolean equals = true;
        if( this.size() == other.size()){
            for(int i = 0; i < this.size(); i++){
                if (! (this.get(i).equals(other.get(i)))){
                    equals = false;
                }
            }
        }
        else equals = false;
        return equals;
    }
}
