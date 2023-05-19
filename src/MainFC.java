public class MainFC {
    /*
Write the following methods(instance methods):
● Method named getTotalCost without any parameters, it needsto return the calculated total
cost to cover the floor with a carpet.
4. Write a class with the name Main. The class needsto have a main method.
TEST EXAMPLE
→ TEST CODE: Write below code in main method
Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
→ OUTPUT
total= 38.5
total= 36.45
NOTE: All methodsshould be defined as public NOT public static.
NOTE: In total, you have to write 4 classes.
     */


    public static void main(String[] args) {
        Carpet carpet =new Carpet(3.5);
        Floor floor = new Floor(2.75,4);
       Calculator calculator = new Calculator(floor ,carpet);
        System.out.println( "total " + calculator.getTotalCost());

        carpet = new carpet(1.5);
        floor = new floor (5.4,4.5);
        calculator = new calculator(floor, carpet);
        System.out.println("total " + calculator.getTotalCost());
    }
}
