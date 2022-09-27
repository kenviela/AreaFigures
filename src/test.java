import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {

    private Main main;
    @Before
    public void setUp()throws Exception{
        main=new Main();
    }

    @Test
    public void testAreaTriangle(){
        assertEquals(600,main.area_triangle(),600.0);
    }

    @Test
    public void testAreaSquare(){
        assertEquals(900,main.area_square(),900.0);
    }

    @Test
    public void testAreaRectangle(){
        assertEquals(200,main.area_Rectangle(),200.0);
    }
}
