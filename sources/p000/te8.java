package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: te8 */
public final class te8 implements Callable<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f34250a;

    /* renamed from: d */
    public final /* synthetic */ String f34251d;

    /* renamed from: e */
    public final /* synthetic */ Boolean f34252e;

    public te8(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f34250a = sharedPreferences;
        this.f34251d = str;
        this.f34252e = bool;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf(this.f34250a.getBoolean(this.f34251d, this.f34252e.booleanValue()));
    }
}
