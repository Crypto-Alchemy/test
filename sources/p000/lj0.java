package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: lj0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class lj0 {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m47827a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m47828b(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m47829c(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m47827a();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return m47828b(tArr[0]);
    }
}
