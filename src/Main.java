import com.university.bridge.renderer.RasterRenderer;
import com.university.bridge.renderer.Renderer;
import com.university.bridge.renderer.VectorRenderer;
import com.university.bridge.shape.Circle;
import com.university.bridge.shape.Shape;
import com.university.bridge.shape.Square;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5.0f);
        circle.draw();

        circle.setRenderer(rasterRenderer);
        circle.draw();

        Shape square = new Square(rasterRenderer, 10.0f);
        square.draw();
    }
}