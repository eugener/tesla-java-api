package org.oxbow.tesla;

import com.google.gson.annotations.SerializedName;

class ContentHolder<T> {

    @SerializedName("response")
    private T content;

    T getContent() {
        return content;
    }
}
