package p000;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: uj4 */
public class uj4 {

    /* renamed from: a */
    public Hashtable f45084a;

    /* renamed from: b */
    public Vector f45085b;

    public uj4() {
        this(new Hashtable(), new Vector());
    }

    public uj4(Hashtable hashtable, Vector vector) {
        this.f45084a = hashtable;
        this.f45085b = vector;
    }

    /* renamed from: a */
    public C6843b4 mo66290a(C9156p4 p4Var) {
        return (C6843b4) this.f45084a.get(p4Var);
    }

    /* renamed from: b */
    public Enumeration mo66291b() {
        return this.f45085b.elements();
    }

    /* renamed from: c */
    public void mo66292c(C9156p4 p4Var, C6843b4 b4Var) {
        if (this.f45084a.containsKey(p4Var)) {
            this.f45084a.put(p4Var, b4Var);
            return;
        }
        this.f45084a.put(p4Var, b4Var);
        this.f45085b.addElement(p4Var);
    }
}
