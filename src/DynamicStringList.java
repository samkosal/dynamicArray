public class DynamicStringList implements StringList {
     
    private String[] strList;
    private int arrLength;

    public DynamicStringList(){
        this.strList = new String[4];
        this.arrLength = 4;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index > strList.length - 1){
            throw new IndexOutOfBoundsException("Your index is does not exist in the list.");
        }
        return strList[index];
    }

    @Override
    public void set(int index, String value){
        if (index < 0 || index > strList.length - 1){
            throw new IndexOutOfBoundsException("Your index is does not exist in the list.");
        }
        strList[index] = value;
    }

    @Override
    public void add(String value){
        //if arrLength == strList.length, then we need to extend it.
        if (arrLength == strList.length){
            String[] newList = new String[strList.length + 4];
            for (int i = 0; i < strList.length; i++){
                newList[i] = strList[i];
            }
            //now that we've transferred all of the same contents to newList,
            //we can overwrite strList with newList, increasing the size by 4.
            strList = newList;
        }
        arrLength++;
        strList[arrLength] = value;
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
        return arrLength;
    }

    /**
    * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
    *
    * @return the capacity of the list.
    */
    public int capacity(){
        //gotta return the whole size of the array, including the unassigned ones
        return strList.length;
    }

}


