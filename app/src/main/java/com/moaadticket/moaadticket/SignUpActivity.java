package com.moaadticket.moaadticket;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {
    //1.add auth to project
    private FirebaseAuth auth;// to make SignIn ,SignUp
    private FirebaseUser user;//user
    private TextView etFirst;
    private TextView etLast;
    private EditText etPssword;
    private EditText etEmail;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();//
        etEmail = (EditText)findViewById(R.id.etEmail);
        etPssword = (EditText)findViewById(R.id.etPassword);
        btnSave = (Button) findViewById(R.id.btnSave);
        etFirst = findViewById(R.id.tvFirst);
        etLast = findViewById(R.id.tvLast);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataHandler();
            }
        });

    }

    /**
     * get email and password from the failed and try to create new user
     */

    private void dataHandler()
    {
        boolean isok=true;//if all the fields filled well
        String email=etEmail.getText().toString();
        String passw=etPssword.getText().toString();
        String fname=etFirst.getText().toString();
        String lname=etLast.getText().toString();
        if (email.length()<4 ||
                email.indexOf('@')<0||
                email.indexOf('.')<0)
        {
            etEmail.setError("Wrong Email");
            isok=false;
        }
        if (passw.length()<8)
        {
            etPssword.setError("HAVE TO BE AT LEAST * CHAR");
            isok=false;
        }
        if (isok)
        {
            creatAcount(email,passw);
        }
    }


    /**
     * create FireBase user using email and password
     * @param email user email
     * @param passw user password
     */


    private void creatAcount(String email, String passw) {
        auth.createUserWithEmailAndPassword(email,passw).addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(SignUpActivity.this, "Authentication Successful.", Toast.LENGTH_SHORT).show();
                    //updateUserProfile(task.getResult().getUser());
                    finish();
                }
                else
                {
                    Toast.makeText(SignUpActivity.this, "Authentication failed."+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();
                }
            }
        });
    }

}

