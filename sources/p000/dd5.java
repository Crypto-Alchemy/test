package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.p004ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b0\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010*\u001a\u00020%¢\u0006\u0004\by\u0010zJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J.\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0002H\u0016R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b&\u0010/\"\u0004\b0\u00101R\"\u0010\f\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\"\u0010\r\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b!\u0010.\u001a\u0004\b2\u0010/\"\u0004\b5\u00101R\"\u0010\u000e\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u0010/\"\u0004\b8\u00101R*\u0010@\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010/R\u0014\u0010D\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010/R$\u0010F\u001a\u0004\u0018\u00010E8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\b:\u0010JR$\u0010P\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010S\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR$\u0010V\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR$\u0010X\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bW\u0010M\"\u0004\b6\u0010OR$\u0010Z\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\b.\u0010M\"\u0004\bY\u0010OR$\u0010]\u001a\u00020\n2\u0006\u00109\u001a\u00020\n8V@VX\u000e¢\u0006\f\u001a\u0004\b[\u0010/\"\u0004\b\\\u00101R$\u0010`\u001a\u00020\n2\u0006\u00109\u001a\u00020\n8V@VX\u000e¢\u0006\f\u001a\u0004\b^\u0010/\"\u0004\b_\u00101R$\u0010c\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\ba\u0010M\"\u0004\bb\u0010OR$\u0010f\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bd\u0010M\"\u0004\be\u0010OR$\u0010i\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bg\u0010M\"\u0004\bh\u0010OR$\u0010l\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bj\u0010M\"\u0004\bk\u0010OR$\u0010o\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bm\u0010M\"\u0004\bn\u0010OR$\u0010r\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\bp\u0010M\"\u0004\bq\u0010OR$\u0010u\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f8V@VX\u000e¢\u0006\f\u001a\u0004\bs\u0010=\"\u0004\bt\u0010?R$\u0010v\u001a\u00020K2\u0006\u00109\u001a\u00020K8V@VX\u000e¢\u0006\f\u001a\u0004\b+\u0010M\"\u0004\b-\u0010OR\u0014\u0010x\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bw\u0010=¨\u0006{"}, mo44877d2 = {"Ldd5;", "Lme1;", "Lr37;", "J", "Landroid/view/RenderNode;", "renderNode", "O", "Landroid/graphics/Outline;", "outline", "D", "", "left", "top", "right", "bottom", "", "i", "offset", "x", "l", "Lbb0;", "canvasHolder", "Ltm4;", "clipPath", "Lkotlin/Function1;", "Lxa0;", "drawBlock", "p", "Landroid/graphics/Matrix;", "matrix", "v", "Landroid/graphics/Canvas;", "canvas", "e", "hasOverlappingRendering", "t", "j", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "b", "Landroid/view/RenderNode;", "c", "I", "()I", "L", "(I)V", "d", "o", "N", "M", "f", "y", "K", "value", "g", "Z", "n", "()Z", "h", "(Z)V", "clipToBounds", "getWidth", "width", "getHeight", "height", "Lbd5;", "renderEffect", "Lbd5;", "getRenderEffect", "()Lbd5;", "(Lbd5;)V", "", "getScaleX", "()F", "q", "(F)V", "scaleX", "getScaleY", "C", "scaleY", "getTranslationX", "F", "translationX", "getTranslationY", "translationY", "k", "elevation", "getAmbientShadowColor", "E", "ambientShadowColor", "getSpotShadowColor", "H", "spotShadowColor", "getRotationZ", "z", "rotationZ", "getRotationX", "u", "rotationX", "getRotationY", "w", "rotationY", "getCameraDistance", "s", "cameraDistance", "getPivotX", "A", "pivotX", "getPivotY", "B", "pivotY", "r", "G", "clipToOutline", "alpha", "m", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dd5 */
/* compiled from: RenderNodeApi23.android.kt */
public final class dd5 implements me1 {

    /* renamed from: h */
    public static final C2148a f10629h = new C2148a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static boolean f10630i;

    /* renamed from: j */
    public static boolean f10631j = true;

    /* renamed from: a */
    public final AndroidComposeView f10632a;

    /* renamed from: b */
    public final RenderNode f10633b;

    /* renamed from: c */
    public int f10634c;

    /* renamed from: d */
    public int f10635d;

    /* renamed from: e */
    public int f10636e;

    /* renamed from: f */
    public int f10637f;

    /* renamed from: g */
    public boolean f10638g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Ldd5$a;", "", "", "needToValidateAccess", "Z", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: dd5$a */
    /* compiled from: RenderNodeApi23.android.kt */
    public static final class C2148a {
        public C2148a() {
        }

        public /* synthetic */ C2148a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public dd5(AndroidComposeView androidComposeView) {
        vx2.m53591g(androidComposeView, "ownerView");
        this.f10632a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        vx2.m53590f(create, "create(\"Compose\", ownerView)");
        this.f10633b = create;
        if (f10631j) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            mo18701O(create);
            mo18696J();
            f10631j = false;
        }
        if (f10630i) {
            throw new NoClassDefFoundError();
        }
    }

    /* renamed from: A */
    public void mo18687A(float f) {
        this.f10633b.setPivotX(f);
    }

    /* renamed from: B */
    public void mo18688B(float f) {
        this.f10633b.setPivotY(f);
    }

    /* renamed from: C */
    public void mo18689C(float f) {
        this.f10633b.setScaleY(f);
    }

    /* renamed from: D */
    public void mo18690D(Outline outline) {
        this.f10633b.setOutline(outline);
    }

    /* renamed from: E */
    public void mo18691E(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            kd5.f14039a.mo22257c(this.f10633b, i);
        }
    }

    /* renamed from: F */
    public void mo18692F(float f) {
        this.f10633b.setTranslationX(f);
    }

    /* renamed from: G */
    public void mo18693G(boolean z) {
        this.f10633b.setClipToOutline(z);
    }

    /* renamed from: H */
    public void mo18694H(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            kd5.f14039a.mo22258d(this.f10633b, i);
        }
    }

    /* renamed from: I */
    public float mo18695I() {
        return this.f10633b.getElevation();
    }

    /* renamed from: J */
    public final void mo18696J() {
        if (Build.VERSION.SDK_INT >= 24) {
            jd5.f13581a.mo21807a(this.f10633b);
        } else {
            id5.f13251a.mo21515a(this.f10633b);
        }
    }

    /* renamed from: K */
    public void mo18697K(int i) {
        this.f10637f = i;
    }

    /* renamed from: L */
    public void mo18698L(int i) {
        this.f10634c = i;
    }

    /* renamed from: M */
    public void mo18699M(int i) {
        this.f10636e = i;
    }

    /* renamed from: N */
    public void mo18700N(int i) {
        this.f10635d = i;
    }

    /* renamed from: O */
    public final void mo18701O(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            kd5 kd5 = kd5.f14039a;
            kd5.mo22257c(renderNode, kd5.mo22255a(renderNode));
            kd5.mo22258d(renderNode, kd5.mo22256b(renderNode));
        }
    }

    /* renamed from: a */
    public int mo18702a() {
        return this.f10634c;
    }

    /* renamed from: b */
    public float mo18703b() {
        return this.f10633b.getAlpha();
    }

    /* renamed from: c */
    public void mo18704c(float f) {
        this.f10633b.setAlpha(f);
    }

    /* renamed from: d */
    public int mo18705d() {
        return this.f10636e;
    }

    /* renamed from: e */
    public void mo18706e(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f10633b);
    }

    /* renamed from: f */
    public void mo18707f(float f) {
        this.f10633b.setTranslationY(f);
    }

    /* renamed from: g */
    public void mo18708g(bd5 bd5) {
    }

    public int getHeight() {
        return mo18728y() - mo18718o();
    }

    public int getWidth() {
        return mo18705d() - mo18702a();
    }

    /* renamed from: h */
    public void mo18711h(boolean z) {
        this.f10638g = z;
        this.f10633b.setClipToBounds(z);
    }

    /* renamed from: i */
    public boolean mo18712i(int i, int i2, int i3, int i4) {
        mo18698L(i);
        mo18700N(i2);
        mo18699M(i3);
        mo18697K(i4);
        return this.f10633b.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: j */
    public void mo18713j() {
        mo18696J();
    }

    /* renamed from: k */
    public void mo18714k(float f) {
        this.f10633b.setElevation(f);
    }

    /* renamed from: l */
    public void mo18715l(int i) {
        mo18700N(mo18718o() + i);
        mo18697K(mo18728y() + i);
        this.f10633b.offsetTopAndBottom(i);
    }

    /* renamed from: m */
    public boolean mo18716m() {
        return this.f10633b.isValid();
    }

    /* renamed from: n */
    public boolean mo18717n() {
        return this.f10638g;
    }

    /* renamed from: o */
    public int mo18718o() {
        return this.f10635d;
    }

    /* renamed from: p */
    public void mo18719p(bb0 bb0, tm4 tm4, rc2<? super xa0, r37> rc2) {
        vx2.m53591g(bb0, "canvasHolder");
        vx2.m53591g(rc2, "drawBlock");
        Canvas start = this.f10633b.start(getWidth(), getHeight());
        vx2.m53590f(start, "renderNode.start(width, height)");
        Canvas k = bb0.mo11468a().mo21535k();
        bb0.mo11468a().mo21536l(start);
        C2542ih a = bb0.mo11468a();
        if (tm4 != null) {
            a.mo21531g();
            wa0.m29431b(a, tm4, 0, 2, (Object) null);
        }
        rc2.invoke(a);
        if (tm4 != null) {
            a.mo21527c();
        }
        bb0.mo11468a().mo21536l(k);
        this.f10633b.end(start);
    }

    /* renamed from: q */
    public void mo18720q(float f) {
        this.f10633b.setScaleX(f);
    }

    /* renamed from: r */
    public boolean mo18721r() {
        return this.f10633b.getClipToOutline();
    }

    /* renamed from: s */
    public void mo18722s(float f) {
        this.f10633b.setCameraDistance(-f);
    }

    /* renamed from: t */
    public boolean mo18723t(boolean z) {
        return this.f10633b.setHasOverlappingRendering(z);
    }

    /* renamed from: u */
    public void mo18724u(float f) {
        this.f10633b.setRotationX(f);
    }

    /* renamed from: v */
    public void mo18725v(Matrix matrix) {
        vx2.m53591g(matrix, "matrix");
        this.f10633b.getMatrix(matrix);
    }

    /* renamed from: w */
    public void mo18726w(float f) {
        this.f10633b.setRotationY(f);
    }

    /* renamed from: x */
    public void mo18727x(int i) {
        mo18698L(mo18702a() + i);
        mo18699M(mo18705d() + i);
        this.f10633b.offsetLeftAndRight(i);
    }

    /* renamed from: y */
    public int mo18728y() {
        return this.f10637f;
    }

    /* renamed from: z */
    public void mo18729z(float f) {
        this.f10633b.setRotation(f);
    }
}
