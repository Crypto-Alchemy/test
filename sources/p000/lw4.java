package p000;

/* renamed from: lw4 */
/* compiled from: ProgramInformation */
public final class lw4 {

    /* renamed from: a */
    public final String f14740a;

    /* renamed from: b */
    public final String f14741b;

    /* renamed from: c */
    public final String f14742c;

    /* renamed from: d */
    public final String f14743d;

    /* renamed from: e */
    public final String f14744e;

    public lw4(String str, String str2, String str3, String str4, String str5) {
        this.f14740a = str;
        this.f14741b = str2;
        this.f14742c = str3;
        this.f14743d = str4;
        this.f14744e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw4)) {
            return false;
        }
        lw4 lw4 = (lw4) obj;
        if (!w67.m29346c(this.f14740a, lw4.f14740a) || !w67.m29346c(this.f14741b, lw4.f14741b) || !w67.m29346c(this.f14742c, lw4.f14742c) || !w67.m29346c(this.f14743d, lw4.f14743d) || !w67.m29346c(this.f14744e, lw4.f14744e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f14740a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (527 + i) * 31;
        String str2 = this.f14741b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.f14742c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.f14743d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.f14744e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }
}
