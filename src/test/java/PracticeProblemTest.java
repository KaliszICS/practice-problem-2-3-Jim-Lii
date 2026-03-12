import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void testExample() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }
   @Test
   void circleAreaTest1(){
      assertEquals(Math.PI, PracticeProblem.circleArea(1));
   }
   @Test
   void circleAreaTest2(){
      assertEquals(Math.PI*4, PracticeProblem.circleArea(2.0));
   }
   @Test
   void circleAreaTest3(){
      assertEquals(Math.PI*9, PracticeProblem.circleArea(3));
   }
   @Test
   void circleAreaTest4(){
      assertEquals(Math.PI*2.25, PracticeProblem.circleArea(1.5));
   }
   @Test
   void circleAreaTest5(){
      assertEquals(Math.PI*10000.0, PracticeProblem.circleArea(100.0));
   }
   @Test
   void minutesToHoursTest1(){
      assertEquals("1 hours and 30 minutes", PracticeProblem.minutesToHours(90));
   }
   @Test
   void minutesToHoursTest2(){
      assertEquals("1 hours and 18 minutes", PracticeProblem.minutesToHours(78));
   }
   @Test
   void minutesToHoursTest3(){
      assertEquals("-1 hours and -40 minutes", PracticeProblem.minutesToHours(-100));
   }
   @Test
   void minutesToHoursTest4(){
      assertEquals("16 hours and 39 minutes", PracticeProblem.minutesToHours(999));
   }
   @Test
   void minutesToHoursTest5(){
      assertEquals("0 hours and 1 minutes", PracticeProblem.minutesToHours(1));
   }
   @Test
   void simpleInterestTest1(){
      assertEquals(5.0, PracticeProblem.simpleInterest(5.0, 1.0, 100));
   }
   @Test
   void simpleInterestTest2(){
      assertEquals(0.1, PracticeProblem.simpleInterest(0.01, 1000.0, 1));
   }

   @Test
   void simpleInterestTest3(){
      assertEquals(100000000.0, PracticeProblem.simpleInterest(10000.0, 1000.0, 1000));
   }
   @Test
   void simpleInterestTest4(){
      assertEquals(4.44, PracticeProblem.simpleInterest(22.2, 2.0, 10));
   }
   @Test
   void simpleInterestTest5(){
      assertEquals(-100, PracticeProblem.simpleInterest(1, -100.0, 100));
   }
   @Test
   void hypotenuseTest1(){
      assertEquals(5.0, PracticeProblem.hypotenuse(3.0, 4.0));
   }
   @Test
   void hypotenuseTest2(){
      assertEquals(5.0, PracticeProblem.hypotenuse(3.0, -4.0));
   }
   @Test
   void hypotenuseTest3(){
      assertEquals(Math.sqrt(50.0), PracticeProblem.hypotenuse(5.0, 5.0));
   }
   @Test
   void hypotenuseTest4(){
      assertEquals(Math.sqrt(2.0), PracticeProblem.hypotenuse(1.0, 1.0));
   }
   @Test
   void hypotenuseTest5(){
      assertEquals(0.0, PracticeProblem.hypotenuse(0.0, 0.0));
   }

}
