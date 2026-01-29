import java.util.ArrayList;
//คลำสเครื่องฟอกอำกำศ
public class AirPurifier {
    private final ArrayList<Filter> filters; //แทนไส้กรอง

    public AirPurifier() {
        filters = new ArrayList<>();
        //อำร์เรย์ที่เก็บไส้กรอง โดยขึ้นกับว่ำเครื่องกรองตัวนี้จะมีไส้กรองกี่ตัว
    }
    //ใส่ไส้กรองลงในเครื่อง
    public void insertFilter(Filter filter) {
        filters.add(filter);
    }
    //เปลี่ยนไส้กรอง โดยรับเลขช่องในอำร์เรย์ของตัวไส้กรองที่จะเปลี่ยน (index) และรับไส้กรองตัวใหม่ที่จะน ำมำเปลี่ยน (filter)
    public void replaceFilterAtIndex(int index, Filter filter) {
        try {
            if (filters.get(index) != null) {
                filters.set(index, filter);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!!!!!Error Cannot replaceFilterAtIndex!!!!!");
        }
    }
    //พิมพ์แสดงข้อมูลไส้กรองในเครื่องแต่ละตัว
    public void printFilterDetails() {
        System.out.println("##### Filter Details #####");
        int i = 0;
        while (i < filters.size()) {
            System.out.print(i + ") ");
            System.out.println(filters.get(i));
            i++;
        }
        System.out.println("##########################");
        System.out.println();
    }
    //กรองอำกำศ ในควำมเป็นจริงประสิทธิภำพไส้กรองมักวัดเป็นเดือน เช่นหกเดือนเปลี่ยนที
    //แต่ในเมธอดนี้สมมติว่ำเรำวัดประสิทธิภำพไส้กรองจำกปริมำณอำกำศที่ไหลผ่ำนเครื่องกรอง (airVolumeInLiter)
    public void filter(int airVolumeInLiter) {
        int i = 0;
        //วนเช็คทีละไส้กรอง
        while (i < filters.size()) {
            int air = airVolumeInLiter;
            Filter f = filters.get(i); //get ไส้กรองต่ละตัวมำใส่ตัวแปร f
            //เอำปริมำณอำกำศที่รับเข้ำมำลบกับ capacity ของไส้กรองที่เหลืออยู่ ณ ปัจจุบัน
            //หำกปริมำณอำกำศมีค่ำมำกกว่ำ capacity ของไส้กรองที่เหลืออยู่ ณ ปัจจุบัน จะเอำค่ำผลต่ำงไปใส่ให้ airVolumeInLiter
            //และในรอบถัดไป ไส้กรองตัวอื่นจะฟอกจนกว่ำ airVolumeInLiter จะเป็นศูนย์
            //หำกปริมำณอำกำศมีค่ำน้อยกว่ำ capacity ของไส้กรองที่เหลืออยู่ ณ ปัจจุบัน จะเอำศูนย์ไปใส่ให้ airVolumeInLiter
            airVolumeInLiter = Math.max(0, airVolumeInLiter - f.getCurrentCapacity());
            //ไส้กรองฟอกอำกำศ
            f.filter(air);
            if(airVolumeInLiter == 0) break; //airVolumeInLiter เป็นศูนย์แล้วก็ออกจำกลูป
            i++;
        }
        //หำกใช้ครบทุกไส้กรองแล้ว airVolumeInLiter ยังไม่เป็นศูนย์ขึ้นเตือนว่ำต้องเปลี่ยนไส้กรอง
        if (airVolumeInLiter > 0) {
            System.out.println("!!!!!Please replace filter!!!!!");
        }
    }
}
