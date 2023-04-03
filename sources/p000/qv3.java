package p000;

/* renamed from: qv3 */
/* compiled from: MiddleOutFallbackStrategy */
public class qv3 implements w76 {

    /* renamed from: a */
    public final int f33273a;

    /* renamed from: b */
    public final w76[] f33274b;

    /* renamed from: c */
    public final rv3 f33275c;

    public qv3(int i, w76... w76Arr) {
        this.f33273a = i;
        this.f33274b = w76Arr;
        this.f33275c = new rv3(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo47281a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f33273a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (w76 w76 : this.f33274b) {
            if (stackTraceElementArr2.length <= this.f33273a) {
                break;
            }
            stackTraceElementArr2 = w76.mo47281a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f33273a) {
            return this.f33275c.mo47281a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
