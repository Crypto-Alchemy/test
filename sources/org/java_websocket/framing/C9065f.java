package org.java_websocket.framing;

import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;

/* renamed from: org.java_websocket.framing.f */
/* compiled from: FramedataImpl1 */
public abstract class C9065f implements Framedata {

    /* renamed from: a */
    public boolean f43918a = true;

    /* renamed from: b */
    public Framedata.Opcode f43919b;

    /* renamed from: c */
    public ByteBuffer f43920c = t60.m72161a();

    /* renamed from: d */
    public boolean f43921d = false;

    /* renamed from: e */
    public boolean f43922e = false;

    /* renamed from: f */
    public boolean f43923f = false;

    /* renamed from: g */
    public boolean f43924g = false;

    /* renamed from: org.java_websocket.framing.f$a */
    /* compiled from: FramedataImpl1 */
    public static /* synthetic */ class C9066a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43925a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.java_websocket.framing.Framedata$Opcode[] r0 = org.java_websocket.framing.Framedata.Opcode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43925a = r0
                org.java_websocket.framing.Framedata$Opcode r1 = org.java_websocket.framing.Framedata.Opcode.PING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43925a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.java_websocket.framing.Framedata$Opcode r1 = org.java_websocket.framing.Framedata.Opcode.PONG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43925a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.java_websocket.framing.Framedata$Opcode r1 = org.java_websocket.framing.Framedata.Opcode.TEXT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43925a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.java_websocket.framing.Framedata$Opcode r1 = org.java_websocket.framing.Framedata.Opcode.BINARY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43925a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.java_websocket.framing.Framedata$Opcode r1 = org.java_websocket.framing.Framedata.Opcode.CLOSING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f43925a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.java_websocket.framing.Framedata$Opcode r1 = org.java_websocket.framing.Framedata.Opcode.CONTINUOUS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.java_websocket.framing.C9065f.C9066a.<clinit>():void");
        }
    }

    public C9065f(Framedata.Opcode opcode) {
        this.f43919b = opcode;
    }

    /* renamed from: g */
    public static C9065f m70693g(Framedata.Opcode opcode) {
        if (opcode != null) {
            switch (C9066a.f43925a[opcode.ordinal()]) {
                case 1:
                    return new C9067g();
                case 2:
                    return new C9068h();
                case 3:
                    return new C9069i();
                case 4:
                    return new C9060a();
                case 5:
                    return new C9061b();
                case 6:
                    return new C9062c();
                default:
                    throw new IllegalArgumentException("Supplied opcode is invalid");
            }
        } else {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
    }

    /* renamed from: a */
    public boolean mo64940a() {
        return this.f43922e;
    }

    /* renamed from: b */
    public boolean mo64941b() {
        return this.f43923f;
    }

    /* renamed from: c */
    public Framedata.Opcode mo64942c() {
        return this.f43919b;
    }

    /* renamed from: d */
    public boolean mo64943d() {
        return this.f43924g;
    }

    /* renamed from: e */
    public boolean mo64944e() {
        return this.f43918a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9065f fVar = (C9065f) obj;
        if (this.f43918a != fVar.f43918a || this.f43921d != fVar.f43921d || this.f43922e != fVar.f43922e || this.f43923f != fVar.f43923f || this.f43924g != fVar.f43924g || this.f43919b != fVar.f43919b) {
            return false;
        }
        ByteBuffer byteBuffer = this.f43920c;
        ByteBuffer byteBuffer2 = fVar.f43920c;
        if (byteBuffer != null) {
            return byteBuffer.equals(byteBuffer2);
        }
        if (byteBuffer2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public ByteBuffer mo64945f() {
        return this.f43920c;
    }

    /* renamed from: h */
    public abstract void mo64946h() throws InvalidDataException;

    public int hashCode() {
        int i;
        int hashCode = (((this.f43918a ? 1 : 0) * true) + this.f43919b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.f43920c;
        if (byteBuffer != null) {
            i = byteBuffer.hashCode();
        } else {
            i = 0;
        }
        return ((((((((hashCode + i) * 31) + (this.f43921d ? 1 : 0)) * 31) + (this.f43922e ? 1 : 0)) * 31) + (this.f43923f ? 1 : 0)) * 31) + (this.f43924g ? 1 : 0);
    }

    /* renamed from: i */
    public void mo64956i(boolean z) {
        this.f43918a = z;
    }

    /* renamed from: j */
    public void mo64947j(ByteBuffer byteBuffer) {
        this.f43920c = byteBuffer;
    }

    /* renamed from: k */
    public void mo64957k(boolean z) {
        this.f43922e = z;
    }

    /* renamed from: l */
    public void mo64958l(boolean z) {
        this.f43923f = z;
    }

    /* renamed from: m */
    public void mo64959m(boolean z) {
        this.f43924g = z;
    }

    /* renamed from: n */
    public void mo64960n(boolean z) {
        this.f43921d = z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ optcode:");
        sb.append(mo64942c());
        sb.append(", fin:");
        sb.append(mo64944e());
        sb.append(", rsv1:");
        sb.append(mo64940a());
        sb.append(", rsv2:");
        sb.append(mo64941b());
        sb.append(", rsv3:");
        sb.append(mo64943d());
        sb.append(", payloadlength:[pos:");
        sb.append(this.f43920c.position());
        sb.append(", len:");
        sb.append(this.f43920c.remaining());
        sb.append("], payload:");
        if (this.f43920c.remaining() > 1000) {
            str = "(too big to display)";
        } else {
            str = new String(this.f43920c.array());
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
