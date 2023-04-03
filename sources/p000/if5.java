package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;

/* renamed from: if5 */
/* compiled from: ResourceDrawableDecoder */
public class if5 implements gf5<Uri, Drawable> {

    /* renamed from: a */
    public final Context f13260a;

    public if5(Context context) {
        this.f13260a = context.getApplicationContext();
    }

    /* renamed from: c */
    public bf5<Drawable> mo415b(Uri uri, int i, int i2, xi4 xi4) {
        Context d = mo21520d(uri, uri.getAuthority());
        return m84.m22091e(kj1.m20751b(this.f13260a, d, mo21523g(d, uri)));
    }

    /* renamed from: d */
    public final Context mo21520d(Uri uri, String str) {
        if (str.equals(this.f13260a.getPackageName())) {
            return this.f13260a;
        }
        try {
            return this.f13260a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f13260a.getPackageName())) {
                return this.f13260a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    public final int mo21521e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    public final int mo21522f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    public final int mo21523g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return mo21522f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return mo21521e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: h */
    public boolean mo414a(Uri uri, xi4 xi4) {
        return uri.getScheme().equals("android.resource");
    }
}
