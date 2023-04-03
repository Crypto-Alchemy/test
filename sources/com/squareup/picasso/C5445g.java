package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.C5454m;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: com.squareup.picasso.g */
/* compiled from: FileRequestHandler */
public class C5445g extends C5439e {
    public C5445g(Context context) {
        super(context);
    }

    /* renamed from: k */
    public static int m41816k(Uri uri) throws IOException {
        return new cv1(uri.getPath()).mo18309f("Orientation", 1);
    }

    /* renamed from: c */
    public boolean mo39454c(C5450k kVar) {
        return "file".equals(kVar.f26891d.getScheme());
    }

    /* renamed from: f */
    public C5454m.C5455a mo39455f(C5450k kVar, int i) throws IOException {
        return new C5454m.C5455a((Bitmap) null, sg4.m71937l(mo39528j(kVar)), Picasso.LoadedFrom.DISK, m41816k(kVar.f26891d));
    }
}
