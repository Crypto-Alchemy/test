package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: gy8 */
public final class gy8 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f29398a;

    /* renamed from: d */
    public final /* synthetic */ String f29399d;

    /* renamed from: e */
    public final /* synthetic */ String f29400e;

    public gy8(SharedPreferences sharedPreferences, String str, String str2) {
        this.f29398a = sharedPreferences;
        this.f29399d = str;
        this.f29400e = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f29398a.getString(this.f29399d, this.f29400e);
    }
}
