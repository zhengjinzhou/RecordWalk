package zhou.com.recordwalk.receiver;

/**
 * Created by zhou on 2017/9/1.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * DO NOT do anything in this Receiver!<br/>
 *
 * Created by Mars on 12/24/15.
 */
public class Receiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v("xf","receiver2 onReceive");
    }
}