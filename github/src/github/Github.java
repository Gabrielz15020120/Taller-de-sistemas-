
package github;

/**
 *
 * @author CHE21
 */
//subiendo arhivo con net beans a github
public class Github {
    
    public void suma(){
        int x = 5, y = 8;
        int sum = x + y;
        
        System.out.println("La suma de x + y es: " + sum);
    }

    public static void main(String[] args) {
        Github obj = new Github();
        obj.suma();
    }
    
}
