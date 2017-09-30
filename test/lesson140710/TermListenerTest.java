package lesson140710;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class TermListenerTest {

    @Rule
    public JUnitRuleMockery context = new JUnitRuleMockery();

    @Test
    public void test(){
        final TermListener mockListener = context.mock(TermListener.class);

        Termostat term = new Termostat();
        term.setListener(mockListener);

        context.checking(new Expectations(){
            {
                oneOf(mockListener).temperatureChanged(with(any(int.class))); // Ровно один раз будет вызван метод TemperatureChanged
            }
        });

        term.inc();
    }


}