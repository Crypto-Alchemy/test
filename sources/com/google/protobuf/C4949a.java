package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.C4949a;
import com.google.protobuf.C4949a.C4950a;
import com.google.protobuf.C4956c0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a */
/* compiled from: AbstractMessageLite */
public abstract class C4949a<MessageType extends C4949a<MessageType, BuilderType>, BuilderType extends C4950a<MessageType, BuilderType>> implements C4956c0 {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C4950a<MessageType extends C4949a<MessageType, BuilderType>, BuilderType extends C4950a<MessageType, BuilderType>> implements C4956c0.C4957a {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll(iterable, (List) collection);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public static UninitializedMessageException newUninitializedMessageException(C4956c0 c0Var) {
            return new UninitializedMessageException(c0Var);
        }

        public abstract BuilderType clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((InputStream) new C4951a(inputStream, C4969g.m39352y(read, inputStream)), lVar);
            return true;
        }

        public abstract BuilderType mergeFrom(C4969g gVar, C4987l lVar) throws IOException;

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            C5011t.m39927a(iterable);
            if (iterable instanceof wf3) {
                List<?> i = ((wf3) iterable).mo37547i();
                wf3 wf3 = (wf3) list;
                int size = list.size();
                for (Object next : i) {
                    if (next == null) {
                        String str = "Element at index " + (wf3.size() - size) + " is null.";
                        for (int size2 = wf3.size() - 1; size2 >= size; size2--) {
                            wf3.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof ByteString) {
                        wf3.mo37544K((ByteString) next);
                    } else {
                        wf3.add((String) next);
                    }
                }
            } else if (iterable instanceof bv4) {
                list.addAll((Collection) iterable);
            } else {
                addAllCheckingNulls(iterable, list);
            }
        }

        /* renamed from: com.google.protobuf.a$a$a */
        /* compiled from: AbstractMessageLite */
        public static final class C4951a extends FilterInputStream {

            /* renamed from: a */
            public int f25591a;

            public C4951a(InputStream inputStream, int i) {
                super(inputStream);
                this.f25591a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f25591a);
            }

            public int read() throws IOException {
                if (this.f25591a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f25591a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                int skip = (int) super.skip(Math.min(j, (long) this.f25591a));
                if (skip >= 0) {
                    this.f25591a -= skip;
                }
                return (long) skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f25591a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f25591a -= read;
                }
                return read;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, C4987l.m39771b());
        }

        public BuilderType mergeFrom(C4969g gVar) throws IOException {
            return mergeFrom(gVar, C4987l.m39771b());
        }

        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                C4969g newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput);
                newCodedInput.mo37246a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            try {
                C4969g newCodedInput = byteString.newCodedInput();
                mergeFrom(newCodedInput, lVar);
                newCodedInput.mo37246a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                C4969g l = C4969g.m39350l(bArr, i, i2);
                mergeFrom(l);
                l.mo37246a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        public BuilderType mergeFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length, lVar);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, C4987l lVar) throws InvalidProtocolBufferException {
            try {
                C4969g l = C4969g.m39350l(bArr, i, i2);
                mergeFrom(l, lVar);
                l.mo37246a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            C4969g f = C4969g.m39344f(inputStream);
            mergeFrom(f);
            f.mo37246a(0);
            return this;
        }

        public BuilderType mergeFrom(InputStream inputStream, C4987l lVar) throws IOException {
            C4969g f = C4969g.m39344f(inputStream);
            mergeFrom(f, lVar);
            f.mo37246a(0);
            return this;
        }

        public BuilderType mergeFrom(C4956c0 c0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(c0Var)) {
                return internalMergeFrom((C4949a) c0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C4950a.addAll(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(C4984j0 j0Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int g = j0Var.mo37181g(this);
        setMemoizedSerializedSize(g);
        return g;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException((C4956c0) this);
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream g0 = CodedOutputStream.m38798g0(bArr);
            writeTo(g0);
            g0.mo36828d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public ByteString toByteString() {
        try {
            ByteString.C4922g newCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.mo36793b());
            return newCodedBuilder.mo36792a();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream f0 = CodedOutputStream.m38796f0(outputStream, CodedOutputStream.m38774J(CodedOutputStream.m38788X(serializedSize) + serializedSize));
        f0.mo36823Y0(serializedSize);
        writeTo(f0);
        f0.mo36827c0();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream f0 = CodedOutputStream.m38796f0(outputStream, CodedOutputStream.m38774J(getSerializedSize()));
        writeTo(f0);
        f0.mo36827c0();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C4950a.addAll(iterable, list);
    }
}
