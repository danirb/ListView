package es.hol.danirb.listview;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {
    private ListView list;//el listview
    String[] lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        lista = new String[]{"Messi", "Pedrito", "Neymar Jr."};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
