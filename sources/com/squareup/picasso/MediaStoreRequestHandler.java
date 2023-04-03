package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.C5454m;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import org.web3j.ens.contracts.generated.PublicResolver;

public class MediaStoreRequestHandler extends C5439e {

    /* renamed from: b */
    public static final String[] f26768b = {"orientation"};

    public enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, 384),
        FULL(2, -1, -1);
        
        public final int androidKind;
        public final int height;
        public final int width;

        /* access modifiers changed from: public */
        PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    public MediaStoreRequestHandler(Context context) {
        super(context);
    }

    /* renamed from: k */
    public static int m41708k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f26768b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: l */
    public static PicassoKind m41709l(int i, int i2) {
        PicassoKind picassoKind = PicassoKind.MICRO;
        if (i <= picassoKind.width && i2 <= picassoKind.height) {
            return picassoKind;
        }
        PicassoKind picassoKind2 = PicassoKind.MINI;
        if (i > picassoKind2.width || i2 > picassoKind2.height) {
            return PicassoKind.FULL;
        }
        return picassoKind2;
    }

    /* renamed from: c */
    public boolean mo39454c(C5450k kVar) {
        Uri uri = kVar.f26891d;
        if (!PublicResolver.FUNC_CONTENT.equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C5454m.C5455a mo39455f(C5450k kVar, int i) throws IOException {
        boolean z;
        Bitmap bitmap;
        int i2;
        C5450k kVar2 = kVar;
        ContentResolver contentResolver = this.f26856a.getContentResolver();
        int k = m41708k(contentResolver, kVar2.f26891d);
        String type = contentResolver.getType(kVar2.f26891d);
        if (type == null || !type.startsWith("video/")) {
            z = false;
        } else {
            z = true;
        }
        if (kVar.mo39568c()) {
            PicassoKind l = m41709l(kVar2.f26895h, kVar2.f26896i);
            if (!z && l == PicassoKind.FULL) {
                return new C5454m.C5455a((Bitmap) null, sg4.m71937l(mo39528j(kVar)), Picasso.LoadedFrom.DISK, k);
            }
            long parseId = ContentUris.parseId(kVar2.f26891d);
            BitmapFactory.Options d = C5454m.m41857d(kVar);
            d.inJustDecodeBounds = true;
            BitmapFactory.Options options = d;
            C5454m.m41855a(kVar2.f26895h, kVar2.f26896i, l.width, l.height, d, kVar);
            if (z) {
                if (l == PicassoKind.FULL) {
                    i2 = 1;
                } else {
                    i2 = l.androidKind;
                }
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i2, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l.androidKind, options);
            }
            if (bitmap != null) {
                return new C5454m.C5455a(bitmap, (z56) null, Picasso.LoadedFrom.DISK, k);
            }
        }
        return new C5454m.C5455a((Bitmap) null, sg4.m71937l(mo39528j(kVar)), Picasso.LoadedFrom.DISK, k);
    }
}
