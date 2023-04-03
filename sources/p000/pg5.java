package p000;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: pg5 */
/* compiled from: RetrofitErrorResponse */
public class pg5 implements hr1 {

    /* renamed from: a */
    public Throwable f32703a;

    /* renamed from: b */
    public bg5 f32704b;

    public pg5(Throwable th) {
        this.f32703a = th;
    }

    /* renamed from: a */
    public static pg5 m49941a(bg5 bg5) {
        return new pg5(bg5);
    }

    /* renamed from: b */
    public static pg5 m49942b(Throwable th) {
        return new pg5(th);
    }

    /* renamed from: e */
    public int mo43362e() {
        bg5 bg5 = this.f32704b;
        if (bg5 != null) {
            return bg5.mo50579b();
        }
        return -1;
    }

    /* renamed from: f */
    public boolean mo43363f() {
        Throwable th = this.f32703a;
        if (th == null || !(th instanceof IOException)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public String mo43364g() {
        bg5 bg5 = this.f32704b;
        if (bg5 == null || bg5.mo50580d() == null) {
            return "";
        }
        return this.f32704b.mo50580d().contentType().toString();
    }

    public String getUrl() {
        bg5 bg5 = this.f32704b;
        if (bg5 == null || bg5.mo50583g().request() == null || this.f32704b.mo50583g().request().url() == null) {
            return "";
        }
        return this.f32704b.mo50583g().request().url().toString();
    }

    /* renamed from: h */
    public String mo43366h() {
        Throwable th = this.f32703a;
        if (th != null) {
            return th.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        bg5 bg5 = this.f32704b;
        if (bg5 != null) {
            if (kb6.m46949b(bg5.mo50582f())) {
                sb.append(this.f32704b.mo50582f());
            } else {
                sb.append(this.f32704b.mo50579b());
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public boolean mo43367i() {
        bg5 bg5;
        if (this.f32703a != null || (bg5 = this.f32704b) == null || bg5.mo50581e()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public String mo43368j() {
        bg5 bg5 = this.f32704b;
        if (!(bg5 == null || bg5.mo50580d() == null)) {
            try {
                return new String(this.f32704b.mo50580d().bytes(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                throw new AssertionError("UTF-8 must be supported");
            } catch (IOException unused2) {
            }
        }
        return "";
    }

    public pg5(bg5 bg5) {
        this.f32704b = bg5;
    }
}
