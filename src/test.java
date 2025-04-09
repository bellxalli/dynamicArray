import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {
    
    @Test
        public void addPlacesValueAtEnd() {
        // Arrange
            DynamicStringList list = new DynamicStringList();
            int last = list.capacity() - 1;
            list.set(last, "old"); // should fill last element
            String addingNew = "new";
    
        // Act
            list.add(addingNew);
    
        // Assert
            assertEquals(addingNew, list.get(last)); //expected res: new (addingNew)

    }//end addPlacesValueAtEnd

}//end test