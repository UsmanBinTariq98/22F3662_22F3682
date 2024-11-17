import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;






import org.junit.jupiter.api.BeforeEach;
import javax.swing.*;
import static org.junit.jupiter.api.Assertions.*;

class TestCases {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testNumberInput() {
        // Simulate clicking "7"
        calculator.sevenbutton.doClick();
        assertEquals("7", calculator.DisplayLabel.getText());

        // Simulate clicking "8"
        calculator.eightbutton.doClick();
        assertEquals("78", calculator.DisplayLabel.getText());

        // Simulate clicking "9"
        calculator.ninebutton.doClick();
        assertEquals("789", calculator.DisplayLabel.getText());
    }

    @Test
    void testAddition() {
        // Simulate entering "5 + 3 ="
        calculator.sevenbutton.doClick();
        calculator.plusbutton.doClick();
        calculator.threebutton.doClick();
        calculator.equelbutton.doClick();

        // Validate addition
        assertEquals("10", calculator.DisplayLabel.getText());
    }

    @Test
    void testSubtraction() {
        // Simulate entering "9 - 4 ="
        calculator.ninebutton.doClick();
        calculator.minbutton.doClick();
        calculator.fourbutton.doClick();
        calculator.equelbutton.doClick();

        // Validate subtraction
        assertEquals("5", calculator.DisplayLabel.getText());
    }

    @Test
    void testMultiplication() {
        // Simulate entering "6 x 7 ="
        calculator.sixbutton.doClick();
        calculator.mulbutton.doClick();
        calculator.sevenbutton.doClick();
        calculator.equelbutton.doClick();

        // Validate multiplication
        assertEquals("42", calculator.DisplayLabel.getText());
    }

    @Test
    void testDivision() {
        // Simulate entering "8 / 2 ="
        calculator.eightbutton.doClick();
        calculator.subbutton.doClick();
        calculator.twobutton.doClick();
        calculator.equelbutton.doClick();

        // Validate division
        assertEquals("4", calculator.DisplayLabel.getText());
    }

    @Test
    void testClearFunctionality() {
        // Simulate entering "123"
        calculator.onebutton.doClick();
        calculator.twobutton.doClick();
        calculator.threebutton.doClick();

        // Clear the input
        calculator.clearbutton.doClick();

        // Validate clearing
        assertEquals("", calculator.DisplayLabel.getText());
    }

    @Test
    void testDecimalInput() {
        // Simulate entering "5.5 + 2.3 ="
        calculator.fivebutton.doClick();
        calculator.dotbutton.doClick();
        calculator.fivebutton.doClick();
        calculator.plusbutton.doClick();
        calculator.twobutton.doClick();
        calculator.dotbutton.doClick();
        calculator.threebutton.doClick();
        calculator.equelbutton.doClick();

        // Validate result
        assertEquals("7.8", calculator.DisplayLabel.getText());
    }

    @Test
    void testDivisionByZero() {
        // Simulate entering "5 / 0 ="
        calculator.fivebutton.doClick();
        calculator.subbutton.doClick();
        calculator.zerobutton.doClick();
        calculator.equelbutton.doClick();

        // Validate result
        assertEquals("Infinity", calculator.DisplayLabel.getText());
    }
}
