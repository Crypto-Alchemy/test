package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: w71 */
/* compiled from: DefaultEncodedMemoryCacheParamsSupplier */
public class w71 implements td6<zs3> {

    /* renamed from: a */
    public static final long f19036a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a */
    public zs3 get() {
        int b = mo27455b();
        return new zs3(b, Integer.MAX_VALUE, b, Integer.MAX_VALUE, b / 8, f19036a);
    }

    /* renamed from: b */
    public final int mo27455b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        if (min < 33554432) {
            return 2097152;
        }
        return 4194304;
    }
}
