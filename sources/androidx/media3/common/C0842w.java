package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.common.w */
/* compiled from: Tracks */
public final class C0842w implements C0785d {

    /* renamed from: d */
    public static final C0842w f4545d = new C0842w(ImmutableList.m36627of());

    /* renamed from: e */
    public static final C0785d.C0786a<C0842w> f4546e = new it6();

    /* renamed from: a */
    public final ImmutableList<C0843a> f4547a;

    /* renamed from: androidx.media3.common.w$a */
    /* compiled from: Tracks */
    public static final class C0843a implements C0785d {

        /* renamed from: r */
        public static final C0785d.C0786a<C0843a> f4548r = new jt6();

        /* renamed from: a */
        public final int f4549a;

        /* renamed from: d */
        public final C0836t f4550d;

        /* renamed from: e */
        public final boolean f4551e;

        /* renamed from: g */
        public final int[] f4552g;

        /* renamed from: k */
        public final boolean[] f4553k;

        public C0843a(C0836t tVar, boolean z, int[] iArr, boolean[] zArr) {
            boolean z2;
            int i = tVar.f4469a;
            this.f4549a = i;
            boolean z3 = false;
            if (i == iArr.length && i == zArr.length) {
                z2 = true;
            } else {
                z2 = false;
            }
            C2725kr.m20981a(z2);
            this.f4550d = tVar;
            if (z && i > 1) {
                z3 = true;
            }
            this.f4551e = z3;
            this.f4552g = (int[]) iArr.clone();
            this.f4553k = (boolean[]) zArr.clone();
        }

        /* renamed from: j */
        public static String m5926j(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: b */
        public C0836t mo6952b() {
            return this.f4550d;
        }

        /* renamed from: c */
        public C0792h mo6953c(int i) {
            return this.f4550d.mo6918c(i);
        }

        /* renamed from: d */
        public int mo6954d() {
            return this.f4550d.f4471e;
        }

        /* renamed from: e */
        public boolean mo6955e() {
            return this.f4551e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0843a.class != obj.getClass()) {
                return false;
            }
            C0843a aVar = (C0843a) obj;
            if (this.f4551e != aVar.f4551e || !this.f4550d.equals(aVar.f4550d) || !Arrays.equals(this.f4552g, aVar.f4552g) || !Arrays.equals(this.f4553k, aVar.f4553k)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public boolean mo6957f() {
            return s30.m51519b(this.f4553k, true);
        }

        /* renamed from: g */
        public boolean mo6958g(int i) {
            return this.f4553k[i];
        }

        /* renamed from: h */
        public boolean mo6959h(int i) {
            return mo6961i(i, false);
        }

        public int hashCode() {
            return (((((this.f4550d.hashCode() * 31) + (this.f4551e ? 1 : 0)) * 31) + Arrays.hashCode(this.f4552g)) * 31) + Arrays.hashCode(this.f4553k);
        }

        /* renamed from: i */
        public boolean mo6961i(int i, boolean z) {
            int i2 = this.f4552g[i];
            if (i2 == 4 || (z && i2 == 3)) {
                return true;
            }
            return false;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(m5926j(0), this.f4550d.toBundle());
            bundle.putIntArray(m5926j(1), this.f4552g);
            bundle.putBooleanArray(m5926j(3), this.f4553k);
            bundle.putBoolean(m5926j(4), this.f4551e);
            return bundle;
        }
    }

    public C0842w(List<C0843a> list) {
        this.f4547a = ImmutableList.copyOf(list);
    }

    /* renamed from: e */
    public static String m5920e(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: f */
    public static /* synthetic */ C0842w m5921f(Bundle bundle) {
        ImmutableList<C0843a> immutableList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m5920e(0));
        if (parcelableArrayList == null) {
            immutableList = ImmutableList.m36627of();
        } else {
            immutableList = b60.m11129b(C0843a.f4548r, parcelableArrayList);
        }
        return new C0842w(immutableList);
    }

    /* renamed from: b */
    public ImmutableList<C0843a> mo6947b() {
        return this.f4547a;
    }

    /* renamed from: c */
    public boolean mo6948c() {
        return this.f4547a.isEmpty();
    }

    /* renamed from: d */
    public boolean mo6949d(int i) {
        for (int i2 = 0; i2 < this.f4547a.size(); i2++) {
            C0843a aVar = this.f4547a.get(i2);
            if (aVar.mo6957f() && aVar.mo6954d() == i) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0842w.class != obj.getClass()) {
            return false;
        }
        return this.f4547a.equals(((C0842w) obj).f4547a);
    }

    public int hashCode() {
        return this.f4547a.hashCode();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(m5920e(0), b60.m11131d(this.f4547a));
        return bundle;
    }
}
