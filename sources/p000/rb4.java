package p000;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/* renamed from: rb4 */
/* compiled from: NotificationParams */
public class rb4<T> {
    private T result;
    private String subsciption;

    public T getResult() {
        return this.result;
    }

    public String getSubsciption() {
        return this.subsciption;
    }
}
