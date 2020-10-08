package com.gfa.p2p.Model;

public class MessageRequest {
    private String channelId;
    private String channelSectret;
    private String content;

    public MessageRequest() {
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelSectret() {
        return channelSectret;
    }

    public void setChannelSectret(String channelSectret) {
        this.channelSectret = channelSectret;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
