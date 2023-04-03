package p000;

/* renamed from: fd9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class fd9 extends md9 {

    /* renamed from: a */
    public String f28817a;

    /* renamed from: b */
    public boolean f28818b;

    /* renamed from: c */
    public int f28819c;

    /* renamed from: d */
    public byte f28820d;

    /* renamed from: a */
    public final md9 mo42545a(boolean z) {
        this.f28818b = true;
        this.f28820d = (byte) (1 | this.f28820d);
        return this;
    }

    /* renamed from: b */
    public final md9 mo42546b(int i) {
        this.f28819c = 1;
        this.f28820d = (byte) (this.f28820d | 2);
        return this;
    }

    /* renamed from: c */
    public final od9 mo42547c() {
        String str;
        if (this.f28820d == 3 && (str = this.f28817a) != null) {
            return new jd9(str, this.f28818b, this.f28819c, (hd9) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f28817a == null) {
            sb.append(" libraryName");
        }
        if ((this.f28820d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f28820d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final md9 mo42548d(String str) {
        this.f28817a = str;
        return this;
    }
}
