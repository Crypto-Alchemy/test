package p000;

import java.util.Arrays;
import p000.av0;

/* renamed from: iu */
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
public final class C6002iu extends av0.C3830d.C3832b {

    /* renamed from: a */
    public final String f30124a;

    /* renamed from: b */
    public final byte[] f30125b;

    /* renamed from: iu$b */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File */
    public static final class C6004b extends av0.C3830d.C3832b.C3833a {

        /* renamed from: a */
        public String f30126a;

        /* renamed from: b */
        public byte[] f30127b;

        /* renamed from: a */
        public av0.C3830d.C3832b mo29191a() {
            String str = "";
            if (this.f30126a == null) {
                str = str + " filename";
            }
            if (this.f30127b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C6002iu(this.f30126a, this.f30127b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public av0.C3830d.C3832b.C3833a mo29192b(byte[] bArr) {
            if (bArr != null) {
                this.f30127b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        /* renamed from: c */
        public av0.C3830d.C3832b.C3833a mo29193c(String str) {
            if (str != null) {
                this.f30126a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    /* renamed from: b */
    public byte[] mo29189b() {
        return this.f30125b;
    }

    /* renamed from: c */
    public String mo29190c() {
        return this.f30124a;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof av0.C3830d.C3832b)) {
            return false;
        }
        av0.C3830d.C3832b bVar = (av0.C3830d.C3832b) obj;
        if (this.f30124a.equals(bVar.mo29190c())) {
            byte[] bArr2 = this.f30125b;
            if (bVar instanceof C6002iu) {
                bArr = ((C6002iu) bVar).f30125b;
            } else {
                bArr = bVar.mo29189b();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30124a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f30125b);
    }

    public String toString() {
        return "File{filename=" + this.f30124a + ", contents=" + Arrays.toString(this.f30125b) + "}";
    }

    public C6002iu(String str, byte[] bArr) {
        this.f30124a = str;
        this.f30125b = bArr;
    }
}
