package com.example.aman766345ft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class Register_User extends AppCompatActivity  {

    EditText n_text,e_text,p_text;
    Button s_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__user);

        // Edit Text
        n_text = findViewById(R.id.name);
        e_text = findViewById(R.id.email);
        p_text = findViewById(R.id.phone);

        // Save Button

        s_btn = findViewById(R.id.savebtn);

        s_btn.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View view) {
                if (!n_text.getText().toString().isEmpty() & !e_text.getText().toString().isEmpty() & !p_text.getText().toString().isEmpty()){

                    DataofUser data = new DataofUser(n_text.getText().toString(),e_text.getText().toString(),p_text.getText().toString());
                    DataofUser.DetailsofUser.add(data);
                    Toast.makeText(Register_User.this, "Next Added User"+DataofUser.DetailsofUser, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register_User.this,Verify.class);
                    startActivity(intent);



                }
                else
                    {
                    Toast.makeText(Register_User.this,"All the fields are Mandatory",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
