package p000;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0000\n\u0002\u0010 \n\u0002\u0010\"\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001ab\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0000\u001a\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u0011*\u00060\u000fj\u0002`\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0015\u001a\u00028\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, mo44877d2 = {"T", "", "", "e", "", "separator", "prefix", "postfix", "", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "c", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "b", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lrc2;)Ljava/lang/Appendable;", "element", "Lr37;", "a", "(Ljava/lang/Appendable;Ljava/lang/Object;Lrc2;)V", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ei3 */
/* compiled from: ListUtils.kt */
public final class ei3 {
    /* renamed from: a */
    public static final <T> void m16100a(Appendable appendable, T t, rc2<? super T, ? extends CharSequence> rc2) {
        boolean z;
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

    /* renamed from: b */
    public static final <T, A extends Appendable> A m16101b(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2<? super T, ? extends CharSequence> rc2) {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            m16100a(a, obj, rc2);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: c */
    public static final <T> String m16102c(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2<? super T, ? extends CharSequence> rc2) {
        vx2.m53591g(list, "<this>");
        vx2.m53591g(charSequence, "separator");
        vx2.m53591g(charSequence2, "prefix");
        vx2.m53591g(charSequence3, "postfix");
        vx2.m53591g(charSequence4, "truncated");
        String sb = ((StringBuilder) m16101b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, rc2)).toString();
        vx2.m53590f(sb, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb;
    }

    /* renamed from: d */
    public static /* synthetic */ String m16103d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2 rc2, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            rc2 = null;
        }
        return m16102c(list, charSequence, charSequence5, charSequence6, i3, charSequence7, rc2);
    }

    /* renamed from: e */
    public static final <T> Set<T> m16104e(List<? extends T> list) {
        vx2.m53591g(list, "<this>");
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(list.get(i));
        }
        return hashSet;
    }
}
