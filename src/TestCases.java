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
        calculator.sevenbutton.doClick();
        assertEquals("7", calculator.DisplayLabel.getText());

        calculator.eightbutton.doClick();
        assertEquals("78", calculator.DisplayLabel.getText());

        calculator.ninebutton.doClick();
        assertEquals("789", calculator.DisplayLabel.getText());
    }

    @Test
    void testAddition() {
        calculator.sevenbutton.doClick();
        calculator.plusbutton.doClick();
        calculator.threebutton.doClick();
        calculator.equelbutton.doClick();

        // Validate addition
        assertEquals("10", calculator.DisplayLabel.getText());
    }

    @Test
    void testSubtraction() {
        calculator.ninebutton.doClick();
        calculator.minbutton.doClick();
        calculator.fourbutton.doClick();
        calculator.equelbutton.doClick();

        // Validate subtraction
        assertEquals("5", calculator.DisplayLabel.getText());
    }

    @Test
    void testMultiplication() {
        calculator.sixbutton.doClick();
        calculator.mulbutton.doClick();
        calculator.sevenbutton.doClick();
        calculator.equelbutton.doClick();

        // Validate multiplication
        assertEquals("42", calculator.DisplayLabel.getText());
    }

    @Test
    void testDivision() {
        calculator.eightbutton.doClick();
        calculator.subbutton.doClick();
        calculator.twobutton.doClick();
        calculator.equelbutton.doClick();

        // Validate division
        assertEquals("4", calculator.DisplayLabel.getText());
    }

    @Test
    void testClearFunctionality() {
        calculator.onebutton.doClick();
        calculator.twobutton.doClick();
        calculator.threebutton.doClick();

        calculator.clearbutton.doClick();

        assertEquals("", calculator.DisplayLabel.getText());
    }

    @Test
    void testDecimalInput() {
        calculator.fivebutton.doClick();
        calculator.dotbutton.doClick();
        calculator.fivebutton.doClick();
        calculator.plusbutton.doClick();
        calculator.twobutton.doClick();
        calculator.dotbutton.doClick();
        calculator.threebutton.doClick();
        calculator.equelbutton.doClick();

        assertEquals("7.8", calculator.DisplayLabel.getText());
    }

    @Test
    void testDivisionByZero() {
        calculator.fivebutton.doClick();
        calculator.subbutton.doClick();
        calculator.zerobutton.doClick();
        calculator.equelbutton.doClick();

        assertEquals("Infinity", calculator.DisplayLabel.getText());
    }
}
