package com.androidmani.daggerretrofitex.view.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.androidmani.daggerretrofitex.AppController;
import com.androidmani.daggerretrofitex.R;
import com.androidmani.daggerretrofitex.interfaces.RetrofitApiService;
import com.androidmani.daggerretrofitex.model.User;
import com.androidmani.daggerretrofitex.model.UsersModel;
import com.androidmani.daggerretrofitex.utils.Utilities;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView tvUserResult;

    @Inject
    Utilities utilities;

    @Inject
    RetrofitApiService retrofitApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize the injection
        AppController.getAppComponent().inject(this);

        initView();
        checkInternet();
    }

    private void initView()
    {
        tvUserResult = findViewById(R.id.tv_result);
    }

    private void checkInternet() {
        if (utilities.isNetworkConnected()) {
            Toast.makeText(this, "Internet connected", Toast.LENGTH_SHORT).show();
            getAllUser();
        } else {
            Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show();
        }
    }

    private void getAllUser() {

        retrofitApiService.getAllUser().enqueue(new Callback<UsersModel>() {
            @Override
            public void onResponse(Call<UsersModel> call, Response<UsersModel> response) {
                if (response.isSuccessful()) {
                    List<User> userList = response.body().getData();
                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < userList.size(); i++) {
                        User user = userList.get(i);
                        sb.append("\nFirstName : "+user.getFirst_name());
                        sb.append("\nLastName : "+user.getLast_name());
                        sb.append("\nEmail : "+user.getEmail());
                        sb.append("\n");
                        Log.e(TAG, "onResponse: " + userList.get(i).getFirst_name());
                    }
                    tvUserResult.setText(sb.toString());
                }
            }
            @Override
            public void onFailure(Call<UsersModel> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());

            }
        });
    }
}
