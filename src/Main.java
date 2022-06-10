
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Sara", 45, 111),
                new Person("John", 25, 112),
                new Person("Ivan", 31, 113),
                new Person("Ron", 23, 114),
                new Person("Jo", 23, 116)
        };


        Customer[] customers = {
                new Customer("Sara", 45, 111, 5401),
                new Customer("John", 25, 112, 5402),
                new Customer("Ivan", 31, 113, 5403),
                new Customer("Ron", 23, 114, 5404)
        };

        Gamer[] gamers = {
                new Gamer("Jo", 23, 116, "PS"),
                new Gamer("John", 25, 112, "PC"),
        };

        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
        printService.print(gamers);
    }
}