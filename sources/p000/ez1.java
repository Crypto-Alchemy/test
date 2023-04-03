package p000;

import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, mo44877d2 = {"", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: ez1 */
/* compiled from: FastServiceLoader.kt */
public final class ez1 {

    /* renamed from: a */
    public static final boolean f37688a;

    static {
        Object obj;
        try {
            Result.C6167a aVar = Result.Companion;
            obj = Result.m75635constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.C6167a aVar2 = Result.Companion;
            obj = Result.m75635constructorimpl(hg5.m45198a(th));
        }
        f37688a = Result.m75641isSuccessimpl(obj);
    }

    /* renamed from: a */
    public static final boolean m57500a() {
        return f37688a;
    }
}
