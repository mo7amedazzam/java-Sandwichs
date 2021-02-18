package mohamed.com.sandwichs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView img_sandwish;
    TextView n_sandwish;
    TextView s_price;
    TextView Ingredients ;

String tv1s[] , tv2s[] , tv3s[];
int images[] = {R.drawable.chickenpizzasandwich , R.drawable.beefpaninisandwish, R.drawable.roastbeefsandwich,
R.drawable.hamsandwich,R.drawable.fishsandwich,R.drawable.cheesesandwich,R.drawable.turkeysandwiches};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_sandwish = findViewById(R.id.img_sandwish);
        n_sandwish = findViewById(R.id.n_sandwish);
        s_price = findViewById(R.id.s_price);
        Ingredients = findViewById(R.id.Ingredients);

        //واجهه الساندوتش
        recyclerView = findViewById(R.id.recyclerView);
        tv1s = getResources().getStringArray(R.array.N_Sandwiches);
        tv2s = getResources().getStringArray(R.array.S_prices);
        tv3s = getResources().getStringArray(R.array.Ingredients);

        MyAdapter3 myAdapter = new MyAdapter3(this , tv1s , tv2s , tv3s  , images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}