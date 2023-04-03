package p000;

import kotlin.Metadata;
import kotlin.text.Regex;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lpn5;", "", "Lkotlin/text/Regex;", "b", "Lkotlin/text/Regex;", "value", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pn5 */
/* compiled from: StringNumberConversionsJVM.kt */
public final class pn5 {

    /* renamed from: a */
    public static final pn5 f44072a = new pn5();

    /* renamed from: b */
    public static final Regex f44073b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f44073b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
