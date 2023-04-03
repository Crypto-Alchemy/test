package p000;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a:\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\",\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00018F@FX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo44877d2 = {"Landroid/widget/TextView;", "Landroid/graphics/drawable/Drawable;", "start", "top", "end", "bottom", "Lr37;", "b", "value", "getDrawableEnd", "(Landroid/widget/TextView;)Landroid/graphics/drawable/Drawable;", "a", "(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V", "drawableEnd", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: po6 */
/* compiled from: TextView.kt */
public final class po6 {
    /* renamed from: a */
    public static final void m71046a(TextView textView, Drawable drawable) {
        vx2.m53591g(textView, "<this>");
        m71048c(textView, (Drawable) null, (Drawable) null, drawable, (Drawable) null, 11, (Object) null);
    }

    /* renamed from: b */
    public static final void m71047b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        vx2.m53591g(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: c */
    public static /* synthetic */ void m71048c(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = null;
        }
        if ((i & 2) != 0) {
            drawable2 = null;
        }
        if ((i & 4) != 0) {
            drawable3 = null;
        }
        if ((i & 8) != 0) {
            drawable4 = null;
        }
        m71047b(textView, drawable, drawable2, drawable3, drawable4);
    }
}
