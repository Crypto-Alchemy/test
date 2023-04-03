package java8.util;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java8.util.ImmutableCollections;

/* compiled from: ImmutableCollections */
final class ColSer implements Serializable {
    public static final int IMM_LIST = 1;
    public static final int IMM_MAP = 3;
    public static final int IMM_SET = 2;
    private static final long serialVersionUID = 6309168927139932177L;

    /* renamed from: a */
    public transient Object[] f30290a;
    private final int tag;

    public ColSer(int i, Object... objArr) {
        this.tag = i;
        this.f30290a = objArr;
    }

    /* renamed from: a */
    public static InvalidObjectException m46189a(RuntimeException runtimeException) {
        InvalidObjectException invalidObjectException = new InvalidObjectException("invalid object");
        invalidObjectException.initCause(runtimeException);
        return invalidObjectException;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            Object[] objArr = new Object[readInt];
            for (int i = 0; i < readInt; i++) {
                objArr[i] = objectInputStream.readObject();
            }
            this.f30290a = objArr;
            return;
        }
        throw new InvalidObjectException("negative length " + readInt);
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            Object[] objArr = this.f30290a;
            if (objArr != null) {
                int i = this.tag & 255;
                if (i == 1) {
                    return C6036b.m46205a(objArr);
                }
                if (i == 2) {
                    return C6055d.m46309b(objArr);
                }
                if (i != 3) {
                    throw new InvalidObjectException(String.format("invalid flags 0x%x", new Object[]{Integer.valueOf(this.tag)}));
                } else if (objArr.length == 0) {
                    return ImmutableCollections.m46192c();
                } else {
                    if (objArr.length != 2) {
                        return new ImmutableCollections.MapN(this.f30290a);
                    }
                    Object[] objArr2 = this.f30290a;
                    return new ImmutableCollections.Map1(objArr2[0], objArr2[1]);
                }
            } else {
                throw new InvalidObjectException("null array");
            }
        } catch (NullPointerException e) {
            throw m46189a(e);
        } catch (IllegalArgumentException e2) {
            throw m46189a(e2);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f30290a.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.f30290a;
            if (i < objArr.length) {
                objectOutputStream.writeObject(objArr[i]);
                i++;
            } else {
                return;
            }
        }
    }
}
