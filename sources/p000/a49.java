package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: a49 */
public final class a49 implements Callable<SharedPreferences> {

    /* renamed from: a */
    public final /* synthetic */ Context f20814a;

    public a49(Context context) {
        this.f20814a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f20814a.getSharedPreferences("google_sdk_flags", 0);
    }
}
