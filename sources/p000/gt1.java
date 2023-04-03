package p000;

import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: gt1 */
/* compiled from: Event */
public abstract class gt1<T> {
    /* renamed from: d */
    public static <T> gt1<T> m44893d(T t) {
        return new C3824av((Integer) null, t, Priority.VERY_LOW);
    }

    /* renamed from: e */
    public static <T> gt1<T> m44894e(T t) {
        return new C3824av((Integer) null, t, Priority.HIGHEST);
    }

    /* renamed from: a */
    public abstract Integer mo29135a();

    /* renamed from: b */
    public abstract T mo29136b();

    /* renamed from: c */
    public abstract Priority mo29137c();
}
