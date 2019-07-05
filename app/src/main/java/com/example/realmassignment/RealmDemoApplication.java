package com.example.realmassignment;

import android.app.Application;

import io.realm.Realm;

public class RealmDemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }

}
