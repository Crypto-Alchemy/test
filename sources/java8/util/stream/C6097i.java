package java8.util.stream;

import java.util.Collection;
import java8.util.stream.C6088g;

/* renamed from: java8.util.stream.i */
/* compiled from: StreamSupport */
public final class C6097i {
    /* renamed from: a */
    public static <T> ha6<T> m46412a(z66<T> z66, boolean z) {
        kf4.m47057e(z66);
        return new C6088g.C6093c(z66, StreamOpFlag.fromCharacteristics((z66<?>) z66), z);
    }

    /* renamed from: b */
    public static <T> ha6<T> m46413b(Collection<? extends T> collection) {
        return m46412a(b76.m32390v(collection), false);
    }
}
