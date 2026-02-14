import java.net.PasswordAuthentication;
public class auth
{
    public void demo()
    {
        String username="Chirag";
        char password[]={'C','h','i','r','a','g','r','r','a','i','8','1','0','5'};
        PasswordAuthentication p =new PasswordAuthentication(username, password);
        System.out.println(p.getUserName());
        System.out.println(p.getPassword());
        System.out.println(String.copyValueOf(p.getPassword()));
    }
    
}