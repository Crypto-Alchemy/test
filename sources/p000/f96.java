package p000;

import java.util.Map;

/* renamed from: f96 */
/* compiled from: StatefulProducerRunnable */
public abstract class f96<T> extends g96<T> {

    /* renamed from: d */
    public final vq0<T> f11655d;

    /* renamed from: e */
    public final aw4 f11656e;

    /* renamed from: g */
    public final String f11657g;

    /* renamed from: k */
    public final wv4 f11658k;

    public f96(vq0<T> vq0, aw4 aw4, wv4 wv4, String str) {
        this.f11655d = vq0;
        this.f11656e = aw4;
        this.f11657g = str;
        this.f11658k = wv4;
        aw4.mo11176k(wv4, str);
    }

    /* renamed from: d */
    public void mo19821d() {
        Map<String, String> map;
        aw4 aw4 = this.f11656e;
        wv4 wv4 = this.f11658k;
        String str = this.f11657g;
        if (aw4.mo11175j(wv4, str)) {
            map = mo19823g();
        } else {
            map = null;
        }
        aw4.mo11173g(wv4, str, map);
        this.f11655d.mo27292a();
    }

    /* renamed from: e */
    public void mo19822e(Exception exc) {
        Map<String, String> map;
        aw4 aw4 = this.f11656e;
        wv4 wv4 = this.f11658k;
        String str = this.f11657g;
        if (aw4.mo11175j(wv4, str)) {
            map = mo19824h(exc);
        } else {
            map = null;
        }
        aw4.mo11172f(wv4, str, exc, map);
        this.f11655d.mo27293b(exc);
    }

    /* renamed from: f */
    public void mo19452f(T t) {
        Map<String, String> map;
        aw4 aw4 = this.f11656e;
        wv4 wv4 = this.f11658k;
        String str = this.f11657g;
        if (aw4.mo11175j(wv4, str)) {
            map = mo13408i(t);
        } else {
            map = null;
        }
        aw4.mo11170a(wv4, str, map);
        this.f11655d.mo27294c(t, 1);
    }

    /* renamed from: g */
    public Map<String, String> mo19823g() {
        return null;
    }

    /* renamed from: h */
    public Map<String, String> mo19824h(Exception exc) {
        return null;
    }

    /* renamed from: i */
    public Map<String, String> mo13408i(T t) {
        return null;
    }
}
