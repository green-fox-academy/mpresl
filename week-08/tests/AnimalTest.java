import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
     Animal animal;

        @BeforeAll
        public static void beforeClass(){
            System.out.println("Executed once before all tests... TESTS ARE RUNNING");
        }

        @BeforeEach
        public void init(){
            animal = new Animal();
            animal.belly = 7;
            animal.maxBelly = 10;
        }

        @AfterEach
        public void afterTest(){
            System.out.println("Test was done...");
        }

        @AfterAll
        public static void afterClass(){
            System.out.println("Tests are all Complete");
        }

        @Test
        public void eatTest(){
            int expected = 8;
            animal.eat();
            int actual = animal.belly;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void eatWalkTest(){
            animal.belly = 10;
            int expected = 9;
            animal.eat();
            int actual = animal.belly;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void isHungryTest(){
            animal.belly = 4;
            assertTrue(animal.isHungry());
        }

}