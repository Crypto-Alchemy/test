package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.C0785d;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: androidx.media3.common.a */
/* compiled from: AdPlaybackState */
public final class C0776a implements C0785d {

    /* renamed from: s */
    public static final C0776a f4125s = new C0776a((Object) null, new C0777a[0], 0, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, 0);

    /* renamed from: x */
    public static final C0777a f4126x = new C0777a(0).mo6585j(0);

    /* renamed from: y */
    public static final C0785d.C0786a<C0776a> f4127y = new C2539ib();

    /* renamed from: a */
    public final Object f4128a;

    /* renamed from: d */
    public final int f4129d;

    /* renamed from: e */
    public final long f4130e;

    /* renamed from: g */
    public final long f4131g;

    /* renamed from: k */
    public final int f4132k;

    /* renamed from: r */
    public final C0777a[] f4133r;

    /* renamed from: androidx.media3.common.a$a */
    /* compiled from: AdPlaybackState */
    public static final class C0777a implements C0785d {

        /* renamed from: x */
        public static final C0785d.C0786a<C0777a> f4134x = new C2586jb();

        /* renamed from: a */
        public final long f4135a;

        /* renamed from: d */
        public final int f4136d;

        /* renamed from: e */
        public final Uri[] f4137e;

        /* renamed from: g */
        public final int[] f4138g;

        /* renamed from: k */
        public final long[] f4139k;

        /* renamed from: r */
        public final long f4140r;

        /* renamed from: s */
        public final boolean f4141s;

        public C0777a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0, false);
        }

        /* renamed from: b */
        public static long[] m5282b(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
            return copyOf;
        }

        /* renamed from: c */
        public static int[] m5283c(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* renamed from: d */
        public static C0777a m5284d(Bundle bundle) {
            Uri[] uriArr;
            long[] jArr;
            long j = bundle.getLong(m5285h(0));
            int i = bundle.getInt(m5285h(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(m5285h(2));
            int[] intArray = bundle.getIntArray(m5285h(3));
            long[] longArray = bundle.getLongArray(m5285h(4));
            long j2 = bundle.getLong(m5285h(5));
            boolean z = bundle.getBoolean(m5285h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            int[] iArr = intArray;
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            if (longArray == null) {
                jArr = new long[0];
            } else {
                jArr = longArray;
            }
            return new C0777a(j, i, iArr, uriArr, jArr, j2, z);
        }

        /* renamed from: h */
        public static String m5285h(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: e */
        public int mo6579e() {
            return mo6581f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0777a.class != obj.getClass()) {
                return false;
            }
            C0777a aVar = (C0777a) obj;
            if (this.f4135a == aVar.f4135a && this.f4136d == aVar.f4136d && Arrays.equals(this.f4137e, aVar.f4137e) && Arrays.equals(this.f4138g, aVar.f4138g) && Arrays.equals(this.f4139k, aVar.f4139k) && this.f4140r == aVar.f4140r && this.f4141s == aVar.f4141s) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int mo6581f(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f4138g;
                if (i3 >= iArr.length || this.f4141s || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    return i3;
                }
                i3++;
            }
            return i3;
        }

        /* renamed from: g */
        public boolean mo6582g() {
            if (this.f4136d == -1) {
                return true;
            }
            for (int i = 0; i < this.f4136d; i++) {
                int i2 = this.f4138g[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.f4135a;
            long j2 = this.f4140r;
            return (((((((((((this.f4136d * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f4137e)) * 31) + Arrays.hashCode(this.f4138g)) * 31) + Arrays.hashCode(this.f4139k)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f4141s ? 1 : 0);
        }

        /* renamed from: i */
        public boolean mo6584i() {
            if (this.f4136d == -1 || mo6579e() < this.f4136d) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public C0777a mo6585j(int i) {
            int[] c = m5283c(this.f4138g, i);
            long[] b = m5282b(this.f4139k, i);
            return new C0777a(this.f4135a, i, c, (Uri[]) Arrays.copyOf(this.f4137e, i), b, this.f4140r, this.f4141s);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(m5285h(0), this.f4135a);
            bundle.putInt(m5285h(1), this.f4136d);
            bundle.putParcelableArrayList(m5285h(2), new ArrayList(Arrays.asList(this.f4137e)));
            bundle.putIntArray(m5285h(3), this.f4138g);
            bundle.putLongArray(m5285h(4), this.f4139k);
            bundle.putLong(m5285h(5), this.f4140r);
            bundle.putBoolean(m5285h(6), this.f4141s);
            return bundle;
        }

        public C0777a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            C2725kr.m20981a(iArr.length == uriArr.length);
            this.f4135a = j;
            this.f4136d = i;
            this.f4138g = iArr;
            this.f4137e = uriArr;
            this.f4139k = jArr;
            this.f4140r = j2;
            this.f4141s = z;
        }
    }

    public C0776a(Object obj, C0777a[] aVarArr, long j, long j2, int i) {
        this.f4128a = obj;
        this.f4130e = j;
        this.f4131g = j2;
        this.f4129d = aVarArr.length + i;
        this.f4133r = aVarArr;
        this.f4132k = i;
    }

    /* renamed from: b */
    public static C0776a m5275b(Bundle bundle) {
        C0777a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m5276g(1));
        if (parcelableArrayList == null) {
            aVarArr = new C0777a[0];
        } else {
            C0777a[] aVarArr2 = new C0777a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                aVarArr2[i] = C0777a.f4134x.mo104a((Bundle) parcelableArrayList.get(i));
            }
            aVarArr = aVarArr2;
        }
        return new C0776a((Object) null, aVarArr, bundle.getLong(m5276g(2), 0), bundle.getLong(m5276g(3), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED), bundle.getInt(m5276g(4)));
    }

    /* renamed from: g */
    public static String m5276g(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: c */
    public C0777a mo6572c(int i) {
        int i2 = this.f4132k;
        if (i < i2) {
            return f4126x;
        }
        return this.f4133r[i - i2];
    }

    /* renamed from: d */
    public int mo6573d(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j >= j2) {
            return -1;
        }
        int i = this.f4132k;
        while (i < this.f4129d && ((mo6572c(i).f4135a != Long.MIN_VALUE && mo6572c(i).f4135a <= j) || !mo6572c(i).mo6584i())) {
            i++;
        }
        if (i < this.f4129d) {
            return i;
        }
        return -1;
    }

    /* renamed from: e */
    public int mo6574e(long j, long j2) {
        int i = this.f4129d - 1;
        while (i >= 0 && mo6576f(j, j2, i)) {
            i--;
        }
        if (i < 0 || !mo6572c(i).mo6582g()) {
            return -1;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0776a.class != obj.getClass()) {
            return false;
        }
        C0776a aVar = (C0776a) obj;
        if (w67.m29346c(this.f4128a, aVar.f4128a) && this.f4129d == aVar.f4129d && this.f4130e == aVar.f4130e && this.f4131g == aVar.f4131g && this.f4132k == aVar.f4132k && Arrays.equals(this.f4133r, aVar.f4133r)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo6576f(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = mo6572c(i).f4135a;
        if (j3 == Long.MIN_VALUE) {
            if (j2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j < j2) {
                return true;
            }
            return false;
        } else if (j < j3) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int i;
        int i2 = this.f4129d * 31;
        Object obj = this.f4128a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return ((((((((i2 + i) * 31) + ((int) this.f4130e)) * 31) + ((int) this.f4131g)) * 31) + this.f4132k) * 31) + Arrays.hashCode(this.f4133r);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (C0777a bundle2 : this.f4133r) {
            arrayList.add(bundle2.toBundle());
        }
        bundle.putParcelableArrayList(m5276g(1), arrayList);
        bundle.putLong(m5276g(2), this.f4130e);
        bundle.putLong(m5276g(3), this.f4131g);
        bundle.putInt(m5276g(4), this.f4132k);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f4128a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f4130e);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f4133r.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f4133r[i].f4135a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f4133r[i].f4138g.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f4133r[i].f4138g[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f4133r[i].f4139k[i2]);
                sb.append(')');
                if (i2 < this.f4133r[i].f4138g.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f4133r.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
