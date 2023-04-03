package net.safemoon.androidwallet.views.slidetoact;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Vibrator;
import android.p001os.VibrationEffect;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\r\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ×\u00012\u00020\u0001:\t\u001cØ\u0001Ù\u0001\u001f!Ú\u0001B.\b\u0007\u0012\b\u0010Ñ\u0001\u001a\u00030Ð\u0001\u0012\f\b\u0002\u0010Ó\u0001\u001a\u0005\u0018\u00010Ò\u0001\u0012\t\b\u0002\u0010Ô\u0001\u001a\u00020\u0007¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0003J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014J(\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\u0012\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010\"R*\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@FX\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010>\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010B\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b?\u0010\"\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R*\u0010E\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\"\u0010\"\u001a\u0004\bC\u0010;\"\u0004\bD\u0010=R*\u0010I\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\bF\u0010\"\u001a\u0004\bG\u0010;\"\u0004\bH\u0010=R\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020J8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010L\u001a\u0004\bS\u0010N\"\u0004\bT\u0010PR*\u0010Y\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\bV\u0010\"\u001a\u0004\bW\u0010;\"\u0004\bX\u0010=R*\u0010]\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\bZ\u0010\"\u001a\u0004\b[\u0010;\"\u0004\b\\\u0010=R*\u0010a\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b^\u0010\"\u001a\u0004\b_\u0010;\"\u0004\b`\u0010=R$\u0010d\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0002@BX\u000e¢\u0006\f\n\u0004\bb\u0010\"\"\u0004\bc\u0010=R$\u0010g\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0002@BX\u000e¢\u0006\f\n\u0004\be\u0010\"\"\u0004\bf\u0010=R\u0016\u0010i\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010\u001dR\u0016\u0010k\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010\u001dR$\u0010n\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0002@BX\u000e¢\u0006\f\n\u0004\bl\u0010\"\"\u0004\bm\u0010=R\u0016\u0010p\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010\u001dR\u0016\u0010r\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bq\u0010\u001dR\u0014\u0010t\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010\"R\u0016\u0010v\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010\"R\u0016\u0010x\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bw\u0010\u001dR\u0016\u0010z\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\by\u0010\"R\u0016\u0010~\u001a\u00020{8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b|\u0010}R\u0017\u0010\u0001\u001a\u00020{8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010}R\u0019\u0010\u0001\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R.\u0010\u0001\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00078\u0006@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\"\u001a\u0005\b\u0001\u0010;\"\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00028\u0002XD¢\u0006\u0007\n\u0005\b\u0001\u0010\u001dR\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010\u001dR\u0019\u0010\u0001\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0001R)\u0010£\u0001\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R1\u0010¨\u0001\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010\u0001\u001a\u0006\b¨\u0001\u0010¤\u0001\"\u0006\b©\u0001\u0010¦\u0001R)\u0010«\u0001\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010\u0001\u001a\u0006\b«\u0001\u0010¤\u0001\"\u0006\b¬\u0001\u0010¦\u0001R)\u0010®\u0001\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b­\u0001\u0010\u0001\u001a\u0006\b®\u0001\u0010¤\u0001\"\u0006\b¯\u0001\u0010¦\u0001R,\u0010·\u0001\u001a\u0005\u0018\u00010°\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R,\u0010¿\u0001\u001a\u0005\u0018\u00010¸\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R,\u0010Ç\u0001\u001a\u0005\u0018\u00010À\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R,\u0010Ï\u0001\u001a\u0005\u0018\u00010È\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001¨\u0006Û\u0001"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView;", "Landroid/view/View;", "", "x", "y", "", "l", "", "inc", "Lr37;", "n", "p", "m", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "performClick", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "a", "F", "mDesiredSliderHeightDp", "d", "mDesiredSliderWidthDp", "e", "I", "mDesiredSliderHeight", "g", "mDesiredSliderWidth", "k", "mAreaHeight", "r", "mAreaWidth", "s", "mActualAreaWidth", "mBorderRadius", "mActualAreaMargin", "A", "mOriginAreaMargin", "", "value", "B", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "C", "getTypeFace", "()I", "setTypeFace", "(I)V", "typeFace", "H", "getTextAppearance", "setTextAppearance", "textAppearance", "getOuterColor", "setOuterColor", "outerColor", "L", "getInnerColor", "setInnerColor", "innerColor", "", "M", "J", "getAnimDuration", "()J", "setAnimDuration", "(J)V", "animDuration", "P", "getBumpVibration", "setBumpVibration", "bumpVibration", "Q", "getTextColor", "setTextColor", "textColor", "U", "getIconColor", "setIconColor", "iconColor", "e0", "getSliderIcon", "setSliderIcon", "sliderIcon", "k0", "setMPosition", "mPosition", "v0", "setMEffectivePosition", "mEffectivePosition", "b1", "mTextYPosition", "e1", "mTextXPosition", "o1", "setMTextSize", "mTextSize", "p1", "mPositionPerc", "q1", "mPositionPercInv", "r1", "mIconMargin", "s1", "mArrowMargin", "t1", "mArrowAngle", "u1", "mTickMargin", "Landroid/graphics/drawable/Drawable;", "v1", "Landroid/graphics/drawable/Drawable;", "mDrawableArrow", "w1", "mDrawableTick", "x1", "Z", "mFlagDrawTick", "y1", "getCompleteIcon", "setCompleteIcon", "completeIcon", "Landroid/graphics/Paint;", "z1", "Landroid/graphics/Paint;", "mOuterPaint", "A1", "mInnerPaint", "B1", "mTextPaint", "Landroid/widget/TextView;", "C1", "Landroid/widget/TextView;", "mTextView", "Landroid/graphics/RectF;", "D1", "Landroid/graphics/RectF;", "mInnerRect", "E1", "mOuterRect", "F1", "mGraceValue", "G1", "mLastX", "H1", "mFlagMoving", "I1", "mIsCompleted", "J1", "isLocked", "()Z", "setLocked", "(Z)V", "K1", "isReversed", "setReversed", "L1", "isRotateIcon", "setRotateIcon", "M1", "isAnimateCompletion", "setAnimateCompletion", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$d;", "N1", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$d;", "getOnSlideToActAnimationEventListener", "()Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$d;", "setOnSlideToActAnimationEventListener", "(Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$d;)V", "onSlideToActAnimationEventListener", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$b;", "O1", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$b;", "getOnSlideCompleteListener", "()Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$b;", "setOnSlideCompleteListener", "(Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$b;)V", "onSlideCompleteListener", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$c;", "P1", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$c;", "getOnSlideResetListener", "()Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$c;", "setOnSlideResetListener", "(Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$c;)V", "onSlideResetListener", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$e;", "Q1", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$e;", "getOnSlideUserFailedListener", "()Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$e;", "setOnSlideUserFailedListener", "(Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$e;)V", "onSlideUserFailedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "xmlAttrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "R1", "b", "c", "f", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SlideToActView.kt */
public final class SlideToActView extends View {

    /* renamed from: R1 */
    public static final C8966a f43357R1 = new C8966a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final int f43358A;

    /* renamed from: A1 */
    public final Paint f43359A1;

    /* renamed from: B */
    public CharSequence f43360B;

    /* renamed from: B1 */
    public Paint f43361B1;

    /* renamed from: C */
    public int f43362C;

    /* renamed from: C1 */
    public TextView f43363C1;

    /* renamed from: D1 */
    public RectF f43364D1;

    /* renamed from: E1 */
    public RectF f43365E1;

    /* renamed from: F1 */
    public final float f43366F1;

    /* renamed from: G1 */
    public float f43367G1;

    /* renamed from: H */
    public int f43368H;

    /* renamed from: H1 */
    public boolean f43369H1;

    /* renamed from: I */
    public int f43370I;

    /* renamed from: I1 */
    public boolean f43371I1;

    /* renamed from: J1 */
    public boolean f43372J1;

    /* renamed from: K1 */
    public boolean f43373K1;

    /* renamed from: L */
    public int f43374L;

    /* renamed from: L1 */
    public boolean f43375L1;

    /* renamed from: M */
    public long f43376M;

    /* renamed from: M1 */
    public boolean f43377M1;

    /* renamed from: N1 */
    public C8969d f43378N1;

    /* renamed from: O1 */
    public C8967b f43379O1;

    /* renamed from: P */
    public long f43380P;

    /* renamed from: P1 */
    public C8968c f43381P1;

    /* renamed from: Q */
    public int f43382Q;

    /* renamed from: Q1 */
    public C8970e f43383Q1;

    /* renamed from: U */
    public int f43384U;

    /* renamed from: a */
    public float f43385a;

    /* renamed from: b1 */
    public float f43386b1;

    /* renamed from: d */
    public float f43387d;

    /* renamed from: e */
    public int f43388e;

    /* renamed from: e0 */
    public int f43389e0;

    /* renamed from: e1 */
    public float f43390e1;

    /* renamed from: g */
    public int f43391g;

    /* renamed from: k */
    public int f43392k;

    /* renamed from: k0 */
    public int f43393k0;

    /* renamed from: o1 */
    public int f43394o1;

    /* renamed from: p1 */
    public float f43395p1;

    /* renamed from: q1 */
    public float f43396q1;

    /* renamed from: r */
    public int f43397r;

    /* renamed from: r1 */
    public final int f43398r1;

    /* renamed from: s */
    public int f43399s;

    /* renamed from: s1 */
    public int f43400s1;

    /* renamed from: t1 */
    public float f43401t1;

    /* renamed from: u1 */
    public int f43402u1;

    /* renamed from: v0 */
    public int f43403v0;

    /* renamed from: v1 */
    public Drawable f43404v1;

    /* renamed from: w1 */
    public Drawable f43405w1;

    /* renamed from: x */
    public int f43406x;

    /* renamed from: x1 */
    public boolean f43407x1;

    /* renamed from: y */
    public int f43408y;

    /* renamed from: y1 */
    public int f43409y1;

    /* renamed from: z1 */
    public final Paint f43410z1;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.slidetoact.SlideToActView$a */
    /* compiled from: SlideToActView.kt */
    public static final class C8966a {
        public C8966a() {
        }

        public /* synthetic */ C8966a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$b;", "", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView;", "view", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.slidetoact.SlideToActView$b */
    /* compiled from: SlideToActView.kt */
    public interface C8967b {
        /* renamed from: a */
        void mo57189a(SlideToActView slideToActView);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$c;", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.slidetoact.SlideToActView$c */
    /* compiled from: SlideToActView.kt */
    public interface C8968c {
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$d;", "", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView;", "view", "", "threshold", "Lr37;", "b", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.slidetoact.SlideToActView$d */
    /* compiled from: SlideToActView.kt */
    public interface C8969d {
        /* renamed from: a */
        void mo62291a(SlideToActView slideToActView);

        /* renamed from: b */
        void mo62292b(SlideToActView slideToActView, float f);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$e;", "", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView;", "view", "", "isOutside", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.slidetoact.SlideToActView$e */
    /* compiled from: SlideToActView.kt */
    public interface C8970e {
        /* renamed from: a */
        void mo62293a(SlideToActView slideToActView, boolean z);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView$f;", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lr37;", "getOutline", "<init>", "(Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.slidetoact.SlideToActView$f */
    /* compiled from: SlideToActView.kt */
    public final class C8971f extends ViewOutlineProvider {
        public C8971f() {
        }

        public void getOutline(View view, Outline outline) {
            if (view != null && outline != null) {
                outline.setRoundRect(SlideToActView.this.f43399s, 0, SlideToActView.this.f43397r - SlideToActView.this.f43399s, SlideToActView.this.f43392k, (float) SlideToActView.this.f43406x);
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo44877d2 = {"net/safemoon/androidwallet/views/slidetoact/SlideToActView$g", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Lr37;", "onAnimationStart", "onAnimationCancel", "onAnimationEnd", "onAnimationRepeat", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.slidetoact.SlideToActView$g */
    /* compiled from: SlideToActView.kt */
    public static final class C8972g implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ SlideToActView f43412a;

        public C8972g(SlideToActView slideToActView) {
            this.f43412a = slideToActView;
        }

        public void onAnimationCancel(Animator animator) {
            vx2.m53591g(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            vx2.m53591g(animator, "animation");
            this.f43412a.f43371I1 = true;
            C8969d onSlideToActAnimationEventListener = this.f43412a.getOnSlideToActAnimationEventListener();
            if (onSlideToActAnimationEventListener != null) {
                onSlideToActAnimationEventListener.mo62291a(this.f43412a);
            }
            C8967b onSlideCompleteListener = this.f43412a.getOnSlideCompleteListener();
            if (onSlideCompleteListener != null) {
                onSlideCompleteListener.mo57189a(this.f43412a);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            vx2.m53591g(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            vx2.m53591g(animator, "animation");
            C8969d onSlideToActAnimationEventListener = this.f43412a.getOnSlideToActAnimationEventListener();
            if (onSlideToActAnimationEventListener != null) {
                SlideToActView slideToActView = this.f43412a;
                onSlideToActAnimationEventListener.mo62292b(slideToActView, slideToActView.f43395p1);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SlideToActView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SlideToActView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlideToActView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.slideToActViewStyle : i);
    }

    /* renamed from: o */
    public static final void m69704o(SlideToActView slideToActView, ValueAnimator valueAnimator) {
        vx2.m53591g(slideToActView, "this$0");
        vx2.m53591g(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        vx2.m53589e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        slideToActView.setMPosition(((Integer) animatedValue).intValue());
        slideToActView.invalidate();
    }

    /* renamed from: q */
    public static final void m69705q(SlideToActView slideToActView, ValueAnimator valueAnimator) {
        vx2.m53591g(slideToActView, "this$0");
        vx2.m53591g(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        vx2.m53589e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        slideToActView.setMPosition(((Integer) animatedValue).intValue());
        slideToActView.invalidate();
    }

    /* renamed from: r */
    public static final void m69706r(SlideToActView slideToActView, ValueAnimator valueAnimator) {
        vx2.m53591g(slideToActView, "this$0");
        vx2.m53591g(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        vx2.m53589e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        slideToActView.f43408y = ((Integer) animatedValue).intValue();
        slideToActView.invalidate();
    }

    /* renamed from: s */
    public static final void m69707s(SlideToActView slideToActView, ValueAnimator valueAnimator) {
        vx2.m53591g(slideToActView, "this$0");
        vx2.m53591g(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        vx2.m53589e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        slideToActView.f43399s = ((Integer) animatedValue).intValue();
        slideToActView.invalidateOutline();
        slideToActView.invalidate();
    }

    private final void setMEffectivePosition(int i) {
        if (this.f43373K1) {
            i = (this.f43397r - this.f43392k) - i;
        }
        this.f43403v0 = i;
    }

    private final void setMPosition(int i) {
        this.f43393k0 = i;
        int i2 = this.f43397r;
        int i3 = this.f43392k;
        if (i2 - i3 == 0) {
            this.f43395p1 = Utils.FLOAT_EPSILON;
            this.f43396q1 = 1.0f;
            return;
        }
        float f = (float) i;
        this.f43395p1 = f / ((float) (i2 - i3));
        this.f43396q1 = ((float) 1) - (f / ((float) (i2 - i3)));
        setMEffectivePosition(i);
    }

    private final void setMTextSize(int i) {
        this.f43394o1 = i;
        this.f43363C1.setTextSize(0, (float) i);
        this.f43361B1.set(this.f43363C1.getPaint());
    }

    /* renamed from: t */
    public static final void m69708t(SlideToActView slideToActView, ValueAnimator valueAnimator) {
        vx2.m53591g(slideToActView, "this$0");
        vx2.m53591g(valueAnimator, "it");
        if (!slideToActView.f43407x1) {
            slideToActView.f43407x1 = true;
            slideToActView.f43402u1 = slideToActView.f43398r1;
        }
    }

    public final long getAnimDuration() {
        return this.f43376M;
    }

    public final long getBumpVibration() {
        return this.f43380P;
    }

    public final int getCompleteIcon() {
        return this.f43409y1;
    }

    public final int getIconColor() {
        return this.f43384U;
    }

    public final int getInnerColor() {
        return this.f43374L;
    }

    public final C8967b getOnSlideCompleteListener() {
        return this.f43379O1;
    }

    public final C8968c getOnSlideResetListener() {
        return this.f43381P1;
    }

    public final C8969d getOnSlideToActAnimationEventListener() {
        return this.f43378N1;
    }

    public final C8970e getOnSlideUserFailedListener() {
        return this.f43383Q1;
    }

    public final int getOuterColor() {
        return this.f43370I;
    }

    public final int getSliderIcon() {
        return this.f43389e0;
    }

    public final CharSequence getText() {
        return this.f43360B;
    }

    public final int getTextAppearance() {
        return this.f43368H;
    }

    public final int getTextColor() {
        return this.f43382Q;
    }

    public final int getTypeFace() {
        return this.f43362C;
    }

    /* renamed from: l */
    public final boolean mo62263l(float f, float f2) {
        if (Utils.FLOAT_EPSILON < f2) {
            int i = this.f43392k;
            if (f2 < ((float) i)) {
                int i2 = this.f43403v0;
                if (((float) i2) >= f || f >= ((float) (i + i2))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: m */
    public final void mo62264m() {
        if (this.f43380P > 0 && zr0.m31438a(getContext(), "android.permission.VIBRATE") == 0) {
            Object systemService = getContext().getSystemService("vibrator");
            vx2.m53589e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            Vibrator vibrator = (Vibrator) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(this.f43380P, -1));
            } else {
                vibrator.vibrate(this.f43380P);
            }
        }
    }

    /* renamed from: n */
    public final void mo62265n(int i) {
        int i2;
        if (this.f43373K1) {
            i2 = this.f43393k0 - i;
        } else {
            i2 = this.f43393k0 + i;
        }
        setMPosition(i2);
        if (this.f43393k0 < 0) {
            setMPosition(0);
        }
        int i3 = this.f43393k0;
        int i4 = this.f43397r;
        int i5 = this.f43392k;
        if (i3 > i4 - i5) {
            setMPosition(i4 - i5);
        }
    }

    public void onDraw(Canvas canvas) {
        CharSequence charSequence;
        super.onDraw(canvas);
        if (canvas != null) {
            RectF rectF = this.f43365E1;
            int i = this.f43399s;
            rectF.set((float) i, Utils.FLOAT_EPSILON, ((float) this.f43397r) - ((float) i), (float) this.f43392k);
            RectF rectF2 = this.f43365E1;
            int i2 = this.f43406x;
            canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f43410z1);
            this.f43361B1.setAlpha((int) (((float) 255) * this.f43396q1));
            TransformationMethod transformationMethod = this.f43363C1.getTransformationMethod();
            Drawable drawable = null;
            if (transformationMethod != null) {
                charSequence = transformationMethod.getTransformation(this.f43360B, this.f43363C1);
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                charSequence = this.f43360B;
            }
            CharSequence charSequence2 = charSequence;
            canvas.drawText(charSequence2, 0, charSequence2.length(), this.f43390e1, this.f43386b1, this.f43361B1);
            int i3 = this.f43392k;
            int i4 = this.f43408y;
            float f = ((float) (i3 - (i4 * 2))) / ((float) i3);
            RectF rectF3 = this.f43364D1;
            int i5 = this.f43403v0;
            rectF3.set((float) (i4 + i5), (float) i4, ((float) (i5 + i3)) - ((float) i4), ((float) i3) - ((float) i4));
            RectF rectF4 = this.f43364D1;
            int i6 = this.f43406x;
            canvas.drawRoundRect(rectF4, ((float) i6) * f, ((float) i6) * f, this.f43359A1);
            canvas.save();
            if (this.f43373K1) {
                canvas.scale(-1.0f, 1.0f, this.f43364D1.centerX(), this.f43364D1.centerY());
            }
            if (this.f43375L1) {
                float f2 = ((float) -180) * this.f43395p1;
                this.f43401t1 = f2;
                canvas.rotate(f2, this.f43364D1.centerX(), this.f43364D1.centerY());
            }
            Drawable drawable2 = this.f43404v1;
            if (drawable2 == null) {
                vx2.m53605u("mDrawableArrow");
                drawable2 = null;
            }
            RectF rectF5 = this.f43364D1;
            int i7 = this.f43400s1;
            drawable2.setBounds(((int) rectF5.left) + i7, ((int) rectF5.top) + i7, ((int) rectF5.right) - i7, ((int) rectF5.bottom) - i7);
            Drawable drawable3 = this.f43404v1;
            if (drawable3 == null) {
                vx2.m53605u("mDrawableArrow");
                drawable3 = null;
            }
            int i8 = drawable3.getBounds().left;
            Drawable drawable4 = this.f43404v1;
            if (drawable4 == null) {
                vx2.m53605u("mDrawableArrow");
                drawable4 = null;
            }
            if (i8 <= drawable4.getBounds().right) {
                Drawable drawable5 = this.f43404v1;
                if (drawable5 == null) {
                    vx2.m53605u("mDrawableArrow");
                    drawable5 = null;
                }
                int i9 = drawable5.getBounds().top;
                Drawable drawable6 = this.f43404v1;
                if (drawable6 == null) {
                    vx2.m53605u("mDrawableArrow");
                    drawable6 = null;
                }
                if (i9 <= drawable6.getBounds().bottom) {
                    Drawable drawable7 = this.f43404v1;
                    if (drawable7 == null) {
                        vx2.m53605u("mDrawableArrow");
                    } else {
                        drawable = drawable7;
                    }
                    drawable.draw(canvas);
                }
            }
            canvas.restore();
            Drawable drawable8 = this.f43405w1;
            int i10 = this.f43399s;
            int i11 = this.f43402u1;
            drawable8.setBounds(i10 + i11, i11, (this.f43397r - i11) - i10, this.f43392k - i11);
            f46.f37724a.mo51599i(this.f43405w1, this.f43374L);
            if (this.f43407x1) {
                this.f43405w1.draw(canvas);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(this.f43391g, size);
        } else if (mode == 0) {
            size = this.f43391g;
        } else if (mode != 1073741824) {
            size = this.f43391g;
        }
        setMeasuredDimension(size, this.f43388e);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f43397r = i;
        this.f43392k = i2;
        if (this.f43406x == -1) {
            this.f43406x = i2 / 2;
        }
        float f = (float) 2;
        this.f43390e1 = ((float) i) / f;
        this.f43386b1 = (((float) i2) / f) - ((this.f43361B1.descent() + this.f43361B1.ascent()) / f);
        setMPosition(0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C8970e eVar;
        boolean z;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            performClick();
        }
        if (motionEvent == null || !isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z2 = false;
            if (action == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                int i = this.f43393k0;
                if ((i > 0 && this.f43372J1) || (i > 0 && this.f43395p1 < this.f43366F1)) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, 0});
                    ofInt.setDuration(this.f43376M);
                    ofInt.addUpdateListener(new g46(this));
                    ofInt.start();
                } else if (i > 0 && this.f43395p1 >= this.f43366F1) {
                    setEnabled(false);
                    mo62270p();
                } else if (this.f43369H1 && i == 0 && (eVar = this.f43383Q1) != null) {
                    eVar.mo62293a(this, false);
                }
                this.f43369H1 = false;
            } else if (action == 2 && this.f43369H1) {
                if (this.f43395p1 < 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                this.f43367G1 = motionEvent.getX();
                mo62265n((int) (motionEvent.getX() - this.f43367G1));
                invalidate();
                if (this.f43380P > 0 && z) {
                    if (this.f43395p1 == 1.0f) {
                        z2 = true;
                    }
                    if (z2) {
                        mo62264m();
                    }
                }
            }
        } else if (mo62263l(motionEvent.getX(), motionEvent.getY())) {
            this.f43369H1 = true;
            this.f43367G1 = motionEvent.getX();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            C8970e eVar2 = this.f43383Q1;
            if (eVar2 != null) {
                eVar2.mo62293a(this, true);
            }
        }
        return true;
    }

    /* renamed from: p */
    public final void mo62270p() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f43393k0, this.f43397r - this.f43392k});
        ofInt.addUpdateListener(new h46(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{this.f43408y, ((int) (this.f43364D1.width() / ((float) 2))) + this.f43408y});
        ofInt2.addUpdateListener(new i46(this));
        ofInt2.setInterpolator(new AnticipateOvershootInterpolator(2.0f));
        ValueAnimator ofInt3 = ValueAnimator.ofInt(new int[]{0, (this.f43397r - this.f43392k) / 2});
        ofInt3.addUpdateListener(new j46(this));
        ValueAnimator c = f46.f37724a.mo51595c(this, this.f43405w1, new k46(this));
        ArrayList arrayList = new ArrayList();
        if (this.f43393k0 < this.f43397r - this.f43392k) {
            vx2.m53590f(ofInt, "finalPositionAnimator");
            arrayList.add(ofInt);
        }
        if (this.f43377M1) {
            vx2.m53590f(ofInt2, "marginAnimator");
            arrayList.add(ofInt2);
            vx2.m53590f(ofInt3, "areaAnimator");
            arrayList.add(ofInt3);
            arrayList.add(c);
        }
        Animator[] animatorArr = (Animator[]) arrayList.toArray(new Animator[0]);
        animatorSet.playSequentially((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        animatorSet.setDuration(this.f43376M);
        animatorSet.addListener(new C8972g(this));
        animatorSet.start();
    }

    public boolean performClick() {
        return super.performClick();
    }

    public final void setAnimDuration(long j) {
        this.f43376M = j;
    }

    public final void setAnimateCompletion(boolean z) {
        this.f43377M1 = z;
    }

    public final void setBumpVibration(long j) {
        this.f43380P = j;
    }

    public final void setCompleteIcon(int i) {
        this.f43409y1 = i;
        if (i != 0) {
            f46 f46 = f46.f37724a;
            Context context = getContext();
            vx2.m53590f(context, "context");
            this.f43405w1 = f46.mo51597g(context, i);
            invalidate();
        }
    }

    public final void setIconColor(int i) {
        this.f43384U = i;
        Drawable drawable = this.f43404v1;
        if (drawable == null) {
            vx2.m53605u("mDrawableArrow");
            drawable = null;
        }
        ij1.m19655n(drawable, i);
        invalidate();
    }

    public final void setInnerColor(int i) {
        this.f43374L = i;
        this.f43359A1.setColor(i);
        invalidate();
    }

    public final void setLocked(boolean z) {
        this.f43372J1 = z;
    }

    public final void setOnSlideCompleteListener(C8967b bVar) {
        this.f43379O1 = bVar;
    }

    public final void setOnSlideResetListener(C8968c cVar) {
        this.f43381P1 = cVar;
    }

    public final void setOnSlideToActAnimationEventListener(C8969d dVar) {
        this.f43378N1 = dVar;
    }

    public final void setOnSlideUserFailedListener(C8970e eVar) {
        this.f43383Q1 = eVar;
    }

    public final void setOuterColor(int i) {
        this.f43370I = i;
        this.f43410z1.setColor(i);
        invalidate();
    }

    public final void setReversed(boolean z) {
        this.f43373K1 = z;
        setMPosition(this.f43393k0);
        invalidate();
    }

    public final void setRotateIcon(boolean z) {
        this.f43375L1 = z;
    }

    public final void setSliderIcon(int i) {
        this.f43389e0 = i;
        if (i != 0) {
            Drawable f = uf5.m28223f(getContext().getResources(), i, getContext().getTheme());
            if (f != null) {
                this.f43404v1 = f;
                ij1.m19655n(f, this.f43384U);
            }
            invalidate();
        }
    }

    public final void setText(CharSequence charSequence) {
        vx2.m53591g(charSequence, "value");
        this.f43360B = charSequence;
        this.f43363C1.setText(charSequence);
        this.f43361B1.set(this.f43363C1.getPaint());
        invalidate();
    }

    public final void setTextAppearance(int i) {
        this.f43368H = i;
        if (i != 0) {
            lo6.m21661o(this.f43363C1, i);
            this.f43361B1.set(this.f43363C1.getPaint());
            this.f43361B1.setColor(this.f43363C1.getCurrentTextColor());
        }
    }

    public final void setTextColor(int i) {
        this.f43382Q = i;
        this.f43363C1.setTextColor(i);
        this.f43361B1.setColor(this.f43382Q);
        invalidate();
    }

    public final void setTypeFace(int i) {
        this.f43362C = i;
        this.f43363C1.setTypeface(Typeface.create("sans-serif-light", i));
        this.f43361B1.set(this.f43363C1.getPaint());
        invalidate();
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlideToActView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
        this.f43385a = 72.0f;
        this.f43387d = 280.0f;
        this.f43406x = -1;
        String str = "";
        this.f43360B = str;
        this.f43376M = 300;
        this.f43389e0 = R.drawable.slidetoact_ic_arrow;
        this.f43386b1 = -1.0f;
        this.f43390e1 = -1.0f;
        this.f43396q1 = 1.0f;
        this.f43410z1 = new Paint(1);
        this.f43359A1 = new Paint(1);
        this.f43361B1 = new Paint(1);
        this.f43366F1 = 0.8f;
        this.f43375L1 = true;
        this.f43377M1 = true;
        TextView textView = new TextView(context);
        this.f43363C1 = textView;
        TextPaint paint = textView.getPaint();
        vx2.m53590f(paint, "mTextView.paint");
        this.f43361B1 = paint;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, y55.SlideToActView, i, R.style.SlideToActView);
        vx2.m53590f(obtainStyledAttributes, "context.theme.obtainStyl….SlideToActView\n        )");
        try {
            this.f43388e = (int) TypedValue.applyDimension(1, this.f43385a, getResources().getDisplayMetrics());
            this.f43391g = (int) TypedValue.applyDimension(1, this.f43387d, getResources().getDisplayMetrics());
            int c = zr0.m31440c(getContext(), R.color.slidetoact_defaultAccent);
            int c2 = zr0.m31440c(getContext(), R.color.slidetoact_white);
            this.f43388e = obtainStyledAttributes.getDimensionPixelSize(10, this.f43388e);
            this.f43406x = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            int color = obtainStyledAttributes.getColor(8, c);
            int color2 = obtainStyledAttributes.getColor(7, c2);
            if (obtainStyledAttributes.hasValue(17)) {
                c2 = obtainStyledAttributes.getColor(17, c2);
            } else if (obtainStyledAttributes.hasValue(7)) {
                c2 = color2;
            }
            String string = obtainStyledAttributes.getString(15);
            if (string != null) {
                vx2.m53590f(string, "getString(R.styleable.SlideToActView_text) ?: \"\"");
                str = string;
            }
            setText(str);
            setTypeFace(obtainStyledAttributes.getInt(19, 0));
            setMTextSize(obtainStyledAttributes.getDimensionPixelSize(18, obtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.slidetoact_default_text_size)));
            setTextColor(c2);
            setTextAppearance(obtainStyledAttributes.getResourceId(16, 0));
            this.f43372J1 = obtainStyledAttributes.getBoolean(13, false);
            setReversed(obtainStyledAttributes.getBoolean(14, false));
            this.f43375L1 = obtainStyledAttributes.getBoolean(9, true);
            this.f43377M1 = obtainStyledAttributes.getBoolean(0, true);
            this.f43376M = (long) obtainStyledAttributes.getInteger(1, 300);
            this.f43380P = (long) obtainStyledAttributes.getInt(4, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, obtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.slidetoact_default_area_margin));
            this.f43358A = dimensionPixelSize;
            this.f43408y = dimensionPixelSize;
            setSliderIcon(obtainStyledAttributes.getResourceId(11, R.drawable.slidetoact_ic_arrow));
            if (obtainStyledAttributes.hasValue(12)) {
                c = obtainStyledAttributes.getColor(12, c);
            } else if (obtainStyledAttributes.hasValue(8)) {
                c = color;
            }
            int resourceId = obtainStyledAttributes.getResourceId(5, R.drawable.slidetoact_animated_ic_check);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, obtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.slidetoact_default_icon_margin));
            this.f43398r1 = dimensionPixelSize2;
            this.f43400s1 = dimensionPixelSize2;
            this.f43402u1 = dimensionPixelSize2;
            obtainStyledAttributes.recycle();
            int i2 = this.f43408y;
            int i3 = this.f43403v0;
            int i4 = this.f43392k;
            this.f43364D1 = new RectF((float) (i2 + i3), (float) i2, ((float) (i3 + i4)) - ((float) i2), ((float) i4) - ((float) i2));
            int i5 = this.f43399s;
            this.f43365E1 = new RectF((float) i5, Utils.FLOAT_EPSILON, ((float) this.f43397r) - ((float) i5), (float) this.f43392k);
            this.f43405w1 = f46.f37724a.mo51597g(context, resourceId);
            this.f43361B1.setTextAlign(Paint.Align.CENTER);
            setOuterColor(color);
            setInnerColor(color2);
            setIconColor(c);
            setOutlineProvider(new C8971f());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
