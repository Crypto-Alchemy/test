package p000;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: gz1 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final /* synthetic */ class gz1 implements Callable {

    /* renamed from: a */
    public final Context f29401a;

    /* renamed from: d */
    public final Intent f29402d;

    public gz1(Context context, Intent intent) {
        this.f29401a = context;
        this.f29402d = intent;
    }

    public Object call() {
        return Integer.valueOf(nx5.m49067b().mo46250g(this.f29401a, this.f29402d));
    }
}
