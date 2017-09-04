package zhou.com.recordwalk.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by zhou on 2017/9/1.
 */

public class Receiver1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v("xf","receiver1 onReceive");
    }
}