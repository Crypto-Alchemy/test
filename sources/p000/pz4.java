package p000;

import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a$\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u001a\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"+\u0010\f\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010\r\"\u00020\u00002\u00020\u0000¨\u0006\u000e"}, mo44877d2 = {"", "name", "Lgb6;", "d", "", "E", "enum", "Loz4;", "c", "a", "b", "(Ljava/lang/Enum;)Loz4;", "qualifier", "QualifierValue", "koin-core"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: pz4 */
/* compiled from: Qualifier.kt */
public final class pz4 {
    /* renamed from: a */
    public static final gb6 m71132a(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return new gb6(str);
    }

    /* renamed from: b */
    public static final <E extends Enum<E>> oz4 m71133b(Enum<E> enumR) {
        vx2.m53591g(enumR, "<this>");
        String lowerCase = enumR.toString().toLowerCase();
        vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase()");
        return new gb6(lowerCase);
    }

    /* renamed from: c */
    public static final <E extends Enum<E>> oz4 m71134c(Enum<E> enumR) {
        vx2.m53591g(enumR, "enum");
        return m71133b(enumR);
    }

    /* renamed from: d */
    public static final gb6 m71135d(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        return new gb6(str);
    }
}
