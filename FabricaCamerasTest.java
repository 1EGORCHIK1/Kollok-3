
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

class CamerasTest {
    @Test
    void TestD5() {
        IFabricaDeCameras factory = new FabricaCanon();
        Cameras Cameras = new Cameras(factory);
        assertEquals("model Full Frame D5", Cameras.getD5MarkIII());
    }

    @Test
    void TestT81() {
        IFabricaDeCameras factory = new FabricaCanon();
        Cameras Cameras = new Cameras(factory);
        assertEquals("model T8i", Cameras.getT8i());
    }
    @Test
    void TestD3500() {
        IFabricaDeCameras factory = new FabricaCanon();
        Cameras Cameras = new Cameras(factory);
        assertEquals("model D3500", Cameras.getD3500());
    }
}