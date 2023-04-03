package p000;

/* renamed from: f30 */
public class f30 extends C7002dw implements Cloneable {
    public f30() {
        super(new g30(256));
    }

    public Object clone() throws CloneNotSupportedException {
        f30 f30 = (f30) super.clone();
        f30.f37405a = new g30((g30) this.f37405a);
        return f30;
    }
}
