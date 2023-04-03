package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, mo44877d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "Lr37;", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "map", "Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "()V", "Companion", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MapBuilder.kt */
final class SerializedMap implements Externalizable {
    public static final C6186a Companion = new C6186a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lkotlin/collections/builders/SerializedMap$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.builders.SerializedMap$a */
    /* compiled from: MapBuilder.kt */
    public static final class C6186a {
        public C6186a() {
        }

        public /* synthetic */ C6186a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializedMap(Map<?, ?> map2) {
        vx2.m53591g(map2, "map");
        this.map = map2;
    }

    private final Object readResolve() {
        return this.map;
    }

    public void readExternal(ObjectInput objectInput) {
        vx2.m53591g(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map d = ao3.m31892d(readInt);
                for (int i = 0; i < readInt; i++) {
                    d.put(objectInput.readObject(), objectInput.readObject());
                }
                this.map = ao3.m31890b(d);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        vx2.m53591g(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry next : this.map.entrySet()) {
            objectOutput.writeObject(next.getKey());
            objectOutput.writeObject(next.getValue());
        }
    }

    public SerializedMap() {
        this(C6177b.m47361i());
    }
}
