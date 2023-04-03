package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: mw3 */
/* compiled from: ModelLoader */
public interface mw3<Model, Data> {

    /* renamed from: mw3$a */
    /* compiled from: ModelLoader */
    public static class C2853a<Data> {

        /* renamed from: a */
        public final z93 f15260a;

        /* renamed from: b */
        public final List<z93> f15261b;

        /* renamed from: c */
        public final r11<Data> f15262c;

        public C2853a(z93 z93, r11<Data> r11) {
            this(z93, Collections.emptyList(), r11);
        }

        public C2853a(z93 z93, List<z93> list, r11<Data> r11) {
            this.f15260a = (z93) zt4.m31500d(z93);
            this.f15261b = (List) zt4.m31500d(list);
            this.f15262c = (r11) zt4.m31500d(r11);
        }
    }

    /* renamed from: a */
    boolean mo11933a(Model model);

    /* renamed from: b */
    C2853a<Data> mo11934b(Model model, int i, int i2, xi4 xi4);
}
