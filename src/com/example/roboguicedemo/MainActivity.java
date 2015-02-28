package com.example.roboguicedemo;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;
import android.app.NotificationManager;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.inject.Inject;

public class MainActivity extends RoboActivity {

	@InjectView(R.id.tv) TextView tv1;
	@InjectView(R.id.tv2) TextView tv2;
	@InjectView(R.id.iv1) ImageView iv2;
	
	@InjectResource(R.string.app_name) String s;
	@InjectResource(R.drawable.ic_launcher)Drawable ic;
	
	@Inject LocationManager loc;
	@Inject LayoutInflater inf;
	@Inject NotificationManager no;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv1.setText("Welocme To Bangalore");
	}

	
}
