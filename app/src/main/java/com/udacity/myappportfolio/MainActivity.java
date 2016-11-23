package com.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.popular_movies_button,
            R.id.stock_hawk_button,
            R.id.build_it_bigger_button,
            R.id.make_your_app_material_button,
            R.id.go_ubiquitous_button,
            R.id.mt_own_app_button})
    public void onClick(View view) {
        String message = getString(R.string.button_click_base_message);
        switch (view.getId()) {
            case R.id.popular_movies_button:
                message += " " + getString(R.string.popular_movies);
                break;
            case R.id.stock_hawk_button:
                message += " " + getString(R.string.stock_hawk);
                break;
            case R.id.build_it_bigger_button:
                message += " " + getString(R.string.build_it_bigger);
                break;
            case R.id.make_your_app_material_button:
                message += " " + getString(R.string.make_your_app_material);
                break;
            case R.id.go_ubiquitous_button:
                message += " " + getString(R.string.go_ubiquitous);
                break;
            case R.id.mt_own_app_button:
                message += " " + getString(R.string.capstone_my_own_app);
                break;
        }
        Toast.makeText(this, message + " project", Toast.LENGTH_SHORT).show();
    }
}
