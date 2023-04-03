package p000;

/* renamed from: rv3 */
/* compiled from: MiddleOutStrategy */
public class rv3 implements w76 {

    /* renamed from: a */
    public final int f33608a;

    public rv3(int i) {
        this.f33608a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo47281a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f33608a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
