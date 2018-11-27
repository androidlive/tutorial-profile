package com.tutorial.app.profile.appprofiletutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileDetailsActivity extends AppCompatActivity {

    public static final String KEY_USER_NAME = "key_user_name";
    public static final String KEY_USER_BIRTHDAY = "key_user_birthday";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details);

        ImageView profileImage = findViewById(R.id.profileImage);
        TextView nameOfUser = findViewById(R.id.nameOfUser);
        TextView birthdayOfUser = findViewById(R.id.birthdayOfUser);

        String selectedUserName = getIntent().getStringExtra(KEY_USER_NAME);
        String selectedUserBirthday = getIntent().getStringExtra(KEY_USER_BIRTHDAY);

        nameOfUser.setText(selectedUserName);
        birthdayOfUser.setText(selectedUserBirthday);

        if (selectedUserName.equals(getString(R.string.user_name_1))) {
            profileImage.setImageDrawable(getDrawable(R.drawable.profile_image_1));
        } else if (selectedUserName.equals(getString(R.string.user_name_2))) {
            profileImage.setImageDrawable(getDrawable(R.drawable.profile_image_2));
        } else if (selectedUserName.equals(getString(R.string.user_name_3))) {
            profileImage.setImageDrawable(getDrawable(R.drawable.profile_image_3));
        }
    }
}
