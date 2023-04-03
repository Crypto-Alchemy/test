package p000;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000*\f\b\u0000\u0010\u0006\"\u00020\u00052\u00020\u0005¨\u0006\u0007"}, mo44877d2 = {"", "obj", "", "name", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: s73 */
/* compiled from: JvmActuals.jvm.kt */
public final class s73 {
    /* renamed from: a */
    public static final String m26717a(Object obj, String str) {
        vx2.m53591g(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        cb6 cb6 = cb6.f21669a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        vx2.m53590f(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
}
