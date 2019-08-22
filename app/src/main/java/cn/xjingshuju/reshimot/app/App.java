package cn.xjingshuju.reshimot.app;

import android.app.Activity;
import android.app.Application;

import java.util.HashSet;

public class App extends Application {
    private static App instance;
    private HashSet<Activity> activities;

    public static synchronized App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public void addActivity(Activity activity) {
        if (activities == null) {
            activities = new HashSet<>();
        }
        activities.add(activity);
    }

    public void removeActivity(Activity activity) {
        if (activities != null) {
            activities.remove(activity);
        }
    }

    public void exitApp() {
        if (activities != null) {
            for (Activity activity : activities) {
                activity.finish();
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
