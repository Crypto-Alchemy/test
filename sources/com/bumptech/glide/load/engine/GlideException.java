package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {

    /* renamed from: a */
    public static final StackTraceElement[] f8779a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private z93 key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: b */
    public static void m12351b(List<Throwable> list, Appendable appendable) {
        try {
            m12352c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m12352c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).mo12455e(appendable);
            } else {
                m12353d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m12353d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void mo12454a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).getCauses()) {
                mo12454a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: e */
    public final void mo12455e(Appendable appendable) {
        m12353d(this, appendable);
        m12351b(getCauses(), new C1748a(appendable));
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass != null) {
            str = ", " + this.dataClass;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.dataSource != null) {
            str2 = ", " + this.dataSource;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.key != null) {
            str3 = ", " + this.key;
        }
        sb.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" root causes:");
        }
        for (Throwable next : rootCauses) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        mo12454a(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Throwable th = rootCauses.get(i);
            i = i2;
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(z93 z93, DataSource dataSource2) {
        setLoggingDetails(z93, dataSource2, (Class<?>) null);
    }

    public void setOrigin(Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        mo12455e(printStream);
    }

    public void setLoggingDetails(z93 z93, DataSource dataSource2, Class<?> cls) {
        this.key = z93;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f8779a);
        this.causes = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        mo12455e(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C1748a implements Appendable {

        /* renamed from: a */
        public final Appendable f8780a;

        /* renamed from: d */
        public boolean f8781d = true;

        public C1748a(Appendable appendable) {
            this.f8780a = appendable;
        }

        /* renamed from: a */
        public final CharSequence mo12468a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f8781d) {
                this.f8781d = false;
                this.f8780a.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f8781d = z;
            this.f8780a.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = mo12468a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = mo12468a(charSequence);
            boolean z = false;
            if (this.f8781d) {
                this.f8781d = false;
                this.f8780a.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f8781d = z;
            this.f8780a.append(a, i, i2);
            return this;
        }
    }
}
