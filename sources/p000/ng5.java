package p000;

/* renamed from: ng5 */
/* compiled from: Retries */
public final class ng5 {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m48767a(int i, TInput tinput, bd2<TInput, TResult, TException> bd2, sg5<TInput, TResult> sg5) throws Throwable {
        TResult apply;
        if (i < 1) {
            return bd2.apply(tinput);
        }
        do {
            apply = bd2.apply(tinput);
            tinput = sg5.mo29525a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = bd2.apply(tinput);
            tinput = sg5.mo29525a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
