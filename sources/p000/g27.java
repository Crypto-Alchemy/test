package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p000.m72;
import p000.s72;
import p000.uf5;

/* renamed from: g27 */
/* compiled from: TypefaceCompat */
public class g27 {

    /* renamed from: a */
    public static final n27 f12162a;

    /* renamed from: b */
    public static final em3<String, Typeface> f12163b = new em3<>(16);

    /* renamed from: g27$a */
    /* compiled from: TypefaceCompat */
    public static class C2341a extends s72.C3251c {

        /* renamed from: a */
        public uf5.C3410e f12164a;

        public C2341a(uf5.C3410e eVar) {
            this.f12164a = eVar;
        }

        /* renamed from: a */
        public void mo20335a(int i) {
            uf5.C3410e eVar = this.f12164a;
            if (eVar != null) {
                eVar.m28240f(i);
            }
        }

        /* renamed from: b */
        public void mo20336b(Typeface typeface) {
            uf5.C3410e eVar = this.f12164a;
            if (eVar != null) {
                eVar.m28241g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f12162a = new m27();
        } else if (i >= 28) {
            f12162a = new l27();
        } else if (i >= 26) {
            f12162a = new k27();
        } else if (i < 24 || !i27.m19367j()) {
            f12162a = new h27();
        } else {
            f12162a = new i27();
        }
    }

    /* renamed from: a */
    public static Typeface m17571a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m17572b(Context context, CancellationSignal cancellationSignal, s72.C3250b[] bVarArr, int i) {
        return f12162a.mo20928b(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m17573c(Context context, m72.C2807b bVar, Resources resources, int i, String str, int i2, int i3, uf5.C3410e eVar, Handler handler, boolean z) {
        Typeface typeface;
        boolean z2;
        int i4;
        m72.C2807b bVar2 = bVar;
        uf5.C3410e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof m72.C2810e) {
            m72.C2810e eVar3 = (m72.C2810e) bVar2;
            Typeface g = m17577g(eVar3.mo23060c());
            if (g != null) {
                if (eVar2 != null) {
                    eVar2.mo26762d(g, handler2);
                }
                return g;
            }
            if (!z ? eVar2 != null : eVar3.mo23058a() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                i4 = eVar3.mo23061d();
            } else {
                i4 = -1;
            }
            Context context2 = context;
            typeface = s72.m26705c(context2, eVar3.mo23059b(), i3, z2, i4, uf5.C3410e.m28239e(handler), new C2341a(eVar2));
            Resources resources2 = resources;
            int i5 = i3;
        } else {
            Context context3 = context;
            Resources resources3 = resources;
            typeface = f12162a.mo20927a(context, (m72.C2808c) bVar2, resources, i3);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.mo26762d(typeface, handler2);
                } else {
                    eVar2.mo26761c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f12163b.mo19373d(m17575e(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m17574d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = f12162a.mo22164d(context, resources, i, str, i3);
        if (d != null) {
            f12163b.mo19373d(m17575e(resources, i, str, i2, i3), d);
        }
        return d;
    }

    /* renamed from: e */
    public static String m17575e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m17576f(Resources resources, int i, String str, int i2, int i3) {
        return f12163b.mo19372c(m17575e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    public static Typeface m17577g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
