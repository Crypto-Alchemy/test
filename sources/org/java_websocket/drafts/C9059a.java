package org.java_websocket.drafts;

import androidx.media3.common.PlaybackException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import okhttp3.internal.p023ws.WebSocketProtocol;
import org.java_websocket.C9058a;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExedeedException;
import org.java_websocket.exceptions.NotSendableException;
import org.java_websocket.framing.C9061b;
import org.java_websocket.framing.C9065f;
import org.java_websocket.framing.C9069i;
import org.java_websocket.framing.Framedata;

/* renamed from: org.java_websocket.drafts.a */
/* compiled from: Draft_6455 */
public class C9059a extends Draft {

    /* renamed from: c */
    public wn2 f43907c;

    /* renamed from: d */
    public List<wn2> f43908d;

    /* renamed from: e */
    public uo2 f43909e;

    /* renamed from: f */
    public List<uo2> f43910f;

    /* renamed from: g */
    public Framedata f43911g;

    /* renamed from: h */
    public List<ByteBuffer> f43912h;

    /* renamed from: i */
    public ByteBuffer f43913i;

    /* renamed from: j */
    public final Random f43914j;

    public C9059a() {
        this(Collections.emptyList());
    }

    /* renamed from: A */
    public List<uo2> mo64923A() {
        return this.f43910f;
    }

    /* renamed from: B */
    public final ByteBuffer mo64924B() throws LimitExedeedException {
        long j = 0;
        for (ByteBuffer limit : this.f43912h) {
            j += (long) limit.limit();
        }
        if (j <= 2147483647L) {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            for (ByteBuffer put : this.f43912h) {
                allocate.put(put);
            }
            allocate.flip();
            return allocate;
        }
        throw new LimitExedeedException("Payloadsize is to big...");
    }

    /* renamed from: C */
    public uo2 mo64925C() {
        return this.f43909e;
    }

    /* renamed from: D */
    public final String mo64926D() {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(instance.getTime());
    }

    /* renamed from: E */
    public final byte[] mo64927E(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((int) (j >>> (i2 - (i3 * 8))));
        }
        return bArr;
    }

    /* renamed from: F */
    public final Framedata.Opcode mo64928F(byte b) throws InvalidFrameException {
        if (b == 0) {
            return Framedata.Opcode.CONTINUOUS;
        }
        if (b == 1) {
            return Framedata.Opcode.TEXT;
        }
        if (b == 2) {
            return Framedata.Opcode.BINARY;
        }
        switch (b) {
            case 8:
                return Framedata.Opcode.CLOSING;
            case 9:
                return Framedata.Opcode.PING;
            case 10:
                return Framedata.Opcode.PONG;
            default:
                throw new InvalidFrameException("Unknown opcode " + ((short) b));
        }
    }

    /* renamed from: G */
    public Framedata mo64929G(ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        String str;
        ByteBuffer byteBuffer2 = byteBuffer;
        int remaining = byteBuffer.remaining();
        int i3 = 2;
        if (remaining >= 2) {
            byte b = byteBuffer.get();
            if ((b >> 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 64) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((b & 32) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((b & 16) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            byte b2 = byteBuffer.get();
            if ((b2 & Byte.MIN_VALUE) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            byte b3 = (byte) (b2 & Byte.MAX_VALUE);
            Framedata.Opcode F = mo64928F((byte) (b & 15));
            if (b3 >= 0 && b3 <= 125) {
                z6 = z2;
                i = b3;
            } else if (F == Framedata.Opcode.PING || F == Framedata.Opcode.PONG || F == Framedata.Opcode.CLOSING) {
                throw new InvalidFrameException("more than 125 octets");
            } else if (b3 != 126) {
                i3 = 10;
                if (remaining >= 10) {
                    byte[] bArr = new byte[8];
                    for (int i4 = 0; i4 < 8; i4++) {
                        bArr[i4] = byteBuffer.get();
                    }
                    z6 = z2;
                    long longValue = new BigInteger(bArr).longValue();
                    if (longValue <= 2147483647L) {
                        i = (int) longValue;
                    } else {
                        throw new LimitExedeedException("Payloadsize is to big...");
                    }
                } else {
                    throw new IncompleteException(10);
                }
            } else if (remaining >= 4) {
                byte[] bArr2 = new byte[3];
                bArr2[1] = byteBuffer.get();
                bArr2[2] = byteBuffer.get();
                z6 = z2;
                i = new BigInteger(bArr2).intValue();
                i3 = 4;
            } else {
                throw new IncompleteException(4);
            }
            if (z5) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            int i5 = i3 + i2 + i;
            if (remaining >= i5) {
                ByteBuffer allocate = ByteBuffer.allocate(mo64907d(i));
                if (z5) {
                    byte[] bArr3 = new byte[4];
                    byteBuffer2.get(bArr3);
                    for (int i6 = 0; i6 < i; i6++) {
                        allocate.put((byte) (byteBuffer.get() ^ bArr3[i6 % 4]));
                    }
                } else {
                    allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                    byteBuffer2.position(byteBuffer.position() + allocate.limit());
                }
                C9065f g = C9065f.m70693g(F);
                g.mo64956i(z);
                g.mo64957k(z6);
                g.mo64958l(z3);
                g.mo64959m(z4);
                allocate.flip();
                g.mo64947j(allocate);
                mo64935y().mo66743g(g);
                mo64935y().mo66739c(g);
                if (C9058a.f43883X) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("afterDecoding(");
                    sb.append(g.mo64945f().remaining());
                    sb.append("): {");
                    if (g.mo64945f().remaining() > 1000) {
                        str = "too big to display";
                    } else {
                        str = new String(g.mo64945f().array());
                    }
                    sb.append(str);
                    sb.append('}');
                    printStream.println(sb.toString());
                }
                g.mo64946h();
                return g;
            }
            throw new IncompleteException(i5);
        }
        throw new IncompleteException(2);
    }

    /* renamed from: a */
    public Draft.HandshakeState mo64904a(lg0 lg0, bx5 bx5) throws InvalidHandshakeException {
        if (!mo64906c(bx5)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (!lg0.mo50616b("Sec-WebSocket-Key") || !bx5.mo50616b("Sec-WebSocket-Accept")) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (!mo64934x(lg0.mo50619h("Sec-WebSocket-Key")).equals(bx5.mo50619h("Sec-WebSocket-Accept"))) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        String h = bx5.mo50619h("Sec-WebSocket-Extensions");
        Iterator<wn2> it = this.f43908d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            wn2 next = it.next();
            if (next.mo66741e(h)) {
                this.f43907c = next;
                handshakeState = Draft.HandshakeState.MATCHED;
                break;
            }
        }
        Draft.HandshakeState handshakeState2 = Draft.HandshakeState.NOT_MATCHED;
        String h2 = bx5.mo50619h("Sec-WebSocket-Protocol");
        Iterator<uo2> it2 = this.f43910f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            uo2 next2 = it2.next();
            if (next2.mo51818b(h2)) {
                this.f43909e = next2;
                handshakeState2 = Draft.HandshakeState.MATCHED;
                break;
            }
        }
        Draft.HandshakeState handshakeState3 = Draft.HandshakeState.MATCHED;
        if (handshakeState2 == handshakeState3 && handshakeState == handshakeState3) {
            return handshakeState3;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    /* renamed from: b */
    public Draft.HandshakeState mo64905b(lg0 lg0) throws InvalidHandshakeException {
        if (mo64917p(lg0) != 13) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        String h = lg0.mo50619h("Sec-WebSocket-Extensions");
        Iterator<wn2> it = this.f43908d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            wn2 next = it.next();
            if (next.mo66738b(h)) {
                this.f43907c = next;
                handshakeState = Draft.HandshakeState.MATCHED;
                break;
            }
        }
        Draft.HandshakeState handshakeState2 = Draft.HandshakeState.NOT_MATCHED;
        String h2 = lg0.mo50619h("Sec-WebSocket-Protocol");
        Iterator<uo2> it2 = this.f43910f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            uo2 next2 = it2.next();
            if (next2.mo51818b(h2)) {
                this.f43909e = next2;
                handshakeState2 = Draft.HandshakeState.MATCHED;
                break;
            }
        }
        Draft.HandshakeState handshakeState3 = Draft.HandshakeState.MATCHED;
        if (handshakeState2 == handshakeState3 && handshakeState == handshakeState3) {
            return handshakeState3;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    /* renamed from: e */
    public Draft mo64908e() {
        ArrayList arrayList = new ArrayList();
        for (wn2 a : mo64936z()) {
            arrayList.add(a.mo66737a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (uo2 a2 : mo64923A()) {
            arrayList2.add(a2.mo51817a());
        }
        return new C9059a(arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9059a aVar = (C9059a) obj;
        wn2 wn2 = this.f43907c;
        if (wn2 == null ? aVar.f43907c != null : !wn2.equals(aVar.f43907c)) {
            return false;
        }
        uo2 uo2 = this.f43909e;
        uo2 uo22 = aVar.f43909e;
        if (uo2 != null) {
            return uo2.equals(uo22);
        }
        if (uo22 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public ByteBuffer mo64909f(Framedata framedata) {
        String str;
        mo64935y().mo66742f(framedata);
        if (C9058a.f43883X) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("afterEnconding(");
            sb.append(framedata.mo64945f().remaining());
            sb.append("): {");
            if (framedata.mo64945f().remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(framedata.mo64945f().array());
            }
            sb.append(str);
            sb.append('}');
            printStream.println(sb.toString());
        }
        return mo64932v(framedata);
    }

    /* renamed from: g */
    public List<Framedata> mo64910g(String str, boolean z) {
        C9069i iVar = new C9069i();
        iVar.mo64947j(ByteBuffer.wrap(zd0.m74862f(str)));
        iVar.mo64960n(z);
        try {
            iVar.mo64946h();
            return Collections.singletonList(iVar);
        } catch (InvalidDataException e) {
            throw new NotSendableException((Throwable) e);
        }
    }

    public int hashCode() {
        int i;
        wn2 wn2 = this.f43907c;
        int i2 = 0;
        if (wn2 != null) {
            i = wn2.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        uo2 uo2 = this.f43909e;
        if (uo2 != null) {
            i2 = uo2.hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: j */
    public Draft.CloseHandshakeType mo64913j() {
        return Draft.CloseHandshakeType.TWOWAY;
    }

    /* renamed from: k */
    public mg0 mo64914k(mg0 mg0) {
        mg0.put("Upgrade", "websocket");
        mg0.put("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.f43914j.nextBytes(bArr);
        mg0.put("Sec-WebSocket-Key", C9287rx.m71689g(bArr));
        mg0.put("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        for (wn2 next : this.f43908d) {
            if (!(next.mo66740d() == null || next.mo66740d().length() == 0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(next.mo66740d());
            }
        }
        if (sb.length() != 0) {
            mg0.put("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (uo2 next2 : this.f43910f) {
            if (next2.mo51819c().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(next2.mo51819c());
            }
        }
        if (sb2.length() != 0) {
            mg0.put("Sec-WebSocket-Protocol", sb2.toString());
        }
        return mg0;
    }

    /* renamed from: l */
    public yk2 mo64915l(lg0 lg0, cx5 cx5) throws InvalidHandshakeException {
        cx5.put("Upgrade", "websocket");
        cx5.put("Connection", lg0.mo50619h("Connection"));
        String h = lg0.mo50619h("Sec-WebSocket-Key");
        if (h != null) {
            cx5.put("Sec-WebSocket-Accept", mo64934x(h));
            if (mo64935y().mo66744h().length() != 0) {
                cx5.put("Sec-WebSocket-Extensions", mo64935y().mo66744h());
            }
            if (!(mo64925C() == null || mo64925C().mo51819c().length() == 0)) {
                cx5.put("Sec-WebSocket-Protocol", mo64925C().mo51819c());
            }
            cx5.mo50255g("Web Socket Protocol Handshake");
            cx5.put("Server", "TooTallNate Java-WebSocket");
            cx5.put("Date", mo64926D());
            return cx5;
        }
        throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
    }

    /* renamed from: m */
    public void mo64916m(C9058a aVar, Framedata framedata) throws InvalidDataException {
        String str;
        Framedata.Opcode c = framedata.mo64942c();
        if (c == Framedata.Opcode.CLOSING) {
            int i = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
            if (framedata instanceof C9061b) {
                C9061b bVar = (C9061b) framedata;
                i = bVar.mo64948o();
                str = bVar.mo64949p();
            } else {
                str = "";
            }
            if (aVar.mo64894r() == WebSocket.READYSTATE.CLOSING) {
                aVar.mo64882f(i, str, true);
            } else if (mo64913j() == Draft.CloseHandshakeType.TWOWAY) {
                aVar.mo64879c(i, str, true);
            } else {
                aVar.mo64891o(i, str, false);
            }
        } else if (c == Framedata.Opcode.PING) {
            aVar.mo64895s().mo50917f(aVar, framedata);
        } else if (c == Framedata.Opcode.PONG) {
            aVar.mo64874C();
            aVar.mo64895s().mo50916e(aVar, framedata);
        } else if (!framedata.mo64944e() || c == Framedata.Opcode.CONTINUOUS) {
            if (c != Framedata.Opcode.CONTINUOUS) {
                if (this.f43911g == null) {
                    this.f43911g = framedata;
                    this.f43912h.add(framedata.mo64945f());
                } else {
                    throw new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "Previous continuous frame sequence not completed.");
                }
            } else if (framedata.mo64944e()) {
                if (this.f43911g != null) {
                    this.f43912h.add(framedata.mo64945f());
                    if (this.f43911g.mo64942c() == Framedata.Opcode.TEXT) {
                        ((C9065f) this.f43911g).mo64947j(mo64924B());
                        ((C9065f) this.f43911g).mo64946h();
                        try {
                            aVar.mo64895s().mo50248m(aVar, zd0.m74861e(this.f43911g.mo64945f()));
                        } catch (RuntimeException e) {
                            aVar.mo64895s().mo50247l(aVar, e);
                        }
                    } else if (this.f43911g.mo64942c() == Framedata.Opcode.BINARY) {
                        ((C9065f) this.f43911g).mo64947j(mo64924B());
                        ((C9065f) this.f43911g).mo64946h();
                        try {
                            aVar.mo64895s().mo50242c(aVar, this.f43911g.mo64945f());
                        } catch (RuntimeException e2) {
                            aVar.mo64895s().mo50247l(aVar, e2);
                        }
                    }
                    this.f43911g = null;
                    this.f43912h.clear();
                } else {
                    throw new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "Continuous frame sequence was not started.");
                }
            } else if (this.f43911g == null) {
                throw new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "Continuous frame sequence was not started.");
            }
            if (c == Framedata.Opcode.TEXT && !zd0.m74858b(framedata.mo64945f())) {
                throw new InvalidDataException(1007);
            } else if (c == Framedata.Opcode.CONTINUOUS && this.f43911g != null) {
                this.f43912h.add(framedata.mo64945f());
            }
        } else if (this.f43911g != null) {
            throw new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "Continuous frame sequence not completed.");
        } else if (c == Framedata.Opcode.TEXT) {
            try {
                aVar.mo64895s().mo50248m(aVar, zd0.m74861e(framedata.mo64945f()));
            } catch (RuntimeException e3) {
                aVar.mo64895s().mo50247l(aVar, e3);
            }
        } else if (c == Framedata.Opcode.BINARY) {
            try {
                aVar.mo64895s().mo50242c(aVar, framedata.mo64945f());
            } catch (RuntimeException e4) {
                aVar.mo64895s().mo50247l(aVar, e4);
            }
        } else {
            throw new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "non control or continious frame expected");
        }
    }

    /* renamed from: q */
    public void mo64918q() {
        this.f43913i = null;
        wn2 wn2 = this.f43907c;
        if (wn2 != null) {
            wn2.reset();
        }
        this.f43907c = new z71();
        this.f43909e = null;
    }

    /* renamed from: s */
    public List<Framedata> mo64920s(ByteBuffer byteBuffer) throws InvalidDataException {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f43913i == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f43913i.remaining();
                if (remaining2 > remaining) {
                    this.f43913i.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f43913i.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(mo64929G((ByteBuffer) this.f43913i.duplicate().position(0)));
                this.f43913i = null;
            } catch (IncompleteException e) {
                ByteBuffer allocate = ByteBuffer.allocate(mo64907d(e.getPreferredSize()));
                this.f43913i.rewind();
                allocate.put(this.f43913i);
                this.f43913i = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(mo64929G(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(mo64907d(e2.getPreferredSize()));
                this.f43913i = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public String toString() {
        String draft = super.toString();
        if (mo64935y() != null) {
            draft = draft + " extension: " + mo64935y().toString();
        }
        if (mo64925C() == null) {
            return draft;
        }
        return draft + " protocol: " + mo64925C().toString();
    }

    /* renamed from: v */
    public final ByteBuffer mo64932v(Framedata framedata) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        ByteBuffer f = framedata.mo64945f();
        int i5 = 0;
        if (this.f43903a == WebSocket.Role.CLIENT) {
            z = true;
        } else {
            z = false;
        }
        if (f.remaining() <= 125) {
            i = 1;
        } else if (f.remaining() <= 65535) {
            i = 2;
        } else {
            i = 8;
        }
        if (i > 1) {
            i2 = i + 1;
        } else {
            i2 = i;
        }
        int i6 = i2 + 1;
        if (z) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i6 + i3 + f.remaining());
        byte w = mo64933w(framedata.mo64942c());
        byte b = Byte.MIN_VALUE;
        if (framedata.mo64944e()) {
            i4 = -128;
        } else {
            i4 = 0;
        }
        allocate.put((byte) (((byte) i4) | w));
        byte[] E = mo64927E((long) f.remaining(), i);
        if (i == 1) {
            byte b2 = E[0];
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b2 | b));
        } else if (i == 2) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | 126));
            allocate.put(E);
        } else if (i == 8) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | Byte.MAX_VALUE));
            allocate.put(E);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f43914j.nextInt());
            allocate.put(allocate2.array());
            while (f.hasRemaining()) {
                allocate.put((byte) (f.get() ^ allocate2.get(i5 % 4)));
                i5++;
            }
        } else {
            allocate.put(f);
            f.flip();
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: w */
    public final byte mo64933w(Framedata.Opcode opcode) {
        if (opcode == Framedata.Opcode.CONTINUOUS) {
            return 0;
        }
        if (opcode == Framedata.Opcode.TEXT) {
            return 1;
        }
        if (opcode == Framedata.Opcode.BINARY) {
            return 2;
        }
        if (opcode == Framedata.Opcode.CLOSING) {
            return 8;
        }
        if (opcode == Framedata.Opcode.PING) {
            return 9;
        }
        if (opcode == Framedata.Opcode.PONG) {
            return 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + opcode.toString());
    }

    /* renamed from: x */
    public final String mo64934x(String str) {
        try {
            return C9287rx.m71689g(MessageDigest.getInstance("SHA1").digest((str.trim() + WebSocketProtocol.ACCEPT_MAGIC).getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: y */
    public wn2 mo64935y() {
        return this.f43907c;
    }

    /* renamed from: z */
    public List<wn2> mo64936z() {
        return this.f43908d;
    }

    public C9059a(List<wn2> list) {
        this(list, Collections.singletonList(new fy4("")));
    }

    public C9059a(List<wn2> list, List<uo2> list2) {
        this.f43907c = new z71();
        this.f43914j = new Random();
        if (list == null || list2 == null) {
            throw new IllegalArgumentException();
        }
        this.f43908d = new ArrayList(list.size());
        this.f43910f = new ArrayList(list2.size());
        boolean z = false;
        this.f43912h = new ArrayList();
        for (wn2 wn2 : list) {
            if (wn2.getClass().equals(z71.class)) {
                z = true;
            }
        }
        this.f43908d.addAll(list);
        if (!z) {
            List<wn2> list3 = this.f43908d;
            list3.add(list3.size(), this.f43907c);
        }
        this.f43910f.addAll(list2);
    }
}
