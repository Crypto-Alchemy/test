package com.caverock.androidsvg;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVG;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.p023ws.RealWebSocket;

/* renamed from: com.caverock.androidsvg.b */
/* compiled from: SVGAndroidRenderer */
public class C1893b {

    /* renamed from: i */
    public static HashSet<String> f9328i;

    /* renamed from: a */
    public Canvas f9329a;

    /* renamed from: b */
    public float f9330b;

    /* renamed from: c */
    public SVG f9331c;

    /* renamed from: d */
    public C1901h f9332d;

    /* renamed from: e */
    public Stack<C1901h> f9333e;

    /* renamed from: f */
    public Stack<SVG.C1844h0> f9334f;

    /* renamed from: g */
    public Stack<Matrix> f9335g;

    /* renamed from: h */
    public CSSParser.C1822m f9336h = null;

    /* renamed from: com.caverock.androidsvg.b$a */
    /* compiled from: SVGAndroidRenderer */
    public static /* synthetic */ class C1894a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9337a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f9338b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f9339c;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009e */
        static {
            /*
                com.caverock.androidsvg.SVG$Style$LineJoin[] r0 = com.caverock.androidsvg.SVG.Style.LineJoin.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9339c = r0
                r1 = 1
                com.caverock.androidsvg.SVG$Style$LineJoin r2 = com.caverock.androidsvg.SVG.Style.LineJoin.Miter     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9339c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.caverock.androidsvg.SVG$Style$LineJoin r3 = com.caverock.androidsvg.SVG.Style.LineJoin.Round     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f9339c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.caverock.androidsvg.SVG$Style$LineJoin r4 = com.caverock.androidsvg.SVG.Style.LineJoin.Bevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.caverock.androidsvg.SVG$Style$LineCap[] r3 = com.caverock.androidsvg.SVG.Style.LineCap.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9338b = r3
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Butt     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f9338b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Round     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f9338b     // Catch:{ NoSuchFieldError -> 0x004d }
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Square     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                com.caverock.androidsvg.PreserveAspectRatio$Alignment[] r3 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f9337a = r3
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r4 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMin     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r1 = f9337a     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r3 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMid     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f9337a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMax     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = f9337a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMin     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f9337a     // Catch:{ NoSuchFieldError -> 0x0088 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMid     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r0 = f9337a     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMax     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f9337a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMid     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f9337a     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMax     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C1893b.C1894a.<clinit>():void");
        }
    }

    /* renamed from: com.caverock.androidsvg.b$b */
    /* compiled from: SVGAndroidRenderer */
    public class C1895b implements SVG.C1873w {

        /* renamed from: a */
        public List<C1896c> f9340a = new ArrayList();

        /* renamed from: b */
        public float f9341b;

        /* renamed from: c */
        public float f9342c;

        /* renamed from: d */
        public C1896c f9343d = null;

        /* renamed from: e */
        public boolean f9344e = false;

        /* renamed from: f */
        public boolean f9345f = true;

        /* renamed from: g */
        public int f9346g = -1;

        /* renamed from: h */
        public boolean f9347h;

        public C1895b(SVG.C1871v vVar) {
            if (vVar != null) {
                vVar.mo12807h(this);
                if (this.f9347h) {
                    this.f9343d.mo13041b(this.f9340a.get(this.f9346g));
                    this.f9340a.set(this.f9346g, this.f9343d);
                    this.f9347h = false;
                }
                C1896c cVar = this.f9343d;
                if (cVar != null) {
                    this.f9340a.add(cVar);
                }
            }
        }

        /* renamed from: a */
        public void mo12799a(float f, float f2, float f3, float f4) {
            this.f9343d.mo13040a(f, f2);
            this.f9340a.add(this.f9343d);
            this.f9343d = new C1896c(f3, f4, f3 - f, f4 - f2);
            this.f9347h = false;
        }

        /* renamed from: b */
        public void mo12800b(float f, float f2) {
            if (this.f9347h) {
                this.f9343d.mo13041b(this.f9340a.get(this.f9346g));
                this.f9340a.set(this.f9346g, this.f9343d);
                this.f9347h = false;
            }
            C1896c cVar = this.f9343d;
            if (cVar != null) {
                this.f9340a.add(cVar);
            }
            this.f9341b = f;
            this.f9342c = f2;
            this.f9343d = new C1896c(f, f2, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            this.f9346g = this.f9340a.size();
        }

        /* renamed from: c */
        public void mo12801c(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f9345f || this.f9344e) {
                this.f9343d.mo13040a(f, f2);
                this.f9340a.add(this.f9343d);
                this.f9344e = false;
            }
            this.f9343d = new C1896c(f5, f6, f5 - f3, f6 - f4);
            this.f9347h = false;
        }

        public void close() {
            this.f9340a.add(this.f9343d);
            mo12804e(this.f9341b, this.f9342c);
            this.f9347h = true;
        }

        /* renamed from: d */
        public void mo12803d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.f9344e = true;
            this.f9345f = false;
            C1896c cVar = this.f9343d;
            C1893b.m13033h(cVar.f9349a, cVar.f9350b, f, f2, f3, z, z2, f4, f5, this);
            this.f9345f = true;
            this.f9347h = false;
        }

        /* renamed from: e */
        public void mo12804e(float f, float f2) {
            this.f9343d.mo13040a(f, f2);
            this.f9340a.add(this.f9343d);
            C1893b bVar = C1893b.this;
            C1896c cVar = this.f9343d;
            this.f9343d = new C1896c(f, f2, f - cVar.f9349a, f2 - cVar.f9350b);
            this.f9347h = false;
        }

        /* renamed from: f */
        public List<C1896c> mo13039f() {
            return this.f9340a;
        }
    }

    /* renamed from: com.caverock.androidsvg.b$c */
    /* compiled from: SVGAndroidRenderer */
    public class C1896c {

        /* renamed from: a */
        public float f9349a;

        /* renamed from: b */
        public float f9350b;

        /* renamed from: c */
        public float f9351c = Utils.FLOAT_EPSILON;

        /* renamed from: d */
        public float f9352d = Utils.FLOAT_EPSILON;

        /* renamed from: e */
        public boolean f9353e = false;

        public C1896c(float f, float f2, float f3, float f4) {
            this.f9349a = f;
            this.f9350b = f2;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != Utils.DOUBLE_EPSILON) {
                this.f9351c = (float) (((double) f3) / sqrt);
                this.f9352d = (float) (((double) f4) / sqrt);
            }
        }

        /* renamed from: a */
        public void mo13040a(float f, float f2) {
            float f3 = f - this.f9349a;
            float f4 = f2 - this.f9350b;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != Utils.DOUBLE_EPSILON) {
                f3 = (float) (((double) f3) / sqrt);
                f4 = (float) (((double) f4) / sqrt);
            }
            float f5 = this.f9351c;
            if (f3 == (-f5) && f4 == (-this.f9352d)) {
                this.f9353e = true;
                this.f9351c = -f4;
                this.f9352d = f3;
                return;
            }
            this.f9351c = f5 + f3;
            this.f9352d += f4;
        }

        /* renamed from: b */
        public void mo13041b(C1896c cVar) {
            float f = cVar.f9351c;
            float f2 = this.f9351c;
            if (f == (-f2)) {
                float f3 = cVar.f9352d;
                if (f3 == (-this.f9352d)) {
                    this.f9353e = true;
                    this.f9351c = -f3;
                    this.f9352d = cVar.f9351c;
                    return;
                }
            }
            this.f9351c = f2 + f;
            this.f9352d += cVar.f9352d;
        }

        public String toString() {
            return "(" + this.f9349a + "," + this.f9350b + " " + this.f9351c + "," + this.f9352d + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.b$d */
    /* compiled from: SVGAndroidRenderer */
    public class C1897d implements SVG.C1873w {

        /* renamed from: a */
        public Path f9355a = new Path();

        /* renamed from: b */
        public float f9356b;

        /* renamed from: c */
        public float f9357c;

        public C1897d(SVG.C1871v vVar) {
            if (vVar != null) {
                vVar.mo12807h(this);
            }
        }

        /* renamed from: a */
        public void mo12799a(float f, float f2, float f3, float f4) {
            this.f9355a.quadTo(f, f2, f3, f4);
            this.f9356b = f3;
            this.f9357c = f4;
        }

        /* renamed from: b */
        public void mo12800b(float f, float f2) {
            this.f9355a.moveTo(f, f2);
            this.f9356b = f;
            this.f9357c = f2;
        }

        /* renamed from: c */
        public void mo12801c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f9355a.cubicTo(f, f2, f3, f4, f5, f6);
            this.f9356b = f5;
            this.f9357c = f6;
        }

        public void close() {
            this.f9355a.close();
        }

        /* renamed from: d */
        public void mo12803d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            C1893b.m13033h(this.f9356b, this.f9357c, f, f2, f3, z, z2, f4, f5, this);
            this.f9356b = f4;
            this.f9357c = f5;
        }

        /* renamed from: e */
        public void mo12804e(float f, float f2) {
            this.f9355a.lineTo(f, f2);
            this.f9356b = f;
            this.f9357c = f2;
        }

        /* renamed from: f */
        public Path mo13043f() {
            return this.f9355a;
        }
    }

    /* renamed from: com.caverock.androidsvg.b$e */
    /* compiled from: SVGAndroidRenderer */
    public class C1898e extends C1899f {

        /* renamed from: e */
        public Path f9359e;

        public C1898e(Path path, float f, float f2) {
            super(f, f2);
            this.f9359e = path;
        }

        /* renamed from: b */
        public void mo13044b(String str) {
            if (C1893b.this.mo12998Y0()) {
                if (C1893b.this.f9332d.f9369b) {
                    C1893b.this.f9329a.drawTextOnPath(str, this.f9359e, this.f9361b, this.f9362c, C1893b.this.f9332d.f9371d);
                }
                if (C1893b.this.f9332d.f9370c) {
                    C1893b.this.f9329a.drawTextOnPath(str, this.f9359e, this.f9361b, this.f9362c, C1893b.this.f9332d.f9372e);
                }
            }
            this.f9361b += C1893b.this.f9332d.f9371d.measureText(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$f */
    /* compiled from: SVGAndroidRenderer */
    public class C1899f extends C1903j {

        /* renamed from: b */
        public float f9361b;

        /* renamed from: c */
        public float f9362c;

        public C1899f(float f, float f2) {
            super(C1893b.this, (C1894a) null);
            this.f9361b = f;
            this.f9362c = f2;
        }

        /* renamed from: b */
        public void mo13044b(String str) {
            C1893b.m13038y("TextSequence render", new Object[0]);
            if (C1893b.this.mo12998Y0()) {
                if (C1893b.this.f9332d.f9369b) {
                    C1893b.this.f9329a.drawText(str, this.f9361b, this.f9362c, C1893b.this.f9332d.f9371d);
                }
                if (C1893b.this.f9332d.f9370c) {
                    C1893b.this.f9329a.drawText(str, this.f9361b, this.f9362c, C1893b.this.f9332d.f9372e);
                }
            }
            this.f9361b += C1893b.this.f9332d.f9371d.measureText(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$g */
    /* compiled from: SVGAndroidRenderer */
    public class C1900g extends C1903j {

        /* renamed from: b */
        public float f9364b;

        /* renamed from: c */
        public float f9365c;

        /* renamed from: d */
        public Path f9366d;

        public C1900g(float f, float f2, Path path) {
            super(C1893b.this, (C1894a) null);
            this.f9364b = f;
            this.f9365c = f2;
            this.f9366d = path;
        }

        /* renamed from: a */
        public boolean mo13045a(SVG.C1874w0 w0Var) {
            if (!(w0Var instanceof SVG.C1876x0)) {
                return true;
            }
            C1893b.m13025Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        /* renamed from: b */
        public void mo13044b(String str) {
            if (C1893b.this.mo12998Y0()) {
                Path path = new Path();
                C1893b.this.f9332d.f9371d.getTextPath(str, 0, str.length(), this.f9364b, this.f9365c, path);
                this.f9366d.addPath(path);
            }
            this.f9364b += C1893b.this.f9332d.f9371d.measureText(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$i */
    /* compiled from: SVGAndroidRenderer */
    public class C1902i extends C1903j {

        /* renamed from: b */
        public float f9377b;

        /* renamed from: c */
        public float f9378c;

        /* renamed from: d */
        public RectF f9379d = new RectF();

        public C1902i(float f, float f2) {
            super(C1893b.this, (C1894a) null);
            this.f9377b = f;
            this.f9378c = f2;
        }

        /* renamed from: a */
        public boolean mo13045a(SVG.C1874w0 w0Var) {
            if (!(w0Var instanceof SVG.C1876x0)) {
                return true;
            }
            SVG.C1876x0 x0Var = (SVG.C1876x0) w0Var;
            SVG.C1852l0 q = w0Var.f9210a.mo12757q(x0Var.f9263o);
            if (q == null) {
                C1893b.m13023F("TextPath path reference '%s' not found", x0Var.f9263o);
                return false;
            }
            SVG.C1869u uVar = (SVG.C1869u) q;
            Path f = new C1897d(uVar.f9248o).mo13043f();
            Matrix matrix = uVar.f9204n;
            if (matrix != null) {
                f.transform(matrix);
            }
            RectF rectF = new RectF();
            f.computeBounds(rectF, true);
            this.f9379d.union(rectF);
            return false;
        }

        /* renamed from: b */
        public void mo13044b(String str) {
            if (C1893b.this.mo12998Y0()) {
                Rect rect = new Rect();
                C1893b.this.f9332d.f9371d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f9377b, this.f9378c);
                this.f9379d.union(rectF);
            }
            this.f9377b += C1893b.this.f9332d.f9371d.measureText(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$j */
    /* compiled from: SVGAndroidRenderer */
    public abstract class C1903j {
        public C1903j() {
        }

        /* renamed from: a */
        public boolean mo13045a(SVG.C1874w0 w0Var) {
            return true;
        }

        /* renamed from: b */
        public abstract void mo13044b(String str);

        public /* synthetic */ C1903j(C1893b bVar, C1894a aVar) {
            this();
        }
    }

    public C1893b(Canvas canvas, float f) {
        this.f9329a = canvas;
        this.f9330b = f;
    }

    /* renamed from: F */
    public static void m13023F(String str, Object... objArr) {
        String.format(str, objArr);
    }

    /* renamed from: V */
    public static synchronized void m13024V() {
        synchronized (C1893b.class) {
            HashSet<String> hashSet = new HashSet<>();
            f9328i = hashSet;
            hashSet.add("Structure");
            f9328i.add("BasicStructure");
            f9328i.add("ConditionalProcessing");
            f9328i.add("Image");
            f9328i.add("Style");
            f9328i.add("ViewportAttribute");
            f9328i.add("Shape");
            f9328i.add("BasicText");
            f9328i.add("PaintAttribute");
            f9328i.add("BasicPaintAttribute");
            f9328i.add("OpacityAttribute");
            f9328i.add("BasicGraphicsAttribute");
            f9328i.add("Marker");
            f9328i.add("Gradient");
            f9328i.add("Pattern");
            f9328i.add("Clip");
            f9328i.add("BasicClip");
            f9328i.add("Mask");
            f9328i.add("View");
        }
    }

    /* renamed from: Z0 */
    public static void m13025Z0(String str, Object... objArr) {
        String.format(str, objArr);
    }

    /* renamed from: h */
    public static void m13033h(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.C1873w wVar) {
        float f8;
        SVG.C1873w wVar2;
        double d;
        double d2;
        float f9 = f5;
        boolean z3 = z2;
        float f10 = f6;
        float f11 = f7;
        if (f != f10 || f2 != f11) {
            if (f3 == Utils.FLOAT_EPSILON) {
                f8 = f10;
                wVar2 = wVar;
            } else if (f4 == Utils.FLOAT_EPSILON) {
                wVar2 = wVar;
                f8 = f10;
            } else {
                float abs = Math.abs(f3);
                float abs2 = Math.abs(f4);
                double radians = Math.toRadians(((double) f9) % 360.0d);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d3 = ((double) (f - f10)) / 2.0d;
                double d4 = ((double) (f2 - f11)) / 2.0d;
                double d5 = (cos * d3) + (sin * d4);
                double d6 = ((-sin) * d3) + (d4 * cos);
                double d7 = (double) (abs * abs);
                double d8 = (double) (abs2 * abs2);
                double d9 = d5 * d5;
                double d10 = d6 * d6;
                double d11 = (d9 / d7) + (d10 / d8);
                if (d11 > 0.99999d) {
                    double sqrt = Math.sqrt(d11) * 1.00001d;
                    abs = (float) (((double) abs) * sqrt);
                    abs2 = (float) (sqrt * ((double) abs2));
                    d7 = (double) (abs * abs);
                    d8 = (double) (abs2 * abs2);
                }
                double d12 = -1.0d;
                if (z == z3) {
                    d = -1.0d;
                } else {
                    d = 1.0d;
                }
                double d13 = d7 * d8;
                double d14 = d7 * d10;
                double d15 = d8 * d9;
                double d16 = ((d13 - d14) - d15) / (d14 + d15);
                if (d16 < Utils.DOUBLE_EPSILON) {
                    d16 = 0.0d;
                }
                double sqrt2 = d * Math.sqrt(d16);
                double d17 = (double) abs;
                double d18 = (double) abs2;
                double d19 = ((d17 * d6) / d18) * sqrt2;
                float f12 = abs2;
                double d20 = sqrt2 * (-((d18 * d5) / d17));
                float f13 = abs;
                double d21 = (((double) (f + f6)) / 2.0d) + ((cos * d19) - (sin * d20));
                double d22 = (((double) (f2 + f7)) / 2.0d) + (sin * d19) + (cos * d20);
                double d23 = (d5 - d19) / d17;
                double d24 = (d6 - d20) / d18;
                double d25 = ((-d5) - d19) / d17;
                double d26 = ((-d6) - d20) / d18;
                double d27 = (d23 * d23) + (d24 * d24);
                double sqrt3 = Math.sqrt(d27);
                if (d24 < Utils.DOUBLE_EPSILON) {
                    d2 = -1.0d;
                } else {
                    d2 = 1.0d;
                }
                double acos = d2 * Math.acos(d23 / sqrt3);
                double sqrt4 = Math.sqrt(d27 * ((d25 * d25) + (d26 * d26)));
                double d28 = (d23 * d25) + (d24 * d26);
                if ((d23 * d26) - (d24 * d25) >= Utils.DOUBLE_EPSILON) {
                    d12 = 1.0d;
                }
                double v = d12 * m13035v(d28 / sqrt4);
                if (!z2 && v > Utils.DOUBLE_EPSILON) {
                    v -= 6.283185307179586d;
                } else if (z2 && v < Utils.DOUBLE_EPSILON) {
                    v += 6.283185307179586d;
                }
                float[] i = m13034i(acos % 6.283185307179586d, v % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(f13, f12);
                matrix.postRotate(f5);
                matrix.postTranslate((float) d21, (float) d22);
                matrix.mapPoints(i);
                i[i.length - 2] = f6;
                i[i.length - 1] = f7;
                for (int i2 = 0; i2 < i.length; i2 += 6) {
                    wVar.mo12801c(i[i2], i[i2 + 1], i[i2 + 2], i[i2 + 3], i[i2 + 4], i[i2 + 5]);
                }
                return;
            }
            wVar2.mo12804e(f8, f11);
        }
    }

    /* renamed from: i */
    public static float[] m13034i(double d, double d2) {
        int ceil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ((double) ceil);
        double d4 = d3 / 2.0d;
        double sin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[(ceil * 6)];
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            double d5 = d + (((double) i2) * d3);
            double cos = Math.cos(d5);
            double sin2 = Math.sin(d5);
            int i3 = i + 1;
            fArr[i] = (float) (cos - (sin * sin2));
            int i4 = i3 + 1;
            fArr[i3] = (float) (sin2 + (cos * sin));
            d3 = d3;
            double d6 = d5 + d3;
            double cos2 = Math.cos(d6);
            double sin3 = Math.sin(d6);
            int i5 = i4 + 1;
            fArr[i4] = (float) ((sin * sin3) + cos2);
            int i6 = i5 + 1;
            fArr[i5] = (float) (sin3 - (sin * cos2));
            int i7 = i6 + 1;
            fArr[i6] = (float) cos2;
            i = i7 + 1;
            fArr[i7] = (float) sin3;
        }
        return fArr;
    }

    /* renamed from: v */
    public static double m13035v(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return Utils.DOUBLE_EPSILON;
        }
        return Math.acos(d);
    }

    /* renamed from: w */
    public static int m13036w(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* renamed from: x */
    public static int m13037x(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* renamed from: y */
    public static void m13038y(String str, Object... objArr) {
    }

    /* renamed from: A */
    public final boolean mo12951A() {
        Boolean bool = this.f9332d.f9368a.f9103e1;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: A0 */
    public final void mo12952A0(SVG.C1852l0 l0Var) {
        if (!(l0Var instanceof SVG.C1865s)) {
            mo12987S0();
            mo13031u(l0Var);
            if (l0Var instanceof SVG.C1836d0) {
                mo13035x0((SVG.C1836d0) l0Var);
            } else if (l0Var instanceof SVG.C1831b1) {
                mo12960E0((SVG.C1831b1) l0Var);
            } else if (l0Var instanceof SVG.C1862q0) {
                mo12954B0((SVG.C1862q0) l0Var);
            } else if (l0Var instanceof SVG.C1851l) {
                mo13024q0((SVG.C1851l) l0Var);
            } else if (l0Var instanceof SVG.C1855n) {
                mo13026r0((SVG.C1855n) l0Var);
            } else if (l0Var instanceof SVG.C1869u) {
                mo13030t0((SVG.C1869u) l0Var);
            } else if (l0Var instanceof SVG.C1827a0) {
                mo13034w0((SVG.C1827a0) l0Var);
            } else if (l0Var instanceof SVG.C1835d) {
                mo13020o0((SVG.C1835d) l0Var);
            } else if (l0Var instanceof SVG.C1845i) {
                mo13022p0((SVG.C1845i) l0Var);
            } else if (l0Var instanceof SVG.C1859p) {
                mo13028s0((SVG.C1859p) l0Var);
            } else if (l0Var instanceof SVG.C1879z) {
                mo13033v0((SVG.C1879z) l0Var);
            } else if (l0Var instanceof SVG.C1877y) {
                mo13032u0((SVG.C1877y) l0Var);
            } else if (l0Var instanceof SVG.C1870u0) {
                mo12958D0((SVG.C1870u0) l0Var);
            }
            mo12985R0();
        }
    }

    /* renamed from: B */
    public final void mo12953B(SVG.C1846i0 i0Var, Path path) {
        SVG.C1854m0 m0Var = this.f9332d.f9368a.f9100d;
        if (m0Var instanceof SVG.C1867t) {
            SVG.C1852l0 q = this.f9331c.mo12757q(((SVG.C1867t) m0Var).f9245a);
            if (q instanceof SVG.C1875x) {
                mo12972L(i0Var, path, (SVG.C1875x) q);
                return;
            }
        }
        this.f9329a.drawPath(path, this.f9332d.f9371d);
    }

    /* renamed from: B0 */
    public final void mo12954B0(SVG.C1862q0 q0Var) {
        m13038y("Switch render", new Object[0]);
        mo12994W0(this.f9332d, q0Var);
        if (mo12951A()) {
            Matrix matrix = q0Var.f9209o;
            if (matrix != null) {
                this.f9329a.concat(matrix);
            }
            mo13021p(q0Var);
            boolean m0 = mo13016m0();
            mo12971K0(q0Var);
            if (m0) {
                mo13010j0(q0Var);
            }
            mo12991U0(q0Var);
        }
    }

    /* renamed from: C */
    public final void mo12955C(Path path) {
        C1901h hVar = this.f9332d;
        if (hVar.f9368a.f9122y1 == SVG.Style.VectorEffect.NonScalingStroke) {
            Matrix matrix = this.f9329a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f9329a.setMatrix(new Matrix());
            Shader shader = this.f9332d.f9372e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f9329a.drawPath(path2, this.f9332d.f9372e);
            this.f9329a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f9329a.drawPath(path, hVar.f9372e);
    }

    /* renamed from: C0 */
    public final void mo12956C0(SVG.C1864r0 r0Var, SVG.C1829b bVar) {
        m13038y("Symbol render", new Object[0]);
        if (bVar.f9153c != Utils.FLOAT_EPSILON && bVar.f9154d != Utils.FLOAT_EPSILON) {
            PreserveAspectRatio preserveAspectRatio = r0Var.f9218o;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.f9066e;
            }
            mo12994W0(this.f9332d, r0Var);
            C1901h hVar = this.f9332d;
            hVar.f9373f = bVar;
            if (!hVar.f9368a.f9097Z.booleanValue()) {
                SVG.C1829b bVar2 = this.f9332d.f9373f;
                mo12979O0(bVar2.f9151a, bVar2.f9152b, bVar2.f9153c, bVar2.f9154d);
            }
            SVG.C1829b bVar3 = r0Var.f9230p;
            if (bVar3 != null) {
                this.f9329a.concat(mo13019o(this.f9332d.f9373f, bVar3, preserveAspectRatio));
                this.f9332d.f9374g = r0Var.f9230p;
            } else {
                Canvas canvas = this.f9329a;
                SVG.C1829b bVar4 = this.f9332d.f9373f;
                canvas.translate(bVar4.f9151a, bVar4.f9152b);
            }
            boolean m0 = mo13016m0();
            mo12961F0(r0Var, true);
            if (m0) {
                mo13010j0(r0Var);
            }
            mo12991U0(r0Var);
        }
    }

    /* renamed from: D */
    public final float mo12957D(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    /* renamed from: D0 */
    public final void mo12958D0(SVG.C1870u0 u0Var) {
        float f;
        float f2;
        float f3;
        m13038y("Text render", new Object[0]);
        mo12994W0(this.f9332d, u0Var);
        if (mo12951A()) {
            Matrix matrix = u0Var.f9250s;
            if (matrix != null) {
                this.f9329a.concat(matrix);
            }
            List<SVG.C1857o> list = u0Var.f9267o;
            float f4 = Utils.FLOAT_EPSILON;
            if (list == null || list.size() == 0) {
                f = 0.0f;
            } else {
                f = u0Var.f9267o.get(0).mo12791g(this);
            }
            List<SVG.C1857o> list2 = u0Var.f9268p;
            if (list2 == null || list2.size() == 0) {
                f2 = 0.0f;
            } else {
                f2 = u0Var.f9268p.get(0).mo12792h(this);
            }
            List<SVG.C1857o> list3 = u0Var.f9269q;
            if (list3 == null || list3.size() == 0) {
                f3 = 0.0f;
            } else {
                f3 = u0Var.f9269q.get(0).mo12791g(this);
            }
            List<SVG.C1857o> list4 = u0Var.f9270r;
            if (!(list4 == null || list4.size() == 0)) {
                f4 = u0Var.f9270r.get(0).mo12792h(this);
            }
            SVG.Style.TextAnchor O = mo12978O();
            if (O != SVG.Style.TextAnchor.Start) {
                float n = mo13017n(u0Var);
                if (O == SVG.Style.TextAnchor.Middle) {
                    n /= 2.0f;
                }
                f -= n;
            }
            if (u0Var.f9193h == null) {
                C1902i iVar = new C1902i(f, f2);
                mo12959E(u0Var, iVar);
                RectF rectF = iVar.f9379d;
                u0Var.f9193h = new SVG.C1829b(rectF.left, rectF.top, rectF.width(), iVar.f9379d.height());
            }
            mo12991U0(u0Var);
            mo13025r(u0Var);
            mo13021p(u0Var);
            boolean m0 = mo13016m0();
            mo12959E(u0Var, new C1899f(f + f3, f2 + f4));
            if (m0) {
                mo13010j0(u0Var);
            }
        }
    }

    /* renamed from: E */
    public final void mo12959E(SVG.C1874w0 w0Var, C1903j jVar) {
        if (mo12951A()) {
            Iterator<SVG.C1852l0> it = w0Var.f9177i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.C1852l0 next = it.next();
                if (next instanceof SVG.C1828a1) {
                    jVar.mo13044b(mo12989T0(((SVG.C1828a1) next).f9149c, z, !it.hasNext()));
                } else {
                    mo13014l0(next, jVar);
                }
                z = false;
            }
        }
    }

    /* renamed from: E0 */
    public final void mo12960E0(SVG.C1831b1 b1Var) {
        float f;
        m13038y("Use render", new Object[0]);
        SVG.C1857o oVar = b1Var.f9158s;
        if (oVar == null || !oVar.mo12794j()) {
            SVG.C1857o oVar2 = b1Var.f9159t;
            if (oVar2 == null || !oVar2.mo12794j()) {
                mo12994W0(this.f9332d, b1Var);
                if (mo12951A()) {
                    SVG.C1852l0 q = b1Var.f9210a.mo12757q(b1Var.f9155p);
                    if (q == null) {
                        m13023F("Use reference '%s' not found", b1Var.f9155p);
                        return;
                    }
                    Matrix matrix = b1Var.f9209o;
                    if (matrix != null) {
                        this.f9329a.concat(matrix);
                    }
                    SVG.C1857o oVar3 = b1Var.f9156q;
                    float f2 = Utils.FLOAT_EPSILON;
                    if (oVar3 != null) {
                        f = oVar3.mo12791g(this);
                    } else {
                        f = 0.0f;
                    }
                    SVG.C1857o oVar4 = b1Var.f9157r;
                    if (oVar4 != null) {
                        f2 = oVar4.mo12792h(this);
                    }
                    this.f9329a.translate(f, f2);
                    mo13021p(b1Var);
                    boolean m0 = mo13016m0();
                    mo13008i0(b1Var);
                    if (q instanceof SVG.C1836d0) {
                        SVG.C1829b f0 = mo13005f0((SVG.C1857o) null, (SVG.C1857o) null, b1Var.f9158s, b1Var.f9159t);
                        mo12987S0();
                        mo13036y0((SVG.C1836d0) q, f0);
                        mo12985R0();
                    } else if (q instanceof SVG.C1864r0) {
                        SVG.C1857o oVar5 = b1Var.f9158s;
                        if (oVar5 == null) {
                            oVar5 = new SVG.C1857o(100.0f, SVG.Unit.percent);
                        }
                        SVG.C1857o oVar6 = b1Var.f9159t;
                        if (oVar6 == null) {
                            oVar6 = new SVG.C1857o(100.0f, SVG.Unit.percent);
                        }
                        SVG.C1829b f02 = mo13005f0((SVG.C1857o) null, (SVG.C1857o) null, oVar5, oVar6);
                        mo12987S0();
                        mo12956C0((SVG.C1864r0) q, f02);
                        mo12985R0();
                    } else {
                        mo12952A0(q);
                    }
                    mo13007h0();
                    if (m0) {
                        mo13010j0(b1Var);
                    }
                    mo12991U0(b1Var);
                }
            }
        }
    }

    /* renamed from: F0 */
    public final void mo12961F0(SVG.C1844h0 h0Var, boolean z) {
        if (z) {
            mo13008i0(h0Var);
        }
        for (SVG.C1852l0 A0 : h0Var.mo12772b()) {
            mo12952A0(A0);
        }
        if (z) {
            mo13007h0();
        }
    }

    /* renamed from: G */
    public final void mo12962G(SVG.C1874w0 w0Var, StringBuilder sb) {
        Iterator<SVG.C1852l0> it = w0Var.f9177i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.C1852l0 next = it.next();
            if (next instanceof SVG.C1874w0) {
                mo12962G((SVG.C1874w0) next, sb);
            } else if (next instanceof SVG.C1828a1) {
                sb.append(mo12989T0(((SVG.C1828a1) next).f9149c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* renamed from: G0 */
    public void mo12963G0(SVG svg, C1892a aVar) {
        SVG.C1829b bVar;
        PreserveAspectRatio preserveAspectRatio;
        SVG.C1829b bVar2;
        if (aVar != null) {
            this.f9331c = svg;
            SVG.C1836d0 l = svg.mo12752l();
            if (l == null) {
                m13025Z0("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (aVar.mo12947e()) {
                SVG.C1848j0 f = this.f9331c.mo12751f(aVar.f9326e);
                if (f == null || !(f instanceof SVG.C1834c1)) {
                    String.format("View element with id \"%s\" not found.", new Object[]{aVar.f9326e});
                    return;
                }
                SVG.C1834c1 c1Var = (SVG.C1834c1) f;
                bVar = c1Var.f9230p;
                if (bVar == null) {
                    String.format("View element with id \"%s\" is missing a viewBox attribute.", new Object[]{aVar.f9326e});
                    return;
                }
                preserveAspectRatio = c1Var.f9218o;
            } else {
                if (aVar.mo12948f()) {
                    bVar2 = aVar.f9325d;
                } else {
                    bVar2 = l.f9230p;
                }
                bVar = bVar2;
                if (aVar.mo12945c()) {
                    preserveAspectRatio = aVar.f9323b;
                } else {
                    preserveAspectRatio = l.f9218o;
                }
            }
            if (aVar.mo12944b()) {
                svg.mo12746a(aVar.f9322a);
            }
            if (aVar.mo12946d()) {
                CSSParser.C1822m mVar = new CSSParser.C1822m();
                this.f9336h = mVar;
                mVar.f9056a = svg.mo12751f(aVar.f9324c);
            }
            mo12977N0();
            mo13031u(l);
            mo12987S0();
            SVG.C1829b bVar3 = new SVG.C1829b(aVar.f9327f);
            SVG.C1857o oVar = l.f9170s;
            if (oVar != null) {
                bVar3.f9153c = oVar.mo12790f(this, bVar3.f9153c);
            }
            SVG.C1857o oVar2 = l.f9171t;
            if (oVar2 != null) {
                bVar3.f9154d = oVar2.mo12790f(this, bVar3.f9154d);
            }
            mo13038z0(l, bVar3, bVar, preserveAspectRatio);
            mo12985R0();
            if (aVar.mo12944b()) {
                svg.mo12747b();
                return;
            }
            return;
        }
        throw new NullPointerException("renderOptions shouldn't be null");
    }

    /* renamed from: H */
    public final void mo12964H(SVG.C1847j jVar, String str) {
        SVG.C1852l0 q = jVar.f9210a.mo12757q(str);
        if (q == null) {
            m13025Z0("Gradient reference '%s' not found", str);
        } else if (!(q instanceof SVG.C1847j)) {
            m13023F("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (q == jVar) {
            m13023F("Circular reference in gradient href attribute '%s'", str);
        } else {
            SVG.C1847j jVar2 = (SVG.C1847j) q;
            if (jVar.f9195i == null) {
                jVar.f9195i = jVar2.f9195i;
            }
            if (jVar.f9196j == null) {
                jVar.f9196j = jVar2.f9196j;
            }
            if (jVar.f9197k == null) {
                jVar.f9197k = jVar2.f9197k;
            }
            if (jVar.f9194h.isEmpty()) {
                jVar.f9194h = jVar2.f9194h;
            }
            try {
                if (jVar instanceof SVG.C1850k0) {
                    mo12966I((SVG.C1850k0) jVar, (SVG.C1850k0) q);
                } else {
                    mo12968J((SVG.C1858o0) jVar, (SVG.C1858o0) q);
                }
            } catch (ClassCastException unused) {
            }
            String str2 = jVar2.f9198l;
            if (str2 != null) {
                mo12964H(jVar, str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        r0 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e4, code lost:
        r7 = r8[r7.mo12742a().ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ef, code lost:
        if (r7 == 2) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f2, code lost:
        if (r7 == 3) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        if (r7 == 5) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f8, code lost:
        if (r7 == 6) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fb, code lost:
        if (r7 == 7) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ff, code lost:
        if (r7 == 8) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0102, code lost:
        r13 = r4 - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0105, code lost:
        r13 = (r4 - r13) / 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0108, code lost:
        r1 = com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON - r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0113, code lost:
        if (r11.f9332d.f9368a.f9097Z.booleanValue() != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        mo12979O0(r0, r1, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        r3.reset();
        r3.preScale(r6, r5);
        r11.f9329a.concat(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0147  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12965H0(com.caverock.androidsvg.SVG.C1861q r12, com.caverock.androidsvg.C1893b.C1896c r13) {
        /*
            r11 = this;
            r11.mo12987S0()
            java.lang.Float r0 = r12.f9236v
            r1 = 0
            if (r0 == 0) goto L_0x0033
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002c
            float r0 = r13.f9351c
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x001e
            float r2 = r13.f9352d
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
        L_0x001e:
            float r2 = r13.f9352d
            double r2 = (double) r2
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0034
        L_0x002c:
            java.lang.Float r0 = r12.f9236v
            float r0 = r0.floatValue()
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            boolean r2 = r12.f9231q
            if (r2 == 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0047
        L_0x003b:
            com.caverock.androidsvg.b$h r2 = r11.f9332d
            com.caverock.androidsvg.SVG$Style r2 = r2.f9368a
            com.caverock.androidsvg.SVG$o r2 = r2.f9112s
            float r3 = r11.f9330b
            float r2 = r2.mo12788b(r3)
        L_0x0047:
            com.caverock.androidsvg.b$h r3 = r11.mo12974M(r12)
            r11.f9332d = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r13.f9349a
            float r13 = r13.f9350b
            r3.preTranslate(r4, r13)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            com.caverock.androidsvg.SVG$o r13 = r12.f9232r
            if (r13 == 0) goto L_0x0068
            float r13 = r13.mo12791g(r11)
            goto L_0x0069
        L_0x0068:
            r13 = r1
        L_0x0069:
            com.caverock.androidsvg.SVG$o r0 = r12.f9233s
            if (r0 == 0) goto L_0x0072
            float r0 = r0.mo12792h(r11)
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            com.caverock.androidsvg.SVG$o r2 = r12.f9234t
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x007e
            float r2 = r2.mo12791g(r11)
            goto L_0x007f
        L_0x007e:
            r2 = r4
        L_0x007f:
            com.caverock.androidsvg.SVG$o r5 = r12.f9235u
            if (r5 == 0) goto L_0x0087
            float r4 = r5.mo12792h(r11)
        L_0x0087:
            com.caverock.androidsvg.SVG$b r5 = r12.f9230p
            if (r5 == 0) goto L_0x0124
            float r6 = r5.f9153c
            float r6 = r2 / r6
            float r5 = r5.f9154d
            float r5 = r4 / r5
            com.caverock.androidsvg.PreserveAspectRatio r7 = r12.f9218o
            if (r7 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            com.caverock.androidsvg.PreserveAspectRatio r7 = com.caverock.androidsvg.PreserveAspectRatio.f9066e
        L_0x009a:
            com.caverock.androidsvg.PreserveAspectRatio r8 = com.caverock.androidsvg.PreserveAspectRatio.f9065d
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00b5
            com.caverock.androidsvg.PreserveAspectRatio$Scale r8 = r7.mo12743b()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r9 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r8 != r9) goto L_0x00af
            float r5 = java.lang.Math.max(r6, r5)
            goto L_0x00b3
        L_0x00af:
            float r5 = java.lang.Math.min(r6, r5)
        L_0x00b3:
            r6 = r5
            r5 = r6
        L_0x00b5:
            float r13 = -r13
            float r13 = r13 * r6
            float r0 = -r0
            float r0 = r0 * r5
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f9329a
            r13.concat(r3)
            com.caverock.androidsvg.SVG$b r13 = r12.f9230p
            float r0 = r13.f9153c
            float r0 = r0 * r6
            float r13 = r13.f9154d
            float r13 = r13 * r5
            int[] r8 = com.caverock.androidsvg.C1893b.C1894a.f9337a
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r9 = r7.mo12742a()
            int r9 = r9.ordinal()
            r9 = r8[r9]
            r10 = 1073741824(0x40000000, float:2.0)
            switch(r9) {
                case 1: goto L_0x00df;
                case 2: goto L_0x00df;
                case 3: goto L_0x00df;
                case 4: goto L_0x00dc;
                case 5: goto L_0x00dc;
                case 6: goto L_0x00dc;
                default: goto L_0x00da;
            }
        L_0x00da:
            r0 = r1
            goto L_0x00e4
        L_0x00dc:
            float r0 = r2 - r0
            goto L_0x00e2
        L_0x00df:
            float r0 = r2 - r0
            float r0 = r0 / r10
        L_0x00e2:
            float r0 = r1 - r0
        L_0x00e4:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r7.mo12742a()
            int r7 = r7.ordinal()
            r7 = r8[r7]
            r8 = 2
            if (r7 == r8) goto L_0x0105
            r8 = 3
            if (r7 == r8) goto L_0x0102
            r8 = 5
            if (r7 == r8) goto L_0x0105
            r8 = 6
            if (r7 == r8) goto L_0x0102
            r8 = 7
            if (r7 == r8) goto L_0x0105
            r8 = 8
            if (r7 == r8) goto L_0x0102
            goto L_0x0109
        L_0x0102:
            float r13 = r4 - r13
            goto L_0x0108
        L_0x0105:
            float r13 = r4 - r13
            float r13 = r13 / r10
        L_0x0108:
            float r1 = r1 - r13
        L_0x0109:
            com.caverock.androidsvg.b$h r13 = r11.f9332d
            com.caverock.androidsvg.SVG$Style r13 = r13.f9368a
            java.lang.Boolean r13 = r13.f9097Z
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0118
            r11.mo12979O0(r0, r1, r2, r4)
        L_0x0118:
            r3.reset()
            r3.preScale(r6, r5)
            android.graphics.Canvas r13 = r11.f9329a
            r13.concat(r3)
            goto L_0x013d
        L_0x0124:
            float r13 = -r13
            float r0 = -r0
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.f9329a
            r13.concat(r3)
            com.caverock.androidsvg.b$h r13 = r11.f9332d
            com.caverock.androidsvg.SVG$Style r13 = r13.f9368a
            java.lang.Boolean r13 = r13.f9097Z
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x013d
            r11.mo12979O0(r1, r1, r2, r4)
        L_0x013d:
            boolean r13 = r11.mo13016m0()
            r0 = 0
            r11.mo12961F0(r12, r0)
            if (r13 == 0) goto L_0x014a
            r11.mo13010j0(r12)
        L_0x014a:
            r11.mo12985R0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C1893b.mo12965H0(com.caverock.androidsvg.SVG$q, com.caverock.androidsvg.b$c):void");
    }

    /* renamed from: I */
    public final void mo12966I(SVG.C1850k0 k0Var, SVG.C1850k0 k0Var2) {
        if (k0Var.f9205m == null) {
            k0Var.f9205m = k0Var2.f9205m;
        }
        if (k0Var.f9206n == null) {
            k0Var.f9206n = k0Var2.f9206n;
        }
        if (k0Var.f9207o == null) {
            k0Var.f9207o = k0Var2.f9207o;
        }
        if (k0Var.f9208p == null) {
            k0Var.f9208p = k0Var2.f9208p;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12967I0(com.caverock.androidsvg.SVG.C1849k r10) {
        /*
            r9 = this;
            com.caverock.androidsvg.b$h r0 = r9.f9332d
            com.caverock.androidsvg.SVG$Style r0 = r0.f9368a
            java.lang.String r1 = r0.f9106k0
            if (r1 != 0) goto L_0x0011
            java.lang.String r2 = r0.f9116v0
            if (r2 != 0) goto L_0x0011
            java.lang.String r0 = r0.f9099b1
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.String r0 = "Marker reference '%s' not found"
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0030
            com.caverock.androidsvg.SVG r5 = r10.f9210a
            com.caverock.androidsvg.SVG$l0 r1 = r5.mo12757q(r1)
            if (r1 == 0) goto L_0x0023
            com.caverock.androidsvg.SVG$q r1 = (com.caverock.androidsvg.SVG.C1861q) r1
            goto L_0x0031
        L_0x0023:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.caverock.androidsvg.b$h r5 = r9.f9332d
            com.caverock.androidsvg.SVG$Style r5 = r5.f9368a
            java.lang.String r5 = r5.f9106k0
            r1[r3] = r5
            m13023F(r0, r1)
        L_0x0030:
            r1 = r2
        L_0x0031:
            com.caverock.androidsvg.b$h r5 = r9.f9332d
            com.caverock.androidsvg.SVG$Style r5 = r5.f9368a
            java.lang.String r5 = r5.f9116v0
            if (r5 == 0) goto L_0x0051
            com.caverock.androidsvg.SVG r6 = r10.f9210a
            com.caverock.androidsvg.SVG$l0 r5 = r6.mo12757q(r5)
            if (r5 == 0) goto L_0x0044
            com.caverock.androidsvg.SVG$q r5 = (com.caverock.androidsvg.SVG.C1861q) r5
            goto L_0x0052
        L_0x0044:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.caverock.androidsvg.b$h r6 = r9.f9332d
            com.caverock.androidsvg.SVG$Style r6 = r6.f9368a
            java.lang.String r6 = r6.f9116v0
            r5[r3] = r6
            m13023F(r0, r5)
        L_0x0051:
            r5 = r2
        L_0x0052:
            com.caverock.androidsvg.b$h r6 = r9.f9332d
            com.caverock.androidsvg.SVG$Style r6 = r6.f9368a
            java.lang.String r6 = r6.f9099b1
            if (r6 == 0) goto L_0x0072
            com.caverock.androidsvg.SVG r7 = r10.f9210a
            com.caverock.androidsvg.SVG$l0 r6 = r7.mo12757q(r6)
            if (r6 == 0) goto L_0x0065
            com.caverock.androidsvg.SVG$q r6 = (com.caverock.androidsvg.SVG.C1861q) r6
            goto L_0x0073
        L_0x0065:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.caverock.androidsvg.b$h r7 = r9.f9332d
            com.caverock.androidsvg.SVG$Style r7 = r7.f9368a
            java.lang.String r7 = r7.f9099b1
            r6[r3] = r7
            m13023F(r0, r6)
        L_0x0072:
            r6 = r2
        L_0x0073:
            boolean r0 = r10 instanceof com.caverock.androidsvg.SVG.C1869u
            if (r0 == 0) goto L_0x0085
            com.caverock.androidsvg.b$b r0 = new com.caverock.androidsvg.b$b
            com.caverock.androidsvg.SVG$u r10 = (com.caverock.androidsvg.SVG.C1869u) r10
            com.caverock.androidsvg.SVG$v r10 = r10.f9248o
            r0.<init>(r10)
            java.util.List r10 = r0.mo13039f()
            goto L_0x0096
        L_0x0085:
            boolean r0 = r10 instanceof com.caverock.androidsvg.SVG.C1859p
            if (r0 == 0) goto L_0x0090
            com.caverock.androidsvg.SVG$p r10 = (com.caverock.androidsvg.SVG.C1859p) r10
            java.util.List r10 = r9.mo13011k(r10)
            goto L_0x0096
        L_0x0090:
            com.caverock.androidsvg.SVG$y r10 = (com.caverock.androidsvg.SVG.C1877y) r10
            java.util.List r10 = r9.mo13013l(r10)
        L_0x0096:
            if (r10 != 0) goto L_0x0099
            return
        L_0x0099:
            int r0 = r10.size()
            if (r0 != 0) goto L_0x00a0
            return
        L_0x00a0:
            com.caverock.androidsvg.b$h r7 = r9.f9332d
            com.caverock.androidsvg.SVG$Style r7 = r7.f9368a
            r7.f9099b1 = r2
            r7.f9116v0 = r2
            r7.f9106k0 = r2
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r2 = r10.get(r3)
            com.caverock.androidsvg.b$c r2 = (com.caverock.androidsvg.C1893b.C1896c) r2
            r9.mo12965H0(r1, r2)
        L_0x00b5:
            if (r5 == 0) goto L_0x00e6
            int r1 = r10.size()
            r2 = 2
            if (r1 <= r2) goto L_0x00e6
            java.lang.Object r1 = r10.get(r3)
            com.caverock.androidsvg.b$c r1 = (com.caverock.androidsvg.C1893b.C1896c) r1
            java.lang.Object r2 = r10.get(r4)
            com.caverock.androidsvg.b$c r2 = (com.caverock.androidsvg.C1893b.C1896c) r2
            r3 = r4
        L_0x00cb:
            int r7 = r0 + -1
            if (r3 >= r7) goto L_0x00e6
            int r3 = r3 + 1
            java.lang.Object r7 = r10.get(r3)
            com.caverock.androidsvg.b$c r7 = (com.caverock.androidsvg.C1893b.C1896c) r7
            boolean r8 = r2.f9353e
            if (r8 == 0) goto L_0x00e0
            com.caverock.androidsvg.b$c r1 = r9.mo13018n0(r1, r2, r7)
            goto L_0x00e1
        L_0x00e0:
            r1 = r2
        L_0x00e1:
            r9.mo12965H0(r5, r1)
            r2 = r7
            goto L_0x00cb
        L_0x00e6:
            if (r6 == 0) goto L_0x00f2
            int r0 = r0 - r4
            java.lang.Object r10 = r10.get(r0)
            com.caverock.androidsvg.b$c r10 = (com.caverock.androidsvg.C1893b.C1896c) r10
            r9.mo12965H0(r6, r10)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C1893b.mo12967I0(com.caverock.androidsvg.SVG$k):void");
    }

    /* renamed from: J */
    public final void mo12968J(SVG.C1858o0 o0Var, SVG.C1858o0 o0Var2) {
        if (o0Var.f9221m == null) {
            o0Var.f9221m = o0Var2.f9221m;
        }
        if (o0Var.f9222n == null) {
            o0Var.f9222n = o0Var2.f9222n;
        }
        if (o0Var.f9223o == null) {
            o0Var.f9223o = o0Var2.f9223o;
        }
        if (o0Var.f9224p == null) {
            o0Var.f9224p = o0Var2.f9224p;
        }
        if (o0Var.f9225q == null) {
            o0Var.f9225q = o0Var2.f9225q;
        }
    }

    /* renamed from: J0 */
    public final void mo12969J0(SVG.C1863r rVar, SVG.C1846i0 i0Var, SVG.C1829b bVar) {
        boolean z;
        float f;
        float f2;
        float f3;
        m13038y("Mask render", new Object[0]);
        Boolean bool = rVar.f9237o;
        boolean z2 = true;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            SVG.C1857o oVar = rVar.f9241s;
            if (oVar != null) {
                f2 = oVar.mo12791g(this);
            } else {
                f2 = bVar.f9153c;
            }
            SVG.C1857o oVar2 = rVar.f9242t;
            if (oVar2 != null) {
                f = oVar2.mo12792h(this);
            } else {
                f = bVar.f9154d;
            }
        } else {
            SVG.C1857o oVar3 = rVar.f9241s;
            float f4 = 1.2f;
            if (oVar3 != null) {
                f3 = oVar3.mo12790f(this, 1.0f);
            } else {
                f3 = 1.2f;
            }
            SVG.C1857o oVar4 = rVar.f9242t;
            if (oVar4 != null) {
                f4 = oVar4.mo12790f(this, 1.0f);
            }
            f2 = f3 * bVar.f9153c;
            f = f4 * bVar.f9154d;
        }
        if (f2 != Utils.FLOAT_EPSILON && f != Utils.FLOAT_EPSILON) {
            mo12987S0();
            C1901h M = mo12974M(rVar);
            this.f9332d = M;
            M.f9368a.f9088H = Float.valueOf(1.0f);
            boolean m0 = mo13016m0();
            this.f9329a.save();
            Boolean bool2 = rVar.f9238p;
            if (bool2 != null && !bool2.booleanValue()) {
                z2 = false;
            }
            if (!z2) {
                this.f9329a.translate(bVar.f9151a, bVar.f9152b);
                this.f9329a.scale(bVar.f9153c, bVar.f9154d);
            }
            mo12961F0(rVar, false);
            this.f9329a.restore();
            if (m0) {
                mo13012k0(i0Var, bVar);
            }
            mo12985R0();
        }
    }

    /* renamed from: K */
    public final void mo12970K(SVG.C1875x xVar, String str) {
        SVG.C1852l0 q = xVar.f9210a.mo12757q(str);
        if (q == null) {
            m13025Z0("Pattern reference '%s' not found", str);
        } else if (!(q instanceof SVG.C1875x)) {
            m13023F("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (q == xVar) {
            m13023F("Circular reference in pattern href attribute '%s'", str);
        } else {
            SVG.C1875x xVar2 = (SVG.C1875x) q;
            if (xVar.f9255q == null) {
                xVar.f9255q = xVar2.f9255q;
            }
            if (xVar.f9256r == null) {
                xVar.f9256r = xVar2.f9256r;
            }
            if (xVar.f9257s == null) {
                xVar.f9257s = xVar2.f9257s;
            }
            if (xVar.f9258t == null) {
                xVar.f9258t = xVar2.f9258t;
            }
            if (xVar.f9259u == null) {
                xVar.f9259u = xVar2.f9259u;
            }
            if (xVar.f9260v == null) {
                xVar.f9260v = xVar2.f9260v;
            }
            if (xVar.f9261w == null) {
                xVar.f9261w = xVar2.f9261w;
            }
            if (xVar.f9177i.isEmpty()) {
                xVar.f9177i = xVar2.f9177i;
            }
            if (xVar.f9230p == null) {
                xVar.f9230p = xVar2.f9230p;
            }
            if (xVar.f9218o == null) {
                xVar.f9218o = xVar2.f9218o;
            }
            String str2 = xVar2.f9262x;
            if (str2 != null) {
                mo12970K(xVar, str2);
            }
        }
    }

    /* renamed from: K0 */
    public final void mo12971K0(SVG.C1862q0 q0Var) {
        Set<String> a;
        String language = Locale.getDefault().getLanguage();
        SVG.m12725g();
        for (SVG.C1852l0 next : q0Var.mo12772b()) {
            if (next instanceof SVG.C1838e0) {
                SVG.C1838e0 e0Var = (SVG.C1838e0) next;
                if (e0Var.mo12775c() == null && ((a = e0Var.mo12774a()) == null || (!a.isEmpty() && a.contains(language)))) {
                    Set<String> g = e0Var.mo12778g();
                    if (g != null) {
                        if (f9328i == null) {
                            m13024V();
                        }
                        if (g.isEmpty()) {
                            continue;
                        } else if (!f9328i.containsAll(g)) {
                            continue;
                        }
                    }
                    Set<String> m = e0Var.mo12782m();
                    if (m != null) {
                        boolean isEmpty = m.isEmpty();
                    } else {
                        Set<String> n = e0Var.mo12783n();
                        if (n != null) {
                            boolean isEmpty2 = n.isEmpty();
                        } else {
                            mo12952A0(next);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: L */
    public final void mo12972L(SVG.C1846i0 i0Var, Path path, SVG.C1875x xVar) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z2;
        float f6;
        float f7;
        float f8;
        float f9;
        SVG.C1846i0 i0Var2 = i0Var;
        SVG.C1875x xVar2 = xVar;
        Boolean bool = xVar2.f9255q;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        String str = xVar2.f9262x;
        if (str != null) {
            mo12970K(xVar2, str);
        }
        if (z) {
            SVG.C1857o oVar = xVar2.f9258t;
            if (oVar != null) {
                f4 = oVar.mo12791g(this);
            } else {
                f4 = 0.0f;
            }
            SVG.C1857o oVar2 = xVar2.f9259u;
            if (oVar2 != null) {
                f3 = oVar2.mo12792h(this);
            } else {
                f3 = 0.0f;
            }
            SVG.C1857o oVar3 = xVar2.f9260v;
            if (oVar3 != null) {
                f2 = oVar3.mo12791g(this);
            } else {
                f2 = 0.0f;
            }
            SVG.C1857o oVar4 = xVar2.f9261w;
            if (oVar4 != null) {
                f = oVar4.mo12792h(this);
            } else {
                f = 0.0f;
            }
        } else {
            SVG.C1857o oVar5 = xVar2.f9258t;
            if (oVar5 != null) {
                f6 = oVar5.mo12790f(this, 1.0f);
            } else {
                f6 = 0.0f;
            }
            SVG.C1857o oVar6 = xVar2.f9259u;
            if (oVar6 != null) {
                f7 = oVar6.mo12790f(this, 1.0f);
            } else {
                f7 = 0.0f;
            }
            SVG.C1857o oVar7 = xVar2.f9260v;
            if (oVar7 != null) {
                f8 = oVar7.mo12790f(this, 1.0f);
            } else {
                f8 = 0.0f;
            }
            SVG.C1857o oVar8 = xVar2.f9261w;
            if (oVar8 != null) {
                f9 = oVar8.mo12790f(this, 1.0f);
            } else {
                f9 = 0.0f;
            }
            SVG.C1829b bVar = i0Var2.f9193h;
            float f10 = bVar.f9151a;
            float f11 = bVar.f9153c;
            f4 = (f6 * f11) + f10;
            float f12 = bVar.f9152b;
            float f13 = bVar.f9154d;
            float f14 = f8 * f11;
            f = f9 * f13;
            f3 = (f7 * f13) + f12;
            f2 = f14;
        }
        if (f2 != Utils.FLOAT_EPSILON && f != Utils.FLOAT_EPSILON) {
            PreserveAspectRatio preserveAspectRatio = xVar2.f9218o;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.f9066e;
            }
            mo12987S0();
            this.f9329a.clipPath(path);
            C1901h hVar = new C1901h();
            mo12992V0(hVar, SVG.Style.m12747a());
            hVar.f9368a.f9097Z = Boolean.FALSE;
            this.f9332d = mo12976N(xVar2, hVar);
            SVG.C1829b bVar2 = i0Var2.f9193h;
            Matrix matrix = xVar2.f9257s;
            if (matrix != null) {
                this.f9329a.concat(matrix);
                Matrix matrix2 = new Matrix();
                if (xVar2.f9257s.invert(matrix2)) {
                    SVG.C1829b bVar3 = i0Var2.f9193h;
                    SVG.C1829b bVar4 = i0Var2.f9193h;
                    SVG.C1829b bVar5 = i0Var2.f9193h;
                    float[] fArr = {bVar3.f9151a, bVar3.f9152b, bVar3.mo12768b(), bVar4.f9152b, bVar4.mo12768b(), i0Var2.f9193h.mo12769c(), bVar5.f9151a, bVar5.mo12769c()};
                    matrix2.mapPoints(fArr);
                    float f15 = fArr[0];
                    float f16 = fArr[1];
                    RectF rectF = new RectF(f15, f16, f15, f16);
                    for (int i = 2; i <= 6; i += 2) {
                        float f17 = fArr[i];
                        if (f17 < rectF.left) {
                            rectF.left = f17;
                        }
                        if (f17 > rectF.right) {
                            rectF.right = f17;
                        }
                        float f18 = fArr[i + 1];
                        if (f18 < rectF.top) {
                            rectF.top = f18;
                        }
                        if (f18 > rectF.bottom) {
                            rectF.bottom = f18;
                        }
                    }
                    float f19 = rectF.left;
                    float f20 = rectF.top;
                    bVar2 = new SVG.C1829b(f19, f20, rectF.right - f19, rectF.bottom - f20);
                }
            }
            float floor = f4 + (((float) Math.floor((double) ((bVar2.f9151a - f4) / f2))) * f2);
            float b = bVar2.mo12768b();
            float c = bVar2.mo12769c();
            SVG.C1829b bVar6 = new SVG.C1829b(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f2, f);
            boolean m0 = mo13016m0();
            for (float floor2 = f3 + (((float) Math.floor((double) ((bVar2.f9152b - f3) / f))) * f); floor2 < c; floor2 += f) {
                float f21 = floor;
                while (f21 < b) {
                    bVar6.f9151a = f21;
                    bVar6.f9152b = floor2;
                    mo12987S0();
                    if (!this.f9332d.f9368a.f9097Z.booleanValue()) {
                        f5 = floor;
                        mo12979O0(bVar6.f9151a, bVar6.f9152b, bVar6.f9153c, bVar6.f9154d);
                    } else {
                        f5 = floor;
                    }
                    SVG.C1829b bVar7 = xVar2.f9230p;
                    if (bVar7 != null) {
                        this.f9329a.concat(mo13019o(bVar6, bVar7, preserveAspectRatio));
                    } else {
                        Boolean bool2 = xVar2.f9256r;
                        if (bool2 == null || bool2.booleanValue()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f9329a.translate(f21, floor2);
                        if (!z2) {
                            Canvas canvas = this.f9329a;
                            SVG.C1829b bVar8 = i0Var2.f9193h;
                            canvas.scale(bVar8.f9153c, bVar8.f9154d);
                        }
                    }
                    for (SVG.C1852l0 A0 : xVar2.f9177i) {
                        mo12952A0(A0);
                    }
                    mo12985R0();
                    f21 += f2;
                    floor = f5;
                }
                float f22 = floor;
            }
            if (m0) {
                mo13010j0(xVar2);
            }
            mo12985R0();
        }
    }

    /* renamed from: L0 */
    public final void mo12973L0(SVG.C1876x0 x0Var) {
        float f;
        m13038y("TextPath render", new Object[0]);
        mo12994W0(this.f9332d, x0Var);
        if (mo12951A() && mo12998Y0()) {
            SVG.C1852l0 q = x0Var.f9210a.mo12757q(x0Var.f9263o);
            if (q == null) {
                m13023F("TextPath reference '%s' not found", x0Var.f9263o);
                return;
            }
            SVG.C1869u uVar = (SVG.C1869u) q;
            Path f2 = new C1897d(uVar.f9248o).mo13043f();
            Matrix matrix = uVar.f9204n;
            if (matrix != null) {
                f2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(f2, false);
            SVG.C1857o oVar = x0Var.f9264p;
            if (oVar != null) {
                f = oVar.mo12790f(this, pathMeasure.getLength());
            } else {
                f = 0.0f;
            }
            SVG.Style.TextAnchor O = mo12978O();
            if (O != SVG.Style.TextAnchor.Start) {
                float n = mo13017n(x0Var);
                if (O == SVG.Style.TextAnchor.Middle) {
                    n /= 2.0f;
                }
                f -= n;
            }
            mo13025r((SVG.C1846i0) x0Var.mo12766e());
            boolean m0 = mo13016m0();
            mo12959E(x0Var, new C1898e(f2, f, Utils.FLOAT_EPSILON));
            if (m0) {
                mo13010j0(x0Var);
            }
        }
    }

    /* renamed from: M */
    public final C1901h mo12974M(SVG.C1852l0 l0Var) {
        C1901h hVar = new C1901h();
        mo12992V0(hVar, SVG.Style.m12747a());
        return mo12976N(l0Var, hVar);
    }

    /* renamed from: M0 */
    public final boolean mo12975M0() {
        if (this.f9332d.f9368a.f9088H.floatValue() < 1.0f || this.f9332d.f9368a.f9114t1 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final C1901h mo12976N(SVG.C1852l0 l0Var, C1901h hVar) {
        ArrayList<SVG.C1848j0> arrayList = new ArrayList<>();
        while (true) {
            if (l0Var instanceof SVG.C1848j0) {
                arrayList.add(0, (SVG.C1848j0) l0Var);
            }
            SVG.C1844h0 h0Var = l0Var.f9211b;
            if (h0Var == null) {
                break;
            }
            l0Var = (SVG.C1852l0) h0Var;
        }
        for (SVG.C1848j0 W0 : arrayList) {
            mo12994W0(hVar, W0);
        }
        C1901h hVar2 = this.f9332d;
        hVar.f9374g = hVar2.f9374g;
        hVar.f9373f = hVar2.f9373f;
        return hVar;
    }

    /* renamed from: N0 */
    public final void mo12977N0() {
        this.f9332d = new C1901h();
        this.f9333e = new Stack<>();
        mo12992V0(this.f9332d, SVG.Style.m12747a());
        C1901h hVar = this.f9332d;
        hVar.f9373f = null;
        hVar.f9375h = false;
        this.f9333e.push(new C1901h(hVar));
        this.f9335g = new Stack<>();
        this.f9334f = new Stack<>();
    }

    /* renamed from: O */
    public final SVG.Style.TextAnchor mo12978O() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.f9332d.f9368a;
        if (style.f9095X == SVG.Style.TextDirection.LTR || (textAnchor = style.f9096Y) == SVG.Style.TextAnchor.Middle) {
            return style.f9096Y;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        if (textAnchor == textAnchor2) {
            return SVG.Style.TextAnchor.End;
        }
        return textAnchor2;
    }

    /* renamed from: O0 */
    public final void mo12979O0(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        SVG.C1832c cVar = this.f9332d.f9368a.f9102e0;
        if (cVar != null) {
            f += cVar.f9163d.mo12791g(this);
            f2 += this.f9332d.f9368a.f9102e0.f9160a.mo12792h(this);
            f5 -= this.f9332d.f9368a.f9102e0.f9161b.mo12791g(this);
            f6 -= this.f9332d.f9368a.f9102e0.f9162c.mo12792h(this);
        }
        this.f9329a.clipRect(f, f2, f5, f6);
    }

    /* renamed from: P */
    public final Path.FillType mo12980P() {
        SVG.Style.FillRule fillRule = this.f9332d.f9368a.f9113s1;
        if (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    /* renamed from: P0 */
    public final void mo12981P0(C1901h hVar, boolean z, SVG.C1854m0 m0Var) {
        Float f;
        int i;
        SVG.Style style = hVar.f9368a;
        if (z) {
            f = style.f9104g;
        } else {
            f = style.f9110r;
        }
        float floatValue = f.floatValue();
        if (m0Var instanceof SVG.C1839f) {
            i = ((SVG.C1839f) m0Var).f9176a;
        } else if (m0Var instanceof SVG.C1841g) {
            i = hVar.f9368a.f9089I.f9176a;
        } else {
            return;
        }
        int x = m13037x(i, floatValue);
        if (z) {
            hVar.f9371d.setColor(x);
        } else {
            hVar.f9372e.setColor(x);
        }
    }

    /* renamed from: Q */
    public float mo12982Q() {
        return this.f9332d.f9371d.getTextSize();
    }

    /* renamed from: Q0 */
    public final void mo12983Q0(boolean z, SVG.C1830b0 b0Var) {
        boolean z2 = true;
        if (z) {
            if (mo12993W(b0Var.f9201e, 2147483648L)) {
                C1901h hVar = this.f9332d;
                SVG.Style style = hVar.f9368a;
                SVG.C1854m0 m0Var = b0Var.f9201e.f9115u1;
                style.f9100d = m0Var;
                if (m0Var == null) {
                    z2 = false;
                }
                hVar.f9369b = z2;
            }
            if (mo12993W(b0Var.f9201e, 4294967296L)) {
                this.f9332d.f9368a.f9104g = b0Var.f9201e.f9117v1;
            }
            if (mo12993W(b0Var.f9201e, 6442450944L)) {
                C1901h hVar2 = this.f9332d;
                mo12981P0(hVar2, z, hVar2.f9368a.f9100d);
                return;
            }
            return;
        }
        if (mo12993W(b0Var.f9201e, 2147483648L)) {
            C1901h hVar3 = this.f9332d;
            SVG.Style style2 = hVar3.f9368a;
            SVG.C1854m0 m0Var2 = b0Var.f9201e.f9115u1;
            style2.f9105k = m0Var2;
            if (m0Var2 == null) {
                z2 = false;
            }
            hVar3.f9370c = z2;
        }
        if (mo12993W(b0Var.f9201e, 4294967296L)) {
            this.f9332d.f9368a.f9110r = b0Var.f9201e.f9117v1;
        }
        if (mo12993W(b0Var.f9201e, 6442450944L)) {
            C1901h hVar4 = this.f9332d;
            mo12981P0(hVar4, z, hVar4.f9368a.f9105k);
        }
    }

    /* renamed from: R */
    public float mo12984R() {
        return this.f9332d.f9371d.getTextSize() / 2.0f;
    }

    /* renamed from: R0 */
    public final void mo12985R0() {
        this.f9329a.restore();
        this.f9332d = this.f9333e.pop();
    }

    /* renamed from: S */
    public SVG.C1829b mo12986S() {
        C1901h hVar = this.f9332d;
        SVG.C1829b bVar = hVar.f9374g;
        if (bVar != null) {
            return bVar;
        }
        return hVar.f9373f;
    }

    /* renamed from: S0 */
    public final void mo12987S0() {
        this.f9329a.save();
        this.f9333e.push(this.f9332d);
        this.f9332d = new C1901h(this.f9332d);
    }

    /* renamed from: T */
    public float mo12988T() {
        return this.f9330b;
    }

    /* renamed from: T0 */
    public final String mo12989T0(String str, boolean z, boolean z2) {
        if (this.f9332d.f9375h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: U */
    public final Path.FillType mo12990U() {
        SVG.Style.FillRule fillRule = this.f9332d.f9368a.f9101e;
        if (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    /* renamed from: U0 */
    public final void mo12991U0(SVG.C1846i0 i0Var) {
        if (i0Var.f9211b != null && i0Var.f9193h != null) {
            Matrix matrix = new Matrix();
            if (this.f9335g.peek().invert(matrix)) {
                SVG.C1829b bVar = i0Var.f9193h;
                SVG.C1829b bVar2 = i0Var.f9193h;
                SVG.C1829b bVar3 = i0Var.f9193h;
                float[] fArr = {bVar.f9151a, bVar.f9152b, bVar.mo12768b(), bVar2.f9152b, bVar2.mo12768b(), i0Var.f9193h.mo12769c(), bVar3.f9151a, bVar3.mo12769c()};
                matrix.preConcat(this.f9329a.getMatrix());
                matrix.mapPoints(fArr);
                float f = fArr[0];
                float f2 = fArr[1];
                RectF rectF = new RectF(f, f2, f, f2);
                for (int i = 2; i <= 6; i += 2) {
                    float f3 = fArr[i];
                    if (f3 < rectF.left) {
                        rectF.left = f3;
                    }
                    if (f3 > rectF.right) {
                        rectF.right = f3;
                    }
                    float f4 = fArr[i + 1];
                    if (f4 < rectF.top) {
                        rectF.top = f4;
                    }
                    if (f4 > rectF.bottom) {
                        rectF.bottom = f4;
                    }
                }
                SVG.C1846i0 i0Var2 = (SVG.C1846i0) this.f9334f.peek();
                SVG.C1829b bVar4 = i0Var2.f9193h;
                if (bVar4 == null) {
                    i0Var2.f9193h = SVG.C1829b.m12751a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    bVar4.mo12770d(SVG.C1829b.m12751a(rectF.left, rectF.top, rectF.right, rectF.bottom));
                }
            }
        }
    }

    /* renamed from: V0 */
    public final void mo12992V0(C1901h hVar, SVG.Style style) {
        if (mo12993W(style, 4096)) {
            hVar.f9368a.f9089I = style.f9089I;
        }
        if (mo12993W(style, 2048)) {
            hVar.f9368a.f9088H = style.f9088H;
        }
        boolean z = false;
        if (mo12993W(style, 1)) {
            hVar.f9368a.f9100d = style.f9100d;
            SVG.C1854m0 m0Var = style.f9100d;
            hVar.f9369b = (m0Var == null || m0Var == SVG.C1839f.f9175e) ? false : true;
        }
        if (mo12993W(style, 4)) {
            hVar.f9368a.f9104g = style.f9104g;
        }
        if (mo12993W(style, 6149)) {
            mo12981P0(hVar, true, hVar.f9368a.f9100d);
        }
        if (mo12993W(style, 2)) {
            hVar.f9368a.f9101e = style.f9101e;
        }
        if (mo12993W(style, 8)) {
            hVar.f9368a.f9105k = style.f9105k;
            SVG.C1854m0 m0Var2 = style.f9105k;
            hVar.f9370c = (m0Var2 == null || m0Var2 == SVG.C1839f.f9175e) ? false : true;
        }
        if (mo12993W(style, 16)) {
            hVar.f9368a.f9110r = style.f9110r;
        }
        if (mo12993W(style, 6168)) {
            mo12981P0(hVar, false, hVar.f9368a.f9105k);
        }
        if (mo12993W(style, 34359738368L)) {
            hVar.f9368a.f9122y1 = style.f9122y1;
        }
        if (mo12993W(style, 32)) {
            SVG.Style style2 = hVar.f9368a;
            SVG.C1857o oVar = style.f9112s;
            style2.f9112s = oVar;
            hVar.f9372e.setStrokeWidth(oVar.mo12789d(this));
        }
        if (mo12993W(style, 64)) {
            hVar.f9368a.f9119x = style.f9119x;
            int i = C1894a.f9338b[style.f9119x.ordinal()];
            if (i == 1) {
                hVar.f9372e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                hVar.f9372e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                hVar.f9372e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (mo12993W(style, 128)) {
            hVar.f9368a.f9121y = style.f9121y;
            int i2 = C1894a.f9339c[style.f9121y.ordinal()];
            if (i2 == 1) {
                hVar.f9372e.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                hVar.f9372e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                hVar.f9372e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (mo12993W(style, 256)) {
            hVar.f9368a.f9085A = style.f9085A;
            hVar.f9372e.setStrokeMiter(style.f9085A.floatValue());
        }
        if (mo12993W(style, 512)) {
            hVar.f9368a.f9086B = style.f9086B;
        }
        if (mo12993W(style, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) {
            hVar.f9368a.f9087C = style.f9087C;
        }
        Typeface typeface = null;
        if (mo12993W(style, 1536)) {
            SVG.C1857o[] oVarArr = hVar.f9368a.f9086B;
            if (oVarArr == null) {
                hVar.f9372e.setPathEffect((PathEffect) null);
            } else {
                int length = oVarArr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float d = hVar.f9368a.f9086B[i4 % length].mo12789d(this);
                    fArr[i4] = d;
                    f += d;
                }
                if (f == Utils.FLOAT_EPSILON) {
                    hVar.f9372e.setPathEffect((PathEffect) null);
                } else {
                    float d2 = hVar.f9368a.f9087C.mo12789d(this);
                    if (d2 < Utils.FLOAT_EPSILON) {
                        d2 = (d2 % f) + f;
                    }
                    hVar.f9372e.setPathEffect(new DashPathEffect(fArr, d2));
                }
            }
        }
        if (mo12993W(style, Http2Stream.EMIT_BUFFER_SIZE)) {
            float Q = mo12982Q();
            hVar.f9368a.f9091M = style.f9091M;
            hVar.f9371d.setTextSize(style.f9091M.mo12790f(this, Q));
            hVar.f9372e.setTextSize(style.f9091M.mo12790f(this, Q));
        }
        if (mo12993W(style, 8192)) {
            hVar.f9368a.f9090L = style.f9090L;
        }
        if (mo12993W(style, 32768)) {
            if (style.f9092P.intValue() == -1 && hVar.f9368a.f9092P.intValue() > 100) {
                SVG.Style style3 = hVar.f9368a;
                style3.f9092P = Integer.valueOf(style3.f9092P.intValue() - 100);
            } else if (style.f9092P.intValue() != 1 || hVar.f9368a.f9092P.intValue() >= 900) {
                hVar.f9368a.f9092P = style.f9092P;
            } else {
                SVG.Style style4 = hVar.f9368a;
                style4.f9092P = Integer.valueOf(style4.f9092P.intValue() + 100);
            }
        }
        if (mo12993W(style, 65536)) {
            hVar.f9368a.f9093Q = style.f9093Q;
        }
        if (mo12993W(style, 106496)) {
            if (hVar.f9368a.f9090L != null && this.f9331c != null) {
                SVG.m12725g();
                for (String t : hVar.f9368a.f9090L) {
                    SVG.Style style5 = hVar.f9368a;
                    typeface = mo13029t(t, style5.f9092P, style5.f9093Q);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                SVG.Style style6 = hVar.f9368a;
                typeface = mo13029t("serif", style6.f9092P, style6.f9093Q);
            }
            hVar.f9371d.setTypeface(typeface);
            hVar.f9372e.setTypeface(typeface);
        }
        if (mo12993W(style, 131072)) {
            hVar.f9368a.f9094U = style.f9094U;
            Paint paint = hVar.f9371d;
            SVG.Style.TextDecoration textDecoration = style.f9094U;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = hVar.f9371d;
            SVG.Style.TextDecoration textDecoration3 = style.f9094U;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            hVar.f9372e.setStrikeThruText(style.f9094U == textDecoration2);
            Paint paint3 = hVar.f9372e;
            if (style.f9094U == textDecoration4) {
                z = true;
            }
            paint3.setUnderlineText(z);
        }
        if (mo12993W(style, 68719476736L)) {
            hVar.f9368a.f9095X = style.f9095X;
        }
        if (mo12993W(style, 262144)) {
            hVar.f9368a.f9096Y = style.f9096Y;
        }
        if (mo12993W(style, 524288)) {
            hVar.f9368a.f9097Z = style.f9097Z;
        }
        if (mo12993W(style, 2097152)) {
            hVar.f9368a.f9106k0 = style.f9106k0;
        }
        if (mo12993W(style, 4194304)) {
            hVar.f9368a.f9116v0 = style.f9116v0;
        }
        if (mo12993W(style, 8388608)) {
            hVar.f9368a.f9099b1 = style.f9099b1;
        }
        if (mo12993W(style, 16777216)) {
            hVar.f9368a.f9103e1 = style.f9103e1;
        }
        if (mo12993W(style, 33554432)) {
            hVar.f9368a.f9107o1 = style.f9107o1;
        }
        if (mo12993W(style, 1048576)) {
            hVar.f9368a.f9102e0 = style.f9102e0;
        }
        if (mo12993W(style, 268435456)) {
            hVar.f9368a.f9111r1 = style.f9111r1;
        }
        if (mo12993W(style, 536870912)) {
            hVar.f9368a.f9113s1 = style.f9113s1;
        }
        if (mo12993W(style, 1073741824)) {
            hVar.f9368a.f9114t1 = style.f9114t1;
        }
        if (mo12993W(style, 67108864)) {
            hVar.f9368a.f9108p1 = style.f9108p1;
        }
        if (mo12993W(style, 134217728)) {
            hVar.f9368a.f9109q1 = style.f9109q1;
        }
        if (mo12993W(style, 8589934592L)) {
            hVar.f9368a.f9118w1 = style.f9118w1;
        }
        if (mo12993W(style, 17179869184L)) {
            hVar.f9368a.f9120x1 = style.f9120x1;
        }
        if (mo12993W(style, 137438953472L)) {
            hVar.f9368a.f9123z1 = style.f9123z1;
        }
    }

    /* renamed from: W */
    public final boolean mo12993W(SVG.Style style, long j) {
        if ((style.f9098a & j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W0 */
    public final void mo12994W0(C1901h hVar, SVG.C1848j0 j0Var) {
        boolean z;
        if (j0Var.f9211b == null) {
            z = true;
        } else {
            z = false;
        }
        hVar.f9368a.mo12763b(z);
        SVG.Style style = j0Var.f9201e;
        if (style != null) {
            mo12992V0(hVar, style);
        }
        if (this.f9331c.mo12753m()) {
            for (CSSParser.C1821l next : this.f9331c.mo12749d()) {
                if (CSSParser.m12674l(this.f9336h, next.f9053a, j0Var)) {
                    mo12992V0(hVar, next.f9054b);
                }
            }
        }
        SVG.Style style2 = j0Var.f9202f;
        if (style2 != null) {
            mo12992V0(hVar, style2);
        }
    }

    /* renamed from: X */
    public final void mo12995X(boolean z, SVG.C1829b bVar, SVG.C1850k0 k0Var) {
        boolean z2;
        Paint paint;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        SVG.C1829b bVar2 = bVar;
        SVG.C1850k0 k0Var2 = k0Var;
        String str = k0Var2.f9198l;
        if (str != null) {
            mo12964H(k0Var2, str);
        }
        Boolean bool = k0Var2.f9195i;
        int i = 0;
        if (bool == null || !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1901h hVar = this.f9332d;
        if (z) {
            paint = hVar.f9371d;
        } else {
            paint = hVar.f9372e;
        }
        if (z2) {
            SVG.C1829b S = mo12986S();
            SVG.C1857o oVar = k0Var2.f9205m;
            if (oVar != null) {
                f10 = oVar.mo12791g(this);
            } else {
                f10 = Utils.FLOAT_EPSILON;
            }
            SVG.C1857o oVar2 = k0Var2.f9206n;
            if (oVar2 != null) {
                f11 = oVar2.mo12792h(this);
            } else {
                f11 = Utils.FLOAT_EPSILON;
            }
            SVG.C1857o oVar3 = k0Var2.f9207o;
            if (oVar3 != null) {
                f12 = oVar3.mo12791g(this);
            } else {
                f12 = S.f9153c;
            }
            SVG.C1857o oVar4 = k0Var2.f9208p;
            if (oVar4 != null) {
                f13 = oVar4.mo12792h(this);
            } else {
                f13 = Utils.FLOAT_EPSILON;
            }
            f2 = f12;
            f4 = f10;
            f3 = f11;
            f = f13;
        } else {
            SVG.C1857o oVar5 = k0Var2.f9205m;
            if (oVar5 != null) {
                f6 = oVar5.mo12790f(this, 1.0f);
            } else {
                f6 = Utils.FLOAT_EPSILON;
            }
            SVG.C1857o oVar6 = k0Var2.f9206n;
            if (oVar6 != null) {
                f7 = oVar6.mo12790f(this, 1.0f);
            } else {
                f7 = Utils.FLOAT_EPSILON;
            }
            SVG.C1857o oVar7 = k0Var2.f9207o;
            if (oVar7 != null) {
                f8 = oVar7.mo12790f(this, 1.0f);
            } else {
                f8 = 1.0f;
            }
            SVG.C1857o oVar8 = k0Var2.f9208p;
            if (oVar8 != null) {
                f9 = oVar8.mo12790f(this, 1.0f);
            } else {
                f9 = Utils.FLOAT_EPSILON;
            }
            f4 = f6;
            f = f9;
            f3 = f7;
            f2 = f8;
        }
        mo12987S0();
        this.f9332d = mo12974M(k0Var2);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(bVar2.f9151a, bVar2.f9152b);
            matrix.preScale(bVar2.f9153c, bVar2.f9154d);
        }
        Matrix matrix2 = k0Var2.f9196j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = k0Var2.f9194h.size();
        if (size == 0) {
            mo12985R0();
            if (z) {
                this.f9332d.f9369b = false;
            } else {
                this.f9332d.f9370c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f14 = -1.0f;
            Iterator<SVG.C1852l0> it = k0Var2.f9194h.iterator();
            while (it.hasNext()) {
                SVG.C1833c0 c0Var = (SVG.C1833c0) it.next();
                Float f15 = c0Var.f9164h;
                if (f15 != null) {
                    f5 = f15.floatValue();
                } else {
                    f5 = Utils.FLOAT_EPSILON;
                }
                if (i == 0 || f5 >= f14) {
                    fArr[i] = f5;
                    f14 = f5;
                } else {
                    fArr[i] = f14;
                }
                mo12987S0();
                mo12994W0(this.f9332d, c0Var);
                SVG.Style style = this.f9332d.f9368a;
                SVG.C1839f fVar = (SVG.C1839f) style.f9108p1;
                if (fVar == null) {
                    fVar = SVG.C1839f.f9174d;
                }
                iArr[i] = m13037x(fVar.f9176a, style.f9109q1.floatValue());
                i++;
                mo12985R0();
            }
            if ((f4 == f2 && f3 == f) || size == 1) {
                mo12985R0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG.GradientSpread gradientSpread = k0Var2.f9197k;
            if (gradientSpread != null) {
                if (gradientSpread == SVG.GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (gradientSpread == SVG.GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            mo12985R0();
            LinearGradient linearGradient = new LinearGradient(f4, f3, f2, f, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(m13036w(this.f9332d.f9368a.f9104g.floatValue()));
        }
    }

    /* renamed from: X0 */
    public final void mo12996X0() {
        int i;
        SVG.Style style = this.f9332d.f9368a;
        SVG.C1854m0 m0Var = style.f9118w1;
        if (m0Var instanceof SVG.C1839f) {
            i = ((SVG.C1839f) m0Var).f9176a;
        } else if (m0Var instanceof SVG.C1841g) {
            i = style.f9089I.f9176a;
        } else {
            return;
        }
        Float f = style.f9120x1;
        if (f != null) {
            i = m13037x(i, f.floatValue());
        }
        this.f9329a.drawColor(i);
    }

    /* renamed from: Y */
    public final Path mo12997Y(SVG.C1835d dVar) {
        float f;
        SVG.C1835d dVar2 = dVar;
        SVG.C1857o oVar = dVar2.f9165o;
        float f2 = Utils.FLOAT_EPSILON;
        if (oVar != null) {
            f = oVar.mo12791g(this);
        } else {
            f = 0.0f;
        }
        SVG.C1857o oVar2 = dVar2.f9166p;
        if (oVar2 != null) {
            f2 = oVar2.mo12792h(this);
        }
        float d = dVar2.f9167q.mo12789d(this);
        float f3 = f - d;
        float f4 = f2 - d;
        float f5 = f + d;
        float f6 = f2 + d;
        if (dVar2.f9193h == null) {
            float f7 = 2.0f * d;
            dVar2.f9193h = new SVG.C1829b(f3, f4, f7, f7);
        }
        float f8 = 0.5522848f * d;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f8;
        float f10 = f2 - f8;
        Path path2 = path;
        path2.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path2.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f8;
        path2.cubicTo(f12, f6, f3, f11, f3, f2);
        path2.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    /* renamed from: Y0 */
    public final boolean mo12998Y0() {
        Boolean bool = this.f9332d.f9368a.f9107o1;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: Z */
    public final Path mo12999Z(SVG.C1845i iVar) {
        float f;
        SVG.C1845i iVar2 = iVar;
        SVG.C1857o oVar = iVar2.f9189o;
        float f2 = Utils.FLOAT_EPSILON;
        if (oVar != null) {
            f = oVar.mo12791g(this);
        } else {
            f = 0.0f;
        }
        SVG.C1857o oVar2 = iVar2.f9190p;
        if (oVar2 != null) {
            f2 = oVar2.mo12792h(this);
        }
        float g = iVar2.f9191q.mo12791g(this);
        float h = iVar2.f9192r.mo12792h(this);
        float f3 = f - g;
        float f4 = f2 - h;
        float f5 = f + g;
        float f6 = f2 + h;
        if (iVar2.f9193h == null) {
            iVar2.f9193h = new SVG.C1829b(f3, f4, g * 2.0f, 2.0f * h);
        }
        float f7 = g * 0.5522848f;
        float f8 = 0.5522848f * h;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f7;
        float f10 = f2 - f8;
        Path path2 = path;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f8 + f2;
        Path path3 = path2;
        path3.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f7;
        path3.cubicTo(f12, f6, f3, f11, f3, f2);
        path3.cubicTo(f3, f10, f12, f4, f, f4);
        path2.close();
        return path2;
    }

    /* renamed from: a0 */
    public final Path mo13000a0(SVG.C1859p pVar) {
        float f;
        float f2;
        float f3;
        SVG.C1857o oVar = pVar.f9226o;
        float f4 = Utils.FLOAT_EPSILON;
        if (oVar == null) {
            f = 0.0f;
        } else {
            f = oVar.mo12791g(this);
        }
        SVG.C1857o oVar2 = pVar.f9227p;
        if (oVar2 == null) {
            f2 = 0.0f;
        } else {
            f2 = oVar2.mo12792h(this);
        }
        SVG.C1857o oVar3 = pVar.f9228q;
        if (oVar3 == null) {
            f3 = 0.0f;
        } else {
            f3 = oVar3.mo12791g(this);
        }
        SVG.C1857o oVar4 = pVar.f9229r;
        if (oVar4 != null) {
            f4 = oVar4.mo12792h(this);
        }
        if (pVar.f9193h == null) {
            pVar.f9193h = new SVG.C1829b(Math.min(f, f3), Math.min(f2, f4), Math.abs(f3 - f), Math.abs(f4 - f2));
        }
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* renamed from: b0 */
    public final Path mo13001b0(SVG.C1877y yVar) {
        Path path = new Path();
        float[] fArr = yVar.f9266o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = yVar.f9266o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (yVar instanceof SVG.C1879z) {
            path.close();
        }
        if (yVar.f9193h == null) {
            yVar.f9193h = mo13015m(path);
        }
        return path;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dd  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Path mo13002c0(com.caverock.androidsvg.SVG.C1827a0 r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            com.caverock.androidsvg.SVG$o r2 = r1.f9147s
            r3 = 0
            if (r2 != 0) goto L_0x000f
            com.caverock.androidsvg.SVG$o r4 = r1.f9148t
            if (r4 != 0) goto L_0x000f
            r2 = r3
            goto L_0x0017
        L_0x000f:
            if (r2 != 0) goto L_0x0019
            com.caverock.androidsvg.SVG$o r2 = r1.f9148t
            float r2 = r2.mo12792h(r0)
        L_0x0017:
            r4 = r2
            goto L_0x002c
        L_0x0019:
            com.caverock.androidsvg.SVG$o r4 = r1.f9148t
            if (r4 != 0) goto L_0x0022
            float r2 = r2.mo12791g(r0)
            goto L_0x0017
        L_0x0022:
            float r2 = r2.mo12791g(r0)
            com.caverock.androidsvg.SVG$o r4 = r1.f9148t
            float r4 = r4.mo12792h(r0)
        L_0x002c:
            com.caverock.androidsvg.SVG$o r5 = r1.f9145q
            float r5 = r5.mo12791g(r0)
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r2 = java.lang.Math.min(r2, r5)
            com.caverock.androidsvg.SVG$o r5 = r1.f9146r
            float r5 = r5.mo12792h(r0)
            float r5 = r5 / r6
            float r4 = java.lang.Math.min(r4, r5)
            com.caverock.androidsvg.SVG$o r5 = r1.f9143o
            if (r5 == 0) goto L_0x004d
            float r5 = r5.mo12791g(r0)
            goto L_0x004e
        L_0x004d:
            r5 = r3
        L_0x004e:
            com.caverock.androidsvg.SVG$o r6 = r1.f9144p
            if (r6 == 0) goto L_0x0058
            float r6 = r6.mo12792h(r0)
            r13 = r6
            goto L_0x0059
        L_0x0058:
            r13 = r3
        L_0x0059:
            com.caverock.androidsvg.SVG$o r6 = r1.f9145q
            float r6 = r6.mo12791g(r0)
            com.caverock.androidsvg.SVG$o r7 = r1.f9146r
            float r7 = r7.mo12792h(r0)
            com.caverock.androidsvg.SVG$b r8 = r1.f9193h
            if (r8 != 0) goto L_0x0070
            com.caverock.androidsvg.SVG$b r8 = new com.caverock.androidsvg.SVG$b
            r8.<init>(r5, r13, r6, r7)
            r1.f9193h = r8
        L_0x0070:
            float r15 = r5 + r6
            float r1 = r13 + r7
            android.graphics.Path r14 = new android.graphics.Path
            r14.<init>()
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00dd
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0083
            goto L_0x00dd
        L_0x0083:
            r3 = 1057841801(0x3f0d6289, float:0.5522848)
            float r16 = r2 * r3
            float r3 = r3 * r4
            float r12 = r13 + r4
            r14.moveTo(r5, r12)
            float r17 = r12 - r3
            float r11 = r5 + r2
            float r21 = r11 - r16
            r6 = r14
            r7 = r5
            r8 = r17
            r9 = r21
            r10 = r13
            r24 = r11
            r22 = r12
            r12 = r13
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            float r2 = r15 - r2
            r14.lineTo(r2, r13)
            float r6 = r2 + r16
            r7 = r14
            r8 = r6
            r9 = r13
            r10 = r15
            r11 = r17
            r12 = r15
            r13 = r22
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            float r12 = r1 - r4
            r14.lineTo(r15, r12)
            float r10 = r12 + r3
            r3 = r14
            r16 = r10
            r17 = r6
            r18 = r1
            r19 = r2
            r20 = r1
            r14.cubicTo(r15, r16, r17, r18, r19, r20)
            r2 = r24
            r3.lineTo(r2, r1)
            r6 = r3
            r7 = r21
            r8 = r1
            r9 = r5
            r11 = r5
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            r3.lineTo(r5, r13)
            goto L_0x00ed
        L_0x00dd:
            r3 = r14
            r3.moveTo(r5, r13)
            r3.lineTo(r15, r13)
            r3.lineTo(r15, r1)
            r3.lineTo(r5, r1)
            r3.lineTo(r5, r13)
        L_0x00ed:
            r3.close()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C1893b.mo13002c0(com.caverock.androidsvg.SVG$a0):android.graphics.Path");
    }

    /* renamed from: d0 */
    public final Path mo13003d0(SVG.C1870u0 u0Var) {
        float f;
        float f2;
        float f3;
        List<SVG.C1857o> list = u0Var.f9267o;
        float f4 = Utils.FLOAT_EPSILON;
        if (list == null || list.size() == 0) {
            f = 0.0f;
        } else {
            f = u0Var.f9267o.get(0).mo12791g(this);
        }
        List<SVG.C1857o> list2 = u0Var.f9268p;
        if (list2 == null || list2.size() == 0) {
            f2 = 0.0f;
        } else {
            f2 = u0Var.f9268p.get(0).mo12792h(this);
        }
        List<SVG.C1857o> list3 = u0Var.f9269q;
        if (list3 == null || list3.size() == 0) {
            f3 = 0.0f;
        } else {
            f3 = u0Var.f9269q.get(0).mo12791g(this);
        }
        List<SVG.C1857o> list4 = u0Var.f9270r;
        if (!(list4 == null || list4.size() == 0)) {
            f4 = u0Var.f9270r.get(0).mo12792h(this);
        }
        if (this.f9332d.f9368a.f9096Y != SVG.Style.TextAnchor.Start) {
            float n = mo13017n(u0Var);
            if (this.f9332d.f9368a.f9096Y == SVG.Style.TextAnchor.Middle) {
                n /= 2.0f;
            }
            f -= n;
        }
        if (u0Var.f9193h == null) {
            C1902i iVar = new C1902i(f, f2);
            mo12959E(u0Var, iVar);
            RectF rectF = iVar.f9379d;
            u0Var.f9193h = new SVG.C1829b(rectF.left, rectF.top, rectF.width(), iVar.f9379d.height());
        }
        Path path = new Path();
        mo12959E(u0Var, new C1900g(f + f3, f2 + f4, path));
        return path;
    }

    /* renamed from: e0 */
    public final void mo13004e0(boolean z, SVG.C1829b bVar, SVG.C1858o0 o0Var) {
        boolean z2;
        Paint paint;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        SVG.C1829b bVar2 = bVar;
        SVG.C1858o0 o0Var2 = o0Var;
        String str = o0Var2.f9198l;
        if (str != null) {
            mo12964H(o0Var2, str);
        }
        Boolean bool = o0Var2.f9195i;
        int i = 0;
        if (bool == null || !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1901h hVar = this.f9332d;
        if (z) {
            paint = hVar.f9371d;
        } else {
            paint = hVar.f9372e;
        }
        if (z2) {
            SVG.C1857o oVar = new SVG.C1857o(50.0f, SVG.Unit.percent);
            SVG.C1857o oVar2 = o0Var2.f9221m;
            if (oVar2 != null) {
                f7 = oVar2.mo12791g(this);
            } else {
                f7 = oVar.mo12791g(this);
            }
            SVG.C1857o oVar3 = o0Var2.f9222n;
            if (oVar3 != null) {
                f8 = oVar3.mo12792h(this);
            } else {
                f8 = oVar.mo12792h(this);
            }
            SVG.C1857o oVar4 = o0Var2.f9223o;
            if (oVar4 != null) {
                f9 = oVar4.mo12789d(this);
            } else {
                f9 = oVar.mo12789d(this);
            }
            f = f9;
            f3 = f7;
            f2 = f8;
        } else {
            SVG.C1857o oVar5 = o0Var2.f9221m;
            if (oVar5 != null) {
                f4 = oVar5.mo12790f(this, 1.0f);
            } else {
                f4 = 0.5f;
            }
            SVG.C1857o oVar6 = o0Var2.f9222n;
            if (oVar6 != null) {
                f5 = oVar6.mo12790f(this, 1.0f);
            } else {
                f5 = 0.5f;
            }
            SVG.C1857o oVar7 = o0Var2.f9223o;
            if (oVar7 != null) {
                f6 = oVar7.mo12790f(this, 1.0f);
            } else {
                f6 = 0.5f;
            }
            f3 = f4;
            f = f6;
            f2 = f5;
        }
        mo12987S0();
        this.f9332d = mo12974M(o0Var2);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(bVar2.f9151a, bVar2.f9152b);
            matrix.preScale(bVar2.f9153c, bVar2.f9154d);
        }
        Matrix matrix2 = o0Var2.f9196j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = o0Var2.f9194h.size();
        if (size == 0) {
            mo12985R0();
            if (z) {
                this.f9332d.f9369b = false;
            } else {
                this.f9332d.f9370c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f10 = -1.0f;
            Iterator<SVG.C1852l0> it = o0Var2.f9194h.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                float f11 = Utils.FLOAT_EPSILON;
                if (!hasNext) {
                    break;
                }
                SVG.C1833c0 c0Var = (SVG.C1833c0) it.next();
                Float f12 = c0Var.f9164h;
                if (f12 != null) {
                    f11 = f12.floatValue();
                }
                if (i == 0 || f11 >= f10) {
                    fArr[i] = f11;
                    f10 = f11;
                } else {
                    fArr[i] = f10;
                }
                mo12987S0();
                mo12994W0(this.f9332d, c0Var);
                SVG.Style style = this.f9332d.f9368a;
                SVG.C1839f fVar = (SVG.C1839f) style.f9108p1;
                if (fVar == null) {
                    fVar = SVG.C1839f.f9174d;
                }
                iArr[i] = m13037x(fVar.f9176a, style.f9109q1.floatValue());
                i++;
                mo12985R0();
            }
            if (f == Utils.FLOAT_EPSILON || size == 1) {
                mo12985R0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG.GradientSpread gradientSpread = o0Var2.f9197k;
            if (gradientSpread != null) {
                if (gradientSpread == SVG.GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (gradientSpread == SVG.GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            mo12985R0();
            RadialGradient radialGradient = new RadialGradient(f3, f2, f, iArr, fArr, tileMode);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(m13036w(this.f9332d.f9368a.f9104g.floatValue()));
        }
    }

    /* renamed from: f0 */
    public final SVG.C1829b mo13005f0(SVG.C1857o oVar, SVG.C1857o oVar2, SVG.C1857o oVar3, SVG.C1857o oVar4) {
        float f;
        float f2;
        float f3;
        float f4 = Utils.FLOAT_EPSILON;
        if (oVar != null) {
            f = oVar.mo12791g(this);
        } else {
            f = 0.0f;
        }
        if (oVar2 != null) {
            f4 = oVar2.mo12792h(this);
        }
        SVG.C1829b S = mo12986S();
        if (oVar3 != null) {
            f2 = oVar3.mo12791g(this);
        } else {
            f2 = S.f9153c;
        }
        if (oVar4 != null) {
            f3 = oVar4.mo12792h(this);
        } else {
            f3 = S.f9154d;
        }
        return new SVG.C1829b(f, f4, f2, f3);
    }

    @TargetApi(19)
    /* renamed from: g0 */
    public final Path mo13006g0(SVG.C1846i0 i0Var, boolean z) {
        Path path;
        Path j;
        this.f9333e.push(this.f9332d);
        C1901h hVar = new C1901h(this.f9332d);
        this.f9332d = hVar;
        mo12994W0(hVar, i0Var);
        if (!mo12951A() || !mo12998Y0()) {
            this.f9332d = this.f9333e.pop();
            return null;
        }
        if (i0Var instanceof SVG.C1831b1) {
            if (!z) {
                m13023F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.C1831b1 b1Var = (SVG.C1831b1) i0Var;
            SVG.C1852l0 q = i0Var.f9210a.mo12757q(b1Var.f9155p);
            if (q == null) {
                m13023F("Use reference '%s' not found", b1Var.f9155p);
                this.f9332d = this.f9333e.pop();
                return null;
            } else if (!(q instanceof SVG.C1846i0)) {
                this.f9332d = this.f9333e.pop();
                return null;
            } else {
                path = mo13006g0((SVG.C1846i0) q, false);
                if (path == null) {
                    return null;
                }
                if (b1Var.f9193h == null) {
                    b1Var.f9193h = mo13015m(path);
                }
                Matrix matrix = b1Var.f9209o;
                if (matrix != null) {
                    path.transform(matrix);
                }
            }
        } else if (i0Var instanceof SVG.C1849k) {
            SVG.C1849k kVar = (SVG.C1849k) i0Var;
            if (i0Var instanceof SVG.C1869u) {
                path = new C1897d(((SVG.C1869u) i0Var).f9248o).mo13043f();
                if (i0Var.f9193h == null) {
                    i0Var.f9193h = mo13015m(path);
                }
            } else {
                path = i0Var instanceof SVG.C1827a0 ? mo13002c0((SVG.C1827a0) i0Var) : i0Var instanceof SVG.C1835d ? mo12997Y((SVG.C1835d) i0Var) : i0Var instanceof SVG.C1845i ? mo12999Z((SVG.C1845i) i0Var) : i0Var instanceof SVG.C1877y ? mo13001b0((SVG.C1877y) i0Var) : null;
            }
            if (path == null) {
                return null;
            }
            if (kVar.f9193h == null) {
                kVar.f9193h = mo13015m(path);
            }
            Matrix matrix2 = kVar.f9204n;
            if (matrix2 != null) {
                path.transform(matrix2);
            }
            path.setFillType(mo12980P());
        } else if (i0Var instanceof SVG.C1870u0) {
            SVG.C1870u0 u0Var = (SVG.C1870u0) i0Var;
            path = mo13003d0(u0Var);
            if (path == null) {
                return null;
            }
            Matrix matrix3 = u0Var.f9250s;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(mo12980P());
        } else {
            m13023F("Invalid %s element found in clipPath definition", i0Var.mo12765o());
            return null;
        }
        if (!(this.f9332d.f9368a.f9111r1 == null || (j = mo13009j(i0Var, i0Var.f9193h)) == null)) {
            path.op(j, Path.Op.INTERSECT);
        }
        this.f9332d = this.f9333e.pop();
        return path;
    }

    /* renamed from: h0 */
    public final void mo13007h0() {
        this.f9334f.pop();
        this.f9335g.pop();
    }

    /* renamed from: i0 */
    public final void mo13008i0(SVG.C1844h0 h0Var) {
        this.f9334f.push(h0Var);
        this.f9335g.push(this.f9329a.getMatrix());
    }

    @TargetApi(19)
    /* renamed from: j */
    public final Path mo13009j(SVG.C1846i0 i0Var, SVG.C1829b bVar) {
        Path g0;
        SVG.C1852l0 q = i0Var.f9210a.mo12757q(this.f9332d.f9368a.f9111r1);
        boolean z = false;
        if (q == null) {
            m13023F("ClipPath reference '%s' not found", this.f9332d.f9368a.f9111r1);
            return null;
        }
        SVG.C1837e eVar = (SVG.C1837e) q;
        this.f9333e.push(this.f9332d);
        this.f9332d = mo12974M(eVar);
        Boolean bool = eVar.f9173p;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(bVar.f9151a, bVar.f9152b);
            matrix.preScale(bVar.f9153c, bVar.f9154d);
        }
        Matrix matrix2 = eVar.f9209o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.C1852l0 next : eVar.f9177i) {
            if ((next instanceof SVG.C1846i0) && (g0 = mo13006g0((SVG.C1846i0) next, true)) != null) {
                path.op(g0, Path.Op.UNION);
            }
        }
        if (this.f9332d.f9368a.f9111r1 != null) {
            if (eVar.f9193h == null) {
                eVar.f9193h = mo13015m(path);
            }
            Path j = mo13009j(eVar, eVar.f9193h);
            if (j != null) {
                path.op(j, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f9332d = this.f9333e.pop();
        return path;
    }

    /* renamed from: j0 */
    public final void mo13010j0(SVG.C1846i0 i0Var) {
        mo13012k0(i0Var, i0Var.f9193h);
    }

    /* renamed from: k */
    public final List<C1896c> mo13011k(SVG.C1859p pVar) {
        float f;
        float f2;
        float f3;
        SVG.C1857o oVar = pVar.f9226o;
        float f4 = Utils.FLOAT_EPSILON;
        if (oVar != null) {
            f = oVar.mo12791g(this);
        } else {
            f = 0.0f;
        }
        SVG.C1857o oVar2 = pVar.f9227p;
        if (oVar2 != null) {
            f2 = oVar2.mo12792h(this);
        } else {
            f2 = 0.0f;
        }
        SVG.C1857o oVar3 = pVar.f9228q;
        if (oVar3 != null) {
            f3 = oVar3.mo12791g(this);
        } else {
            f3 = 0.0f;
        }
        SVG.C1857o oVar4 = pVar.f9229r;
        if (oVar4 != null) {
            f4 = oVar4.mo12792h(this);
        }
        float f5 = f4;
        ArrayList arrayList = new ArrayList(2);
        float f6 = f3 - f;
        float f7 = f5 - f2;
        arrayList.add(new C1896c(f, f2, f6, f7));
        arrayList.add(new C1896c(f3, f5, f6, f7));
        return arrayList;
    }

    /* renamed from: k0 */
    public final void mo13012k0(SVG.C1846i0 i0Var, SVG.C1829b bVar) {
        if (this.f9332d.f9368a.f9114t1 != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f9329a.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0.2127f, 0.7151f, 0.0722f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON})));
            this.f9329a.saveLayer((RectF) null, paint2, 31);
            SVG.C1863r rVar = (SVG.C1863r) this.f9331c.mo12757q(this.f9332d.f9368a.f9114t1);
            mo12969J0(rVar, i0Var, bVar);
            this.f9329a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f9329a.saveLayer((RectF) null, paint3, 31);
            mo12969J0(rVar, i0Var, bVar);
            this.f9329a.restore();
            this.f9329a.restore();
        }
        mo12985R0();
    }

    /* renamed from: l */
    public final List<C1896c> mo13013l(SVG.C1877y yVar) {
        SVG.C1877y yVar2 = yVar;
        int length = yVar2.f9266o.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = yVar2.f9266o;
        C1896c cVar = new C1896c(fArr[0], fArr[1], Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        float f = Utils.FLOAT_EPSILON;
        float f2 = 0.0f;
        while (i < length) {
            float[] fArr2 = yVar2.f9266o;
            float f3 = fArr2[i];
            float f4 = fArr2[i + 1];
            cVar.mo13040a(f3, f4);
            arrayList.add(cVar);
            i += 2;
            cVar = new C1896c(f3, f4, f3 - cVar.f9349a, f4 - cVar.f9350b);
            float f5 = f3;
            f2 = f4;
            f = f5;
        }
        if (yVar2 instanceof SVG.C1879z) {
            float[] fArr3 = yVar2.f9266o;
            float f6 = fArr3[0];
            if (f != f6) {
                float f7 = fArr3[1];
                if (f2 != f7) {
                    cVar.mo13040a(f6, f7);
                    arrayList.add(cVar);
                    C1896c cVar2 = new C1896c(f6, f7, f6 - cVar.f9349a, f7 - cVar.f9350b);
                    cVar2.mo13041b((C1896c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
        } else {
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public final void mo13014l0(SVG.C1852l0 l0Var, C1903j jVar) {
        float f;
        float f2;
        float f3;
        SVG.Style.TextAnchor O;
        float f4;
        if (jVar.mo13045a((SVG.C1874w0) l0Var)) {
            if (l0Var instanceof SVG.C1876x0) {
                mo12987S0();
                mo12973L0((SVG.C1876x0) l0Var);
                mo12985R0();
                return;
            }
            boolean z = true;
            if (l0Var instanceof SVG.C1868t0) {
                m13038y("TSpan render", new Object[0]);
                mo12987S0();
                SVG.C1868t0 t0Var = (SVG.C1868t0) l0Var;
                mo12994W0(this.f9332d, t0Var);
                if (mo12951A()) {
                    List<SVG.C1857o> list = t0Var.f9267o;
                    if (list == null || list.size() <= 0) {
                        z = false;
                    }
                    boolean z2 = jVar instanceof C1899f;
                    float f5 = Utils.FLOAT_EPSILON;
                    if (z2) {
                        if (!z) {
                            f4 = ((C1899f) jVar).f9361b;
                        } else {
                            f4 = t0Var.f9267o.get(0).mo12791g(this);
                        }
                        List<SVG.C1857o> list2 = t0Var.f9268p;
                        if (list2 == null || list2.size() == 0) {
                            f2 = ((C1899f) jVar).f9362c;
                        } else {
                            f2 = t0Var.f9268p.get(0).mo12792h(this);
                        }
                        List<SVG.C1857o> list3 = t0Var.f9269q;
                        if (list3 == null || list3.size() == 0) {
                            f = 0.0f;
                        } else {
                            f = t0Var.f9269q.get(0).mo12791g(this);
                        }
                        List<SVG.C1857o> list4 = t0Var.f9270r;
                        if (!(list4 == null || list4.size() == 0)) {
                            f5 = t0Var.f9270r.get(0).mo12792h(this);
                        }
                        f3 = f5;
                        f5 = f4;
                    } else {
                        f3 = 0.0f;
                        f2 = 0.0f;
                        f = 0.0f;
                    }
                    if (z && (O = mo12978O()) != SVG.Style.TextAnchor.Start) {
                        float n = mo13017n(t0Var);
                        if (O == SVG.Style.TextAnchor.Middle) {
                            n /= 2.0f;
                        }
                        f5 -= n;
                    }
                    mo13025r((SVG.C1846i0) t0Var.mo12766e());
                    if (z2) {
                        C1899f fVar = (C1899f) jVar;
                        fVar.f9361b = f5 + f;
                        fVar.f9362c = f2 + f3;
                    }
                    boolean m0 = mo13016m0();
                    mo12959E(t0Var, jVar);
                    if (m0) {
                        mo13010j0(t0Var);
                    }
                }
                mo12985R0();
            } else if (l0Var instanceof SVG.C1866s0) {
                mo12987S0();
                SVG.C1866s0 s0Var = (SVG.C1866s0) l0Var;
                mo12994W0(this.f9332d, s0Var);
                if (mo12951A()) {
                    mo13025r((SVG.C1846i0) s0Var.mo12766e());
                    SVG.C1852l0 q = l0Var.f9210a.mo12757q(s0Var.f9243o);
                    if (q == null || !(q instanceof SVG.C1874w0)) {
                        m13023F("Tref reference '%s' not found", s0Var.f9243o);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        mo12962G((SVG.C1874w0) q, sb);
                        if (sb.length() > 0) {
                            jVar.mo13044b(sb.toString());
                        }
                    }
                }
                mo12985R0();
            }
        }
    }

    /* renamed from: m */
    public final SVG.C1829b mo13015m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.C1829b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: m0 */
    public final boolean mo13016m0() {
        SVG.C1852l0 q;
        if (!mo12975M0()) {
            return false;
        }
        this.f9329a.saveLayerAlpha((RectF) null, m13036w(this.f9332d.f9368a.f9088H.floatValue()), 31);
        this.f9333e.push(this.f9332d);
        C1901h hVar = new C1901h(this.f9332d);
        this.f9332d = hVar;
        String str = hVar.f9368a.f9114t1;
        if (str != null && ((q = this.f9331c.mo12757q(str)) == null || !(q instanceof SVG.C1863r))) {
            m13023F("Mask reference '%s' not found", this.f9332d.f9368a.f9114t1);
            this.f9332d.f9368a.f9114t1 = null;
        }
        return true;
    }

    /* renamed from: n */
    public final float mo13017n(SVG.C1874w0 w0Var) {
        C1904k kVar = new C1904k(this, (C1894a) null);
        mo12959E(w0Var, kVar);
        return kVar.f9382b;
    }

    /* renamed from: n0 */
    public final C1896c mo13018n0(C1896c cVar, C1896c cVar2, C1896c cVar3) {
        float D = mo12957D(cVar2.f9351c, cVar2.f9352d, cVar2.f9349a - cVar.f9349a, cVar2.f9350b - cVar.f9350b);
        if (D == Utils.FLOAT_EPSILON) {
            D = mo12957D(cVar2.f9351c, cVar2.f9352d, cVar3.f9349a - cVar2.f9349a, cVar3.f9350b - cVar2.f9350b);
        }
        int i = (D > Utils.FLOAT_EPSILON ? 1 : (D == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i > 0) {
            return cVar2;
        }
        if (i == 0 && (cVar2.f9351c > Utils.FLOAT_EPSILON || cVar2.f9352d >= Utils.FLOAT_EPSILON)) {
            return cVar2;
        }
        cVar2.f9351c = -cVar2.f9351c;
        cVar2.f9352d = -cVar2.f9352d;
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        r3 = r3 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r12 != 8) goto L_0x008e;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix mo13019o(com.caverock.androidsvg.SVG.C1829b r10, com.caverock.androidsvg.SVG.C1829b r11, com.caverock.androidsvg.PreserveAspectRatio r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L_0x009b
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r12.mo12742a()
            if (r1 != 0) goto L_0x000f
            goto L_0x009b
        L_0x000f:
            float r1 = r10.f9153c
            float r2 = r11.f9153c
            float r1 = r1 / r2
            float r2 = r10.f9154d
            float r3 = r11.f9154d
            float r2 = r2 / r3
            float r3 = r11.f9151a
            float r3 = -r3
            float r4 = r11.f9152b
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.f9065d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0035
            float r11 = r10.f9151a
            float r10 = r10.f9152b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L_0x0035:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r12.mo12743b()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L_0x0042
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x0046
        L_0x0042:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x0046:
            float r2 = r10.f9153c
            float r2 = r2 / r1
            float r5 = r10.f9154d
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.C1893b.C1894a.f9337a
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r12.mo12742a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L_0x0062;
                case 2: goto L_0x0062;
                case 3: goto L_0x0062;
                case 4: goto L_0x005e;
                case 5: goto L_0x005e;
                case 6: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0067
        L_0x005e:
            float r7 = r11.f9153c
            float r7 = r7 - r2
            goto L_0x0066
        L_0x0062:
            float r7 = r11.f9153c
            float r7 = r7 - r2
            float r7 = r7 / r8
        L_0x0066:
            float r3 = r3 - r7
        L_0x0067:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r12 = r12.mo12742a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L_0x0089
            r2 = 3
            if (r12 == r2) goto L_0x0085
            r2 = 5
            if (r12 == r2) goto L_0x0089
            r2 = 6
            if (r12 == r2) goto L_0x0085
            r2 = 7
            if (r12 == r2) goto L_0x0089
            r2 = 8
            if (r12 == r2) goto L_0x0085
            goto L_0x008e
        L_0x0085:
            float r11 = r11.f9154d
            float r11 = r11 - r5
            goto L_0x008d
        L_0x0089:
            float r11 = r11.f9154d
            float r11 = r11 - r5
            float r11 = r11 / r8
        L_0x008d:
            float r4 = r4 - r11
        L_0x008e:
            float r11 = r10.f9151a
            float r10 = r10.f9152b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L_0x009b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C1893b.mo13019o(com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    /* renamed from: o0 */
    public final void mo13020o0(SVG.C1835d dVar) {
        m13038y("Circle render", new Object[0]);
        SVG.C1857o oVar = dVar.f9167q;
        if (oVar != null && !oVar.mo12794j()) {
            mo12994W0(this.f9332d, dVar);
            if (mo12951A() && mo12998Y0()) {
                Matrix matrix = dVar.f9204n;
                if (matrix != null) {
                    this.f9329a.concat(matrix);
                }
                Path Y = mo12997Y(dVar);
                mo12991U0(dVar);
                mo13025r(dVar);
                mo13021p(dVar);
                boolean m0 = mo13016m0();
                if (this.f9332d.f9369b) {
                    mo12953B(dVar, Y);
                }
                if (this.f9332d.f9370c) {
                    mo12955C(Y);
                }
                if (m0) {
                    mo13010j0(dVar);
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo13021p(SVG.C1846i0 i0Var) {
        mo13023q(i0Var, i0Var.f9193h);
    }

    /* renamed from: p0 */
    public final void mo13022p0(SVG.C1845i iVar) {
        m13038y("Ellipse render", new Object[0]);
        SVG.C1857o oVar = iVar.f9191q;
        if (oVar != null && iVar.f9192r != null && !oVar.mo12794j() && !iVar.f9192r.mo12794j()) {
            mo12994W0(this.f9332d, iVar);
            if (mo12951A() && mo12998Y0()) {
                Matrix matrix = iVar.f9204n;
                if (matrix != null) {
                    this.f9329a.concat(matrix);
                }
                Path Z = mo12999Z(iVar);
                mo12991U0(iVar);
                mo13025r(iVar);
                mo13021p(iVar);
                boolean m0 = mo13016m0();
                if (this.f9332d.f9369b) {
                    mo12953B(iVar, Z);
                }
                if (this.f9332d.f9370c) {
                    mo12955C(Z);
                }
                if (m0) {
                    mo13010j0(iVar);
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo13023q(SVG.C1846i0 i0Var, SVG.C1829b bVar) {
        Path j;
        if (this.f9332d.f9368a.f9111r1 != null && (j = mo13009j(i0Var, bVar)) != null) {
            this.f9329a.clipPath(j);
        }
    }

    /* renamed from: q0 */
    public final void mo13024q0(SVG.C1851l lVar) {
        m13038y("Group render", new Object[0]);
        mo12994W0(this.f9332d, lVar);
        if (mo12951A()) {
            Matrix matrix = lVar.f9209o;
            if (matrix != null) {
                this.f9329a.concat(matrix);
            }
            mo13021p(lVar);
            boolean m0 = mo13016m0();
            mo12961F0(lVar, true);
            if (m0) {
                mo13010j0(lVar);
            }
            mo12991U0(lVar);
        }
    }

    /* renamed from: r */
    public final void mo13025r(SVG.C1846i0 i0Var) {
        SVG.C1854m0 m0Var = this.f9332d.f9368a.f9100d;
        if (m0Var instanceof SVG.C1867t) {
            mo13037z(true, i0Var.f9193h, (SVG.C1867t) m0Var);
        }
        SVG.C1854m0 m0Var2 = this.f9332d.f9368a.f9105k;
        if (m0Var2 instanceof SVG.C1867t) {
            mo13037z(false, i0Var.f9193h, (SVG.C1867t) m0Var2);
        }
    }

    /* renamed from: r0 */
    public final void mo13026r0(SVG.C1855n nVar) {
        SVG.C1857o oVar;
        String str;
        float f;
        float f2;
        int i = 0;
        m13038y("Image render", new Object[0]);
        SVG.C1857o oVar2 = nVar.f9215s;
        if (oVar2 != null && !oVar2.mo12794j() && (oVar = nVar.f9216t) != null && !oVar.mo12794j() && (str = nVar.f9212p) != null) {
            PreserveAspectRatio preserveAspectRatio = nVar.f9218o;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.f9066e;
            }
            Bitmap s = mo13027s(str);
            if (s == null) {
                SVG.m12725g();
                return;
            }
            SVG.C1829b bVar = new SVG.C1829b(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) s.getWidth(), (float) s.getHeight());
            mo12994W0(this.f9332d, nVar);
            if (mo12951A() && mo12998Y0()) {
                Matrix matrix = nVar.f9217u;
                if (matrix != null) {
                    this.f9329a.concat(matrix);
                }
                SVG.C1857o oVar3 = nVar.f9213q;
                if (oVar3 != null) {
                    f = oVar3.mo12791g(this);
                } else {
                    f = 0.0f;
                }
                SVG.C1857o oVar4 = nVar.f9214r;
                if (oVar4 != null) {
                    f2 = oVar4.mo12792h(this);
                } else {
                    f2 = 0.0f;
                }
                this.f9332d.f9373f = new SVG.C1829b(f, f2, nVar.f9215s.mo12791g(this), nVar.f9216t.mo12791g(this));
                if (!this.f9332d.f9368a.f9097Z.booleanValue()) {
                    SVG.C1829b bVar2 = this.f9332d.f9373f;
                    mo12979O0(bVar2.f9151a, bVar2.f9152b, bVar2.f9153c, bVar2.f9154d);
                }
                nVar.f9193h = this.f9332d.f9373f;
                mo12991U0(nVar);
                mo13021p(nVar);
                boolean m0 = mo13016m0();
                mo12996X0();
                this.f9329a.save();
                this.f9329a.concat(mo13019o(this.f9332d.f9373f, bVar, preserveAspectRatio));
                if (this.f9332d.f9368a.f9123z1 != SVG.Style.RenderQuality.optimizeSpeed) {
                    i = 2;
                }
                this.f9329a.drawBitmap(s, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, new Paint(i));
                this.f9329a.restore();
                if (m0) {
                    mo13010j0(nVar);
                }
            }
        }
    }

    /* renamed from: s */
    public final Bitmap mo13027s(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: s0 */
    public final void mo13028s0(SVG.C1859p pVar) {
        m13038y("Line render", new Object[0]);
        mo12994W0(this.f9332d, pVar);
        if (mo12951A() && mo12998Y0() && this.f9332d.f9370c) {
            Matrix matrix = pVar.f9204n;
            if (matrix != null) {
                this.f9329a.concat(matrix);
            }
            Path a0 = mo13000a0(pVar);
            mo12991U0(pVar);
            mo13025r(pVar);
            mo13021p(pVar);
            boolean m0 = mo13016m0();
            mo12955C(a0);
            mo12967I0(pVar);
            if (m0) {
                mo13010j0(pVar);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r6.equals("monospace") == false) goto L_0x0029;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface mo13029t(java.lang.String r6, java.lang.Integer r7, com.caverock.androidsvg.SVG.Style.FontStyle r8) {
        /*
            r5 = this;
            com.caverock.androidsvg.SVG$Style$FontStyle r0 = com.caverock.androidsvg.SVG.Style.FontStyle.Italic
            r1 = 1
            r2 = 0
            if (r8 != r0) goto L_0x0008
            r8 = r1
            goto L_0x0009
        L_0x0008:
            r8 = r2
        L_0x0009:
            int r7 = r7.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 3
            r4 = 2
            if (r7 <= r0) goto L_0x0019
            if (r8 == 0) goto L_0x0017
            r7 = r3
            goto L_0x001e
        L_0x0017:
            r7 = r1
            goto L_0x001e
        L_0x0019:
            if (r8 == 0) goto L_0x001d
            r7 = r4
            goto L_0x001e
        L_0x001d:
            r7 = r2
        L_0x001e:
            r6.hashCode()
            r8 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1536685117: goto L_0x0055;
                case -1431958525: goto L_0x004c;
                case -1081737434: goto L_0x0041;
                case 109326717: goto L_0x0036;
                case 1126973893: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = r8
            goto L_0x005f
        L_0x002b:
            java.lang.String r0 = "cursive"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r1 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r0 = "serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r1 = r3
            goto L_0x005f
        L_0x0041:
            java.lang.String r0 = "fantasy"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r1 = r4
            goto L_0x005f
        L_0x004c:
            java.lang.String r0 = "monospace"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005f
            goto L_0x0029
        L_0x0055:
            java.lang.String r0 = "sans-serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r1 = r2
        L_0x005f:
            switch(r1) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0079;
                case 2: goto L_0x0072;
                case 3: goto L_0x006b;
                case 4: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r6 = 0
            goto L_0x0086
        L_0x0064:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x006b:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0072:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0079:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0086
        L_0x0080:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
        L_0x0086:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C1893b.mo13029t(java.lang.String, java.lang.Integer, com.caverock.androidsvg.SVG$Style$FontStyle):android.graphics.Typeface");
    }

    /* renamed from: t0 */
    public final void mo13030t0(SVG.C1869u uVar) {
        m13038y("Path render", new Object[0]);
        if (uVar.f9248o != null) {
            mo12994W0(this.f9332d, uVar);
            if (mo12951A() && mo12998Y0()) {
                C1901h hVar = this.f9332d;
                if (hVar.f9370c || hVar.f9369b) {
                    Matrix matrix = uVar.f9204n;
                    if (matrix != null) {
                        this.f9329a.concat(matrix);
                    }
                    Path f = new C1897d(uVar.f9248o).mo13043f();
                    if (uVar.f9193h == null) {
                        uVar.f9193h = mo13015m(f);
                    }
                    mo12991U0(uVar);
                    mo13025r(uVar);
                    mo13021p(uVar);
                    boolean m0 = mo13016m0();
                    if (this.f9332d.f9369b) {
                        f.setFillType(mo12990U());
                        mo12953B(uVar, f);
                    }
                    if (this.f9332d.f9370c) {
                        mo12955C(f);
                    }
                    mo12967I0(uVar);
                    if (m0) {
                        mo13010j0(uVar);
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo13031u(SVG.C1852l0 l0Var) {
        Boolean bool;
        if ((l0Var instanceof SVG.C1848j0) && (bool = ((SVG.C1848j0) l0Var).f9200d) != null) {
            this.f9332d.f9375h = bool.booleanValue();
        }
    }

    /* renamed from: u0 */
    public final void mo13032u0(SVG.C1877y yVar) {
        m13038y("PolyLine render", new Object[0]);
        mo12994W0(this.f9332d, yVar);
        if (mo12951A() && mo12998Y0()) {
            C1901h hVar = this.f9332d;
            if (hVar.f9370c || hVar.f9369b) {
                Matrix matrix = yVar.f9204n;
                if (matrix != null) {
                    this.f9329a.concat(matrix);
                }
                if (yVar.f9266o.length >= 2) {
                    Path b0 = mo13001b0(yVar);
                    mo12991U0(yVar);
                    b0.setFillType(mo12990U());
                    mo13025r(yVar);
                    mo13021p(yVar);
                    boolean m0 = mo13016m0();
                    if (this.f9332d.f9369b) {
                        mo12953B(yVar, b0);
                    }
                    if (this.f9332d.f9370c) {
                        mo12955C(b0);
                    }
                    mo12967I0(yVar);
                    if (m0) {
                        mo13010j0(yVar);
                    }
                }
            }
        }
    }

    /* renamed from: v0 */
    public final void mo13033v0(SVG.C1879z zVar) {
        m13038y("Polygon render", new Object[0]);
        mo12994W0(this.f9332d, zVar);
        if (mo12951A() && mo12998Y0()) {
            C1901h hVar = this.f9332d;
            if (hVar.f9370c || hVar.f9369b) {
                Matrix matrix = zVar.f9204n;
                if (matrix != null) {
                    this.f9329a.concat(matrix);
                }
                if (zVar.f9266o.length >= 2) {
                    Path b0 = mo13001b0(zVar);
                    mo12991U0(zVar);
                    mo13025r(zVar);
                    mo13021p(zVar);
                    boolean m0 = mo13016m0();
                    if (this.f9332d.f9369b) {
                        mo12953B(zVar, b0);
                    }
                    if (this.f9332d.f9370c) {
                        mo12955C(b0);
                    }
                    mo12967I0(zVar);
                    if (m0) {
                        mo13010j0(zVar);
                    }
                }
            }
        }
    }

    /* renamed from: w0 */
    public final void mo13034w0(SVG.C1827a0 a0Var) {
        m13038y("Rect render", new Object[0]);
        SVG.C1857o oVar = a0Var.f9145q;
        if (oVar != null && a0Var.f9146r != null && !oVar.mo12794j() && !a0Var.f9146r.mo12794j()) {
            mo12994W0(this.f9332d, a0Var);
            if (mo12951A() && mo12998Y0()) {
                Matrix matrix = a0Var.f9204n;
                if (matrix != null) {
                    this.f9329a.concat(matrix);
                }
                Path c0 = mo13002c0(a0Var);
                mo12991U0(a0Var);
                mo13025r(a0Var);
                mo13021p(a0Var);
                boolean m0 = mo13016m0();
                if (this.f9332d.f9369b) {
                    mo12953B(a0Var, c0);
                }
                if (this.f9332d.f9370c) {
                    mo12955C(c0);
                }
                if (m0) {
                    mo13010j0(a0Var);
                }
            }
        }
    }

    /* renamed from: x0 */
    public final void mo13035x0(SVG.C1836d0 d0Var) {
        mo13038z0(d0Var, mo13005f0(d0Var.f9168q, d0Var.f9169r, d0Var.f9170s, d0Var.f9171t), d0Var.f9230p, d0Var.f9218o);
    }

    /* renamed from: y0 */
    public final void mo13036y0(SVG.C1836d0 d0Var, SVG.C1829b bVar) {
        mo13038z0(d0Var, bVar, d0Var.f9230p, d0Var.f9218o);
    }

    /* renamed from: z */
    public final void mo13037z(boolean z, SVG.C1829b bVar, SVG.C1867t tVar) {
        String str;
        SVG.C1852l0 q = this.f9331c.mo12757q(tVar.f9245a);
        if (q == null) {
            Object[] objArr = new Object[2];
            if (z) {
                str = "Fill";
            } else {
                str = "Stroke";
            }
            objArr[0] = str;
            objArr[1] = tVar.f9245a;
            m13023F("%s reference '%s' not found", objArr);
            SVG.C1854m0 m0Var = tVar.f9246d;
            if (m0Var != null) {
                mo12981P0(this.f9332d, z, m0Var);
            } else if (z) {
                this.f9332d.f9369b = false;
            } else {
                this.f9332d.f9370c = false;
            }
        } else if (q instanceof SVG.C1850k0) {
            mo12995X(z, bVar, (SVG.C1850k0) q);
        } else if (q instanceof SVG.C1858o0) {
            mo13004e0(z, bVar, (SVG.C1858o0) q);
        } else if (q instanceof SVG.C1830b0) {
            mo12983Q0(z, (SVG.C1830b0) q);
        }
    }

    /* renamed from: z0 */
    public final void mo13038z0(SVG.C1836d0 d0Var, SVG.C1829b bVar, SVG.C1829b bVar2, PreserveAspectRatio preserveAspectRatio) {
        m13038y("Svg render", new Object[0]);
        if (bVar.f9153c != Utils.FLOAT_EPSILON && bVar.f9154d != Utils.FLOAT_EPSILON) {
            if (preserveAspectRatio == null && (preserveAspectRatio = d0Var.f9218o) == null) {
                preserveAspectRatio = PreserveAspectRatio.f9066e;
            }
            mo12994W0(this.f9332d, d0Var);
            if (mo12951A()) {
                C1901h hVar = this.f9332d;
                hVar.f9373f = bVar;
                if (!hVar.f9368a.f9097Z.booleanValue()) {
                    SVG.C1829b bVar3 = this.f9332d.f9373f;
                    mo12979O0(bVar3.f9151a, bVar3.f9152b, bVar3.f9153c, bVar3.f9154d);
                }
                mo13023q(d0Var, this.f9332d.f9373f);
                if (bVar2 != null) {
                    this.f9329a.concat(mo13019o(this.f9332d.f9373f, bVar2, preserveAspectRatio));
                    this.f9332d.f9374g = d0Var.f9230p;
                } else {
                    Canvas canvas = this.f9329a;
                    SVG.C1829b bVar4 = this.f9332d.f9373f;
                    canvas.translate(bVar4.f9151a, bVar4.f9152b);
                }
                boolean m0 = mo13016m0();
                mo12996X0();
                mo12961F0(d0Var, true);
                if (m0) {
                    mo13010j0(d0Var);
                }
                mo12991U0(d0Var);
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.b$k */
    /* compiled from: SVGAndroidRenderer */
    public class C1904k extends C1903j {

        /* renamed from: b */
        public float f9382b;

        public C1904k() {
            super(C1893b.this, (C1894a) null);
            this.f9382b = Utils.FLOAT_EPSILON;
        }

        /* renamed from: b */
        public void mo13044b(String str) {
            this.f9382b += C1893b.this.f9332d.f9371d.measureText(str);
        }

        public /* synthetic */ C1904k(C1893b bVar, C1894a aVar) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.b$h */
    /* compiled from: SVGAndroidRenderer */
    public class C1901h {

        /* renamed from: a */
        public SVG.Style f9368a;

        /* renamed from: b */
        public boolean f9369b;

        /* renamed from: c */
        public boolean f9370c;

        /* renamed from: d */
        public Paint f9371d;

        /* renamed from: e */
        public Paint f9372e;

        /* renamed from: f */
        public SVG.C1829b f9373f;

        /* renamed from: g */
        public SVG.C1829b f9374g;

        /* renamed from: h */
        public boolean f9375h;

        public C1901h() {
            Paint paint = new Paint();
            this.f9371d = paint;
            paint.setFlags(193);
            this.f9371d.setHinting(0);
            this.f9371d.setStyle(Paint.Style.FILL);
            this.f9371d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f9372e = paint2;
            paint2.setFlags(193);
            this.f9372e.setHinting(0);
            this.f9372e.setStyle(Paint.Style.STROKE);
            this.f9372e.setTypeface(Typeface.DEFAULT);
            this.f9368a = SVG.Style.m12747a();
        }

        public C1901h(C1901h hVar) {
            this.f9369b = hVar.f9369b;
            this.f9370c = hVar.f9370c;
            this.f9371d = new Paint(hVar.f9371d);
            this.f9372e = new Paint(hVar.f9372e);
            SVG.C1829b bVar = hVar.f9373f;
            if (bVar != null) {
                this.f9373f = new SVG.C1829b(bVar);
            }
            SVG.C1829b bVar2 = hVar.f9374g;
            if (bVar2 != null) {
                this.f9374g = new SVG.C1829b(bVar2);
            }
            this.f9375h = hVar.f9375h;
            try {
                this.f9368a = (SVG.Style) hVar.f9368a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f9368a = SVG.Style.m12747a();
            }
        }
    }
}
