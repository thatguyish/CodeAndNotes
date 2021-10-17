import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Notes {
    //Collections is an interface
        //Set - Not ordered, no duplicate Elements - Ex: Deck of Cards
            //HashSet
            //LinkedHashSet - organized by when added in
            //TreeSet - organized by value
        //List - Ordered, yes duplicate Elements - Ex: PhoneBook
            //ArrayList
            //LinkedList
            //Stack
            //Vector
        //Queue - First in First Out - Ex: a queue of people
    //Maps - Technically not a collection, Key value pairs - Ex: Dictionary name and meaning
        //TreeMap - organized map
        //LinkedMap - organized by position
        //HashMap

    //Exceptions catch the most specific Exception(ArrayOutOfBounds ex) first and most abstract Exception Last(Like Exception ex)
    //you can catch multiple exceptions at once with a pipe ( | ) (ArrayOutOfBounds | InputMismatch ex)
    //Try with resource will allow you to use a resource only within your try block Ex:  try(Scanner scanner = new Scanner(System.in))

    //You can rethrow an exception by declaring throws Exception in a method signature Ex: public static doStuff throws stuffException()
    public static Map getOriginalGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }


    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("orange");

                                    //call this method on specific instance
        fruits.forEach(System.out::println);

        HashMap<String,Integer> originalGrades = new HashMap<>(getOriginalGrades());

        HashMap<String,Integer> makeUpGrades = new HashMap<>(getMakeUpGrades());

        Map bestGrades = new HashMap<String,Integer>();

        originalGrades.forEach(
                (name,grade)
                        -> {
                    if(makeUpGrades.get(name)>grade) {
                        bestGrades.put(name,makeUpGrades.get(name));
                    }
                    else{
                        bestGrades.put(name,grade);
                    }
                    System.out.println(bestGrades.get(name));
                }
        );
        try {
            int c = 30 / 0;
        }catch (ArithmeticException ex){

        }finally{
            System.out.println("Division is fun");
        }
    }
}
