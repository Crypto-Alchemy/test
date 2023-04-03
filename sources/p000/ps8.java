package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ps8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ps8 {

    /* renamed from: a */
    public final ps8 f32805a;

    /* renamed from: b */
    public final o98 f32806b;

    /* renamed from: c */
    public final Map<String, r88> f32807c = new HashMap();

    /* renamed from: d */
    public final Map<String, Boolean> f32808d = new HashMap();

    public ps8(ps8 ps8, o98 o98) {
        this.f32805a = ps8;
        this.f32806b = o98;
    }

    /* renamed from: a */
    public final r88 mo46865a(r88 r88) {
        return this.f32806b.mo46365b(this, r88);
    }

    /* renamed from: b */
    public final r88 mo46866b(k68 k68) {
        r88 r88 = r88.f33330g1;
        Iterator<Integer> s = k68.mo44681s();
        while (s.hasNext()) {
            r88 = this.f32806b.mo46365b(this, k68.mo44685w(s.next().intValue()));
            if (r88 instanceof y68) {
                break;
            }
        }
        return r88;
    }

    /* renamed from: c */
    public final ps8 mo46867c() {
        return new ps8(this, this.f32806b);
    }

    /* renamed from: d */
    public final boolean mo46868d(String str) {
        if (this.f32807c.containsKey(str)) {
            return true;
        }
        ps8 ps8 = this.f32805a;
        if (ps8 != null) {
            return ps8.mo46868d(str);
        }
        return false;
    }

    /* renamed from: e */
    public final void mo46869e(String str, r88 r88) {
        ps8 ps8;
        if (!this.f32807c.containsKey(str) && (ps8 = this.f32805a) != null && ps8.mo46868d(str)) {
            this.f32805a.mo46869e(str, r88);
        } else if (!this.f32808d.containsKey(str)) {
            if (r88 == null) {
                this.f32807c.remove(str);
            } else {
                this.f32807c.put(str, r88);
            }
        }
    }

    /* renamed from: f */
    public final void mo46870f(String str, r88 r88) {
        if (!this.f32808d.containsKey(str)) {
            if (r88 == null) {
                this.f32807c.remove(str);
            } else {
                this.f32807c.put(str, r88);
            }
        }
    }

    /* renamed from: g */
    public final void mo46871g(String str, r88 r88) {
        mo46870f(str, r88);
        this.f32808d.put(str, Boolean.TRUE);
    }

    /* renamed from: h */
    public final r88 mo46872h(String str) {
        if (this.f32807c.containsKey(str)) {
            return this.f32807c.get(str);
        }
        ps8 ps8 = this.f32805a;
        if (ps8 != null) {
            return ps8.mo46872h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }
}
