package com.example.asistenciasuni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class Login extends AppCompatActivity {
    Animation btnAn;
    RadioButton r1,r2;
    Button btnIngresar;
    EditText email,pass;
    ImageView uni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.txtCorreo);
        pass=findViewById(R.id.txtContra);
        btnAn= AnimationUtils.loadAnimation(this, R.anim.bottom);
        btnIngresar=findViewById(R.id.BtnIngresar);
        r2=findViewById(R.id.radioButton);
        r1=findViewById(R.id.radioButton2);
        uni=findViewById(R.id.imageView);
        btnIngresar.setAnimation(btnAn);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(validar()&&r1.isChecked()){
                        if(r1.isChecked()||r2.isChecked()) {
                        Intent i=new Intent(Login.this,Entrar.class);
                        startActivity(i);}
                    }
                    if(validar()&&r2.isChecked()){
                        if(r1.isChecked()||r2.isChecked()) {
                        Intent i2=new Intent(Login.this,profesor.class);
                        startActivity(i2);}
                }

            }
        });
    }

    public boolean validar()
    {
        boolean retornar=true;
        String n1=email.getText().toString(), n2 =pass.getText().toString();
        if(n1.isEmpty())
        {
            email.setError("Este campo 1 no puede quedar vacio");
            retornar=false;
        }
        if(n2.isEmpty())
        {
            pass.setError("El campo 2 no puede quedar vacio");
            retornar=false;
        }
        return retornar;
    }
}