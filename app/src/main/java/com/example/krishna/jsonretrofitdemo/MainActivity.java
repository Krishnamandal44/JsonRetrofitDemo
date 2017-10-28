package com.example.krishna.jsonretrofitdemo;

import android.app.ActivityOptions;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.krishna.jsonretrofitdemo.RetrofitSdk.Model.Emarket;
import com.example.krishna.jsonretrofitdemo.RetrofitSdk.Responce.Example;
import com.example.krishna.jsonretrofitdemo.RetrofitSdk.RetrofitSdkClass;
import com.example.krishna.jsonretrofitdemo.RetrofitSdk.Service;
import com.example.krishna.jsonretrofitdemo.adapter.EMarketAdapter;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<Emarket> emarkets=new ArrayList<>();
    private Service service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service = new RetrofitSdkClass.Builder().build(this).getService();
        service.getExampleCall().enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
//                if(response.isSuccessful()){
//                if (dialog.isShowing()) {
//                    dialog.dismiss();
//                }
//                if (response.body().getResult().equals("success")){
//                    dashboardItems = response.body().getDashboardItems();
//                    loadRecyclerViewWithData();
//                }
//            }
//            }
//
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

        addEMarketRecyclerView();

    }
//    private void loadEMarketIconsFromServer() {
//        if (!InternetConnectionChecker.isNetworkAvailable(this)) {
//            AlertDialog alert = InternetConnectionChecker.getAlertDialog(this);
//            alert.setButton(AlertDialog.BUTTON_POSITIVE, "Retry", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    Intent intent = new Intent(SplashScreen.this, SplashScreen.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    startActivity(intent);
//                    finish();
//                }
//            });
//            alert.setButton(AlertDialog.BUTTON_NEGATIVE, "Exit", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    finish();
//                }
//            });
//            alert.show();
//        }else {
//            EMarketLoader eMarketLoader = EMarketLoader.getInstance();
//            eMarketLoader.resetList();
//            IonConnector ionConnector = IonConnector.getInstance();
//            try {
//                JsonObject result = ionConnector.getJson(this, "https://api.myjson.com/bins/vnvxd");
//                JSONObject resultJSONAsString = new JSONObject(result.toString());
//                if (resultJSONAsString.getString("result").equals("success")) {
////                JSONArray navBarJSONArray = resultJSONAsString.getJSONArray("top_nav_bar");
//                    Gson gson = new Gson();
//                    ArrayList<JsonObject> navBarJsonObjects = gson.fromJson(result.get("emarket"),
//                            new TypeToken<ArrayList<JsonObject>>() {
//                            }.getType());
//
//                    for (JsonObject navBarJsonObject : navBarJsonObjects) {
//                        JSONObject navBarJSONObject = new JSONObject(navBarJsonObject.toString());
//                        String imageUrl = navBarJSONObject.getString("image_url");
//                        String title = navBarJSONObject.getString("title");
//                        String id = navBarJSONObject.getString("id");
////                        GlideConnector.getInstance().imageDownloadOnly(getApplicationContext(), imageUrl);
//                        eMarketLoader.addEMarketPojoToEMarketPojoList(id, title, imageUrl);
//                    }
//                }
//            } catch (ExecutionException | InterruptedException | JSONException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    private void addEMarketRecyclerView(){
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.e_market_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
//        String[] eMarketChildName = getResources().getStringArray(R.array.e_market_category);
//        int titlesArrayLength = eMarketChildName.length;
//        for (int i = 0; i<titlesArrayLength; i++){
//            eMarketRecyclerPojo = new TopRecyclerPojo(""+i, eMarketChildName[i], eMarketChildImages[i]);
//            eMarketRecyclerPojoList.add(eMarketRecyclerPojo);
//        }



        EMarketAdapter adapter = new EMarketAdapter(emarkets, getApplicationContext());
        recyclerView.setAdapter(adapter);

    }
}
