package com.example.e_cell_imageapi_app;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity2 extends AppCompatActivity {

    private EditText Name;
    private Button Search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagal);

        Name = (EditText)findViewById(R.id.a1);

        Search = (Button)findViewById(R.id.a2);



        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString());
            }
        });
    }

    private void validate(String userName){
        if(userName!=""){
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("EXTRA_SESSION_ID", userName);
            startActivity(intent);
        }else{

        }
    }

}