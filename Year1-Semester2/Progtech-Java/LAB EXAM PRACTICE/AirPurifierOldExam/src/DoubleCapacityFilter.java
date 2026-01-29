//คลาสลูก extends มาจากคลาส Filter เป็นไสก้รองที(มีความสามารถในการกรองไดเ้ป็นสองเท่าของไสก้รองในคลาสพอ่
public class DoubleCapacityFilter extends Filter {
    private static final int START_CAPACITY = 20000;

    public DoubleCapacityFilter() {
        currentCapacity = START_CAPACITY;
    }
}