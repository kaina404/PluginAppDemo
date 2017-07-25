package xu.otherapk;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import xu.plugin.PluginInterface;

/**
 * Created by lovexujh on 2017/7/25
 */

public class BaseActivity extends FragmentActivity implements PluginInterface {

    protected FragmentActivity thisContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {

    }

    @Override
    public void setContentView(int layoutResID) {
        thisContext.setContentView(layoutResID);
    }

    @Override
    public void setContentView(View view) {
        thisContext.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        thisContext.setContentView(view, params);
    }

    @Override
    public LayoutInflater getLayoutInflater() {
        return thisContext.getLayoutInflater();
    }

    @Override
    public Window getWindow() {
        return thisContext.getWindow();
    }

    @Override
    public View findViewById(int id) {
        return thisContext.findViewById(id);
    }

    @Override
    public void attachContext(FragmentActivity context) {
        thisContext = context;
    }

    @Override
    public ClassLoader getClassLoader() {
        return thisContext.getClassLoader();
    }

    @Override
    public WindowManager getWindowManager() {
        return thisContext.getWindowManager();
    }


    @Override
    public ApplicationInfo getApplicationInfo() {
        return thisContext.getApplicationInfo();
    }

    @Override
    public void finish() {
        thisContext.finish();
    }


    public void onStart() {

    }

    public void onResume() {

    }

    @Override
    public void onRestart() {

    }

    public void onPause() {

    }

    public void onStop() {

    }

    public void onDestroy() {

    }

    public void onSaveInstanceState(Bundle outState) {

    }

    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public void onBackPressed() {
        thisContext.onBackPressed();
    }

    @Override
    public void startActivity(Intent intent) {
        thisContext.startActivity(intent);
    }


}
