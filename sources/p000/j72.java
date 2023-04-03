package p000;

import android.util.Base64;
import java.util.List;

/* renamed from: j72 */
/* compiled from: FontRequest */
public final class j72 {

    /* renamed from: a */
    public final String f13549a;

    /* renamed from: b */
    public final String f13550b;

    /* renamed from: c */
    public final String f13551c;

    /* renamed from: d */
    public final List<List<byte[]>> f13552d;

    /* renamed from: e */
    public final int f13553e = 0;

    /* renamed from: f */
    public final String f13554f;

    public j72(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f13549a = (String) gu4.m18428f(str);
        this.f13550b = (String) gu4.m18428f(str2);
        this.f13551c = (String) gu4.m18428f(str3);
        this.f13552d = (List) gu4.m18428f(list);
        this.f13554f = mo21780a(str, str2, str3);
    }

    /* renamed from: a */
    public final String mo21780a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> mo21781b() {
        return this.f13552d;
    }

    /* renamed from: c */
    public int mo21782c() {
        return this.f13553e;
    }

    /* renamed from: d */
    public String mo21783d() {
        return this.f13554f;
    }

    /* renamed from: e */
    public String mo21784e() {
        return this.f13549a;
    }

    /* renamed from: f */
    public String mo21785f() {
        return this.f13550b;
    }

    /* renamed from: g */
    public String mo21786g() {
        return this.f13551c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f13549a + ", mProviderPackage: " + this.f13550b + ", mQuery: " + this.f13551c + ", mCertificates:");
        for (int i = 0; i < this.f13552d.size(); i++) {
            sb.append(" [");
            List list = this.f13552d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f13553e);
        return sb.toString();
    }
}
