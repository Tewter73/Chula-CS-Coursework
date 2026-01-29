//คลำสไส้กรองในเครื่องฟอกอำกำศ
public class Filter {
    protected static final int START_CAPACITY = 10000;
    //ควำมสำมำรถตั้งต้นในกำรกรองของไส้กรองว่ำกรองอำกำศได้กี่หน่วย (ไส้กรองอันใหม่ยังไม่เคยถูกใช้)
    protected int currentCapacity; //ควำมสำมำรถในกำรกรอง ณ ปัจจุบันหลังจำกไส้กรองถูกใช้ไปแล้ว
    public Filter() {
        currentCapacity = START_CAPACITY;
    }
    //กรองอำกำศ ดังนั้นจะลดค่ำ currentCapacity ลงตำมปริมำณอำกำศที่กรอง
    public void filter(int airVolumnInLiter) {
        this.currentCapacity = Math.max(0, currentCapacity - airVolumnInLiter);
    }
    public int getCurrentCapacity() {
        return currentCapacity;
    }
    public String getFilterType() {
        return getClass().getSimpleName();
    }
    public String toString() {
        return "[" + getFilterType() + "] Current Capacity: " + getCurrentCapacity();
    }
}
