package Exception;
import java.lang.reflect.Field;

public class GenerateNoSuchFieldException {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.String");
            Field field = cls.getDeclaredField("nonExistentField"); // This will generate NoSuchFieldException
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found: " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
