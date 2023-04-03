package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.p004ui.platform.AndroidComposeView;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\bq\u0010rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010+R\u0014\u0010\b\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0014\u0010\t\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0014\u0010\n\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0014\u00100\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0014\u00102\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010+R$\u00109\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\b:\u00106\"\u0004\b;\u00108R$\u0010?\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\b=\u00106\"\u0004\b>\u00108R$\u0010B\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\b@\u00106\"\u0004\bA\u00108R$\u0010E\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\bC\u00106\"\u0004\bD\u00108R$\u0010I\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\bF\u0010+\"\u0004\bG\u0010HR$\u0010L\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068V@VX\u000e¢\u0006\f\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010HR$\u0010O\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\bM\u00106\"\u0004\bN\u00108R$\u0010R\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\bP\u00106\"\u0004\bQ\u00108R$\u0010U\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\bS\u00106\"\u0004\bT\u00108R$\u0010X\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\bV\u00106\"\u0004\bW\u00108R$\u0010[\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\bY\u00106\"\u0004\bZ\u00108R$\u0010^\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\b\\\u00106\"\u0004\b]\u00108R$\u0010c\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b8V@VX\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010f\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b8V@VX\u000e¢\u0006\f\u001a\u0004\bd\u0010`\"\u0004\be\u0010bR$\u0010h\u001a\u0002032\u0006\u00104\u001a\u0002038V@VX\u000e¢\u0006\f\u001a\u0004\b(\u00106\"\u0004\bg\u00108R(\u0010n\u001a\u0004\u0018\u00010i2\b\u00104\u001a\u0004\u0018\u00010i8V@VX\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\bo\u0010`¨\u0006s"}, mo44877d2 = {"Lfd5;", "Lme1;", "Landroid/graphics/Outline;", "outline", "Lr37;", "D", "", "left", "top", "right", "bottom", "", "i", "offset", "x", "l", "Lbb0;", "canvasHolder", "Ltm4;", "clipPath", "Lkotlin/Function1;", "Lxa0;", "drawBlock", "p", "Landroid/graphics/Matrix;", "matrix", "v", "Landroid/graphics/Canvas;", "canvas", "e", "hasOverlappingRendering", "t", "j", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroid/graphics/RenderNode;", "b", "Landroid/graphics/RenderNode;", "renderNode", "()I", "o", "d", "y", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "q", "(F)V", "scaleX", "getScaleY", "C", "scaleY", "getTranslationX", "F", "translationX", "getTranslationY", "f", "translationY", "I", "k", "elevation", "getAmbientShadowColor", "E", "(I)V", "ambientShadowColor", "getSpotShadowColor", "H", "spotShadowColor", "getRotationZ", "z", "rotationZ", "getRotationX", "u", "rotationX", "getRotationY", "w", "rotationY", "getCameraDistance", "s", "cameraDistance", "getPivotX", "A", "pivotX", "getPivotY", "B", "pivotY", "r", "()Z", "G", "(Z)V", "clipToOutline", "n", "h", "clipToBounds", "c", "alpha", "Lbd5;", "getRenderEffect", "()Lbd5;", "g", "(Lbd5;)V", "renderEffect", "m", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fd5 */
/* compiled from: RenderNodeApi29.android.kt */
public final class fd5 implements me1 {

    /* renamed from: a */
    public final AndroidComposeView f11788a;

    /* renamed from: b */
    public final RenderNode f11789b = new RenderNode("Compose");

    public fd5(AndroidComposeView androidComposeView) {
        vx2.m53591g(androidComposeView, "ownerView");
        this.f11788a = androidComposeView;
    }

    /* renamed from: A */
    public void mo18687A(float f) {
        this.f11789b.setPivotX(f);
    }

    /* renamed from: B */
    public void mo18688B(float f) {
        this.f11789b.setPivotY(f);
    }

    /* renamed from: C */
    public void mo18689C(float f) {
        this.f11789b.setScaleY(f);
    }

    /* renamed from: D */
    public void mo18690D(Outline outline) {
        this.f11789b.setOutline(outline);
    }

    /* renamed from: E */
    public void mo18691E(int i) {
        this.f11789b.setAmbientShadowColor(i);
    }

    /* renamed from: F */
    public void mo18692F(float f) {
        this.f11789b.setTranslationX(f);
    }

    /* renamed from: G */
    public void mo18693G(boolean z) {
        this.f11789b.setClipToOutline(z);
    }

    /* renamed from: H */
    public void mo18694H(int i) {
        this.f11789b.setSpotShadowColor(i);
    }

    /* renamed from: I */
    public float mo18695I() {
        return this.f11789b.getElevation();
    }

    /* renamed from: a */
    public int mo18702a() {
        return this.f11789b.getLeft();
    }

    /* renamed from: b */
    public float mo18703b() {
        return this.f11789b.getAlpha();
    }

    /* renamed from: c */
    public void mo18704c(float f) {
        this.f11789b.setAlpha(f);
    }

    /* renamed from: d */
    public int mo18705d() {
        return this.f11789b.getRight();
    }

    /* renamed from: e */
    public void mo18706e(Canvas canvas) {
        vx2.m53591g(canvas, "canvas");
        canvas.drawRenderNode(this.f11789b);
    }

    /* renamed from: f */
    public void mo18707f(float f) {
        this.f11789b.setTranslationY(f);
    }

    /* renamed from: g */
    public void mo18708g(bd5 bd5) {
        if (Build.VERSION.SDK_INT >= 31) {
            hd5.f12822a.mo21089a(this.f11789b, bd5);
        }
    }

    public int getHeight() {
        return this.f11789b.getHeight();
    }

    public int getWidth() {
        return this.f11789b.getWidth();
    }

    /* renamed from: h */
    public void mo18711h(boolean z) {
        this.f11789b.setClipToBounds(z);
    }

    /* renamed from: i */
    public boolean mo18712i(int i, int i2, int i3, int i4) {
        return this.f11789b.setPosition(i, i2, i3, i4);
    }

    /* renamed from: j */
    public void mo18713j() {
        this.f11789b.discardDisplayList();
    }

    /* renamed from: k */
    public void mo18714k(float f) {
        this.f11789b.setElevation(f);
    }

    /* renamed from: l */
    public void mo18715l(int i) {
        this.f11789b.offsetTopAndBottom(i);
    }

    /* renamed from: m */
    public boolean mo18716m() {
        return this.f11789b.hasDisplayList();
    }

    /* renamed from: n */
    public boolean mo18717n() {
        return this.f11789b.getClipToBounds();
    }

    /* renamed from: o */
    public int mo18718o() {
        return this.f11789b.getTop();
    }

    /* renamed from: p */
    public void mo18719p(bb0 bb0, tm4 tm4, rc2<? super xa0, r37> rc2) {
        vx2.m53591g(bb0, "canvasHolder");
        vx2.m53591g(rc2, "drawBlock");
        RecordingCanvas beginRecording = this.f11789b.beginRecording();
        vx2.m53590f(beginRecording, "renderNode.beginRecording()");
        Canvas k = bb0.mo11468a().mo21535k();
        bb0.mo11468a().mo21536l(beginRecording);
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
        this.f11789b.endRecording();
    }

    /* renamed from: q */
    public void mo18720q(float f) {
        this.f11789b.setScaleX(f);
    }

    /* renamed from: r */
    public boolean mo18721r() {
        return this.f11789b.getClipToOutline();
    }

    /* renamed from: s */
    public void mo18722s(float f) {
        this.f11789b.setCameraDistance(f);
    }

    /* renamed from: t */
    public boolean mo18723t(boolean z) {
        return this.f11789b.setHasOverlappingRendering(z);
    }

    /* renamed from: u */
    public void mo18724u(float f) {
        this.f11789b.setRotationX(f);
    }

    /* renamed from: v */
    public void mo18725v(Matrix matrix) {
        vx2.m53591g(matrix, "matrix");
        this.f11789b.getMatrix(matrix);
    }

    /* renamed from: w */
    public void mo18726w(float f) {
        this.f11789b.setRotationY(f);
    }

    /* renamed from: x */
    public void mo18727x(int i) {
        this.f11789b.offsetLeftAndRight(i);
    }

    /* renamed from: y */
    public int mo18728y() {
        return this.f11789b.getBottom();
    }

    /* renamed from: z */
    public void mo18729z(float f) {
        this.f11789b.setRotationZ(f);
    }
}
