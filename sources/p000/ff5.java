package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ff5 */
/* compiled from: ResourceCursorAdapter */
public abstract class ff5 extends nx0 {

    /* renamed from: A */
    public int f11811A;

    /* renamed from: B */
    public LayoutInflater f11812B;

    /* renamed from: y */
    public int f11813y;

    @Deprecated
    public ff5(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f11811A = i;
        this.f11813y = i;
        this.f11812B = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: f */
    public View mo19894f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f11812B.inflate(this.f11811A, viewGroup, false);
    }

    /* renamed from: g */
    public View mo19895g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f11812B.inflate(this.f11813y, viewGroup, false);
    }
}
