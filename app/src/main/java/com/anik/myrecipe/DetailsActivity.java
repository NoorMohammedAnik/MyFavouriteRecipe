package com.anik.myrecipe;

import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView txtName,txtDescription;
    ImageView imgFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);



        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Recipe Details");  //ActionBar title



        txtName=(TextView)findViewById(R.id.txt_name);
        txtDescription=(TextView)findViewById(R.id.txt_description);
        imgFood=(ImageView)findViewById(R.id.img_food);

        String getRecipeNo=getIntent().getExtras().getString("recipe_no");

        if(getRecipeNo.equals("one"))
        {
            txtName.setText("Falafel Burger");
            imgFood.setImageResource(R.drawable.falafel_burgers);
            txtDescription.setText(R.string.falafel_burger);



        }


       else if(getRecipeNo.equals("two"))
        {
            txtName.setText("Chicken Biriyani");
            imgFood.setImageResource(R.drawable.chicken_biriyani);
            txtDescription.setText(R.string.chicken_biriyani);



        }


       else if(getRecipeNo.equals("three"))
        {
            txtName.setText("Chockolate Cake");
            imgFood.setImageResource(R.drawable.cake);
            txtDescription.setText(R.string.chocolate_cake);



        }


       else if(getRecipeNo.equals("four"))
        {
            txtName.setText("Mexican Pizza");
            imgFood.setImageResource(R.drawable.pizza);
            txtDescription.setText(R.string.mexican_pizza);



        }
    }



    //for back button. paste it outside of onCreate method.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
