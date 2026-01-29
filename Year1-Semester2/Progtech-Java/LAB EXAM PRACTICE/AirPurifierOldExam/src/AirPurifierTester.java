public class AirPurifierTester {
    public static void main(String[] args) {
        Filter f = new Filter();
        DoubleCapacityFilter df = new DoubleCapacityFilter();
        //SelfCleanFilter sf = new SelfCleanFilter();

        AirPurifier a = new AirPurifier();
        a.insertFilter(f);
        a.insertFilter(df);
        //a.insertFilter(sf);
        a.printFilterDetails();

        a.filter(4000);
        a.printFilterDetails();
        a.filter(35000);
        a.printFilterDetails();
        Filter f2 = new Filter();
        a.replaceFilterAtIndex(0, f2);
        a.printFilterDetails();
    }
}
