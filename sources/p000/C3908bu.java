package p000;

import java.util.Arrays;
import p000.C6639vw;

/* renamed from: bu */
/* compiled from: AutoValue_BackendRequest */
public final class C3908bu extends C6639vw {

    /* renamed from: a */
    public final Iterable<mt1> f21469a;

    /* renamed from: b */
    public final byte[] f21470b;

    /* renamed from: bu$b */
    /* compiled from: AutoValue_BackendRequest */
    public static final class C3910b extends C6639vw.C6640a {

        /* renamed from: a */
        public Iterable<mt1> f21471a;

        /* renamed from: b */
        public byte[] f21472b;

        /* renamed from: a */
        public C6639vw mo29738a() {
            String str = "";
            if (this.f21471a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C3908bu(this.f21471a, this.f21472b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C6639vw.C6640a mo29739b(Iterable<mt1> iterable) {
            if (iterable != null) {
                this.f21471a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        /* renamed from: c */
        public C6639vw.C6640a mo29740c(byte[] bArr) {
            this.f21472b = bArr;
            return this;
        }
    }

    /* renamed from: b */
    public Iterable<mt1> mo29733b() {
        return this.f21469a;
    }

    /* renamed from: c */
    public byte[] mo29734c() {
        return this.f21470b;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6639vw)) {
            return false;
        }
        C6639vw vwVar = (C6639vw) obj;
        if (this.f21469a.equals(vwVar.mo29733b())) {
            byte[] bArr2 = this.f21470b;
            if (vwVar instanceof C3908bu) {
                bArr = ((C3908bu) vwVar).f21470b;
            } else {
                bArr = vwVar.mo29734c();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f21469a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21470b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f21469a + ", extras=" + Arrays.toString(this.f21470b) + "}";
    }

    public C3908bu(Iterable<mt1> iterable, byte[] bArr) {
        this.f21469a = iterable;
        this.f21470b = bArr;
    }
}
