package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u001b\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\t\b\u0016¢\u0006\u0004\b\u0011\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo44877d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "Lr37;", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "collection", "Ljava/util/Collection;", "", "tag", "I", "<init>", "(Ljava/util/Collection;I)V", "()V", "Companion", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ListBuilder.kt */
public final class SerializedCollection implements Externalizable {
    public static final C6185a Companion = new C6185a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private Collection<?> collection;
    private final int tag;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lkotlin/collections/builders/SerializedCollection$a;", "", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.SerializedCollection$a */
    /* compiled from: ListBuilder.kt */
    public static final class C6185a {
        public C6185a() {
        }

        public /* synthetic */ C6185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializedCollection(Collection<?> collection2, int i) {
        vx2.m53591g(collection2, "collection");
        this.collection = collection2;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    public void readExternal(ObjectInput objectInput) {
        Collection<?> collection2;
        vx2.m53591g(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    List d = bk0.m32597d(readInt);
                    while (i < readInt) {
                        d.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = bk0.m32594a(d);
                } else if (b == 1) {
                    Set c = my5.m48547c(readInt);
                    while (i < readInt) {
                        c.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = my5.m48545a(c);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b + '.');
                }
                this.collection = collection2;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + '.');
    }

    public void writeExternal(ObjectOutput objectOutput) {
        vx2.m53591g(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }

    public SerializedCollection() {
        this(ck0.m33062j(), 0);
    }
}
