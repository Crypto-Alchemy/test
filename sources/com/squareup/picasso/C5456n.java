package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.C5454m;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: com.squareup.picasso.n */
/* compiled from: ResourceRequestHandler */
public class C5456n extends C5454m {

    /* renamed from: a */
    public final Context f26942a;

    public C5456n(Context context) {
        this.f26942a = context;
    }

    /* renamed from: j */
    public static Bitmap m41868j(Resources resources, int i, C5450k kVar) {
        BitmapFactory.Options d = C5454m.m41857d(kVar);
        if (C5454m.m41858g(d)) {
            BitmapFactory.decodeResource(resources, i, d);
            C5454m.m41856b(kVar.f26895h, kVar.f26896i, d, kVar);
        }
        return BitmapFactory.decodeResource(resources, i, d);
    }

    /* renamed from: c */
    public boolean mo39454c(C5450k kVar) {
        if (kVar.f26892e != 0) {
            return true;
        }
        return "android.resource".equals(kVar.f26891d.getScheme());
    }

    /* renamed from: f */
    public C5454m.C5455a mo39455f(C5450k kVar, int i) throws IOException {
        Resources m = C5459q.m41885m(this.f26942a, kVar);
        return new C5454m.C5455a(m41868j(m, C5459q.m41884l(m, kVar), kVar), Picasso.LoadedFrom.DISK);
    }
}
