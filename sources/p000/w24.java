package p000;

import kotlin.text.Regex;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: w24 */
/* compiled from: NameUtils.kt */
public final class w24 {

    /* renamed from: a */
    public static final w24 f45418a = new w24();

    /* renamed from: b */
    public static final Regex f45419b = new Regex("[^\\p{L}\\p{Digit}]");

    /* renamed from: a */
    public static final String m73413a(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return f45419b.replace((CharSequence) str, "_");
    }
}
