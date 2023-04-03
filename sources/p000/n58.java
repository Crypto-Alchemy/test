package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: n58 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class n58 {

    /* renamed from: a */
    public h58 f31971a;

    /* renamed from: b */
    public h58 f31972b;

    /* renamed from: c */
    public final List<h58> f31973c;

    public n58() {
        this.f31971a = new h58("", 0, (Map<String, Object>) null);
        this.f31972b = new h58("", 0, (Map<String, Object>) null);
        this.f31973c = new ArrayList();
    }

    /* renamed from: a */
    public final h58 mo45970a() {
        return this.f31971a;
    }

    /* renamed from: b */
    public final void mo45971b(h58 h58) {
        this.f31971a = h58;
        this.f31972b = h58.clone();
        this.f31973c.clear();
    }

    /* renamed from: c */
    public final h58 mo45972c() {
        return this.f31972b;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        n58 n58 = new n58(this.f31971a.clone());
        for (h58 g : this.f31973c) {
            n58.f31973c.add(g.clone());
        }
        return n58;
    }

    /* renamed from: d */
    public final void mo45974d(h58 h58) {
        this.f31972b = h58;
    }

    /* renamed from: e */
    public final void mo45975e(String str, long j, Map<String, Object> map) {
        this.f31973c.add(new h58(str, j, map));
    }

    /* renamed from: f */
    public final List<h58> mo45976f() {
        return this.f31973c;
    }

    public n58(h58 h58) {
        this.f31971a = h58;
        this.f31972b = h58.clone();
        this.f31973c = new ArrayList();
    }
}
