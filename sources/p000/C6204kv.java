package p000;

import com.google.android.datatransport.Priority;
import java.util.Arrays;
import p000.hx6;

/* renamed from: kv */
/* compiled from: AutoValue_TransportContext */
public final class C6204kv extends hx6 {

    /* renamed from: a */
    public final String f31096a;

    /* renamed from: b */
    public final byte[] f31097b;

    /* renamed from: c */
    public final Priority f31098c;

    /* renamed from: kv$b */
    /* compiled from: AutoValue_TransportContext */
    public static final class C6206b extends hx6.C5942a {

        /* renamed from: a */
        public String f31099a;

        /* renamed from: b */
        public byte[] f31100b;

        /* renamed from: c */
        public Priority f31101c;

        /* renamed from: a */
        public hx6 mo43421a() {
            String str = "";
            if (this.f31099a == null) {
                str = str + " backendName";
            }
            if (this.f31101c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C6204kv(this.f31099a, this.f31100b, this.f31101c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public hx6.C5942a mo43422b(String str) {
            if (str != null) {
                this.f31099a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public hx6.C5942a mo43423c(byte[] bArr) {
            this.f31100b = bArr;
            return this;
        }

        /* renamed from: d */
        public hx6.C5942a mo43424d(Priority priority) {
            if (priority != null) {
                this.f31101c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    /* renamed from: b */
    public String mo43416b() {
        return this.f31096a;
    }

    /* renamed from: c */
    public byte[] mo43417c() {
        return this.f31097b;
    }

    /* renamed from: d */
    public Priority mo43418d() {
        return this.f31098c;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hx6)) {
            return false;
        }
        hx6 hx6 = (hx6) obj;
        if (this.f31096a.equals(hx6.mo43416b())) {
            byte[] bArr2 = this.f31097b;
            if (hx6 instanceof C6204kv) {
                bArr = ((C6204kv) hx6).f31097b;
            } else {
                bArr = hx6.mo43417c();
            }
            if (Arrays.equals(bArr2, bArr) && this.f31098c.equals(hx6.mo43418d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f31096a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31097b)) * 1000003) ^ this.f31098c.hashCode();
    }

    public C6204kv(String str, byte[] bArr, Priority priority) {
        this.f31096a = str;
        this.f31097b = bArr;
        this.f31098c = priority;
    }
}
