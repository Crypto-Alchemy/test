package p000;

import android.content.Context;

/* renamed from: gn5 */
/* compiled from: SchemaManager_Factory */
public final class gn5 implements sy1<fn5> {

    /* renamed from: a */
    public final ky4<Context> f29293a;

    /* renamed from: b */
    public final ky4<String> f29294b;

    /* renamed from: c */
    public final ky4<Integer> f29295c;

    public gn5(ky4<Context> ky4, ky4<String> ky42, ky4<Integer> ky43) {
        this.f29293a = ky4;
        this.f29294b = ky42;
        this.f29295c = ky43;
    }

    /* renamed from: a */
    public static gn5 m44791a(ky4<Context> ky4, ky4<String> ky42, ky4<Integer> ky43) {
        return new gn5(ky4, ky42, ky43);
    }

    /* renamed from: c */
    public static fn5 m44792c(Context context, String str, int i) {
        return new fn5(context, str, i);
    }

    /* renamed from: b */
    public fn5 get() {
        return m44792c(this.f29293a.get(), this.f29294b.get(), this.f29295c.get().intValue());
    }
}
