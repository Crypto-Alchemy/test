package p000;

import androidx.compose.p004ui.graphics.colorspace.Rgb;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.al0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0004\nB>\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bB$\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R \u0010\u0016\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, mo44877d2 = {"Lzp0;", "", "", "v", "a", "Lcl0;", "Lcl0;", "getSource", "()Lcl0;", "source", "b", "getDestination", "destination", "c", "transformSource", "d", "transformDestination", "Lcd5;", "e", "I", "getRenderIntent-uksYyKA", "()I", "renderIntent", "f", "[F", "transform", "<init>", "(Lcl0;Lcl0;Lcl0;Lcl0;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Lcl0;Lcl0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "g", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zp0 */
/* compiled from: Connector.kt */
public class zp0 {

    /* renamed from: g */
    public static final C3747a f20617g = new C3747a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final cl0 f20618a;

    /* renamed from: b */
    public final cl0 f20619b;

    /* renamed from: c */
    public final cl0 f20620c;

    /* renamed from: d */
    public final cl0 f20621d;

    /* renamed from: e */
    public final int f20622e;

    /* renamed from: f */
    public final float[] f20623f;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo44877d2 = {"Lzp0$a;", "", "Lcl0;", "source", "Lzp0;", "c", "(Lcl0;)Lzp0;", "destination", "Lcd5;", "intent", "", "b", "(Lcl0;Lcl0;I)[F", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: zp0$a */
    /* compiled from: Connector.kt */
    public static final class C3747a {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"zp0$a$a", "Lzp0;", "", "v", "a", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: zp0$a$a */
        /* compiled from: Connector.kt */
        public static final class C3748a extends zp0 {
            public C3748a(cl0 cl0, int i) {
                super(cl0, cl0, i, (DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public float[] mo28543a(float[] fArr) {
                vx2.m53591g(fArr, "v");
                return fArr;
            }
        }

        public C3747a() {
        }

        public /* synthetic */ C3747a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final float[] mo28544b(cl0 cl0, cl0 cl02, int i) {
            float[] fArr;
            float[] fArr2;
            if (!cd5.m11833e(i, cd5.f8406a.mo12036a())) {
                return null;
            }
            long f = cl0.mo12100f();
            al0.C0034a aVar = al0.f181a;
            boolean e = al0.m355e(f, aVar.mo358b());
            boolean e2 = al0.m355e(cl02.mo12100f(), aVar.mo358b());
            if (e && e2) {
                return null;
            }
            if (!e && !e2) {
                return null;
            }
            if (!e) {
                cl0 = cl02;
            }
            vx2.m53589e(cl0, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) cl0;
            if (e) {
                fArr = rgb.mo3297r().mo26501c();
            } else {
                fArr = jq2.f13799a.mo22044c();
            }
            if (e2) {
                fArr2 = rgb.mo3297r().mo26501c();
            } else {
                fArr2 = jq2.f13799a.mo22044c();
            }
            return new float[]{fArr[0] / fArr2[0], fArr[1] / fArr2[1], fArr[2] / fArr2[2]};
        }

        /* renamed from: c */
        public final zp0 mo28545c(cl0 cl0) {
            vx2.m53591g(cl0, "source");
            return new C3748a(cl0, cd5.f8406a.mo12038c());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"Lzp0$b;", "Lzp0;", "", "v", "a", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "source", "destination", "Lcd5;", "intent", "b", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "h", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "i", "mDestination", "j", "[F", "mTransform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: zp0$b */
    /* compiled from: Connector.kt */
    public static final class C3749b extends zp0 {

        /* renamed from: h */
        public final Rgb f20624h;

        /* renamed from: i */
        public final Rgb f20625i;

        /* renamed from: j */
        public final float[] f20626j;

        public C3749b(Rgb rgb, Rgb rgb2, int i) {
            super(rgb, rgb2, rgb, rgb2, i, (float[]) null, (DefaultConstructorMarker) null);
            this.f20624h = rgb;
            this.f20625i = rgb2;
            this.f20626j = mo28546b(rgb, rgb2, i);
        }

        public /* synthetic */ C3749b(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        /* renamed from: a */
        public float[] mo28543a(float[] fArr) {
            vx2.m53591g(fArr, "v");
            fArr[0] = (float) this.f20624h.mo3291l().invoke(Double.valueOf((double) fArr[0])).doubleValue();
            fArr[1] = (float) this.f20624h.mo3291l().invoke(Double.valueOf((double) fArr[1])).doubleValue();
            fArr[2] = (float) this.f20624h.mo3291l().invoke(Double.valueOf((double) fArr[2])).doubleValue();
            dl0.m15162m(this.f20626j, fArr);
            fArr[0] = (float) this.f20625i.mo3294o().invoke(Double.valueOf((double) fArr[0])).doubleValue();
            fArr[1] = (float) this.f20625i.mo3294o().invoke(Double.valueOf((double) fArr[1])).doubleValue();
            fArr[2] = (float) this.f20625i.mo3294o().invoke(Double.valueOf((double) fArr[2])).doubleValue();
            return fArr;
        }

        /* renamed from: b */
        public final float[] mo28546b(Rgb rgb, Rgb rgb2, int i) {
            if (dl0.m15155f(rgb.mo3297r(), rgb2.mo3297r())) {
                return dl0.m15160k(rgb2.mo3293n(), rgb.mo3296q());
            }
            float[] q = rgb.mo3296q();
            float[] n = rgb2.mo3293n();
            float[] c = rgb.mo3297r().mo26501c();
            float[] c2 = rgb2.mo3297r().mo26501c();
            tk7 r = rgb.mo3297r();
            jq2 jq2 = jq2.f13799a;
            if (!dl0.m15155f(r, jq2.mo22043b())) {
                float[] b = C2651kb.f14024b.mo22242a().mo22238b();
                float[] c3 = jq2.mo22044c();
                float[] copyOf = Arrays.copyOf(c3, c3.length);
                vx2.m53590f(copyOf, "copyOf(this, size)");
                q = dl0.m15160k(dl0.m15154e(b, c, copyOf), rgb.mo3296q());
            }
            if (!dl0.m15155f(rgb2.mo3297r(), jq2.mo22043b())) {
                float[] b2 = C2651kb.f14024b.mo22242a().mo22238b();
                float[] c4 = jq2.mo22044c();
                float[] copyOf2 = Arrays.copyOf(c4, c4.length);
                vx2.m53590f(copyOf2, "copyOf(this, size)");
                n = dl0.m15159j(dl0.m15160k(dl0.m15154e(b2, c2, copyOf2), rgb2.mo3296q()));
            }
            if (cd5.m11833e(i, cd5.f8406a.mo12036a())) {
                q = dl0.m15161l(new float[]{c[0] / c2[0], c[1] / c2[1], c[2] / c2[2]}, q);
            }
            return dl0.m15160k(n, q);
        }
    }

    public /* synthetic */ zp0(cl0 cl0, cl0 cl02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cl0, cl02, i);
    }

    public zp0(cl0 cl0, cl0 cl02, cl0 cl03, cl0 cl04, int i, float[] fArr) {
        this.f20618a = cl0;
        this.f20619b = cl02;
        this.f20620c = cl03;
        this.f20621d = cl04;
        this.f20622e = i;
        this.f20623f = fArr;
    }

    public /* synthetic */ zp0(cl0 cl0, cl0 cl02, cl0 cl03, cl0 cl04, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cl0, cl02, cl03, cl04, i, fArr);
    }

    /* renamed from: a */
    public float[] mo28543a(float[] fArr) {
        vx2.m53591g(fArr, "v");
        float[] i = this.f20620c.mo3290i(fArr);
        float[] fArr2 = this.f20623f;
        if (fArr2 != null) {
            i[0] = i[0] * fArr2[0];
            i[1] = i[1] * fArr2[1];
            i[2] = i[2] * fArr2[2];
        }
        return this.f20621d.mo3284a(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zp0(p000.cl0 r13, p000.cl0 r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.mo12100f()
            al0$a r2 = p000.al0.f181a
            long r3 = r2.mo358b()
            boolean r0 = p000.al0.m355e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001e
            jq2 r0 = p000.jq2.f13799a
            tk7 r0 = r0.mo22043b()
            cl0 r0 = p000.dl0.m15153d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L_0x001f
        L_0x001e:
            r7 = r13
        L_0x001f:
            long r4 = r14.mo12100f()
            long r8 = r2.mo358b()
            boolean r0 = p000.al0.m355e(r4, r8)
            if (r0 == 0) goto L_0x0039
            jq2 r0 = p000.jq2.f13799a
            tk7 r0 = r0.mo22043b()
            cl0 r0 = p000.dl0.m15153d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L_0x003a
        L_0x0039:
            r8 = r14
        L_0x003a:
            zp0$a r0 = f20617g
            float[] r10 = r0.mo28544b(r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zp0.<init>(cl0, cl0, int):void");
    }
}
