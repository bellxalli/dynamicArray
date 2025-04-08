public class DynamicStringList implements StringList {
    
    private String[] stringArray;

    public DynamicStringList()
    {
        stringArray = new String[10];
    }


    public String get(int index) 
    {
        //find value at given index
        return stringArray[index];
    }

    public void set(int index, String value) 
    {
        //set given new value at given index

        
        
    }

    public void add(String value) {
        // TODO Auto-generated method stub
        
    }

    public String remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int capacity() {
        // TODO Auto-generated method stub
        return 0;
    }
}
