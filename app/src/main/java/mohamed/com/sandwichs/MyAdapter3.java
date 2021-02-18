package mohamed.com.sandwichs;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder> {

    String tv1[], tv2[], tv3[];
    int imagesS1[];
    Context context;


    public MyAdapter3(Context ct, String s1[], String s2[], String s3[], int img[]) {
        context = ct;
        tv1 = s1;
        tv2 = s2;
        tv3 = s3;
        imagesS1 = img;
    }

    @NonNull
    @Override
    public MyAdapter3.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_screen__sandwish, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter3.MyViewHolder holder, int position) {
        holder.img_sandwish.setImageResource(imagesS1[position]);
        holder.n_sandwish.setText(tv1[position]);
        holder.s_price.setText(tv2[position]);
        holder.Ingredients.setText(tv3[position]);

    }

    @Override
    public int getItemCount() {
        return imagesS1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView n_sandwish, s_price, Ingredients;
        ImageView img_sandwish;
        ConstraintLayout mainLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_sandwish = itemView.findViewById(R.id.img_sandwish);
            n_sandwish = itemView.findViewById(R.id.n_sandwish);
            s_price = itemView.findViewById(R.id.s_price);
            Ingredients = itemView.findViewById(R.id.Ingredients);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}

