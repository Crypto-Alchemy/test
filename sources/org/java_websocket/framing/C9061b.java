package org.java_websocket.framing;

import androidx.media3.common.PlaybackException;
import java.nio.ByteBuffer;
import okhttp3.internal.p023ws.WebSocketProtocol;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;

/* renamed from: org.java_websocket.framing.b */
/* compiled from: CloseFrame */
public class C9061b extends C9063d {

    /* renamed from: h */
    public int f43916h;

    /* renamed from: i */
    public String f43917i;

    public C9061b() {
        super(Framedata.Opcode.CLOSING);
        mo64951r("");
        mo64950q(1000);
    }

    /* renamed from: f */
    public ByteBuffer mo64945f() {
        if (this.f43916h == 1005) {
            return t60.m72161a();
        }
        return super.mo64945f();
    }

    /* renamed from: h */
    public void mo64946h() throws InvalidDataException {
        super.mo64946h();
        int i = this.f43916h;
        if (i == 1007 && this.f43917i == null) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        } else if (i != 1005 || this.f43917i.length() <= 0) {
            int i2 = this.f43916h;
            if (i2 > 1015 && i2 < 3000) {
                throw new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "Trying to send an illegal close code!");
            } else if (i2 == 1006 || i2 == 1015 || i2 == 1005 || i2 > 4999 || i2 < 1000 || i2 == 1004) {
                throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f43916h);
            }
        } else {
            throw new InvalidDataException((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, "A close frame must have a closecode if it has a reason");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        throw new org.java_websocket.exceptions.InvalidDataException(1007);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005f */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64947j(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            r0 = 1005(0x3ed, float:1.408E-42)
            r4.f43916h = r0
            java.lang.String r0 = ""
            r4.f43917i = r0
            r5.mark()
            int r0 = r5.remaining()
            if (r0 != 0) goto L_0x0016
            r5 = 1000(0x3e8, float:1.401E-42)
            r4.f43916h = r5
            goto L_0x006e
        L_0x0016:
            int r0 = r5.remaining()
            r1 = 1
            if (r0 != r1) goto L_0x0022
            r5 = 1002(0x3ea, float:1.404E-42)
            r4.f43916h = r5
            goto L_0x006e
        L_0x0022:
            int r0 = r5.remaining()
            r1 = 2
            if (r0 < r1) goto L_0x0042
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.position(r1)
            short r2 = r5.getShort()
            r0.putShort(r2)
            r2 = 0
            r0.position(r2)
            int r0 = r0.getInt()
            r4.f43916h = r0
        L_0x0042:
            r5.reset()
            r0 = 1007(0x3ef, float:1.411E-42)
            int r2 = r5.position()     // Catch:{ InvalidDataException -> 0x0069 }
            int r3 = r5.position()     // Catch:{ IllegalArgumentException -> 0x005f }
            int r3 = r3 + r1
            r5.position(r3)     // Catch:{ IllegalArgumentException -> 0x005f }
            java.lang.String r1 = p000.zd0.m74861e(r5)     // Catch:{ IllegalArgumentException -> 0x005f }
            r4.f43917i = r1     // Catch:{ IllegalArgumentException -> 0x005f }
            r5.position(r2)     // Catch:{ InvalidDataException -> 0x0069 }
            goto L_0x006e
        L_0x005d:
            r1 = move-exception
            goto L_0x0065
        L_0x005f:
            org.java_websocket.exceptions.InvalidDataException r1 = new org.java_websocket.exceptions.InvalidDataException     // Catch:{ all -> 0x005d }
            r1.<init>(r0)     // Catch:{ all -> 0x005d }
            throw r1     // Catch:{ all -> 0x005d }
        L_0x0065:
            r5.position(r2)     // Catch:{ InvalidDataException -> 0x0069 }
            throw r1     // Catch:{ InvalidDataException -> 0x0069 }
        L_0x0069:
            r4.f43916h = r0
            r5 = 0
            r4.f43917i = r5
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket.framing.C9061b.mo64947j(java.nio.ByteBuffer):void");
    }

    /* renamed from: o */
    public int mo64948o() {
        return this.f43916h;
    }

    /* renamed from: p */
    public String mo64949p() {
        return this.f43917i;
    }

    /* renamed from: q */
    public void mo64950q(int i) {
        this.f43916h = i;
        if (i == 1015) {
            this.f43916h = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
            this.f43917i = "";
        }
        mo64952s();
    }

    /* renamed from: r */
    public void mo64951r(String str) {
        if (str == null) {
            str = "";
        }
        this.f43917i = str;
        mo64952s();
    }

    /* renamed from: s */
    public final void mo64952s() {
        byte[] f = zd0.m74862f(this.f43917i);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.f43916h);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(f.length + 2);
        allocate2.put(allocate);
        allocate2.put(f);
        allocate2.rewind();
        super.mo64947j(allocate2);
    }

    public String toString() {
        return super.toString() + "code: " + this.f43916h;
    }
}
