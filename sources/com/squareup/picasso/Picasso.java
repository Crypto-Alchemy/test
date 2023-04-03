package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.C5428a;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class Picasso {

    /* renamed from: p */
    public static final Handler f26774p = new C5421a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: q */
    public static volatile Picasso f26775q = null;

    /* renamed from: a */
    public final C5425d f26776a;

    /* renamed from: b */
    public final C5426e f26777b;

    /* renamed from: c */
    public final C5423c f26778c;

    /* renamed from: d */
    public final List<C5454m> f26779d;

    /* renamed from: e */
    public final Context f26780e;

    /* renamed from: f */
    public final C5440f f26781f;

    /* renamed from: g */
    public final c80 f26782g;

    /* renamed from: h */
    public final m96 f26783h;

    /* renamed from: i */
    public final Map<Object, C5428a> f26784i;

    /* renamed from: j */
    public final Map<ImageView, cb1> f26785j;

    /* renamed from: k */
    public final ReferenceQueue<Object> f26786k;

    /* renamed from: l */
    public final Bitmap.Config f26787l;

    /* renamed from: m */
    public boolean f26788m;

    /* renamed from: n */
    public volatile boolean f26789n;

    /* renamed from: o */
    public boolean f26790o;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        public final int debugColor;

        /* access modifiers changed from: public */
        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: com.squareup.picasso.Picasso$a */
    public static class C5421a extends Handler {
        public C5421a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        C5431c cVar = (C5431c) list.get(i2);
                        cVar.f26841d.mo39462d(cVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        C5428a aVar = (C5428a) list2.get(i2);
                        aVar.f26809a.mo39471n(aVar);
                        i2++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                C5428a aVar2 = (C5428a) message.obj;
                if (aVar2.mo39495g().f26789n) {
                    C5459q.m41892t("Main", "canceled", aVar2.f26810b.mo39569d(), "target got garbage collected");
                }
                aVar2.f26809a.mo39459a(aVar2.mo39499k());
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$b */
    public static class C5422b {

        /* renamed from: a */
        public final Context f26793a;

        /* renamed from: b */
        public si1 f26794b;

        /* renamed from: c */
        public ExecutorService f26795c;

        /* renamed from: d */
        public c80 f26796d;

        /* renamed from: e */
        public C5425d f26797e;

        /* renamed from: f */
        public C5426e f26798f;

        /* renamed from: g */
        public List<C5454m> f26799g;

        /* renamed from: h */
        public Bitmap.Config f26800h;

        /* renamed from: i */
        public boolean f26801i;

        /* renamed from: j */
        public boolean f26802j;

        public C5422b(Context context) {
            if (context != null) {
                this.f26793a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public Picasso mo39475a() {
            Context context = this.f26793a;
            if (this.f26794b == null) {
                this.f26794b = new ig4(context);
            }
            if (this.f26796d == null) {
                this.f26796d = new bm3(context);
            }
            if (this.f26795c == null) {
                this.f26795c = new C5448j();
            }
            if (this.f26798f == null) {
                this.f26798f = C5426e.f26807a;
            }
            m96 m96 = new m96(this.f26796d);
            Context context2 = context;
            return new Picasso(context2, new C5440f(context2, this.f26795c, Picasso.f26774p, this.f26794b, this.f26796d, m96), this.f26796d, this.f26797e, this.f26798f, this.f26799g, m96, this.f26800h, this.f26801i, this.f26802j);
        }

        /* renamed from: b */
        public C5422b mo39476b(Bitmap.Config config) {
            if (config != null) {
                this.f26800h = config;
                return this;
            }
            throw new IllegalArgumentException("Bitmap config must not be null.");
        }

        /* renamed from: c */
        public C5422b mo39477c(si1 si1) {
            if (si1 == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (this.f26794b == null) {
                this.f26794b = si1;
                return this;
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }

        /* renamed from: d */
        public C5422b mo39478d(ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            } else if (this.f26795c == null) {
                this.f26795c = executorService;
                return this;
            } else {
                throw new IllegalStateException("Executor service already set.");
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$c */
    public static class C5423c extends Thread {

        /* renamed from: a */
        public final ReferenceQueue<Object> f26803a;

        /* renamed from: d */
        public final Handler f26804d;

        /* renamed from: com.squareup.picasso.Picasso$c$a */
        public class C5424a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Exception f26805a;

            public C5424a(Exception exc) {
                this.f26805a = exc;
            }

            public void run() {
                throw new RuntimeException(this.f26805a);
            }
        }

        public C5423c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f26803a = referenceQueue;
            this.f26804d = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C5428a.C5429a aVar = (C5428a.C5429a) this.f26803a.remove(1000);
                    Message obtainMessage = this.f26804d.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f26821a;
                        this.f26804d.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f26804d.post(new C5424a(e));
                    return;
                }
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$d */
    public interface C5425d {
        /* renamed from: a */
        void mo39481a(Picasso picasso, Uri uri, Exception exc);
    }

    /* renamed from: com.squareup.picasso.Picasso$e */
    public interface C5426e {

        /* renamed from: a */
        public static final C5426e f26807a = new C5427a();

        /* renamed from: com.squareup.picasso.Picasso$e$a */
        public static class C5427a implements C5426e {
            /* renamed from: a */
            public C5450k mo39482a(C5450k kVar) {
                return kVar;
            }
        }

        /* renamed from: a */
        C5450k mo39482a(C5450k kVar);
    }

    public Picasso(Context context, C5440f fVar, c80 c80, C5425d dVar, C5426e eVar, List<C5454m> list, m96 m96, Bitmap.Config config, boolean z, boolean z2) {
        int i;
        this.f26780e = context;
        this.f26781f = fVar;
        this.f26782g = c80;
        this.f26776a = dVar;
        this.f26777b = eVar;
        this.f26787l = config;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i + 7);
        arrayList.add(new C5456n(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C5438d(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new C5439e(context));
        arrayList.add(new C5430b(context));
        arrayList.add(new C5445g(context));
        arrayList.add(new NetworkRequestHandler(fVar.f26860d, m96));
        this.f26779d = Collections.unmodifiableList(arrayList);
        this.f26783h = m96;
        this.f26784i = new WeakHashMap();
        this.f26785j = new WeakHashMap();
        this.f26788m = z;
        this.f26789n = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f26786k = referenceQueue;
        C5423c cVar = new C5423c(referenceQueue, f26774p);
        this.f26778c = cVar;
        cVar.start();
    }

    /* renamed from: h */
    public static Picasso m41718h() {
        if (f26775q == null) {
            synchronized (Picasso.class) {
                if (f26775q == null) {
                    Context context = PicassoProvider.f26808a;
                    if (context != null) {
                        f26775q = new C5422b(context).mo39475a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f26775q;
    }

    /* renamed from: a */
    public void mo39459a(Object obj) {
        cb1 remove;
        C5459q.m41875c();
        C5428a remove2 = this.f26784i.remove(obj);
        if (remove2 != null) {
            remove2.mo39489a();
            this.f26781f.mo39531c(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f26785j.remove((ImageView) obj)) != null) {
            remove.mo29909a();
        }
    }

    /* renamed from: b */
    public void mo39460b(ImageView imageView) {
        if (imageView != null) {
            mo39459a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* renamed from: c */
    public void mo39461c(C5457o oVar) {
        if (oVar != null) {
            mo39459a(oVar);
            return;
        }
        throw new IllegalArgumentException("target cannot be null.");
    }

    /* renamed from: d */
    public void mo39462d(C5431c cVar) {
        boolean z;
        C5428a h = cVar.mo39506h();
        List<C5428a> i = cVar.mo39507i();
        boolean z2 = true;
        if (i == null || i.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (h == null && !z) {
            z2 = false;
        }
        if (z2) {
            Uri uri = cVar.mo39508j().f26891d;
            Exception k = cVar.mo39509k();
            Bitmap s = cVar.mo39516s();
            LoadedFrom o = cVar.mo39511o();
            if (h != null) {
                mo39464f(s, o, h, k);
            }
            if (z) {
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo39464f(s, o, i.get(i2), k);
                }
            }
            C5425d dVar = this.f26776a;
            if (dVar != null && k != null) {
                dVar.mo39481a(this, uri, k);
            }
        }
    }

    /* renamed from: e */
    public void mo39463e(ImageView imageView, cb1 cb1) {
        if (this.f26785j.containsKey(imageView)) {
            mo39459a(imageView);
        }
        this.f26785j.put(imageView, cb1);
    }

    /* renamed from: f */
    public final void mo39464f(Bitmap bitmap, LoadedFrom loadedFrom, C5428a aVar, Exception exc) {
        if (!aVar.mo39500l()) {
            if (!aVar.mo39501m()) {
                this.f26784i.remove(aVar.mo39499k());
            }
            if (bitmap == null) {
                aVar.mo39491c(exc);
                if (this.f26789n) {
                    C5459q.m41892t("Main", "errored", aVar.f26810b.mo39569d(), exc.getMessage());
                }
            } else if (loadedFrom != null) {
                aVar.mo39490b(bitmap, loadedFrom);
                if (this.f26789n) {
                    String d = aVar.f26810b.mo39569d();
                    C5459q.m41892t("Main", "completed", d, "from " + loadedFrom);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* renamed from: g */
    public void mo39465g(C5428a aVar) {
        Object k = aVar.mo39499k();
        if (!(k == null || this.f26784i.get(k) == aVar)) {
            mo39459a(k);
            this.f26784i.put(k, aVar);
        }
        mo39472o(aVar);
    }

    /* renamed from: i */
    public List<C5454m> mo39466i() {
        return this.f26779d;
    }

    /* renamed from: j */
    public C5453l mo39467j(Uri uri) {
        return new C5453l(this, uri, 0);
    }

    /* renamed from: k */
    public C5453l mo39468k(File file) {
        if (file == null) {
            return new C5453l(this, (Uri) null, 0);
        }
        return mo39467j(Uri.fromFile(file));
    }

    /* renamed from: l */
    public C5453l mo39469l(String str) {
        if (str == null) {
            return new C5453l(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return mo39467j(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* renamed from: m */
    public Bitmap mo39470m(String str) {
        Bitmap bitmap = this.f26782g.get(str);
        if (bitmap != null) {
            this.f26783h.mo45710d();
        } else {
            this.f26783h.mo45711e();
        }
        return bitmap;
    }

    /* renamed from: n */
    public void mo39471n(C5428a aVar) {
        Bitmap bitmap;
        if (MemoryPolicy.shouldReadFromMemoryCache(aVar.f26813e)) {
            bitmap = mo39470m(aVar.mo39492d());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            LoadedFrom loadedFrom = LoadedFrom.MEMORY;
            mo39464f(bitmap, loadedFrom, aVar, (Exception) null);
            if (this.f26789n) {
                C5459q.m41892t("Main", "completed", aVar.f26810b.mo39569d(), "from " + loadedFrom);
                return;
            }
            return;
        }
        mo39465g(aVar);
        if (this.f26789n) {
            C5459q.m41891s("Main", "resumed", aVar.f26810b.mo39569d());
        }
    }

    /* renamed from: o */
    public void mo39472o(C5428a aVar) {
        this.f26781f.mo39536h(aVar);
    }

    /* renamed from: p */
    public C5450k mo39473p(C5450k kVar) {
        C5450k a = this.f26777b.mo39482a(kVar);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Request transformer " + this.f26777b.getClass().getCanonicalName() + " returned null for " + kVar);
    }
}
