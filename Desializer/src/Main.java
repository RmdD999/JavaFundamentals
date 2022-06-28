import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Notes: 1. children classes of a parent class that implements Serializable will do so as well.
        //        2. static fields are not serialized (they belong to the class, not an individual object)
        //        3. the class's defination ("class file") itself is not recorded, cast it as the object type
        //        4. Fields declared as "transient" aren't serialized, they're ignored
        //        5. serialVersionUID is a unique version ID


        User user = null;
        FileInputStream fileIn = new FileInputStream("D:\\Rmd\\GithubTest\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.greeting();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}