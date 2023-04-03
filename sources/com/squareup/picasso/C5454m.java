package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: com.squareup.picasso.m */
/* compiled from: RequestHandler */
public abstract class C5454m {

    /* renamed from: com.squareup.picasso.m$a */
    /* compiled from: RequestHandler */
    public static final class C5455a {

        /* renamed from: a */
        public final Picasso.LoadedFrom f26938a;

        /* renamed from: b */
        public final Bitmap f26939b;

        /* renamed from: c */
        public final z56 f26940c;

        /* renamed from: d */
        public final int f26941d;

        public C5455a(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) C5459q.m41876d(bitmap, "bitmap == null"), (z56) null, loadedFrom, 0);
        }

        /* renamed from: a */
        public Bitmap mo39593a() {
            return this.f26939b;
        }

        /* renamed from: b */
        public int mo39594b() {
            return this.f26941d;
        }

        /* renamed from: c */
        public Picasso.LoadedFrom mo39595c() {
            return this.f26938a;
        }

        /* renamed from: d */
        public z56 mo39596d() {
            return this.f26940c;
        }

        public C5455a(z56 z56, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) null, (z56) C5459q.m41876d(z56, "source == null"), loadedFrom, 0);
        }

        public C5455a(Bitmap bitmap, z56 z56, Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) != (z56 == null ? false : true)) {
                this.f26939b = bitmap;
                this.f26940c = z56;
                this.f26938a = (Picasso.LoadedFrom) C5459q.m41876d(loadedFrom, "loadedFrom == null");
                this.f26941d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static void m41855a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C5450k kVar) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor3 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                if (kVar.f26899l) {
                    i5 = Math.max(floor2, floor3);
                } else {
                    i5 = Math.min(floor2, floor3);
                }
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: b */
    public static void m41856b(int i, int i2, BitmapFactory.Options options, C5450k kVar) {
        m41855a(i, i2, options.outWidth, options.outHeight, options, kVar);
    }

    /* renamed from: d */
    public static BitmapFactory.Options m41857d(C5450k kVar) {
        boolean z;
        boolean c = kVar.mo39568c();
        if (kVar.f26906s != null) {
            z = true;
        } else {
            z = false;
        }
        BitmapFactory.Options options = null;
        if (c || z || kVar.f26905r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c;
            boolean z2 = kVar.f26905r;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = kVar.f26906s;
            }
        }
        return options;
    }

    /* renamed from: g */
    public static boolean m41858g(BitmapFactory.Options options) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract boolean mo39454c(C5450k kVar);

    /* renamed from: e */
    public int mo39456e() {
        return 0;
    }

    /* renamed from: f */
    public abstract C5455a mo39455f(C5450k kVar, int i) throws IOException;

    /* renamed from: h */
    public boolean mo39457h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* renamed from: i */
    public boolean mo39458i() {
        return false;
    }
}
