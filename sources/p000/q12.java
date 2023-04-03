package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo44877d2 = {"Lq12;", "Lyn2;", "", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "origin", "", "phrase", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: q12 */
/* compiled from: FilterTokenListByPhraseUseCase.kt */
public final class q12 implements yn2 {
    /* renamed from: a */
    public List<IToken> mo65415a(List<? extends IToken> list, String str) {
        vx2.m53591g(list, "origin");
        vx2.m53591g(str, "phrase");
        if (yb6.m74325B(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (IToken iToken : list) {
            String name = iToken.getName();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String obj = StringsKt__StringsKt.m63090V0(lowerCase).toString();
            String lowerCase2 = str.toLowerCase(locale);
            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!StringsKt__StringsKt.m63081R(obj, StringsKt__StringsKt.m63090V0(lowerCase2).toString(), false, 2, (Object) null)) {
                String lowerCase3 = iToken.getSymbol().toLowerCase(locale);
                vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String obj2 = StringsKt__StringsKt.m63090V0(lowerCase3).toString();
                String lowerCase4 = str.toLowerCase(locale);
                vx2.m53590f(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!StringsKt__StringsKt.m63081R(obj2, StringsKt__StringsKt.m63090V0(lowerCase4).toString(), false, 2, (Object) null)) {
                }
            }
            arrayList.add(iToken);
        }
        return arrayList;
    }
}
