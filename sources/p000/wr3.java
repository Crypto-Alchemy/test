package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C9833i;
import zendesk.belvedere.MediaIntent;
import zendesk.belvedere.MediaResult;

/* renamed from: wr3 */
/* compiled from: MediaSource */
public class wr3 {

    /* renamed from: a */
    public final aa6 f46589a;

    /* renamed from: b */
    public final ix2 f46590b;

    /* renamed from: c */
    public final Context f46591c;

    public wr3(Context context, aa6 aa6, ix2 ix2) {
        this.f46591c = context;
        this.f46589a = aa6;
        this.f46590b = ix2;
    }

    /* renamed from: a */
    public final boolean mo73601a(Context context) {
        return mo73607g(context);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final List<Uri> mo73602b(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (itemAt.getUri() != null) {
                    arrayList.add(itemAt.getUri());
                }
            }
        } else if (intent.getData() != null) {
            arrayList.add(intent.getData());
        }
        return arrayList;
    }

    /* renamed from: c */
    public jl4<MediaIntent, MediaResult> mo73603c(int i) {
        if (mo73601a(this.f46591c)) {
            return mo73610j(this.f46591c, i);
        }
        return new jl4<>(MediaIntent.m75406e(), null);
    }

    @TargetApi(19)
    /* renamed from: d */
    public final Intent mo73604d(String str, boolean z, List<String> list) {
        C9833i.m75551a("Belvedere", "Gallery Intent, using 'ACTION_OPEN_DOCUMENT'");
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType(str);
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        if (list != null && !list.isEmpty()) {
            intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) list.toArray(new String[0]));
        }
        return intent;
    }

    /* renamed from: e */
    public void mo73605e(Context context, int i, int i2, Intent intent, n90<List<MediaResult>> n90, boolean z) {
        boolean z2;
        boolean z3;
        Context context2 = context;
        int i3 = i;
        int i4 = i2;
        n90<List<MediaResult>> n902 = n90;
        ArrayList arrayList = new ArrayList();
        MediaResult b = this.f46590b.mo67420b(i3);
        if (b != null) {
            if (b.mo73696e() == null || b.mo73704m() == null) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                if (i4 == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objArr[0] = Boolean.valueOf(z2);
                C9833i.m75551a("Belvedere", String.format(locale, "Parsing activity result - Gallery - Ok: %s", objArr));
                if (i4 == -1) {
                    List<Uri> b2 = mo73602b(intent);
                    C9833i.m75551a("Belvedere", String.format(locale, "Number of items received from gallery: %s", new Object[]{Integer.valueOf(b2.size())}));
                    if (z) {
                        C9833i.m75551a("Belvedere", "Resolving items");
                        ze5.m75337c(context2, this.f46589a, n902, b2);
                        return;
                    }
                    C9833i.m75551a("Belvedere", "Resolving items turned off");
                    for (Uri j : b2) {
                        arrayList.add(aa6.m75257j(context2, j));
                    }
                }
            } else {
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[1];
                if (i4 == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objArr2[0] = Boolean.valueOf(z3);
                C9833i.m75551a("Belvedere", String.format(locale2, "Parsing activity result - Camera - Ok: %s", objArr2));
                this.f46589a.mo67416m(context2, b.mo73704m(), 3);
                if (i4 == -1) {
                    MediaResult j2 = aa6.m75257j(context2, b.mo73704m());
                    arrayList.add(new MediaResult(b.mo73696e(), b.mo73704m(), b.mo73702i(), b.mo73700h(), j2.mo73699g(), j2.mo73703l(), j2.mo73705o(), j2.mo73698f()));
                    C9833i.m75551a("Belvedere", String.format(locale2, "Image from camera: %s", new Object[]{b.mo73696e()}));
                }
                this.f46590b.mo67419a(i3);
            }
        }
        if (n902 != null) {
            n902.internalSuccess(arrayList);
        }
    }

    /* renamed from: f */
    public MediaIntent mo73606f(int i, String str, boolean z, List<String> list) {
        if (!mo73608h(this.f46591c)) {
            return MediaIntent.m75406e();
        }
        return new MediaIntent(i, mo73604d(str, z, list), (String) null, true, 1);
    }

    /* renamed from: g */
    public final boolean mo73607g(Context context) {
        boolean z;
        Intent intent = new Intent();
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front")) {
            z = true;
        } else {
            z = false;
        }
        boolean i = mo73609i(intent, context);
        C9833i.m75551a("Belvedere", String.format(Locale.US, "Camera present: %b, Camera App present: %b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(i)}));
        if (!z || !i) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo73608h(Context context) {
        return mo73609i(mo73604d("*/*", false, new ArrayList()), context);
    }

    /* renamed from: i */
    public final boolean mo73609i(Intent intent, Context context) {
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final jl4<MediaIntent, MediaResult> mo73610j(Context context, int i) {
        boolean z;
        String str;
        Context context2 = context;
        File e = this.f46589a.mo67410e(context2);
        if (e == null) {
            C9833i.m75555e("Belvedere", "Camera Intent: Image path is null. There's something wrong with the storage.");
            return null;
        }
        Uri i2 = this.f46589a.mo67413i(context2, e);
        if (i2 == null) {
            C9833i.m75555e("Belvedere", "Camera Intent: Uri to file is null. There's something wrong with the storage or FileProvider configuration.");
            return null;
        }
        C9833i.m75551a("Belvedere", String.format(Locale.US, "Camera Intent: Request Id: %s - File: %s - Uri: %s", new Object[]{Integer.valueOf(i), e, i2}));
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", i2);
        this.f46589a.mo67415l(context2, intent, i2, 3);
        if (!ln4.m75282a(context2, "android.permission.CAMERA") || ln4.m75283b(context2, "android.permission.CAMERA")) {
            z = false;
        } else {
            z = true;
        }
        MediaResult j = aa6.m75257j(context2, i2);
        String name = e.getName();
        String g = j.mo73699g();
        long l = j.mo73703l();
        long o = j.mo73705o();
        long f = j.mo73698f();
        String str2 = "android.permission.CAMERA";
        MediaResult mediaResult = r3;
        MediaResult mediaResult2 = new MediaResult(e, i2, i2, name, g, l, o, f);
        if (z) {
            str = str2;
        } else {
            str = null;
        }
        return new jl4<>(new MediaIntent(i, intent, str, true, 2), mediaResult);
    }
}
