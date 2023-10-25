package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.xpanxion.assignments.shared.PersonRepository;

public class JavaTwo {
   static HashMap<Integer, Person> personHashMap;

    //
    // Constructors
    //

    public JavaTwo() {}

    //
    // Public methods
    //
    public void ex1() {
       ArrayList<Person> people = new ArrayList<Person>();
       Scanner scanner = new Scanner(System.in);
       String str;

       while (true) {
        System.out.printf("Enter person: ");
        str = scanner.nextLine();
        String[] tokens = str.split(" ");
        if(str.equals("done")){break;}
        int id=0;
        for(int i=0; i<tokens[0].length(); ++i){
            if(tokens[0].charAt(i)>='0' && tokens[0].charAt(i)<='9')
                id += tokens[0].charAt(i) - '0';
        }
        String firstName = tokens[1];
        String lastName = tokens[2];
        people.add(new Person(id, firstName, lastName));
        }
        for(int i =0; i < people.size();i++){
        System.out.println(people.get(i));
        }
        
    }
    
    public void ex2() {
        personHashMap = new HashMap<Integer, Person>();
        personHashMap.put(1, new Person(1, "Alice", "Jones"));
        personHashMap.put(2, new Person(2, "Bob", "Smith"));
        personHashMap.put(3, new Person(3, "Charlie", "Brown"));
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter person ID: ");
        int id = input.nextInt();

        System.out.println(getPerson(id));
        
    }
    public Person getPerson(Integer personId) {
        return personHashMap.get(personId);
    }

    public void ex3() {
        Invoice invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        System.out.println("Total Cost: $" + invoice.getTotalCost());
    }   

    public void ex4() {
        Invoice invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        System.out.println("Total Cost: $" + invoice.getTotalCost());
       
    }
   

    public void ex5() {
     Repository p = new Repository();
     System.out.println(p.getPerson(1));

    }

    public void ex6() {
    ArrayList<String> calc;
       calc = new ArrayList<>();
       int ans;
       do{
       Scanner input = new Scanner(System.in);
       System.out.println("Enter first number: ");
       int x = input.nextInt();
       System.out.println("Enter second number: ");
       int y = input.nextInt();
       input.nextLine();
       Calculator c = new Calculator(x, y);
       System.out.println("Enter operation(add, sub. mul, div): ");
       String operation = input.nextLine();
       if (operation.equalsIgnoreCase("add")){
        System.out.println(c.add());
        calc.add(x + " + " + y + " = " + c.add());
        } else if (operation.equalsIgnoreCase("sub")){
            System.out.println(c.subtract());
            calc.add(x + " - " + y + " = " + c.subtract());
            }else if (operation.equalsIgnoreCase("mul")){
                System.out.println(c.multiply());
                calc.add(x + " * " + y + " = " + c.multiply());
                }else if (operation.equalsIgnoreCase("div")){
                    System.out.println(c.divide());
                    calc.add(x + " / " + y + " = " + c.divide());
                    }
        System.out.println("Do another calculation? 0-NO 1-YES");
        ans = input.nextInt();
        } while(ans != 0);
        System.out.println("Calculation History:");
        for(int i = 0; i< calc.size(); i++){
            System.out.println(calc.get(i));
        }
    }

    public void ex7() {
       ArrayList<Person> per = new ArrayList<>();
       per.add(new Person(1,"John","Doe"));
       per.add(new Person(2,"Alice","John"));
       per.add(new Person(3,"Test","Subject"));
       per.add(new Person(4,"Fiserv","Employee"));
       System.out.println("Redacting lastname:");
        per.stream()
            .forEach(p -> System.out.println("Person{id= " + p.id + ", firstName=" +p.firstName + ", lastName= xxx" +"}"));
        
       
    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );
 
        for(int i=0; i<personList.size(); ++i){
            for(int j=i+1; j<personList.size(); ++j){
                if(!compare(personList.get(i), personList.get(j))){
                    Person temp = personList.get(i);
                    personList.set(i, personList.get(j));
                    personList.set(j, temp);
                }
            }
        }
 
        for (Person p : personList) {
            System.out.println(p);
        }
        
    }
    public boolean compare(Person p1, Person p2){
        if(p1.getFirstName().compareTo(p2.getFirstName()) < 0){
            return true;
        } else { return false;}
    }

    public void ex9() {
        
    }

    public void ex10() {
        

    }

    //
    // Private helper methods
    //
}

class Person{
    int id;
    String firstName;
    String lastName;

    public Person(){
        JavaTwo.personHashMap = new HashMap<Integer, Person>();
        JavaTwo.personHashMap.put(1, new Person(1, "Alice", "Jones"));
        JavaTwo.personHashMap.put(2, new Person(2, "Bob", "Smith"));
        JavaTwo.personHashMap.put(3, new Person(3, "Charlie", "Brown"));
    }
    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "Person{id= " + id + ", firstName=" + firstName + ", lastName=" + lastName + "}";
    }
}

class Product extends Base{
    String name;
    double cost;

    public Product(int id, String name, double cost){
        super(id);
        this.name = name;
        this.cost = cost;
    }

    public double getCost(){
        return cost;
    }
    public String toString(){
        return "Product{id= " + id + " name= " + name + " cost= $"+cost+"}";
    }
}
class Invoice extends Base{
    private ArrayList<Product> products = new ArrayList<>();
    
    public Invoice(int id) {
        super(id);
    }

    public void addProduct(Product product){
        products.add(product);
    }
    
    public double getTotalCost(){
        double totalCost = 0;
        for (Product p : products) {
            totalCost += p.getCost();
            }
            return totalCost;
    }
}
abstract class Base{
    int id;

    public Base(int id){
        this.id = id;
    }
}

interface DataAccess{
    Person getPerson(int id);
}
class Repository implements DataAccess{

    @Override
    public Person getPerson(int id) {
        Person p = new Person();
        p = JavaTwo.personHashMap.get(1);
        return p;
    }

}
class Calculator{
    double num1;
    double num2;

    public Calculator(double x, double y){
        num1 = x;
        num2 = y;
    }

    public double add(){
        return num1 + num2;
    }

    public double subtract(){
        return num1 - num2;
    }
    
    public double multiply(){
        return num1 * num2;
    }

    public double divide(){
        if (num2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

}