package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C0773a();

    /* renamed from: a */
    public final SchemeData[] f4111a;

    /* renamed from: d */
    public int f4112d;

    /* renamed from: e */
    public final String f4113e;

    /* renamed from: g */
    public final int f4114g;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C0772a();

        /* renamed from: a */
        public int f4115a;

        /* renamed from: d */
        public final UUID f4116d;

        /* renamed from: e */
        public final String f4117e;

        /* renamed from: g */
        public final String f4118g;

        /* renamed from: k */
        public final byte[] f4119k;

        /* renamed from: androidx.media3.common.DrmInitData$SchemeData$a */
        public class C0772a implements Parcelable.Creator<SchemeData> {
            /* renamed from: a */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            /* renamed from: b */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        /* renamed from: a */
        public boolean mo6526a(SchemeData schemeData) {
            if (!mo6528c() || schemeData.mo6528c() || !mo6529d(schemeData.f4116d)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public SchemeData mo6527b(byte[] bArr) {
            return new SchemeData(this.f4116d, this.f4117e, this.f4118g, bArr);
        }

        /* renamed from: c */
        public boolean mo6528c() {
            if (this.f4119k != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo6529d(UUID uuid) {
            if (l70.f14423a.equals(this.f4116d) || uuid.equals(this.f4116d)) {
                return true;
            }
            return false;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!w67.m29346c(this.f4117e, schemeData.f4117e) || !w67.m29346c(this.f4118g, schemeData.f4118g) || !w67.m29346c(this.f4116d, schemeData.f4116d) || !Arrays.equals(this.f4119k, schemeData.f4119k)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (this.f4115a == 0) {
                int hashCode = this.f4116d.hashCode() * 31;
                String str = this.f4117e;
                if (str == null) {
                    i = 0;
                } else {
                    i = str.hashCode();
                }
                this.f4115a = ((((hashCode + i) * 31) + this.f4118g.hashCode()) * 31) + Arrays.hashCode(this.f4119k);
            }
            return this.f4115a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f4116d.getMostSignificantBits());
            parcel.writeLong(this.f4116d.getLeastSignificantBits());
            parcel.writeString(this.f4117e);
            parcel.writeString(this.f4118g);
            parcel.writeByteArray(this.f4119k);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f4116d = (UUID) C2725kr.m20985e(uuid);
            this.f4117e = str;
            this.f4118g = (String) C2725kr.m20985e(str2);
            this.f4119k = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f4116d = new UUID(parcel.readLong(), parcel.readLong());
            this.f4117e = parcel.readString();
            this.f4118g = (String) w67.m29360j(parcel.readString());
            this.f4119k = parcel.createByteArray();
        }
    }

    /* renamed from: androidx.media3.common.DrmInitData$a */
    public class C0773a implements Parcelable.Creator<DrmInitData> {
        /* renamed from: a */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        /* renamed from: b */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this((String) null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    /* renamed from: b */
    public static boolean m5246b(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f4116d.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static DrmInitData m5247d(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f4113e;
            for (SchemeData schemeData : drmInitData.f4111a) {
                if (schemeData.mo6528c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f4113e;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f4111a) {
                if (schemeData2.mo6528c() && !m5246b(arrayList, size, schemeData2.f4116d)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, (List<SchemeData>) arrayList);
    }

    /* renamed from: a */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = l70.f14423a;
        if (!uuid.equals(schemeData.f4116d)) {
            return schemeData.f4116d.compareTo(schemeData2.f4116d);
        }
        if (uuid.equals(schemeData2.f4116d)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    public DrmInitData mo6519c(String str) {
        if (w67.m29346c(this.f4113e, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f4111a);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public SchemeData mo6522e(int i) {
        return this.f4111a[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (!w67.m29346c(this.f4113e, drmInitData.f4113e) || !Arrays.equals(this.f4111a, drmInitData.f4111a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        if (this.f4112d == 0) {
            String str = this.f4113e;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            this.f4112d = (i * 31) + Arrays.hashCode(this.f4111a);
        }
        return this.f4112d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4113e);
        parcel.writeTypedArray(this.f4111a, 0);
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.media3.common.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DrmInitData(java.lang.String r1, boolean r2, androidx.media3.common.DrmInitData.SchemeData... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f4113e = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            androidx.media3.common.DrmInitData$SchemeData[] r3 = (androidx.media3.common.DrmInitData.SchemeData[]) r3
        L_0x000e:
            r0.f4111a = r3
            int r1 = r3.length
            r0.f4114g = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.DrmInitData.<init>(java.lang.String, boolean, androidx.media3.common.DrmInitData$SchemeData[]):void");
    }

    public DrmInitData(Parcel parcel) {
        this.f4113e = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) w67.m29360j((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f4111a = schemeDataArr;
        this.f4114g = schemeDataArr.length;
    }
}
