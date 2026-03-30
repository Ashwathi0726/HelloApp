/*public class Helloapp {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}

public class Helloapp {
    public static void main(String[] args) {
        
        String name = args[0]; 
        System.out.println("Hello, " + name + "!");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> feature/UC2
*/

public class Helloapp {
public static void main(String[] args) {
String name = "World";
if (args.length > 0) {
name = args[0]; 
}
System.out.println("Hello, "+ name + "!");
}
}