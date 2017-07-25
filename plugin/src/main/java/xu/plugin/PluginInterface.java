package xu.plugin;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by lovexujh on 2017/7/25
 */

public interface PluginInterface {
    void onCreate(Bundle saveInstance);
    void attachContext(FragmentActivity context);

    void onStart();

    void onResume();

    void onRestart();

    void onDestroy();

    void onStop();

    void onPause();
}
