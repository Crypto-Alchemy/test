package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import androidx.recyclerview.widget.RecyclerView;
import com.caverock.androidsvg.CSSParser;
import com.github.mikephil.charting.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.web3j.ens.contracts.generated.PublicResolver;

public class SVG {

    /* renamed from: g */
    public static boolean f9077g = true;

    /* renamed from: a */
    public C1836d0 f9078a = null;

    /* renamed from: b */
    public String f9079b = "";

    /* renamed from: c */
    public String f9080c = "";

    /* renamed from: d */
    public float f9081d = 96.0f;

    /* renamed from: e */
    public CSSParser.C1823n f9082e = new CSSParser.C1823n();

    /* renamed from: f */
    public Map<String, C1848j0> f9083f = new HashMap();

    public enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    public static class Style implements Cloneable {

        /* renamed from: A */
        public Float f9085A;

        /* renamed from: B */
        public C1857o[] f9086B;

        /* renamed from: C */
        public C1857o f9087C;

        /* renamed from: H */
        public Float f9088H;

        /* renamed from: I */
        public C1839f f9089I;

        /* renamed from: L */
        public List<String> f9090L;

        /* renamed from: M */
        public C1857o f9091M;

        /* renamed from: P */
        public Integer f9092P;

        /* renamed from: Q */
        public FontStyle f9093Q;

        /* renamed from: U */
        public TextDecoration f9094U;

        /* renamed from: X */
        public TextDirection f9095X;

        /* renamed from: Y */
        public TextAnchor f9096Y;

        /* renamed from: Z */
        public Boolean f9097Z;

        /* renamed from: a */
        public long f9098a = 0;

        /* renamed from: b1 */
        public String f9099b1;

        /* renamed from: d */
        public C1854m0 f9100d;

        /* renamed from: e */
        public FillRule f9101e;

        /* renamed from: e0 */
        public C1832c f9102e0;

        /* renamed from: e1 */
        public Boolean f9103e1;

        /* renamed from: g */
        public Float f9104g;

        /* renamed from: k */
        public C1854m0 f9105k;

        /* renamed from: k0 */
        public String f9106k0;

        /* renamed from: o1 */
        public Boolean f9107o1;

        /* renamed from: p1 */
        public C1854m0 f9108p1;

        /* renamed from: q1 */
        public Float f9109q1;

        /* renamed from: r */
        public Float f9110r;

        /* renamed from: r1 */
        public String f9111r1;

        /* renamed from: s */
        public C1857o f9112s;

        /* renamed from: s1 */
        public FillRule f9113s1;

        /* renamed from: t1 */
        public String f9114t1;

        /* renamed from: u1 */
        public C1854m0 f9115u1;

        /* renamed from: v0 */
        public String f9116v0;

        /* renamed from: v1 */
        public Float f9117v1;

        /* renamed from: w1 */
        public C1854m0 f9118w1;

        /* renamed from: x */
        public LineCap f9119x;

        /* renamed from: x1 */
        public Float f9120x1;

        /* renamed from: y */
        public LineJoin f9121y;

        /* renamed from: y1 */
        public VectorEffect f9122y1;

        /* renamed from: z1 */
        public RenderQuality f9123z1;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        /* renamed from: a */
        public static Style m12747a() {
            Style style = new Style();
            style.f9098a = -1;
            C1839f fVar = C1839f.f9174d;
            style.f9100d = fVar;
            FillRule fillRule = FillRule.NonZero;
            style.f9101e = fillRule;
            Float valueOf = Float.valueOf(1.0f);
            style.f9104g = valueOf;
            style.f9105k = null;
            style.f9110r = valueOf;
            style.f9112s = new C1857o(1.0f);
            style.f9119x = LineCap.Butt;
            style.f9121y = LineJoin.Miter;
            style.f9085A = Float.valueOf(4.0f);
            style.f9086B = null;
            style.f9087C = new C1857o(Utils.FLOAT_EPSILON);
            style.f9088H = valueOf;
            style.f9089I = fVar;
            style.f9090L = null;
            style.f9091M = new C1857o(12.0f, Unit.pt);
            style.f9092P = 400;
            style.f9093Q = FontStyle.Normal;
            style.f9094U = TextDecoration.None;
            style.f9095X = TextDirection.LTR;
            style.f9096Y = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.f9097Z = bool;
            style.f9102e0 = null;
            style.f9106k0 = null;
            style.f9116v0 = null;
            style.f9099b1 = null;
            style.f9103e1 = bool;
            style.f9107o1 = bool;
            style.f9108p1 = fVar;
            style.f9109q1 = valueOf;
            style.f9111r1 = null;
            style.f9113s1 = fillRule;
            style.f9114t1 = null;
            style.f9115u1 = null;
            style.f9117v1 = valueOf;
            style.f9118w1 = null;
            style.f9120x1 = valueOf;
            style.f9122y1 = VectorEffect.None;
            style.f9123z1 = RenderQuality.auto;
            return style;
        }

        /* renamed from: b */
        public void mo12763b(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.f9103e1 = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.f9097Z = bool;
            this.f9102e0 = null;
            this.f9111r1 = null;
            this.f9088H = Float.valueOf(1.0f);
            this.f9108p1 = C1839f.f9174d;
            this.f9109q1 = Float.valueOf(1.0f);
            this.f9114t1 = null;
            this.f9115u1 = null;
            this.f9117v1 = Float.valueOf(1.0f);
            this.f9118w1 = null;
            this.f9120x1 = Float.valueOf(1.0f);
            this.f9122y1 = VectorEffect.None;
        }

        public Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            C1857o[] oVarArr = this.f9086B;
            if (oVarArr != null) {
                style.f9086B = (C1857o[]) oVarArr.clone();
            }
            return style;
        }
    }

    public enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* renamed from: com.caverock.androidsvg.SVG$a */
    public static /* synthetic */ class C1826a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9142a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.caverock.androidsvg.SVG$Unit[] r0 = com.caverock.androidsvg.SVG.Unit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9142a = r0
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.px     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9142a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.em     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9142a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.ex     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9142a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.in     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9142a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.cm     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9142a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.mm     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9142a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.pt     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9142a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.pc     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9142a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.percent     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVG.C1826a.<clinit>():void");
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$a0 */
    public static class C1827a0 extends C1849k {

        /* renamed from: o */
        public C1857o f9143o;

        /* renamed from: p */
        public C1857o f9144p;

        /* renamed from: q */
        public C1857o f9145q;

        /* renamed from: r */
        public C1857o f9146r;

        /* renamed from: s */
        public C1857o f9147s;

        /* renamed from: t */
        public C1857o f9148t;

        /* renamed from: o */
        public String mo12765o() {
            return "rect";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$a1 */
    public static class C1828a1 extends C1852l0 implements C1872v0 {

        /* renamed from: c */
        public String f9149c;

        /* renamed from: d */
        public C1880z0 f9150d;

        public C1828a1(String str) {
            this.f9149c = str;
        }

        /* renamed from: e */
        public C1880z0 mo12766e() {
            return this.f9150d;
        }

        public String toString() {
            return "TextChild: '" + this.f9149c + "'";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b0 */
    public static class C1830b0 extends C1848j0 implements C1844h0 {
        /* renamed from: b */
        public List<C1852l0> mo12772b() {
            return Collections.emptyList();
        }

        /* renamed from: i */
        public void mo12773i(C1852l0 l0Var) {
        }

        /* renamed from: o */
        public String mo12765o() {
            return "solidColor";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b1 */
    public static class C1831b1 extends C1851l {

        /* renamed from: p */
        public String f9155p;

        /* renamed from: q */
        public C1857o f9156q;

        /* renamed from: r */
        public C1857o f9157r;

        /* renamed from: s */
        public C1857o f9158s;

        /* renamed from: t */
        public C1857o f9159t;

        /* renamed from: o */
        public String mo12765o() {
            return "use";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c */
    public static class C1832c {

        /* renamed from: a */
        public C1857o f9160a;

        /* renamed from: b */
        public C1857o f9161b;

        /* renamed from: c */
        public C1857o f9162c;

        /* renamed from: d */
        public C1857o f9163d;

        public C1832c(C1857o oVar, C1857o oVar2, C1857o oVar3, C1857o oVar4) {
            this.f9160a = oVar;
            this.f9161b = oVar2;
            this.f9162c = oVar3;
            this.f9163d = oVar4;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c0 */
    public static class C1833c0 extends C1848j0 implements C1844h0 {

        /* renamed from: h */
        public Float f9164h;

        /* renamed from: b */
        public List<C1852l0> mo12772b() {
            return Collections.emptyList();
        }

        /* renamed from: i */
        public void mo12773i(C1852l0 l0Var) {
        }

        /* renamed from: o */
        public String mo12765o() {
            return "stop";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$c1 */
    public static class C1834c1 extends C1860p0 implements C1865s {
        /* renamed from: o */
        public String mo12765o() {
            return "view";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$d */
    public static class C1835d extends C1849k {

        /* renamed from: o */
        public C1857o f9165o;

        /* renamed from: p */
        public C1857o f9166p;

        /* renamed from: q */
        public C1857o f9167q;

        /* renamed from: o */
        public String mo12765o() {
            return "circle";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$d0 */
    public static class C1836d0 extends C1860p0 {

        /* renamed from: q */
        public C1857o f9168q;

        /* renamed from: r */
        public C1857o f9169r;

        /* renamed from: s */
        public C1857o f9170s;

        /* renamed from: t */
        public C1857o f9171t;

        /* renamed from: u */
        public String f9172u;

        /* renamed from: o */
        public String mo12765o() {
            return "svg";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$e */
    public static class C1837e extends C1851l implements C1865s {

        /* renamed from: p */
        public Boolean f9173p;

        /* renamed from: o */
        public String mo12765o() {
            return "clipPath";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$e0 */
    public interface C1838e0 {
        /* renamed from: a */
        Set<String> mo12774a();

        /* renamed from: c */
        String mo12775c();

        /* renamed from: d */
        void mo12776d(Set<String> set);

        /* renamed from: f */
        void mo12777f(Set<String> set);

        /* renamed from: g */
        Set<String> mo12778g();

        /* renamed from: h */
        void mo12779h(Set<String> set);

        /* renamed from: j */
        void mo12780j(Set<String> set);

        /* renamed from: k */
        void mo12781k(String str);

        /* renamed from: m */
        Set<String> mo12782m();

        /* renamed from: n */
        Set<String> mo12783n();
    }

    /* renamed from: com.caverock.androidsvg.SVG$f */
    public static class C1839f extends C1854m0 {

        /* renamed from: d */
        public static final C1839f f9174d = new C1839f(-16777216);

        /* renamed from: e */
        public static final C1839f f9175e = new C1839f(0);

        /* renamed from: a */
        public int f9176a;

        public C1839f(int i) {
            this.f9176a = i;
        }

        public String toString() {
            return String.format("#%08x", new Object[]{Integer.valueOf(this.f9176a)});
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$f0 */
    public static abstract class C1840f0 extends C1846i0 implements C1844h0, C1838e0 {

        /* renamed from: i */
        public List<C1852l0> f9177i = new ArrayList();

        /* renamed from: j */
        public Set<String> f9178j = null;

        /* renamed from: k */
        public String f9179k = null;

        /* renamed from: l */
        public Set<String> f9180l = null;

        /* renamed from: m */
        public Set<String> f9181m = null;

        /* renamed from: n */
        public Set<String> f9182n = null;

        /* renamed from: a */
        public Set<String> mo12774a() {
            return null;
        }

        /* renamed from: b */
        public List<C1852l0> mo12772b() {
            return this.f9177i;
        }

        /* renamed from: c */
        public String mo12775c() {
            return this.f9179k;
        }

        /* renamed from: d */
        public void mo12776d(Set<String> set) {
            this.f9182n = set;
        }

        /* renamed from: f */
        public void mo12777f(Set<String> set) {
            this.f9178j = set;
        }

        /* renamed from: g */
        public Set<String> mo12778g() {
            return this.f9178j;
        }

        /* renamed from: h */
        public void mo12779h(Set<String> set) {
            this.f9180l = set;
        }

        /* renamed from: i */
        public void mo12773i(C1852l0 l0Var) throws SVGParseException {
            this.f9177i.add(l0Var);
        }

        /* renamed from: j */
        public void mo12780j(Set<String> set) {
            this.f9181m = set;
        }

        /* renamed from: k */
        public void mo12781k(String str) {
            this.f9179k = str;
        }

        /* renamed from: m */
        public Set<String> mo12782m() {
            return this.f9181m;
        }

        /* renamed from: n */
        public Set<String> mo12783n() {
            return this.f9182n;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$g */
    public static class C1841g extends C1854m0 {

        /* renamed from: a */
        public static C1841g f9183a = new C1841g();

        /* renamed from: a */
        public static C1841g m12788a() {
            return f9183a;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$g0 */
    public static abstract class C1842g0 extends C1846i0 implements C1838e0 {

        /* renamed from: i */
        public Set<String> f9184i = null;

        /* renamed from: j */
        public String f9185j = null;

        /* renamed from: k */
        public Set<String> f9186k = null;

        /* renamed from: l */
        public Set<String> f9187l = null;

        /* renamed from: m */
        public Set<String> f9188m = null;

        /* renamed from: a */
        public Set<String> mo12774a() {
            return this.f9186k;
        }

        /* renamed from: c */
        public String mo12775c() {
            return this.f9185j;
        }

        /* renamed from: d */
        public void mo12776d(Set<String> set) {
            this.f9188m = set;
        }

        /* renamed from: f */
        public void mo12777f(Set<String> set) {
            this.f9184i = set;
        }

        /* renamed from: g */
        public Set<String> mo12778g() {
            return this.f9184i;
        }

        /* renamed from: h */
        public void mo12779h(Set<String> set) {
            this.f9186k = set;
        }

        /* renamed from: j */
        public void mo12780j(Set<String> set) {
            this.f9187l = set;
        }

        /* renamed from: k */
        public void mo12781k(String str) {
            this.f9185j = str;
        }

        /* renamed from: m */
        public Set<String> mo12782m() {
            return this.f9187l;
        }

        /* renamed from: n */
        public Set<String> mo12783n() {
            return this.f9188m;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$h */
    public static class C1843h extends C1851l implements C1865s {
        /* renamed from: o */
        public String mo12765o() {
            return "defs";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$h0 */
    public interface C1844h0 {
        /* renamed from: b */
        List<C1852l0> mo12772b();

        /* renamed from: i */
        void mo12773i(C1852l0 l0Var) throws SVGParseException;
    }

    /* renamed from: com.caverock.androidsvg.SVG$i */
    public static class C1845i extends C1849k {

        /* renamed from: o */
        public C1857o f9189o;

        /* renamed from: p */
        public C1857o f9190p;

        /* renamed from: q */
        public C1857o f9191q;

        /* renamed from: r */
        public C1857o f9192r;

        /* renamed from: o */
        public String mo12765o() {
            return "ellipse";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$i0 */
    public static abstract class C1846i0 extends C1848j0 {

        /* renamed from: h */
        public C1829b f9193h = null;
    }

    /* renamed from: com.caverock.androidsvg.SVG$j */
    public static abstract class C1847j extends C1848j0 implements C1844h0 {

        /* renamed from: h */
        public List<C1852l0> f9194h = new ArrayList();

        /* renamed from: i */
        public Boolean f9195i;

        /* renamed from: j */
        public Matrix f9196j;

        /* renamed from: k */
        public GradientSpread f9197k;

        /* renamed from: l */
        public String f9198l;

        /* renamed from: b */
        public List<C1852l0> mo12772b() {
            return this.f9194h;
        }

        /* renamed from: i */
        public void mo12773i(C1852l0 l0Var) throws SVGParseException {
            if (l0Var instanceof C1833c0) {
                this.f9194h.add(l0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + l0Var + " elements.");
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$j0 */
    public static abstract class C1848j0 extends C1852l0 {

        /* renamed from: c */
        public String f9199c = null;

        /* renamed from: d */
        public Boolean f9200d = null;

        /* renamed from: e */
        public Style f9201e = null;

        /* renamed from: f */
        public Style f9202f = null;

        /* renamed from: g */
        public List<String> f9203g = null;

        public String toString() {
            return mo12765o();
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$k */
    public static abstract class C1849k extends C1842g0 implements C1853m {

        /* renamed from: n */
        public Matrix f9204n;

        /* renamed from: l */
        public void mo12786l(Matrix matrix) {
            this.f9204n = matrix;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$k0 */
    public static class C1850k0 extends C1847j {

        /* renamed from: m */
        public C1857o f9205m;

        /* renamed from: n */
        public C1857o f9206n;

        /* renamed from: o */
        public C1857o f9207o;

        /* renamed from: p */
        public C1857o f9208p;

        /* renamed from: o */
        public String mo12765o() {
            return "linearGradient";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$l */
    public static class C1851l extends C1840f0 implements C1853m {

        /* renamed from: o */
        public Matrix f9209o;

        /* renamed from: l */
        public void mo12786l(Matrix matrix) {
            this.f9209o = matrix;
        }

        /* renamed from: o */
        public String mo12765o() {
            return "group";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$l0 */
    public static class C1852l0 {

        /* renamed from: a */
        public SVG f9210a;

        /* renamed from: b */
        public C1844h0 f9211b;

        /* renamed from: o */
        public String mo12765o() {
            return "";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$m */
    public interface C1853m {
        /* renamed from: l */
        void mo12786l(Matrix matrix);
    }

    /* renamed from: com.caverock.androidsvg.SVG$m0 */
    public static abstract class C1854m0 implements Cloneable {
    }

    /* renamed from: com.caverock.androidsvg.SVG$n */
    public static class C1855n extends C1856n0 implements C1853m {

        /* renamed from: p */
        public String f9212p;

        /* renamed from: q */
        public C1857o f9213q;

        /* renamed from: r */
        public C1857o f9214r;

        /* renamed from: s */
        public C1857o f9215s;

        /* renamed from: t */
        public C1857o f9216t;

        /* renamed from: u */
        public Matrix f9217u;

        /* renamed from: l */
        public void mo12786l(Matrix matrix) {
            this.f9217u = matrix;
        }

        /* renamed from: o */
        public String mo12765o() {
            return "image";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$n0 */
    public static abstract class C1856n0 extends C1840f0 {

        /* renamed from: o */
        public PreserveAspectRatio f9218o = null;
    }

    /* renamed from: com.caverock.androidsvg.SVG$o0 */
    public static class C1858o0 extends C1847j {

        /* renamed from: m */
        public C1857o f9221m;

        /* renamed from: n */
        public C1857o f9222n;

        /* renamed from: o */
        public C1857o f9223o;

        /* renamed from: p */
        public C1857o f9224p;

        /* renamed from: q */
        public C1857o f9225q;

        /* renamed from: o */
        public String mo12765o() {
            return "radialGradient";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$p */
    public static class C1859p extends C1849k {

        /* renamed from: o */
        public C1857o f9226o;

        /* renamed from: p */
        public C1857o f9227p;

        /* renamed from: q */
        public C1857o f9228q;

        /* renamed from: r */
        public C1857o f9229r;

        /* renamed from: o */
        public String mo12765o() {
            return "line";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$p0 */
    public static abstract class C1860p0 extends C1856n0 {

        /* renamed from: p */
        public C1829b f9230p;
    }

    /* renamed from: com.caverock.androidsvg.SVG$q */
    public static class C1861q extends C1860p0 implements C1865s {

        /* renamed from: q */
        public boolean f9231q;

        /* renamed from: r */
        public C1857o f9232r;

        /* renamed from: s */
        public C1857o f9233s;

        /* renamed from: t */
        public C1857o f9234t;

        /* renamed from: u */
        public C1857o f9235u;

        /* renamed from: v */
        public Float f9236v;

        /* renamed from: o */
        public String mo12765o() {
            return "marker";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$q0 */
    public static class C1862q0 extends C1851l {
        /* renamed from: o */
        public String mo12765o() {
            return "switch";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$r */
    public static class C1863r extends C1840f0 implements C1865s {

        /* renamed from: o */
        public Boolean f9237o;

        /* renamed from: p */
        public Boolean f9238p;

        /* renamed from: q */
        public C1857o f9239q;

        /* renamed from: r */
        public C1857o f9240r;

        /* renamed from: s */
        public C1857o f9241s;

        /* renamed from: t */
        public C1857o f9242t;

        /* renamed from: o */
        public String mo12765o() {
            return "mask";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$r0 */
    public static class C1864r0 extends C1860p0 implements C1865s {
        /* renamed from: o */
        public String mo12765o() {
            return "symbol";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$s */
    public interface C1865s {
    }

    /* renamed from: com.caverock.androidsvg.SVG$s0 */
    public static class C1866s0 extends C1874w0 implements C1872v0 {

        /* renamed from: o */
        public String f9243o;

        /* renamed from: p */
        public C1880z0 f9244p;

        /* renamed from: e */
        public C1880z0 mo12766e() {
            return this.f9244p;
        }

        /* renamed from: o */
        public String mo12765o() {
            return "tref";
        }

        /* renamed from: p */
        public void mo12796p(C1880z0 z0Var) {
            this.f9244p = z0Var;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$t */
    public static class C1867t extends C1854m0 {

        /* renamed from: a */
        public String f9245a;

        /* renamed from: d */
        public C1854m0 f9246d;

        public C1867t(String str, C1854m0 m0Var) {
            this.f9245a = str;
            this.f9246d = m0Var;
        }

        public String toString() {
            return this.f9245a + " " + this.f9246d;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$t0 */
    public static class C1868t0 extends C1878y0 implements C1872v0 {

        /* renamed from: s */
        public C1880z0 f9247s;

        /* renamed from: e */
        public C1880z0 mo12766e() {
            return this.f9247s;
        }

        /* renamed from: o */
        public String mo12765o() {
            return "tspan";
        }

        /* renamed from: p */
        public void mo12798p(C1880z0 z0Var) {
            this.f9247s = z0Var;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$u */
    public static class C1869u extends C1849k {

        /* renamed from: o */
        public C1871v f9248o;

        /* renamed from: p */
        public Float f9249p;

        /* renamed from: o */
        public String mo12765o() {
            return "path";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$u0 */
    public static class C1870u0 extends C1878y0 implements C1880z0, C1853m {

        /* renamed from: s */
        public Matrix f9250s;

        /* renamed from: l */
        public void mo12786l(Matrix matrix) {
            this.f9250s = matrix;
        }

        /* renamed from: o */
        public String mo12765o() {
            return PublicResolver.FUNC_TEXT;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$v */
    public static class C1871v implements C1873w {

        /* renamed from: a */
        public byte[] f9251a = new byte[8];

        /* renamed from: b */
        public int f9252b = 0;

        /* renamed from: c */
        public float[] f9253c = new float[16];

        /* renamed from: d */
        public int f9254d = 0;

        /* renamed from: a */
        public void mo12799a(float f, float f2, float f3, float f4) {
            mo12805f((byte) 3);
            mo12806g(4);
            float[] fArr = this.f9253c;
            int i = this.f9254d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            this.f9254d = i4 + 1;
            fArr[i4] = f4;
        }

        /* renamed from: b */
        public void mo12800b(float f, float f2) {
            mo12805f((byte) 0);
            mo12806g(2);
            float[] fArr = this.f9253c;
            int i = this.f9254d;
            int i2 = i + 1;
            fArr[i] = f;
            this.f9254d = i2 + 1;
            fArr[i2] = f2;
        }

        /* renamed from: c */
        public void mo12801c(float f, float f2, float f3, float f4, float f5, float f6) {
            mo12805f((byte) 2);
            mo12806g(6);
            float[] fArr = this.f9253c;
            int i = this.f9254d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            fArr[i4] = f4;
            int i6 = i5 + 1;
            fArr[i5] = f5;
            this.f9254d = i6 + 1;
            fArr[i6] = f6;
        }

        public void close() {
            mo12805f((byte) 8);
        }

        /* renamed from: d */
        public void mo12803d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            char c;
            if (z) {
                c = 2;
            } else {
                c = 0;
            }
            mo12805f((c | true) | z2 ? (byte) 1 : 0);
            mo12806g(5);
            float[] fArr = this.f9253c;
            int i = this.f9254d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            fArr[i4] = f4;
            this.f9254d = i5 + 1;
            fArr[i5] = f5;
        }

        /* renamed from: e */
        public void mo12804e(float f, float f2) {
            mo12805f((byte) 1);
            mo12806g(2);
            float[] fArr = this.f9253c;
            int i = this.f9254d;
            int i2 = i + 1;
            fArr[i] = f;
            this.f9254d = i2 + 1;
            fArr[i2] = f2;
        }

        /* renamed from: f */
        public final void mo12805f(byte b) {
            int i = this.f9252b;
            byte[] bArr = this.f9251a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f9251a = bArr2;
            }
            byte[] bArr3 = this.f9251a;
            int i2 = this.f9252b;
            this.f9252b = i2 + 1;
            bArr3[i2] = b;
        }

        /* renamed from: g */
        public final void mo12806g(int i) {
            float[] fArr = this.f9253c;
            if (fArr.length < this.f9254d + i) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f9253c = fArr2;
            }
        }

        /* renamed from: h */
        public void mo12807h(C1873w wVar) {
            int i;
            boolean z;
            boolean z2;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f9252b; i3++) {
                byte b = this.f9251a[i3];
                if (b == 0) {
                    float[] fArr = this.f9253c;
                    int i4 = i2 + 1;
                    i = i4 + 1;
                    wVar.mo12800b(fArr[i2], fArr[i4]);
                } else if (b != 1) {
                    if (b == 2) {
                        float[] fArr2 = this.f9253c;
                        int i5 = i2 + 1;
                        float f = fArr2[i2];
                        int i6 = i5 + 1;
                        float f2 = fArr2[i5];
                        int i7 = i6 + 1;
                        float f3 = fArr2[i6];
                        int i8 = i7 + 1;
                        float f4 = fArr2[i7];
                        int i9 = i8 + 1;
                        float f5 = fArr2[i8];
                        i2 = i9 + 1;
                        wVar.mo12801c(f, f2, f3, f4, f5, fArr2[i9]);
                    } else if (b == 3) {
                        float[] fArr3 = this.f9253c;
                        int i10 = i2 + 1;
                        int i11 = i10 + 1;
                        int i12 = i11 + 1;
                        wVar.mo12799a(fArr3[i2], fArr3[i10], fArr3[i11], fArr3[i12]);
                        i2 = i12 + 1;
                    } else if (b != 8) {
                        if ((b & 2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((b & 1) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float[] fArr4 = this.f9253c;
                        int i13 = i2 + 1;
                        float f6 = fArr4[i2];
                        int i14 = i13 + 1;
                        float f7 = fArr4[i13];
                        int i15 = i14 + 1;
                        float f8 = fArr4[i14];
                        int i16 = i15 + 1;
                        wVar.mo12803d(f6, f7, f8, z, z2, fArr4[i15], fArr4[i16]);
                        i2 = i16 + 1;
                    } else {
                        wVar.close();
                    }
                } else {
                    float[] fArr5 = this.f9253c;
                    int i17 = i2 + 1;
                    i = i17 + 1;
                    wVar.mo12804e(fArr5[i2], fArr5[i17]);
                }
                i2 = i;
            }
        }

        /* renamed from: i */
        public boolean mo12808i() {
            if (this.f9252b == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$v0 */
    public interface C1872v0 {
        /* renamed from: e */
        C1880z0 mo12766e();
    }

    /* renamed from: com.caverock.androidsvg.SVG$w */
    public interface C1873w {
        /* renamed from: a */
        void mo12799a(float f, float f2, float f3, float f4);

        /* renamed from: b */
        void mo12800b(float f, float f2);

        /* renamed from: c */
        void mo12801c(float f, float f2, float f3, float f4, float f5, float f6);

        void close();

        /* renamed from: d */
        void mo12803d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        /* renamed from: e */
        void mo12804e(float f, float f2);
    }

    /* renamed from: com.caverock.androidsvg.SVG$w0 */
    public static abstract class C1874w0 extends C1840f0 {
        /* renamed from: i */
        public void mo12773i(C1852l0 l0Var) throws SVGParseException {
            if (l0Var instanceof C1872v0) {
                this.f9177i.add(l0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + l0Var + " elements.");
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$x */
    public static class C1875x extends C1860p0 implements C1865s {

        /* renamed from: q */
        public Boolean f9255q;

        /* renamed from: r */
        public Boolean f9256r;

        /* renamed from: s */
        public Matrix f9257s;

        /* renamed from: t */
        public C1857o f9258t;

        /* renamed from: u */
        public C1857o f9259u;

        /* renamed from: v */
        public C1857o f9260v;

        /* renamed from: w */
        public C1857o f9261w;

        /* renamed from: x */
        public String f9262x;

        /* renamed from: o */
        public String mo12765o() {
            return "pattern";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$x0 */
    public static class C1876x0 extends C1874w0 implements C1872v0 {

        /* renamed from: o */
        public String f9263o;

        /* renamed from: p */
        public C1857o f9264p;

        /* renamed from: q */
        public C1880z0 f9265q;

        /* renamed from: e */
        public C1880z0 mo12766e() {
            return this.f9265q;
        }

        /* renamed from: o */
        public String mo12765o() {
            return "textPath";
        }

        /* renamed from: p */
        public void mo12809p(C1880z0 z0Var) {
            this.f9265q = z0Var;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$y */
    public static class C1877y extends C1849k {

        /* renamed from: o */
        public float[] f9266o;

        /* renamed from: o */
        public String mo12765o() {
            return "polyline";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$y0 */
    public static abstract class C1878y0 extends C1874w0 {

        /* renamed from: o */
        public List<C1857o> f9267o;

        /* renamed from: p */
        public List<C1857o> f9268p;

        /* renamed from: q */
        public List<C1857o> f9269q;

        /* renamed from: r */
        public List<C1857o> f9270r;
    }

    /* renamed from: com.caverock.androidsvg.SVG$z */
    public static class C1879z extends C1877y {
        /* renamed from: o */
        public String mo12765o() {
            return "polygon";
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$z0 */
    public interface C1880z0 {
    }

    /* renamed from: g */
    public static lk5 m12725g() {
        return null;
    }

    /* renamed from: h */
    public static SVG m12726h(InputStream inputStream) throws SVGParseException {
        return new SVGParser().mo12897z(inputStream, f9077g);
    }

    /* renamed from: i */
    public static SVG m12727i(Context context, int i) throws SVGParseException {
        return m12728j(context.getResources(), i);
    }

    /* renamed from: j */
    public static SVG m12728j(Resources resources, int i) throws SVGParseException {
        SVGParser sVGParser = new SVGParser();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return sVGParser.mo12897z(openRawResource, f9077g);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: k */
    public static SVG m12729k(String str) throws SVGParseException {
        return new SVGParser().mo12897z(new ByteArrayInputStream(str.getBytes()), f9077g);
    }

    /* renamed from: a */
    public void mo12746a(CSSParser.C1823n nVar) {
        this.f9082e.mo12725b(nVar);
    }

    /* renamed from: b */
    public void mo12747b() {
        this.f9082e.mo12728e(CSSParser.Source.RenderOptions);
    }

    /* renamed from: c */
    public final String mo12748c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* renamed from: d */
    public List<CSSParser.C1821l> mo12749d() {
        return this.f9082e.mo12726c();
    }

    /* renamed from: e */
    public final C1848j0 mo12750e(C1844h0 h0Var, String str) {
        C1848j0 e;
        C1848j0 j0Var = (C1848j0) h0Var;
        if (str.equals(j0Var.f9199c)) {
            return j0Var;
        }
        for (C1852l0 next : h0Var.mo12772b()) {
            if (next instanceof C1848j0) {
                C1848j0 j0Var2 = (C1848j0) next;
                if (str.equals(j0Var2.f9199c)) {
                    return j0Var2;
                }
                if ((next instanceof C1844h0) && (e = mo12750e((C1844h0) next, str)) != null) {
                    return e;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public C1848j0 mo12751f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f9078a.f9199c)) {
            return this.f9078a;
        }
        if (this.f9083f.containsKey(str)) {
            return this.f9083f.get(str);
        }
        C1848j0 e = mo12750e(this.f9078a, str);
        this.f9083f.put(str, e);
        return e;
    }

    /* renamed from: l */
    public C1836d0 mo12752l() {
        return this.f9078a;
    }

    /* renamed from: m */
    public boolean mo12753m() {
        return !this.f9082e.mo12727d();
    }

    /* renamed from: n */
    public Picture mo12754n() {
        return mo12756p((C1892a) null);
    }

    /* renamed from: o */
    public Picture mo12755o(int i, int i2, C1892a aVar) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (aVar == null || aVar.f9327f == null) {
            if (aVar == null) {
                aVar = new C1892a();
            } else {
                aVar = new C1892a(aVar);
            }
            aVar.mo12950h(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i, (float) i2);
        }
        new C1893b(beginRecording, this.f9081d).mo12963G0(this, aVar);
        picture.endRecording();
        return picture;
    }

    /* renamed from: p */
    public Picture mo12756p(C1892a aVar) {
        C1829b bVar;
        Unit unit;
        C1857o oVar;
        if (aVar == null || !aVar.mo12948f()) {
            bVar = this.f9078a.f9230p;
        } else {
            bVar = aVar.f9325d;
        }
        if (aVar == null || !aVar.mo12949g()) {
            C1836d0 d0Var = this.f9078a;
            C1857o oVar2 = d0Var.f9170s;
            if (oVar2 != null && oVar2.f9220d != (unit = Unit.percent) && (oVar = d0Var.f9171t) != null && oVar.f9220d != unit) {
                return mo12755o((int) Math.ceil((double) oVar2.mo12788b(this.f9081d)), (int) Math.ceil((double) this.f9078a.f9171t.mo12788b(this.f9081d)), aVar);
            } else if (oVar2 == null || bVar == null) {
                C1857o oVar3 = d0Var.f9171t;
                if (oVar3 == null || bVar == null) {
                    return mo12755o(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, aVar);
                }
                float b = oVar3.mo12788b(this.f9081d);
                return mo12755o((int) Math.ceil((double) ((bVar.f9153c * b) / bVar.f9154d)), (int) Math.ceil((double) b), aVar);
            } else {
                float b2 = oVar2.mo12788b(this.f9081d);
                return mo12755o((int) Math.ceil((double) b2), (int) Math.ceil((double) ((bVar.f9154d * b2) / bVar.f9153c)), aVar);
            }
        } else {
            return mo12755o((int) Math.ceil((double) aVar.f9327f.mo12768b()), (int) Math.ceil((double) aVar.f9327f.mo12769c()), aVar);
        }
    }

    /* renamed from: q */
    public C1852l0 mo12757q(String str) {
        if (str == null) {
            return null;
        }
        String c = mo12748c(str);
        if (c.length() <= 1 || !c.startsWith("#")) {
            return null;
        }
        return mo12751f(c.substring(1));
    }

    /* renamed from: r */
    public void mo12758r(String str) {
        this.f9080c = str;
    }

    /* renamed from: s */
    public void mo12759s(float f) {
        C1836d0 d0Var = this.f9078a;
        if (d0Var != null) {
            d0Var.f9171t = new C1857o(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: t */
    public void mo12760t(float f) {
        C1836d0 d0Var = this.f9078a;
        if (d0Var != null) {
            d0Var.f9170s = new C1857o(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: u */
    public void mo12761u(C1836d0 d0Var) {
        this.f9078a = d0Var;
    }

    /* renamed from: v */
    public void mo12762v(String str) {
        this.f9079b = str;
    }

    /* renamed from: com.caverock.androidsvg.SVG$o */
    public static class C1857o implements Cloneable {

        /* renamed from: a */
        public float f9219a;

        /* renamed from: d */
        public Unit f9220d;

        public C1857o(float f, Unit unit) {
            this.f9219a = f;
            this.f9220d = unit;
        }

        /* renamed from: a */
        public float mo12787a() {
            return this.f9219a;
        }

        /* renamed from: b */
        public float mo12788b(float f) {
            int i = C1826a.f9142a[this.f9220d.ordinal()];
            if (i == 1) {
                return this.f9219a;
            }
            switch (i) {
                case 4:
                    return this.f9219a * f;
                case 5:
                    return (this.f9219a * f) / 2.54f;
                case 6:
                    return (this.f9219a * f) / 25.4f;
                case 7:
                    return (this.f9219a * f) / 72.0f;
                case 8:
                    return (this.f9219a * f) / 6.0f;
                default:
                    return this.f9219a;
            }
        }

        /* renamed from: d */
        public float mo12789d(C1893b bVar) {
            if (this.f9220d != Unit.percent) {
                return mo12791g(bVar);
            }
            C1829b S = bVar.mo12986S();
            if (S == null) {
                return this.f9219a;
            }
            float f = S.f9153c;
            float f2 = S.f9154d;
            if (f == f2) {
                return (this.f9219a * f) / 100.0f;
            }
            return (this.f9219a * ((float) (Math.sqrt((double) ((f * f) + (f2 * f2))) / 1.414213562373095d))) / 100.0f;
        }

        /* renamed from: f */
        public float mo12790f(C1893b bVar, float f) {
            if (this.f9220d == Unit.percent) {
                return (this.f9219a * f) / 100.0f;
            }
            return mo12791g(bVar);
        }

        /* renamed from: g */
        public float mo12791g(C1893b bVar) {
            switch (C1826a.f9142a[this.f9220d.ordinal()]) {
                case 1:
                    return this.f9219a;
                case 2:
                    return this.f9219a * bVar.mo12982Q();
                case 3:
                    return this.f9219a * bVar.mo12984R();
                case 4:
                    return this.f9219a * bVar.mo12988T();
                case 5:
                    return (this.f9219a * bVar.mo12988T()) / 2.54f;
                case 6:
                    return (this.f9219a * bVar.mo12988T()) / 25.4f;
                case 7:
                    return (this.f9219a * bVar.mo12988T()) / 72.0f;
                case 8:
                    return (this.f9219a * bVar.mo12988T()) / 6.0f;
                case 9:
                    C1829b S = bVar.mo12986S();
                    if (S == null) {
                        return this.f9219a;
                    }
                    return (this.f9219a * S.f9153c) / 100.0f;
                default:
                    return this.f9219a;
            }
        }

        /* renamed from: h */
        public float mo12792h(C1893b bVar) {
            if (this.f9220d != Unit.percent) {
                return mo12791g(bVar);
            }
            C1829b S = bVar.mo12986S();
            if (S == null) {
                return this.f9219a;
            }
            return (this.f9219a * S.f9154d) / 100.0f;
        }

        /* renamed from: i */
        public boolean mo12793i() {
            if (this.f9219a < Utils.FLOAT_EPSILON) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public boolean mo12794j() {
            if (this.f9219a == Utils.FLOAT_EPSILON) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.valueOf(this.f9219a) + this.f9220d;
        }

        public C1857o(float f) {
            this.f9219a = f;
            this.f9220d = Unit.px;
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$b */
    public static class C1829b {

        /* renamed from: a */
        public float f9151a;

        /* renamed from: b */
        public float f9152b;

        /* renamed from: c */
        public float f9153c;

        /* renamed from: d */
        public float f9154d;

        public C1829b(float f, float f2, float f3, float f4) {
            this.f9151a = f;
            this.f9152b = f2;
            this.f9153c = f3;
            this.f9154d = f4;
        }

        /* renamed from: a */
        public static C1829b m12751a(float f, float f2, float f3, float f4) {
            return new C1829b(f, f2, f3 - f, f4 - f2);
        }

        /* renamed from: b */
        public float mo12768b() {
            return this.f9151a + this.f9153c;
        }

        /* renamed from: c */
        public float mo12769c() {
            return this.f9152b + this.f9154d;
        }

        /* renamed from: d */
        public void mo12770d(C1829b bVar) {
            float f = bVar.f9151a;
            if (f < this.f9151a) {
                this.f9151a = f;
            }
            float f2 = bVar.f9152b;
            if (f2 < this.f9152b) {
                this.f9152b = f2;
            }
            if (bVar.mo12768b() > mo12768b()) {
                this.f9153c = bVar.mo12768b() - this.f9151a;
            }
            if (bVar.mo12769c() > mo12769c()) {
                this.f9154d = bVar.mo12769c() - this.f9152b;
            }
        }

        public String toString() {
            return "[" + this.f9151a + " " + this.f9152b + " " + this.f9153c + " " + this.f9154d + "]";
        }

        public C1829b(C1829b bVar) {
            this.f9151a = bVar.f9151a;
            this.f9152b = bVar.f9152b;
            this.f9153c = bVar.f9153c;
            this.f9154d = bVar.f9154d;
        }
    }
}
