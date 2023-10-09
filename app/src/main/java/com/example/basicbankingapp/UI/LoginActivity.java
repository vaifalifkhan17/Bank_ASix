package com.example.basicbankingapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.basicbankingapp.R;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Anda dapat menambahkan logika otentikasi di sini.
                // Contoh sederhana: periksa username dan password,
                // jika benar, arahkan ke layar utama, jika salah, tampilkan pesan kesalahan.

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (isValidCredentials(username, password)) {
                    // Otentikasi berhasil, arahkan ke layar utama (HomeScreen).
                    Intent intent = new Intent(LoginActivity.this, HomeScreen.class);
                    startActivity(intent);
                    finish(); // Tutup layar login.
                } else {
                    // Otentikasi gagal, tampilkan pesan kesalahan.
                    Toast.makeText(LoginActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Contoh fungsi untuk memeriksa otentikasi sederhana.
    private boolean isValidCredentials(String username, String password) {
        // Di sini Anda dapat menambahkan logika otentikasi sesuai kebutuhan Anda.
        // Misalnya, memeriksa username dan password di database, server, atau penyimpanan lokal.
        // Untuk contoh ini, kita hanya memeriksa jika username dan password sama dengan "admin".

        return username.equals("admin") && password.equals("admin");
    }
}
