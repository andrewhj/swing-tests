import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.example.SimpleCopyApplication;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SimpleUseBaseTest extends AssertJSwingJUnitTestCase
{
    private FrameFixture window;

    @Override
    protected void onSetUp()
    {
        final SimpleCopyApplication frame = GuiActionRunner.execute(SimpleCopyApplication::new);

        window = new FrameFixture(robot(), frame);
        window.show();
    }

    @Test
    public void windowCreated()
    {
        assertNotNull(window);
    }

    @Test
    public void copiesTextInLabelWhenClickingButton()
    {
        window.textBox("textToCopy").enterText("Some random text");
        window.button("copyButton").click();
        assertEquals(window.label("copiedText").text(), "Some random text");
//        window.label("copiedText").requireText("Some random text");
    }
}
