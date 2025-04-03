package Recordables;

public class ObjectWithDuration implements Recordable {
    private double duration;

    @Override
    public void record() {
        System.out.println("Recording" + duration);
    }

}
