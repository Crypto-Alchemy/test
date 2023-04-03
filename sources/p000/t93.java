package p000;

/* renamed from: t93 */
public class t93 extends C7002dw implements Cloneable {
    public t93(int i) {
        super(new u93(i));
    }

    public Object clone() throws CloneNotSupportedException {
        C7002dw dwVar = (C7002dw) super.clone();
        dwVar.f37405a = new u93((u93) this.f37405a);
        return dwVar;
    }
}
