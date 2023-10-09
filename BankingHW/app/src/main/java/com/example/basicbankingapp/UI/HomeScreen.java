package com.example.basicbankingapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.basicbankingapp.R;

public class HomeScreen extends AppCompatActivity {

    Animation anim;
    ImageView bankLogo;
    TextView tvBankTitle;
    Button btnAllUsers, btnAllTransactions, btnLogout; // Menambahkan tombol logout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        anim = AnimationUtils.loadAnimation(this, R.anim.animation);
        bankLogo = findViewById(R.id.bank_logo);
        btnAllUsers = findViewById(R.id.all_users);
        btnAllTransactions = findViewById(R.id.all_transactions);
        tvBankTitle = findViewById(R.id.bank_title);
        btnLogout = findViewById(R.id.btnLogout); // Menghubungkan tombol logout

        bankLogo.setAnimation(anim);
        tvBankTitle.setAnimation(anim);
        btnAllUsers.setAnimation(anim);
        btnAllTransactions.setAnimation(anim);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tambahkan kode logout di sini
                // Misalnya, Anda dapat mengarahkan pengguna ke layar login
                // atau melakukan tindakan logout sesuai kebutuhan Anda.
                performLogout();
            }
        });
    }

    private void performLogout() {
        // Tambahkan kode logout sesuai kebutuhan Anda di sini.
        // Misalnya, Anda dapat menghapus token otentikasi, membersihkan sesi, dll.

        // Setelah logout, Anda dapat mengarahkan pengguna ke layar login atau tindakan lainnya.
        Intent intent = new Intent(this, LoginActivity.class); // Ganti LoginActivity dengan kelas layar login Anda
        startActivity(intent);
        // JANGAN memanggil finish() di sini agar aplikasi tidak keluar setelah logout.
    }



    public void showAllUsers(View view) {
        Intent intent = new Intent(this, UsersList.class);
        startActivity(intent);
    }

    public void showAllTransactions(View view) {
        Intent intent = new Intent(this, TransactionHistory.class);
        startActivity(intent);
    }
}
