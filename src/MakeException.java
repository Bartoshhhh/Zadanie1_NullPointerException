import java.sql.SQLOutput;

// klasa
public class MakeException {

//metoda
    public void GenerateException() {
        // obiekt z wartością null
    String nullString = null;

    // użycie obiektu null spowoduje użycie wyjątku NullPointerException
        System.out.println(nullString.length());

    }
}

