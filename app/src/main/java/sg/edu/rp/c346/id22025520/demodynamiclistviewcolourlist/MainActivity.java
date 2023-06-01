package sg.edu.rp.c346.id22025520.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etElement;
    Button btnAdd;
    ListView lvColour;

    EditText etIndexElement;

        ArrayList<String> alColours = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement = findViewById(R.id.editTextColour);
        btnAdd = findViewById(R.id.buttonAddItem);
        lvColour = findViewById(R.id.listViewColour);
        etIndexElement = findViewById(R.id.editTextIndex);

        alColours.add("Red");
        alColours.add("Orange");

        ArrayAdapter aaColour = new ArrayAdapter(this,android.R.layout.simple_list_item_1, alColours);

        lvColour.setAdapter(aaColour);

    btnAdd.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String colour = etElement.getText().toString();
            int pos = Integer.parseInt(etIndexElement.getText().toString());
            alColours.add(pos, colour);
            aaColour.notifyDataSetChanged();
        }
    });
    }
}