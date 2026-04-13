package poly.ex6;

public class Bird extends AbstractAnimal implements Fly { //extends는 하나!!!, implements는 여러개!!
    @Override
    public void sound() {
        System.out.println("짹쨱");
    }

    @Override
    public void fly() {
        System.out.println("날라가요~");
    }
}

