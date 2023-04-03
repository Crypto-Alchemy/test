package androidx.media3.common;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.C0785d;
import androidx.media3.common.C0789g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.common.o */
/* compiled from: Player */
public interface C0821o {

    /* renamed from: androidx.media3.common.o$b */
    /* compiled from: Player */
    public static final class C0823b implements C0785d {

        /* renamed from: d */
        public static final C0823b f4409d = new C0824a().mo6854e();

        /* renamed from: e */
        public static final C0785d.C0786a<C0823b> f4410e = new cq4();

        /* renamed from: a */
        public final C0789g f4411a;

        /* renamed from: androidx.media3.common.o$b$a */
        /* compiled from: Player */
        public static final class C0824a {

            /* renamed from: b */
            public static final int[] f4412b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a */
            public final C0789g.C0791b f4413a = new C0789g.C0791b();

            /* renamed from: a */
            public C0824a mo6850a(int i) {
                this.f4413a.mo6631a(i);
                return this;
            }

            /* renamed from: b */
            public C0824a mo6851b(C0823b bVar) {
                this.f4413a.mo6632b(bVar.f4411a);
                return this;
            }

            /* renamed from: c */
            public C0824a mo6852c(int... iArr) {
                this.f4413a.mo6633c(iArr);
                return this;
            }

            /* renamed from: d */
            public C0824a mo6853d(int i, boolean z) {
                this.f4413a.mo6634d(i, z);
                return this;
            }

            /* renamed from: e */
            public C0823b mo6854e() {
                return new C0823b(this.f4413a.mo6635e());
            }
        }

        /* renamed from: d */
        public static C0823b m5716d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(m5717e(0));
            if (integerArrayList == null) {
                return f4409d;
            }
            C0824a aVar = new C0824a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.mo6850a(integerArrayList.get(i).intValue());
            }
            return aVar.mo6854e();
        }

        /* renamed from: e */
        public static String m5717e(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: c */
        public boolean mo6847c(int i) {
            return this.f4411a.mo6625a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0823b)) {
                return false;
            }
            return this.f4411a.equals(((C0823b) obj).f4411a);
        }

        public int hashCode() {
            return this.f4411a.hashCode();
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f4411a.mo6628d(); i++) {
                arrayList.add(Integer.valueOf(this.f4411a.mo6627c(i)));
            }
            bundle.putIntegerArrayList(m5717e(0), arrayList);
            return bundle;
        }

        public C0823b(C0789g gVar) {
            this.f4411a = gVar;
        }
    }

    /* renamed from: androidx.media3.common.o$c */
    /* compiled from: Player */
    public static final class C0825c {

        /* renamed from: a */
        public final C0789g f4414a;

        public C0825c(C0789g gVar) {
            this.f4414a = gVar;
        }

        /* renamed from: a */
        public boolean mo6855a(int i) {
            return this.f4414a.mo6625a(i);
        }

        /* renamed from: b */
        public boolean mo6856b(int... iArr) {
            return this.f4414a.mo6626b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0825c)) {
                return false;
            }
            return this.f4414a.equals(((C0825c) obj).f4414a);
        }

        public int hashCode() {
            return this.f4414a.hashCode();
        }
    }

    /* renamed from: androidx.media3.common.o$d */
    /* compiled from: Player */
    public interface C0826d {
        /* renamed from: D */
        void mo6715D(int i);

        @Deprecated
        /* renamed from: E */
        void mo6716E(boolean z);

        /* renamed from: H */
        void mo6717H(boolean z);

        /* renamed from: J */
        void mo6718J(int i, boolean z);

        /* renamed from: L */
        void mo6719L(C0816l lVar);

        /* renamed from: N */
        void mo6720N(C0840v vVar);

        /* renamed from: P */
        void mo6721P();

        /* renamed from: Q */
        void mo6722Q(C0798k kVar, int i);

        /* renamed from: T */
        void mo6723T(PlaybackException playbackException);

        /* renamed from: V */
        void mo6724V(int i, int i2);

        /* renamed from: W */
        void mo6725W(C0823b bVar);

        @Deprecated
        /* renamed from: Z */
        void mo6726Z(int i);

        /* renamed from: a0 */
        void mo6727a0(boolean z);

        /* renamed from: b */
        void mo6728b(boolean z);

        @Deprecated
        /* renamed from: b0 */
        void mo6729b0();

        /* renamed from: c0 */
        void mo6730c0(C0821o oVar, C0825c cVar);

        /* renamed from: e0 */
        void mo6731e0(C0831s sVar, int i);

        /* renamed from: g */
        void mo6733g(int i);

        @Deprecated
        /* renamed from: g0 */
        void mo6734g0(boolean z, int i);

        /* renamed from: h */
        void mo6735h(C0844x xVar);

        /* renamed from: h0 */
        void mo6736h0(C0842w wVar);

        /* renamed from: i0 */
        void mo6738i0(C0788f fVar);

        /* renamed from: k */
        void mo6739k(C0820n nVar);

        /* renamed from: k0 */
        void mo6740k0(PlaybackException playbackException);

        @Deprecated
        /* renamed from: m */
        void mo6741m(List<dx0> list);

        /* renamed from: o0 */
        void mo6742o0(C0827e eVar, C0827e eVar2, int i);

        /* renamed from: p0 */
        void mo6743p0(boolean z);

        /* renamed from: t */
        void mo6744t(hx0 hx0);

        /* renamed from: w */
        void mo6745w(int i);

        /* renamed from: x */
        void mo6746x(Metadata metadata);

        /* renamed from: z */
        void mo6747z(boolean z, int i);
    }

    /* renamed from: androidx.media3.common.o$e */
    /* compiled from: Player */
    public static final class C0827e implements C0785d {

        /* renamed from: B */
        public static final C0785d.C0786a<C0827e> f4415B = new eq4();

        /* renamed from: A */
        public final int f4416A;

        /* renamed from: a */
        public final Object f4417a;
        @Deprecated

        /* renamed from: d */
        public final int f4418d;

        /* renamed from: e */
        public final int f4419e;

        /* renamed from: g */
        public final C0798k f4420g;

        /* renamed from: k */
        public final Object f4421k;

        /* renamed from: r */
        public final int f4422r;

        /* renamed from: s */
        public final long f4423s;

        /* renamed from: x */
        public final long f4424x;

        /* renamed from: y */
        public final int f4425y;

        public C0827e(Object obj, int i, C0798k kVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f4417a = obj;
            this.f4418d = i;
            this.f4419e = i;
            this.f4420g = kVar;
            this.f4421k = obj2;
            this.f4422r = i2;
            this.f4423s = j;
            this.f4424x = j2;
            this.f4425y = i3;
            this.f4416A = i4;
        }

        /* renamed from: b */
        public static C0827e m5758b(Bundle bundle) {
            C0798k kVar;
            int i = bundle.getInt(m5759c(0), -1);
            Bundle bundle2 = bundle.getBundle(m5759c(1));
            if (bundle2 == null) {
                kVar = null;
            } else {
                kVar = C0798k.f4241A.mo104a(bundle2);
            }
            return new C0827e((Object) null, i, kVar, (Object) null, bundle.getInt(m5759c(2), -1), bundle.getLong(m5759c(3), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED), bundle.getLong(m5759c(4), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED), bundle.getInt(m5759c(5), -1), bundle.getInt(m5759c(6), -1));
        }

        /* renamed from: c */
        public static String m5759c(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0827e.class != obj.getClass()) {
                return false;
            }
            C0827e eVar = (C0827e) obj;
            if (this.f4419e == eVar.f4419e && this.f4422r == eVar.f4422r && this.f4423s == eVar.f4423s && this.f4424x == eVar.f4424x && this.f4425y == eVar.f4425y && this.f4416A == eVar.f4416A && jf4.m46496a(this.f4417a, eVar.f4417a) && jf4.m46496a(this.f4421k, eVar.f4421k) && jf4.m46496a(this.f4420g, eVar.f4420g)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return jf4.m46497b(this.f4417a, Integer.valueOf(this.f4419e), this.f4420g, this.f4421k, Integer.valueOf(this.f4422r), Long.valueOf(this.f4423s), Long.valueOf(this.f4424x), Integer.valueOf(this.f4425y), Integer.valueOf(this.f4416A));
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(m5759c(0), this.f4419e);
            if (this.f4420g != null) {
                bundle.putBundle(m5759c(1), this.f4420g.toBundle());
            }
            bundle.putInt(m5759c(2), this.f4422r);
            bundle.putLong(m5759c(3), this.f4423s);
            bundle.putLong(m5759c(4), this.f4424x);
            bundle.putInt(m5759c(5), this.f4425y);
            bundle.putInt(m5759c(6), this.f4416A);
            return bundle;
        }
    }

    /* renamed from: A */
    void mo6595A();

    /* renamed from: B */
    void mo6676B(TextureView textureView);

    /* renamed from: C */
    void mo6677C(int i, long j);

    /* renamed from: D */
    C0823b mo6842D();

    /* renamed from: E */
    boolean mo6678E();

    /* renamed from: F */
    void mo6679F(boolean z);

    /* renamed from: G */
    long mo6843G();

    /* renamed from: H */
    int mo6680H();

    /* renamed from: I */
    void mo6681I(TextureView textureView);

    /* renamed from: J */
    C0844x mo6682J();

    /* renamed from: K */
    boolean mo6596K();

    /* renamed from: L */
    int mo6683L();

    /* renamed from: M */
    long mo6684M();

    /* renamed from: N */
    long mo6685N();

    /* renamed from: O */
    boolean mo6597O();

    /* renamed from: P */
    int mo6686P();

    /* renamed from: Q */
    boolean mo6598Q();

    /* renamed from: R */
    int mo6687R();

    /* renamed from: S */
    void mo6688S(int i);

    /* renamed from: T */
    void mo6689T(C0840v vVar);

    /* renamed from: U */
    void mo6690U(SurfaceView surfaceView);

    /* renamed from: V */
    int mo6691V();

    /* renamed from: W */
    boolean mo6692W();

    /* renamed from: X */
    long mo6693X();

    /* renamed from: Y */
    void mo6599Y();

    /* renamed from: Z */
    void mo6600Z();

    /* renamed from: a */
    void mo6844a();

    /* renamed from: a0 */
    C0816l mo6694a0();

    /* renamed from: b */
    void mo6695b(C0820n nVar);

    /* renamed from: b0 */
    long mo6696b0();

    /* renamed from: c */
    void mo6601c();

    /* renamed from: c0 */
    long mo6697c0();

    /* renamed from: d */
    C0820n mo6698d();

    /* renamed from: d0 */
    boolean mo6602d0();

    /* renamed from: e */
    void mo6699e();

    /* renamed from: f */
    void mo6604f();

    /* renamed from: g */
    boolean mo6701g();

    long getDuration();

    /* renamed from: h */
    long mo6703h();

    /* renamed from: i */
    void mo6845i(List<C0798k> list, boolean z);

    /* renamed from: j */
    void mo6704j(SurfaceView surfaceView);

    /* renamed from: k */
    void mo6610k();

    /* renamed from: l */
    PlaybackException mo6705l();

    /* renamed from: m */
    void mo6846m(boolean z);

    /* renamed from: n */
    void mo6614n(C0798k kVar);

    /* renamed from: o */
    C0842w mo6706o();

    /* renamed from: p */
    boolean mo6617p();

    /* renamed from: q */
    hx0 mo6707q();

    /* renamed from: r */
    void mo6708r(C0826d dVar);

    /* renamed from: s */
    int mo6709s();

    /* renamed from: t */
    boolean mo6618t(int i);

    /* renamed from: u */
    boolean mo6619u();

    /* renamed from: v */
    void mo6710v(C0826d dVar);

    /* renamed from: w */
    int mo6711w();

    /* renamed from: x */
    C0831s mo6712x();

    /* renamed from: y */
    Looper mo6713y();

    /* renamed from: z */
    C0840v mo6714z();
}
