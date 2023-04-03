package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: q61 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q61 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f16818a;

    public /* synthetic */ q61(Handler handler) {
        this.f16818a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f16818a.post(runnable);
    }
}
