package my.miniproject.chatClient;

public class ChatClientMain {
    public static void main(String[] args){
        ChatClient chatClient = new ChatClient("127.0.0.1", 8886);
        chatClient.run();
    }
}
