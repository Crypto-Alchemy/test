package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets$Type;
import android.view.WindowMetrics;
import androidx.core.content.FileProvider;
import java.io.File;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.p019io.FilesKt__UtilsKt;
import p000.hl7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a-\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a.\u0010\n\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u001a#\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0014\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"Landroid/app/Activity;", "Ljava/io/File;", "file", "", "fileName", "d", "(Landroid/app/Activity;Ljava/io/File;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "text", "mimeType", "Lr37;", "e", "url", "Ljava/net/URLConnection;", "a", "(Landroid/app/Activity;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "b", "(Landroid/app/Activity;)I", "windowHeight", "c", "windowWidth", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ja */
/* compiled from: Activity.kt */
public final class C7258ja {
    /* renamed from: a */
    public static final Object m59315a(Activity activity, String str, ns0<? super URLConnection> ns0) {
        if (str == null) {
            return null;
        }
        try {
            return new URL(str).openConnection();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final int m59316b(Activity activity) {
        int i;
        int i2;
        vx2.m53591g(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics a = activity.getWindowManager().getCurrentWindowMetrics();
            vx2.m53590f(a, "windowManager.currentWindowMetrics");
            Insets a2 = a.getWindowInsets().getInsets(WindowInsets$Type.systemBars());
            vx2.m53590f(a2, "metrics.windowInsets.get…Insets.Type.systemBars())");
            i = a.getBounds().height() - a2.bottom;
            i2 = a2.top;
        } else {
            View decorView = activity.getWindow().getDecorView();
            vx2.m53590f(decorView, "window.decorView");
            qv2 f = hl7.m18976y(decorView.getRootWindowInsets(), decorView).mo21232f(hl7.C2492m.m19068b());
            vx2.m53590f(f, "toWindowInsetsCompat(vie…Compat.Type.systemBars())");
            i = activity.getResources().getDisplayMetrics().heightPixels - f.f17077d;
            i2 = f.f17075b;
        }
        return i - i2;
    }

    /* renamed from: c */
    public static final int m59317c(Activity activity) {
        int i;
        int i2;
        vx2.m53591g(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics a = activity.getWindowManager().getCurrentWindowMetrics();
            vx2.m53590f(a, "windowManager.currentWindowMetrics");
            Insets a2 = a.getWindowInsets().getInsets(WindowInsets$Type.systemBars());
            vx2.m53590f(a2, "metrics.windowInsets.get…Insets.Type.systemBars())");
            i = a.getBounds().width() - a2.left;
            i2 = a2.right;
        } else {
            View decorView = activity.getWindow().getDecorView();
            vx2.m53590f(decorView, "window.decorView");
            qv2 f = hl7.m18976y(decorView.getRootWindowInsets(), decorView).mo21232f(hl7.C2492m.m19068b());
            vx2.m53590f(f, "toWindowInsetsCompat(vie…Compat.Type.systemBars())");
            i = activity.getResources().getDisplayMetrics().widthPixels - f.f17074a;
            i2 = f.f17076c;
        }
        return i - i2;
    }

    /* renamed from: d */
    public static final Object m59318d(Activity activity, File file, String str, ns0<? super File> ns0) {
        File file2 = new File(activity.getCacheDir(), str);
        if (!file2.exists() && !FilesKt__UtilsKt.m47428g(file, file2, true, (fd2) null, 4, (Object) null)) {
            return null;
        }
        return file2;
    }

    /* renamed from: e */
    public static final void m59319e(Activity activity, File file, String str, String str2) {
        vx2.m53591g(activity, "<this>");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setFlags(1);
        if (str2 != null) {
            intent.setType(str2);
        }
        if (str != null) {
            if (file == null && str2 == null) {
                intent.setType("text/plain");
            }
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (file != null) {
            String packageName = activity.getPackageName();
            intent.putExtra("android.intent.extra.STREAM", FileProvider.m4306f(activity, packageName + ".provider", file));
        }
        activity.startActivity(intent);
    }
}
