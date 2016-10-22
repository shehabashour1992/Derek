package co.example.samsung.derek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String name="shehab mohamed ashour";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args)
    {

    }

}
