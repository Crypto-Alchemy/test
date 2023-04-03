package p000;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ww5 */
/* compiled from: SerializerCache */
public final class ww5 {

    /* renamed from: a */
    public final HashMap<u07, y63<Object>> f19242a = new HashMap<>(64);

    /* renamed from: b */
    public final AtomicReference<m75> f19243b = new AtomicReference<>();

    /* renamed from: a */
    public final synchronized m75 mo27602a() {
        m75 m75;
        m75 = this.f19243b.get();
        if (m75 == null) {
            m75 = m75.m22060b(this.f19242a);
            this.f19243b.set(m75);
        }
        return m75;
    }

    /* renamed from: b */
    public void mo27603b(JavaType javaType, y63<Object> y63, zw5 zw5) throws JsonMappingException {
        synchronized (this) {
            if (this.f19242a.put(new u07(javaType, false), y63) == null) {
                this.f19243b.set((Object) null);
            }
            if (y63 instanceof ye5) {
                ((ye5) y63).resolve(zw5);
            }
        }
    }

    /* renamed from: c */
    public void mo27604c(Class<?> cls, JavaType javaType, y63<Object> y63, zw5 zw5) throws JsonMappingException {
        synchronized (this) {
            y63<Object> put = this.f19242a.put(new u07(cls, false), y63);
            y63<Object> put2 = this.f19242a.put(new u07(javaType, false), y63);
            if (put == null || put2 == null) {
                this.f19243b.set((Object) null);
            }
            if (y63 instanceof ye5) {
                ((ye5) y63).resolve(zw5);
            }
        }
    }

    /* renamed from: d */
    public void mo27605d(JavaType javaType, y63<Object> y63) {
        synchronized (this) {
            if (this.f19242a.put(new u07(javaType, true), y63) == null) {
                this.f19243b.set((Object) null);
            }
        }
    }

    /* renamed from: e */
    public void mo27606e(Class<?> cls, y63<Object> y63) {
        synchronized (this) {
            if (this.f19242a.put(new u07(cls, true), y63) == null) {
                this.f19243b.set((Object) null);
            }
        }
    }

    /* renamed from: f */
    public synchronized void mo27607f() {
        this.f19242a.clear();
    }

    /* renamed from: g */
    public m75 mo27608g() {
        m75 m75 = this.f19243b.get();
        if (m75 != null) {
            return m75;
        }
        return mo27602a();
    }

    /* renamed from: h */
    public synchronized int mo27609h() {
        return this.f19242a.size();
    }

    /* renamed from: i */
    public y63<Object> mo27610i(JavaType javaType) {
        y63<Object> y63;
        synchronized (this) {
            y63 = this.f19242a.get(new u07(javaType, true));
        }
        return y63;
    }

    /* renamed from: j */
    public y63<Object> mo27611j(Class<?> cls) {
        y63<Object> y63;
        synchronized (this) {
            y63 = this.f19242a.get(new u07(cls, true));
        }
        return y63;
    }

    /* renamed from: k */
    public y63<Object> mo27612k(JavaType javaType) {
        y63<Object> y63;
        synchronized (this) {
            y63 = this.f19242a.get(new u07(javaType, false));
        }
        return y63;
    }

    /* renamed from: l */
    public y63<Object> mo27613l(Class<?> cls) {
        y63<Object> y63;
        synchronized (this) {
            y63 = this.f19242a.get(new u07(cls, false));
        }
        return y63;
    }
}
