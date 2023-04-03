package p000;

import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;

/* renamed from: hq7 */
public final class hq7 extends x66 {

    /* renamed from: a */
    public final int f29687a;

    /* renamed from: b */
    public final int f29688b;

    /* renamed from: c */
    public final int f29689c;

    /* renamed from: d */
    public final long f29690d;

    /* renamed from: e */
    public final long f29691e;

    /* renamed from: f */
    public final List<String> f29692f;

    /* renamed from: g */
    public final List<String> f29693g;

    /* renamed from: h */
    public final PendingIntent f29694h;

    /* renamed from: i */
    public final List<Intent> f29695i;

    public hq7(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f29687a = i;
        this.f29688b = i2;
        this.f29689c = i3;
        this.f29690d = j;
        this.f29691e = j2;
        this.f29692f = list;
        this.f29693g = list2;
        this.f29694h = pendingIntent;
        this.f29695i = list3;
    }

    /* renamed from: a */
    public final List<String> mo43350a() {
        return this.f29692f;
    }

    /* renamed from: b */
    public final List<String> mo43351b() {
        return this.f29693g;
    }

    /* renamed from: c */
    public final long mo43352c() {
        return this.f29690d;
    }

    /* renamed from: d */
    public final List<Intent> mo43353d() {
        return this.f29695i;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x66) {
            x66 x66 = (x66) obj;
            if (this.f29687a == x66.mo43357h() && this.f29688b == x66.mo43359i() && this.f29689c == x66.mo43355f() && this.f29690d == x66.mo43352c() && this.f29691e == x66.mo43360j() && ((list = this.f29692f) != null ? list.equals(x66.mo43350a()) : x66.mo43350a() == null) && ((list2 = this.f29693g) != null ? list2.equals(x66.mo43351b()) : x66.mo43351b() == null) && ((pendingIntent = this.f29694h) != null ? pendingIntent.equals(x66.mo43356g()) : x66.mo43356g() == null)) {
                List<Intent> list3 = this.f29695i;
                List<Intent> d = x66.mo43353d();
                if (list3 != null ? list3.equals(d) : d == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int mo43355f() {
        return this.f29689c;
    }

    @Deprecated
    /* renamed from: g */
    public final PendingIntent mo43356g() {
        return this.f29694h;
    }

    /* renamed from: h */
    public final int mo43357h() {
        return this.f29687a;
    }

    public final int hashCode() {
        int i = this.f29687a;
        int i2 = this.f29688b;
        int i3 = this.f29689c;
        long j = this.f29690d;
        long j2 = this.f29691e;
        int i4 = (((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        List<String> list = this.f29692f;
        int i5 = 0;
        int hashCode = (i4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f29693g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f29694h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f29695i;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return hashCode3 ^ i5;
    }

    /* renamed from: i */
    public final int mo43359i() {
        return this.f29688b;
    }

    /* renamed from: j */
    public final long mo43360j() {
        return this.f29691e;
    }

    public final String toString() {
        int i = this.f29687a;
        int i2 = this.f29688b;
        int i3 = this.f29689c;
        long j = this.f29690d;
        long j2 = this.f29691e;
        String valueOf = String.valueOf(this.f29692f);
        String valueOf2 = String.valueOf(this.f29693g);
        String valueOf3 = String.valueOf(this.f29694h);
        String valueOf4 = String.valueOf(this.f29695i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
