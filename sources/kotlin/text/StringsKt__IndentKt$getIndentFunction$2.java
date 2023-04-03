package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "", "line", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Indent.kt */
public final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements rc2<String, String> {
    public final /* synthetic */ String $indent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__IndentKt$getIndentFunction$2(String str) {
        super(1);
        this.$indent = str;
    }

    public final String invoke(String str) {
        vx2.m53591g(str, "line");
        return this.$indent + str;
    }
}
