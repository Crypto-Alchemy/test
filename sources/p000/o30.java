package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o30 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class o30 implements ServiceConnection {

    /* renamed from: a */
    public boolean f32270a = false;

    /* renamed from: d */
    public final BlockingQueue f32271d = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo46304a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        cu4.m43220j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f32270a) {
            this.f32270a = true;
            IBinder iBinder = (IBinder) this.f32271d.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f32271d.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
