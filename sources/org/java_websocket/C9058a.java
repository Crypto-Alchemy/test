package org.java_websocket;

import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.C9067g;
import org.java_websocket.framing.Framedata;

/* renamed from: org.java_websocket.a */
/* compiled from: WebSocketImpl */
public class C9058a implements WebSocket {

    /* renamed from: U */
    public static int f43882U = 16384;

    /* renamed from: X */
    public static boolean f43883X = false;

    /* renamed from: Y */
    public static final Object f43884Y = new Object();

    /* renamed from: A */
    public WebSocket.Role f43885A;

    /* renamed from: B */
    public ByteBuffer f43886B = ByteBuffer.allocate(0);

    /* renamed from: C */
    public lg0 f43887C = null;

    /* renamed from: H */
    public String f43888H = null;

    /* renamed from: I */
    public Integer f43889I = null;

    /* renamed from: L */
    public Boolean f43890L = null;

    /* renamed from: M */
    public String f43891M = null;

    /* renamed from: P */
    public long f43892P = System.currentTimeMillis();

    /* renamed from: Q */
    public C9067g f43893Q;

    /* renamed from: a */
    public final BlockingQueue<ByteBuffer> f43894a;

    /* renamed from: d */
    public final BlockingQueue<ByteBuffer> f43895d;

    /* renamed from: e */
    public final ck7 f43896e;

    /* renamed from: g */
    public SelectionKey f43897g;

    /* renamed from: k */
    public ByteChannel f43898k;

    /* renamed from: r */
    public volatile boolean f43899r = false;

    /* renamed from: s */
    public WebSocket.READYSTATE f43900s = WebSocket.READYSTATE.NOT_YET_CONNECTED;

    /* renamed from: x */
    public List<Draft> f43901x;

    /* renamed from: y */
    public Draft f43902y = null;

    public C9058a(ck7 ck7, Draft draft) {
        if (ck7 == null || (draft == null && this.f43885A == WebSocket.Role.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f43894a = new LinkedBlockingQueue();
        this.f43895d = new LinkedBlockingQueue();
        this.f43896e = ck7;
        this.f43885A = WebSocket.Role.CLIENT;
        if (draft != null) {
            this.f43902y = draft.mo64908e();
        }
    }

    /* renamed from: A */
    public final void mo64872A(WebSocket.READYSTATE readystate) {
        this.f43900s = readystate;
    }

    /* renamed from: B */
    public void mo64873B(mg0 mg0) throws InvalidHandshakeException {
        this.f43887C = this.f43902y.mo64914k(mg0);
        this.f43891M = mg0.mo55892c();
        try {
            this.f43896e.mo50914b(this, this.f43887C);
            mo64876E(this.f43902y.mo64911h(this.f43887C, this.f43885A));
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            this.f43896e.mo50247l(this, e);
            throw new InvalidHandshakeException("rejected because of" + e);
        }
    }

    /* renamed from: C */
    public void mo64874C() {
        this.f43892P = System.currentTimeMillis();
    }

    /* renamed from: D */
    public final void mo64875D(ByteBuffer byteBuffer) {
        String str;
        if (f43883X) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            if (byteBuffer.remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(byteBuffer.array());
            }
            sb.append(str);
            sb.append('}');
            printStream.println(sb.toString());
        }
        this.f43894a.add(byteBuffer);
        this.f43896e.mo50244i(this);
    }

    /* renamed from: E */
    public final void mo64876E(List<ByteBuffer> list) {
        synchronized (f43884Y) {
            for (ByteBuffer D : list) {
                mo64875D(D);
            }
        }
    }

    /* renamed from: a */
    public void mo64877a(int i) {
        mo64879c(i, "", false);
    }

    /* renamed from: b */
    public void mo64878b(int i, String str) {
        mo64879c(i, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo64879c(int r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            org.java_websocket.WebSocket$READYSTATE r0 = r4.mo64894r()     // Catch:{ all -> 0x0083 }
            org.java_websocket.WebSocket$READYSTATE r1 = org.java_websocket.WebSocket.READYSTATE.CLOSING     // Catch:{ all -> 0x0083 }
            if (r0 == r1) goto L_0x0081
            org.java_websocket.WebSocket$READYSTATE r0 = r4.f43900s     // Catch:{ all -> 0x0083 }
            org.java_websocket.WebSocket$READYSTATE r2 = org.java_websocket.WebSocket.READYSTATE.CLOSED     // Catch:{ all -> 0x0083 }
            if (r0 == r2) goto L_0x0081
            org.java_websocket.WebSocket$READYSTATE r0 = r4.mo64894r()     // Catch:{ all -> 0x0083 }
            org.java_websocket.WebSocket$READYSTATE r2 = org.java_websocket.WebSocket.READYSTATE.OPEN     // Catch:{ all -> 0x0083 }
            r3 = 0
            if (r0 != r2) goto L_0x0063
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r5 != r0) goto L_0x0024
            r4.mo64872A(r1)     // Catch:{ all -> 0x0083 }
            r4.mo64891o(r5, r6, r3)     // Catch:{ all -> 0x0083 }
            monitor-exit(r4)
            return
        L_0x0024:
            org.java_websocket.drafts.Draft r1 = r4.f43902y     // Catch:{ all -> 0x0083 }
            org.java_websocket.drafts.Draft$CloseHandshakeType r1 = r1.mo64913j()     // Catch:{ all -> 0x0083 }
            org.java_websocket.drafts.Draft$CloseHandshakeType r2 = org.java_websocket.drafts.Draft.CloseHandshakeType.NONE     // Catch:{ all -> 0x0083 }
            if (r1 == r2) goto L_0x005f
            if (r7 != 0) goto L_0x003c
            ck7 r1 = r4.f43896e     // Catch:{ RuntimeException -> 0x0036 }
            r1.mo50245j(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0036 }
            goto L_0x003c
        L_0x0036:
            r1 = move-exception
            ck7 r2 = r4.f43896e     // Catch:{ InvalidDataException -> 0x0054 }
            r2.mo50247l(r4, r1)     // Catch:{ InvalidDataException -> 0x0054 }
        L_0x003c:
            boolean r1 = r4.mo64899v()     // Catch:{ InvalidDataException -> 0x0054 }
            if (r1 == 0) goto L_0x005f
            org.java_websocket.framing.b r1 = new org.java_websocket.framing.b     // Catch:{ InvalidDataException -> 0x0054 }
            r1.<init>()     // Catch:{ InvalidDataException -> 0x0054 }
            r1.mo64951r(r6)     // Catch:{ InvalidDataException -> 0x0054 }
            r1.mo64950q(r5)     // Catch:{ InvalidDataException -> 0x0054 }
            r1.mo64946h()     // Catch:{ InvalidDataException -> 0x0054 }
            r4.mo50243h(r1)     // Catch:{ InvalidDataException -> 0x0054 }
            goto L_0x005f
        L_0x0054:
            r1 = move-exception
            ck7 r2 = r4.f43896e     // Catch:{ all -> 0x0083 }
            r2.mo50247l(r4, r1)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "generated frame is invalid"
            r4.mo64891o(r0, r1, r3)     // Catch:{ all -> 0x0083 }
        L_0x005f:
            r4.mo64891o(r5, r6, r7)     // Catch:{ all -> 0x0083 }
            goto L_0x0077
        L_0x0063:
            r0 = -3
            if (r5 != r0) goto L_0x006b
            r5 = 1
            r4.mo64891o(r0, r6, r5)     // Catch:{ all -> 0x0083 }
            goto L_0x0077
        L_0x006b:
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r5 != r0) goto L_0x0073
            r4.mo64891o(r5, r6, r7)     // Catch:{ all -> 0x0083 }
            goto L_0x0077
        L_0x0073:
            r5 = -1
            r4.mo64891o(r5, r6, r3)     // Catch:{ all -> 0x0083 }
        L_0x0077:
            org.java_websocket.WebSocket$READYSTATE r5 = org.java_websocket.WebSocket.READYSTATE.CLOSING     // Catch:{ all -> 0x0083 }
            r4.mo64872A(r5)     // Catch:{ all -> 0x0083 }
            r5 = 0
            r4.f43886B = r5     // Catch:{ all -> 0x0083 }
            monitor-exit(r4)
            return
        L_0x0081:
            monitor-exit(r4)
            return
        L_0x0083:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket.C9058a.mo64879c(int, java.lang.String, boolean):void");
    }

    /* renamed from: d */
    public void mo64880d(InvalidDataException invalidDataException) {
        mo64879c(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    /* renamed from: e */
    public void mo64881e(int i, String str) {
        mo64882f(i, str, false);
    }

    /* renamed from: f */
    public synchronized void mo64882f(int i, String str, boolean z) {
        if (mo64894r() != WebSocket.READYSTATE.CLOSED) {
            if (mo64894r() == WebSocket.READYSTATE.OPEN && i == 1006) {
                mo64872A(WebSocket.READYSTATE.CLOSING);
            }
            SelectionKey selectionKey = this.f43897g;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f43898k;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    if (!e.getMessage().equals("Broken pipe")) {
                        this.f43896e.mo50247l(this, e);
                    } else if (f43883X) {
                        System.out.println("Caught IOException: Broken pipe during closeConnection()");
                    }
                }
            }
            try {
                this.f43896e.mo50249n(this, i, str, z);
            } catch (RuntimeException e2) {
                this.f43896e.mo50247l(this, e2);
            }
            Draft draft = this.f43902y;
            if (draft != null) {
                draft.mo64918q();
            }
            this.f43887C = null;
            mo64872A(WebSocket.READYSTATE.CLOSED);
        }
    }

    /* renamed from: g */
    public void mo64883g(int i, boolean z) {
        mo64882f(i, "", z);
    }

    /* renamed from: h */
    public void mo50243h(Framedata framedata) {
        mo64902y(Collections.singletonList(framedata));
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final void mo64885i(RuntimeException runtimeException) {
        mo64875D(mo64892p(500));
        mo64891o(-1, runtimeException.getMessage(), false);
    }

    /* renamed from: j */
    public final void mo64886j(InvalidDataException invalidDataException) {
        mo64875D(mo64892p(404));
        mo64891o(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    /* renamed from: k */
    public void mo64887k(ByteBuffer byteBuffer) {
        String str;
        if (f43883X) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("process(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            if (byteBuffer.remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            sb.append(str);
            sb.append('}');
            printStream.println(sb.toString());
        }
        if (mo64894r() != WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            if (mo64894r() == WebSocket.READYSTATE.OPEN) {
                mo64888l(byteBuffer);
            }
        } else if (mo64889m(byteBuffer) && !mo64898u() && !mo64896t()) {
            if (byteBuffer.hasRemaining()) {
                mo64888l(byteBuffer);
            } else if (this.f43886B.hasRemaining()) {
                mo64888l(this.f43886B);
            }
        }
    }

    /* renamed from: l */
    public final void mo64888l(ByteBuffer byteBuffer) {
        try {
            for (Framedata next : this.f43902y.mo64920s(byteBuffer)) {
                if (f43883X) {
                    PrintStream printStream = System.out;
                    printStream.println("matched frame: " + next);
                }
                this.f43902y.mo64916m(this, next);
            }
        } catch (InvalidDataException e) {
            this.f43896e.mo50247l(this, e);
            mo64880d(e);
        }
    }

    /* renamed from: m */
    public final boolean mo64889m(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.f43886B.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f43886B.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.f43886B.capacity() + byteBuffer.remaining());
                this.f43886B.flip();
                allocate.put(this.f43886B);
                this.f43886B = allocate;
            }
            this.f43886B.put(byteBuffer);
            this.f43886B.flip();
            byteBuffer2 = this.f43886B;
        }
        byteBuffer2.mark();
        try {
            WebSocket.Role role = this.f43885A;
            if (role == WebSocket.Role.SERVER) {
                Draft draft = this.f43902y;
                if (draft == null) {
                    for (Draft e : this.f43901x) {
                        Draft e2 = e.mo64908e();
                        try {
                            e2.mo64919r(this.f43885A);
                            byteBuffer2.reset();
                            bl2 t = e2.mo64921t(byteBuffer2);
                            if (!(t instanceof lg0)) {
                                mo64886j(new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "wrong http function"));
                                return false;
                            }
                            lg0 lg0 = (lg0) t;
                            if (e2.mo64905b(lg0) == Draft.HandshakeState.MATCHED) {
                                this.f43891M = lg0.mo55892c();
                                try {
                                    mo64876E(e2.mo64911h(e2.mo64915l(lg0, this.f43896e.mo50915d(this, e2, lg0)), this.f43885A));
                                    this.f43902y = e2;
                                    mo64900w(lg0);
                                    return true;
                                } catch (InvalidDataException e3) {
                                    mo64886j(e3);
                                    return false;
                                } catch (RuntimeException e4) {
                                    this.f43896e.mo50247l(this, e4);
                                    mo64885i(e4);
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        } catch (InvalidHandshakeException unused) {
                        }
                    }
                    if (this.f43902y == null) {
                        mo64886j(new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "no draft matches"));
                    }
                    return false;
                }
                bl2 t2 = draft.mo64921t(byteBuffer2);
                if (!(t2 instanceof lg0)) {
                    mo64891o(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "wrong http function", false);
                    return false;
                }
                lg0 lg02 = (lg0) t2;
                if (this.f43902y.mo64905b(lg02) == Draft.HandshakeState.MATCHED) {
                    mo64900w(lg02);
                    return true;
                }
                mo64878b(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "the handshake did finaly not match");
                return false;
            }
            if (role == WebSocket.Role.CLIENT) {
                this.f43902y.mo64919r(role);
                bl2 t3 = this.f43902y.mo64921t(byteBuffer2);
                if (!(t3 instanceof bx5)) {
                    mo64891o(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "wrong http function", false);
                    return false;
                }
                bx5 bx5 = (bx5) t3;
                if (this.f43902y.mo64904a(this.f43887C, bx5) == Draft.HandshakeState.MATCHED) {
                    try {
                        this.f43896e.mo50918g(this, this.f43887C, bx5);
                        mo64900w(bx5);
                        return true;
                    } catch (InvalidDataException e5) {
                        mo64891o(e5.getCloseCode(), e5.getMessage(), false);
                        return false;
                    } catch (RuntimeException e6) {
                        this.f43896e.mo50247l(this, e6);
                        mo64891o(-1, e6.getMessage(), false);
                        return false;
                    }
                } else {
                    mo64878b(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "draft " + this.f43902y + " refuses handshake");
                }
            }
            return false;
        } catch (InvalidHandshakeException e7) {
            try {
                mo64880d(e7);
            } catch (IncompleteHandshakeException e8) {
                if (this.f43886B.capacity() == 0) {
                    byteBuffer2.reset();
                    int preferedSize = e8.getPreferedSize();
                    if (preferedSize == 0) {
                        preferedSize = byteBuffer2.capacity() + 16;
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(preferedSize);
                    this.f43886B = allocate2;
                    allocate2.put(byteBuffer);
                } else {
                    ByteBuffer byteBuffer3 = this.f43886B;
                    byteBuffer3.position(byteBuffer3.limit());
                    ByteBuffer byteBuffer4 = this.f43886B;
                    byteBuffer4.limit(byteBuffer4.capacity());
                }
            }
        }
    }

    /* renamed from: n */
    public void mo64890n() {
        if (mo64894r() == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            mo64883g(-1, true);
        } else if (this.f43899r) {
            mo64882f(this.f43889I.intValue(), this.f43888H, this.f43890L.booleanValue());
        } else if (this.f43902y.mo64913j() == Draft.CloseHandshakeType.NONE) {
            mo64883g(1000, true);
        } else if (this.f43902y.mo64913j() != Draft.CloseHandshakeType.ONEWAY) {
            mo64883g(1006, true);
        } else if (this.f43885A == WebSocket.Role.SERVER) {
            mo64883g(1006, true);
        } else {
            mo64883g(1000, true);
        }
    }

    /* renamed from: o */
    public synchronized void mo64891o(int i, String str, boolean z) {
        if (!this.f43899r) {
            this.f43889I = Integer.valueOf(i);
            this.f43888H = str;
            this.f43890L = Boolean.valueOf(z);
            this.f43899r = true;
            this.f43896e.mo50244i(this);
            try {
                this.f43896e.mo50241a(this, i, str, z);
            } catch (RuntimeException e) {
                this.f43896e.mo50247l(this, e);
            }
            Draft draft = this.f43902y;
            if (draft != null) {
                draft.mo64918q();
            }
            this.f43887C = null;
        }
    }

    /* renamed from: p */
    public final ByteBuffer mo64892p(int i) {
        String str;
        if (i != 404) {
            str = "500 Internal Server Error";
        } else {
            str = "404 WebSocket Upgrade Failure";
        }
        return ByteBuffer.wrap(zd0.m74857a("HTTP/1.1 " + str + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    /* renamed from: q */
    public long mo64893q() {
        return this.f43892P;
    }

    /* renamed from: r */
    public WebSocket.READYSTATE mo64894r() {
        return this.f43900s;
    }

    /* renamed from: s */
    public ck7 mo64895s() {
        return this.f43896e;
    }

    /* renamed from: t */
    public boolean mo64896t() {
        if (mo64894r() == WebSocket.READYSTATE.CLOSED) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public boolean mo64898u() {
        if (mo64894r() == WebSocket.READYSTATE.CLOSING) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo64899v() {
        if (mo64894r() == WebSocket.READYSTATE.OPEN) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void mo64900w(bl2 bl2) {
        if (f43883X) {
            PrintStream printStream = System.out;
            printStream.println("open using draft: " + this.f43902y);
        }
        mo64872A(WebSocket.READYSTATE.OPEN);
        try {
            this.f43896e.mo50246k(this, bl2);
        } catch (RuntimeException e) {
            this.f43896e.mo50247l(this, e);
        }
    }

    /* renamed from: x */
    public void mo64901x(String str) throws WebsocketNotConnectedException {
        boolean z;
        if (str != null) {
            Draft draft = this.f43902y;
            if (this.f43885A == WebSocket.Role.CLIENT) {
                z = true;
            } else {
                z = false;
            }
            mo64902y(draft.mo64910g(str, z));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    /* renamed from: y */
    public final void mo64902y(Collection<Framedata> collection) {
        if (!mo64899v()) {
            throw new WebsocketNotConnectedException();
        } else if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (Framedata next : collection) {
                if (f43883X) {
                    PrintStream printStream = System.out;
                    printStream.println("send frame: " + next);
                }
                arrayList.add(this.f43902y.mo64909f(next));
            }
            mo64876E(arrayList);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    public void mo64903z() throws NotYetConnectedException {
        if (this.f43893Q == null) {
            this.f43893Q = new C9067g();
        }
        mo50243h(this.f43893Q);
    }
}
