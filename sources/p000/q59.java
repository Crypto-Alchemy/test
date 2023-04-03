package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q59 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class q59 {

    /* renamed from: a */
    public or8 f32943a;

    /* renamed from: b */
    public List<Long> f32944b;

    /* renamed from: c */
    public List<wq8> f32945c;

    /* renamed from: d */
    public long f32946d;

    /* renamed from: e */
    public final /* synthetic */ s59 f32947e;

    public /* synthetic */ q59(s59 s59, z49 z49) {
        this.f32947e = s59;
    }

    /* renamed from: b */
    public static final long m50343b(wq8 wq8) {
        return ((wq8.mo49249D() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo46973a(long j, wq8 wq8) {
        cu4.m43221k(wq8);
        if (this.f32945c == null) {
            this.f32945c = new ArrayList();
        }
        if (this.f32944b == null) {
            this.f32944b = new ArrayList();
        }
        if (this.f32945c.size() > 0 && m50343b(this.f32945c.get(0)) != m50343b(wq8)) {
            return false;
        }
        long g = this.f32946d + ((long) wq8.mo47346g());
        this.f32947e.mo47648S();
        if (g >= ((long) Math.max(0, rl8.f33502j.mo48412b(null).intValue()))) {
            return false;
        }
        this.f32946d = g;
        this.f32945c.add(wq8);
        this.f32944b.add(Long.valueOf(j));
        int size = this.f32945c.size();
        this.f32947e.mo47648S();
        if (size >= Math.max(1, rl8.f33504k.mo48412b(null).intValue())) {
            return false;
        }
        return true;
    }
}
