import org.testng.annotations.Test;

public class Homework {

    @Test
    public void testExercise1() {
        System.out.println ("Hello, World!");
    }

    @Test
    public void testExercise2() {
        float var1 = 2.0f;
        boolean var2 = true;
        String output = "H" + 3110 + " " + "W" + 0 + "r" + 1 + "d" + " " + var1 + " " + var2;
        System.out.println(output);
    }

    @Test
    public void testExercise3() {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a == b;
        boolean b2 = b.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) { System.out.println("Success!");
        }
    }

    @Test
    public void testExercise4() {

        int[] numbers = {1, 2, 3, 9};
        int length = numbers[3];
        char[] chars = new char[length];
        chars[numbers.length + 4] = 'y';
        System.out.println("Done!");
    }

    @Test
    public void testExercise5() {
        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};

        for (int i = 0; i <= numbers.length; i++) {
            int element = numbers[i];
            if (element % 2 == 0) {
                System.out.println(element);
            }
            if (element == 237) {
                break;
            }
        }
    }

    @Test
    public void testExercise6(){
        class Student {
            private String firstName;
            private String lastName;

            public Student(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public void printFullName() {
                System.out.println(this.firstName + " " + this.lastName);
            }
        }

           Student[] students = new Student[]{
                        new Student("Morgan", "Freeman"),
                        new Student("Brad", "Pitt"),
                        new Student("Kevin", "Spacey"),
                };
                for (Student s : students) {
                    s.printFullName();
                }
    }

    @Test
    public void testExercise7() {
        class Point {
            private double x;
            private double y;

            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            public void print() {
                System.out.println("(" + x + "," + y + ")");
            }

            public void scale() {
                x=x/2;
                y=y/2;
            }
        }

            Point p = new Point(32, 32);
                for (int i = 0; i < 5; i++) {
                    p.scale();
                    p.print();
                }
            }

}
