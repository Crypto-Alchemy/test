package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: oz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class oz7 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f32524a;

    public /* synthetic */ oz7(Handler handler) {
        this.f32524a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f32524a.post(runnable);
    }
}
