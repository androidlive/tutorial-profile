package com.tutorial.app.profile.appprofiletutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_list);
    }

    public void clickedOnPera(View view) {
        goToProfieActivity(getString(R.string.user_name_1), getString(R.string.user_birthday_1));
    }

    public void clickedOnSava(View view) {
        goToProfieActivity(getString(R.string.user_name_2), getString(R.string.user_birthday_2));
    }

    public void clickedOnJovan(View view) {
        goToProfieActivity(getString(R.string.user_name_3), getString(R.string.user_birthday_3));
    }

    public void goToProfieActivity(String name, String birthday) {
        Intent intent = new Intent(this, ProfileDetailsActivity.class);
        intent.putExtra(ProfileDetailsActivity.KEY_USER_NAME, name);
        intent.putExtra(ProfileDetailsActivity.KEY_USER_BIRTHDAY, birthday);
        startActivity(intent);
    }
}
