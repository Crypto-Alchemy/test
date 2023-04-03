package p000;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* renamed from: ay4 */
/* compiled from: ProtoKeySerialization */
public final class ay4 implements rw5 {

    /* renamed from: a */
    public final String f21070a;

    /* renamed from: b */
    public final e70 f21071b;

    /* renamed from: c */
    public final ByteString f21072c;

    /* renamed from: d */
    public final KeyData.KeyMaterialType f21073d;

    /* renamed from: e */
    public final OutputPrefixType f21074e;

    /* renamed from: f */
    public final Integer f21075f;

    public ay4(String str, ByteString byteString, KeyData.KeyMaterialType keyMaterialType, OutputPrefixType outputPrefixType, Integer num) {
        this.f21070a = str;
        this.f21071b = r67.m50957d(str);
        this.f21072c = byteString;
        this.f21073d = keyMaterialType;
        this.f21074e = outputPrefixType;
        this.f21075f = num;
    }

    /* renamed from: b */
    public static ay4 m32290b(String str, ByteString byteString, KeyData.KeyMaterialType keyMaterialType, OutputPrefixType outputPrefixType, Integer num) throws GeneralSecurityException {
        if (outputPrefixType == OutputPrefixType.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new ay4(str, byteString, keyMaterialType, outputPrefixType, num);
    }

    /* renamed from: a */
    public e70 mo29382a() {
        return this.f21071b;
    }

    /* renamed from: c */
    public Integer mo29383c() {
        return this.f21075f;
    }

    /* renamed from: d */
    public KeyData.KeyMaterialType mo29384d() {
        return this.f21073d;
    }

    /* renamed from: e */
    public OutputPrefixType mo29385e() {
        return this.f21074e;
    }

    /* renamed from: f */
    public String mo29386f() {
        return this.f21070a;
    }

    /* renamed from: g */
    public ByteString mo29387g() {
        return this.f21072c;
    }
}
