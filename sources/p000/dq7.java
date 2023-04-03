package p000;

import com.google.android.play.core.install.InstallState;

/* renamed from: dq7 */
public final class dq7 extends InstallState {

    /* renamed from: a */
    public final int f28275a;

    /* renamed from: b */
    public final long f28276b;

    /* renamed from: c */
    public final long f28277c;

    /* renamed from: d */
    public final int f28278d;

    /* renamed from: e */
    public final String f28279e;

    public dq7(int i, long j, long j2, int i2, String str) {
        this.f28275a = i;
        this.f28276b = j;
        this.f28277c = j2;
        this.f28278d = i2;
        if (str != null) {
            this.f28279e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: b */
    public final long mo34247b() {
        return this.f28276b;
    }

    /* renamed from: c */
    public final int mo34248c() {
        return this.f28278d;
    }

    /* renamed from: d */
    public final int mo34249d() {
        return this.f28275a;
    }

    /* renamed from: e */
    public final String mo34250e() {
        return this.f28279e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f28275a == installState.mo34249d() && this.f28276b == installState.mo34247b() && this.f28277c == installState.mo34251f() && this.f28278d == installState.mo34248c() && this.f28279e.equals(installState.mo34250e());
        }
    }

    /* renamed from: f */
    public final long mo34251f() {
        return this.f28277c;
    }

    public final int hashCode() {
        int i = this.f28275a;
        long j = this.f28276b;
        long j2 = this.f28277c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f28278d) * 1000003) ^ this.f28279e.hashCode();
    }

    public final String toString() {
        int i = this.f28275a;
        long j = this.f28276b;
        long j2 = this.f28277c;
        int i2 = this.f28278d;
        String str = this.f28279e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
