package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* renamed from: i90 */
/* compiled from: CalendarItemStyle */
public final class i90 {

    /* renamed from: a */
    public final Rect f29850a;

    /* renamed from: b */
    public final ColorStateList f29851b;

    /* renamed from: c */
    public final ColorStateList f29852c;

    /* renamed from: d */
    public final ColorStateList f29853d;

    /* renamed from: e */
    public final int f29854e;

    /* renamed from: f */
    public final rz5 f29855f;

    public i90(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, rz5 rz5, Rect rect) {
        gu4.m18425c(rect.left);
        gu4.m18425c(rect.top);
        gu4.m18425c(rect.right);
        gu4.m18425c(rect.bottom);
        this.f29850a = rect;
        this.f29851b = colorStateList2;
        this.f29852c = colorStateList;
        this.f29853d = colorStateList3;
        this.f29854e = i;
        this.f29855f = rz5;
    }

    /* renamed from: a */
    public static i90 m45584a(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        gu4.m18423a(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, u55.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(u55.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(u55.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(u55.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(u55.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList b = to3.m52391b(context, obtainStyledAttributes, u55.MaterialCalendarItem_itemFillColor);
        ColorStateList b2 = to3.m52391b(context, obtainStyledAttributes, u55.MaterialCalendarItem_itemTextColor);
        ColorStateList b3 = to3.m52391b(context, obtainStyledAttributes, u55.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(u55.MaterialCalendarItem_itemStrokeWidth, 0);
        rz5 m = rz5.m51447b(context, obtainStyledAttributes.getResourceId(u55.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(u55.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo47599m();
        obtainStyledAttributes.recycle();
        return new i90(b, b2, b3, dimensionPixelSize, m, rect);
    }

    /* renamed from: b */
    public int mo43519b() {
        return this.f29850a.bottom;
    }

    /* renamed from: c */
    public int mo43520c() {
        return this.f29850a.top;
    }

    /* renamed from: d */
    public void mo43521d(TextView textView) {
        uo3 uo3 = new uo3();
        uo3 uo32 = new uo3();
        uo3.setShapeAppearanceModel(this.f29855f);
        uo32.setShapeAppearanceModel(this.f29855f);
        uo3.mo48440a0(this.f29852c);
        uo3.mo48458j0((float) this.f29854e, this.f29853d);
        textView.setTextColor(this.f29851b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f29851b.withAlpha(30), uo3, uo32);
        Rect rect = this.f29850a;
        ga7.m17793t0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
