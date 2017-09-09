package lesson140506;

public class B {

    static class F{
        static{

        }
    }
    interface I{

    }

    @Override
    protected void finalize() throws Throwable {

    }

    I m(){

        class Alocal implements I{
            final static int x = 10;
        }

        return new Alocal();
    }
}
