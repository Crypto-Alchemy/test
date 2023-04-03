package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p000.tn2;

/* renamed from: ry0 */
/* compiled from: CustomTabsServiceConnection */
public abstract class ry0 implements ServiceConnection {

    /* renamed from: a */
    public Context f17388a;

    /* renamed from: ry0$a */
    /* compiled from: CustomTabsServiceConnection */
    public class C3230a extends oy0 {
        public C3230a(tn2 tn2, ComponentName componentName, Context context) {
            super(tn2, componentName, context);
        }
    }

    /* renamed from: a */
    public abstract void mo25559a(ComponentName componentName, oy0 oy0);

    /* renamed from: b */
    public void mo25560b(Context context) {
        this.f17388a = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f17388a != null) {
            mo25559a(componentName, new C3230a(tn2.C3377a.m27849E0(iBinder), componentName, this.f17388a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
