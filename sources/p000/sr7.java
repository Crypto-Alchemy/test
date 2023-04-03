package p000;

/* renamed from: sr7 */
public final class sr7 extends C6289nr {

    /* renamed from: b */
    public final int f33985b;

    /* renamed from: c */
    public final String f33986c;

    /* renamed from: d */
    public final String f33987d;

    public sr7(int i, String str, String str2) {
        this.f33985b = i;
        this.f33986c = str;
        this.f33987d = str2;
    }

    /* renamed from: a */
    public final String mo46134a() {
        return this.f33987d;
    }

    /* renamed from: c */
    public final int mo46135c() {
        return this.f33985b;
    }

    /* renamed from: d */
    public final String mo46136d() {
        return this.f33986c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6289nr) {
            C6289nr nrVar = (C6289nr) obj;
            if (this.f33985b == nrVar.mo46135c() && ((str = this.f33986c) != null ? str.equals(nrVar.mo46136d()) : nrVar.mo46136d() == null)) {
                String str2 = this.f33987d;
                String a = nrVar.mo46134a();
                if (str2 != null ? str2.equals(a) : a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f33985b ^ 1000003) * 1000003;
        String str = this.f33986c;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f33987d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f33985b;
        String str = this.f33986c;
        String str2 = this.f33987d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
