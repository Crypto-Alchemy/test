package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: ra9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class ra9 {

    /* renamed from: a */
    public final Unsafe f33389a;

    public ra9(Unsafe unsafe) {
        this.f33389a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo45731a(Object obj, long j, byte b);

    /* renamed from: b */
    public abstract boolean mo45732b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo45733c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract float mo45734d(Object obj, long j);

    /* renamed from: e */
    public abstract void mo45735e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract double mo45736f(Object obj, long j);

    /* renamed from: g */
    public abstract void mo45737g(Object obj, long j, double d);

    /* renamed from: h */
    public final long mo47360h(Field field) {
        return this.f33389a.objectFieldOffset(field);
    }

    /* renamed from: i */
    public final int mo47361i(Class<?> cls) {
        return this.f33389a.arrayBaseOffset(cls);
    }

    /* renamed from: j */
    public final int mo47362j(Class<?> cls) {
        return this.f33389a.arrayIndexScale(cls);
    }

    /* renamed from: k */
    public final int mo47363k(Object obj, long j) {
        return this.f33389a.getInt(obj, j);
    }

    /* renamed from: l */
    public final void mo47364l(Object obj, long j, int i) {
        this.f33389a.putInt(obj, j, i);
    }

    /* renamed from: m */
    public final long mo47365m(Object obj, long j) {
        return this.f33389a.getLong(obj, j);
    }

    /* renamed from: n */
    public final void mo47366n(Object obj, long j, long j2) {
        this.f33389a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final Object mo47367o(Object obj, long j) {
        return this.f33389a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo47368p(Object obj, long j, Object obj2) {
        this.f33389a.putObject(obj, j, obj2);
    }
}
