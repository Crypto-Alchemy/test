package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.media3.common.PlaybackException;

/* renamed from: cs6 */
/* compiled from: TooltipPopup */
public class cs6 {

    /* renamed from: a */
    public final Context f10277a;

    /* renamed from: b */
    public final View f10278b;

    /* renamed from: c */
    public final TextView f10279c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f10280d;

    /* renamed from: e */
    public final Rect f10281e = new Rect();

    /* renamed from: f */
    public final int[] f10282f = new int[2];

    /* renamed from: g */
    public final int[] f10283g = new int[2];

    public cs6(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f10280d = layoutParams;
        this.f10277a = context;
        View inflate = LayoutInflater.from(context).inflate(i45.abc_tooltip, (ViewGroup) null);
        this.f10278b = inflate;
        this.f10279c = (TextView) inflate.findViewById(j35.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = h55.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m14486b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void mo18279a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        int i5;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f10277a.getResources().getDimensionPixelOffset(n25.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f10277a.getResources().getDimensionPixelOffset(n25.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f10277a.getResources();
        if (z) {
            i5 = n25.tooltip_y_offset_touch;
        } else {
            i5 = n25.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View b = m14486b(view);
        if (b != null) {
            b.getWindowVisibleDisplayFrame(this.f10281e);
            Rect rect = this.f10281e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = this.f10277a.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                this.f10281e.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            b.getLocationOnScreen(this.f10283g);
            view.getLocationOnScreen(this.f10282f);
            int[] iArr = this.f10282f;
            int i7 = iArr[0];
            int[] iArr2 = this.f10283g;
            int i8 = i7 - iArr2[0];
            iArr[0] = i8;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i8 + i) - (b.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f10278b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f10278b.getMeasuredHeight();
            int i9 = this.f10282f[1];
            int i10 = ((i3 + i9) - dimensionPixelOffset3) - measuredHeight;
            int i11 = i9 + i4 + dimensionPixelOffset3;
            if (z) {
                if (i10 >= 0) {
                    layoutParams.y = i10;
                } else {
                    layoutParams.y = i11;
                }
            } else if (measuredHeight + i11 <= this.f10281e.height()) {
                layoutParams.y = i11;
            } else {
                layoutParams.y = i10;
            }
        }
    }

    /* renamed from: c */
    public void mo18280c() {
        if (mo18281d()) {
            ((WindowManager) this.f10277a.getSystemService("window")).removeView(this.f10278b);
        }
    }

    /* renamed from: d */
    public boolean mo18281d() {
        if (this.f10278b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo18282e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo18281d()) {
            mo18280c();
        }
        this.f10279c.setText(charSequence);
        mo18279a(view, i, i2, z, this.f10280d);
        ((WindowManager) this.f10277a.getSystemService("window")).addView(this.f10278b, this.f10280d);
    }
}
