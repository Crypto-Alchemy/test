package androidx.compose.p004ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u00027)B:\u0012\u0006\u0010K\u001a\u00020G\u0012\u0006\u0010P\u001a\u00020L\u0012\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00040B\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040D¢\u0006\u0005\b\u0010\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J§\u0001\u0010!\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010$\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010*J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u000200H\u0014J\b\u00102\u001a\u00020\u0004H\u0016J0\u00108\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00162\u0006\u00105\u001a\u0002042\u0006\u0010\u0006\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u000204H\u0014J\b\u00109\u001a\u00020\u0004H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J%\u00107\u001a\u00020#2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u0010>J\u0018\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020\u0016H\u0016J*\u0010F\u001a\u00020\u00042\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00040B2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040DH\u0016R\u0017\u0010K\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bA\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010P\u001a\u00020L8\u0006¢\u0006\f\n\u0004\bF\u0010M\u001a\u0004\bN\u0010OR$\u0010C\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0004\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010QR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010RR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R*\u0010b\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\u00168\u0006@BX\u000e¢\u0006\u0012\n\u0004\b^\u0010W\u001a\u0004\bZ\u0010_\"\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010WR\u0014\u0010h\u001a\u00020e8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00010i8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001f\u0010o\u001a\u00020\u00128\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010s\u001a\u0004\u0018\u00010p8BX\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8VX\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020t8VX\u0004¢\u0006\u0006\u001a\u0004\bx\u0010vR$\u0010~\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u00078F@FX\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0001"}, mo44877d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Llj4;", "", "Lr37;", "u", "t", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Liw6;", "transformOrigin", "Lqz5;", "shape", "", "clip", "Lbd5;", "renderEffect", "Luk0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ldc1;", "density", "e", "(FFFFFFFFFFJLqz5;ZLbd5;JJLandroidx/compose/ui/unit/LayoutDirection;Ldc1;)V", "Ltf4;", "position", "f", "(J)Z", "Lsw2;", "size", "c", "(J)V", "Lnw2;", "h", "Lxa0;", "canvas", "g", "Landroid/graphics/Canvas;", "dispatchDraw", "invalidate", "changed", "", "l", "r", "b", "onLayout", "destroy", "i", "forceLayout", "point", "inverse", "(JZ)J", "Lo04;", "rect", "a", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lrc2;", "Lpc2;", "Lgj4;", "k", "Lgj4;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "s", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "x", "()Z", "setInvalidated", "(Z)V", "isInvalidated", "y", "drawnWithZ", "Lbb0;", "A", "Lbb0;", "canvasHolder", "Lie3;", "B", "Lie3;", "matrixCache", "C", "J", "mTransformOrigin", "Ltm4;", "getManualClipPath", "()Ltm4;", "manualClipPath", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lrc2;Lpc2;)V", "H", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.ViewLayer */
/* compiled from: ViewLayer.android.kt */
public final class ViewLayer extends View implements lj4 {

    /* renamed from: H */
    public static final C0435b f2066H = new C0435b((DefaultConstructorMarker) null);

    /* renamed from: I */
    public static final fd2<View, Matrix, r37> f2067I = ViewLayer$Companion$getMatrix$1.INSTANCE;

    /* renamed from: L */
    public static final ViewOutlineProvider f2068L = new C0434a();

    /* renamed from: M */
    public static Method f2069M;

    /* renamed from: P */
    public static Field f2070P;

    /* renamed from: Q */
    public static boolean f2071Q;

    /* renamed from: U */
    public static boolean f2072U;

    /* renamed from: A */
    public final bb0 f2073A = new bb0();

    /* renamed from: B */
    public final ie3<View> f2074B = new ie3<>(f2067I);

    /* renamed from: C */
    public long f2075C = iw6.f13402a.mo21645a();

    /* renamed from: a */
    public final AndroidComposeView f2076a;

    /* renamed from: d */
    public final DrawChildContainer f2077d;

    /* renamed from: e */
    public rc2<? super xa0, r37> f2078e;

    /* renamed from: g */
    public pc2<r37> f2079g;

    /* renamed from: k */
    public final gj4 f2080k;

    /* renamed from: r */
    public boolean f2081r;

    /* renamed from: s */
    public Rect f2082s;

    /* renamed from: x */
    public boolean f2083x;

    /* renamed from: y */
    public boolean f2084y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"androidx/compose/ui/platform/ViewLayer$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lr37;", "getOutline", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$a */
    /* compiled from: ViewLayer.android.kt */
    public static final class C0434a extends ViewOutlineProvider {
        public void getOutline(View view, Outline outline) {
            vx2.m53591g(view, "view");
            vx2.m53591g(outline, "outline");
            Outline c = ((ViewLayer) view).f2080k.mo20603c();
            vx2.m53588d(c);
            outline.set(c);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, mo44877d2 = {"Landroidx/compose/ui/platform/ViewLayer$b;", "", "Landroid/view/View;", "view", "Lr37;", "d", "", "<set-?>", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "b", "c", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lfd2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$b */
    /* compiled from: ViewLayer.android.kt */
    public static final class C0435b {
        public C0435b() {
        }

        public /* synthetic */ C0435b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo3962a() {
            return ViewLayer.f2071Q;
        }

        /* renamed from: b */
        public final boolean mo3963b() {
            return ViewLayer.f2072U;
        }

        /* renamed from: c */
        public final void mo3964c(boolean z) {
            ViewLayer.f2072U = z;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: d */
        public final void mo3965d(View view) {
            Class<String> cls = String.class;
            vx2.m53591g(view, "view");
            try {
                if (!mo3962a()) {
                    ViewLayer.f2071Q = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f2069M = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f2070P = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        Object[] objArr = {"updateDisplayListIfDirty", new Class[0]};
                        ViewLayer.f2069M = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(View.class, objArr);
                        Object[] objArr2 = {"mRecreateDisplayList"};
                        ViewLayer.f2070P = (Field) Class.class.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(View.class, objArr2);
                    }
                    Method n = ViewLayer.f2069M;
                    if (n != null) {
                        n.setAccessible(true);
                    }
                    Field l = ViewLayer.f2070P;
                    if (l != null) {
                        l.setAccessible(true);
                    }
                }
                Field l2 = ViewLayer.f2070P;
                if (l2 != null) {
                    l2.setBoolean(view, true);
                }
                Method n2 = ViewLayer.f2069M;
                if (n2 != null) {
                    n2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                mo3964c(true);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, mo44877d2 = {"Landroidx/compose/ui/platform/ViewLayer$c;", "", "Landroid/view/View;", "view", "", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$c */
    /* compiled from: ViewLayer.android.kt */
    public static final class C0436c {

        /* renamed from: a */
        public static final C0436c f2085a = new C0436c();

        /* renamed from: a */
        public static final long m3131a(View view) {
            vx2.m53591g(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, rc2<? super xa0, r37> rc2, pc2<r37> pc2) {
        super(androidComposeView.getContext());
        vx2.m53591g(androidComposeView, "ownerView");
        vx2.m53591g(drawChildContainer, "container");
        vx2.m53591g(rc2, "drawBlock");
        vx2.m53591g(pc2, "invalidateParentLayer");
        this.f2076a = androidComposeView;
        this.f2077d = drawChildContainer;
        this.f2078e = rc2;
        this.f2079g = pc2;
        this.f2080k = new gj4(androidComposeView.getDensity());
        setWillNotDraw(false);
        setId(View.generateViewId());
        drawChildContainer.addView(this);
    }

    private final tm4 getManualClipPath() {
        if (!getClipToOutline() || this.f2080k.mo20604d()) {
            return null;
        }
        return this.f2080k.mo20602b();
    }

    private final void setInvalidated(boolean z) {
        if (z != this.f2083x) {
            this.f2083x = z;
            this.f2076a.mo3719c0(this, z);
        }
    }

    /* renamed from: a */
    public void mo3930a(o04 o04, boolean z) {
        vx2.m53591g(o04, "rect");
        if (z) {
            float[] a = this.f2074B.mo21516a(this);
            if (a != null) {
                fp3.m17172d(a, o04);
            } else {
                o04.mo23881g(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            }
        } else {
            fp3.m17172d(this.f2074B.mo21517b(this), o04);
        }
    }

    /* renamed from: b */
    public long mo3931b(long j, boolean z) {
        if (!z) {
            return fp3.m17171c(this.f2074B.mo21517b(this), j);
        }
        float[] a = this.f2074B.mo21516a(this);
        if (a != null) {
            return fp3.m17171c(a, j);
        }
        return tf4.f18145b.mo26444a();
    }

    /* renamed from: c */
    public void mo3932c(long j) {
        int f = sw2.m27143f(j);
        int e = sw2.m27142e(j);
        if (f != getWidth() || e != getHeight()) {
            float f2 = (float) f;
            setPivotX(iw6.m19835d(this.f2075C) * f2);
            float f3 = (float) e;
            setPivotY(iw6.m19836e(this.f2075C) * f3);
            this.f2080k.mo20608h(w36.m29258a(f2, f3));
            mo3960u();
            layout(getLeft(), getTop(), getLeft() + f, getTop() + e);
            mo3959t();
            this.f2074B.mo21518c();
        }
    }

    /* renamed from: d */
    public void mo3933d(rc2<? super xa0, r37> rc2, pc2<r37> pc2) {
        vx2.m53591g(rc2, "drawBlock");
        vx2.m53591g(pc2, "invalidateParentLayer");
        this.f2077d.addView(this);
        this.f2081r = false;
        this.f2084y = false;
        this.f2075C = iw6.f13402a.mo21645a();
        this.f2078e = rc2;
        this.f2079g = pc2;
    }

    public void destroy() {
        setInvalidated(false);
        this.f2076a.mo3767h0();
        this.f2078e = null;
        this.f2079g = null;
        this.f2076a.mo3734g0(this);
        this.f2077d.removeViewInLayout(this);
    }

    public void dispatchDraw(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        bb0 bb0 = this.f2073A;
        Canvas k = bb0.mo11468a().mo21535k();
        bb0.mo11468a().mo21536l(canvas);
        C2542ih a = bb0.mo11468a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z = true;
            a.mo21531g();
            this.f2080k.mo20601a(a);
        }
        rc2<? super xa0, r37> rc2 = this.f2078e;
        if (rc2 != null) {
            rc2.invoke(a);
        }
        if (z) {
            a.mo21527c();
        }
        bb0.mo11468a().mo21536l(k);
    }

    /* renamed from: e */
    public void mo3935e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, qz5 qz5, boolean z, bd5 bd5, long j2, long j3, LayoutDirection layoutDirection, dc1 dc1) {
        pc2<r37> pc2;
        qz5 qz52 = qz5;
        vx2.m53591g(qz52, "shape");
        vx2.m53591g(layoutDirection, "layoutDirection");
        vx2.m53591g(dc1, "density");
        this.f2075C = j;
        setScaleX(f);
        float f11 = f2;
        setScaleY(f2);
        float f12 = f3;
        setAlpha(f3);
        float f13 = f4;
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(iw6.m19835d(this.f2075C) * ((float) getWidth()));
        setPivotY(iw6.m19836e(this.f2075C) * ((float) getHeight()));
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.f2081r = z && qz52 == e95.m15986a();
        mo3959t();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && qz52 != e95.m15986a());
        boolean g = this.f2080k.mo20607g(qz5, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, dc1);
        mo3960u();
        if (getManualClipPath() == null) {
            z2 = false;
        }
        if (z3 != z2 || (z2 && g)) {
            invalidate();
        }
        if (!this.f2084y && getElevation() > Utils.FLOAT_EPSILON && (pc2 = this.f2079g) != null) {
            pc2.invoke();
        }
        this.f2074B.mo21518c();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            xc7 xc7 = xc7.f19808a;
            xc7.mo27722a(this, zk0.m31347e(j2));
            xc7.mo27723b(this, zk0.m31347e(j3));
        }
        if (i >= 31) {
            zc7.f20529a.mo28421a(this, bd5);
        }
    }

    /* renamed from: f */
    public boolean mo3936f(long j) {
        float k = tf4.m27734k(j);
        float l = tf4.m27735l(j);
        if (this.f2081r) {
            if (Utils.FLOAT_EPSILON > k || k >= ((float) getWidth()) || Utils.FLOAT_EPSILON > l || l >= ((float) getHeight())) {
                return false;
            }
            return true;
        } else if (getClipToOutline()) {
            return this.f2080k.mo20605e(j);
        } else {
            return true;
        }
    }

    public void forceLayout() {
    }

    /* renamed from: g */
    public void mo3937g(xa0 xa0) {
        boolean z;
        vx2.m53591g(xa0, "canvas");
        if (getElevation() > Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        this.f2084y = z;
        if (z) {
            xa0.mo21528d();
        }
        this.f2077d.mo3922a(xa0, this, getDrawingTime());
        if (this.f2084y) {
            xa0.mo21532h();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final DrawChildContainer getContainer() {
        return this.f2077d;
    }

    public long getLayerId() {
        return (long) getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.f2076a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0436c.m3131a(this.f2076a);
        }
        return -1;
    }

    /* renamed from: h */
    public void mo3938h(long j) {
        int f = nw2.m23481f(j);
        if (f != getLeft()) {
            offsetLeftAndRight(f - getLeft());
            this.f2074B.mo21518c();
        }
        int g = nw2.m23482g(j);
        if (g != getTop()) {
            offsetTopAndBottom(g - getTop());
            this.f2074B.mo21518c();
        }
    }

    /* renamed from: i */
    public void mo3939i() {
        if (this.f2083x && !f2072U) {
            setInvalidated(false);
            f2066H.mo3965d(this);
        }
    }

    public void invalidate() {
        if (!this.f2083x) {
            setInvalidated(true);
            super.invalidate();
            this.f2076a.invalidate();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* renamed from: s */
    public final boolean mo3957s() {
        return this.f2083x;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    /* renamed from: t */
    public final void mo3959t() {
        Rect rect;
        if (this.f2081r) {
            Rect rect2 = this.f2082s;
            if (rect2 == null) {
                this.f2082s = new Rect(0, 0, getWidth(), getHeight());
            } else {
                vx2.m53588d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f2082s;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    /* renamed from: u */
    public final void mo3960u() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.f2080k.mo20603c() != null) {
            viewOutlineProvider = f2068L;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }
}
