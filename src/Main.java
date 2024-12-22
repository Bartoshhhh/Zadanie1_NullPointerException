// klasa main do testowania wyjątku NullPointerException
public class Main {
    public static void main(String[] args) {
        MakeException generator = new MakeException();
        try {
            generator.GenerateException();
        }
        catch (NullPointerException e) {
            // komunikat
            System.out.println("Wyjątek NullPointerException.");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
