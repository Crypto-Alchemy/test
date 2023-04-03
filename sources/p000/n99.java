package p000;

/* renamed from: n99 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class n99 extends aa9 {

    /* renamed from: a */
    public String f32016a;

    /* renamed from: b */
    public boolean f32017b;

    /* renamed from: c */
    public int f32018c;

    /* renamed from: d */
    public byte f32019d;

    /* renamed from: a */
    public final aa9 mo28902a(boolean z) {
        this.f32017b = true;
        this.f32019d = (byte) (1 | this.f32019d);
        return this;
    }

    /* renamed from: b */
    public final aa9 mo28903b(int i) {
        this.f32018c = 1;
        this.f32019d = (byte) (this.f32019d | 2);
        return this;
    }

    /* renamed from: c */
    public final da9 mo28904c() {
        String str;
        if (this.f32019d == 3 && (str = this.f32016a) != null) {
            return new t99(str, this.f32017b, this.f32018c, (q99) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f32016a == null) {
            sb.append(" libraryName");
        }
        if ((this.f32019d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f32019d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final aa9 mo46046d(String str) {
        this.f32016a = "common";
        return this;
    }
}
