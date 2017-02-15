package com.ironyard.data;

import javax.persistence.*;

/**
 * Created by osmanidris on 2/10/17.
 */
@Entity
public class ChatMessage {
    @Id @GeneratedValue
    private Long ID;
    private String messageText;
    @ManyToOne(fetch = FetchType.EAGER)
    private ChatUser msgUser;
    private String imageFileName;

    public String getMesssageText() {
        return messageText;
    }

    public ChatMessage(){}

    public ChatMessage(String messageText, String imageFileName,ChatUser msgUser) {
        this.messageText = messageText;
        this.imageFileName = imageFileName;
        this.msgUser = msgUser;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public ChatUser getMsgUser() {
        return msgUser;
    }

    public void setMsgUser(ChatUser msgUser) {
        this.msgUser = msgUser;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
