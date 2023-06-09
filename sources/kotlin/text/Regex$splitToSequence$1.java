package kotlin.text;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo44877d2 = {"Ljw5;", "", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "kotlin.text.Regex$splitToSequence$1", mo48632f = "Regex.kt", mo48633l = {276, 284, 288}, mo48634m = "invokeSuspend")
/* compiled from: Regex.kt */
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements fd2<jw5<? super String>, ns0<? super r37>, Object> {
    public final /* synthetic */ CharSequence $input;
    public final /* synthetic */ int $limit;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i, ns0<? super Regex$splitToSequence$1> ns0) {
        super(2, ns0);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, ns0);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    public final Object invoke(jw5<? super String> jw5, ns0<? super r37> ns0) {
        return ((Regex$splitToSequence$1) create(jw5, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r10.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            p000.hg5.m45199b(r11)
            goto L_0x009f
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001f:
            int r1 = r10.I$0
            java.lang.Object r2 = r10.L$1
            java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
            java.lang.Object r6 = r10.L$0
            jw5 r6 = (p000.jw5) r6
            p000.hg5.m45199b(r11)
            r7 = r10
            r11 = r1
            r1 = r2
            goto L_0x0073
        L_0x0030:
            p000.hg5.m45199b(r11)
            goto L_0x00b1
        L_0x0035:
            p000.hg5.m45199b(r11)
            java.lang.Object r11 = r10.L$0
            jw5 r11 = (p000.jw5) r11
            kotlin.text.Regex r1 = r10.this$0
            java.util.regex.Pattern r1 = r1.nativePattern
            java.lang.CharSequence r6 = r10.$input
            java.util.regex.Matcher r1 = r1.matcher(r6)
            int r6 = r10.$limit
            if (r6 == r5) goto L_0x00a2
            boolean r6 = r1.find()
            if (r6 != 0) goto L_0x0053
            goto L_0x00a2
        L_0x0053:
            r7 = r10
            r6 = r11
            r11 = r2
        L_0x0056:
            java.lang.CharSequence r8 = r7.$input
            int r9 = r1.start()
            java.lang.CharSequence r2 = r8.subSequence(r2, r9)
            java.lang.String r2 = r2.toString()
            r7.L$0 = r6
            r7.L$1 = r1
            r7.I$0 = r11
            r7.label = r4
            java.lang.Object r2 = r6.mo52541a(r2, r7)
            if (r2 != r0) goto L_0x0073
            return r0
        L_0x0073:
            int r2 = r1.end()
            int r11 = r11 + r5
            int r8 = r7.$limit
            int r8 = r8 - r5
            if (r11 == r8) goto L_0x0083
            boolean r8 = r1.find()
            if (r8 != 0) goto L_0x0056
        L_0x0083:
            java.lang.CharSequence r11 = r7.$input
            int r1 = r11.length()
            java.lang.CharSequence r11 = r11.subSequence(r2, r1)
            java.lang.String r11 = r11.toString()
            r1 = 0
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r11 = r6.mo52541a(r11, r7)
            if (r11 != r0) goto L_0x009f
            return r0
        L_0x009f:
            r37 r11 = p000.r37.f33317a
            return r11
        L_0x00a2:
            java.lang.CharSequence r1 = r10.$input
            java.lang.String r1 = r1.toString()
            r10.label = r5
            java.lang.Object r11 = r11.mo52541a(r1, r10)
            if (r11 != r0) goto L_0x00b1
            return r0
        L_0x00b1:
            r37 r11 = p000.r37.f33317a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex$splitToSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
