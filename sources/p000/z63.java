package p000;

import com.fasterxml.jackson.core.JsonFactory;

/* renamed from: z63 */
/* compiled from: JsonStreamContext */
public abstract class z63 {

    /* renamed from: a */
    public int f20473a;

    /* renamed from: b */
    public int f20474b;

    public z63() {
    }

    public z63(z63 z63) {
        this.f20473a = z63.f20473a;
        this.f20474b = z63.f20474b;
    }

    /* renamed from: a */
    public final int mo28325a() {
        int i = this.f20474b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public abstract String mo11435b();

    /* renamed from: c */
    public abstract Object mo11436c();

    /* renamed from: d */
    public final int mo28326d() {
        return this.f20474b + 1;
    }

    /* renamed from: e */
    public abstract z63 mo11443e();

    /* renamed from: f */
    public final boolean mo28327f() {
        if (this.f20473a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo28328g() {
        if (this.f20473a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo28329h() {
        if (this.f20473a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public abstract void mo11437i(Object obj);

    /* renamed from: j */
    public String mo28330j() {
        int i = this.f20473a;
        if (i == 0) {
            return "root";
        }
        if (i == 1) {
            return "Array";
        }
        if (i != 2) {
            return "?";
        }
        return "Object";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f20473a;
        if (i == 0) {
            sb.append("/");
        } else if (i != 1) {
            sb.append('{');
            String b = mo11435b();
            if (b != null) {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                ud0.m28141a(sb, b);
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else {
            sb.append('[');
            sb.append(mo28325a());
            sb.append(']');
        }
        return sb.toString();
    }

    public z63(int i, int i2) {
        this.f20473a = i;
        this.f20474b = i2;
    }
}
