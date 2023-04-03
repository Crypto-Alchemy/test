package p000;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4705c0;
import java.security.GeneralSecurityException;

/* renamed from: sa3 */
/* compiled from: KeyManager */
public interface sa3<P> {
    /* renamed from: a */
    KeyData mo47710a(ByteString byteString) throws GeneralSecurityException;

    /* renamed from: b */
    P mo47711b(ByteString byteString) throws GeneralSecurityException;

    /* renamed from: c */
    C4705c0 mo47712c(ByteString byteString) throws GeneralSecurityException;

    String getKeyType();
}
