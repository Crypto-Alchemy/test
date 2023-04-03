package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: er7 */
public final class er7 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ gr7 f28648a;

    public /* synthetic */ er7(gr7 gr7) {
        this.f28648a = gr7;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f28648a.f29327b.mo46855d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f28648a.mo42956r(new ar7(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f28648a.f29327b.mo46855d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f28648a.mo42956r(new cr7(this));
    }
}
