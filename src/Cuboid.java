public class Cuboid extends Rectangle{
    /*
    2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
(instance variable) with name height of type double.
The class needsto have one constructor with three parameters width, length, and height all of type
double. It needsto call the parent constructor and initialize a height field.
In case the height parameter islessthan 0 it needsto set the height field value to 0.
Write the following methods (instance methods):
● Method named getHeight without any parameters, it needsto return the value of height
field.
● Method named getVolume without any parameters, it needsto return the calculated volume.
To calculate volume, multiply the area with height.
3. Write a class with the name Main that containsthe mainmethod.
     */

    private double height;


    public Cuboid(double width,double length,double height){

        Super(width,length);   // why super
           if (height < 0){
               this.height = 0;}
           else {
               this.height = height;


        }
        }

    public Cuboid(double lenght, double width) {
        super(lenght, width);
    }

    public Cuboid(int lenght, double width) {
        super();
    }

    private void Super(double width, double length) {
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return (getArea() * height);

}


}
