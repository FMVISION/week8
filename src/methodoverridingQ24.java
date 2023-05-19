public class methodoverridingQ24 {
    /*
    A real example of Java Method Overriding (Create package name
‘methodoverriding24’ and create all below classes in this package)
     */

    // Java Program to demonstrate the real scenario of Java Method overriding
    //where three classes are overriding the method of a parent class.
//Creating a parent class.
    class Bank {                    // PARENT CLASS
        public int getRateofInterest() {
            return 0;
        }
    }
        //Creating child class                       // CHILD CLASS
         class SBI extends Bank {
            @Override
            public int getRateofInterest() {
                return 8;
            }
        }

        class ICICI extends Bank {
            @Override
            public int getRateofInterest() {
                return 7;
            }
        }
            class AXIS extends Bank {
                @Override
                public int getRateofInterest() {
                    return 9;
                }
            }
                // Test class to create objects and call the methods
                class Test2 {
                    public void main(String[] args) {            // MAIN METHOD

                        SBI  s=new SBI();                       //CREATE OBJ
                       ICICI i =new ICICI();
                        AXIS   a= new AXIS();

                        System.out.println("SBI Rate of Intrest: " + s.getRateofInterest());          //     CALLING METHOD
                        System.out.println("ICICI Rate of Intrest: " + i.getRateofInterest());
                        System.out.println("AXIS Rate of Intrest: " + a.getRateofInterest());

                    }


                }
            }



