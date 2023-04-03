package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.C5454m;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: com.squareup.picasso.b */
/* compiled from: AssetRequestHandler */
public class C5430b extends C5454m {

    /* renamed from: d */
    public static final int f26822d = 22;

    /* renamed from: a */
    public final Context f26823a;

    /* renamed from: b */
    public final Object f26824b = new Object();

    /* renamed from: c */
    public AssetManager f26825c;

    public C5430b(Context context) {
        this.f26823a = context;
    }

    /* renamed from: j */
    public static String m41754j(C5450k kVar) {
        return kVar.f26891d.toString().substring(f26822d);
    }

    /* renamed from: c */
    public boolean mo39454c(C5450k kVar) {
        Uri uri = kVar.f26891d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C5454m.C5455a mo39455f(C5450k kVar, int i) throws IOException {
        if (this.f26825c == null) {
            synchronized (this.f26824b) {
                if (this.f26825c == null) {
                    this.f26825c = this.f26823a.getAssets();
                }
            }
        }
        return new C5454m.C5455a(sg4.m71937l(this.f26825c.open(m41754j(kVar))), Picasso.LoadedFrom.DISK);
    }
}
