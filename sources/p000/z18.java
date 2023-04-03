package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: z18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class z18 {

    /* renamed from: a */
    public int f35980a;

    /* renamed from: a */
    public abstract void mo49776a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* renamed from: b */
    public final void mo49777b(Context context, t28 t28, boolean z) {
        Drawable drawable;
        int i = this.f35980a;
        if (i != 0) {
            drawable = context.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        mo49776a(drawable, z, false, false);
    }

    /* renamed from: c */
    public final void mo49778c(Context context, Bitmap bitmap, boolean z) {
        C6225lr.m47913c(bitmap);
        mo49776a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
