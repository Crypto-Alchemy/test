package p000;

import java.util.Arrays;

/* renamed from: vu7 */
public final class vu7 {

    /* renamed from: a */
    public final String f35168a;

    /* renamed from: b */
    public final long f35169b;

    /* renamed from: c */
    public final int f35170c;

    /* renamed from: d */
    public final boolean f35171d;

    /* renamed from: e */
    public final boolean f35172e;

    /* renamed from: f */
    public final byte[] f35173f;

    public vu7() {
    }

    public vu7(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f35168a = str;
        this.f35169b = j;
        this.f35170c = i;
        this.f35171d = z;
        this.f35172e = z2;
        this.f35173f = bArr;
    }

    /* renamed from: a */
    public static vu7 m53552a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new vu7(str, j, i, z, z2, bArr);
    }

    /* renamed from: b */
    public final boolean mo48828b() {
        if (mo48830d() == null) {
            return false;
        }
        return mo48830d().endsWith("/");
    }

    /* renamed from: c */
    public final boolean mo48829c() {
        return mo48833f() == 0;
    }

    /* renamed from: d */
    public String mo48830d() {
        return this.f35168a;
    }

    /* renamed from: e */
    public long mo48831e() {
        return this.f35169b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vu7) {
            vu7 vu7 = (vu7) obj;
            String str = this.f35168a;
            if (str != null ? str.equals(vu7.mo48830d()) : vu7.mo48830d() == null) {
                return this.f35169b == vu7.mo48831e() && this.f35170c == vu7.mo48833f() && this.f35171d == vu7.mo48834g() && this.f35172e == vu7.mo48835h() && Arrays.equals(this.f35173f, vu7.f35173f);
            }
        }
    }

    /* renamed from: f */
    public int mo48833f() {
        return this.f35170c;
    }

    /* renamed from: g */
    public boolean mo48834g() {
        return this.f35171d;
    }

    /* renamed from: h */
    public boolean mo48835h() {
        return this.f35172e;
    }

    public int hashCode() {
        String str = this.f35168a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f35169b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f35170c) * 1000003) ^ (true != this.f35171d ? 1237 : 1231)) * 1000003;
        if (true == this.f35172e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f35173f);
    }

    /* renamed from: i */
    public byte[] mo48837i() {
        return this.f35173f;
    }

    public String toString() {
        String str = this.f35168a;
        long j = this.f35169b;
        int i = this.f35170c;
        boolean z = this.f35171d;
        boolean z2 = this.f35172e;
        String arrays = Arrays.toString(this.f35173f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
