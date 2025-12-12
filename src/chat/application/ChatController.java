package chat.application;

import java.util.ArrayList;

public class ChatController {
    private  ArrayList<ChatWindow>chatWindowList=new ArrayList<>();
    void addChatWindow(ChatWindow chatWindow){
        chatWindowList.add(chatWindow);
    }
    void removeChatWindow(ChatWindow chatWindow){
        chatWindowList.remove(chatWindow);
    }
    void sendMassage(String massage){
            for (ChatWindow chatWindow : chatWindowList) {
            chatWindow.setMassage(massage);
        }
    } 
}
