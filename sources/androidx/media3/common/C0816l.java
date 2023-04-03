package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.C0785d;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.common.l */
/* compiled from: MediaMetadata */
public final class C0816l implements C0785d {

    /* renamed from: t1 */
    public static final C0816l f4337t1 = new C0818b().mo6800F();

    /* renamed from: u1 */
    public static final C0785d.C0786a<C0816l> f4338u1 = new kr3();

    /* renamed from: A */
    public final byte[] f4339A;

    /* renamed from: B */
    public final Integer f4340B;

    /* renamed from: C */
    public final Uri f4341C;

    /* renamed from: H */
    public final Integer f4342H;

    /* renamed from: I */
    public final Integer f4343I;

    /* renamed from: L */
    public final Integer f4344L;

    /* renamed from: M */
    public final Boolean f4345M;
    @Deprecated

    /* renamed from: P */
    public final Integer f4346P;

    /* renamed from: Q */
    public final Integer f4347Q;

    /* renamed from: U */
    public final Integer f4348U;

    /* renamed from: X */
    public final Integer f4349X;

    /* renamed from: Y */
    public final Integer f4350Y;

    /* renamed from: Z */
    public final Integer f4351Z;

    /* renamed from: a */
    public final CharSequence f4352a;

    /* renamed from: b1 */
    public final CharSequence f4353b1;

    /* renamed from: d */
    public final CharSequence f4354d;

    /* renamed from: e */
    public final CharSequence f4355e;

    /* renamed from: e0 */
    public final Integer f4356e0;

    /* renamed from: e1 */
    public final Integer f4357e1;

    /* renamed from: g */
    public final CharSequence f4358g;

    /* renamed from: k */
    public final CharSequence f4359k;

    /* renamed from: k0 */
    public final CharSequence f4360k0;

    /* renamed from: o1 */
    public final Integer f4361o1;

    /* renamed from: p1 */
    public final CharSequence f4362p1;

    /* renamed from: q1 */
    public final CharSequence f4363q1;

    /* renamed from: r */
    public final CharSequence f4364r;

    /* renamed from: r1 */
    public final CharSequence f4365r1;

    /* renamed from: s */
    public final CharSequence f4366s;

    /* renamed from: s1 */
    public final Bundle f4367s1;

    /* renamed from: v0 */
    public final CharSequence f4368v0;

    /* renamed from: x */
    public final C0828p f4369x;

    /* renamed from: y */
    public final C0828p f4370y;

    /* renamed from: androidx.media3.common.l$b */
    /* compiled from: MediaMetadata */
    public static final class C0818b {

        /* renamed from: A */
        public Integer f4371A;

        /* renamed from: B */
        public CharSequence f4372B;

        /* renamed from: C */
        public CharSequence f4373C;

        /* renamed from: D */
        public CharSequence f4374D;

        /* renamed from: E */
        public Bundle f4375E;

        /* renamed from: a */
        public CharSequence f4376a;

        /* renamed from: b */
        public CharSequence f4377b;

        /* renamed from: c */
        public CharSequence f4378c;

        /* renamed from: d */
        public CharSequence f4379d;

        /* renamed from: e */
        public CharSequence f4380e;

        /* renamed from: f */
        public CharSequence f4381f;

        /* renamed from: g */
        public CharSequence f4382g;

        /* renamed from: h */
        public C0828p f4383h;

        /* renamed from: i */
        public C0828p f4384i;

        /* renamed from: j */
        public byte[] f4385j;

        /* renamed from: k */
        public Integer f4386k;

        /* renamed from: l */
        public Uri f4387l;

        /* renamed from: m */
        public Integer f4388m;

        /* renamed from: n */
        public Integer f4389n;

        /* renamed from: o */
        public Integer f4390o;

        /* renamed from: p */
        public Boolean f4391p;

        /* renamed from: q */
        public Integer f4392q;

        /* renamed from: r */
        public Integer f4393r;

        /* renamed from: s */
        public Integer f4394s;

        /* renamed from: t */
        public Integer f4395t;

        /* renamed from: u */
        public Integer f4396u;

        /* renamed from: v */
        public Integer f4397v;

        /* renamed from: w */
        public CharSequence f4398w;

        /* renamed from: x */
        public CharSequence f4399x;

        /* renamed from: y */
        public CharSequence f4400y;

        /* renamed from: z */
        public Integer f4401z;

        public C0818b() {
        }

        /* renamed from: F */
        public C0816l mo6800F() {
            return new C0816l(this);
        }

        /* renamed from: G */
        public C0818b mo6801G(byte[] bArr, int i) {
            if (this.f4385j == null || w67.m29346c(Integer.valueOf(i), 3) || !w67.m29346c(this.f4386k, 3)) {
                this.f4385j = (byte[]) bArr.clone();
                this.f4386k = Integer.valueOf(i);
            }
            return this;
        }

        /* renamed from: H */
        public C0818b mo6802H(C0816l lVar) {
            if (lVar == null) {
                return this;
            }
            CharSequence charSequence = lVar.f4352a;
            if (charSequence != null) {
                mo6829i0(charSequence);
            }
            CharSequence charSequence2 = lVar.f4354d;
            if (charSequence2 != null) {
                mo6807M(charSequence2);
            }
            CharSequence charSequence3 = lVar.f4355e;
            if (charSequence3 != null) {
                mo6806L(charSequence3);
            }
            CharSequence charSequence4 = lVar.f4358g;
            if (charSequence4 != null) {
                mo6805K(charSequence4);
            }
            CharSequence charSequence5 = lVar.f4359k;
            if (charSequence5 != null) {
                mo6815U(charSequence5);
            }
            CharSequence charSequence6 = lVar.f4364r;
            if (charSequence6 != null) {
                mo6828h0(charSequence6);
            }
            CharSequence charSequence7 = lVar.f4366s;
            if (charSequence7 != null) {
                mo6813S(charSequence7);
            }
            C0828p pVar = lVar.f4369x;
            if (pVar != null) {
                mo6833m0(pVar);
            }
            C0828p pVar2 = lVar.f4370y;
            if (pVar2 != null) {
                mo6820Z(pVar2);
            }
            byte[] bArr = lVar.f4339A;
            if (bArr != null) {
                mo6808N(bArr, lVar.f4340B);
            }
            Uri uri = lVar.f4341C;
            if (uri != null) {
                mo6809O(uri);
            }
            Integer num = lVar.f4342H;
            if (num != null) {
                mo6832l0(num);
            }
            Integer num2 = lVar.f4343I;
            if (num2 != null) {
                mo6831k0(num2);
            }
            Integer num3 = lVar.f4344L;
            if (num3 != null) {
                mo6817W(num3);
            }
            Boolean bool = lVar.f4345M;
            if (bool != null) {
                mo6819Y(bool);
            }
            Integer num4 = lVar.f4346P;
            if (num4 != null) {
                mo6823c0(num4);
            }
            Integer num5 = lVar.f4347Q;
            if (num5 != null) {
                mo6823c0(num5);
            }
            Integer num6 = lVar.f4348U;
            if (num6 != null) {
                mo6822b0(num6);
            }
            Integer num7 = lVar.f4349X;
            if (num7 != null) {
                mo6821a0(num7);
            }
            Integer num8 = lVar.f4350Y;
            if (num8 != null) {
                mo6826f0(num8);
            }
            Integer num9 = lVar.f4351Z;
            if (num9 != null) {
                mo6825e0(num9);
            }
            Integer num10 = lVar.f4356e0;
            if (num10 != null) {
                mo6824d0(num10);
            }
            CharSequence charSequence8 = lVar.f4360k0;
            if (charSequence8 != null) {
                mo6834n0(charSequence8);
            }
            CharSequence charSequence9 = lVar.f4368v0;
            if (charSequence9 != null) {
                mo6811Q(charSequence9);
            }
            CharSequence charSequence10 = lVar.f4353b1;
            if (charSequence10 != null) {
                mo6812R(charSequence10);
            }
            Integer num11 = lVar.f4357e1;
            if (num11 != null) {
                mo6814T(num11);
            }
            Integer num12 = lVar.f4361o1;
            if (num12 != null) {
                mo6830j0(num12);
            }
            CharSequence charSequence11 = lVar.f4362p1;
            if (charSequence11 != null) {
                mo6818X(charSequence11);
            }
            CharSequence charSequence12 = lVar.f4363q1;
            if (charSequence12 != null) {
                mo6810P(charSequence12);
            }
            CharSequence charSequence13 = lVar.f4365r1;
            if (charSequence13 != null) {
                mo6827g0(charSequence13);
            }
            Bundle bundle = lVar.f4367s1;
            if (bundle != null) {
                mo6816V(bundle);
            }
            return this;
        }

        /* renamed from: I */
        public C0818b mo6803I(Metadata metadata) {
            for (int i = 0; i < metadata.mo6545d(); i++) {
                metadata.mo6544c(i).mo6551N0(this);
            }
            return this;
        }

        /* renamed from: J */
        public C0818b mo6804J(List<Metadata> list) {
            for (int i = 0; i < list.size(); i++) {
                Metadata metadata = list.get(i);
                for (int i2 = 0; i2 < metadata.mo6545d(); i2++) {
                    metadata.mo6544c(i2).mo6551N0(this);
                }
            }
            return this;
        }

        /* renamed from: K */
        public C0818b mo6805K(CharSequence charSequence) {
            this.f4379d = charSequence;
            return this;
        }

        /* renamed from: L */
        public C0818b mo6806L(CharSequence charSequence) {
            this.f4378c = charSequence;
            return this;
        }

        /* renamed from: M */
        public C0818b mo6807M(CharSequence charSequence) {
            this.f4377b = charSequence;
            return this;
        }

        /* renamed from: N */
        public C0818b mo6808N(byte[] bArr, Integer num) {
            byte[] bArr2;
            if (bArr == null) {
                bArr2 = null;
            } else {
                bArr2 = (byte[]) bArr.clone();
            }
            this.f4385j = bArr2;
            this.f4386k = num;
            return this;
        }

        /* renamed from: O */
        public C0818b mo6809O(Uri uri) {
            this.f4387l = uri;
            return this;
        }

        /* renamed from: P */
        public C0818b mo6810P(CharSequence charSequence) {
            this.f4373C = charSequence;
            return this;
        }

        /* renamed from: Q */
        public C0818b mo6811Q(CharSequence charSequence) {
            this.f4399x = charSequence;
            return this;
        }

        /* renamed from: R */
        public C0818b mo6812R(CharSequence charSequence) {
            this.f4400y = charSequence;
            return this;
        }

        /* renamed from: S */
        public C0818b mo6813S(CharSequence charSequence) {
            this.f4382g = charSequence;
            return this;
        }

        /* renamed from: T */
        public C0818b mo6814T(Integer num) {
            this.f4401z = num;
            return this;
        }

        /* renamed from: U */
        public C0818b mo6815U(CharSequence charSequence) {
            this.f4380e = charSequence;
            return this;
        }

        /* renamed from: V */
        public C0818b mo6816V(Bundle bundle) {
            this.f4375E = bundle;
            return this;
        }

        /* renamed from: W */
        public C0818b mo6817W(Integer num) {
            this.f4390o = num;
            return this;
        }

        /* renamed from: X */
        public C0818b mo6818X(CharSequence charSequence) {
            this.f4372B = charSequence;
            return this;
        }

        /* renamed from: Y */
        public C0818b mo6819Y(Boolean bool) {
            this.f4391p = bool;
            return this;
        }

        /* renamed from: Z */
        public C0818b mo6820Z(C0828p pVar) {
            this.f4384i = pVar;
            return this;
        }

        /* renamed from: a0 */
        public C0818b mo6821a0(Integer num) {
            this.f4394s = num;
            return this;
        }

        /* renamed from: b0 */
        public C0818b mo6822b0(Integer num) {
            this.f4393r = num;
            return this;
        }

        /* renamed from: c0 */
        public C0818b mo6823c0(Integer num) {
            this.f4392q = num;
            return this;
        }

        /* renamed from: d0 */
        public C0818b mo6824d0(Integer num) {
            this.f4397v = num;
            return this;
        }

        /* renamed from: e0 */
        public C0818b mo6825e0(Integer num) {
            this.f4396u = num;
            return this;
        }

        /* renamed from: f0 */
        public C0818b mo6826f0(Integer num) {
            this.f4395t = num;
            return this;
        }

        /* renamed from: g0 */
        public C0818b mo6827g0(CharSequence charSequence) {
            this.f4374D = charSequence;
            return this;
        }

        /* renamed from: h0 */
        public C0818b mo6828h0(CharSequence charSequence) {
            this.f4381f = charSequence;
            return this;
        }

        /* renamed from: i0 */
        public C0818b mo6829i0(CharSequence charSequence) {
            this.f4376a = charSequence;
            return this;
        }

        /* renamed from: j0 */
        public C0818b mo6830j0(Integer num) {
            this.f4371A = num;
            return this;
        }

        /* renamed from: k0 */
        public C0818b mo6831k0(Integer num) {
            this.f4389n = num;
            return this;
        }

        /* renamed from: l0 */
        public C0818b mo6832l0(Integer num) {
            this.f4388m = num;
            return this;
        }

        /* renamed from: m0 */
        public C0818b mo6833m0(C0828p pVar) {
            this.f4383h = pVar;
            return this;
        }

        /* renamed from: n0 */
        public C0818b mo6834n0(CharSequence charSequence) {
            this.f4398w = charSequence;
            return this;
        }

        public C0818b(C0816l lVar) {
            this.f4376a = lVar.f4352a;
            this.f4377b = lVar.f4354d;
            this.f4378c = lVar.f4355e;
            this.f4379d = lVar.f4358g;
            this.f4380e = lVar.f4359k;
            this.f4381f = lVar.f4364r;
            this.f4382g = lVar.f4366s;
            this.f4383h = lVar.f4369x;
            this.f4384i = lVar.f4370y;
            this.f4385j = lVar.f4339A;
            this.f4386k = lVar.f4340B;
            this.f4387l = lVar.f4341C;
            this.f4388m = lVar.f4342H;
            this.f4389n = lVar.f4343I;
            this.f4390o = lVar.f4344L;
            this.f4391p = lVar.f4345M;
            this.f4392q = lVar.f4347Q;
            this.f4393r = lVar.f4348U;
            this.f4394s = lVar.f4349X;
            this.f4395t = lVar.f4350Y;
            this.f4396u = lVar.f4351Z;
            this.f4397v = lVar.f4356e0;
            this.f4398w = lVar.f4360k0;
            this.f4399x = lVar.f4368v0;
            this.f4400y = lVar.f4353b1;
            this.f4401z = lVar.f4357e1;
            this.f4371A = lVar.f4361o1;
            this.f4372B = lVar.f4362p1;
            this.f4373C = lVar.f4363q1;
            this.f4374D = lVar.f4365r1;
            this.f4375E = lVar.f4367s1;
        }
    }

    /* renamed from: c */
    public static C0816l m5581c(Bundle bundle) {
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        C0818b bVar = new C0818b();
        C0818b S = bVar.mo6829i0(bundle.getCharSequence(m5582d(0))).mo6807M(bundle.getCharSequence(m5582d(1))).mo6806L(bundle.getCharSequence(m5582d(2))).mo6805K(bundle.getCharSequence(m5582d(3))).mo6815U(bundle.getCharSequence(m5582d(4))).mo6828h0(bundle.getCharSequence(m5582d(5))).mo6813S(bundle.getCharSequence(m5582d(6)));
        byte[] byteArray = bundle.getByteArray(m5582d(10));
        if (bundle.containsKey(m5582d(29))) {
            num = Integer.valueOf(bundle.getInt(m5582d(29)));
        } else {
            num = null;
        }
        S.mo6808N(byteArray, num).mo6809O((Uri) bundle.getParcelable(m5582d(11))).mo6834n0(bundle.getCharSequence(m5582d(22))).mo6811Q(bundle.getCharSequence(m5582d(23))).mo6812R(bundle.getCharSequence(m5582d(24))).mo6818X(bundle.getCharSequence(m5582d(27))).mo6810P(bundle.getCharSequence(m5582d(28))).mo6827g0(bundle.getCharSequence(m5582d(30))).mo6816V(bundle.getBundle(m5582d(1000)));
        if (bundle.containsKey(m5582d(8)) && (bundle3 = bundle.getBundle(m5582d(8))) != null) {
            bVar.mo6833m0(C0828p.f4426a.mo104a(bundle3));
        }
        if (bundle.containsKey(m5582d(9)) && (bundle2 = bundle.getBundle(m5582d(9))) != null) {
            bVar.mo6820Z(C0828p.f4426a.mo104a(bundle2));
        }
        if (bundle.containsKey(m5582d(12))) {
            bVar.mo6832l0(Integer.valueOf(bundle.getInt(m5582d(12))));
        }
        if (bundle.containsKey(m5582d(13))) {
            bVar.mo6831k0(Integer.valueOf(bundle.getInt(m5582d(13))));
        }
        if (bundle.containsKey(m5582d(14))) {
            bVar.mo6817W(Integer.valueOf(bundle.getInt(m5582d(14))));
        }
        if (bundle.containsKey(m5582d(15))) {
            bVar.mo6819Y(Boolean.valueOf(bundle.getBoolean(m5582d(15))));
        }
        if (bundle.containsKey(m5582d(16))) {
            bVar.mo6823c0(Integer.valueOf(bundle.getInt(m5582d(16))));
        }
        if (bundle.containsKey(m5582d(17))) {
            bVar.mo6822b0(Integer.valueOf(bundle.getInt(m5582d(17))));
        }
        if (bundle.containsKey(m5582d(18))) {
            bVar.mo6821a0(Integer.valueOf(bundle.getInt(m5582d(18))));
        }
        if (bundle.containsKey(m5582d(19))) {
            bVar.mo6826f0(Integer.valueOf(bundle.getInt(m5582d(19))));
        }
        if (bundle.containsKey(m5582d(20))) {
            bVar.mo6825e0(Integer.valueOf(bundle.getInt(m5582d(20))));
        }
        if (bundle.containsKey(m5582d(21))) {
            bVar.mo6824d0(Integer.valueOf(bundle.getInt(m5582d(21))));
        }
        if (bundle.containsKey(m5582d(25))) {
            bVar.mo6814T(Integer.valueOf(bundle.getInt(m5582d(25))));
        }
        if (bundle.containsKey(m5582d(26))) {
            bVar.mo6830j0(Integer.valueOf(bundle.getInt(m5582d(26))));
        }
        return bVar.mo6800F();
    }

    /* renamed from: d */
    public static String m5582d(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public C0818b mo6797b() {
        return new C0818b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0816l.class != obj.getClass()) {
            return false;
        }
        C0816l lVar = (C0816l) obj;
        if (!w67.m29346c(this.f4352a, lVar.f4352a) || !w67.m29346c(this.f4354d, lVar.f4354d) || !w67.m29346c(this.f4355e, lVar.f4355e) || !w67.m29346c(this.f4358g, lVar.f4358g) || !w67.m29346c(this.f4359k, lVar.f4359k) || !w67.m29346c(this.f4364r, lVar.f4364r) || !w67.m29346c(this.f4366s, lVar.f4366s) || !w67.m29346c(this.f4369x, lVar.f4369x) || !w67.m29346c(this.f4370y, lVar.f4370y) || !Arrays.equals(this.f4339A, lVar.f4339A) || !w67.m29346c(this.f4340B, lVar.f4340B) || !w67.m29346c(this.f4341C, lVar.f4341C) || !w67.m29346c(this.f4342H, lVar.f4342H) || !w67.m29346c(this.f4343I, lVar.f4343I) || !w67.m29346c(this.f4344L, lVar.f4344L) || !w67.m29346c(this.f4345M, lVar.f4345M) || !w67.m29346c(this.f4347Q, lVar.f4347Q) || !w67.m29346c(this.f4348U, lVar.f4348U) || !w67.m29346c(this.f4349X, lVar.f4349X) || !w67.m29346c(this.f4350Y, lVar.f4350Y) || !w67.m29346c(this.f4351Z, lVar.f4351Z) || !w67.m29346c(this.f4356e0, lVar.f4356e0) || !w67.m29346c(this.f4360k0, lVar.f4360k0) || !w67.m29346c(this.f4368v0, lVar.f4368v0) || !w67.m29346c(this.f4353b1, lVar.f4353b1) || !w67.m29346c(this.f4357e1, lVar.f4357e1) || !w67.m29346c(this.f4361o1, lVar.f4361o1) || !w67.m29346c(this.f4362p1, lVar.f4362p1) || !w67.m29346c(this.f4363q1, lVar.f4363q1) || !w67.m29346c(this.f4365r1, lVar.f4365r1)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return jf4.m46497b(this.f4352a, this.f4354d, this.f4355e, this.f4358g, this.f4359k, this.f4364r, this.f4366s, this.f4369x, this.f4370y, Integer.valueOf(Arrays.hashCode(this.f4339A)), this.f4340B, this.f4341C, this.f4342H, this.f4343I, this.f4344L, this.f4345M, this.f4347Q, this.f4348U, this.f4349X, this.f4350Y, this.f4351Z, this.f4356e0, this.f4360k0, this.f4368v0, this.f4353b1, this.f4357e1, this.f4361o1, this.f4362p1, this.f4363q1, this.f4365r1);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(m5582d(0), this.f4352a);
        bundle.putCharSequence(m5582d(1), this.f4354d);
        bundle.putCharSequence(m5582d(2), this.f4355e);
        bundle.putCharSequence(m5582d(3), this.f4358g);
        bundle.putCharSequence(m5582d(4), this.f4359k);
        bundle.putCharSequence(m5582d(5), this.f4364r);
        bundle.putCharSequence(m5582d(6), this.f4366s);
        bundle.putByteArray(m5582d(10), this.f4339A);
        bundle.putParcelable(m5582d(11), this.f4341C);
        bundle.putCharSequence(m5582d(22), this.f4360k0);
        bundle.putCharSequence(m5582d(23), this.f4368v0);
        bundle.putCharSequence(m5582d(24), this.f4353b1);
        bundle.putCharSequence(m5582d(27), this.f4362p1);
        bundle.putCharSequence(m5582d(28), this.f4363q1);
        bundle.putCharSequence(m5582d(30), this.f4365r1);
        if (this.f4369x != null) {
            bundle.putBundle(m5582d(8), this.f4369x.toBundle());
        }
        if (this.f4370y != null) {
            bundle.putBundle(m5582d(9), this.f4370y.toBundle());
        }
        if (this.f4342H != null) {
            bundle.putInt(m5582d(12), this.f4342H.intValue());
        }
        if (this.f4343I != null) {
            bundle.putInt(m5582d(13), this.f4343I.intValue());
        }
        if (this.f4344L != null) {
            bundle.putInt(m5582d(14), this.f4344L.intValue());
        }
        if (this.f4345M != null) {
            bundle.putBoolean(m5582d(15), this.f4345M.booleanValue());
        }
        if (this.f4347Q != null) {
            bundle.putInt(m5582d(16), this.f4347Q.intValue());
        }
        if (this.f4348U != null) {
            bundle.putInt(m5582d(17), this.f4348U.intValue());
        }
        if (this.f4349X != null) {
            bundle.putInt(m5582d(18), this.f4349X.intValue());
        }
        if (this.f4350Y != null) {
            bundle.putInt(m5582d(19), this.f4350Y.intValue());
        }
        if (this.f4351Z != null) {
            bundle.putInt(m5582d(20), this.f4351Z.intValue());
        }
        if (this.f4356e0 != null) {
            bundle.putInt(m5582d(21), this.f4356e0.intValue());
        }
        if (this.f4357e1 != null) {
            bundle.putInt(m5582d(25), this.f4357e1.intValue());
        }
        if (this.f4361o1 != null) {
            bundle.putInt(m5582d(26), this.f4361o1.intValue());
        }
        if (this.f4340B != null) {
            bundle.putInt(m5582d(29), this.f4340B.intValue());
        }
        if (this.f4367s1 != null) {
            bundle.putBundle(m5582d(1000), this.f4367s1);
        }
        return bundle;
    }

    public C0816l(C0818b bVar) {
        this.f4352a = bVar.f4376a;
        this.f4354d = bVar.f4377b;
        this.f4355e = bVar.f4378c;
        this.f4358g = bVar.f4379d;
        this.f4359k = bVar.f4380e;
        this.f4364r = bVar.f4381f;
        this.f4366s = bVar.f4382g;
        this.f4369x = bVar.f4383h;
        this.f4370y = bVar.f4384i;
        this.f4339A = bVar.f4385j;
        this.f4340B = bVar.f4386k;
        this.f4341C = bVar.f4387l;
        this.f4342H = bVar.f4388m;
        this.f4343I = bVar.f4389n;
        this.f4344L = bVar.f4390o;
        this.f4345M = bVar.f4391p;
        this.f4346P = bVar.f4392q;
        this.f4347Q = bVar.f4392q;
        this.f4348U = bVar.f4393r;
        this.f4349X = bVar.f4394s;
        this.f4350Y = bVar.f4395t;
        this.f4351Z = bVar.f4396u;
        this.f4356e0 = bVar.f4397v;
        this.f4360k0 = bVar.f4398w;
        this.f4368v0 = bVar.f4399x;
        this.f4353b1 = bVar.f4400y;
        this.f4357e1 = bVar.f4401z;
        this.f4361o1 = bVar.f4371A;
        this.f4362p1 = bVar.f4372B;
        this.f4363q1 = bVar.f4373C;
        this.f4365r1 = bVar.f4374D;
        this.f4367s1 = bVar.f4375E;
    }
}
