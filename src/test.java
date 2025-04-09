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

    @Test
        public void removeShiftsElementsLeft() {
        // Arrange
            DynamicStringList list = new DynamicStringList();
            list.set(0, "A");
            list.set(1, "B");
            list.set(2, "C");

            int originalSize = list.size();

        // Act
            String removed = list.remove(0);

        // Assert
            assertEquals("A", removed); // removed index 0, "A"
            assertEquals("B", list.get(0)); // B shifted to index 0
            assertEquals("C", list.get(1)); // C shifted to index 1
            assertEquals(originalSize - 1, list.size()); // expected res: originalSize is decreased by 1

    }//end removeShiftsElementsLeft



}//end test