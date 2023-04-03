package p000;

import android.util.Base64;
import com.walletconnect.android.internal.common.exception.CannotFindKeyPairException;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, mo44877d2 = {"Lm83;", "Lty;", "", "key", "Ljv4;", "privateKey", "Lty4;", "publicKey", "Lr37;", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "signature", "b", "Lkotlin/Pair;", "j", "", "m", "Lbb3;", "c", "Lbb3;", "keyChain", "<init>", "(Lbb3;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: m83 */
/* compiled from: JwtRepositoryAndroid.kt */
public final class m83 extends C6557ty {

    /* renamed from: c */
    public final bb3 f31537c;

    public m83(bb3 bb3) {
        vx2.m53591g(bb3, "keyChain");
        this.f31537c = bb3;
    }

    /* renamed from: b */
    public String mo45696b(byte[] bArr) {
        vx2.m53591g(bArr, "signature");
        String encodeToString = Base64.encodeToString(bArr, 11);
        vx2.m53590f(encodeToString, "encodeToString(signature…ADDING or Base64.NO_WRAP)");
        return encodeToString;
    }

    /* renamed from: j */
    public Pair<String, String> mo45697j() {
        if (!mo45699m()) {
            return mo48272i();
        }
        Pair<String, String> c = this.f31537c.mo29520c("key_did_keypair");
        if (c != null) {
            return wy6.m54142a(c.component2(), c.component1());
        }
        throw new CannotFindKeyPairException("No key pair for given tag: key_did_keypair");
    }

    /* renamed from: l */
    public void mo45698l(String str, String str2, String str3) {
        vx2.m53591g(str, "key");
        vx2.m53591g(str2, "privateKey");
        vx2.m53591g(str3, "publicKey");
        this.f31537c.mo29521d("key_did_keypair", jv4.m46790b(str2), ty4.m52568b(str3));
    }

    /* renamed from: m */
    public final boolean mo45699m() {
        return this.f31537c.mo29522e("key_did_keypair");
    }
}
