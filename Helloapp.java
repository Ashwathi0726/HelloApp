/* public class Helloapp {
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


/* public class Helloapp {
public static void main(String[] args) {
String name = "World";
if (args.length > 0) {
name = args[0]; 
}
System.out.println("Hello, "+ name + "!");
}
} 

public class Helloapp {
    public static void main(String[] args) {
                if (args.length > 0) {
                    String allNames = String.join(", ", args);
                    System.out.println("Hello, " + allNames + "!");
                    
                } else {
                    System.out.println("Hello, World!");
        }
    }
}*/

public class Helloapp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) { // Fixed: Added colon
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false; // Fixed: Added equals sign
            }

            // The result will look like: "Hello, Alice, Bob!"
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}



