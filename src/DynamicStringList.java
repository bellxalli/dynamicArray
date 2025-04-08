public class DynamicStringList implements StringList {
//field(s)
    private String[] stringArray;
    private int size;

//constructor
    public DynamicStringList()
    {
        stringArray = new String[10];
        size = 10;
    }

//methods
    public String get(int index) 
    {   //find value at given index
        return stringArray[index];
    }

    public void set(int index, String value) 
    {   //set given new value at given index       
        stringArray[index] = value;
    }

    public void add(String value) 
    {   //add new string at end of list
        stringArray[stringArray.length-1] = value;        
    }

    public String remove(int index) 
    {   //remove value at given index and return removed vlaue
        String removed = stringArray[index];
        
        for(int i = index + 1; i < stringArray.length-1; i++)
        {
            stringArray[i-1] = stringArray[i];
        }

        size--;
        
        return removed;
    }

    public int size() {
        //return size
        return size;
    }

    public int capacity() {
        //return how many elements can be held in list
        return stringArray.length;
    }
}
