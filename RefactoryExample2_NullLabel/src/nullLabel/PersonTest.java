package nullLabel;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class PersonTest {	
	@Test
	void test() {
		ByteArrayOutputStream testOut = new ByteArrayOutputStream();
		PrintStream stdOut = System.out;
		System.setOut(new PrintStream(testOut));
		
        Person[] people = {
            new Person(new Label("Alice"), new Label("alice@example.com")),
            new Person(new Label("Bob")),
            new Person(new Label("Charlie"), new Label("Charlie@example.com")),
        };

        for (Person p : people) {
            System.out.println(p.toString());
            p.display();
            System.out.println("");
        }
        
        String goldenMaster = "[ Person: name=\"Alice\" mail=\"alice@example.com\" ]\n"
        		+ "display: Alice\n"
        		+ "display: alice@example.com\n"
        		+ "\n"
        		+ "[ Person: name=\"Bob\" mail=\"(none)\" ]\n"
        		+ "display: Bob\n"
        		+ "\n"
        		+ "[ Person: name=\"Charlie\" mail=\"Charlie@example.com\" ]\n"
        		+ "display: Charlie\n"
        		+ "display: Charlie@example.com\n"
        		+ "\n"
        		+ "";
        
        assertEquals(goldenMaster, testOut.toString());
        
        System.setOut(stdOut);
	}
}

