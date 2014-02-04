package com.bethanyholylandtours.web.model;

/**
 * Created by tpadmin on 2/4/14.
 */
public class Content {
    private final long id;
    private final String text;

    public Content(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
