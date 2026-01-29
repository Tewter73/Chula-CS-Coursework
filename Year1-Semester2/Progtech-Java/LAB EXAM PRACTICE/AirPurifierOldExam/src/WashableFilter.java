public class WashableFilter extends Filter {
    private final int START_CAPACITY = 20000;
    private final int SELF_WASHING = 5;

    public WashableFilter() {
        currentCapacity = START_CAPACITY;
    }
    @Override
    public void filter(int airVolumnInLiter) {
        super.filter(airVolumnInLiter);
        this.currentCapacity = Math.max(0, currentCapacity - airVolumnInLiter);
    }
}
