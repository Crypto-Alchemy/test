package p000;

import com.fasterxml.jackson.core.JsonFactory;

/* renamed from: lb6 */
/* compiled from: constantValues.kt */
public final class lb6 extends fq0<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lb6(String str) {
        super(str);
        vx2.m53591g(str, "value");
    }

    /* renamed from: c */
    public d36 mo50070a(mx3 mx3) {
        vx2.m53591g(mx3, "module");
        d36 W = mx3.mo51535k().mo53162W();
        vx2.m53590f(W, "module.builtIns.stringType");
        return W;
    }

    public String toString() {
        return JsonFactory.DEFAULT_QUOTE_CHAR + ((String) mo51739b()) + JsonFactory.DEFAULT_QUOTE_CHAR;
    }
}
