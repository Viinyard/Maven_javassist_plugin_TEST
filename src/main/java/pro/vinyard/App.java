package pro.vinyard;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
        ClassToTest ctt = new ClassToTest();
        
        ctt.setValue(12);
        
        System.out.println("Get " + ctt.getValue());
    }
    
    
}
