package p000;

import com.google.android.play.core.assetpacks.AssetPackState;

/* renamed from: ur7 */
public final class ur7 extends AssetPackState {

    /* renamed from: a */
    public final String f34689a;

    /* renamed from: b */
    public final int f34690b;

    /* renamed from: c */
    public final int f34691c;

    /* renamed from: d */
    public final long f34692d;

    /* renamed from: e */
    public final long f34693e;

    /* renamed from: f */
    public final int f34694f;

    /* renamed from: g */
    public final int f34695g;

    public ur7(String str, int i, int i2, long j, long j2, int i3, int i4) {
        if (str != null) {
            this.f34689a = str;
            this.f34690b = i;
            this.f34691c = i2;
            this.f34692d = j;
            this.f34693e = j2;
            this.f34694f = i3;
            this.f34695g = i4;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo34139a() {
        return this.f34695g;
    }

    /* renamed from: c */
    public final long mo34140c() {
        return this.f34692d;
    }

    /* renamed from: e */
    public final int mo34141e() {
        return this.f34691c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f34689a.equals(assetPackState.mo34142f()) && this.f34690b == assetPackState.mo34143g() && this.f34691c == assetPackState.mo34141e() && this.f34692d == assetPackState.mo34140c() && this.f34693e == assetPackState.mo34144h() && this.f34694f == assetPackState.mo34145i() && this.f34695g == assetPackState.mo34139a();
        }
    }

    /* renamed from: f */
    public final String mo34142f() {
        return this.f34689a;
    }

    /* renamed from: g */
    public final int mo34143g() {
        return this.f34690b;
    }

    /* renamed from: h */
    public final long mo34144h() {
        return this.f34693e;
    }

    public final int hashCode() {
        int hashCode = this.f34689a.hashCode();
        int i = this.f34690b;
        int i2 = this.f34691c;
        long j = this.f34692d;
        long j2 = this.f34693e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f34694f) * 1000003) ^ this.f34695g;
    }

    /* renamed from: i */
    public final int mo34145i() {
        return this.f34694f;
    }

    public final String toString() {
        String str = this.f34689a;
        int i = this.f34690b;
        int i2 = this.f34691c;
        long j = this.f34692d;
        long j2 = this.f34693e;
        int i3 = this.f34694f;
        int i4 = this.f34695g;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
