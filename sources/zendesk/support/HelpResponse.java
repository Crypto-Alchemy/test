package zendesk.support;

import com.google.gson.annotations.SerializedName;
import java.util.List;

class HelpResponse {
    private List<CategoryItem> categories;
    @SerializedName("category_count")
    private int categoryCount;

    public List<CategoryItem> getCategories() {
        return kj0.m47112c(this.categories);
    }

    public int getCategoryCount() {
        return this.categoryCount;
    }
}
