public class Main {
    public static void main(String[] args) {
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue();
        System.out.println(" ");
        Taylor[] array = new Taylor[3];
        array[0] = new Expo(7, 1);
        array[1] = new Sine(7, Math.PI/4);
        array[2] = new Cosine(7, 1);

        for (Taylor t : array) {
            t.printValue();
        }
    }
}
