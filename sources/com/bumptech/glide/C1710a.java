package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C1712b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1740c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.C1761f;
import com.bumptech.glide.load.resource.bitmap.C1797a;
import com.bumptech.glide.load.resource.bitmap.C1804c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.C3164qr;
import p000.bz4;
import p000.dn2;
import p000.eb6;
import p000.gs3;
import p000.h57;
import p000.h60;
import p000.hs3;
import p000.i21;
import p000.js3;
import p000.n57;
import p000.oe5;
import p000.of5;
import p000.p57;
import p000.p60;
import p000.r60;
import p000.s02;
import p000.u37;

/* renamed from: com.bumptech.glide.a */
/* compiled from: Glide */
public class C1710a implements ComponentCallbacks2 {

    /* renamed from: C */
    public static volatile C1710a f8665C;

    /* renamed from: H */
    public static volatile boolean f8666H;

    /* renamed from: A */
    public final C1711a f8667A;

    /* renamed from: B */
    public MemoryCategory f8668B = MemoryCategory.NORMAL;

    /* renamed from: a */
    public final C1761f f8669a;

    /* renamed from: d */
    public final t20 f8670d;

    /* renamed from: e */
    public final xs3 f8671e;

    /* renamed from: g */
    public final C1718c f8672g;

    /* renamed from: k */
    public final Registry f8673k;

    /* renamed from: r */
    public final C2982oq f8674r;

    /* renamed from: s */
    public final oe5 f8675s;

    /* renamed from: x */
    public final wp0 f8676x;

    /* renamed from: y */
    public final List<me5> f8677y = new ArrayList();

    /* renamed from: com.bumptech.glide.a$a */
    /* compiled from: Glide */
    public interface C1711a {
        qe5 build();
    }

    public C1710a(Context context, C1761f fVar, xs3 xs3, t20 t20, C2982oq oqVar, oe5 oe5, wp0 wp0, int i, C1711a aVar, Map<Class<?>, yw6<?, ?>> map, List<le5<Object>> list, C1719d dVar) {
        Class<String> cls;
        gf5 gf5;
        n60 n60;
        int i2;
        Context context2 = context;
        t20 t202 = t20;
        C2982oq oqVar2 = oqVar;
        C1719d dVar2 = dVar;
        Class<ig2> cls2 = ig2.class;
        Class<String> cls3 = String.class;
        Class<Integer> cls4 = Integer.class;
        Class<byte[]> cls5 = byte[].class;
        this.f8669a = fVar;
        this.f8670d = t202;
        this.f8674r = oqVar2;
        this.f8671e = xs3;
        this.f8675s = oe5;
        this.f8676x = wp0;
        this.f8667A = aVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f8673k = registry;
        registry.mo12352o(new DefaultImageHeaderParser());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            registry.mo12352o(new dv1());
        }
        List<ImageHeaderParser> g = registry.mo12344g();
        q60 q60 = new q60(context2, g, t202, oqVar2);
        gf5<ParcelFileDescriptor, Bitmap> h = VideoDecoder.m12522h(t20);
        Class<byte[]> cls6 = cls5;
        C1797a aVar2 = new C1797a(registry.mo12344g(), resources.getDisplayMetrics(), t202, oqVar2);
        if (i3 < 28 || !dVar2.mo12384a(C1712b.C1715c.class)) {
            cls = cls3;
            m60 m60 = new m60(aVar2);
            gf5 = new C1804c(aVar2, oqVar2);
            n60 = m60;
        } else {
            gf5 = new fv2();
            n60 = new n60();
            cls = cls3;
        }
        Class<Integer> cls7 = cls4;
        if (i3 < 28 || !dVar2.mo12384a(C1712b.C1714b.class)) {
            i2 = i3;
        } else {
            i2 = i3;
            registry.mo12342e("Animation", InputStream.class, Drawable.class, C3366tk.m27778f(g, oqVar2));
            registry.mo12342e("Animation", ByteBuffer.class, Drawable.class, C3366tk.m27777a(g, oqVar2));
        }
        if5 if5 = new if5(context2);
        of5.C2951c cVar = new of5.C2951c(resources);
        of5.C2952d dVar3 = new of5.C2952d(resources);
        of5.C2950b bVar = new of5.C2950b(resources);
        of5.C2952d dVar4 = dVar3;
        of5.C2949a aVar3 = new of5.C2949a(resources);
        e20 e20 = new e20(oqVar2);
        of5.C2950b bVar2 = bVar;
        x10 x10 = new x10();
        kg2 kg2 = new kg2();
        ContentResolver contentResolver = context.getContentResolver();
        of5.C2951c cVar2 = cVar;
        if5 if52 = if5;
        Class<ig2> cls8 = cls2;
        registry.mo12338a(ByteBuffer.class, new o60()).mo12338a(InputStream.class, new ma6(oqVar2)).mo12342e("Bitmap", ByteBuffer.class, Bitmap.class, n60).mo12342e("Bitmap", InputStream.class, Bitmap.class, gf5);
        if (ParcelFileDescriptorRewinder.m12284c()) {
            registry.mo12342e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new am4(aVar2));
        }
        Class<ig2> cls9 = cls8;
        if5 if53 = if52;
        registry.mo12342e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h).mo12342e("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.m12517c(t20)).mo12340c(Bitmap.class, Bitmap.class, u37.C3394a.m28063b()).mo12342e("Bitmap", Bitmap.class, Bitmap.class, new s37()).mo12339b(Bitmap.class, e20).mo12342e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new b20(resources, n60)).mo12342e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new b20(resources, gf5)).mo12342e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new b20(resources, h)).mo12339b(BitmapDrawable.class, new c20(t202, e20)).mo12342e("Animation", InputStream.class, jg2.class, new oa6(g, q60, oqVar2)).mo12342e("Animation", ByteBuffer.class, jg2.class, q60).mo12339b(jg2.class, new lg2()).mo12340c(cls9, cls9, u37.C3394a.m28063b()).mo12342e("Bitmap", cls9, Bitmap.class, new qg2(t202)).mo12341d(Uri.class, Drawable.class, if53).mo12341d(Uri.class, Bitmap.class, new cf5(if53, t202)).mo12353p(new r60.C3181a()).mo12340c(File.class, ByteBuffer.class, new p60.C3040b()).mo12340c(File.class, InputStream.class, new s02.C3238e()).mo12341d(File.class, File.class, new p02()).mo12340c(File.class, ParcelFileDescriptor.class, new s02.C3234b()).mo12340c(File.class, File.class, u37.C3394a.m28063b()).mo12353p(new C1740c.C1741a(oqVar2));
        if (ParcelFileDescriptorRewinder.m12284c()) {
            registry.mo12353p(new ParcelFileDescriptorRewinder.C1734a());
        }
        Class cls10 = Integer.TYPE;
        of5.C2951c cVar3 = cVar2;
        of5.C2950b bVar3 = bVar2;
        Class<Integer> cls11 = cls7;
        of5.C2952d dVar5 = dVar4;
        of5.C2949a aVar4 = aVar3;
        Class<String> cls12 = cls;
        Context context3 = context;
        registry.mo12340c(cls10, InputStream.class, cVar3).mo12340c(cls10, ParcelFileDescriptor.class, bVar3).mo12340c(cls11, InputStream.class, cVar3).mo12340c(cls11, ParcelFileDescriptor.class, bVar3).mo12340c(cls11, Uri.class, dVar5).mo12340c(cls10, AssetFileDescriptor.class, aVar4).mo12340c(cls11, AssetFileDescriptor.class, aVar4).mo12340c(cls10, Uri.class, dVar5).mo12340c(cls12, InputStream.class, new i21.C2520c()).mo12340c(Uri.class, InputStream.class, new i21.C2520c()).mo12340c(cls12, InputStream.class, new eb6.C2220c()).mo12340c(cls12, ParcelFileDescriptor.class, new eb6.C2219b()).mo12340c(cls12, AssetFileDescriptor.class, new eb6.C2218a()).mo12340c(Uri.class, InputStream.class, new C3164qr.C3167c(context.getAssets())).mo12340c(Uri.class, AssetFileDescriptor.class, new C3164qr.C3166b(context.getAssets())).mo12340c(Uri.class, InputStream.class, new hs3.C2512a(context3)).mo12340c(Uri.class, InputStream.class, new js3.C2633a(context3));
        if (i2 >= 29) {
            registry.mo12340c(Uri.class, InputStream.class, new bz4.C1665c(context3));
            registry.mo12340c(Uri.class, ParcelFileDescriptor.class, new bz4.C1664b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        Class<byte[]> cls13 = cls6;
        x10 x102 = x10;
        kg2 kg22 = kg2;
        registry.mo12340c(Uri.class, InputStream.class, new h57.C2447d(contentResolver2)).mo12340c(Uri.class, ParcelFileDescriptor.class, new h57.C2445b(contentResolver2)).mo12340c(Uri.class, AssetFileDescriptor.class, new h57.C2444a(contentResolver2)).mo12340c(Uri.class, InputStream.class, new p57.C3038a()).mo12340c(URL.class, InputStream.class, new n57.C2867a()).mo12340c(Uri.class, File.class, new gs3.C2423a(context3)).mo12340c(dh2.class, InputStream.class, new dn2.C2184a()).mo12340c(cls13, ByteBuffer.class, new h60.C2448a()).mo12340c(cls13, InputStream.class, new h60.C2452d()).mo12340c(Uri.class, Uri.class, u37.C3394a.m28063b()).mo12340c(Drawable.class, Drawable.class, u37.C3394a.m28063b()).mo12341d(Drawable.class, Drawable.class, new t37()).mo12354q(Bitmap.class, BitmapDrawable.class, new d20(resources)).mo12354q(Bitmap.class, cls13, x102).mo12354q(Drawable.class, cls13, new hj1(t202, x102, kg22)).mo12354q(jg2.class, cls13, kg22);
        gf5<ByteBuffer, Bitmap> d = VideoDecoder.m12518d(t20);
        registry.mo12341d(ByteBuffer.class, Bitmap.class, d);
        registry.mo12341d(ByteBuffer.class, BitmapDrawable.class, new b20(resources, d));
        this.f8672g = new C1718c(context, oqVar, registry, new fs2(), aVar, map, list, fVar, dVar, i);
    }

    /* renamed from: a */
    public static void m12217a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f8666H) {
            f8666H = true;
            m12221m(context, generatedAppGlideModule);
            f8666H = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static C1710a m12218c(Context context) {
        if (f8665C == null) {
            GeneratedAppGlideModule d = m12219d(context.getApplicationContext());
            synchronized (C1710a.class) {
                if (f8665C == null) {
                    m12217a(context, d);
                }
            }
        }
        return f8665C;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m12219d(Context context) {
        try {
            return GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
        } catch (InstantiationException e) {
            m12223q(e);
        } catch (IllegalAccessException e2) {
            m12223q(e2);
        } catch (NoSuchMethodException e3) {
            m12223q(e3);
        } catch (InvocationTargetException e4) {
            m12223q(e4);
        }
        return null;
    }

    /* renamed from: l */
    public static oe5 m12220l(Context context) {
        zt4.m31501e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m12218c(context).mo12364k();
    }

    /* renamed from: m */
    public static void m12221m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m12222n(context, new C1712b(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m12222n(Context context, C1712b bVar, GeneratedAppGlideModule generatedAppGlideModule) {
        oe5.C2947b bVar2;
        Context applicationContext = context.getApplicationContext();
        List<xg2> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo12335c()) {
            emptyList = new in3(applicationContext).mo21575a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo12332d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo12332d();
            Iterator<xg2> it = emptyList.iterator();
            while (it.hasNext()) {
                xg2 next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (xg2 xg2 : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(xg2.getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVar2 = generatedAppGlideModule.mo12333e();
        } else {
            bVar2 = null;
        }
        bVar.mo12374b(bVar2);
        for (xg2 a : emptyList) {
            a.mo12334a(applicationContext, bVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo12334a(applicationContext, bVar);
        }
        C1710a a2 = bVar.mo12373a(applicationContext);
        for (xg2 next2 : emptyList) {
            try {
                next2.mo11483b(applicationContext, a2, a2.f8673k);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo11483b(applicationContext, a2, a2.f8673k);
        }
        applicationContext.registerComponentCallbacks(a2);
        f8665C = a2;
    }

    /* renamed from: q */
    public static void m12223q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static me5 m12224t(Context context) {
        return m12220l(context).mo23928l(context);
    }

    /* renamed from: u */
    public static me5 m12225u(View view) {
        return m12220l(view.getContext()).mo23929m(view);
    }

    /* renamed from: v */
    public static me5 m12226v(Fragment fragment) {
        return m12220l(fragment.getContext()).mo23930n(fragment);
    }

    /* renamed from: w */
    public static me5 m12227w(FragmentActivity fragmentActivity) {
        return m12220l(fragmentActivity).mo23931o(fragmentActivity);
    }

    /* renamed from: b */
    public void mo12357b() {
        p67.m24674b();
        this.f8671e.mo27872b();
        this.f8670d.mo26024b();
        this.f8674r.mo24040b();
    }

    /* renamed from: e */
    public C2982oq mo12358e() {
        return this.f8674r;
    }

    /* renamed from: f */
    public t20 mo12359f() {
        return this.f8670d;
    }

    /* renamed from: g */
    public wp0 mo12360g() {
        return this.f8676x;
    }

    /* renamed from: h */
    public Context mo12361h() {
        return this.f8672g.getBaseContext();
    }

    /* renamed from: i */
    public C1718c mo12362i() {
        return this.f8672g;
    }

    /* renamed from: j */
    public Registry mo12363j() {
        return this.f8673k;
    }

    /* renamed from: k */
    public oe5 mo12364k() {
        return this.f8675s;
    }

    /* renamed from: o */
    public void mo12365o(me5 me5) {
        synchronized (this.f8677y) {
            if (!this.f8677y.contains(me5)) {
                this.f8677y.add(me5);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo12357b();
    }

    public void onTrimMemory(int i) {
        mo12370r(i);
    }

    /* renamed from: p */
    public boolean mo12369p(pl6<?> pl6) {
        synchronized (this.f8677y) {
            for (me5 G : this.f8677y) {
                if (G.mo23145G(pl6)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo12370r(int i) {
        p67.m24674b();
        synchronized (this.f8677y) {
            for (me5 onTrimMemory : this.f8677y) {
                onTrimMemory.onTrimMemory(i);
            }
        }
        this.f8671e.mo21282a(i);
        this.f8670d.mo26023a(i);
        this.f8674r.mo24039a(i);
    }

    /* renamed from: s */
    public void mo12371s(me5 me5) {
        synchronized (this.f8677y) {
            if (this.f8677y.contains(me5)) {
                this.f8677y.remove(me5);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
