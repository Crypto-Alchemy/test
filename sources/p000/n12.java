package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import p000.n12;

@JsonInclude(JsonInclude.Include.NON_NULL)
/* renamed from: n12 */
/* compiled from: Filter */
public abstract class n12<T extends n12> {
    private T thisObj = getThis();
    private List<C7920a> topics = new ArrayList();

    /* renamed from: n12$a */
    /* compiled from: Filter */
    public interface C7920a<T> {
        @k73
        T getValue();
    }

    /* renamed from: n12$b */
    /* compiled from: Filter */
    public static class C7921b implements C7920a<List<C7922c>> {
        private List<C7922c> topics = new ArrayList();

        public C7921b(String... strArr) {
            for (String str : strArr) {
                if (str != null) {
                    this.topics.add(new C7922c(str));
                } else {
                    this.topics.add(new C7922c());
                }
            }
        }

        public List<C7922c> getValue() {
            return this.topics;
        }
    }

    /* renamed from: n12$c */
    /* compiled from: Filter */
    public static class C7922c implements C7920a<String> {
        private String topic;

        public C7922c() {
            this.topic = null;
        }

        public String getValue() {
            return this.topic;
        }

        public C7922c(String str) {
            this.topic = str;
        }
    }

    public T addNullTopic() {
        this.topics.add(new C7922c());
        return getThis();
    }

    public T addOptionalTopics(String... strArr) {
        this.topics.add(new C7921b(strArr));
        return getThis();
    }

    public T addSingleTopic(String str) {
        this.topics.add(new C7922c(str));
        return getThis();
    }

    public abstract T getThis();

    public List<C7920a> getTopics() {
        return this.topics;
    }
}
