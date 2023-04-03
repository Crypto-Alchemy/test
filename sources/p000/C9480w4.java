package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;
import p000.C9367tq;

/* renamed from: w4 */
public abstract class C9480w4 extends C9326t4 implements Iterable {

    /* renamed from: d */
    public static final C7119g5 f45434d = new C9481a(C9480w4.class, 16);

    /* renamed from: a */
    public C6843b4[] f45435a;

    /* renamed from: w4$a */
    public static class C9481a extends C7119g5 {
        public C9481a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: c */
        public C9326t4 mo51361c(C9480w4 w4Var) {
            return w4Var;
        }
    }

    /* renamed from: w4$b */
    public class C9482b implements Enumeration {

        /* renamed from: a */
        public int f45436a = 0;

        public C9482b() {
        }

        public boolean hasMoreElements() {
            return this.f45436a < C9480w4.this.f45435a.length;
        }

        public Object nextElement() {
            int i = this.f45436a;
            C6843b4[] b4VarArr = C9480w4.this.f45435a;
            if (i < b4VarArr.length) {
                this.f45436a = i + 1;
                return b4VarArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public C9480w4() {
        this.f45435a = C6923c4.f37064d;
    }

    public C9480w4(C6843b4 b4Var) {
        if (b4Var != null) {
            this.f45435a = new C6843b4[]{b4Var};
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    public C9480w4(C6923c4 c4Var) {
        if (c4Var != null) {
            this.f45435a = c4Var.mo50810g();
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public C9480w4(C6843b4[] b4VarArr, boolean z) {
        this.f45435a = z ? C6923c4.m56299b(b4VarArr) : b4VarArr;
    }

    /* renamed from: L */
    public static C9480w4 m73427L(Object obj) {
        if (obj == null || (obj instanceof C9480w4)) {
            return (C9480w4) obj;
        }
        if (obj instanceof C6843b4) {
            C9326t4 n = ((C6843b4) obj).mo50158n();
            if (n instanceof C9480w4) {
                return (C9480w4) n;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (C9480w4) f45434d.mo51868b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return new c01(this.f45435a, false);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return new t01(this.f45435a, false);
    }

    /* renamed from: H */
    public C9584x3[] mo66614H() {
        int size = size();
        C9584x3[] x3VarArr = new C9584x3[size];
        for (int i = 0; i < size; i++) {
            x3VarArr[i] = C9584x3.m73852M(this.f45435a[i]);
        }
        return x3VarArr;
    }

    /* renamed from: J */
    public C9203q4[] mo66615J() {
        int size = size();
        C9203q4[] q4VarArr = new C9203q4[size];
        for (int i = 0; i < size; i++) {
            q4VarArr[i] = C9203q4.m71176L(this.f45435a[i]);
        }
        return q4VarArr;
    }

    /* renamed from: M */
    public C6843b4 mo52675M(int i) {
        return this.f45435a[i];
    }

    /* renamed from: N */
    public Enumeration mo52676N() {
        return new C9482b();
    }

    /* renamed from: O */
    public abstract C9584x3 mo50762O();

    /* renamed from: Q */
    public abstract C7013e4 mo50763Q();

    /* renamed from: R */
    public abstract C9203q4 mo50764R();

    /* renamed from: S */
    public abstract C9586x4 mo50765S();

    /* renamed from: T */
    public C6843b4[] mo66616T() {
        return this.f45435a;
    }

    public int hashCode() {
        int length = this.f45435a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f45435a[length].mo50158n().hashCode();
        }
    }

    public Iterator<C6843b4> iterator() {
        return new C9367tq.C9368a(this.f45435a);
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C9480w4)) {
            return false;
        }
        C9480w4 w4Var = (C9480w4) t4Var;
        int size = size();
        if (w4Var.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            C9326t4 n = this.f45435a[i].mo50158n();
            C9326t4 n2 = w4Var.f45435a[i].mo50158n();
            if (n != n2 && !n.mo50485r(n2)) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.f45435a.length;
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return true;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f45435a[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
