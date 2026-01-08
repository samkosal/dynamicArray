public class DynamicStringList implements StringList {
     
    private String[] strList;

    public DynamicStringList(){
        this.strList = new String[4];
    }

    @Override
    public String get(int index) {
        return strList[index];
    }

    @Override
    public void set(int index, String value){
        strList[index] = value;
    }
}
