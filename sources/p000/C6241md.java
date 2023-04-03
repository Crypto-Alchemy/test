package p000;

import com.google.errorprone.annotations.RestrictedApi;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p000.C6345pd;

/* renamed from: md */
/* compiled from: AesCmacKey */
public final class C6241md extends nm3 {

    /* renamed from: a */
    public final C6345pd f31656a;

    /* renamed from: b */
    public final tr5 f31657b;

    /* renamed from: c */
    public final Integer f31658c;

    public C6241md(C6345pd pdVar, tr5 tr5, Integer num) {
        this.f31656a = pdVar;
        this.f31657b = tr5;
        this.f31658c = num;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {C6643w7.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    /* renamed from: d */
    public static C6241md m48214d(C6345pd pdVar, tr5 tr5, Integer num) throws GeneralSecurityException {
        if (tr5.mo48161b() != 32) {
            throw new GeneralSecurityException("Invalid key size");
        } else if (pdVar.mo46698e() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        } else if (pdVar.mo46698e() || num == null) {
            return new C6241md(pdVar, tr5, num);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
    }

    /* renamed from: b */
    public e70 mo45740b() {
        if (this.f31656a.mo46697d() == C6345pd.C6346a.f32660e) {
            return e70.m43803a(new byte[0]);
        }
        if (this.f31656a.mo46697d() == C6345pd.C6346a.f32659d || this.f31656a.mo46697d() == C6345pd.C6346a.f32658c) {
            return e70.m43803a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f31658c.intValue()).array());
        }
        if (this.f31656a.mo46697d() == C6345pd.C6346a.f32657b) {
            return e70.m43803a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f31658c.intValue()).array());
        }
        throw new IllegalStateException("Unknown AesCmacParameters.Variant: " + this.f31656a.mo46697d());
    }

    /* renamed from: e */
    public C6345pd mo45741c() {
        return this.f31656a;
    }
}
