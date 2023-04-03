package p000;

import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: f76 */
/* compiled from: Splitter */
public final class f76 {

    /* renamed from: a */
    public final td0 f28778a;

    /* renamed from: b */
    public final boolean f28779b;

    /* renamed from: c */
    public final C5835c f28780c;

    /* renamed from: d */
    public final int f28781d;

    /* renamed from: f76$a */
    /* compiled from: Splitter */
    public class C5832a implements C5835c {

        /* renamed from: a */
        public final /* synthetic */ td0 f28782a;

        /* renamed from: f76$a$a */
        /* compiled from: Splitter */
        public class C5833a extends C5834b {
            public C5833a(f76 f76, CharSequence charSequence) {
                super(f76, charSequence);
            }

            /* renamed from: f */
            public int mo42537f(int i) {
                return i + 1;
            }

            /* renamed from: g */
            public int mo42538g(int i) {
                return C5832a.this.f28782a.mo48062c(this.f28784e, i);
            }
        }

        public C5832a(td0 td0) {
            this.f28782a = td0;
        }

        /* renamed from: b */
        public C5834b mo42535a(f76 f76, CharSequence charSequence) {
            return new C5833a(f76, charSequence);
        }
    }

    /* renamed from: f76$b */
    /* compiled from: Splitter */
    public static abstract class C5834b extends AbstractIterator<String> {

        /* renamed from: e */
        public final CharSequence f28784e;

        /* renamed from: g */
        public final td0 f28785g;

        /* renamed from: k */
        public final boolean f28786k;

        /* renamed from: r */
        public int f28787r = 0;

        /* renamed from: s */
        public int f28788s;

        public C5834b(f76 f76, CharSequence charSequence) {
            this.f28785g = f76.f28778a;
            this.f28786k = f76.f28779b;
            this.f28788s = f76.f28781d;
            this.f28784e = charSequence;
        }

        /* renamed from: d */
        public String mo34305a() {
            int i;
            int i2 = this.f28787r;
            while (true) {
                int i3 = this.f28787r;
                if (i3 == -1) {
                    return (String) mo34306b();
                }
                int g = mo42538g(i3);
                if (g == -1) {
                    g = this.f28784e.length();
                    this.f28787r = -1;
                } else {
                    this.f28787r = mo42537f(g);
                }
                int i4 = this.f28787r;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f28787r = i5;
                    if (i5 > this.f28784e.length()) {
                        this.f28787r = -1;
                    }
                } else {
                    while (i2 < g && this.f28785g.mo48063e(this.f28784e.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f28785g.mo48063e(this.f28784e.charAt(i - 1))) {
                        g = i - 1;
                    }
                    if (!this.f28786k || i2 != i) {
                        int i6 = this.f28788s;
                    } else {
                        i2 = this.f28787r;
                    }
                }
            }
            int i62 = this.f28788s;
            if (i62 == 1) {
                i = this.f28784e.length();
                this.f28787r = -1;
                while (i > i2 && this.f28785g.mo48063e(this.f28784e.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f28788s = i62 - 1;
            }
            return this.f28784e.subSequence(i2, i).toString();
        }

        /* renamed from: f */
        public abstract int mo42537f(int i);

        /* renamed from: g */
        public abstract int mo42538g(int i);
    }

    /* renamed from: f76$c */
    /* compiled from: Splitter */
    public interface C5835c {
        /* renamed from: a */
        Iterator<String> mo42535a(f76 f76, CharSequence charSequence);
    }

    public f76(C5835c cVar) {
        this(cVar, false, td0.m52220f(), Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public static f76 m44217d(char c) {
        return m44218e(td0.m52219d(c));
    }

    /* renamed from: e */
    public static f76 m44218e(td0 td0) {
        du4.m43691k(td0);
        return new f76(new C5832a(td0));
    }

    /* renamed from: f */
    public List<String> mo42533f(CharSequence charSequence) {
        du4.m43691k(charSequence);
        Iterator<String> g = mo42534g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    public final Iterator<String> mo42534g(CharSequence charSequence) {
        return this.f28780c.mo42535a(this, charSequence);
    }

    public f76(C5835c cVar, boolean z, td0 td0, int i) {
        this.f28780c = cVar;
        this.f28779b = z;
        this.f28778a = td0;
        this.f28781d = i;
    }
}
