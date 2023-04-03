package com.facebook.common.references;

import android.graphics.Bitmap;
import java.util.IdentityHashMap;
import java.util.Map;

public class SharedReference<T> {

    /* renamed from: d */
    public static final Map<Object, Integer> f9481d = new IdentityHashMap();

    /* renamed from: a */
    public T f9482a;

    /* renamed from: b */
    public int f9483b = 1;

    /* renamed from: c */
    public final rf5<T> f9484c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t, rf5<T> rf5) {
        this.f9482a = au4.m10792g(t);
        this.f9484c = (rf5) au4.m10792g(rf5);
        m13312a(t);
    }

    /* renamed from: a */
    public static void m13312a(Object obj) {
        if (!nh0.m23174I() || (!(obj instanceof Bitmap) && !(obj instanceof hl2))) {
            Map<Object, Integer> map = f9481d;
            synchronized (map) {
                Integer num = map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m13313h(SharedReference<?> sharedReference) {
        if (sharedReference == null || !sharedReference.mo13175g()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static void m13314i(Object obj) {
        Map<Object, Integer> map = f9481d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                oy1.m24439z("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo13170b() {
        mo13173e();
        this.f9483b++;
    }

    /* renamed from: c */
    public final synchronized int mo13171c() {
        boolean z;
        int i;
        mo13173e();
        if (this.f9483b > 0) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        i = this.f9483b - 1;
        this.f9483b = i;
        return i;
    }

    /* renamed from: d */
    public void mo13172d() {
        T t;
        if (mo13171c() == 0) {
            synchronized (this) {
                t = this.f9482a;
                this.f9482a = null;
            }
            if (t != null) {
                this.f9484c.mo360a(t);
                m13314i(t);
            }
        }
    }

    /* renamed from: e */
    public final void mo13173e() {
        if (!m13313h(this)) {
            throw new NullReferenceException();
        }
    }

    /* renamed from: f */
    public synchronized T mo13174f() {
        return this.f9482a;
    }

    /* renamed from: g */
    public synchronized boolean mo13175g() {
        boolean z;
        if (this.f9483b > 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
