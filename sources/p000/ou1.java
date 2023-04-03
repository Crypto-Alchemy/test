package p000;

/* renamed from: ou1 */
/* compiled from: Exceptions */
public final class ou1 {
    /* renamed from: a */
    public static void m49570a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
