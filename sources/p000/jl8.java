package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: jl8 */
public final class jl8 implements Callable<Integer> {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f30523a;

    /* renamed from: d */
    public final /* synthetic */ String f30524d;

    /* renamed from: e */
    public final /* synthetic */ Integer f30525e;

    public jl8(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f30523a = sharedPreferences;
        this.f30524d = str;
        this.f30525e = num;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Integer.valueOf(this.f30523a.getInt(this.f30524d, this.f30525e.intValue()));
    }
}
