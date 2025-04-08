public class DynamicStringList implements StringList {
//field(s)
    private String[] stringArray;

//constructor
    public DynamicStringList()
    {
        stringArray = new String[10];
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

        for(int i = 0; i < stringArray.length-1; i++;)
        {
            
        }
        
        String removed = stringArray[index];

        return removed;
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
