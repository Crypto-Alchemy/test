package p000;

import com.walletconnect.android.internal.common.model.MissingKeyException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\nJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J%\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0!2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0004H\u0002R\u0014\u0010*\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010)\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, mo44877d2 = {"Lv30;", "Lra3;", "Lba3;", "key", "", "tag", "Lr37;", "e", "Lty4;", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Lyj6;", "b", "Les6;", "topic", "d", "(Les6;)Ljava/lang/String;", "self", "peer", "k", "(Les6;Ljava/lang/String;Ljava/lang/String;)V", "g", "()Ljava/lang/String;", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "c", "(Ljava/lang/String;Ljava/lang/String;)Les6;", "a", "publicKey", "Ljv4;", "privateKey", "l", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Pair;", "j", "(Lba3;)Lkotlin/Pair;", "m", "sharedSecret", "", "i", "Lbb3;", "Lbb3;", "keyChain", "<init>", "(Lbb3;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: v30 */
/* compiled from: BouncyCastleKeyManagementRepository.kt */
public final class v30 implements ra3 {

    /* renamed from: b */
    public static final C6596a f34825b = new C6596a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final bb3 f34826a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, mo44877d2 = {"Lv30$a;", "", "", "AES", "Ljava/lang/String;", "KEY_AGREEMENT_CONTEXT", "", "KEY_SIZE", "I", "SHA_256", "SYM_KEY_SIZE", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: v30$a */
    /* compiled from: BouncyCastleKeyManagementRepository.kt */
    public static final class C6596a {
        public C6596a() {
        }

        public /* synthetic */ C6596a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public v30(bb3 bb3) {
        vx2.m53591g(bb3, "keyChain");
        this.f34826a = bb3;
    }

    /* renamed from: a */
    public void mo47352a(String str) throws MissingKeyException {
        vx2.m53591g(str, "tag");
        Pair<String, String> c = this.f34826a.mo29520c(str);
        if (c != null) {
            bb3 bb3 = this.f34826a;
            String lowerCase = c.component1().toLowerCase(Locale.ROOT);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            bb3.mo29523f(lowerCase);
            bb3.mo29523f(str);
            return;
        }
        throw new MissingKeyException("No key pair for tag: " + str);
    }

    /* renamed from: b */
    public String mo47353b(String str) throws MissingKeyException {
        vx2.m53591g(str, "tag");
        String a = this.f34826a.mo29518a(str);
        if (a != null) {
            return yj6.m54789c(a);
        }
        throw new MissingKeyException("No SymmetricKey for tag: " + str);
    }

    /* renamed from: c */
    public es6 mo47354c(String str, String str2) {
        vx2.m53591g(str, "self");
        vx2.m53591g(str2, "peer");
        String f = mo47357f(str, str2);
        es6 es6 = new es6(mo48655m(f));
        bb3 bb3 = this.f34826a;
        String lowerCase = es6.mo42395a().toLowerCase(Locale.ROOT);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        bb3.mo29519b(lowerCase, yj6.m54788b(f));
        mo48653k(es6, str, str2);
        return es6;
    }

    /* renamed from: d */
    public String mo47355d(es6 es6) throws MissingKeyException {
        vx2.m53591g(es6, "topic");
        String str = "key_agreement/" + es6.mo42395a();
        Pair<String, String> c = this.f34826a.mo29520c(str);
        if (c != null) {
            return ty4.m52569c(c.component1());
        }
        throw new MissingKeyException("No key pair for tag: " + str);
    }

    /* renamed from: e */
    public void mo47356e(ba3 ba3, String str) {
        vx2.m53591g(ba3, "key");
        vx2.m53591g(str, "tag");
        this.f34826a.mo29519b(str, ba3);
    }

    /* renamed from: f */
    public String mo47357f(String str, String str2) {
        vx2.m53591g(str, "self");
        vx2.m53591g(str2, "peer");
        byte[] bArr = new byte[32];
        xn7.m74025f(x67.m54247c(mo48652j(ty4.m52568b(str)).component2().mo44621g()), 0, x67.m54247c(str2), 0, bArr, 0);
        return yj6.m54789c(x67.m54245a(mo48651i(x67.m54245a(bArr))));
    }

    /* renamed from: g */
    public String mo47358g() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        xn7.m74022c(new SecureRandom(new byte[32]), bArr2);
        xn7.m74023d(bArr2, 0, bArr, 0);
        String a = x67.m54245a(bArr);
        Locale locale = Locale.ROOT;
        String lowerCase = a.toLowerCase(locale);
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String c = ty4.m52569c(lowerCase);
        String lowerCase2 = x67.m54245a(bArr2).toLowerCase(locale);
        vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        mo48654l(c, jv4.m46791c(lowerCase2));
        String lowerCase3 = x67.m54245a(bArr).toLowerCase(locale);
        vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return ty4.m52569c(lowerCase3);
    }

    /* renamed from: h */
    public String mo47359h(String str) throws MissingKeyException {
        vx2.m53591g(str, "tag");
        String a = this.f34826a.mo29518a(str);
        if (a != null) {
            return ty4.m52569c(a);
        }
        throw new MissingKeyException("No PublicKey for tag: " + str);
    }

    /* renamed from: i */
    public final byte[] mo48651i(String str) {
        ik2 ik2 = new ik2(new bj5());
        byte[] bArr = new byte[32];
        ik2.mo52495d(new jk2(x67.m54247c(str), new byte[0], new byte[0]));
        ik2.mo52494c(bArr, 0, 32);
        return bArr;
    }

    /* renamed from: j */
    public final Pair<ty4, jv4> mo48652j(ba3 ba3) throws MissingKeyException {
        vx2.m53591g(ba3, "key");
        Pair<String, String> c = this.f34826a.mo29520c(ba3.mo29510a());
        if (c != null) {
            return new Pair<>(ty4.m52568b(ty4.m52569c(c.component1())), jv4.m46790b(jv4.m46791c(c.component2())));
        }
        String a = ba3.mo29510a();
        throw new MissingKeyException("No key pair for tag: " + a);
    }

    /* renamed from: k */
    public void mo48653k(es6 es6, String str, String str2) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(str, "self");
        vx2.m53591g(str2, "peer");
        String a = es6.mo42395a();
        this.f34826a.mo29521d("key_agreement/" + a, ty4.m52568b(str), ty4.m52568b(str2));
    }

    /* renamed from: l */
    public final void mo48654l(String str, String str2) {
        vx2.m53591g(str, "publicKey");
        vx2.m53591g(str2, "privateKey");
        this.f34826a.mo29521d(str, ty4.m52568b(str), jv4.m46790b(str2));
    }

    /* renamed from: m */
    public final String mo48655m(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        vx2.m53590f(instance, "getInstance(SHA_256)");
        byte[] digest = instance.digest(x67.m54247c(str));
        vx2.m53590f(digest, "messageDigest.digest(key.hexToBytes())");
        return x67.m54245a(digest);
    }
}
