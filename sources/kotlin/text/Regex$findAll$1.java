package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lno3;", "invoke", "()Lno3;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Regex.kt */
public final class Regex$findAll$1 extends Lambda implements pc2<no3> {
    public final /* synthetic */ CharSequence $input;
    public final /* synthetic */ int $startIndex;
    public final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$findAll$1(Regex regex, CharSequence charSequence, int i) {
        super(0);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$startIndex = i;
    }

    public final no3 invoke() {
        return this.this$0.find(this.$input, this.$startIndex);
    }
}
