package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: ks8 */
public final class ks8 implements Callable<Long> {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f31049a;

    /* renamed from: d */
    public final /* synthetic */ String f31050d;

    /* renamed from: e */
    public final /* synthetic */ Long f31051e;

    public ks8(SharedPreferences sharedPreferences, String str, Long l) {
        this.f31049a = sharedPreferences;
        this.f31050d = str;
        this.f31051e = l;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Long.valueOf(this.f31049a.getLong(this.f31050d, this.f31051e.longValue()));
    }
}
