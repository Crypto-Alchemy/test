package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0816l;
import androidx.media3.common.Metadata;

public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C1040a();

    /* renamed from: a */
    public final int f5577a;

    /* renamed from: d */
    public final String f5578d;

    /* renamed from: e */
    public final String f5579e;

    /* renamed from: g */
    public final String f5580g;

    /* renamed from: k */
    public final boolean f5581k;

    /* renamed from: r */
    public final int f5582r;

    /* renamed from: androidx.media3.extractor.metadata.icy.IcyHeaders$a */
    public class C1040a implements Parcelable.Creator<IcyHeaders> {
        /* renamed from: a */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        /* renamed from: b */
        public IcyHeaders[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        C2725kr.m20981a(i2 == -1 || i2 > 0);
        this.f5577a = i;
        this.f5578d = str;
        this.f5579e = str2;
        this.f5580g = str3;
        this.f5581k = z;
        this.f5582r = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.extractor.metadata.icy.IcyHeaders m7633a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0037 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = r4
            goto L_0x004d
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0038 }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x0038 }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x0038 }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x0038 }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x0038 }
            p000.gk3.m18132i(r2, r7)     // Catch:{ NumberFormatException -> 0x0038 }
            r6 = r3
            goto L_0x004c
        L_0x0037:
            r6 = r3
        L_0x0038:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            p000.gk3.m18132i(r2, r1)
        L_0x004c:
            r1 = r5
        L_0x004d:
            r7 = r6
            goto L_0x0051
        L_0x004f:
            r7 = r3
            r1 = r5
        L_0x0051:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0065
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r4
            goto L_0x0066
        L_0x0065:
            r9 = r8
        L_0x0066:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0079
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L_0x007a
        L_0x0079:
            r10 = r8
        L_0x007a:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008d
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L_0x008e
        L_0x008d:
            r11 = r8
        L_0x008e:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = r4
            goto L_0x00a8
        L_0x00a7:
            r12 = r5
        L_0x00a8:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00e8
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d6 }
            if (r5 <= 0) goto L_0x00c0
            r3 = r5
            goto L_0x00d3
        L_0x00c0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d5 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d5 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d5 }
            r4.append(r13)     // Catch:{ NumberFormatException -> 0x00d5 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d5 }
            p000.gk3.m18132i(r2, r4)     // Catch:{ NumberFormatException -> 0x00d5 }
            r4 = r1
        L_0x00d3:
            r1 = r4
            goto L_0x00e8
        L_0x00d5:
            r3 = r5
        L_0x00d6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            p000.gk3.m18132i(r2, r13)
        L_0x00e8:
            if (r1 == 0) goto L_0x00f6
            androidx.media3.extractor.metadata.icy.IcyHeaders r13 = new androidx.media3.extractor.metadata.icy.IcyHeaders
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00f6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.icy.IcyHeaders.m7633a(java.util.Map):androidx.media3.extractor.metadata.icy.IcyHeaders");
    }

    /* renamed from: N0 */
    public void mo6551N0(C0816l.C0818b bVar) {
        String str = this.f5579e;
        if (str != null) {
            bVar.mo6827g0(str);
        }
        String str2 = this.f5578d;
        if (str2 != null) {
            bVar.mo6818X(str2);
        }
    }

    /* renamed from: O */
    public /* synthetic */ C0792h mo6552O() {
        return yu3.m30838b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.f5577a != icyHeaders.f5577a || !w67.m29346c(this.f5578d, icyHeaders.f5578d) || !w67.m29346c(this.f5579e, icyHeaders.f5579e) || !w67.m29346c(this.f5580g, icyHeaders.f5580g) || this.f5581k != icyHeaders.f5581k || this.f5582r != icyHeaders.f5582r) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = (527 + this.f5577a) * 31;
        String str = this.f5578d;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f5579e;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f5580g;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.f5581k ? 1 : 0)) * 31) + this.f5582r;
    }

    /* renamed from: k1 */
    public /* synthetic */ byte[] mo6553k1() {
        return yu3.m30837a(this);
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f5579e + "\", genre=\"" + this.f5578d + "\", bitrate=" + this.f5577a + ", metadataInterval=" + this.f5582r;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5577a);
        parcel.writeString(this.f5578d);
        parcel.writeString(this.f5579e);
        parcel.writeString(this.f5580g);
        w67.m29337V0(parcel, this.f5581k);
        parcel.writeInt(this.f5582r);
    }

    public IcyHeaders(Parcel parcel) {
        this.f5577a = parcel.readInt();
        this.f5578d = parcel.readString();
        this.f5579e = parcel.readString();
        this.f5580g = parcel.readString();
        this.f5581k = w67.m29309H0(parcel);
        this.f5582r = parcel.readInt();
    }
}
