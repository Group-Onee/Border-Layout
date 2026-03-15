import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.*;

public class WorkingWithBorderLayoutTest {

    @Test
    public void testFrameCreation() {
        WorkingWithBorderLayout app = new WorkingWithBorderLayout();
        JFrame frame = app.createJFrame();

        assertNotNull(frame);
        assertEquals("BorderLayout Demo", frame.getTitle());
        assertEquals(600, frame.getWidth());
        assertEquals(400, frame.getHeight());
    }

    @Test
    public void testLabelCreation() {
        WorkingWithBorderLayout app = new WorkingWithBorderLayout();
        JLabel label = app.CreateJLabelOne();

        assertNotNull(label);
        assertEquals("Application Title", label.getText());
        assertEquals(JLabel.CENTER, label.getHorizontalAlignment());
    }

    @Test
    public void testButtonsCreation() {
        WorkingWithBorderLayout app = new WorkingWithBorderLayout();

        JButton btn1 = app.CreateButtOne();
        JButton btn2 = app.CreateButtonTwo();
        JButton btn3 = app.CreateButtonThree();

        assertEquals("Option 1", btn1.getText());
        assertEquals("Option 2", btn2.getText());
        assertEquals("Option 3", btn3.getText());
    }

    @Test
    public void testSubmitButton() {
        WorkingWithBorderLayout app = new WorkingWithBorderLayout();
        JButton submit = app.createSubmitButton();

        assertNotNull(submit);
        assertEquals("Submit", submit.getText());
    }

    @Test
    public void testScrollPaneCreation() {
        WorkingWithBorderLayout app = new WorkingWithBorderLayout();
        JScrollPane scrollPane = app.createJScrollPane();

        assertNotNull(scrollPane);
        assertTrue(scrollPane.getViewport().getView() instanceof JTextArea);
    }

    @Test
    public void testPanelCreation() {
        WorkingWithBorderLayout app = new WorkingWithBorderLayout();
        JPanel panel = app.createJPanel();

        assertNotNull(panel);
        assertEquals(3, panel.getComponentCount());
    }
}