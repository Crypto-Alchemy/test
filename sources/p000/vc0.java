package p000;

import com.walletconnect.android.internal.common.model.EnvelopeType;
import com.walletconnect.android.internal.common.model.MissingKeyException;
import com.walletconnect.android.internal.common.model.MissingParticipantsException;
import com.walletconnect.android.internal.common.model.UnknownEnvelopeTypeException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J*\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u0017\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J-\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, mo44877d2 = {"Lvc0;", "Lxh0;", "Les6;", "topic", "", "payload", "Lcom/walletconnect/android/internal/common/model/EnvelopeType;", "envelopeType", "Lqm4;", "participants", "a", "cipherText", "b", "", "encryptedPayloadBytes", "d", "Lty4;", "receiverPublicKey", "e", "([BLjava/lang/String;)Ljava/lang/String;", "nonceBytes", "input", "f", "g", "Lyj6;", "key", "nonce", "h", "(Ljava/lang/String;[B[B)[B", "c", "Lra3;", "Lra3;", "keyManagementRepository", "Lnc0;", "Lnc0;", "cha20Poly1305", "<init>", "(Lra3;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vc0 */
/* compiled from: ChaChaPolyCodec.kt */
public final class vc0 implements xh0 {

    /* renamed from: c */
    public static final C6598a f34902c = new C6598a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final ra3 f34903a;

    /* renamed from: b */
    public final nc0 f34904b = new nc0();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, mo44877d2 = {"Lvc0$a;", "", "", "", "a", "([B)B", "envelopeType", "", "ENVELOPE_TYPE_SIZE", "I", "KEY_SIZE", "NONCE_SIZE", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: vc0$a */
    /* compiled from: ChaChaPolyCodec.kt */
    public static final class C6598a {
        public C6598a() {
        }

        public /* synthetic */ C6598a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final byte mo48712a(byte[] bArr) {
            vx2.m53591g(bArr, "<this>");
            return bArr[0];
        }
    }

    public vc0(ra3 ra3) {
        vx2.m53591g(ra3, "keyManagementRepository");
        this.f34903a = ra3;
    }

    /* renamed from: a */
    public String mo48704a(es6 es6, String str, EnvelopeType envelopeType, qm4 qm4) throws UnknownEnvelopeTypeException, MissingParticipantsException {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(str, "payload");
        vx2.m53591g(envelopeType, "envelopeType");
        byte[] bytes = str.getBytes(ae0.f36435b);
        vx2.m53590f(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] d = x67.m54248d(12);
        byte id = envelopeType.getId();
        if (id == EnvelopeType.ZERO.getId()) {
            return mo48709f(es6, d, bytes, envelopeType);
        }
        if (id == EnvelopeType.ONE.getId()) {
            return mo48710g(qm4, d, bytes, envelopeType);
        }
        byte id2 = envelopeType.getId();
        throw new UnknownEnvelopeTypeException("Encrypt; Unknown envelope type: " + id2);
    }

    /* renamed from: b */
    public String mo48705b(es6 es6, String str) throws UnknownEnvelopeTypeException, MissingKeyException {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(str, "cipherText");
        byte[] a = C9223qx.m71364a(str);
        C6598a aVar = f34902c;
        vx2.m53590f(a, "encryptedPayloadBytes");
        byte a2 = aVar.mo48712a(a);
        if (a2 == EnvelopeType.ZERO.getId()) {
            return mo48707d(es6, a);
        }
        if (a2 == EnvelopeType.ONE.getId()) {
            ra3 ra3 = this.f34903a;
            String a3 = es6.mo42395a();
            return mo48708e(a, ra3.mo47359h("self_participant/" + a3));
        }
        throw new UnknownEnvelopeTypeException("Decrypt; Unknown envelope type: " + a2);
    }

    /* renamed from: c */
    public final byte[] mo48706c(String str, byte[] bArr, byte[] bArr2) {
        this.f34904b.mo56439h(false, new yl4(new va3(x67.m54247c(str)), bArr));
        byte[] bArr3 = new byte[this.f34904b.mo56437f(bArr2.length)];
        this.f34904b.mo56434c(bArr3, this.f34904b.mo56443l(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }

    /* renamed from: d */
    public final String mo48707d(es6 es6, byte[] bArr) {
        byte[] bArr2 = new byte[12];
        byte[] bArr3 = new byte[((bArr.length - 12) - 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        vx2.m53590f(wrap, "wrap(encryptedPayloadBytes)");
        wrap.get(new byte[1]);
        wrap.get(bArr2);
        wrap.get(bArr3);
        return new String(mo48706c(this.f34903a.mo47353b(es6.mo42395a()), bArr2, bArr3), ae0.f36435b);
    }

    /* renamed from: e */
    public final String mo48708e(byte[] bArr, String str) {
        if (str != null) {
            byte[] bArr2 = new byte[12];
            byte[] bArr3 = new byte[32];
            byte[] bArr4 = new byte[(((bArr.length - 12) - 32) - 1)];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            vx2.m53590f(wrap, "wrap(encryptedPayloadBytes)");
            wrap.get(new byte[1]);
            wrap.get(bArr3);
            wrap.get(bArr2);
            wrap.get(bArr4);
            return new String(mo48706c(this.f34903a.mo47357f(str, ty4.m52569c(x67.m54245a(bArr3))), bArr2, bArr4), ae0.f36435b);
        }
        throw new MissingKeyException("Missing receiver public key");
    }

    /* renamed from: f */
    public final String mo48709f(es6 es6, byte[] bArr, byte[] bArr2, EnvelopeType envelopeType) {
        byte[] h = mo48711h(this.f34903a.mo47353b(es6.mo42395a()), bArr, bArr2);
        String c = C9223qx.m71366c(ByteBuffer.allocate(h.length + 12 + 1).put(envelopeType.getId()).put(bArr).put(h).array());
        vx2.m53590f(c, "toBase64String(encryptedPayloadBytes)");
        return c;
    }

    /* renamed from: g */
    public final String mo48710g(qm4 qm4, byte[] bArr, byte[] bArr2, EnvelopeType envelopeType) {
        throw new MissingParticipantsException("Missing participants when encrypting envelope type 1");
    }

    /* renamed from: h */
    public final byte[] mo48711h(String str, byte[] bArr, byte[] bArr2) {
        this.f34904b.mo56439h(true, new yl4(new va3(x67.m54247c(str)), bArr));
        byte[] bArr3 = new byte[this.f34904b.mo56437f(bArr2.length)];
        this.f34904b.mo56434c(bArr3, this.f34904b.mo56443l(bArr2, 0, bArr2.length, bArr3, 0));
        return bArr3;
    }
}
