package p018io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.reactivex.exceptions.CompositeException */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    /* renamed from: io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain */
    public static final class CompositeExceptionCausalChain extends RuntimeException {
        public static final String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        public String getMessage() {
            return MESSAGE;
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    public static abstract class C5979a {
        /* renamed from: a */
        public abstract void mo43705a(Object obj);
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    public static final class C5980b extends C5979a {

        /* renamed from: a */
        public final PrintStream f29998a;

        public C5980b(PrintStream printStream) {
            this.f29998a = printStream;
        }

        /* renamed from: a */
        public void mo43705a(Object obj) {
            this.f29998a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    public static final class C5981c extends C5979a {

        /* renamed from: a */
        public final PrintWriter f29999a;

        public C5981c(PrintWriter printWriter) {
            this.f29999a = printWriter;
        }

        /* renamed from: a */
        public void mo43705a(Object obj) {
            this.f29999a.println(obj);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CompositeException(Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    public final void mo43693a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            mo43693a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public final List<Throwable> mo43694b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause2 = th.getCause();
        if (cause2 != null && cause2 != th) {
            while (true) {
                arrayList.add(cause2);
                Throwable cause3 = cause2.getCause();
                if (cause3 == null || cause3 == cause2) {
                    break;
                }
                cause2 = cause3;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo43695c(C5979a aVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            mo43693a(sb, a, "\t");
            i++;
        }
        aVar.mo43705a(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain r0 = new io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.exceptions     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r8.mo43694b(r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = r8.getRootCause(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.cause = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getRootCause(Throwable th) {
        Throwable cause2 = th.getCause();
        if (cause2 == null || this.cause == cause2) {
            return th;
        }
        while (true) {
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return cause2;
            }
            cause2 = cause3;
        }
        return cause2;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.exceptions.size();
    }

    public void printStackTrace(PrintStream printStream) {
        mo43695c(new C5980b(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        mo43695c(new C5981c(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.exceptions = unmodifiableList;
            this.message = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
