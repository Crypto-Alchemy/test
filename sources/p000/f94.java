package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f94 */
/* compiled from: NotificationCompat */
public class f94 {

    /* renamed from: f94$a */
    /* compiled from: NotificationCompat */
    public static class C2270a {

        /* renamed from: a */
        public final Bundle f11585a;

        /* renamed from: b */
        public IconCompat f11586b;

        /* renamed from: c */
        public final sc5[] f11587c;

        /* renamed from: d */
        public final sc5[] f11588d;

        /* renamed from: e */
        public boolean f11589e;

        /* renamed from: f */
        public boolean f11590f;

        /* renamed from: g */
        public final int f11591g;

        /* renamed from: h */
        public final boolean f11592h;
        @Deprecated

        /* renamed from: i */
        public int f11593i;

        /* renamed from: j */
        public CharSequence f11594j;

        /* renamed from: k */
        public PendingIntent f11595k;

        /* renamed from: l */
        public boolean f11596l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C2270a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m4324h((Resources) null, "", i) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent mo19765a() {
            return this.f11595k;
        }

        /* renamed from: b */
        public boolean mo19766b() {
            return this.f11589e;
        }

        /* renamed from: c */
        public Bundle mo19767c() {
            return this.f11585a;
        }

        /* renamed from: d */
        public IconCompat mo19768d() {
            int i;
            if (this.f11586b == null && (i = this.f11593i) != 0) {
                this.f11586b = IconCompat.m4324h((Resources) null, "", i);
            }
            return this.f11586b;
        }

        /* renamed from: e */
        public sc5[] mo19769e() {
            return this.f11587c;
        }

        /* renamed from: f */
        public int mo19770f() {
            return this.f11591g;
        }

        /* renamed from: g */
        public boolean mo19771g() {
            return this.f11590f;
        }

        /* renamed from: h */
        public CharSequence mo19772h() {
            return this.f11594j;
        }

        /* renamed from: i */
        public boolean mo19773i() {
            return this.f11596l;
        }

        /* renamed from: j */
        public boolean mo19774j() {
            return this.f11592h;
        }

        public C2270a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (sc5[]) null, (sc5[]) null, true, 0, true, false, false);
        }

        public C2270a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, sc5[] sc5Arr, sc5[] sc5Arr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f11590f = true;
            this.f11586b = iconCompat;
            if (iconCompat != null && iconCompat.mo5362l() == 2) {
                this.f11593i = iconCompat.mo5360j();
            }
            this.f11594j = C2277e.m16701e(charSequence);
            this.f11595k = pendingIntent;
            this.f11585a = bundle == null ? new Bundle() : bundle;
            this.f11587c = sc5Arr;
            this.f11588d = sc5Arr2;
            this.f11589e = z;
            this.f11591g = i;
            this.f11590f = z2;
            this.f11592h = z3;
            this.f11596l = z4;
        }
    }

    /* renamed from: f94$b */
    /* compiled from: NotificationCompat */
    public static class C2271b extends C2280h {

        /* renamed from: e */
        public IconCompat f11597e;

        /* renamed from: f */
        public IconCompat f11598f;

        /* renamed from: g */
        public boolean f11599g;

        /* renamed from: h */
        public CharSequence f11600h;

        /* renamed from: i */
        public boolean f11601i;

        /* renamed from: f94$b$a */
        /* compiled from: NotificationCompat */
        public static class C2272a {
            /* renamed from: a */
            public static void m16690a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            public static void m16691b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: f94$b$b */
        /* compiled from: NotificationCompat */
        public static class C2273b {
            /* renamed from: a */
            public static void m16692a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: f94$b$c */
        /* compiled from: NotificationCompat */
        public static class C2274c {
            /* renamed from: a */
            public static void m16693a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                h94.m18738a(bigPictureStyle, icon);
            }

            /* renamed from: b */
            public static void m16694b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                i94.m19523a(bigPictureStyle, charSequence);
            }

            /* renamed from: c */
            public static void m16695c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                g94.m17691a(bigPictureStyle, z);
            }
        }

        /* renamed from: b */
        public void mo19775b(b94 b94) {
            Context context;
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(b94.mo11450a()).setBigContentTitle(this.f11652b);
            IconCompat iconCompat = this.f11597e;
            Context context2 = null;
            if (iconCompat != null) {
                if (i >= 31) {
                    if (b94 instanceof ba4) {
                        context = ((ba4) b94).mo11466f();
                    } else {
                        context = null;
                    }
                    C2274c.m16693a(bigContentTitle, this.f11597e.mo5368r(context));
                } else if (iconCompat.mo5362l() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f11597e.mo5359i());
                }
            }
            if (this.f11599g) {
                if (this.f11598f == null) {
                    C2272a.m16690a(bigContentTitle, (Bitmap) null);
                } else {
                    if (b94 instanceof ba4) {
                        context2 = ((ba4) b94).mo11466f();
                    }
                    C2273b.m16692a(bigContentTitle, this.f11598f.mo5368r(context2));
                }
            }
            if (this.f11654d) {
                C2272a.m16691b(bigContentTitle, this.f11653c);
            }
            if (i >= 31) {
                C2274c.m16695c(bigContentTitle, this.f11601i);
                C2274c.m16694b(bigContentTitle, this.f11600h);
            }
        }

        /* renamed from: c */
        public String mo19776c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public C2271b mo19777h(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.m4321e(bitmap);
            }
            this.f11598f = iconCompat;
            this.f11599g = true;
            return this;
        }

        /* renamed from: i */
        public C2271b mo19778i(Bitmap bitmap) {
            IconCompat iconCompat;
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.m4321e(bitmap);
            }
            this.f11597e = iconCompat;
            return this;
        }

        /* renamed from: j */
        public C2271b mo19779j(CharSequence charSequence) {
            this.f11653c = C2277e.m16701e(charSequence);
            this.f11654d = true;
            return this;
        }
    }

    /* renamed from: f94$c */
    /* compiled from: NotificationCompat */
    public static class C2275c extends C2280h {

        /* renamed from: e */
        public CharSequence f11602e;

        /* renamed from: a */
        public void mo19780a(Bundle bundle) {
            super.mo19780a(bundle);
        }

        /* renamed from: b */
        public void mo19775b(b94 b94) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(b94.mo11450a()).setBigContentTitle(this.f11652b).bigText(this.f11602e);
            if (this.f11654d) {
                bigText.setSummaryText(this.f11653c);
            }
        }

        /* renamed from: c */
        public String mo19776c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public C2275c mo19781h(CharSequence charSequence) {
            this.f11602e = C2277e.m16701e(charSequence);
            return this;
        }
    }

    /* renamed from: f94$d */
    /* compiled from: NotificationCompat */
    public static final class C2276d {
        /* renamed from: a */
        public static Notification.BubbleMetadata m16700a(C2276d dVar) {
            return null;
        }
    }

    /* renamed from: f94$f */
    /* compiled from: NotificationCompat */
    public interface C2278f {
        /* renamed from: a */
        C2277e mo19814a(C2277e eVar);
    }

    /* renamed from: f94$g */
    /* compiled from: NotificationCompat */
    public static class C2279g extends C2280h {

        /* renamed from: e */
        public ArrayList<CharSequence> f11650e = new ArrayList<>();

        /* renamed from: b */
        public void mo19775b(b94 b94) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(b94.mo11450a()).setBigContentTitle(this.f11652b);
            if (this.f11654d) {
                bigContentTitle.setSummaryText(this.f11653c);
            }
            Iterator<CharSequence> it = this.f11650e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        /* renamed from: c */
        public String mo19776c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* renamed from: h */
        public C2279g mo19815h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f11650e.add(C2277e.m16701e(charSequence));
            }
            return this;
        }

        /* renamed from: i */
        public C2279g mo19816i(CharSequence charSequence) {
            this.f11652b = C2277e.m16701e(charSequence);
            return this;
        }
    }

    /* renamed from: f94$h */
    /* compiled from: NotificationCompat */
    public static abstract class C2280h {

        /* renamed from: a */
        public C2277e f11651a;

        /* renamed from: b */
        public CharSequence f11652b;

        /* renamed from: c */
        public CharSequence f11653c;

        /* renamed from: d */
        public boolean f11654d = false;

        /* renamed from: a */
        public void mo19780a(Bundle bundle) {
            if (this.f11654d) {
                bundle.putCharSequence("android.summaryText", this.f11653c);
            }
            CharSequence charSequence = this.f11652b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = mo19776c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        /* renamed from: b */
        public abstract void mo19775b(b94 b94);

        /* renamed from: c */
        public abstract String mo19776c();

        /* renamed from: d */
        public RemoteViews mo19817d(b94 b94) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews mo19818e(b94 b94) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews mo19819f(b94 b94) {
            return null;
        }

        /* renamed from: g */
        public void mo19820g(C2277e eVar) {
            if (this.f11651a != eVar) {
                this.f11651a = eVar;
                if (eVar != null) {
                    eVar.mo19784C(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m16673a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: b */
    public static boolean m16674b(Notification notification) {
        if ((notification.flags & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f94$e */
    /* compiled from: NotificationCompat */
    public static class C2277e {

        /* renamed from: A */
        public boolean f11603A;

        /* renamed from: B */
        public boolean f11604B;

        /* renamed from: C */
        public String f11605C;

        /* renamed from: D */
        public Bundle f11606D;

        /* renamed from: E */
        public int f11607E;

        /* renamed from: F */
        public int f11608F;

        /* renamed from: G */
        public Notification f11609G;

        /* renamed from: H */
        public RemoteViews f11610H;

        /* renamed from: I */
        public RemoteViews f11611I;

        /* renamed from: J */
        public RemoteViews f11612J;

        /* renamed from: K */
        public String f11613K;

        /* renamed from: L */
        public int f11614L;

        /* renamed from: M */
        public String f11615M;

        /* renamed from: N */
        public long f11616N;

        /* renamed from: O */
        public int f11617O;

        /* renamed from: P */
        public int f11618P;

        /* renamed from: Q */
        public boolean f11619Q;

        /* renamed from: R */
        public Notification f11620R;

        /* renamed from: S */
        public boolean f11621S;

        /* renamed from: T */
        public Icon f11622T;
        @Deprecated

        /* renamed from: U */
        public ArrayList<String> f11623U;

        /* renamed from: a */
        public Context f11624a;

        /* renamed from: b */
        public ArrayList<C2270a> f11625b;

        /* renamed from: c */
        public ArrayList<io4> f11626c;

        /* renamed from: d */
        public ArrayList<C2270a> f11627d;

        /* renamed from: e */
        public CharSequence f11628e;

        /* renamed from: f */
        public CharSequence f11629f;

        /* renamed from: g */
        public PendingIntent f11630g;

        /* renamed from: h */
        public PendingIntent f11631h;

        /* renamed from: i */
        public RemoteViews f11632i;

        /* renamed from: j */
        public Bitmap f11633j;

        /* renamed from: k */
        public CharSequence f11634k;

        /* renamed from: l */
        public int f11635l;

        /* renamed from: m */
        public int f11636m;

        /* renamed from: n */
        public boolean f11637n;

        /* renamed from: o */
        public boolean f11638o;

        /* renamed from: p */
        public C2280h f11639p;

        /* renamed from: q */
        public CharSequence f11640q;

        /* renamed from: r */
        public CharSequence f11641r;

        /* renamed from: s */
        public CharSequence[] f11642s;

        /* renamed from: t */
        public int f11643t;

        /* renamed from: u */
        public int f11644u;

        /* renamed from: v */
        public boolean f11645v;

        /* renamed from: w */
        public String f11646w;

        /* renamed from: x */
        public boolean f11647x;

        /* renamed from: y */
        public String f11648y;

        /* renamed from: z */
        public boolean f11649z;

        public C2277e(Context context, String str) {
            this.f11625b = new ArrayList<>();
            this.f11626c = new ArrayList<>();
            this.f11627d = new ArrayList<>();
            this.f11637n = true;
            this.f11649z = false;
            this.f11607E = 0;
            this.f11608F = 0;
            this.f11614L = 0;
            this.f11617O = 0;
            this.f11618P = 0;
            Notification notification = new Notification();
            this.f11620R = notification;
            this.f11624a = context;
            this.f11613K = str;
            notification.when = System.currentTimeMillis();
            this.f11620R.audioStreamType = -1;
            this.f11636m = 0;
            this.f11623U = new ArrayList<>();
            this.f11619Q = true;
        }

        /* renamed from: e */
        public static CharSequence m16701e(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: A */
        public C2277e mo19782A(int i) {
            this.f11620R.icon = i;
            return this;
        }

        /* renamed from: B */
        public C2277e mo19783B(Uri uri) {
            Notification notification = this.f11620R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        /* renamed from: C */
        public C2277e mo19784C(C2280h hVar) {
            if (this.f11639p != hVar) {
                this.f11639p = hVar;
                if (hVar != null) {
                    hVar.mo19820g(this);
                }
            }
            return this;
        }

        /* renamed from: D */
        public C2277e mo19785D(CharSequence charSequence) {
            this.f11620R.tickerText = m16701e(charSequence);
            return this;
        }

        /* renamed from: E */
        public C2277e mo19786E(long[] jArr) {
            this.f11620R.vibrate = jArr;
            return this;
        }

        /* renamed from: F */
        public C2277e mo19787F(int i) {
            this.f11608F = i;
            return this;
        }

        /* renamed from: G */
        public C2277e mo19788G(long j) {
            this.f11620R.when = j;
            return this;
        }

        /* renamed from: a */
        public C2277e mo19789a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f11625b.add(new C2270a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public Notification mo19790b() {
            return new ba4(this).mo11464c();
        }

        /* renamed from: c */
        public C2277e mo19791c(C2278f fVar) {
            fVar.mo19814a(this);
            return this;
        }

        /* renamed from: d */
        public Bundle mo19792d() {
            if (this.f11606D == null) {
                this.f11606D = new Bundle();
            }
            return this.f11606D;
        }

        /* renamed from: f */
        public final Bitmap mo19793f(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f11624a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(f25.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(f25.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        /* renamed from: g */
        public C2277e mo19794g(boolean z) {
            mo19803p(16, z);
            return this;
        }

        /* renamed from: h */
        public C2277e mo19795h(String str) {
            this.f11613K = str;
            return this;
        }

        /* renamed from: i */
        public C2277e mo19796i(int i) {
            this.f11607E = i;
            return this;
        }

        /* renamed from: j */
        public C2277e mo19797j(RemoteViews remoteViews) {
            this.f11620R.contentView = remoteViews;
            return this;
        }

        /* renamed from: k */
        public C2277e mo19798k(PendingIntent pendingIntent) {
            this.f11630g = pendingIntent;
            return this;
        }

        /* renamed from: l */
        public C2277e mo19799l(CharSequence charSequence) {
            this.f11629f = m16701e(charSequence);
            return this;
        }

        /* renamed from: m */
        public C2277e mo19800m(CharSequence charSequence) {
            this.f11628e = m16701e(charSequence);
            return this;
        }

        /* renamed from: n */
        public C2277e mo19801n(int i) {
            Notification notification = this.f11620R;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: o */
        public C2277e mo19802o(PendingIntent pendingIntent) {
            this.f11620R.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: p */
        public final void mo19803p(int i, boolean z) {
            if (z) {
                Notification notification = this.f11620R;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f11620R;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: q */
        public C2277e mo19804q(String str) {
            this.f11646w = str;
            return this;
        }

        /* renamed from: r */
        public C2277e mo19805r(int i) {
            this.f11617O = i;
            return this;
        }

        /* renamed from: s */
        public C2277e mo19806s(boolean z) {
            this.f11647x = z;
            return this;
        }

        /* renamed from: t */
        public C2277e mo19807t(Bitmap bitmap) {
            this.f11633j = mo19793f(bitmap);
            return this;
        }

        /* renamed from: u */
        public C2277e mo19808u(int i, int i2, int i3) {
            int i4;
            Notification notification = this.f11620R;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            if (i2 == 0 || i3 == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }

        /* renamed from: v */
        public C2277e mo19809v(boolean z) {
            this.f11649z = z;
            return this;
        }

        /* renamed from: w */
        public C2277e mo19810w(int i) {
            this.f11635l = i;
            return this;
        }

        /* renamed from: x */
        public C2277e mo19811x(boolean z) {
            mo19803p(8, z);
            return this;
        }

        /* renamed from: y */
        public C2277e mo19812y(int i) {
            this.f11636m = i;
            return this;
        }

        /* renamed from: z */
        public C2277e mo19813z(boolean z) {
            this.f11637n = z;
            return this;
        }

        @Deprecated
        public C2277e(Context context) {
            this(context, (String) null);
        }
    }
}
