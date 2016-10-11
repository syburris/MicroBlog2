package com.theironyard;

/**
 * Created by stevenburris on 10/5/16.
 */
public class Message {
    String text;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
