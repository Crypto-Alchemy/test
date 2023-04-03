package androidx.media3.common;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.C0785d;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: androidx.media3.common.v */
/* compiled from: TrackSelectionParameters */
public class C0840v implements C0785d {

    /* renamed from: e1 */
    public static final C0840v f4490e1;
    @Deprecated

    /* renamed from: o1 */
    public static final C0840v f4491o1;
    @Deprecated

    /* renamed from: p1 */
    public static final C0785d.C0786a<C0840v> f4492p1 = new dt6();

    /* renamed from: A */
    public final int f4493A;

    /* renamed from: B */
    public final boolean f4494B;

    /* renamed from: C */
    public final ImmutableList<String> f4495C;

    /* renamed from: H */
    public final int f4496H;

    /* renamed from: I */
    public final ImmutableList<String> f4497I;

    /* renamed from: L */
    public final int f4498L;

    /* renamed from: M */
    public final int f4499M;

    /* renamed from: P */
    public final int f4500P;

    /* renamed from: Q */
    public final ImmutableList<String> f4501Q;

    /* renamed from: U */
    public final ImmutableList<String> f4502U;

    /* renamed from: X */
    public final int f4503X;

    /* renamed from: Y */
    public final int f4504Y;

    /* renamed from: Z */
    public final boolean f4505Z;

    /* renamed from: a */
    public final int f4506a;

    /* renamed from: b1 */
    public final ImmutableSet<Integer> f4507b1;

    /* renamed from: d */
    public final int f4508d;

    /* renamed from: e */
    public final int f4509e;

    /* renamed from: e0 */
    public final boolean f4510e0;

    /* renamed from: g */
    public final int f4511g;

    /* renamed from: k */
    public final int f4512k;

    /* renamed from: k0 */
    public final boolean f4513k0;

    /* renamed from: r */
    public final int f4514r;

    /* renamed from: s */
    public final int f4515s;

    /* renamed from: v0 */
    public final ImmutableMap<C0836t, C0837u> f4516v0;

    /* renamed from: x */
    public final int f4517x;

    /* renamed from: y */
    public final int f4518y;

    static {
        C0840v A = new C0841a().mo6936A();
        f4490e1 = A;
        f4491o1 = A;
    }

    public C0840v(C0841a aVar) {
        this.f4506a = aVar.f4519a;
        this.f4508d = aVar.f4520b;
        this.f4509e = aVar.f4521c;
        this.f4511g = aVar.f4522d;
        this.f4512k = aVar.f4523e;
        this.f4514r = aVar.f4524f;
        this.f4515s = aVar.f4525g;
        this.f4517x = aVar.f4526h;
        this.f4518y = aVar.f4527i;
        this.f4493A = aVar.f4528j;
        this.f4494B = aVar.f4529k;
        this.f4495C = aVar.f4530l;
        this.f4496H = aVar.f4531m;
        this.f4497I = aVar.f4532n;
        this.f4498L = aVar.f4533o;
        this.f4499M = aVar.f4534p;
        this.f4500P = aVar.f4535q;
        this.f4501Q = aVar.f4536r;
        this.f4502U = aVar.f4537s;
        this.f4503X = aVar.f4538t;
        this.f4504Y = aVar.f4539u;
        this.f4505Z = aVar.f4540v;
        this.f4510e0 = aVar.f4541w;
        this.f4513k0 = aVar.f4542x;
        this.f4516v0 = ImmutableMap.copyOf(aVar.f4543y);
        this.f4507b1 = ImmutableSet.copyOf(aVar.f4544z);
    }

    /* renamed from: b */
    public static C0840v m5878b(Bundle bundle) {
        return new C0841a(bundle).mo6936A();
    }

    /* renamed from: c */
    public static String m5879c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public C0841a mo6933a() {
        return new C0841a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0840v vVar = (C0840v) obj;
        if (this.f4506a == vVar.f4506a && this.f4508d == vVar.f4508d && this.f4509e == vVar.f4509e && this.f4511g == vVar.f4511g && this.f4512k == vVar.f4512k && this.f4514r == vVar.f4514r && this.f4515s == vVar.f4515s && this.f4517x == vVar.f4517x && this.f4494B == vVar.f4494B && this.f4518y == vVar.f4518y && this.f4493A == vVar.f4493A && this.f4495C.equals(vVar.f4495C) && this.f4496H == vVar.f4496H && this.f4497I.equals(vVar.f4497I) && this.f4498L == vVar.f4498L && this.f4499M == vVar.f4499M && this.f4500P == vVar.f4500P && this.f4501Q.equals(vVar.f4501Q) && this.f4502U.equals(vVar.f4502U) && this.f4503X == vVar.f4503X && this.f4504Y == vVar.f4504Y && this.f4505Z == vVar.f4505Z && this.f4510e0 == vVar.f4510e0 && this.f4513k0 == vVar.f4513k0 && this.f4516v0.equals(vVar.f4516v0) && this.f4507b1.equals(vVar.f4507b1)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.f4506a + 31) * 31) + this.f4508d) * 31) + this.f4509e) * 31) + this.f4511g) * 31) + this.f4512k) * 31) + this.f4514r) * 31) + this.f4515s) * 31) + this.f4517x) * 31) + (this.f4494B ? 1 : 0)) * 31) + this.f4518y) * 31) + this.f4493A) * 31) + this.f4495C.hashCode()) * 31) + this.f4496H) * 31) + this.f4497I.hashCode()) * 31) + this.f4498L) * 31) + this.f4499M) * 31) + this.f4500P) * 31) + this.f4501Q.hashCode()) * 31) + this.f4502U.hashCode()) * 31) + this.f4503X) * 31) + this.f4504Y) * 31) + (this.f4505Z ? 1 : 0)) * 31) + (this.f4510e0 ? 1 : 0)) * 31) + (this.f4513k0 ? 1 : 0)) * 31) + this.f4516v0.hashCode()) * 31) + this.f4507b1.hashCode();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5879c(6), this.f4506a);
        bundle.putInt(m5879c(7), this.f4508d);
        bundle.putInt(m5879c(8), this.f4509e);
        bundle.putInt(m5879c(9), this.f4511g);
        bundle.putInt(m5879c(10), this.f4512k);
        bundle.putInt(m5879c(11), this.f4514r);
        bundle.putInt(m5879c(12), this.f4515s);
        bundle.putInt(m5879c(13), this.f4517x);
        bundle.putInt(m5879c(14), this.f4518y);
        bundle.putInt(m5879c(15), this.f4493A);
        bundle.putBoolean(m5879c(16), this.f4494B);
        bundle.putStringArray(m5879c(17), (String[]) this.f4495C.toArray(new String[0]));
        bundle.putInt(m5879c(25), this.f4496H);
        bundle.putStringArray(m5879c(1), (String[]) this.f4497I.toArray(new String[0]));
        bundle.putInt(m5879c(2), this.f4498L);
        bundle.putInt(m5879c(18), this.f4499M);
        bundle.putInt(m5879c(19), this.f4500P);
        bundle.putStringArray(m5879c(20), (String[]) this.f4501Q.toArray(new String[0]));
        bundle.putStringArray(m5879c(3), (String[]) this.f4502U.toArray(new String[0]));
        bundle.putInt(m5879c(4), this.f4503X);
        bundle.putInt(m5879c(26), this.f4504Y);
        bundle.putBoolean(m5879c(5), this.f4505Z);
        bundle.putBoolean(m5879c(21), this.f4510e0);
        bundle.putBoolean(m5879c(22), this.f4513k0);
        bundle.putParcelableArrayList(m5879c(23), b60.m11131d(this.f4516v0.values()));
        bundle.putIntArray(m5879c(24), Ints.m37052k(this.f4507b1));
        return bundle;
    }

    /* renamed from: androidx.media3.common.v$a */
    /* compiled from: TrackSelectionParameters */
    public static class C0841a {

        /* renamed from: a */
        public int f4519a;

        /* renamed from: b */
        public int f4520b;

        /* renamed from: c */
        public int f4521c;

        /* renamed from: d */
        public int f4522d;

        /* renamed from: e */
        public int f4523e;

        /* renamed from: f */
        public int f4524f;

        /* renamed from: g */
        public int f4525g;

        /* renamed from: h */
        public int f4526h;

        /* renamed from: i */
        public int f4527i;

        /* renamed from: j */
        public int f4528j;

        /* renamed from: k */
        public boolean f4529k;

        /* renamed from: l */
        public ImmutableList<String> f4530l;

        /* renamed from: m */
        public int f4531m;

        /* renamed from: n */
        public ImmutableList<String> f4532n;

        /* renamed from: o */
        public int f4533o;

        /* renamed from: p */
        public int f4534p;

        /* renamed from: q */
        public int f4535q;

        /* renamed from: r */
        public ImmutableList<String> f4536r;

        /* renamed from: s */
        public ImmutableList<String> f4537s;

        /* renamed from: t */
        public int f4538t;

        /* renamed from: u */
        public int f4539u;

        /* renamed from: v */
        public boolean f4540v;

        /* renamed from: w */
        public boolean f4541w;

        /* renamed from: x */
        public boolean f4542x;

        /* renamed from: y */
        public HashMap<C0836t, C0837u> f4543y;

        /* renamed from: z */
        public HashSet<Integer> f4544z;

        @Deprecated
        public C0841a() {
            this.f4519a = Integer.MAX_VALUE;
            this.f4520b = Integer.MAX_VALUE;
            this.f4521c = Integer.MAX_VALUE;
            this.f4522d = Integer.MAX_VALUE;
            this.f4527i = Integer.MAX_VALUE;
            this.f4528j = Integer.MAX_VALUE;
            this.f4529k = true;
            this.f4530l = ImmutableList.m36627of();
            this.f4531m = 0;
            this.f4532n = ImmutableList.m36627of();
            this.f4533o = 0;
            this.f4534p = Integer.MAX_VALUE;
            this.f4535q = Integer.MAX_VALUE;
            this.f4536r = ImmutableList.m36627of();
            this.f4537s = ImmutableList.m36627of();
            this.f4538t = 0;
            this.f4539u = 0;
            this.f4540v = false;
            this.f4541w = false;
            this.f4542x = false;
            this.f4543y = new HashMap<>();
            this.f4544z = new HashSet<>();
        }

        /* renamed from: D */
        public static ImmutableList<String> m5881D(String[] strArr) {
            ImmutableList.C4534a builder = ImmutableList.builder();
            for (String e : (String[]) C2725kr.m20985e(strArr)) {
                builder.mo34667a(w67.m29295A0((String) C2725kr.m20985e(e)));
            }
            return builder.mo34692l();
        }

        /* renamed from: A */
        public C0840v mo6936A() {
            return new C0840v(this);
        }

        /* renamed from: B */
        public C0841a mo6937B(int i) {
            Iterator<C0837u> it = this.f4543y.values().iterator();
            while (it.hasNext()) {
                if (it.next().mo6923b() == i) {
                    it.remove();
                }
            }
            return this;
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        /* renamed from: C */
        public final void mo6938C(C0840v vVar) {
            this.f4519a = vVar.f4506a;
            this.f4520b = vVar.f4508d;
            this.f4521c = vVar.f4509e;
            this.f4522d = vVar.f4511g;
            this.f4523e = vVar.f4512k;
            this.f4524f = vVar.f4514r;
            this.f4525g = vVar.f4515s;
            this.f4526h = vVar.f4517x;
            this.f4527i = vVar.f4518y;
            this.f4528j = vVar.f4493A;
            this.f4529k = vVar.f4494B;
            this.f4530l = vVar.f4495C;
            this.f4531m = vVar.f4496H;
            this.f4532n = vVar.f4497I;
            this.f4533o = vVar.f4498L;
            this.f4534p = vVar.f4499M;
            this.f4535q = vVar.f4500P;
            this.f4536r = vVar.f4501Q;
            this.f4537s = vVar.f4502U;
            this.f4538t = vVar.f4503X;
            this.f4539u = vVar.f4504Y;
            this.f4540v = vVar.f4505Z;
            this.f4541w = vVar.f4510e0;
            this.f4542x = vVar.f4513k0;
            this.f4544z = new HashSet<>(vVar.f4507b1);
            this.f4543y = new HashMap<>(vVar.f4516v0);
        }

        /* renamed from: E */
        public C0841a mo6939E(C0840v vVar) {
            mo6938C(vVar);
            return this;
        }

        /* renamed from: F */
        public C0841a mo6940F(int i) {
            this.f4539u = i;
            return this;
        }

        /* renamed from: G */
        public C0841a mo6941G(C0837u uVar) {
            mo6937B(uVar.mo6923b());
            this.f4543y.put(uVar.f4475a, uVar);
            return this;
        }

        /* renamed from: H */
        public C0841a mo6942H(Context context) {
            if (w67.f19021a >= 19) {
                mo6943I(context);
            }
            return this;
        }

        /* renamed from: I */
        public final void mo6943I(Context context) {
            CaptioningManager captioningManager;
            if ((w67.f19021a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f4538t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f4537s = ImmutableList.m36628of(w67.m29334U(locale));
                }
            }
        }

        /* renamed from: J */
        public C0841a mo6944J(int i, boolean z) {
            if (z) {
                this.f4544z.add(Integer.valueOf(i));
            } else {
                this.f4544z.remove(Integer.valueOf(i));
            }
            return this;
        }

        /* renamed from: K */
        public C0841a mo6945K(int i, int i2, boolean z) {
            this.f4527i = i;
            this.f4528j = i2;
            this.f4529k = z;
            return this;
        }

        /* renamed from: L */
        public C0841a mo6946L(Context context, boolean z) {
            Point K = w67.m29314K(context);
            return mo6945K(K.x, K.y, z);
        }

        public C0841a(Context context) {
            this();
            mo6942H(context);
            mo6946L(context, true);
        }

        public C0841a(C0840v vVar) {
            mo6938C(vVar);
        }

        public C0841a(Bundle bundle) {
            ImmutableList<C0837u> immutableList;
            String c = C0840v.m5879c(6);
            C0840v vVar = C0840v.f4490e1;
            this.f4519a = bundle.getInt(c, vVar.f4506a);
            this.f4520b = bundle.getInt(C0840v.m5879c(7), vVar.f4508d);
            this.f4521c = bundle.getInt(C0840v.m5879c(8), vVar.f4509e);
            this.f4522d = bundle.getInt(C0840v.m5879c(9), vVar.f4511g);
            this.f4523e = bundle.getInt(C0840v.m5879c(10), vVar.f4512k);
            this.f4524f = bundle.getInt(C0840v.m5879c(11), vVar.f4514r);
            this.f4525g = bundle.getInt(C0840v.m5879c(12), vVar.f4515s);
            this.f4526h = bundle.getInt(C0840v.m5879c(13), vVar.f4517x);
            this.f4527i = bundle.getInt(C0840v.m5879c(14), vVar.f4518y);
            this.f4528j = bundle.getInt(C0840v.m5879c(15), vVar.f4493A);
            this.f4529k = bundle.getBoolean(C0840v.m5879c(16), vVar.f4494B);
            this.f4530l = ImmutableList.copyOf((E[]) (String[]) dy3.m43720a(bundle.getStringArray(C0840v.m5879c(17)), new String[0]));
            this.f4531m = bundle.getInt(C0840v.m5879c(25), vVar.f4496H);
            this.f4532n = m5881D((String[]) dy3.m43720a(bundle.getStringArray(C0840v.m5879c(1)), new String[0]));
            this.f4533o = bundle.getInt(C0840v.m5879c(2), vVar.f4498L);
            this.f4534p = bundle.getInt(C0840v.m5879c(18), vVar.f4499M);
            this.f4535q = bundle.getInt(C0840v.m5879c(19), vVar.f4500P);
            this.f4536r = ImmutableList.copyOf((E[]) (String[]) dy3.m43720a(bundle.getStringArray(C0840v.m5879c(20)), new String[0]));
            this.f4537s = m5881D((String[]) dy3.m43720a(bundle.getStringArray(C0840v.m5879c(3)), new String[0]));
            this.f4538t = bundle.getInt(C0840v.m5879c(4), vVar.f4503X);
            this.f4539u = bundle.getInt(C0840v.m5879c(26), vVar.f4504Y);
            this.f4540v = bundle.getBoolean(C0840v.m5879c(5), vVar.f4505Z);
            this.f4541w = bundle.getBoolean(C0840v.m5879c(21), vVar.f4510e0);
            this.f4542x = bundle.getBoolean(C0840v.m5879c(22), vVar.f4513k0);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0840v.m5879c(23));
            if (parcelableArrayList == null) {
                immutableList = ImmutableList.m36627of();
            } else {
                immutableList = b60.m11129b(C0837u.f4474e, parcelableArrayList);
            }
            this.f4543y = new HashMap<>();
            for (int i = 0; i < immutableList.size(); i++) {
                C0837u uVar = immutableList.get(i);
                this.f4543y.put(uVar.f4475a, uVar);
            }
            int[] iArr = (int[]) dy3.m43720a(bundle.getIntArray(C0840v.m5879c(24)), new int[0]);
            this.f4544z = new HashSet<>();
            for (int valueOf : iArr) {
                this.f4544z.add(Integer.valueOf(valueOf));
            }
        }
    }
}
