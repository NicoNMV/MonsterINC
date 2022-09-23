package com.example.monstersawiki;

import static com.example.monstersawiki.ClassLocation.latitude;
import static com.example.monstersawiki.ClassLocation.longitude;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class door extends AppCompatActivity implements  SensorEventListener {

    SensorManager sensorManager;
    Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener( this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        }

        @Override
        public void onSensorChanged(SensorEvent event) {
        float x = event.values[0],
                y = event.values[1],
                z = event.values[2];


        }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    public void buscarGPS(View v) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(door.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
                ActivityCompat.requestPermissions(door.this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
                ActivityCompat.requestPermissions(door.this, new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, 1);
                return;
            }
            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            LocationListener locationListener = new ClassLocation();
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

            if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                Uri location = Uri.parse(("https://www.google.com/maps/search/?api=1&query=" + latitude + "," + longitude));
            }
            else{}
        }

        @Override
        public void onLocationChanged(@NonNull Location location) {
        latitude = location.getLatitude();
        longitude = location.getLongitude();
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
