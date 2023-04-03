package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.media3.common.C0776a;
import androidx.media3.common.C0785d;
import androidx.media3.common.C0798k;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: androidx.media3.common.s */
/* compiled from: Timeline */
public abstract class C0831s implements C0785d {

    /* renamed from: a */
    public static final C0831s f4433a = new C0832a();

    /* renamed from: d */
    public static final C0785d.C0786a<C0831s> f4434d = new nq6();

    /* renamed from: androidx.media3.common.s$a */
    /* compiled from: Timeline */
    public class C0832a extends C0831s {
        /* renamed from: f */
        public int mo6867f(Object obj) {
            return -1;
        }

        /* renamed from: k */
        public C0833b mo6873k(int i, C0833b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: m */
        public int mo6875m() {
            return 0;
        }

        /* renamed from: q */
        public Object mo6879q(int i) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: s */
        public C0835d mo6881s(int i, C0835d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: t */
        public int mo6882t() {
            return 0;
        }
    }

    /* renamed from: androidx.media3.common.s$b */
    /* compiled from: Timeline */
    public static final class C0833b implements C0785d {

        /* renamed from: x */
        public static final C0785d.C0786a<C0833b> f4435x = new oq6();

        /* renamed from: a */
        public Object f4436a;

        /* renamed from: d */
        public Object f4437d;

        /* renamed from: e */
        public int f4438e;

        /* renamed from: g */
        public long f4439g;

        /* renamed from: k */
        public long f4440k;

        /* renamed from: r */
        public boolean f4441r;

        /* renamed from: s */
        public C0776a f4442s = C0776a.f4125s;

        /* renamed from: c */
        public static C0833b m5801c(Bundle bundle) {
            C0776a aVar;
            int i = bundle.getInt(m5802u(0), 0);
            long j = bundle.getLong(m5802u(1), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
            long j2 = bundle.getLong(m5802u(2), 0);
            boolean z = bundle.getBoolean(m5802u(3));
            Bundle bundle2 = bundle.getBundle(m5802u(4));
            if (bundle2 != null) {
                aVar = C0776a.f4127y.mo104a(bundle2);
            } else {
                aVar = C0776a.f4125s;
            }
            C0776a aVar2 = aVar;
            C0833b bVar = new C0833b();
            bVar.mo6906w((Object) null, (Object) null, i, j, j2, aVar2, z);
            return bVar;
        }

        /* renamed from: u */
        public static String m5802u(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: d */
        public int mo6886d(int i) {
            return this.f4442s.mo6572c(i).f4136d;
        }

        /* renamed from: e */
        public long mo6887e(int i, int i2) {
            C0776a.C0777a c = this.f4442s.mo6572c(i);
            if (c.f4136d != -1) {
                return c.f4139k[i2];
            }
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C0833b.class.equals(obj.getClass())) {
                return false;
            }
            C0833b bVar = (C0833b) obj;
            if (w67.m29346c(this.f4436a, bVar.f4436a) && w67.m29346c(this.f4437d, bVar.f4437d) && this.f4438e == bVar.f4438e && this.f4439g == bVar.f4439g && this.f4440k == bVar.f4440k && this.f4441r == bVar.f4441r && w67.m29346c(this.f4442s, bVar.f4442s)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int mo6889f() {
            return this.f4442s.f4129d;
        }

        /* renamed from: g */
        public int mo6890g(long j) {
            return this.f4442s.mo6573d(j, this.f4439g);
        }

        /* renamed from: h */
        public int mo6891h(long j) {
            return this.f4442s.mo6574e(j, this.f4439g);
        }

        public int hashCode() {
            int i;
            Object obj = this.f4436a;
            int i2 = 0;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            int i3 = (217 + i) * 31;
            Object obj2 = this.f4437d;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            long j = this.f4439g;
            long j2 = this.f4440k;
            return ((((((((((i3 + i2) * 31) + this.f4438e) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f4441r ? 1 : 0)) * 31) + this.f4442s.hashCode();
        }

        /* renamed from: i */
        public long mo6893i(int i) {
            return this.f4442s.mo6572c(i).f4135a;
        }

        /* renamed from: j */
        public long mo6894j() {
            return this.f4442s.f4130e;
        }

        /* renamed from: k */
        public int mo6895k(int i, int i2) {
            C0776a.C0777a c = this.f4442s.mo6572c(i);
            if (c.f4136d != -1) {
                return c.f4138g[i2];
            }
            return 0;
        }

        /* renamed from: l */
        public long mo6896l(int i) {
            return this.f4442s.mo6572c(i).f4140r;
        }

        /* renamed from: m */
        public long mo6897m() {
            return this.f4439g;
        }

        /* renamed from: n */
        public int mo6898n(int i) {
            return this.f4442s.mo6572c(i).mo6579e();
        }

        /* renamed from: o */
        public int mo6899o(int i, int i2) {
            return this.f4442s.mo6572c(i).mo6581f(i2);
        }

        /* renamed from: p */
        public long mo6900p() {
            return w67.m29335U0(this.f4440k);
        }

        /* renamed from: q */
        public long mo6901q() {
            return this.f4440k;
        }

        /* renamed from: r */
        public int mo6902r() {
            return this.f4442s.f4132k;
        }

        /* renamed from: s */
        public boolean mo6903s(int i) {
            return !this.f4442s.mo6572c(i).mo6582g();
        }

        /* renamed from: t */
        public boolean mo6904t(int i) {
            return this.f4442s.mo6572c(i).f4141s;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(m5802u(0), this.f4438e);
            bundle.putLong(m5802u(1), this.f4439g);
            bundle.putLong(m5802u(2), this.f4440k);
            bundle.putBoolean(m5802u(3), this.f4441r);
            bundle.putBundle(m5802u(4), this.f4442s.toBundle());
            return bundle;
        }

        /* renamed from: v */
        public C0833b mo6905v(Object obj, Object obj2, int i, long j, long j2) {
            return mo6906w(obj, obj2, i, j, j2, C0776a.f4125s, false);
        }

        /* renamed from: w */
        public C0833b mo6906w(Object obj, Object obj2, int i, long j, long j2, C0776a aVar, boolean z) {
            this.f4436a = obj;
            this.f4437d = obj2;
            this.f4438e = i;
            this.f4439g = j;
            this.f4440k = j2;
            this.f4442s = aVar;
            this.f4441r = z;
            return this;
        }
    }

    /* renamed from: androidx.media3.common.s$c */
    /* compiled from: Timeline */
    public static final class C0834c extends C0831s {

        /* renamed from: e */
        public final ImmutableList<C0835d> f4443e;

        /* renamed from: g */
        public final ImmutableList<C0833b> f4444g;

        /* renamed from: k */
        public final int[] f4445k;

        /* renamed from: r */
        public final int[] f4446r;

        public C0834c(ImmutableList<C0835d> immutableList, ImmutableList<C0833b> immutableList2, int[] iArr) {
            boolean z;
            if (immutableList.size() == iArr.length) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20981a(z);
            this.f4443e = immutableList;
            this.f4444g = immutableList2;
            this.f4445k = iArr;
            this.f4446r = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f4446r[iArr[i]] = i;
            }
        }

        /* renamed from: e */
        public int mo6865e(boolean z) {
            if (mo6883u()) {
                return -1;
            }
            if (z) {
                return this.f4445k[0];
            }
            return 0;
        }

        /* renamed from: f */
        public int mo6867f(Object obj) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public int mo6868g(boolean z) {
            if (mo6883u()) {
                return -1;
            }
            if (z) {
                return this.f4445k[mo6882t() - 1];
            }
            return mo6882t() - 1;
        }

        /* renamed from: i */
        public int mo6871i(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == mo6868g(z)) {
                if (i2 == 2) {
                    return mo6865e(z);
                }
                return -1;
            } else if (z) {
                return this.f4445k[this.f4446r[i] + 1];
            } else {
                return i + 1;
            }
        }

        /* renamed from: k */
        public C0833b mo6873k(int i, C0833b bVar, boolean z) {
            C0833b bVar2 = this.f4444g.get(i);
            bVar.mo6906w(bVar2.f4436a, bVar2.f4437d, bVar2.f4438e, bVar2.f4439g, bVar2.f4440k, bVar2.f4442s, bVar2.f4441r);
            return bVar;
        }

        /* renamed from: m */
        public int mo6875m() {
            return this.f4444g.size();
        }

        /* renamed from: p */
        public int mo6878p(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == mo6865e(z)) {
                if (i2 == 2) {
                    return mo6868g(z);
                }
                return -1;
            } else if (z) {
                return this.f4445k[this.f4446r[i] - 1];
            } else {
                return i - 1;
            }
        }

        /* renamed from: q */
        public Object mo6879q(int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public C0835d mo6881s(int i, C0835d dVar, long j) {
            C0835d dVar2 = dVar;
            C0835d dVar3 = this.f4443e.get(i);
            Object obj = dVar3.f4459a;
            C0798k kVar = dVar3.f4461e;
            C0798k kVar2 = kVar;
            C0835d dVar4 = dVar3;
            C0835d dVar5 = dVar;
            dVar5.mo6915k(obj, kVar2, dVar3.f4462g, dVar3.f4463k, dVar3.f4464r, dVar3.f4465s, dVar3.f4466x, dVar3.f4467y, dVar3.f4452B, dVar3.f4454H, dVar4.f4455I, dVar4.f4456L, dVar4.f4457M, dVar4.f4458P);
            C0835d dVar6 = dVar;
            dVar6.f4453C = dVar4.f4453C;
            return dVar6;
        }

        /* renamed from: t */
        public int mo6882t() {
            return this.f4443e.size();
        }
    }

    /* renamed from: androidx.media3.common.s$d */
    /* compiled from: Timeline */
    public static final class C0835d implements C0785d {

        /* renamed from: Q */
        public static final Object f4447Q = new Object();

        /* renamed from: U */
        public static final Object f4448U = new Object();

        /* renamed from: X */
        public static final C0798k f4449X = new C0798k.C0801c().mo6756d("androidx.media3.common.Timeline").mo6759g(Uri.EMPTY).mo6753a();

        /* renamed from: Y */
        public static final C0785d.C0786a<C0835d> f4450Y = new pq6();
        @Deprecated

        /* renamed from: A */
        public boolean f4451A;

        /* renamed from: B */
        public C0798k.C0807g f4452B;

        /* renamed from: C */
        public boolean f4453C;

        /* renamed from: H */
        public long f4454H;

        /* renamed from: I */
        public long f4455I;

        /* renamed from: L */
        public int f4456L;

        /* renamed from: M */
        public int f4457M;

        /* renamed from: P */
        public long f4458P;

        /* renamed from: a */
        public Object f4459a = f4447Q;
        @Deprecated

        /* renamed from: d */
        public Object f4460d;

        /* renamed from: e */
        public C0798k f4461e = f4449X;

        /* renamed from: g */
        public Object f4462g;

        /* renamed from: k */
        public long f4463k;

        /* renamed from: r */
        public long f4464r;

        /* renamed from: s */
        public long f4465s;

        /* renamed from: x */
        public boolean f4466x;

        /* renamed from: y */
        public boolean f4467y;

        /* renamed from: c */
        public static C0835d m5834c(Bundle bundle) {
            C0798k kVar;
            Bundle bundle2 = bundle;
            Bundle bundle3 = bundle2.getBundle(m5835j(1));
            C0798k.C0807g gVar = null;
            if (bundle3 != null) {
                kVar = C0798k.f4241A.mo104a(bundle3);
            } else {
                kVar = null;
            }
            long j = bundle2.getLong(m5835j(2), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
            long j2 = bundle2.getLong(m5835j(3), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
            long j3 = bundle2.getLong(m5835j(4), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
            boolean z = bundle2.getBoolean(m5835j(5), false);
            boolean z2 = bundle2.getBoolean(m5835j(6), false);
            Bundle bundle4 = bundle2.getBundle(m5835j(7));
            if (bundle4 != null) {
                gVar = C0798k.C0807g.f4296s.mo104a(bundle4);
            }
            boolean z3 = bundle2.getBoolean(m5835j(8), false);
            long j4 = bundle2.getLong(m5835j(9), 0);
            long j5 = bundle2.getLong(m5835j(10), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
            int i = bundle2.getInt(m5835j(11), 0);
            int i2 = bundle2.getInt(m5835j(12), 0);
            long j6 = bundle2.getLong(m5835j(13), 0);
            C0835d dVar = r0;
            C0835d dVar2 = new C0835d();
            dVar.mo6915k(f4448U, kVar, (Object) null, j, j2, j3, z, z2, gVar, j4, j5, i, i2, j6);
            dVar2.f4453C = z3;
            return dVar2;
        }

        /* renamed from: j */
        public static String m5835j(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: d */
        public long mo6907d() {
            return w67.m29339X(this.f4465s);
        }

        /* renamed from: e */
        public long mo6908e() {
            return w67.m29335U0(this.f4454H);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C0835d.class.equals(obj.getClass())) {
                return false;
            }
            C0835d dVar = (C0835d) obj;
            if (w67.m29346c(this.f4459a, dVar.f4459a) && w67.m29346c(this.f4461e, dVar.f4461e) && w67.m29346c(this.f4462g, dVar.f4462g) && w67.m29346c(this.f4452B, dVar.f4452B) && this.f4463k == dVar.f4463k && this.f4464r == dVar.f4464r && this.f4465s == dVar.f4465s && this.f4466x == dVar.f4466x && this.f4467y == dVar.f4467y && this.f4453C == dVar.f4453C && this.f4454H == dVar.f4454H && this.f4455I == dVar.f4455I && this.f4456L == dVar.f4456L && this.f4457M == dVar.f4457M && this.f4458P == dVar.f4458P) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public long mo6910f() {
            return this.f4454H;
        }

        /* renamed from: g */
        public long mo6911g() {
            return w67.m29335U0(this.f4455I);
        }

        /* renamed from: h */
        public long mo6912h() {
            return this.f4458P;
        }

        public int hashCode() {
            int i;
            int hashCode = (((217 + this.f4459a.hashCode()) * 31) + this.f4461e.hashCode()) * 31;
            Object obj = this.f4462g;
            int i2 = 0;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            int i3 = (hashCode + i) * 31;
            C0798k.C0807g gVar = this.f4452B;
            if (gVar != null) {
                i2 = gVar.hashCode();
            }
            long j = this.f4463k;
            long j2 = this.f4464r;
            long j3 = this.f4465s;
            long j4 = this.f4454H;
            long j5 = this.f4455I;
            long j6 = this.f4458P;
            return ((((((((((((((((((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f4466x ? 1 : 0)) * 31) + (this.f4467y ? 1 : 0)) * 31) + (this.f4453C ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f4456L) * 31) + this.f4457M) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* renamed from: i */
        public boolean mo6914i() {
            boolean z;
            boolean z2;
            boolean z3 = this.f4451A;
            if (this.f4452B != null) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            C2725kr.m20987g(z2);
            if (this.f4452B != null) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public C0835d mo6915k(Object obj, C0798k kVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C0798k.C0807g gVar, long j4, long j5, int i, int i2, long j6) {
            C0798k kVar2;
            Object obj3;
            boolean z3;
            C0798k.C0809h hVar;
            C0798k kVar3 = kVar;
            C0798k.C0807g gVar2 = gVar;
            this.f4459a = obj;
            if (kVar3 != null) {
                kVar2 = kVar3;
            } else {
                kVar2 = f4449X;
            }
            this.f4461e = kVar2;
            if (kVar3 == null || (hVar = kVar3.f4244d) == null) {
                obj3 = null;
            } else {
                obj3 = hVar.f4314h;
            }
            this.f4460d = obj3;
            this.f4462g = obj2;
            this.f4463k = j;
            this.f4464r = j2;
            this.f4465s = j3;
            this.f4466x = z;
            this.f4467y = z2;
            if (gVar2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f4451A = z3;
            this.f4452B = gVar2;
            this.f4454H = j4;
            this.f4455I = j5;
            this.f4456L = i;
            this.f4457M = i2;
            this.f4458P = j6;
            this.f4453C = false;
            return this;
        }

        /* renamed from: l */
        public final Bundle mo6916l(boolean z) {
            C0798k kVar;
            Bundle bundle = new Bundle();
            String j = m5835j(1);
            if (z) {
                kVar = C0798k.f4242y;
            } else {
                kVar = this.f4461e;
            }
            bundle.putBundle(j, kVar.toBundle());
            bundle.putLong(m5835j(2), this.f4463k);
            bundle.putLong(m5835j(3), this.f4464r);
            bundle.putLong(m5835j(4), this.f4465s);
            bundle.putBoolean(m5835j(5), this.f4466x);
            bundle.putBoolean(m5835j(6), this.f4467y);
            C0798k.C0807g gVar = this.f4452B;
            if (gVar != null) {
                bundle.putBundle(m5835j(7), gVar.toBundle());
            }
            bundle.putBoolean(m5835j(8), this.f4453C);
            bundle.putLong(m5835j(9), this.f4454H);
            bundle.putLong(m5835j(10), this.f4455I);
            bundle.putInt(m5835j(11), this.f4456L);
            bundle.putInt(m5835j(12), this.f4457M);
            bundle.putLong(m5835j(13), this.f4458P);
            return bundle;
        }

        public Bundle toBundle() {
            return mo6916l(false);
        }
    }

    /* renamed from: b */
    public static C0831s m5770b(Bundle bundle) {
        ImmutableList<C0835d> c = m5771c(C0835d.f4450Y, a60.m80a(bundle, m5773w(0)));
        ImmutableList<C0833b> c2 = m5771c(C0833b.f4435x, a60.m80a(bundle, m5773w(1)));
        int[] intArray = bundle.getIntArray(m5773w(2));
        if (intArray == null) {
            intArray = m5772d(c.size());
        }
        return new C0834c(c, c2, intArray);
    }

    /* renamed from: c */
    public static <T extends C0785d> ImmutableList<T> m5771c(C0785d.C0786a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.m36627of();
        }
        ImmutableList.C4534a aVar2 = new ImmutableList.C4534a();
        ImmutableList<Bundle> a = z50.m30972a(iBinder);
        for (int i = 0; i < a.size(); i++) {
            aVar2.mo34667a(aVar.mo104a(a.get(i)));
        }
        return aVar2.mo34692l();
    }

    /* renamed from: d */
    public static int[] m5772d(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    /* renamed from: w */
    public static String m5773w(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: e */
    public int mo6865e(boolean z) {
        if (mo6883u()) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        int g;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0831s)) {
            return false;
        }
        C0831s sVar = (C0831s) obj;
        if (sVar.mo6882t() != mo6882t() || sVar.mo6875m() != mo6875m()) {
            return false;
        }
        C0835d dVar = new C0835d();
        C0833b bVar = new C0833b();
        C0835d dVar2 = new C0835d();
        C0833b bVar2 = new C0833b();
        for (int i = 0; i < mo6882t(); i++) {
            if (!mo6880r(i, dVar).equals(sVar.mo6880r(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo6875m(); i2++) {
            if (!mo6873k(i2, bVar, true).equals(sVar.mo6873k(i2, bVar2, true))) {
                return false;
            }
        }
        int e = mo6865e(true);
        if (e != sVar.mo6865e(true) || (g = mo6868g(true)) != sVar.mo6868g(true)) {
            return false;
        }
        while (e != g) {
            int i3 = mo6871i(e, 0, true);
            if (i3 != sVar.mo6871i(e, 0, true)) {
                return false;
            }
            e = i3;
        }
        return true;
    }

    /* renamed from: f */
    public abstract int mo6867f(Object obj);

    /* renamed from: g */
    public int mo6868g(boolean z) {
        if (mo6883u()) {
            return -1;
        }
        return mo6882t() - 1;
    }

    /* renamed from: h */
    public final int mo6869h(int i, C0833b bVar, C0835d dVar, int i2, boolean z) {
        int i3 = mo6872j(i, bVar).f4438e;
        if (mo6880r(i3, dVar).f4457M != i) {
            return i + 1;
        }
        int i4 = mo6871i(i3, i2, z);
        if (i4 == -1) {
            return -1;
        }
        return mo6880r(i4, dVar).f4456L;
    }

    public int hashCode() {
        C0835d dVar = new C0835d();
        C0833b bVar = new C0833b();
        int t = 217 + mo6882t();
        for (int i = 0; i < mo6882t(); i++) {
            t = (t * 31) + mo6880r(i, dVar).hashCode();
        }
        int m = (t * 31) + mo6875m();
        for (int i2 = 0; i2 < mo6875m(); i2++) {
            m = (m * 31) + mo6873k(i2, bVar, true).hashCode();
        }
        int e = mo6865e(true);
        while (e != -1) {
            m = (m * 31) + e;
            e = mo6871i(e, 0, true);
        }
        return m;
    }

    /* renamed from: i */
    public int mo6871i(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo6868g(z)) {
                return mo6865e(z);
            } else {
                return i + 1;
            }
        } else if (i == mo6868g(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: j */
    public final C0833b mo6872j(int i, C0833b bVar) {
        return mo6873k(i, bVar, false);
    }

    /* renamed from: k */
    public abstract C0833b mo6873k(int i, C0833b bVar, boolean z);

    /* renamed from: l */
    public C0833b mo6874l(Object obj, C0833b bVar) {
        return mo6873k(mo6867f(obj), bVar, true);
    }

    /* renamed from: m */
    public abstract int mo6875m();

    /* renamed from: n */
    public final Pair<Object, Long> mo6876n(C0835d dVar, C0833b bVar, int i, long j) {
        return (Pair) C2725kr.m20985e(mo6877o(dVar, bVar, i, j, 0));
    }

    /* renamed from: o */
    public final Pair<Object, Long> mo6877o(C0835d dVar, C0833b bVar, int i, long j, long j2) {
        C2725kr.m20983c(i, 0, mo6882t());
        mo6881s(i, dVar, j2);
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j = dVar.mo6910f();
            if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return null;
            }
        }
        int i2 = dVar.f4456L;
        mo6872j(i2, bVar);
        while (i2 < dVar.f4457M && bVar.f4440k != j) {
            int i3 = i2 + 1;
            if (mo6872j(i3, bVar).f4440k > j) {
                break;
            }
            i2 = i3;
        }
        mo6873k(i2, bVar, true);
        long j3 = j - bVar.f4440k;
        long j4 = bVar.f4439g;
        if (j4 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(C2725kr.m20985e(bVar.f4437d), Long.valueOf(Math.max(0, j3)));
    }

    /* renamed from: p */
    public int mo6878p(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i == mo6865e(z)) {
                return mo6868g(z);
            } else {
                return i - 1;
            }
        } else if (i == mo6865e(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: q */
    public abstract Object mo6879q(int i);

    /* renamed from: r */
    public final C0835d mo6880r(int i, C0835d dVar) {
        return mo6881s(i, dVar, 0);
    }

    /* renamed from: s */
    public abstract C0835d mo6881s(int i, C0835d dVar, long j);

    /* renamed from: t */
    public abstract int mo6882t();

    public final Bundle toBundle() {
        return mo6885x(false);
    }

    /* renamed from: u */
    public final boolean mo6883u() {
        if (mo6882t() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo6884v(int i, C0833b bVar, C0835d dVar, int i2, boolean z) {
        if (mo6869h(i, bVar, dVar, i2, z) == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final Bundle mo6885x(boolean z) {
        ArrayList arrayList = new ArrayList();
        int t = mo6882t();
        C0835d dVar = new C0835d();
        for (int i = 0; i < t; i++) {
            arrayList.add(mo6881s(i, dVar, 0).mo6916l(z));
        }
        ArrayList arrayList2 = new ArrayList();
        int m = mo6875m();
        C0833b bVar = new C0833b();
        for (int i2 = 0; i2 < m; i2++) {
            arrayList2.add(mo6873k(i2, bVar, false).toBundle());
        }
        int[] iArr = new int[t];
        if (t > 0) {
            iArr[0] = mo6865e(true);
        }
        for (int i3 = 1; i3 < t; i3++) {
            iArr[i3] = mo6871i(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        a60.m82c(bundle, m5773w(0), new z50(arrayList));
        a60.m82c(bundle, m5773w(1), new z50(arrayList2));
        bundle.putIntArray(m5773w(2), iArr);
        return bundle;
    }
}
