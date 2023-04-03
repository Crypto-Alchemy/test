package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo44877d2 = {"T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "Lkotlin/Function1;", "", "transform", "Lr37;", "a", "(Ljava/lang/Appendable;Ljava/lang/Object;Lrc2;)V", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/StringsKt")
/* renamed from: rb6 */
/* compiled from: Appendable.kt */
public class rb6 {
    /* renamed from: a */
    public static final <T> void m71504a(Appendable appendable, T t, rc2<? super T, ? extends CharSequence> rc2) {
        boolean z;
        vx2.m53591g(appendable, "<this>");
        if (rc2 != null) {
            appendable.append((CharSequence) rc2.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
