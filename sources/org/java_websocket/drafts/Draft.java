package org.java_websocket.drafts;

import androidx.media3.common.PlaybackException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.java_websocket.C9058a;
import org.java_websocket.WebSocket;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExedeedException;
import org.java_websocket.framing.Framedata;

public abstract class Draft {

    /* renamed from: a */
    public WebSocket.Role f43903a = null;

    /* renamed from: b */
    public Framedata.Opcode f43904b = null;

    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    /* renamed from: n */
    public static ByteBuffer m70633n(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    /* renamed from: o */
    public static String m70634o(ByteBuffer byteBuffer) {
        ByteBuffer n = m70633n(byteBuffer);
        if (n == null) {
            return null;
        }
        return zd0.m74860d(n.array(), 0, n.limit());
    }

    /* JADX WARNING: type inference failed for: r10v21, types: [cx5, al2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.yk2 m70635u(java.nio.ByteBuffer r9, org.java_websocket.WebSocket.Role r10) throws org.java_websocket.exceptions.InvalidHandshakeException, org.java_websocket.exceptions.IncompleteHandshakeException {
        /*
            java.lang.String r0 = m70634o(r9)
            if (r0 == 0) goto L_0x0145
            java.lang.String r1 = " "
            r2 = 3
            java.lang.String[] r1 = r0.split(r1, r2)
            int r3 = r1.length
            if (r3 != r2) goto L_0x013f
            org.java_websocket.WebSocket$Role r2 = org.java_websocket.WebSocket.Role.CLIENT
            java.lang.String r3 = "Invalid status line received: "
            java.lang.String r4 = "HTTP/1.1"
            java.lang.String r5 = " Status line: "
            r6 = 2
            r7 = 1
            r8 = 0
            if (r10 != r2) goto L_0x007f
            r10 = r1[r7]
            java.lang.String r2 = "101"
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L_0x0060
            r10 = r1[r8]
            boolean r10 = r4.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0043
            al2 r10 = new al2
            r10.<init>()
            r0 = r1[r7]
            short r0 = java.lang.Short.parseShort(r0)
            r10.mo50254e(r0)
            r0 = r1[r6]
            r10.mo50255g(r0)
            goto L_0x009b
        L_0x0043:
            org.java_websocket.exceptions.InvalidHandshakeException r9 = new org.java_websocket.exceptions.InvalidHandshakeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r1 = r1[r8]
            r10.append(r1)
            r10.append(r5)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0060:
            org.java_websocket.exceptions.InvalidHandshakeException r9 = new org.java_websocket.exceptions.InvalidHandshakeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "Invalid status code received: "
            r10.append(r2)
            r1 = r1[r7]
            r10.append(r1)
            r10.append(r5)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x007f:
            r10 = r1[r8]
            java.lang.String r2 = "GET"
            boolean r10 = r2.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0120
            r10 = r1[r6]
            boolean r10 = r4.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0103
            zk2 r10 = new zk2
            r10.<init>()
            r0 = r1[r7]
            r10.mo56254f(r0)
        L_0x009b:
            java.lang.String r0 = m70634o(r9)
        L_0x009f:
            if (r0 == 0) goto L_0x00fa
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x00fa
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1, r6)
            int r1 = r0.length
            if (r1 != r6) goto L_0x00f2
            r1 = r0[r8]
            boolean r1 = r10.mo50616b(r1)
            java.lang.String r2 = ""
            java.lang.String r3 = "^ +"
            if (r1 == 0) goto L_0x00e2
            r1 = r0[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r0[r8]
            java.lang.String r5 = r10.mo50619h(r5)
            r4.append(r5)
            java.lang.String r5 = "; "
            r4.append(r5)
            r0 = r0[r7]
            java.lang.String r0 = r0.replaceFirst(r3, r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r10.put(r1, r0)
            goto L_0x00ed
        L_0x00e2:
            r1 = r0[r8]
            r0 = r0[r7]
            java.lang.String r0 = r0.replaceFirst(r3, r2)
            r10.put(r1, r0)
        L_0x00ed:
            java.lang.String r0 = m70634o(r9)
            goto L_0x009f
        L_0x00f2:
            org.java_websocket.exceptions.InvalidHandshakeException r9 = new org.java_websocket.exceptions.InvalidHandshakeException
            java.lang.String r10 = "not an http header"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x00fa:
            if (r0 == 0) goto L_0x00fd
            return r10
        L_0x00fd:
            org.java_websocket.exceptions.IncompleteHandshakeException r9 = new org.java_websocket.exceptions.IncompleteHandshakeException
            r9.<init>()
            throw r9
        L_0x0103:
            org.java_websocket.exceptions.InvalidHandshakeException r9 = new org.java_websocket.exceptions.InvalidHandshakeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r1 = r1[r6]
            r10.append(r1)
            r10.append(r5)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0120:
            org.java_websocket.exceptions.InvalidHandshakeException r9 = new org.java_websocket.exceptions.InvalidHandshakeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "Invalid request method received: "
            r10.append(r2)
            r1 = r1[r8]
            r10.append(r1)
            r10.append(r5)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x013f:
            org.java_websocket.exceptions.InvalidHandshakeException r9 = new org.java_websocket.exceptions.InvalidHandshakeException
            r9.<init>()
            throw r9
        L_0x0145:
            org.java_websocket.exceptions.IncompleteHandshakeException r10 = new org.java_websocket.exceptions.IncompleteHandshakeException
            int r9 = r9.capacity()
            int r9 = r9 + 128
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket.drafts.Draft.m70635u(java.nio.ByteBuffer, org.java_websocket.WebSocket$Role):yk2");
    }

    /* renamed from: a */
    public abstract HandshakeState mo64904a(lg0 lg0, bx5 bx5) throws InvalidHandshakeException;

    /* renamed from: b */
    public abstract HandshakeState mo64905b(lg0 lg0) throws InvalidHandshakeException;

    /* renamed from: c */
    public boolean mo64906c(bl2 bl2) {
        if (!bl2.mo50619h("Upgrade").equalsIgnoreCase("websocket") || !bl2.mo50619h("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public int mo64907d(int i) throws LimitExedeedException, InvalidDataException {
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "Negative count");
    }

    /* renamed from: e */
    public abstract Draft mo64908e();

    /* renamed from: f */
    public abstract ByteBuffer mo64909f(Framedata framedata);

    /* renamed from: g */
    public abstract List<Framedata> mo64910g(String str, boolean z);

    /* renamed from: h */
    public List<ByteBuffer> mo64911h(bl2 bl2, WebSocket.Role role) {
        return mo64912i(bl2, role, true);
    }

    /* renamed from: i */
    public List<ByteBuffer> mo64912i(bl2 bl2, WebSocket.Role role, boolean z) {
        byte[] bArr;
        int i;
        StringBuilder sb = new StringBuilder(100);
        if (bl2 instanceof lg0) {
            sb.append("GET ");
            sb.append(((lg0) bl2).mo55892c());
            sb.append(" HTTP/1.1");
        } else if (bl2 instanceof bx5) {
            sb.append("HTTP/1.1 101 ");
            sb.append(((bx5) bl2).mo50253a());
        } else {
            throw new IllegalArgumentException("unknown role");
        }
        sb.append("\r\n");
        Iterator<String> d = bl2.mo50617d();
        while (d.hasNext()) {
            String next = d.next();
            String h = bl2.mo50619h(next);
            sb.append(next);
            sb.append(": ");
            sb.append(h);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] a = zd0.m74857a(sb.toString());
        if (z) {
            bArr = bl2.getContent();
        } else {
            bArr = null;
        }
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + a.length);
        allocate.put(a);
        if (bArr != null) {
            allocate.put(bArr);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    /* renamed from: j */
    public abstract CloseHandshakeType mo64913j();

    /* renamed from: k */
    public abstract mg0 mo64914k(mg0 mg0) throws InvalidHandshakeException;

    /* renamed from: l */
    public abstract yk2 mo64915l(lg0 lg0, cx5 cx5) throws InvalidHandshakeException;

    /* renamed from: m */
    public abstract void mo64916m(C9058a aVar, Framedata framedata) throws InvalidDataException;

    /* renamed from: p */
    public int mo64917p(bl2 bl2) {
        String h = bl2.mo50619h("Sec-WebSocket-Version");
        if (h.length() > 0) {
            try {
                return new Integer(h.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* renamed from: q */
    public abstract void mo64918q();

    /* renamed from: r */
    public void mo64919r(WebSocket.Role role) {
        this.f43903a = role;
    }

    /* renamed from: s */
    public abstract List<Framedata> mo64920s(ByteBuffer byteBuffer) throws InvalidDataException;

    /* renamed from: t */
    public bl2 mo64921t(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        return m70635u(byteBuffer, this.f43903a);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
