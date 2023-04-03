package p000;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: vu2 */
/* compiled from: InputContentInfoCompat */
public final class vu2 {

    /* renamed from: a */
    public final C3510c f18896a;

    /* renamed from: vu2$b */
    /* compiled from: InputContentInfoCompat */
    public static final class C3509b implements C3510c {

        /* renamed from: a */
        public final Uri f18898a;

        /* renamed from: b */
        public final ClipDescription f18899b;

        /* renamed from: c */
        public final Uri f18900c;

        public C3509b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f18898a = uri;
            this.f18899b = clipDescription;
            this.f18900c = uri2;
        }

        /* renamed from: a */
        public Object mo27333a() {
            return null;
        }

        /* renamed from: b */
        public Uri mo27334b() {
            return this.f18898a;
        }

        /* renamed from: c */
        public void mo27335c() {
        }

        /* renamed from: d */
        public Uri mo27336d() {
            return this.f18900c;
        }

        public ClipDescription getDescription() {
            return this.f18899b;
        }
    }

    /* renamed from: vu2$c */
    /* compiled from: InputContentInfoCompat */
    public interface C3510c {
        /* renamed from: a */
        Object mo27333a();

        /* renamed from: b */
        Uri mo27334b();

        /* renamed from: c */
        void mo27335c();

        /* renamed from: d */
        Uri mo27336d();

        ClipDescription getDescription();
    }

    public vu2(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f18896a = new C3508a(uri, clipDescription, uri2);
        } else {
            this.f18896a = new C3509b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: f */
    public static vu2 m29109f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new vu2(new C3508a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri mo27328a() {
        return this.f18896a.mo27334b();
    }

    /* renamed from: b */
    public ClipDescription mo27329b() {
        return this.f18896a.getDescription();
    }

    /* renamed from: c */
    public Uri mo27330c() {
        return this.f18896a.mo27336d();
    }

    /* renamed from: d */
    public void mo27331d() {
        this.f18896a.mo27335c();
    }

    /* renamed from: e */
    public Object mo27332e() {
        return this.f18896a.mo27333a();
    }

    /* renamed from: vu2$a */
    /* compiled from: InputContentInfoCompat */
    public static final class C3508a implements C3510c {

        /* renamed from: a */
        public final InputContentInfo f18897a;

        public C3508a(Object obj) {
            this.f18897a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public Object mo27333a() {
            return this.f18897a;
        }

        /* renamed from: b */
        public Uri mo27334b() {
            return this.f18897a.getContentUri();
        }

        /* renamed from: c */
        public void mo27335c() {
            this.f18897a.requestPermission();
        }

        /* renamed from: d */
        public Uri mo27336d() {
            return this.f18897a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.f18897a.getDescription();
        }

        public C3508a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f18897a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public vu2(C3510c cVar) {
        this.f18896a = cVar;
    }
}
