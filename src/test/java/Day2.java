import org.testng.annotations.Test;

public class Day2 {
    /*@Test
    public void swapTwoNumbersInArray() {
        int [] array = {1,2,3,4]};

        swap (array,1,2);

        String arrayConverted = Arrays.toString;
        }
        private void swap (int[] arra, int indexL, int indexR){
    }


    @Test
    public void testCountLetters() {
        String input = "Hello World";
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if (eachChar == '1') result++;
            }
        System.out.println (result);
    }*/

    @Test
    public void testConstructors() {
        Actor actor1 = new Actor ("Actor's First Name", "Actor's Last Name");
        Actor actor2 = new Actor ("Actor's First Name", "Actor's Last Name");

        System.out.println ("First Name field's value is:" + " " + actor1.name);
        System.out.println ("Last Name field's value is:" + " " + actor1.surname);

        System.out.println ("First Name field's value is:" + " " + actor2.name);
        System.out.println ("Last Name field's value is:" + " " + actor2.surname);

    }
}
