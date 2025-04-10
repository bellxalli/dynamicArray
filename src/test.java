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

    @Test
        public void setAndGetUpdatesCorrectly() {
        // Arrange
            DynamicStringList list = new DynamicStringList();
            int middleOfList = list.capacity() / 2; //finds the middle of the list
            String updatedValue = "listIsUpdated";

        // Act
            list.set(middleOfList, updatedValue); //sets the middle index of the list to updatedValue

        // Assert
            assertEquals(updatedValue, list.get(middleOfList)); //expected res: listIsUpdated (updatedValue)

    } //end setAndGetUpdatesCorrectly

    @Test
    public void sizeReturnsCorrectValue() {
        // Arrange
            DynamicStringList list = new DynamicStringList(); // size is 10
            int expectedSize = 10;

        // Act
            int actualSize = list.size();

        // Assert
            assertEquals(expectedSize, actualSize); // expected res: 10

    } //end sizeReturnsCorrectValue

}//end test