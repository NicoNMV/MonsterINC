package com.example.monstersawiki;

import static com.example.monstersawiki.ClassLocation.latitude;
import static com.example.monstersawiki.ClassLocation.longitude;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class door extends AppCompatActivity implements  SensorEventListener {

    RadioButton rd1,rd2,rd3;

    SensorManager sensorManager;
    Sensor sensor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);

        getSupportActionBar().hide();

        rd1 = findViewById(R.id.rdbDoor1);
        rd2 = findViewById(R.id.rdbDoor2);
        rd3 = findViewById(R.id.rdbDoor3);
        

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener( this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)   != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(door.this, new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, 1);
            ActivityCompat.requestPermissions(door.this, new String[] {Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
            ActivityCompat.requestPermissions(door.this, new String[] {Manifest.permission.ACCESS_NETWORK_STATE}, 1);
        }
        LocationManager  locationManager  = (LocationManager) getSystemService(LOCATION_SERVICE);
        LocationListener locationListener = new local();
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            double latitude = local.latitude;
            double longitude = local.longitude;
        }
    }

    public void onSensorChanged(SensorEvent event){

        float direção = event.values[0];

        if(rd1.isChecked() == true && direção < -7){
            Uri uri = Uri.parse("https://goo.gl/maps/FfGhsWWbtM9SJiAM9");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else if(rd2.isChecked() == true && direção < -7){
            Uri uri = Uri.parse("https://goo.gl/maps/G9JxDatLG8TtUXds8");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else if(rd3.isChecked() == true && direção < -7){
            Uri uri = Uri.parse("https://goo.gl/maps/8YTGewccjgA8SGFV8");
            Intent it = new Intent(Intent.ACTION_VIEW,uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
        else{
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    public void openID(View view) {
        Intent intent = new Intent(this, menuID.class);
        startActivity(intent);
    }

    public void openCharacter(View view) {
        Intent intent = new Intent(this, character.class);
        startActivity(intent);
    }

    public void openStory(View view) {
        Intent intent = new Intent(this, story.class);
        startActivity(intent);
    }

    public void openDoor(View view) {
        Intent intent = new Intent(this, door.class);
        startActivity(intent);
    }

    public void openUniversity(View view) {
        Intent intent = new Intent(this, university.class);
        startActivity(intent);
    }

    public void openHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
