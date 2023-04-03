package p000;

import com.google.crypto.tink.C4650d;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: bc3 */
/* compiled from: KmsEnvelopeAead */
public final class bc3 implements C5954id {

    /* renamed from: c */
    public static final byte[] f21238c = new byte[0];

    /* renamed from: a */
    public final cb3 f21239a;

    /* renamed from: b */
    public final C5954id f21240b;

    public bc3(cb3 cb3, C5954id idVar) {
        this.f21239a = cb3;
        this.f21240b = idVar;
    }

    /* renamed from: a */
    public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] byteArray = C4650d.m37113i(this.f21239a).toByteArray();
        return mo29528c(this.f21240b.mo29526a(byteArray, f21238c), ((C5954id) C4650d.m37110f(this.f21239a.mo29915I(), byteArray, C5954id.class)).mo29526a(bArr, bArr2));
    }

    /* renamed from: b */
    public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((C5954id) C4650d.m37110f(this.f21239a.mo29915I(), this.f21240b.mo29527b(bArr3, f21238c), C5954id.class)).mo29527b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: c */
    public final byte[] mo29528c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}
