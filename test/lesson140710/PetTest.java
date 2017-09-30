package lesson140710;

import org.jmock.Expectations;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class PetTest {
    @Rule
    public JUnitRuleMockery context = new JUnitRuleMockery();

    @Test
    public void test(){
        final Pet pet = context.mock(Pet.class);

        Master master = new Master();

        Sequence takeCare = context.sequence("take care");

        context.checking(new Expectations(){
            {
                atLeast(1).of(pet).feed(); inSequence(takeCare);
                oneOf(pet).walk(); inSequence(takeCare);
                allowing(pet).play(); inSequence(takeCare);
                allowing(pet).pet(); inSequence(takeCare);
            }
        });

        master.takeCare(pet);
    }
}