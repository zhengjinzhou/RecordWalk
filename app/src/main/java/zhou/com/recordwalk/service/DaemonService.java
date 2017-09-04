package zhou.com.recordwalk.service;

/**
 * Created by zhou on 2017/9/1.
 */

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * DO NOT do anything in this Service!<br/>
 *
 * Created by Mars on 12/24/15.
 */
public class DaemonService extends Service{

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return Service.START_NOT_STICKY;
    }
}