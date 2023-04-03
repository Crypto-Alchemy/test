package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.emoji2.text.C0593c;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p000.s72;

/* renamed from: androidx.emoji2.text.e */
/* compiled from: FontRequestEmojiCompatConfig */
public class C0607e extends C0593c.C0597c {

    /* renamed from: j */
    public static final C0608a f3575j = new C0608a();

    /* renamed from: androidx.emoji2.text.e$a */
    /* compiled from: FontRequestEmojiCompatConfig */
    public static class C0608a {
        /* renamed from: a */
        public Typeface mo5652a(Context context, s72.C3250b bVar) throws PackageManager.NameNotFoundException {
            return s72.m26703a(context, (CancellationSignal) null, new s72.C3250b[]{bVar});
        }

        /* renamed from: b */
        public s72.C3249a mo5653b(Context context, j72 j72) throws PackageManager.NameNotFoundException {
            return s72.m26704b(context, (CancellationSignal) null, j72);
        }

        /* renamed from: c */
        public void mo5654c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    /* compiled from: FontRequestEmojiCompatConfig */
    public static class C0609b implements C0593c.C0601g {

        /* renamed from: a */
        public final Context f3576a;

        /* renamed from: b */
        public final j72 f3577b;

        /* renamed from: c */
        public final C0608a f3578c;

        /* renamed from: d */
        public final Object f3579d = new Object();

        /* renamed from: e */
        public Handler f3580e;

        /* renamed from: f */
        public Executor f3581f;

        /* renamed from: g */
        public ThreadPoolExecutor f3582g;

        /* renamed from: h */
        public C0593c.C0602h f3583h;

        /* renamed from: i */
        public ContentObserver f3584i;

        /* renamed from: j */
        public Runnable f3585j;

        public C0609b(Context context, j72 j72, C0608a aVar) {
            gu4.m18429g(context, "Context cannot be null");
            gu4.m18429g(j72, "FontRequest cannot be null");
            this.f3576a = context.getApplicationContext();
            this.f3577b = j72;
            this.f3578c = aVar;
        }

        /* renamed from: a */
        public void mo5603a(C0593c.C0602h hVar) {
            gu4.m18429g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f3579d) {
                this.f3583h = hVar;
            }
            mo5657d();
        }

        /* renamed from: b */
        public final void mo5655b() {
            synchronized (this.f3579d) {
                this.f3583h = null;
                ContentObserver contentObserver = this.f3584i;
                if (contentObserver != null) {
                    this.f3578c.mo5654c(this.f3576a, contentObserver);
                    this.f3584i = null;
                }
                Handler handler = this.f3580e;
                if (handler != null) {
                    handler.removeCallbacks(this.f3585j);
                }
                this.f3580e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3582g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3581f = null;
                this.f3582g = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r4.f3579d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x001e, code lost:
            if (r1 != 0) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            p000.os6.m24033a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            r1 = r4.f3578c.mo5652a(r4.f3576a, r0);
            r0 = p000.o27.m23625f(r4.f3576a, (android.os.CancellationSignal) null, r0.mo25657d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
            if (r1 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
            r0 = androidx.emoji2.text.C0610f.m4583b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            p000.os6.m24034b();
            r1 = r4.f3579d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r2 = r4.f3583h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
            if (r2 == null) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
            r2.mo5606b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            mo5655b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x005c, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            p000.os6.m24034b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0061, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x007e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0081, code lost:
            monitor-enter(r4.f3579d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r2 = r4.f3583h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0084, code lost:
            if (r2 != null) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0086, code lost:
            r2.mo5605a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008a, code lost:
            mo5655b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = mo5658e();
            r1 = r0.mo25655b();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5656c() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f3579d
                monitor-enter(r0)
                androidx.emoji2.text.c$h r1 = r4.f3583h     // Catch:{ all -> 0x0091 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                s72$b r0 = r4.mo5658e()     // Catch:{ all -> 0x007e }
                int r1 = r0.mo25655b()     // Catch:{ all -> 0x007e }
                r2 = 2
                if (r1 != r2) goto L_0x001e
                java.lang.Object r2 = r4.f3579d     // Catch:{ all -> 0x007e }
                monitor-enter(r2)     // Catch:{ all -> 0x007e }
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                goto L_0x001e
            L_0x001a:
                monitor-exit(r2)     // Catch:{ all -> 0x001c }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x001c:
                r0 = move-exception
                goto L_0x001a
            L_0x001e:
                if (r1 != 0) goto L_0x0062
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                p000.os6.m24033a(r1)     // Catch:{ all -> 0x005d }
                androidx.emoji2.text.e$a r1 = r4.f3578c     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f3576a     // Catch:{ all -> 0x005d }
                android.graphics.Typeface r1 = r1.mo5652a(r2, r0)     // Catch:{ all -> 0x005d }
                android.content.Context r2 = r4.f3576a     // Catch:{ all -> 0x005d }
                r3 = 0
                android.net.Uri r0 = r0.mo25657d()     // Catch:{ all -> 0x005d }
                java.nio.ByteBuffer r0 = p000.o27.m23625f(r2, r3, r0)     // Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0055
                if (r1 == 0) goto L_0x0055
                androidx.emoji2.text.f r0 = androidx.emoji2.text.C0610f.m4583b(r1, r0)     // Catch:{ all -> 0x005d }
                p000.os6.m24034b()     // Catch:{ all -> 0x007e }
                java.lang.Object r1 = r4.f3579d     // Catch:{ all -> 0x007e }
                monitor-enter(r1)     // Catch:{ all -> 0x007e }
                androidx.emoji2.text.c$h r2 = r4.f3583h     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x004d
                r2.mo5606b(r0)     // Catch:{ all -> 0x0052 }
            L_0x004d:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                r4.mo5655b()     // Catch:{ all -> 0x007e }
                goto L_0x008d
            L_0x0052:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0055:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005d }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x005d }
                throw r0     // Catch:{ all -> 0x005d }
            L_0x005d:
                r0 = move-exception
                p000.os6.m24034b()     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x0062:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x007e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
                r2.<init>()     // Catch:{ all -> 0x007e }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x007e }
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x007e }
                r0.<init>(r1)     // Catch:{ all -> 0x007e }
                throw r0     // Catch:{ all -> 0x007e }
            L_0x007e:
                r0 = move-exception
                java.lang.Object r1 = r4.f3579d
                monitor-enter(r1)
                androidx.emoji2.text.c$h r2 = r4.f3583h     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x0089
                r2.mo5605a(r0)     // Catch:{ all -> 0x008e }
            L_0x0089:
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                r4.mo5655b()
            L_0x008d:
                return
            L_0x008e:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008e }
                throw r0
            L_0x0091:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0607e.C0609b.mo5656c():void");
        }

        /* renamed from: d */
        public void mo5657d() {
            synchronized (this.f3579d) {
                if (this.f3583h != null) {
                    if (this.f3581f == null) {
                        ThreadPoolExecutor b = jo0.m20286b("emojiCompat");
                        this.f3582g = b;
                        this.f3581f = b;
                    }
                    this.f3581f.execute(new k72(this));
                }
            }
        }

        /* renamed from: e */
        public final s72.C3250b mo5658e() {
            try {
                s72.C3249a b = this.f3578c.mo5653b(this.f3576a, this.f3577b);
                if (b.mo25654c() == 0) {
                    s72.C3250b[] b2 = b.mo25653b();
                    if (b2 != null && b2.length != 0) {
                        return b2[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b.mo25654c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: f */
        public void mo5659f(Executor executor) {
            synchronized (this.f3579d) {
                this.f3581f = executor;
            }
        }
    }

    public C0607e(Context context, j72 j72) {
        super(new C0609b(context, j72, f3575j));
    }

    /* renamed from: c */
    public C0607e mo5651c(Executor executor) {
        ((C0609b) mo5638a()).mo5659f(executor);
        return this;
    }
}
