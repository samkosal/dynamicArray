public class DynamicStringList implements StringList {
     
    private String[] strList;
    private int arrLength;

    public DynamicStringList(){
        this.strList = new String[4];
        this.arrLength = 4;
    }

    public int getLength(){
        return arrLength;
    }

    @Override
    public String get(int index) {
        return strList[index];
    }

    @Override
    public void set(int index, String value){
        strList[index] = value;
    }

    @Override
    public void add(String value){
        int length = strList.length - 1;
        strList[length] = value;
    }
    
    /**
    * Removes the string at the specified index from the list.
    *
    * @param index the index of the string to remove.
    * @return the string that was removed.
    * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
    */
    @Override
    public String remove(int index){
        String removed = strList[index];

        if(index < strList.length || index > strList.length){
            throw new IndexOutOfBoundsException(index + "is out of position");
        }

        for (int i = index; i < strList.length - 1; i++) {
            strList[i] = strList[i + 1];
        }
        this.arrLength--;

        return removed;
    }

    /**
    * Returns the number of strings currently in the list.
    *
    * @return the size of the list.
    */
    @Override
    public int size(){
        return this.strList.length;
    }

    /**
    * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
    *
    * @return the capacity of the list.
    */
    public int capacity(){
        return this.arrLength;
    }

}
