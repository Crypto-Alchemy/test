package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.ek7;
import p000.nu0;
import p000.or2;
import p000.ys3;

/* renamed from: mr2 */
/* compiled from: ImagePipelineConfig */
public class mr2 implements nr2 {

    /* renamed from: J */
    public static C2850c f15152J = new C2850c((C2848a) null);

    /* renamed from: A */
    public final vg1 f15153A;

    /* renamed from: B */
    public final or2 f15154B;

    /* renamed from: C */
    public final boolean f15155C;

    /* renamed from: D */
    public final v90 f15156D;

    /* renamed from: E */
    public final ph0 f15157E;

    /* renamed from: F */
    public final ys3<f80, kh0> f15158F;

    /* renamed from: G */
    public final ys3<f80, PooledByteBuffer> f15159G;

    /* renamed from: H */
    public final ow5 f15160H;

    /* renamed from: I */
    public final m20 f15161I;

    /* renamed from: a */
    public final Bitmap.Config f15162a;

    /* renamed from: b */
    public final td6<zs3> f15163b;

    /* renamed from: c */
    public final ys3.C3691a f15164c;

    /* renamed from: d */
    public final nu0.C2921b<f80> f15165d;

    /* renamed from: e */
    public final g80 f15166e;

    /* renamed from: f */
    public final Context f15167f;

    /* renamed from: g */
    public final boolean f15168g;

    /* renamed from: h */
    public final o02 f15169h;

    /* renamed from: i */
    public final td6<zs3> f15170i;

    /* renamed from: j */
    public final yu1 f15171j;

    /* renamed from: k */
    public final kq2 f15172k;

    /* renamed from: l */
    public final nq2 f15173l;

    /* renamed from: m */
    public final zr2 f15174m;

    /* renamed from: n */
    public final Integer f15175n;

    /* renamed from: o */
    public final td6<Boolean> f15176o;

    /* renamed from: p */
    public final vg1 f15177p;

    /* renamed from: q */
    public final ht3 f15178q;

    /* renamed from: r */
    public final int f15179r;

    /* renamed from: s */
    public final q54 f15180s;

    /* renamed from: t */
    public final int f15181t;

    /* renamed from: u */
    public final xo4 f15182u;

    /* renamed from: v */
    public final ls4 f15183v;

    /* renamed from: w */
    public final qw4 f15184w;

    /* renamed from: x */
    public final Set<je5> f15185x;

    /* renamed from: y */
    public final Set<ke5> f15186y;

    /* renamed from: z */
    public final boolean f15187z;

    /* renamed from: mr2$a */
    /* compiled from: ImagePipelineConfig */
    public class C2848a implements td6<Boolean> {
        public C2848a() {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: mr2$b */
    /* compiled from: ImagePipelineConfig */
    public static class C2849b {

        /* renamed from: A */
        public int f15189A;

        /* renamed from: B */
        public final or2.C2984b f15190B;

        /* renamed from: C */
        public boolean f15191C;

        /* renamed from: D */
        public v90 f15192D;

        /* renamed from: E */
        public ph0 f15193E;

        /* renamed from: F */
        public ys3<f80, kh0> f15194F;

        /* renamed from: G */
        public ys3<f80, PooledByteBuffer> f15195G;

        /* renamed from: H */
        public ow5 f15196H;

        /* renamed from: I */
        public m20 f15197I;

        /* renamed from: a */
        public Bitmap.Config f15198a;

        /* renamed from: b */
        public td6<zs3> f15199b;

        /* renamed from: c */
        public nu0.C2921b<f80> f15200c;

        /* renamed from: d */
        public ys3.C3691a f15201d;

        /* renamed from: e */
        public g80 f15202e;

        /* renamed from: f */
        public final Context f15203f;

        /* renamed from: g */
        public boolean f15204g;

        /* renamed from: h */
        public td6<zs3> f15205h;

        /* renamed from: i */
        public yu1 f15206i;

        /* renamed from: j */
        public kq2 f15207j;

        /* renamed from: k */
        public nq2 f15208k;

        /* renamed from: l */
        public zr2 f15209l;

        /* renamed from: m */
        public Integer f15210m;

        /* renamed from: n */
        public td6<Boolean> f15211n;

        /* renamed from: o */
        public vg1 f15212o;

        /* renamed from: p */
        public ht3 f15213p;

        /* renamed from: q */
        public Integer f15214q;

        /* renamed from: r */
        public q54 f15215r;

        /* renamed from: s */
        public xo4 f15216s;

        /* renamed from: t */
        public ls4 f15217t;

        /* renamed from: u */
        public qw4 f15218u;

        /* renamed from: v */
        public Set<je5> f15219v;

        /* renamed from: w */
        public Set<ke5> f15220w;

        /* renamed from: x */
        public boolean f15221x;

        /* renamed from: y */
        public vg1 f15222y;

        /* renamed from: z */
        public o02 f15223z;

        public /* synthetic */ C2849b(Context context, C2848a aVar) {
            this(context);
        }

        /* renamed from: K */
        public mr2 mo23352K() {
            return new mr2(this, (C2848a) null);
        }

        public C2849b(Context context) {
            this.f15204g = false;
            this.f15210m = null;
            this.f15214q = null;
            this.f15221x = true;
            this.f15189A = -1;
            this.f15190B = new or2.C2984b(this);
            this.f15191C = true;
            this.f15193E = new r74();
            this.f15203f = (Context) au4.m10792g(context);
        }
    }

    /* renamed from: mr2$c */
    /* compiled from: ImagePipelineConfig */
    public static class C2850c {

        /* renamed from: a */
        public boolean f15224a;

        public /* synthetic */ C2850c(C2848a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo23353a() {
            return this.f15224a;
        }

        public C2850c() {
            this.f15224a = false;
        }
    }

    public /* synthetic */ mr2(C2849b bVar, C2848a aVar) {
        this(bVar);
    }

    /* renamed from: F */
    public static C2850c m22517F() {
        return f15152J;
    }

    /* renamed from: G */
    public static vg1 m22518G(Context context) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return vg1.m28765m(context).mo27144n();
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: H */
    public static zr2 m22519H(C2849b bVar) {
        if (bVar.f15209l != null && bVar.f15210m != null) {
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        } else if (bVar.f15209l != null) {
            return bVar.f15209l;
        } else {
            return null;
        }
    }

    /* renamed from: I */
    public static int m22520I(C2849b bVar, or2 or2) {
        if (bVar.f15214q != null) {
            return bVar.f15214q.intValue();
        }
        if (or2.mo24060g() == 2 && Build.VERSION.SDK_INT >= 27) {
            return 2;
        }
        if (or2.mo24060g() == 1) {
            return 1;
        }
        or2.mo24060g();
        return 0;
    }

    /* renamed from: J */
    public static C2849b m22521J(Context context) {
        return new C2849b(context, (C2848a) null);
    }

    /* renamed from: K */
    public static void m22522K(ek7 ek7, or2 or2, a20 a20) {
        fk7.f11901d = ek7;
        ek7.C2235a n = or2.mo24067n();
        if (n != null) {
            ek7.mo13509b(n);
        }
        if (a20 != null) {
            ek7.mo13508a(a20);
        }
    }

    /* renamed from: A */
    public kq2 mo23319A() {
        return this.f15172k;
    }

    /* renamed from: B */
    public ht3 mo23320B() {
        return this.f15178q;
    }

    /* renamed from: C */
    public v90 mo23321C() {
        return this.f15156D;
    }

    /* renamed from: D */
    public or2 mo23322D() {
        return this.f15154B;
    }

    /* renamed from: E */
    public yu1 mo23323E() {
        return this.f15171j;
    }

    /* renamed from: a */
    public Set<ke5> mo23324a() {
        return Collections.unmodifiableSet(this.f15186y);
    }

    /* renamed from: b */
    public td6<Boolean> mo23325b() {
        return this.f15176o;
    }

    /* renamed from: c */
    public q54 mo23326c() {
        return this.f15180s;
    }

    /* renamed from: d */
    public ys3<f80, PooledByteBuffer> mo23327d() {
        return this.f15159G;
    }

    /* renamed from: e */
    public vg1 mo23328e() {
        return this.f15177p;
    }

    /* renamed from: f */
    public Set<je5> mo23329f() {
        return Collections.unmodifiableSet(this.f15185x);
    }

    /* renamed from: g */
    public ys3.C3691a mo23330g() {
        return this.f15164c;
    }

    public Context getContext() {
        return this.f15167f;
    }

    /* renamed from: h */
    public qw4 mo23332h() {
        return this.f15184w;
    }

    /* renamed from: i */
    public vg1 mo23333i() {
        return this.f15153A;
    }

    /* renamed from: j */
    public nu0.C2921b<f80> mo23334j() {
        return this.f15165d;
    }

    /* renamed from: k */
    public boolean mo23335k() {
        return this.f15168g;
    }

    /* renamed from: l */
    public ow5 mo23336l() {
        return this.f15160H;
    }

    /* renamed from: m */
    public Integer mo23337m() {
        return this.f15175n;
    }

    /* renamed from: n */
    public zr2 mo23338n() {
        return this.f15174m;
    }

    /* renamed from: o */
    public oq2 mo23339o() {
        return null;
    }

    /* renamed from: p */
    public boolean mo23340p() {
        return this.f15155C;
    }

    /* renamed from: q */
    public td6<zs3> mo23341q() {
        return this.f15163b;
    }

    /* renamed from: r */
    public nq2 mo23342r() {
        return this.f15173l;
    }

    /* renamed from: s */
    public td6<zs3> mo23343s() {
        return this.f15170i;
    }

    /* renamed from: t */
    public ls4 mo23344t() {
        return this.f15183v;
    }

    /* renamed from: u */
    public int mo23345u() {
        return this.f15179r;
    }

    /* renamed from: v */
    public o02 mo23346v() {
        return this.f15169h;
    }

    /* renamed from: w */
    public ph0 mo23347w() {
        return this.f15157E;
    }

    /* renamed from: x */
    public m20 mo23348x() {
        return this.f15161I;
    }

    /* renamed from: y */
    public g80 mo23349y() {
        return this.f15166e;
    }

    /* renamed from: z */
    public boolean mo23350z() {
        return this.f15187z;
    }

    public mr2(C2849b bVar) {
        td6<zs3> td6;
        ys3.C3691a aVar;
        g80 g80;
        o02 o02;
        td6<zs3> td62;
        kq2 kq2;
        td6<Boolean> td63;
        vg1 vg1;
        ht3 ht3;
        int i;
        q54 q54;
        ls4 ls4;
        qw4 qw4;
        Set<je5> set;
        Set<ke5> set2;
        yu1 yu1;
        m20 m20;
        ek7 i2;
        if (lc2.m21369d()) {
            lc2.m21366a("ImagePipelineConfig()");
        }
        or2 t = bVar.f15190B.mo24080t();
        this.f15154B = t;
        if (bVar.f15199b == null) {
            td6 = new u61((ActivityManager) au4.m10792g(bVar.f15203f.getSystemService("activity")));
        } else {
            td6 = bVar.f15199b;
        }
        this.f15163b = td6;
        if (bVar.f15201d == null) {
            aVar = new r20();
        } else {
            aVar = bVar.f15201d;
        }
        this.f15164c = aVar;
        this.f15165d = bVar.f15200c;
        this.f15162a = bVar.f15198a == null ? Bitmap.Config.ARGB_8888 : bVar.f15198a;
        if (bVar.f15202e == null) {
            g80 = a71.m87f();
        } else {
            g80 = bVar.f15202e;
        }
        this.f15166e = g80;
        this.f15167f = (Context) au4.m10792g(bVar.f15203f);
        if (bVar.f15223z == null) {
            o02 = new fh1(new ml1());
        } else {
            o02 = bVar.f15223z;
        }
        this.f15169h = o02;
        this.f15168g = bVar.f15204g;
        if (bVar.f15205h == null) {
            td62 = new w71();
        } else {
            td62 = bVar.f15205h;
        }
        this.f15170i = td62;
        if (bVar.f15207j == null) {
            kq2 = u74.m28103o();
        } else {
            kq2 = bVar.f15207j;
        }
        this.f15172k = kq2;
        this.f15173l = bVar.f15208k;
        this.f15174m = m22519H(bVar);
        this.f15175n = bVar.f15210m;
        if (bVar.f15211n == null) {
            td63 = new C2848a();
        } else {
            td63 = bVar.f15211n;
        }
        this.f15176o = td63;
        if (bVar.f15212o == null) {
            vg1 = m22518G(bVar.f15203f);
        } else {
            vg1 = bVar.f15212o;
        }
        this.f15177p = vg1;
        if (bVar.f15213p == null) {
            ht3 = v74.m28689b();
        } else {
            ht3 = bVar.f15213p;
        }
        this.f15178q = ht3;
        this.f15179r = m22520I(bVar, t);
        if (bVar.f15189A < 0) {
            i = 30000;
        } else {
            i = bVar.f15189A;
        }
        this.f15181t = i;
        if (lc2.m21369d()) {
            lc2.m21366a("ImagePipelineConfig->mNetworkFetcher");
        }
        if (bVar.f15215r == null) {
            q54 = new jn2(i);
        } else {
            q54 = bVar.f15215r;
        }
        this.f15180s = q54;
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        this.f15182u = bVar.f15216s;
        if (bVar.f15217t == null) {
            ls4 = new ls4(ks4.m21028n().mo22531m());
        } else {
            ls4 = bVar.f15217t;
        }
        this.f15183v = ls4;
        if (bVar.f15218u == null) {
            qw4 = new u26();
        } else {
            qw4 = bVar.f15218u;
        }
        this.f15184w = qw4;
        if (bVar.f15219v == null) {
            set = new HashSet<>();
        } else {
            set = bVar.f15219v;
        }
        this.f15185x = set;
        if (bVar.f15220w == null) {
            set2 = new HashSet<>();
        } else {
            set2 = bVar.f15220w;
        }
        this.f15186y = set2;
        this.f15187z = bVar.f15221x;
        this.f15153A = bVar.f15222y != null ? bVar.f15222y : vg1;
        oq2 unused = bVar.getClass();
        int e = ls4.mo22959e();
        if (bVar.f15206i == null) {
            yu1 = new y71(e);
        } else {
            yu1 = bVar.f15206i;
        }
        this.f15171j = yu1;
        this.f15155C = bVar.f15191C;
        this.f15156D = bVar.f15192D;
        this.f15157E = bVar.f15193E;
        this.f15158F = bVar.f15194F;
        if (bVar.f15197I == null) {
            m20 = new lu0();
        } else {
            m20 = bVar.f15197I;
        }
        this.f15161I = m20;
        this.f15159G = bVar.f15195G;
        this.f15160H = bVar.f15196H;
        ek7 m = t.mo24066m();
        if (m != null) {
            m22522K(m, t, new tm2(mo23344t()));
        } else if (t.mo24079z() && fk7.f11898a && (i2 = fk7.m17059i()) != null) {
            m22522K(i2, t, new tm2(mo23344t()));
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }
}
