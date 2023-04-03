package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import org.java_websocket.C9058a;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.framing.Framedata;

/* renamed from: ak7 */
/* compiled from: WebSocketClient */
public abstract class ak7 extends C7929n7 implements Runnable, WebSocket {

    /* renamed from: A */
    public Proxy f36483A = Proxy.NO_PROXY;

    /* renamed from: B */
    public Thread f36484B;

    /* renamed from: C */
    public Draft f36485C;

    /* renamed from: H */
    public Map<String, String> f36486H;

    /* renamed from: I */
    public CountDownLatch f36487I = new CountDownLatch(1);

    /* renamed from: L */
    public CountDownLatch f36488L = new CountDownLatch(1);

    /* renamed from: M */
    public int f36489M = 0;

    /* renamed from: r */
    public URI f36490r = null;

    /* renamed from: s */
    public C9058a f36491s = null;

    /* renamed from: x */
    public Socket f36492x = null;

    /* renamed from: y */
    public OutputStream f36493y;

    /* renamed from: ak7$b */
    /* compiled from: WebSocketClient */
    public class C6829b implements Runnable {
        public C6829b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
            if (r2.hasNext() != false) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
            r3 = r2.next();
            p000.ak7.m55545z(r6.f36494a).write(r3.array(), 0, r3.limit());
            p000.ak7.m55545z(r6.f36494a).flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            p000.ak7.m55541A(r6.f36494a, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
            p000.ak7.m55542B(r6.f36494a);
            p000.ak7.m55543C(r6.f36494a, (java.lang.Thread) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a4, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0051, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0053, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r2 = p000.ak7.m55544y(r6.f36494a).f43894a.iterator();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0055 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "WebSocketWriteThread-"
                r1.append(r2)
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                long r2 = r2.getId()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setName(r1)
            L_0x0020:
                r0 = 0
                r1 = 0
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ InterruptedException -> 0x0055 }
                if (r2 != 0) goto L_0x0088
                ak7 r2 = p000.ak7.this     // Catch:{ InterruptedException -> 0x0055 }
                org.java_websocket.a r2 = r2.f36491s     // Catch:{ InterruptedException -> 0x0055 }
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r2.f43894a     // Catch:{ InterruptedException -> 0x0055 }
                java.lang.Object r2 = r2.take()     // Catch:{ InterruptedException -> 0x0055 }
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ InterruptedException -> 0x0055 }
                ak7 r3 = p000.ak7.this     // Catch:{ InterruptedException -> 0x0055 }
                java.io.OutputStream r3 = r3.f36493y     // Catch:{ InterruptedException -> 0x0055 }
                byte[] r4 = r2.array()     // Catch:{ InterruptedException -> 0x0055 }
                int r2 = r2.limit()     // Catch:{ InterruptedException -> 0x0055 }
                r3.write(r4, r0, r2)     // Catch:{ InterruptedException -> 0x0055 }
                ak7 r2 = p000.ak7.this     // Catch:{ InterruptedException -> 0x0055 }
                java.io.OutputStream r2 = r2.f36493y     // Catch:{ InterruptedException -> 0x0055 }
                r2.flush()     // Catch:{ InterruptedException -> 0x0055 }
                goto L_0x0020
            L_0x0051:
                r0 = move-exception
                goto L_0x009a
            L_0x0053:
                r0 = move-exception
                goto L_0x0093
            L_0x0055:
                ak7 r2 = p000.ak7.this     // Catch:{ IOException -> 0x0053 }
                org.java_websocket.a r2 = r2.f36491s     // Catch:{ IOException -> 0x0053 }
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r2.f43894a     // Catch:{ IOException -> 0x0053 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0053 }
            L_0x0061:
                boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x0053 }
                if (r3 == 0) goto L_0x0088
                java.lang.Object r3 = r2.next()     // Catch:{ IOException -> 0x0053 }
                java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch:{ IOException -> 0x0053 }
                ak7 r4 = p000.ak7.this     // Catch:{ IOException -> 0x0053 }
                java.io.OutputStream r4 = r4.f36493y     // Catch:{ IOException -> 0x0053 }
                byte[] r5 = r3.array()     // Catch:{ IOException -> 0x0053 }
                int r3 = r3.limit()     // Catch:{ IOException -> 0x0053 }
                r4.write(r5, r0, r3)     // Catch:{ IOException -> 0x0053 }
                ak7 r3 = p000.ak7.this     // Catch:{ IOException -> 0x0053 }
                java.io.OutputStream r3 = r3.f36493y     // Catch:{ IOException -> 0x0053 }
                r3.flush()     // Catch:{ IOException -> 0x0053 }
                goto L_0x0061
            L_0x0088:
                ak7 r0 = p000.ak7.this
                r0.mo50223F()
                ak7 r0 = p000.ak7.this
                java.lang.Thread unused = r0.f36484B = r1
                goto L_0x0099
            L_0x0093:
                ak7 r2 = p000.ak7.this     // Catch:{ all -> 0x0051 }
                r2.mo50226I(r0)     // Catch:{ all -> 0x0051 }
                goto L_0x0088
            L_0x0099:
                return
            L_0x009a:
                ak7 r2 = p000.ak7.this
                r2.mo50223F()
                ak7 r2 = p000.ak7.this
                java.lang.Thread unused = r2.f36484B = r1
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ak7.C6829b.run():void");
        }
    }

    public ak7(URI uri, Draft draft, Map<String, String> map, int i) {
        if (uri == null) {
            throw new IllegalArgumentException();
        } else if (draft != null) {
            this.f36490r = uri;
            this.f36485C = draft;
            this.f36486H = map;
            this.f36489M = i;
            mo56386v(false);
            mo56385u(false);
            this.f36491s = new C9058a(this, draft);
        } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
    }

    /* renamed from: D */
    public void mo50221D() {
        if (this.f36484B != null) {
            this.f36491s.mo64877a(1000);
        }
    }

    /* renamed from: E */
    public void mo50222E() throws InterruptedException {
        mo50221D();
        this.f36488L.await();
    }

    /* renamed from: F */
    public final void mo50223F() {
        try {
            Socket socket = this.f36492x;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            mo50247l(this, e);
        }
    }

    /* renamed from: G */
    public void mo50224G() {
        if (this.f36484B == null) {
            Thread thread = new Thread(this);
            this.f36484B = thread;
            thread.setName("WebSocketConnectReadThread-" + this.f36484B.getId());
            this.f36484B.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }

    /* renamed from: H */
    public final int mo50225H() {
        int port = this.f36490r.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.f36490r.getScheme();
        if ("wss".equals(scheme)) {
            return 443;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    /* renamed from: I */
    public final void mo50226I(IOException iOException) {
        if (iOException instanceof SSLException) {
            mo50233P(iOException);
        }
        this.f36491s.mo64890n();
    }

    /* renamed from: J */
    public boolean mo50227J() {
        return this.f36491s.mo64896t();
    }

    /* renamed from: K */
    public boolean mo50228K() {
        return this.f36491s.mo64898u();
    }

    /* renamed from: L */
    public boolean mo50229L() {
        return this.f36491s.mo64899v();
    }

    /* renamed from: M */
    public abstract void mo50230M(int i, String str, boolean z);

    /* renamed from: N */
    public void mo50231N(int i, String str) {
    }

    /* renamed from: O */
    public void mo50232O(int i, String str, boolean z) {
    }

    /* renamed from: P */
    public abstract void mo50233P(Exception exc);

    /* renamed from: Q */
    public abstract void mo50234Q(String str);

    /* renamed from: R */
    public void mo50235R(ByteBuffer byteBuffer) {
    }

    /* renamed from: S */
    public abstract void mo50236S(bx5 bx5);

    /* renamed from: T */
    public void mo50237T() {
        mo50238U();
        mo50224G();
    }

    /* renamed from: U */
    public final void mo50238U() {
        try {
            mo50222E();
            Thread thread = this.f36484B;
            if (thread != null) {
                thread.interrupt();
                this.f36484B = null;
            }
            this.f36485C.mo64918q();
            Socket socket = this.f36492x;
            if (socket != null) {
                socket.close();
                this.f36492x = null;
            }
            this.f36487I = new CountDownLatch(1);
            this.f36488L = new CountDownLatch(1);
            this.f36491s = new C9058a(this, this.f36485C);
        } catch (Exception e) {
            mo50233P(e);
            this.f36491s.mo64881e(1006, e.getMessage());
        }
    }

    /* renamed from: V */
    public void mo50239V(String str) throws NotYetConnectedException {
        this.f36491s.mo64901x(str);
    }

    /* renamed from: W */
    public final void mo50240W() throws InvalidHandshakeException {
        String str;
        String rawPath = this.f36490r.getRawPath();
        String rawQuery = this.f36490r.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int H = mo50225H();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36490r.getHost());
        if (H != 80) {
            str = ":" + H;
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        zk2 zk2 = new zk2();
        zk2.mo56254f(rawPath);
        zk2.put("Host", sb2);
        Map<String, String> map = this.f36486H;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                zk2.put((String) next.getKey(), (String) next.getValue());
            }
        }
        this.f36491s.mo64873B(zk2);
    }

    /* renamed from: a */
    public void mo50241a(WebSocket webSocket, int i, String str, boolean z) {
        mo50232O(i, str, z);
    }

    /* renamed from: c */
    public final void mo50242c(WebSocket webSocket, ByteBuffer byteBuffer) {
        mo50235R(byteBuffer);
    }

    /* renamed from: h */
    public void mo50243h(Framedata framedata) {
        this.f36491s.mo50243h(framedata);
    }

    /* renamed from: i */
    public final void mo50244i(WebSocket webSocket) {
    }

    /* renamed from: j */
    public void mo50245j(WebSocket webSocket, int i, String str) {
        mo50231N(i, str);
    }

    /* renamed from: k */
    public final void mo50246k(WebSocket webSocket, bl2 bl2) {
        mo56387w();
        mo50236S((bx5) bl2);
        this.f36487I.countDown();
    }

    /* renamed from: l */
    public final void mo50247l(WebSocket webSocket, Exception exc) {
        mo50233P(exc);
    }

    /* renamed from: m */
    public final void mo50248m(WebSocket webSocket, String str) {
        mo50234Q(str);
    }

    /* renamed from: n */
    public final void mo50249n(WebSocket webSocket, int i, String str, boolean z) {
        mo56388x();
        Thread thread = this.f36484B;
        if (thread != null) {
            thread.interrupt();
        }
        mo50230M(i, str, z);
        this.f36487I.countDown();
        this.f36488L.countDown();
    }

    /* renamed from: q */
    public Collection<WebSocket> mo50250q() {
        return Collections.singletonList(this.f36491s);
    }

    public void run() {
        boolean z;
        int read;
        try {
            Socket socket = this.f36492x;
            if (socket == null) {
                this.f36492x = new Socket(this.f36483A);
                z = true;
            } else if (!socket.isClosed()) {
                z = false;
            } else {
                throw new IOException();
            }
            this.f36492x.setTcpNoDelay(mo56383s());
            this.f36492x.setReuseAddress(mo56382r());
            if (!this.f36492x.isBound()) {
                this.f36492x.connect(new InetSocketAddress(this.f36490r.getHost(), mo50225H()), this.f36489M);
            }
            if (z && "wss".equals(this.f36490r.getScheme())) {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                this.f36492x = instance.getSocketFactory().createSocket(this.f36492x, this.f36490r.getHost(), mo50225H(), true);
            }
            InputStream inputStream = this.f36492x.getInputStream();
            this.f36493y = this.f36492x.getOutputStream();
            mo50240W();
            Thread thread = new Thread(new C6829b());
            this.f36484B = thread;
            thread.start();
            byte[] bArr = new byte[C9058a.f43882U];
            while (!mo50228K() && !mo50227J() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.f36491s.mo64887k(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException e) {
                    mo50226I(e);
                    return;
                } catch (RuntimeException e2) {
                    mo50233P(e2);
                    this.f36491s.mo64881e(1006, e2.getMessage());
                    return;
                }
            }
            this.f36491s.mo64890n();
        } catch (Exception e3) {
            mo50247l(this.f36491s, e3);
            this.f36491s.mo64881e(-1, e3.getMessage());
        }
    }
}
