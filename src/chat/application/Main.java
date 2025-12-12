package chat.application;

public class Main {
    public static void main(String[] args) {
        ChatController chatController=new ChatController();
        chatController.addChatWindow(new ChatWindow(chatController, "kamal"));
        chatController.addChatWindow(new ChatWindow(chatController, "Amal"));
        chatController.addChatWindow(new ChatWindow(chatController, "Bimal"));
    }
    
}
