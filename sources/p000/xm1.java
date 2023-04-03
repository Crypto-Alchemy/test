package p000;

import java.security.SignatureException;
import kotlin.Metadata;
import org.web3j.abi.datatypes.Address;
import p000.c16;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0010"}, mo44877d2 = {"Lxm1;", "", "Lr16;", "signature", "", "originalMessage", "", "address", "", "c", "b", "Lc16$a;", "signedHash", "a", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xm1 */
/* compiled from: EIP191Verifier.kt */
public final class xm1 {

    /* renamed from: a */
    public static final xm1 f35658a = new xm1();

    /* renamed from: a */
    public final String mo49509a(c16.C6919a aVar, byte[] bArr) throws SignatureException {
        String address = qb3.getAddress(c16.signedPrefixedMessageToKey(bArr, aVar).toString(16));
        vx2.m53590f(address, "getAddress(Sign.signedPr…signedHash).toString(16))");
        return address;
    }

    /* renamed from: b */
    public final boolean mo49510b(r16 r16, String str, String str2) {
        vx2.m53591g(r16, "signature");
        vx2.m53591g(str, "originalMessage");
        vx2.m53591g(str2, Address.TYPE_NAME);
        byte[] bytes = str.getBytes(ae0.f36435b);
        vx2.m53590f(bytes, "this as java.lang.String).getBytes(charset)");
        return mo49511c(r16, bytes, str2);
    }

    /* renamed from: c */
    public final boolean mo49511c(r16 r16, byte[] bArr, String str) {
        vx2.m53591g(r16, "signature");
        vx2.m53591g(bArr, "originalMessage");
        vx2.m53591g(str, Address.TYPE_NAME);
        return yb6.m74344y(mo49509a(t16.m52043b(r16), bArr), vx2.m53591g(str, "<this>"), true);
    }
}
