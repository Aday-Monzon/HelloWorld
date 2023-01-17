package es.us.eii;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	
	public int fibonacci(int a){
	
		if (a== 0){
			return 0;
		}else if (a==1) {
            		return 1;
        	} else {
            		return (fibonacci(a-1) + fibonacci(a-2));
        	}
	
	}
}
