import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Global
{
public static void main(String args[]) throws IOException {
    Properties prop=new Properties();
    FileInputStream fis=new FileInputStream("/Users/venkatasambaraju/IdeaProjects/Globalvariables/src/global.properties");
    prop.load(fis);
    System.out.println(prop.getProperty("Browser"));
    System.out.println(prop.getProperty("url"));
    prop.setProperty("Browser","anoop");
    System.out.println(prop.getProperty("Browser"));
    FileOutputStream fos=new FileOutputStream("/Users/venkatasambaraju/IdeaProjects/Globalvariables/src/global.properties");
prop.store(fos,null);

}
}
