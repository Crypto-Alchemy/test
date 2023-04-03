package zendesk.belvedere;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C9833i;
import zendesk.belvedere.MediaIntent;

/* renamed from: zendesk.belvedere.a */
/* compiled from: Belvedere */
public class C9800a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    public static C9800a f46682e;

    /* renamed from: a */
    public final Context f46683a;

    /* renamed from: b */
    public aa6 f46684b;

    /* renamed from: c */
    public ix2 f46685c = new ix2();

    /* renamed from: d */
    public wr3 f46686d;

    /* renamed from: zendesk.belvedere.a$a */
    /* compiled from: Belvedere */
    public static class C9801a {

        /* renamed from: a */
        public Context f46687a;

        /* renamed from: b */
        public C9833i.C9835b f46688b = new C9833i.C9834a();

        /* renamed from: c */
        public boolean f46689c = false;

        public C9801a(Context context) {
            this.f46687a = context.getApplicationContext();
        }

        /* renamed from: a */
        public C9800a mo73730a() {
            return new C9800a(this);
        }
    }

    public C9800a(C9801a aVar) {
        Context context = aVar.f46687a;
        this.f46683a = context;
        aVar.f46688b.mo73804e(aVar.f46689c);
        C9833i.m75554d(aVar.f46688b);
        aa6 aa6 = new aa6();
        this.f46684b = aa6;
        this.f46686d = new wr3(context, aa6, this.f46685c);
        C9833i.m75551a("Belvedere", "Belvedere initialized");
    }

    /* renamed from: c */
    public static C9800a m75438c(Context context) {
        synchronized (C9800a.class) {
            if (f46682e == null) {
                if (context == null || context.getApplicationContext() == null) {
                    throw new IllegalArgumentException("Invalid context provided");
                }
                f46682e = new C9801a(context.getApplicationContext()).mo73730a();
            }
        }
        return f46682e;
    }

    /* renamed from: a */
    public MediaIntent.C9794b mo73723a() {
        return new MediaIntent.C9794b(this.f46685c.mo67422d(), this.f46686d, this.f46685c);
    }

    /* renamed from: b */
    public MediaIntent.C9795c mo73724b() {
        return new MediaIntent.C9795c(this.f46685c.mo67422d(), this.f46686d);
    }

    /* renamed from: d */
    public MediaResult mo73725d(String str, String str2) {
        Uri i;
        long j;
        long j2;
        File d = this.f46684b.mo67409d(this.f46683a, str, str2);
        C9833i.m75551a("Belvedere", String.format(Locale.US, "Get internal File: %s", new Object[]{d}));
        if (d == null || (i = this.f46684b.mo67413i(this.f46683a, d)) == null) {
            return null;
        }
        MediaResult j3 = aa6.m75257j(this.f46683a, i);
        if (j3.mo73699g().contains("image")) {
            Pair<Integer, Integer> a = c30.m75268a(d);
            j = (long) ((Integer) a.second).intValue();
            j2 = (long) ((Integer) a.first).intValue();
        } else {
            j2 = -1;
            j = -1;
        }
        return new MediaResult(d, i, i, str2, j3.mo73699g(), j3.mo73703l(), j2, j);
    }

    /* renamed from: e */
    public void mo73726e(int i, int i2, Intent intent, n90<List<MediaResult>> n90, boolean z) {
        this.f46686d.mo73605e(this.f46683a, i, i2, intent, n90, z);
    }

    /* renamed from: f */
    public Intent mo73727f(Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(str)) {
            intent.setDataAndType(uri, str);
        }
        mo73728g(intent, uri);
        return intent;
    }

    /* renamed from: g */
    public void mo73728g(Intent intent, Uri uri) {
        C9833i.m75551a("Belvedere", String.format(Locale.US, "Grant Permission - Intent: %s - Uri: %s", new Object[]{intent, uri}));
        this.f46684b.mo67415l(this.f46683a, intent, uri, 3);
    }

    /* renamed from: h */
    public void mo73729h(List<Uri> list, String str, n90<List<MediaResult>> n90) {
        if (list == null || list.size() <= 0) {
            n90.internalSuccess(new ArrayList(0));
        } else {
            ze5.m75338d(this.f46683a, this.f46684b, n90, list, str);
        }
    }
}
