package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: rr0 */
/* compiled from: ContentInfoCompat */
public final class rr0 {

    /* renamed from: a */
    public final C3221f f17337a;

    /* renamed from: rr0$a */
    /* compiled from: ContentInfoCompat */
    public static final class C3216a {

        /* renamed from: a */
        public final C3218c f17338a;

        public C3216a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f17338a = new C3217b(clipData, i);
            } else {
                this.f17338a = new C3219d(clipData, i);
            }
        }

        /* renamed from: a */
        public rr0 mo25506a() {
            return this.f17338a.build();
        }

        /* renamed from: b */
        public C3216a mo25507b(Bundle bundle) {
            this.f17338a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public C3216a mo25508c(int i) {
            this.f17338a.mo25511b(i);
            return this;
        }

        /* renamed from: d */
        public C3216a mo25509d(Uri uri) {
            this.f17338a.mo25510a(uri);
            return this;
        }
    }

    /* renamed from: rr0$b */
    /* compiled from: ContentInfoCompat */
    public static final class C3217b implements C3218c {

        /* renamed from: a */
        public final ContentInfo.Builder f17339a;

        public C3217b(ClipData clipData, int i) {
            this.f17339a = new ContentInfo.Builder(clipData, i);
        }

        /* renamed from: a */
        public void mo25510a(Uri uri) {
            this.f17339a.setLinkUri(uri);
        }

        /* renamed from: b */
        public void mo25511b(int i) {
            this.f17339a.setFlags(i);
        }

        public rr0 build() {
            return new rr0(new C3220e(this.f17339a.build()));
        }

        public void setExtras(Bundle bundle) {
            this.f17339a.setExtras(bundle);
        }
    }

    /* renamed from: rr0$c */
    /* compiled from: ContentInfoCompat */
    public interface C3218c {
        /* renamed from: a */
        void mo25510a(Uri uri);

        /* renamed from: b */
        void mo25511b(int i);

        rr0 build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: rr0$d */
    /* compiled from: ContentInfoCompat */
    public static final class C3219d implements C3218c {

        /* renamed from: a */
        public ClipData f17340a;

        /* renamed from: b */
        public int f17341b;

        /* renamed from: c */
        public int f17342c;

        /* renamed from: d */
        public Uri f17343d;

        /* renamed from: e */
        public Bundle f17344e;

        public C3219d(ClipData clipData, int i) {
            this.f17340a = clipData;
            this.f17341b = i;
        }

        /* renamed from: a */
        public void mo25510a(Uri uri) {
            this.f17343d = uri;
        }

        /* renamed from: b */
        public void mo25511b(int i) {
            this.f17342c = i;
        }

        public rr0 build() {
            return new rr0(new C3222g(this));
        }

        public void setExtras(Bundle bundle) {
            this.f17344e = bundle;
        }
    }

    /* renamed from: rr0$e */
    /* compiled from: ContentInfoCompat */
    public static final class C3220e implements C3221f {

        /* renamed from: a */
        public final ContentInfo f17345a;

        public C3220e(ContentInfo contentInfo) {
            this.f17345a = (ContentInfo) gu4.m18428f(contentInfo);
        }

        /* renamed from: a */
        public ContentInfo mo25514a() {
            return this.f17345a;
        }

        /* renamed from: b */
        public ClipData mo25515b() {
            return this.f17345a.getClip();
        }

        public int getFlags() {
            return this.f17345a.getFlags();
        }

        public int getSource() {
            return this.f17345a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f17345a + "}";
        }
    }

    /* renamed from: rr0$f */
    /* compiled from: ContentInfoCompat */
    public interface C3221f {
        /* renamed from: a */
        ContentInfo mo25514a();

        /* renamed from: b */
        ClipData mo25515b();

        int getFlags();

        int getSource();
    }

    /* renamed from: rr0$g */
    /* compiled from: ContentInfoCompat */
    public static final class C3222g implements C3221f {

        /* renamed from: a */
        public final ClipData f17346a;

        /* renamed from: b */
        public final int f17347b;

        /* renamed from: c */
        public final int f17348c;

        /* renamed from: d */
        public final Uri f17349d;

        /* renamed from: e */
        public final Bundle f17350e;

        public C3222g(C3219d dVar) {
            this.f17346a = (ClipData) gu4.m18428f(dVar.f17340a);
            this.f17347b = gu4.m18424b(dVar.f17341b, 0, 5, "source");
            this.f17348c = gu4.m18427e(dVar.f17342c, 1);
            this.f17349d = dVar.f17343d;
            this.f17350e = dVar.f17344e;
        }

        /* renamed from: a */
        public ContentInfo mo25514a() {
            return null;
        }

        /* renamed from: b */
        public ClipData mo25515b() {
            return this.f17346a;
        }

        public int getFlags() {
            return this.f17348c;
        }

        public int getSource() {
            return this.f17347b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f17346a.getDescription());
            sb.append(", source=");
            sb.append(rr0.m26388e(this.f17347b));
            sb.append(", flags=");
            sb.append(rr0.m26387a(this.f17348c));
            String str2 = "";
            if (this.f17349d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f17349d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f17350e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    public rr0(C3221f fVar) {
        this.f17337a = fVar;
    }

    /* renamed from: a */
    public static String m26387a(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    /* renamed from: e */
    public static String m26388e(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i == 4) {
            return "SOURCE_AUTOFILL";
        }
        if (i != 5) {
            return String.valueOf(i);
        }
        return "SOURCE_PROCESS_TEXT";
    }

    /* renamed from: g */
    public static rr0 m26389g(ContentInfo contentInfo) {
        return new rr0(new C3220e(contentInfo));
    }

    /* renamed from: b */
    public ClipData mo25501b() {
        return this.f17337a.mo25515b();
    }

    /* renamed from: c */
    public int mo25502c() {
        return this.f17337a.getFlags();
    }

    /* renamed from: d */
    public int mo25503d() {
        return this.f17337a.getSource();
    }

    /* renamed from: f */
    public ContentInfo mo25504f() {
        ContentInfo a = this.f17337a.mo25514a();
        Objects.requireNonNull(a);
        ContentInfo contentInfo = a;
        return a;
    }

    public String toString() {
        return this.f17337a.toString();
    }
}
