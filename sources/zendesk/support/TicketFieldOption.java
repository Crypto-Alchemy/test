package zendesk.support;

public class TicketFieldOption {

    /* renamed from: id */
    private long f46839id;
    private boolean isDefault;
    private String name;
    private String value;

    public TicketFieldOption(long j, String str, String str2, boolean z) {
        this.f46839id = j;
        this.name = str;
        this.value = str2;
        this.isDefault = z;
    }

    public static TicketFieldOption create(RawTicketFieldOption rawTicketFieldOption) {
        return new TicketFieldOption(rawTicketFieldOption.getId(), rawTicketFieldOption.getName(), rawTicketFieldOption.getValue(), rawTicketFieldOption.isDefault());
    }

    public long getId() {
        return this.f46839id;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isDefault() {
        return this.isDefault;
    }
}
