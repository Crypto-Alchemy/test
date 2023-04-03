package p000;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: b84 */
/* compiled from: NodeCursor */
public abstract class b84 extends z63 {

    /* renamed from: c */
    public final b84 f7989c;

    /* renamed from: d */
    public String f7990d;

    /* renamed from: e */
    public Object f7991e;

    /* renamed from: b84$a */
    /* compiled from: NodeCursor */
    public static final class C1611a extends b84 {

        /* renamed from: f */
        public Iterator<g53> f7992f;

        /* renamed from: g */
        public g53 f7993g;

        public C1611a(g53 g53, b84 b84) {
            super(1, b84);
            this.f7992f = g53.elements();
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ z63 mo11443e() {
            return b84.super.mo11439l();
        }

        /* renamed from: k */
        public g53 mo11438k() {
            return this.f7993g;
        }

        /* renamed from: m */
        public JsonToken mo11440m() {
            if (!this.f7992f.hasNext()) {
                this.f7993g = null;
                return JsonToken.END_ARRAY;
            }
            this.f20474b++;
            g53 next = this.f7992f.next();
            this.f7993g = next;
            return next.asToken();
        }

        /* renamed from: n */
        public b84 mo11441n() {
            return new C1611a(this.f7993g, this);
        }

        /* renamed from: o */
        public b84 mo11442o() {
            return new C1612b(this.f7993g, this);
        }
    }

    /* renamed from: b84$b */
    /* compiled from: NodeCursor */
    public static final class C1612b extends b84 {

        /* renamed from: f */
        public Iterator<Map.Entry<String, g53>> f7994f;

        /* renamed from: g */
        public Map.Entry<String, g53> f7995g;

        /* renamed from: h */
        public boolean f7996h = true;

        public C1612b(g53 g53, b84 b84) {
            super(2, b84);
            this.f7994f = ((ObjectNode) g53).fields();
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ z63 mo11443e() {
            return b84.super.mo11439l();
        }

        /* renamed from: k */
        public g53 mo11438k() {
            Map.Entry<String, g53> entry = this.f7995g;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }

        /* renamed from: m */
        public JsonToken mo11440m() {
            if (this.f7996h) {
                String str = null;
                if (!this.f7994f.hasNext()) {
                    this.f7990d = null;
                    this.f7995g = null;
                    return JsonToken.END_OBJECT;
                }
                this.f20474b++;
                this.f7996h = false;
                Map.Entry<String, g53> next = this.f7994f.next();
                this.f7995g = next;
                if (next != null) {
                    str = next.getKey();
                }
                this.f7990d = str;
                return JsonToken.FIELD_NAME;
            }
            this.f7996h = true;
            return this.f7995g.getValue().asToken();
        }

        /* renamed from: n */
        public b84 mo11441n() {
            return new C1611a(mo11438k(), this);
        }

        /* renamed from: o */
        public b84 mo11442o() {
            return new C1612b(mo11438k(), this);
        }
    }

    /* renamed from: b84$c */
    /* compiled from: NodeCursor */
    public static final class C1613c extends b84 {

        /* renamed from: f */
        public g53 f7997f;

        /* renamed from: g */
        public boolean f7998g = false;

        public C1613c(g53 g53, b84 b84) {
            super(0, b84);
            this.f7997f = g53;
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ z63 mo11443e() {
            return b84.super.mo11439l();
        }

        /* renamed from: k */
        public g53 mo11438k() {
            if (this.f7998g) {
                return this.f7997f;
            }
            return null;
        }

        /* renamed from: m */
        public JsonToken mo11440m() {
            if (!this.f7998g) {
                this.f20474b++;
                this.f7998g = true;
                return this.f7997f.asToken();
            }
            this.f7997f = null;
            return null;
        }

        /* renamed from: n */
        public b84 mo11441n() {
            return new C1611a(this.f7997f, this);
        }

        /* renamed from: o */
        public b84 mo11442o() {
            return new C1612b(this.f7997f, this);
        }
    }

    public b84(int i, b84 b84) {
        this.f20473a = i;
        this.f20474b = -1;
        this.f7989c = b84;
    }

    /* renamed from: b */
    public final String mo11435b() {
        return this.f7990d;
    }

    /* renamed from: c */
    public Object mo11436c() {
        return this.f7991e;
    }

    /* renamed from: i */
    public void mo11437i(Object obj) {
        this.f7991e = obj;
    }

    /* renamed from: k */
    public abstract g53 mo11438k();

    /* renamed from: l */
    public final b84 mo11439l() {
        return this.f7989c;
    }

    /* renamed from: m */
    public abstract JsonToken mo11440m();

    /* renamed from: n */
    public abstract b84 mo11441n();

    /* renamed from: o */
    public abstract b84 mo11442o();
}
