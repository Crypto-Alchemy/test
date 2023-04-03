package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH&J\b\u0010 \u001a\u00020\u0004H&R\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010\n\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0014\u0010'\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0014\u0010)\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u001c\u0010/\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00102\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001c\u00105\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001c\u00108\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u001c\u0010;\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001c\u0010?\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010>R\u001c\u0010B\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010>R\u001c\u0010E\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R\u001c\u0010H\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u001c\u0010K\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\u001c\u0010N\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010,\"\u0004\bM\u0010.R\u001c\u0010Q\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bO\u0010,\"\u0004\bP\u0010.R\u001c\u0010T\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bR\u0010,\"\u0004\bS\u0010.R\u001c\u0010Y\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010\\\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR\u001c\u0010_\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b]\u0010,\"\u0004\b^\u0010.R\u001e\u0010e\u001a\u0004\u0018\u00010`8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010Vø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006hÀ\u0006\u0001"}, mo44877d2 = {"Lme1;", "", "Landroid/graphics/Outline;", "outline", "Lr37;", "D", "", "left", "top", "right", "bottom", "", "i", "offset", "x", "l", "Lbb0;", "canvasHolder", "Ltm4;", "clipPath", "Lkotlin/Function1;", "Lxa0;", "drawBlock", "p", "Landroid/graphics/Matrix;", "matrix", "v", "Landroid/graphics/Canvas;", "canvas", "e", "hasOverlappingRendering", "t", "j", "a", "()I", "o", "d", "y", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "q", "(F)V", "scaleX", "getScaleY", "C", "scaleY", "getTranslationX", "F", "translationX", "getTranslationY", "f", "translationY", "I", "k", "elevation", "getAmbientShadowColor", "E", "(I)V", "ambientShadowColor", "getSpotShadowColor", "H", "spotShadowColor", "getRotationZ", "z", "rotationZ", "getRotationX", "u", "rotationX", "getRotationY", "w", "rotationY", "getCameraDistance", "s", "cameraDistance", "getPivotX", "A", "pivotX", "getPivotY", "B", "pivotY", "r", "()Z", "G", "(Z)V", "clipToOutline", "n", "h", "clipToBounds", "b", "c", "alpha", "Lbd5;", "getRenderEffect", "()Lbd5;", "g", "(Lbd5;)V", "renderEffect", "m", "hasDisplayList", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: me1 */
/* compiled from: DeviceRenderNode.android.kt */
public interface me1 {
    /* renamed from: A */
    void mo18687A(float f);

    /* renamed from: B */
    void mo18688B(float f);

    /* renamed from: C */
    void mo18689C(float f);

    /* renamed from: D */
    void mo18690D(Outline outline);

    /* renamed from: E */
    void mo18691E(int i);

    /* renamed from: F */
    void mo18692F(float f);

    /* renamed from: G */
    void mo18693G(boolean z);

    /* renamed from: H */
    void mo18694H(int i);

    /* renamed from: I */
    float mo18695I();

    /* renamed from: a */
    int mo18702a();

    /* renamed from: b */
    float mo18703b();

    /* renamed from: c */
    void mo18704c(float f);

    /* renamed from: d */
    int mo18705d();

    /* renamed from: e */
    void mo18706e(Canvas canvas);

    /* renamed from: f */
    void mo18707f(float f);

    /* renamed from: g */
    void mo18708g(bd5 bd5);

    int getHeight();

    int getWidth();

    /* renamed from: h */
    void mo18711h(boolean z);

    /* renamed from: i */
    boolean mo18712i(int i, int i2, int i3, int i4);

    /* renamed from: j */
    void mo18713j();

    /* renamed from: k */
    void mo18714k(float f);

    /* renamed from: l */
    void mo18715l(int i);

    /* renamed from: m */
    boolean mo18716m();

    /* renamed from: n */
    boolean mo18717n();

    /* renamed from: o */
    int mo18718o();

    /* renamed from: p */
    void mo18719p(bb0 bb0, tm4 tm4, rc2<? super xa0, r37> rc2);

    /* renamed from: q */
    void mo18720q(float f);

    /* renamed from: r */
    boolean mo18721r();

    /* renamed from: s */
    void mo18722s(float f);

    /* renamed from: t */
    boolean mo18723t(boolean z);

    /* renamed from: u */
    void mo18724u(float f);

    /* renamed from: v */
    void mo18725v(Matrix matrix);

    /* renamed from: w */
    void mo18726w(float f);

    /* renamed from: x */
    void mo18727x(int i);

    /* renamed from: y */
    int mo18728y();

    /* renamed from: z */
    void mo18729z(float f);
}
