
public class UsageDS {
    public static void main(String[] args) {
        QueueusingTwoStacks<Integer> st = new QueueusingTwoStacks<>();
        for(int i = 0;i<10;i++) {
            st.add(i);
        }
        while(!st.isEmpty()) {
            int val = st.remove();
            System.out.println(val);
        }
    }
}
