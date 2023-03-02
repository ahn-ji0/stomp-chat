package com.chat.wsstompchat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    private String type;
    private String sender;
    private String channelId;
    private Object data;

    public void newConnect(){
        this.type = "new";
    }

    public void closeConnect() {
        this.type = "close";
    }
}
