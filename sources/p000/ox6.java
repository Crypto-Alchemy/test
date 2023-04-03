package p000;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* renamed from: ox6 */
/* compiled from: TransportRuntime */
public class ox6 implements mx6 {

    /* renamed from: e */
    public static volatile px6 f32492e;

    /* renamed from: a */
    public final ah0 f32493a;

    /* renamed from: b */
    public final ah0 f32494b;

    /* renamed from: c */
    public final mm5 f32495c;

    /* renamed from: d */
    public final d57 f32496d;

    public ox6(ah0 ah0, ah0 ah02, mm5 mm5, d57 d57, km7 km7) {
        this.f32493a = ah0;
        this.f32494b = ah02;
        this.f32495c = mm5;
        this.f32496d = d57;
        km7.mo44843c();
    }

    /* renamed from: c */
    public static ox6 m49599c() {
        px6 px6 = f32492e;
        if (px6 != null) {
            return px6.mo29836b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set<qp1> m49600d(de1 de1) {
        if (de1 instanceof fp1) {
            return Collections.unmodifiableSet(((fp1) de1).mo42641a());
        }
        return Collections.singleton(qp1.m50725b("proto"));
    }

    /* renamed from: f */
    public static void m49601f(Context context) {
        if (f32492e == null) {
            synchronized (ox6.class) {
                if (f32492e == null) {
                    f32492e = c11.m32811c().mo29838a(context).build();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo45920a(ru5 ru5, rx6 rx6) {
        this.f32495c.mo45819a(ru5.mo44607f().mo43419e(ru5.mo44604c().mo29137c()), mo46561b(ru5), rx6);
    }

    /* renamed from: b */
    public final mt1 mo46561b(ru5 ru5) {
        return mt1.m48451a().mo29766i(this.f32493a.mo28970a()).mo29768k(this.f32494b.mo28970a()).mo29767j(ru5.mo44608g()).mo29765h(new jp1(ru5.mo44603b(), ru5.mo47506d())).mo29764g(ru5.mo44604c().mo29135a()).mo29761d();
    }

    /* renamed from: e */
    public d57 mo46562e() {
        return this.f32496d;
    }

    /* renamed from: g */
    public ix6 mo46563g(de1 de1) {
        return new jx6(m49600d(de1), hx6.m45404a().mo43422b(de1.getName()).mo43423c(de1.getExtras()).mo43421a(), this);
    }
}
