package p000;

import com.squareup.moshi.C5401h;
import com.walletconnect.foundation.crypto.data.repository.JwtRepository;
import com.walletconnect.foundation.crypto.data.repository.model.IrnJWTHeader;
import com.walletconnect.foundation.crypto.data.repository.model.IrnJWTPayload;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p018io.ipfs.multibase.Multibase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b%\u0010&J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J$\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0011H\u0016J\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0002J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J \u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001d\u0010!\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u001f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, mo44877d2 = {"Lty;", "Lcom/walletconnect/foundation/crypto/data/repository/JwtRepository;", "", "key", "Ljv4;", "privateKey", "Lty4;", "publicKey", "Lr37;", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Pair;", "j", "", "signature", "b", "serverUrl", "Lkotlin/Function1;", "getIssuer", "a", "i", "g", "", "h", "d", "Lcom/walletconnect/foundation/crypto/data/repository/model/IrnJWTHeader;", "header", "Lcom/walletconnect/foundation/crypto/data/repository/model/IrnJWTPayload;", "payload", "c", "f", "T", "jsonObj", "e", "(Ljava/lang/Object;)Ljava/lang/String;", "issuedAt", "k", "<init>", "()V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ty */
/* compiled from: BaseJwtRepository.kt */
public abstract class C6557ty implements JwtRepository {

    /* renamed from: a */
    public static final C6558a f34415a = new C6558a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final IrnJWTHeader f34416b = new IrnJWTHeader("EdDSA", "JWT");

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, mo44877d2 = {"Lty$a;", "", "", "DID_DELIMITER", "Ljava/lang/String;", "DID_METHOD", "DID_PREFIX", "JWT_DELIMITER", "Lcom/walletconnect/foundation/crypto/data/repository/model/IrnJWTHeader;", "JWT_IRN_HEADER", "Lcom/walletconnect/foundation/crypto/data/repository/model/IrnJWTHeader;", "KEY_DID_KEYPAIR", "", "KEY_NONCE_SIZE", "I", "KEY_SIZE", "MULTICODEC_ED25519_HEADER", "<init>", "()V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ty$a */
    /* compiled from: BaseJwtRepository.kt */
    public static final class C6558a {
        public C6558a() {
        }

        public /* synthetic */ C6558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public String mo40703a(String str, rc2<? super String, r37> rc2) {
        vx2.m53591g(str, "serverUrl");
        vx2.m53591g(rc2, "getIssuer");
        String g = mo48270g();
        Pair<String, String> j = mo45697j();
        gn1 gn1 = new gn1(x67.m54247c(j.component2()));
        String d = mo48267d(x67.m54247c(j.component1()));
        rc2.invoke(d);
        long convert = TimeUnit.SECONDS.convert(mo48271h(), TimeUnit.MILLISECONDS);
        IrnJWTPayload irnJWTPayload = new IrnJWTPayload(d, g, str, convert, mo48273k(convert));
        IrnJWTHeader irnJWTHeader = f34416b;
        byte[] v = yb6.m74341v(mo48266c(irnJWTHeader, irnJWTPayload));
        in1 in1 = new in1();
        in1.mo52507b(true, gn1);
        in1.mo52509d(v, 0, v.length);
        byte[] a = in1.mo52506a();
        vx2.m53590f(a, "signature");
        return mo48269f(irnJWTHeader, irnJWTPayload, a);
    }

    /* renamed from: b */
    public abstract String mo45696b(byte[] bArr);

    /* renamed from: c */
    public final String mo48266c(IrnJWTHeader irnJWTHeader, IrnJWTPayload irnJWTPayload) {
        return CollectionsKt___CollectionsKt.m47338i0(ck0.m33065m(mo48268e(irnJWTHeader), mo48268e(irnJWTPayload)), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
    }

    /* renamed from: d */
    public final String mo48267d(byte[] bArr) {
        byte[] a = C6296nx.m49063a("K36");
        vx2.m53590f(a, "decode(MULTICODEC_ED25519_HEADER)");
        return CollectionsKt___CollectionsKt.m47338i0(ck0.m33065m("did", "key", Multibase.m45830a(Multibase.Base.Base58BTC, C6706xq.m54506t(a, bArr))), ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
    }

    /* renamed from: e */
    public final <T> String mo48268e(T t) {
        C5401h c = new C5401h.C5402a().mo39415b(new rc3()).mo39416c();
        vx2.m53588d(t);
        String h = c.mo39409d(t.getClass()).mo39367h(t);
        vx2.m53590f(h, "jsonString");
        byte[] bytes = h.getBytes(ae0.f36435b);
        vx2.m53590f(bytes, "this as java.lang.String).getBytes(charset)");
        return mo45696b(bytes);
    }

    /* renamed from: f */
    public final String mo48269f(IrnJWTHeader irnJWTHeader, IrnJWTPayload irnJWTPayload, byte[] bArr) {
        return CollectionsKt___CollectionsKt.m47338i0(ck0.m33065m(mo48268e(irnJWTHeader), mo48268e(irnJWTPayload), mo45696b(bArr)), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
    }

    /* renamed from: g */
    public final String mo48270g() {
        return x67.m54245a(x67.m54248d(32));
    }

    /* renamed from: h */
    public final long mo48271h() {
        return System.currentTimeMillis();
    }

    /* renamed from: i */
    public final Pair<String, String> mo48272i() {
        SecureRandom secureRandom = new SecureRandom(new byte[32]);
        fn1 fn1 = new fn1();
        fn1.mo51733b(new en1(secureRandom));
        C9314sr a = fn1.mo51732a();
        vx2.m53590f(a, "Ed25519KeyPairGenerator(…nerateKeyPair()\n        }");
        C9414ur b = a.mo65894b();
        vx2.m53589e(b, "null cannot be cast to non-null type org.bouncycastle.crypto.params.Ed25519PublicKeyParameters");
        C9414ur a2 = a.mo65893a();
        vx2.m53589e(a2, "null cannot be cast to non-null type org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters");
        byte[] encoded = ((hn1) b).getEncoded();
        vx2.m53590f(encoded, "publicKeyParameters.encoded");
        String c = ty4.m52569c(x67.m54245a(encoded));
        byte[] encoded2 = ((gn1) a2).getEncoded();
        vx2.m53590f(encoded2, "privateKeyParameters.encoded");
        String c2 = jv4.m46791c(x67.m54245a(encoded2));
        mo45698l("key_did_keypair", c2, c);
        return wy6.m54142a(c, c2);
    }

    /* renamed from: j */
    public abstract Pair<String, String> mo45697j();

    /* renamed from: k */
    public final long mo48273k(long j) {
        return j + TimeUnit.SECONDS.convert(1, TimeUnit.DAYS);
    }

    /* renamed from: l */
    public abstract void mo45698l(String str, String str2, String str3);
}
