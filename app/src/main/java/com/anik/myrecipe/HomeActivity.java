package com.anik.myrecipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnRecipe1,btnRecipe2,btnRecipe3,btnRecipe4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        getSupportActionBar().setTitle("Home");  //ActionBar title

        btnRecipe1=(Button)findViewById(R.id.btn_recipe1);
        btnRecipe2=(Button)findViewById(R.id.btn_recipe2);
        btnRecipe3=(Button)findViewById(R.id.btn_recipe3);
        btnRecipe4=(Button)findViewById(R.id.btn_recipe4);

        btnRecipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);

                intent.putExtra("recipe_no","one");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Falafel Burger", Toast.LENGTH_SHORT).show();
            }
        });


        btnRecipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);

                intent.putExtra("recipe_no","two");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chicken Biriyani", Toast.LENGTH_SHORT).show();
            }
        });


        btnRecipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);

                intent.putExtra("recipe_no","three");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Chockolate Cake", Toast.LENGTH_SHORT).show();
            }
        });


        btnRecipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);

                intent.putExtra("recipe_no","four");
                startActivity(intent);

                Toast.makeText(HomeActivity.this, "Mexican Pizza", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
