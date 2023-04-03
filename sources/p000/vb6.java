package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "", "value", "i", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/text/StringsKt")
/* renamed from: vb6 */
/* compiled from: StringBuilder.kt */
public class vb6 extends ub6 {
    /* renamed from: i */
    public static final StringBuilder m73169i(StringBuilder sb, String... strArr) {
        vx2.m53591g(sb, "<this>");
        vx2.m53591g(strArr, "value");
        for (String append : strArr) {
            sb.append(append);
        }
        return sb;
    }
}
