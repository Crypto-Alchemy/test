package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class Loader implements cj3 {

    /* renamed from: d */
    public static final C1013c f5447d = m7530h(false, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);

    /* renamed from: e */
    public static final C1013c f5448e = m7530h(true, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);

    /* renamed from: f */
    public static final C1013c f5449f = new C1013c(2, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);

    /* renamed from: g */
    public static final C1013c f5450g = new C1013c(3, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);

    /* renamed from: a */
    public final ExecutorService f5451a;

    /* renamed from: b */
    public C1014d<? extends C1015e> f5452b;

    /* renamed from: c */
    public IOException f5453c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    /* renamed from: androidx.media3.exoplayer.upstream.Loader$b */
    public interface C1012b<T extends C1015e> {
        /* renamed from: k */
        C1013c mo7222k(T t, long j, long j2, IOException iOException, int i);

        /* renamed from: s */
        void mo7223s(T t, long j, long j2);

        /* renamed from: u */
        void mo7224u(T t, long j, long j2, boolean z);
    }

    /* renamed from: androidx.media3.exoplayer.upstream.Loader$c */
    public static final class C1013c {

        /* renamed from: a */
        public final int f5454a;

        /* renamed from: b */
        public final long f5455b;

        /* renamed from: c */
        public boolean mo7814c() {
            int i = this.f5454a;
            if (i == 0 || i == 1) {
                return true;
            }
            return false;
        }

        public C1013c(int i, long j) {
            this.f5454a = i;
            this.f5455b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: androidx.media3.exoplayer.upstream.Loader$d */
    public final class C1014d<T extends C1015e> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f5457a;

        /* renamed from: d */
        public final T f5458d;

        /* renamed from: e */
        public final long f5459e;

        /* renamed from: g */
        public C1012b<T> f5460g;

        /* renamed from: k */
        public IOException f5461k;

        /* renamed from: r */
        public int f5462r;

        /* renamed from: s */
        public Thread f5463s;

        /* renamed from: x */
        public boolean f5464x;

        /* renamed from: y */
        public volatile boolean f5465y;

        public C1014d(Looper looper, T t, C1012b<T> bVar, int i, long j) {
            super(looper);
            this.f5458d = t;
            this.f5460g = bVar;
            this.f5457a = i;
            this.f5459e = j;
        }

        /* renamed from: a */
        public void mo7815a(boolean z) {
            this.f5465y = z;
            this.f5461k = null;
            if (hasMessages(0)) {
                this.f5464x = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f5464x = true;
                    this.f5458d.mo7724c();
                    Thread thread = this.f5463s;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                mo7817c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((C1012b) C2725kr.m20985e(this.f5460g)).mo7224u(this.f5458d, elapsedRealtime, elapsedRealtime - this.f5459e, true);
                this.f5460g = null;
            }
        }

        /* renamed from: b */
        public final void mo7816b() {
            this.f5461k = null;
            Loader.this.f5451a.execute((Runnable) C2725kr.m20985e(Loader.this.f5452b));
        }

        /* renamed from: c */
        public final void mo7817c() {
            C1014d unused = Loader.this.f5452b = null;
        }

        /* renamed from: d */
        public final long mo7818d() {
            return (long) Math.min((this.f5462r - 1) * 1000, 5000);
        }

        /* renamed from: e */
        public void mo7819e(int i) throws IOException {
            IOException iOException = this.f5461k;
            if (iOException != null && this.f5462r > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void mo7820f(long j) {
            boolean z;
            if (Loader.this.f5452b == null) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            C1014d unused = Loader.this.f5452b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                mo7816b();
            }
        }

        public void handleMessage(Message message) {
            long j;
            if (!this.f5465y) {
                int i = message.what;
                if (i == 0) {
                    mo7816b();
                } else if (i != 3) {
                    mo7817c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f5459e;
                    C1012b bVar = (C1012b) C2725kr.m20985e(this.f5460g);
                    if (this.f5464x) {
                        bVar.mo7224u(this.f5458d, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        try {
                            bVar.mo7223s(this.f5458d, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            gk3.m18127d("LoadTask", "Unexpected exception handling load completed", e);
                            IOException unused = Loader.this.f5453c = new UnexpectedLoaderException(e);
                        }
                    } else if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f5461k = iOException;
                        int i3 = this.f5462r + 1;
                        this.f5462r = i3;
                        C1013c k = bVar.mo7222k(this.f5458d, elapsedRealtime, j2, iOException, i3);
                        if (k.f5454a == 3) {
                            IOException unused2 = Loader.this.f5453c = this.f5461k;
                        } else if (k.f5454a != 2) {
                            if (k.f5454a == 1) {
                                this.f5462r = 1;
                            }
                            if (k.f5455b != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                                j = k.f5455b;
                            } else {
                                j = mo7818d();
                            }
                            mo7820f(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    if (!this.f5464x) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f5463s = Thread.currentThread();
                }
                if (z) {
                    ps6.m25173a("load:" + this.f5458d.getClass().getSimpleName());
                    this.f5458d.mo7723a();
                    ps6.m25175c();
                }
                synchronized (this) {
                    this.f5463s = null;
                    Thread.interrupted();
                }
                if (!this.f5465y) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.f5465y) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.f5465y) {
                    gk3.m18127d("LoadTask", "Unexpected exception loading stream", e2);
                    obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.f5465y) {
                    gk3.m18127d("LoadTask", "OutOfMemory error loading stream", e3);
                    obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.f5465y) {
                    gk3.m18127d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                ps6.m25175c();
                throw th;
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.upstream.Loader$e */
    public interface C1015e {
        /* renamed from: a */
        void mo7723a() throws IOException;

        /* renamed from: c */
        void mo7724c();
    }

    /* renamed from: androidx.media3.exoplayer.upstream.Loader$f */
    public interface C1016f {
        /* renamed from: n */
        void mo7721n();
    }

    /* renamed from: androidx.media3.exoplayer.upstream.Loader$g */
    public static final class C1017g implements Runnable {

        /* renamed from: a */
        public final C1016f f5466a;

        public C1017g(C1016f fVar) {
            this.f5466a = fVar;
        }

        public void run() {
            this.f5466a.mo7721n();
        }
    }

    public Loader(String str) {
        this.f5451a = w67.m29393z0("ExoPlayer:Loader:" + str);
    }

    /* renamed from: h */
    public static C1013c m7530h(boolean z, long j) {
        return new C1013c(z ? 1 : 0, j);
    }

    /* renamed from: b */
    public void mo7226b() throws IOException {
        mo7810k(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void mo7806f() {
        ((C1014d) C2725kr.m20989i(this.f5452b)).mo7815a(false);
    }

    /* renamed from: g */
    public void mo7807g() {
        this.f5453c = null;
    }

    /* renamed from: i */
    public boolean mo7808i() {
        if (this.f5453c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo7809j() {
        if (this.f5452b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void mo7810k(int i) throws IOException {
        IOException iOException = this.f5453c;
        if (iOException == null) {
            C1014d<? extends C1015e> dVar = this.f5452b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f5457a;
                }
                dVar.mo7819e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: l */
    public void mo7811l() {
        mo7812m((C1016f) null);
    }

    /* renamed from: m */
    public void mo7812m(C1016f fVar) {
        C1014d<? extends C1015e> dVar = this.f5452b;
        if (dVar != null) {
            dVar.mo7815a(true);
        }
        if (fVar != null) {
            this.f5451a.execute(new C1017g(fVar));
        }
        this.f5451a.shutdown();
    }

    /* renamed from: n */
    public <T extends C1015e> long mo7813n(T t, C1012b<T> bVar, int i) {
        this.f5453c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C1014d((Looper) C2725kr.m20989i(Looper.myLooper()), t, bVar, i, elapsedRealtime).mo7820f(0);
        return elapsedRealtime;
    }
}
